/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getLeftOp <em>Left Op</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getRightOp <em>Right Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getBinOpExpr()
 * @model
 * @generated
 */
public interface BinOpExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Op</em>' containment reference.
   * @see #setLeftOp(NonExpr)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getBinOpExpr_LeftOp()
   * @model containment="true"
   * @generated
   */
  NonExpr getLeftOp();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getLeftOp <em>Left Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Op</em>' containment reference.
   * @see #getLeftOp()
   * @generated
   */
  void setLeftOp(NonExpr value);

  /**
   * Returns the value of the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Op</em>' containment reference.
   * @see #setRightOp(NonExpr)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getBinOpExpr_RightOp()
   * @model containment="true"
   * @generated
   */
  NonExpr getRightOp();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getRightOp <em>Right Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Op</em>' containment reference.
   * @see #getRightOp()
   * @generated
   */
  void setRightOp(NonExpr value);

} // BinOpExpr
