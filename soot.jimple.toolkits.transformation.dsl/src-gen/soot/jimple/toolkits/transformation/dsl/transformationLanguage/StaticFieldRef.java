/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Field Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getStaticFieldRef()
 * @model
 * @generated
 */
public interface StaticFieldRef extends FieldRef
{
  /**
   * Returns the value of the '<em><b>Field Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Ref</em>' containment reference.
   * @see #setFieldRef(SootFieldRef)
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#getStaticFieldRef_FieldRef()
   * @model containment="true"
   * @generated
   */
  SootFieldRef getFieldRef();

  /**
   * Sets the value of the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef#getFieldRef <em>Field Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Ref</em>' containment reference.
   * @see #getFieldRef()
   * @generated
   */
  void setFieldRef(SootFieldRef value);

} // StaticFieldRef
