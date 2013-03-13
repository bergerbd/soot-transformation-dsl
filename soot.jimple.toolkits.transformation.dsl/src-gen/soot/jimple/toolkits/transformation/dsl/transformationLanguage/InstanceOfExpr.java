/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Of Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getOperand <em>Operand</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getInstanceOfExpr()
 * @model
 * @generated
 */
public interface InstanceOfExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(Ref)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getInstanceOfExpr_Operand()
   * @model containment="true"
   * @generated
   */
  Ref getOperand();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(Ref value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getInstanceOfExpr_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // InstanceOfExpr
