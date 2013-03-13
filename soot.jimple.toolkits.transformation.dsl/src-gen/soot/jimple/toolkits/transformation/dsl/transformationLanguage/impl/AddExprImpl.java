/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.ecore.EClass;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AddExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AddExprImpl extends BinOpExprImpl implements AddExpr
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddExprImpl()
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
    return TransformationLanguagePackage.Literals.ADD_EXPR;
  }

} //AddExprImpl
