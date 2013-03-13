/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.ecore.EClass;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.DivExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DivExprImpl extends BinOpExprImpl implements DivExpr
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DivExprImpl()
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
    return TransformationLanguagePackage.Literals.DIV_EXPR;
  }

} //DivExprImpl
