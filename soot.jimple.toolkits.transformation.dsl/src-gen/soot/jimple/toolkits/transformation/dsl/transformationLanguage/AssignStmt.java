/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getLhs <em>Lhs</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getAssignStmt()
 * @model
 * @generated
 */
public interface AssignStmt extends DefinitionStmt
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Ref)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getAssignStmt_Lhs()
   * @model containment="true"
   * @generated
   */
  Ref getLhs();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Ref value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Value)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getAssignStmt_Rhs()
   * @model containment="true"
   * @generated
   */
  Value getRhs();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Value value);

} // AssignStmt
