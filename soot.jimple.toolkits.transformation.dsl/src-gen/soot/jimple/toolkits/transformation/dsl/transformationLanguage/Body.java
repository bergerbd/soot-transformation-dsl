/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getBody_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LabelOrStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getBody_Statements()
   * @model containment="true"
   * @generated
   */
  EList<LabelOrStatement> getStatements();

} // Body
