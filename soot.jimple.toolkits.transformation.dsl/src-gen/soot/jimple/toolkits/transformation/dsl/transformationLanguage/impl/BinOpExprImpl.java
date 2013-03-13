/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NonExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Op Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BinOpExprImpl#getLeftOp <em>Left Op</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BinOpExprImpl#getRightOp <em>Right Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinOpExprImpl extends ExprImpl implements BinOpExpr
{
  /**
   * The cached value of the '{@link #getLeftOp() <em>Left Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftOp()
   * @generated
   * @ordered
   */
  protected NonExpr leftOp;

  /**
   * The cached value of the '{@link #getRightOp() <em>Right Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightOp()
   * @generated
   * @ordered
   */
  protected NonExpr rightOp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinOpExprImpl()
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
    return TransformationLanguagePackage.Literals.BIN_OP_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonExpr getLeftOp()
  {
    return leftOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftOp(NonExpr newLeftOp, NotificationChain msgs)
  {
    NonExpr oldLeftOp = leftOp;
    leftOp = newLeftOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP, oldLeftOp, newLeftOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftOp(NonExpr newLeftOp)
  {
    if (newLeftOp != leftOp)
    {
      NotificationChain msgs = null;
      if (leftOp != null)
        msgs = ((InternalEObject)leftOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP, null, msgs);
      if (newLeftOp != null)
        msgs = ((InternalEObject)newLeftOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP, null, msgs);
      msgs = basicSetLeftOp(newLeftOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP, newLeftOp, newLeftOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonExpr getRightOp()
  {
    return rightOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightOp(NonExpr newRightOp, NotificationChain msgs)
  {
    NonExpr oldRightOp = rightOp;
    rightOp = newRightOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP, oldRightOp, newRightOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightOp(NonExpr newRightOp)
  {
    if (newRightOp != rightOp)
    {
      NotificationChain msgs = null;
      if (rightOp != null)
        msgs = ((InternalEObject)rightOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP, null, msgs);
      if (newRightOp != null)
        msgs = ((InternalEObject)newRightOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP, null, msgs);
      msgs = basicSetRightOp(newRightOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP, newRightOp, newRightOp));
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
      case TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP:
        return basicSetLeftOp(null, msgs);
      case TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP:
        return basicSetRightOp(null, msgs);
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
      case TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP:
        return getLeftOp();
      case TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP:
        return getRightOp();
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
      case TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP:
        setLeftOp((NonExpr)newValue);
        return;
      case TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP:
        setRightOp((NonExpr)newValue);
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
      case TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP:
        setLeftOp((NonExpr)null);
        return;
      case TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP:
        setRightOp((NonExpr)null);
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
      case TransformationLanguagePackage.BIN_OP_EXPR__LEFT_OP:
        return leftOp != null;
      case TransformationLanguagePackage.BIN_OP_EXPR__RIGHT_OP:
        return rightOp != null;
    }
    return super.eIsSet(featureID);
  }

} //BinOpExprImpl
