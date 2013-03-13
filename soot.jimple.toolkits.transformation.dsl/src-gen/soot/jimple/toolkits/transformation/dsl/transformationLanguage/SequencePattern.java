/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getSequencePattern()
 * @model
 * @generated
 */
public interface SequencePattern extends Pattern
{
  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference.
   * @see #setSequence(StatementSequence)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getSequencePattern_Sequence()
   * @model containment="true"
   * @generated
   */
  StatementSequence getSequence();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern#getSequence <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' containment reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(StatementSequence value);

} // SequencePattern
