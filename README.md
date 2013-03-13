soot-transformation-dsl
=======================

I started to implement a jimple transformation engine based on a domain-specific language. The purpose is to define
some pattern that should be matched and a replacement that should be replace the match.

Where to find it
----------------
In this repository you will find the code base for the dsl itself specified using [Xtext](http://www.eclipse.org/Xtext/).
Furthermore, there is a eclipse plugin supporting an eclipse editor with syntax highlighting and so forth. If you are
looking for the transformation engine you have to take a look at my [soot repository](https://github.com/bergerbd/soot).

Example
-------

Sometimes you find a small code-snippet that makes your results imprecise. For instance, take the the following (jimple)
code snippets that I found in a JavaEE application. You can find some entry points for JSP files that call the specified
entry point methods (*service*) for Servlets.

**EntryPoint.jimple**

    public static void jspCaller1(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) {
      javax.servlet.http.HttpServletRequest r0;
      javax.servlet.http.HttpServletResponse r1;        
      jsp.logon_jsp $r2;
      
      r0 := @parameter0: javax.servlet.http.HttpServletRequest;
      r1 := @parameter1: javax.servlet.http.HttpServletResponse;
      $r2 = new jsp.logon_jsp;
      specialinvoke $r0.<jsp.logon_jsp: void <init>()>();
     
      virtualinvoke $r2.<org.apache.jasper.runtime.HttpJspBase: void service(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>(r0, r1);
    }
    
    public static void jspCaller2(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) {
      javax.servlet.http.HttpServletRequest r0;
      javax.servlet.http.HttpServletResponse r1;        
      jsp.logoff_jsp $r2;
      
      r0 := @parameter0: javax.servlet.http.HttpServletRequest;
      r1 := @parameter1: javax.servlet.http.HttpServletResponse;
      $r2 = new jsp.logoff_jsp;
      specialinvoke $r0.<jsp.logoff_jsp: void <init>()>();
     
      virtualinvoke $r2.<org.apache.jasper.runtime.HttpJspBase: void service(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>(r0, r1);
    }
    
If you take a look at the implementation of *HttpJspBase.service* you will find the following code snippet that
does nothing else than calling an anstract method *_jspService* that is implemented in each concrete JSP file.

**HttpJspBase.jimple**

    public final void service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) throws javax.servlet.ServletException, java.io.IOException
    {
        org.apache.jasper.runtime.HttpJspBase r0;
        javax.servlet.http.HttpServletRequest r1;
        javax.servlet.http.HttpServletResponse r2;

        r0 := @this: org.apache.jasper.runtime.HttpJspBase;
        r1 := @parameter0: javax.servlet.http.HttpServletRequest;
        r2 := @parameter1: javax.servlet.http.HttpServletResponse;
        virtualinvoke r0.<org.apache.jasper.runtime.HttpJspBase: void _jspService(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>(r1, r2);
        return;
    }
    
This leads to a very imprecise call graph if you are using Spark for call graph generation. Each *jspCallerX* method
has got an outgoing call edge to *service* which has in turn a call edge to **all** *_jspService* methods because Spark
is not context-sensitive. It would be nice to add a direct call from *jspCallerX* to the corresponding *_jspService*
method to remove impossible paths from the call graph.

If you give following pattern to the transformation engine it will exactly do this. It is going to look for all calls
of *HttpJspBase.service* and replace it by a call of *HttpJspBase._jspService*. What you actually see is a single jimple
statement with some weird guillemets to allow you to specify a named wildcard.

**jsp.tfl**

    «transformation»
      «replace»
        virtualinvoke «obj1».<org.apache.jasper.runtime.HttpJspBase: void service(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>(«obj2», «obj3»);
      «end»
      «by»
        virtualinvoke «obj1».<org.apache.jasper.runtime.HttpJspBase: void _jspService(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>(«obj2», «obj3»);
      «end»
    «end»
