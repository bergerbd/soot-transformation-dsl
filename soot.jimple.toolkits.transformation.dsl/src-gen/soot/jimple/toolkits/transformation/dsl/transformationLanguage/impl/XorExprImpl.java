/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.ecore.EClass;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.XorExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xor Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XorExprImpl extends BinOpExprImpl implements XorExpr
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XorExprImpl()
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
    return TransformationLanguagePackage.Literals.XOR_EXPR;
  }

} //XorExprImpl
