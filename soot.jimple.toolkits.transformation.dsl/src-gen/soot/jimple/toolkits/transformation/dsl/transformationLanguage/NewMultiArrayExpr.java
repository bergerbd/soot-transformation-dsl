/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Multi Array Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr#getSize <em>Size</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr#getEmptySize <em>Empty Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getNewMultiArrayExpr()
 * @model
 * @generated
 */
public interface NewMultiArrayExpr extends AnyNewExpr
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference list.
   * The list contents are of type {@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference list.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getNewMultiArrayExpr_Size()
   * @model containment="true"
   * @generated
   */
  EList<Dimension> getSize();

  /**
   * Returns the value of the '<em><b>Empty Size</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Size</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Size</em>' attribute list.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getNewMultiArrayExpr_EmptySize()
   * @model unique="false"
   * @generated
   */
  EList<String> getEmptySize();

} // NewMultiArrayExpr
