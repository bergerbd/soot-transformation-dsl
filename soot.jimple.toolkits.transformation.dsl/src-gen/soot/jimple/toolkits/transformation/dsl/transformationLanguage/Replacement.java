/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getSequence <em>Sequence</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getMethod <em>Method</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getReplacement()
 * @model
 * @generated
 */
public interface Replacement extends EObject
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
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getReplacement_Sequence()
   * @model containment="true"
   * @generated
   */
  StatementSequence getSequence();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getSequence <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' containment reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(StatementSequence value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(Method)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getReplacement_Method()
   * @model containment="true"
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getReplacement_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Replacement
