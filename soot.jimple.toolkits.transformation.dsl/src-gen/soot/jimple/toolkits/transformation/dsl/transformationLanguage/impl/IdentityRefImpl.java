/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.ecore.EClass;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IdentityRefImpl extends RefImpl implements IdentityRef
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentityRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TransformationLanguagePackage.Literals.IDENTITY_REF;
  }

} //IdentityRefImpl
