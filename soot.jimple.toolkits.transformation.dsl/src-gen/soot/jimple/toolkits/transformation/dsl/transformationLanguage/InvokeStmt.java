/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt#getInvokeExpr <em>Invoke Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getInvokeStmt()
 * @model
 * @generated
 */
public interface InvokeStmt extends Statement
{
  /**
   * Returns the value of the '<em><b>Invoke Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invoke Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invoke Expr</em>' containment reference.
   * @see #setInvokeExpr(InvokeExpr)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getInvokeStmt_InvokeExpr()
   * @model containment="true"
   * @generated
   */
  InvokeExpr getInvokeExpr();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt#getInvokeExpr <em>Invoke Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invoke Expr</em>' containment reference.
   * @see #getInvokeExpr()
   * @generated
   */
  void setInvokeExpr(InvokeExpr value);

} // InvokeStmt
