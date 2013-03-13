/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeStmtImpl#getInvokeExpr <em>Invoke Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeStmtImpl extends StatementImpl implements InvokeStmt
{
  /**
   * The cached value of the '{@link #getInvokeExpr() <em>Invoke Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvokeExpr()
   * @generated
   * @ordered
   */
  protected InvokeExpr invokeExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvokeStmtImpl()
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
    return TransformationLanguagePackage.Literals.INVOKE_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokeExpr getInvokeExpr()
  {
    return invokeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvokeExpr(InvokeExpr newInvokeExpr, NotificationChain msgs)
  {
    InvokeExpr oldInvokeExpr = invokeExpr;
    invokeExpr = newInvokeExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR, oldInvokeExpr, newInvokeExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvokeExpr(InvokeExpr newInvokeExpr)
  {
    if (newInvokeExpr != invokeExpr)
    {
      NotificationChain msgs = null;
      if (invokeExpr != null)
        msgs = ((InternalEObject)invokeExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR, null, msgs);
      if (newInvokeExpr != null)
        msgs = ((InternalEObject)newInvokeExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR, null, msgs);
      msgs = basicSetInvokeExpr(newInvokeExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR, newInvokeExpr, newInvokeExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR:
        return basicSetInvokeExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR:
        return getInvokeExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR:
        setInvokeExpr((InvokeExpr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR:
        setInvokeExpr((InvokeExpr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TransformationLanguagePackage.INVOKE_STMT__INVOKE_EXPR:
        return invokeExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //InvokeStmtImpl
