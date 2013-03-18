/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage
 * @generated
 */
public class TransformationLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TransformationLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TransformationLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TransformationLanguagePackage.TRANSFORMATION:
      {
        Transformation transformation = (Transformation)theEObject;
        T result = caseTransformation(transformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SEQUENCE_PATTERN:
      {
        SequencePattern sequencePattern = (SequencePattern)theEObject;
        T result = caseSequencePattern(sequencePattern);
        if (result == null) result = casePattern(sequencePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.METHOD_PATTERN:
      {
        MethodPattern methodPattern = (MethodPattern)theEObject;
        T result = caseMethodPattern(methodPattern);
        if (result == null) result = casePattern(methodPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.TYPE_PATTERN:
      {
        TypePattern typePattern = (TypePattern)theEObject;
        T result = caseTypePattern(typePattern);
        if (result == null) result = casePattern(typePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.REPLACEMENT:
      {
        Replacement replacement = (Replacement)theEObject;
        T result = caseReplacement(replacement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.BODY:
      {
        Body body = (Body)theEObject;
        T result = caseBody(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.STATEMENT_SEQUENCE:
      {
        StatementSequence statementSequence = (StatementSequence)theEObject;
        T result = caseStatementSequence(statementSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LABEL_OR_STATEMENT:
      {
        LabelOrStatement labelOrStatement = (LabelOrStatement)theEObject;
        T result = caseLabelOrStatement(labelOrStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = caseLabelOrStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseLabelOrStatement(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.BREAKPOINT_STMT:
      {
        BreakpointStmt breakpointStmt = (BreakpointStmt)theEObject;
        T result = caseBreakpointStmt(breakpointStmt);
        if (result == null) result = caseStatement(breakpointStmt);
        if (result == null) result = caseLabelOrStatement(breakpointStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.DEFINITION_STMT:
      {
        DefinitionStmt definitionStmt = (DefinitionStmt)theEObject;
        T result = caseDefinitionStmt(definitionStmt);
        if (result == null) result = caseStatement(definitionStmt);
        if (result == null) result = caseLabelOrStatement(definitionStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.ASSIGN_STMT:
      {
        AssignStmt assignStmt = (AssignStmt)theEObject;
        T result = caseAssignStmt(assignStmt);
        if (result == null) result = caseDefinitionStmt(assignStmt);
        if (result == null) result = caseStatement(assignStmt);
        if (result == null) result = caseLabelOrStatement(assignStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.IDENTITY_STMT:
      {
        IdentityStmt identityStmt = (IdentityStmt)theEObject;
        T result = caseIdentityStmt(identityStmt);
        if (result == null) result = caseDefinitionStmt(identityStmt);
        if (result == null) result = caseStatement(identityStmt);
        if (result == null) result = caseLabelOrStatement(identityStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.GOTO_STMT:
      {
        GotoStmt gotoStmt = (GotoStmt)theEObject;
        T result = caseGotoStmt(gotoStmt);
        if (result == null) result = caseStatement(gotoStmt);
        if (result == null) result = caseLabelOrStatement(gotoStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.IF_STMT:
      {
        IfStmt ifStmt = (IfStmt)theEObject;
        T result = caseIfStmt(ifStmt);
        if (result == null) result = caseStatement(ifStmt);
        if (result == null) result = caseLabelOrStatement(ifStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.INVOKE_STMT:
      {
        InvokeStmt invokeStmt = (InvokeStmt)theEObject;
        T result = caseInvokeStmt(invokeStmt);
        if (result == null) result = caseStatement(invokeStmt);
        if (result == null) result = caseLabelOrStatement(invokeStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.TABLE_SWITCH_STMT:
      {
        TableSwitchStmt tableSwitchStmt = (TableSwitchStmt)theEObject;
        T result = caseTableSwitchStmt(tableSwitchStmt);
        if (result == null) result = caseStatement(tableSwitchStmt);
        if (result == null) result = caseLabelOrStatement(tableSwitchStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LOOKUP_SWITCH_STMT:
      {
        LookupSwitchStmt lookupSwitchStmt = (LookupSwitchStmt)theEObject;
        T result = caseLookupSwitchStmt(lookupSwitchStmt);
        if (result == null) result = caseStatement(lookupSwitchStmt);
        if (result == null) result = caseLabelOrStatement(lookupSwitchStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.MONITOR_STMT:
      {
        MonitorStmt monitorStmt = (MonitorStmt)theEObject;
        T result = caseMonitorStmt(monitorStmt);
        if (result == null) result = caseStatement(monitorStmt);
        if (result == null) result = caseLabelOrStatement(monitorStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.ENTER_MONITOR_STMT:
      {
        EnterMonitorStmt enterMonitorStmt = (EnterMonitorStmt)theEObject;
        T result = caseEnterMonitorStmt(enterMonitorStmt);
        if (result == null) result = caseMonitorStmt(enterMonitorStmt);
        if (result == null) result = caseStatement(enterMonitorStmt);
        if (result == null) result = caseLabelOrStatement(enterMonitorStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.EXIT_MONITOR_STMT:
      {
        ExitMonitorStmt exitMonitorStmt = (ExitMonitorStmt)theEObject;
        T result = caseExitMonitorStmt(exitMonitorStmt);
        if (result == null) result = caseMonitorStmt(exitMonitorStmt);
        if (result == null) result = caseStatement(exitMonitorStmt);
        if (result == null) result = caseLabelOrStatement(exitMonitorStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NOP_STMT:
      {
        NopStmt nopStmt = (NopStmt)theEObject;
        T result = caseNopStmt(nopStmt);
        if (result == null) result = caseStatement(nopStmt);
        if (result == null) result = caseLabelOrStatement(nopStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.RET_STMT:
      {
        RetStmt retStmt = (RetStmt)theEObject;
        T result = caseRetStmt(retStmt);
        if (result == null) result = caseStatement(retStmt);
        if (result == null) result = caseLabelOrStatement(retStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.RETURN_VOID_STMT:
      {
        ReturnVoidStmt returnVoidStmt = (ReturnVoidStmt)theEObject;
        T result = caseReturnVoidStmt(returnVoidStmt);
        if (result == null) result = caseStatement(returnVoidStmt);
        if (result == null) result = caseLabelOrStatement(returnVoidStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.RETURN_STMT:
      {
        ReturnStmt returnStmt = (ReturnStmt)theEObject;
        T result = caseReturnStmt(returnStmt);
        if (result == null) result = caseStatement(returnStmt);
        if (result == null) result = caseLabelOrStatement(returnStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.THROW_STMT:
      {
        ThrowStmt throwStmt = (ThrowStmt)theEObject;
        T result = caseThrowStmt(throwStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NON_EXPR:
      {
        NonExpr nonExpr = (NonExpr)theEObject;
        T result = caseNonExpr(nonExpr);
        if (result == null) result = caseValue(nonExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = caseValue(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.ANY_NEW_EXPR:
      {
        AnyNewExpr anyNewExpr = (AnyNewExpr)theEObject;
        T result = caseAnyNewExpr(anyNewExpr);
        if (result == null) result = caseExpr(anyNewExpr);
        if (result == null) result = caseValue(anyNewExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.BIN_OP_EXPR:
      {
        BinOpExpr binOpExpr = (BinOpExpr)theEObject;
        T result = caseBinOpExpr(binOpExpr);
        if (result == null) result = caseExpr(binOpExpr);
        if (result == null) result = caseValue(binOpExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.ADD_EXPR:
      {
        AddExpr addExpr = (AddExpr)theEObject;
        T result = caseAddExpr(addExpr);
        if (result == null) result = caseBinOpExpr(addExpr);
        if (result == null) result = caseExpr(addExpr);
        if (result == null) result = caseValue(addExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.AND_EXPR:
      {
        AndExpr andExpr = (AndExpr)theEObject;
        T result = caseAndExpr(andExpr);
        if (result == null) result = caseBinOpExpr(andExpr);
        if (result == null) result = caseExpr(andExpr);
        if (result == null) result = caseValue(andExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CMP_EXPR:
      {
        CmpExpr cmpExpr = (CmpExpr)theEObject;
        T result = caseCmpExpr(cmpExpr);
        if (result == null) result = caseBinOpExpr(cmpExpr);
        if (result == null) result = caseExpr(cmpExpr);
        if (result == null) result = caseValue(cmpExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CMPG_EXPR:
      {
        CmpgExpr cmpgExpr = (CmpgExpr)theEObject;
        T result = caseCmpgExpr(cmpgExpr);
        if (result == null) result = caseBinOpExpr(cmpgExpr);
        if (result == null) result = caseExpr(cmpgExpr);
        if (result == null) result = caseValue(cmpgExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CMPL_EXPR:
      {
        CmplExpr cmplExpr = (CmplExpr)theEObject;
        T result = caseCmplExpr(cmplExpr);
        if (result == null) result = caseBinOpExpr(cmplExpr);
        if (result == null) result = caseExpr(cmplExpr);
        if (result == null) result = caseValue(cmplExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CONDITIONAL_EXPR:
      {
        ConditionalExpr conditionalExpr = (ConditionalExpr)theEObject;
        T result = caseConditionalExpr(conditionalExpr);
        if (result == null) result = caseBinOpExpr(conditionalExpr);
        if (result == null) result = caseExpr(conditionalExpr);
        if (result == null) result = caseValue(conditionalExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.DIV_EXPR:
      {
        DivExpr divExpr = (DivExpr)theEObject;
        T result = caseDivExpr(divExpr);
        if (result == null) result = caseBinOpExpr(divExpr);
        if (result == null) result = caseExpr(divExpr);
        if (result == null) result = caseValue(divExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.MUL_EXPR:
      {
        MulExpr mulExpr = (MulExpr)theEObject;
        T result = caseMulExpr(mulExpr);
        if (result == null) result = caseBinOpExpr(mulExpr);
        if (result == null) result = caseExpr(mulExpr);
        if (result == null) result = caseValue(mulExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.OR_EXPR:
      {
        OrExpr orExpr = (OrExpr)theEObject;
        T result = caseOrExpr(orExpr);
        if (result == null) result = caseBinOpExpr(orExpr);
        if (result == null) result = caseExpr(orExpr);
        if (result == null) result = caseValue(orExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.REM_EXPR:
      {
        RemExpr remExpr = (RemExpr)theEObject;
        T result = caseRemExpr(remExpr);
        if (result == null) result = caseBinOpExpr(remExpr);
        if (result == null) result = caseExpr(remExpr);
        if (result == null) result = caseValue(remExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SHL_EXPR:
      {
        ShlExpr shlExpr = (ShlExpr)theEObject;
        T result = caseShlExpr(shlExpr);
        if (result == null) result = caseBinOpExpr(shlExpr);
        if (result == null) result = caseExpr(shlExpr);
        if (result == null) result = caseValue(shlExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SHR_EXPR:
      {
        ShrExpr shrExpr = (ShrExpr)theEObject;
        T result = caseShrExpr(shrExpr);
        if (result == null) result = caseBinOpExpr(shrExpr);
        if (result == null) result = caseExpr(shrExpr);
        if (result == null) result = caseValue(shrExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SUB_EXPR:
      {
        SubExpr subExpr = (SubExpr)theEObject;
        T result = caseSubExpr(subExpr);
        if (result == null) result = caseBinOpExpr(subExpr);
        if (result == null) result = caseExpr(subExpr);
        if (result == null) result = caseValue(subExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.USHR_EXPR:
      {
        UshrExpr ushrExpr = (UshrExpr)theEObject;
        T result = caseUshrExpr(ushrExpr);
        if (result == null) result = caseBinOpExpr(ushrExpr);
        if (result == null) result = caseExpr(ushrExpr);
        if (result == null) result = caseValue(ushrExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.XOR_EXPR:
      {
        XorExpr xorExpr = (XorExpr)theEObject;
        T result = caseXorExpr(xorExpr);
        if (result == null) result = caseBinOpExpr(xorExpr);
        if (result == null) result = caseExpr(xorExpr);
        if (result == null) result = caseValue(xorExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.EQ_EXPR:
      {
        EqExpr eqExpr = (EqExpr)theEObject;
        T result = caseEqExpr(eqExpr);
        if (result == null) result = caseConditionalExpr(eqExpr);
        if (result == null) result = caseBinOpExpr(eqExpr);
        if (result == null) result = caseExpr(eqExpr);
        if (result == null) result = caseValue(eqExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.GE_EXPR:
      {
        GeExpr geExpr = (GeExpr)theEObject;
        T result = caseGeExpr(geExpr);
        if (result == null) result = caseConditionalExpr(geExpr);
        if (result == null) result = caseBinOpExpr(geExpr);
        if (result == null) result = caseExpr(geExpr);
        if (result == null) result = caseValue(geExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.GT_EXPR:
      {
        GtExpr gtExpr = (GtExpr)theEObject;
        T result = caseGtExpr(gtExpr);
        if (result == null) result = caseConditionalExpr(gtExpr);
        if (result == null) result = caseBinOpExpr(gtExpr);
        if (result == null) result = caseExpr(gtExpr);
        if (result == null) result = caseValue(gtExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LE_EXPR:
      {
        LeExpr leExpr = (LeExpr)theEObject;
        T result = caseLeExpr(leExpr);
        if (result == null) result = caseConditionalExpr(leExpr);
        if (result == null) result = caseBinOpExpr(leExpr);
        if (result == null) result = caseExpr(leExpr);
        if (result == null) result = caseValue(leExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LT_EXPR:
      {
        LtExpr ltExpr = (LtExpr)theEObject;
        T result = caseLtExpr(ltExpr);
        if (result == null) result = caseConditionalExpr(ltExpr);
        if (result == null) result = caseBinOpExpr(ltExpr);
        if (result == null) result = caseExpr(ltExpr);
        if (result == null) result = caseValue(ltExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NE_EXPR:
      {
        NeExpr neExpr = (NeExpr)theEObject;
        T result = caseNeExpr(neExpr);
        if (result == null) result = caseConditionalExpr(neExpr);
        if (result == null) result = caseBinOpExpr(neExpr);
        if (result == null) result = caseExpr(neExpr);
        if (result == null) result = caseValue(neExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CAST_EXPR:
      {
        CastExpr castExpr = (CastExpr)theEObject;
        T result = caseCastExpr(castExpr);
        if (result == null) result = caseExpr(castExpr);
        if (result == null) result = caseValue(castExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.INSTANCE_OF_EXPR:
      {
        InstanceOfExpr instanceOfExpr = (InstanceOfExpr)theEObject;
        T result = caseInstanceOfExpr(instanceOfExpr);
        if (result == null) result = caseExpr(instanceOfExpr);
        if (result == null) result = caseValue(instanceOfExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SOOT_METHOD_REF:
      {
        SootMethodRef sootMethodRef = (SootMethodRef)theEObject;
        T result = caseSootMethodRef(sootMethodRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SOOT_TYPE:
      {
        SootType sootType = (SootType)theEObject;
        T result = caseSootType(sootType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.INVOKE_EXPR:
      {
        InvokeExpr invokeExpr = (InvokeExpr)theEObject;
        T result = caseInvokeExpr(invokeExpr);
        if (result == null) result = caseExpr(invokeExpr);
        if (result == null) result = caseValue(invokeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.INSTANCE_INVOKE_EXPR:
      {
        InstanceInvokeExpr instanceInvokeExpr = (InstanceInvokeExpr)theEObject;
        T result = caseInstanceInvokeExpr(instanceInvokeExpr);
        if (result == null) result = caseInvokeExpr(instanceInvokeExpr);
        if (result == null) result = caseExpr(instanceInvokeExpr);
        if (result == null) result = caseValue(instanceInvokeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.STATIC_INVOKE_EXPR:
      {
        StaticInvokeExpr staticInvokeExpr = (StaticInvokeExpr)theEObject;
        T result = caseStaticInvokeExpr(staticInvokeExpr);
        if (result == null) result = caseInvokeExpr(staticInvokeExpr);
        if (result == null) result = caseExpr(staticInvokeExpr);
        if (result == null) result = caseValue(staticInvokeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.INTERFACE_INVOKE_EXPR:
      {
        InterfaceInvokeExpr interfaceInvokeExpr = (InterfaceInvokeExpr)theEObject;
        T result = caseInterfaceInvokeExpr(interfaceInvokeExpr);
        if (result == null) result = caseInstanceInvokeExpr(interfaceInvokeExpr);
        if (result == null) result = caseInvokeExpr(interfaceInvokeExpr);
        if (result == null) result = caseExpr(interfaceInvokeExpr);
        if (result == null) result = caseValue(interfaceInvokeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SPECIAL_INVOKE_EXPR:
      {
        SpecialInvokeExpr specialInvokeExpr = (SpecialInvokeExpr)theEObject;
        T result = caseSpecialInvokeExpr(specialInvokeExpr);
        if (result == null) result = caseInstanceInvokeExpr(specialInvokeExpr);
        if (result == null) result = caseInvokeExpr(specialInvokeExpr);
        if (result == null) result = caseExpr(specialInvokeExpr);
        if (result == null) result = caseValue(specialInvokeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.VIRTUAL_INVOKE_EXPR:
      {
        VirtualInvokeExpr virtualInvokeExpr = (VirtualInvokeExpr)theEObject;
        T result = caseVirtualInvokeExpr(virtualInvokeExpr);
        if (result == null) result = caseInstanceInvokeExpr(virtualInvokeExpr);
        if (result == null) result = caseInvokeExpr(virtualInvokeExpr);
        if (result == null) result = caseExpr(virtualInvokeExpr);
        if (result == null) result = caseValue(virtualInvokeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LOCAL_OR_WILDCARD:
      {
        LocalOrWildcard localOrWildcard = (LocalOrWildcard)theEObject;
        T result = caseLocalOrWildcard(localOrWildcard);
        if (result == null) result = caseRef(localOrWildcard);
        if (result == null) result = caseNonExpr(localOrWildcard);
        if (result == null) result = caseValue(localOrWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NEW_ARRAY_EXPR:
      {
        NewArrayExpr newArrayExpr = (NewArrayExpr)theEObject;
        T result = caseNewArrayExpr(newArrayExpr);
        if (result == null) result = caseAnyNewExpr(newArrayExpr);
        if (result == null) result = caseExpr(newArrayExpr);
        if (result == null) result = caseValue(newArrayExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NEW_EXPR:
      {
        NewExpr newExpr = (NewExpr)theEObject;
        T result = caseNewExpr(newExpr);
        if (result == null) result = caseAnyNewExpr(newExpr);
        if (result == null) result = caseExpr(newExpr);
        if (result == null) result = caseValue(newExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR:
      {
        NewMultiArrayExpr newMultiArrayExpr = (NewMultiArrayExpr)theEObject;
        T result = caseNewMultiArrayExpr(newMultiArrayExpr);
        if (result == null) result = caseAnyNewExpr(newMultiArrayExpr);
        if (result == null) result = caseExpr(newMultiArrayExpr);
        if (result == null) result = caseValue(newMultiArrayExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.DIMENSION:
      {
        Dimension dimension = (Dimension)theEObject;
        T result = caseDimension(dimension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.UNOP_EXPR:
      {
        UnopExpr unopExpr = (UnopExpr)theEObject;
        T result = caseUnopExpr(unopExpr);
        if (result == null) result = caseExpr(unopExpr);
        if (result == null) result = caseValue(unopExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LENGTH_EXPR:
      {
        LengthExpr lengthExpr = (LengthExpr)theEObject;
        T result = caseLengthExpr(lengthExpr);
        if (result == null) result = caseUnopExpr(lengthExpr);
        if (result == null) result = caseExpr(lengthExpr);
        if (result == null) result = caseValue(lengthExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NEG_EXPR:
      {
        NegExpr negExpr = (NegExpr)theEObject;
        T result = caseNegExpr(negExpr);
        if (result == null) result = caseUnopExpr(negExpr);
        if (result == null) result = caseExpr(negExpr);
        if (result == null) result = caseValue(negExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LOCAL:
      {
        Local local = (Local)theEObject;
        T result = caseLocal(local);
        if (result == null) result = caseLocalOrWildcard(local);
        if (result == null) result = caseRef(local);
        if (result == null) result = caseNonExpr(local);
        if (result == null) result = caseValue(local);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.REF:
      {
        Ref ref = (Ref)theEObject;
        T result = caseRef(ref);
        if (result == null) result = caseNonExpr(ref);
        if (result == null) result = caseValue(ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.IDENTITY_REF:
      {
        IdentityRef identityRef = (IdentityRef)theEObject;
        T result = caseIdentityRef(identityRef);
        if (result == null) result = caseRef(identityRef);
        if (result == null) result = caseNonExpr(identityRef);
        if (result == null) result = caseValue(identityRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.PARAMETER_REF:
      {
        ParameterRef parameterRef = (ParameterRef)theEObject;
        T result = caseParameterRef(parameterRef);
        if (result == null) result = caseIdentityRef(parameterRef);
        if (result == null) result = caseRef(parameterRef);
        if (result == null) result = caseNonExpr(parameterRef);
        if (result == null) result = caseValue(parameterRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.THIS_REF:
      {
        ThisRef thisRef = (ThisRef)theEObject;
        T result = caseThisRef(thisRef);
        if (result == null) result = caseIdentityRef(thisRef);
        if (result == null) result = caseRef(thisRef);
        if (result == null) result = caseNonExpr(thisRef);
        if (result == null) result = caseValue(thisRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CAUGHT_EXCEPTION_REF:
      {
        CaughtExceptionRef caughtExceptionRef = (CaughtExceptionRef)theEObject;
        T result = caseCaughtExceptionRef(caughtExceptionRef);
        if (result == null) result = caseIdentityRef(caughtExceptionRef);
        if (result == null) result = caseRef(caughtExceptionRef);
        if (result == null) result = caseNonExpr(caughtExceptionRef);
        if (result == null) result = caseValue(caughtExceptionRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CONCRETE_REF:
      {
        ConcreteRef concreteRef = (ConcreteRef)theEObject;
        T result = caseConcreteRef(concreteRef);
        if (result == null) result = caseRef(concreteRef);
        if (result == null) result = caseNonExpr(concreteRef);
        if (result == null) result = caseValue(concreteRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.ARRAY_REF:
      {
        ArrayRef arrayRef = (ArrayRef)theEObject;
        T result = caseArrayRef(arrayRef);
        if (result == null) result = caseConcreteRef(arrayRef);
        if (result == null) result = caseRef(arrayRef);
        if (result == null) result = caseNonExpr(arrayRef);
        if (result == null) result = caseValue(arrayRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.FIELD_REF:
      {
        FieldRef fieldRef = (FieldRef)theEObject;
        T result = caseFieldRef(fieldRef);
        if (result == null) result = caseConcreteRef(fieldRef);
        if (result == null) result = caseRef(fieldRef);
        if (result == null) result = caseNonExpr(fieldRef);
        if (result == null) result = caseValue(fieldRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.STATIC_FIELD_REF:
      {
        StaticFieldRef staticFieldRef = (StaticFieldRef)theEObject;
        T result = caseStaticFieldRef(staticFieldRef);
        if (result == null) result = caseFieldRef(staticFieldRef);
        if (result == null) result = caseConcreteRef(staticFieldRef);
        if (result == null) result = caseRef(staticFieldRef);
        if (result == null) result = caseNonExpr(staticFieldRef);
        if (result == null) result = caseValue(staticFieldRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.SOOT_FIELD_REF:
      {
        SootFieldRef sootFieldRef = (SootFieldRef)theEObject;
        T result = caseSootFieldRef(sootFieldRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.INSTANCE_FIELD_REF:
      {
        InstanceFieldRef instanceFieldRef = (InstanceFieldRef)theEObject;
        T result = caseInstanceFieldRef(instanceFieldRef);
        if (result == null) result = caseFieldRef(instanceFieldRef);
        if (result == null) result = caseConcreteRef(instanceFieldRef);
        if (result == null) result = caseRef(instanceFieldRef);
        if (result == null) result = caseNonExpr(instanceFieldRef);
        if (result == null) result = caseValue(instanceFieldRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseNonExpr(constant);
        if (result == null) result = caseValue(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.CLASS_CONSTANT:
      {
        ClassConstant classConstant = (ClassConstant)theEObject;
        T result = caseClassConstant(classConstant);
        if (result == null) result = caseConstant(classConstant);
        if (result == null) result = caseNonExpr(classConstant);
        if (result == null) result = caseValue(classConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.QUALIFIED_NAME_OR_WILDCARD:
      {
        QualifiedNameOrWildcard qualifiedNameOrWildcard = (QualifiedNameOrWildcard)theEObject;
        T result = caseQualifiedNameOrWildcard(qualifiedNameOrWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.QUALIFIED_NAME_WILDCARD:
      {
        QualifiedNameWildcard qualifiedNameWildcard = (QualifiedNameWildcard)theEObject;
        T result = caseQualifiedNameWildcard(qualifiedNameWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NULL_CONSTANT:
      {
        NullConstant nullConstant = (NullConstant)theEObject;
        T result = caseNullConstant(nullConstant);
        if (result == null) result = caseConstant(nullConstant);
        if (result == null) result = caseNonExpr(nullConstant);
        if (result == null) result = caseValue(nullConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.NUMERIC_CONSTANT:
      {
        NumericConstant numericConstant = (NumericConstant)theEObject;
        T result = caseNumericConstant(numericConstant);
        if (result == null) result = caseConstant(numericConstant);
        if (result == null) result = caseNonExpr(numericConstant);
        if (result == null) result = caseValue(numericConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.INT_CONSTANT:
      {
        IntConstant intConstant = (IntConstant)theEObject;
        T result = caseIntConstant(intConstant);
        if (result == null) result = caseNumericConstant(intConstant);
        if (result == null) result = caseConstant(intConstant);
        if (result == null) result = caseNonExpr(intConstant);
        if (result == null) result = caseValue(intConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.LONG_CONSTANT:
      {
        LongConstant longConstant = (LongConstant)theEObject;
        T result = caseLongConstant(longConstant);
        if (result == null) result = caseNumericConstant(longConstant);
        if (result == null) result = caseConstant(longConstant);
        if (result == null) result = caseNonExpr(longConstant);
        if (result == null) result = caseValue(longConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.DOUBLE_CONSTANT:
      {
        DoubleConstant doubleConstant = (DoubleConstant)theEObject;
        T result = caseDoubleConstant(doubleConstant);
        if (result == null) result = caseNumericConstant(doubleConstant);
        if (result == null) result = caseConstant(doubleConstant);
        if (result == null) result = caseNonExpr(doubleConstant);
        if (result == null) result = caseValue(doubleConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.FLOAT_CONSTANT:
      {
        FloatConstant floatConstant = (FloatConstant)theEObject;
        T result = caseFloatConstant(floatConstant);
        if (result == null) result = caseNumericConstant(floatConstant);
        if (result == null) result = caseConstant(floatConstant);
        if (result == null) result = caseNonExpr(floatConstant);
        if (result == null) result = caseValue(floatConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.STRING_CONSTANT:
      {
        StringConstant stringConstant = (StringConstant)theEObject;
        T result = caseStringConstant(stringConstant);
        if (result == null) result = caseConstant(stringConstant);
        if (result == null) result = caseNonExpr(stringConstant);
        if (result == null) result = caseValue(stringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.QUALIFIED_NAME:
      {
        QualifiedName qualifiedName = (QualifiedName)theEObject;
        T result = caseQualifiedName(qualifiedName);
        if (result == null) result = caseSootType(qualifiedName);
        if (result == null) result = caseQualifiedNameOrWildcard(qualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD:
      {
        Wildcard wildcard = (Wildcard)theEObject;
        T result = caseWildcard(wildcard);
        if (result == null) result = caseQualifiedNameOrWildcard(wildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_NAME:
      {
        WildcardName wildcardName = (WildcardName)theEObject;
        T result = caseWildcardName(wildcardName);
        if (result == null) result = caseLocalOrWildcard(wildcardName);
        if (result == null) result = caseRef(wildcardName);
        if (result == null) result = caseNonExpr(wildcardName);
        if (result == null) result = caseValue(wildcardName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_EXPRESSION:
      {
        WildcardExpression wildcardExpression = (WildcardExpression)theEObject;
        T result = caseWildcardExpression(wildcardExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_CONDITIONAL_OR_EXPRESSION:
      {
        WildcardConditionalOrExpression wildcardConditionalOrExpression = (WildcardConditionalOrExpression)theEObject;
        T result = caseWildcardConditionalOrExpression(wildcardConditionalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_CONDITIONAL_AND_EXPRESSION:
      {
        WildcardConditionalAndExpression wildcardConditionalAndExpression = (WildcardConditionalAndExpression)theEObject;
        T result = caseWildcardConditionalAndExpression(wildcardConditionalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_EQUALITY_EXPRESSION:
      {
        WildcardEqualityExpression wildcardEqualityExpression = (WildcardEqualityExpression)theEObject;
        T result = caseWildcardEqualityExpression(wildcardEqualityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_INSTANCE_OF_EXPRESSION:
      {
        WildcardInstanceOfExpression wildcardInstanceOfExpression = (WildcardInstanceOfExpression)theEObject;
        T result = caseWildcardInstanceOfExpression(wildcardInstanceOfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_RELATIONAL_EXPRESSION:
      {
        WildcardRelationalExpression wildcardRelationalExpression = (WildcardRelationalExpression)theEObject;
        T result = caseWildcardRelationalExpression(wildcardRelationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_ADDITIVE_EXPRESSION:
      {
        WildcardAdditiveExpression wildcardAdditiveExpression = (WildcardAdditiveExpression)theEObject;
        T result = caseWildcardAdditiveExpression(wildcardAdditiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_MULTIPLICATIVE_EXPRESSION:
      {
        WildcardMultiplicativeExpression wildcardMultiplicativeExpression = (WildcardMultiplicativeExpression)theEObject;
        T result = caseWildcardMultiplicativeExpression(wildcardMultiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION:
      {
        WildcardUnaryExpression wildcardUnaryExpression = (WildcardUnaryExpression)theEObject;
        T result = caseWildcardUnaryExpression(wildcardUnaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS:
      {
        WildcardUnaryExpressionNotPlusMinus wildcardUnaryExpressionNotPlusMinus = (WildcardUnaryExpressionNotPlusMinus)theEObject;
        T result = caseWildcardUnaryExpressionNotPlusMinus(wildcardUnaryExpressionNotPlusMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_PRIMARY:
      {
        WildcardPrimary wildcardPrimary = (WildcardPrimary)theEObject;
        T result = caseWildcardPrimary(wildcardPrimary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_PAR_EXPRESSION:
      {
        WildcardParExpression wildcardParExpression = (WildcardParExpression)theEObject;
        T result = caseWildcardParExpression(wildcardParExpression);
        if (result == null) result = caseWildcardPrimary(wildcardParExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_CLASS_LITERAL:
      {
        WildcardClassLiteral wildcardClassLiteral = (WildcardClassLiteral)theEObject;
        T result = caseWildcardClassLiteral(wildcardClassLiteral);
        if (result == null) result = caseWildcardPrimary(wildcardClassLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_TYPE:
      {
        WildcardType wildcardType = (WildcardType)theEObject;
        T result = caseWildcardType(wildcardType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_PRIMITIVE_TYPE:
      {
        WildcardPrimitiveType wildcardPrimitiveType = (WildcardPrimitiveType)theEObject;
        T result = caseWildcardPrimitiveType(wildcardPrimitiveType);
        if (result == null) result = caseSootType(wildcardPrimitiveType);
        if (result == null) result = caseWildcardType(wildcardPrimitiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_LITERAL:
      {
        WildcardLiteral wildcardLiteral = (WildcardLiteral)theEObject;
        T result = caseWildcardLiteral(wildcardLiteral);
        if (result == null) result = caseWildcardPrimary(wildcardLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_BOOLEAN:
      {
        WildcardBoolean wildcardBoolean = (WildcardBoolean)theEObject;
        T result = caseWildcardBoolean(wildcardBoolean);
        if (result == null) result = caseWildcardPrimitiveType(wildcardBoolean);
        if (result == null) result = caseWildcardLiteral(wildcardBoolean);
        if (result == null) result = caseSootType(wildcardBoolean);
        if (result == null) result = caseWildcardType(wildcardBoolean);
        if (result == null) result = caseWildcardPrimary(wildcardBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_INT:
      {
        WildcardInt wildcardInt = (WildcardInt)theEObject;
        T result = caseWildcardInt(wildcardInt);
        if (result == null) result = caseWildcardPrimitiveType(wildcardInt);
        if (result == null) result = caseWildcardLiteral(wildcardInt);
        if (result == null) result = caseSootType(wildcardInt);
        if (result == null) result = caseWildcardType(wildcardInt);
        if (result == null) result = caseWildcardPrimary(wildcardInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_NULL:
      {
        WildcardNull wildcardNull = (WildcardNull)theEObject;
        T result = caseWildcardNull(wildcardNull);
        if (result == null) result = caseWildcardLiteral(wildcardNull);
        if (result == null) result = caseWildcardPrimary(wildcardNull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_STRING:
      {
        WildcardString wildcardString = (WildcardString)theEObject;
        T result = caseWildcardString(wildcardString);
        if (result == null) result = caseWildcardLiteral(wildcardString);
        if (result == null) result = caseWildcardPrimary(wildcardString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_NEW:
      {
        WildcardNew wildcardNew = (WildcardNew)theEObject;
        T result = caseWildcardNew(wildcardNew);
        if (result == null) result = caseWildcardPrimary(wildcardNew);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_QNAME:
      {
        WildcardQName wildcardQName = (WildcardQName)theEObject;
        T result = caseWildcardQName(wildcardQName);
        if (result == null) result = caseWildcardPrimary(wildcardQName);
        if (result == null) result = caseWildcardType(wildcardQName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_DEREFERENCE:
      {
        WildcardDereference wildcardDereference = (WildcardDereference)theEObject;
        T result = caseWildcardDereference(wildcardDereference);
        if (result == null) result = caseWildcardPrimary(wildcardDereference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_CALL:
      {
        WildcardCall wildcardCall = (WildcardCall)theEObject;
        T result = caseWildcardCall(wildcardCall);
        if (result == null) result = caseWildcardDereference(wildcardCall);
        if (result == null) result = caseWildcardPrimary(wildcardCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_FIELD:
      {
        WildcardField wildcardField = (WildcardField)theEObject;
        T result = caseWildcardField(wildcardField);
        if (result == null) result = caseWildcardDereference(wildcardField);
        if (result == null) result = caseWildcardPrimary(wildcardField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_CHAR:
      {
        WildcardChar wildcardChar = (WildcardChar)theEObject;
        T result = caseWildcardChar(wildcardChar);
        if (result == null) result = caseWildcardPrimitiveType(wildcardChar);
        if (result == null) result = caseSootType(wildcardChar);
        if (result == null) result = caseWildcardType(wildcardChar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_BYTE:
      {
        WildcardByte wildcardByte = (WildcardByte)theEObject;
        T result = caseWildcardByte(wildcardByte);
        if (result == null) result = caseWildcardPrimitiveType(wildcardByte);
        if (result == null) result = caseSootType(wildcardByte);
        if (result == null) result = caseWildcardType(wildcardByte);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_SHORT:
      {
        WildcardShort wildcardShort = (WildcardShort)theEObject;
        T result = caseWildcardShort(wildcardShort);
        if (result == null) result = caseWildcardPrimitiveType(wildcardShort);
        if (result == null) result = caseSootType(wildcardShort);
        if (result == null) result = caseWildcardType(wildcardShort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_LONG:
      {
        WildcardLong wildcardLong = (WildcardLong)theEObject;
        T result = caseWildcardLong(wildcardLong);
        if (result == null) result = caseWildcardPrimitiveType(wildcardLong);
        if (result == null) result = caseSootType(wildcardLong);
        if (result == null) result = caseWildcardType(wildcardLong);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_FLOAT:
      {
        WildcardFloat wildcardFloat = (WildcardFloat)theEObject;
        T result = caseWildcardFloat(wildcardFloat);
        if (result == null) result = caseWildcardPrimitiveType(wildcardFloat);
        if (result == null) result = caseSootType(wildcardFloat);
        if (result == null) result = caseWildcardType(wildcardFloat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_DOUBLE:
      {
        WildcardDouble wildcardDouble = (WildcardDouble)theEObject;
        T result = caseWildcardDouble(wildcardDouble);
        if (result == null) result = caseWildcardPrimitiveType(wildcardDouble);
        if (result == null) result = caseSootType(wildcardDouble);
        if (result == null) result = caseWildcardType(wildcardDouble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TransformationLanguagePackage.WILDCARD_VOID:
      {
        WildcardVoid wildcardVoid = (WildcardVoid)theEObject;
        T result = caseWildcardVoid(wildcardVoid);
        if (result == null) result = caseWildcardPrimitiveType(wildcardVoid);
        if (result == null) result = caseSootType(wildcardVoid);
        if (result == null) result = caseWildcardType(wildcardVoid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransformation(Transformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequencePattern(SequencePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodPattern(MethodPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypePattern(TypePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Replacement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Replacement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReplacement(Replacement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBody(Body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementSequence(StatementSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Or Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Or Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelOrStatement(LabelOrStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Breakpoint Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Breakpoint Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakpointStmt(BreakpointStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionStmt(DefinitionStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignStmt(AssignStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identity Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identity Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentityStmt(IdentityStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGotoStmt(GotoStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStmt(IfStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invoke Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invoke Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvokeStmt(InvokeStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Switch Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Switch Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableSwitchStmt(TableSwitchStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lookup Switch Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lookup Switch Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookupSwitchStmt(LookupSwitchStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitor Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitor Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitorStmt(MonitorStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enter Monitor Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enter Monitor Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnterMonitorStmt(EnterMonitorStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit Monitor Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit Monitor Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExitMonitorStmt(ExitMonitorStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nop Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nop Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNopStmt(NopStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ret Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ret Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRetStmt(RetStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Void Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Void Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnVoidStmt(ReturnVoidStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStmt(ReturnStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Throw Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Throw Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThrowStmt(ThrowStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonExpr(NonExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any New Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any New Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyNewExpr(AnyNewExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bin Op Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bin Op Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinOpExpr(BinOpExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddExpr(AddExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpr(AndExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmp Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmp Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmpExpr(CmpExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmpg Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmpg Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmpgExpr(CmpgExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmpl Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmpl Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmplExpr(CmplExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalExpr(ConditionalExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivExpr(DivExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulExpr(MulExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpr(OrExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rem Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rem Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemExpr(RemExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shl Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shl Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShlExpr(ShlExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shr Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shr Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShrExpr(ShrExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubExpr(SubExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ushr Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ushr Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUshrExpr(UshrExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xor Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xor Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXorExpr(XorExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eq Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eq Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqExpr(EqExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ge Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ge Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeExpr(GeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gt Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gt Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGtExpr(GtExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Le Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Le Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeExpr(LeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lt Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lt Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLtExpr(LtExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ne Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ne Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeExpr(NeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastExpr(CastExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Of Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Of Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceOfExpr(InstanceOfExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soot Method Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soot Method Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSootMethodRef(SootMethodRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soot Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soot Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSootType(SootType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invoke Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvokeExpr(InvokeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Invoke Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceInvokeExpr(InstanceInvokeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Invoke Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticInvokeExpr(StaticInvokeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Invoke Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceInvokeExpr(InterfaceInvokeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Special Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Special Invoke Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecialInvokeExpr(SpecialInvokeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virtual Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virtual Invoke Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualInvokeExpr(VirtualInvokeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Or Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalOrWildcard(LocalOrWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Array Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Array Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewArrayExpr(NewArrayExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewExpr(NewExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Multi Array Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Multi Array Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewMultiArrayExpr(NewMultiArrayExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimension(Dimension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unop Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unop Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnopExpr(UnopExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLengthExpr(LengthExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neg Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neg Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegExpr(NegExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocal(Local object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef(Ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identity Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identity Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentityRef(IdentityRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterRef(ParameterRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThisRef(ThisRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Caught Exception Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Caught Exception Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaughtExceptionRef(CaughtExceptionRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concrete Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concrete Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteRef(ConcreteRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayRef(ArrayRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldRef(FieldRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Field Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Field Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticFieldRef(StaticFieldRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soot Field Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soot Field Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSootFieldRef(SootFieldRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Field Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Field Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceFieldRef(InstanceFieldRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassConstant(ClassConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name Or Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedNameOrWildcard(QualifiedNameOrWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedNameWildcard(QualifiedNameWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullConstant(NullConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericConstant(NumericConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstant(IntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongConstant(LongConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleConstant(DoubleConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatConstant(FloatConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstant(StringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedName(QualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcard(Wildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardName(WildcardName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardExpression(WildcardExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Conditional Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardConditionalOrExpression(WildcardConditionalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Conditional And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardConditionalAndExpression(WildcardConditionalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardEqualityExpression(WildcardEqualityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Instance Of Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Instance Of Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardInstanceOfExpression(WildcardInstanceOfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardRelationalExpression(WildcardRelationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardAdditiveExpression(WildcardAdditiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardMultiplicativeExpression(WildcardMultiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardUnaryExpression(WildcardUnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Unary Expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Unary Expression Not Plus Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardUnaryExpressionNotPlusMinus(WildcardUnaryExpressionNotPlusMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardPrimary(WildcardPrimary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Par Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Par Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardParExpression(WildcardParExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Class Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Class Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardClassLiteral(WildcardClassLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardType(WildcardType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Primitive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardPrimitiveType(WildcardPrimitiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardLiteral(WildcardLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardBoolean(WildcardBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardInt(WildcardInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardNull(WildcardNull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardString(WildcardString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard New</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard New</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardNew(WildcardNew object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard QName</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard QName</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardQName(WildcardQName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Dereference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Dereference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardDereference(WildcardDereference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardCall(WildcardCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardField(WildcardField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Char</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Char</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardChar(WildcardChar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Byte</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Byte</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardByte(WildcardByte object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Short</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Short</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardShort(WildcardShort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Long</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Long</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardLong(WildcardLong object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardFloat(WildcardFloat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardDouble(WildcardDouble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardVoid(WildcardVoid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TransformationLanguageSwitch
