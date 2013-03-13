/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Ref;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AssignStmtImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AssignStmtImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignStmtImpl extends DefinitionStmtImpl implements AssignStmt
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Ref lhs;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected Value rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignStmtImpl()
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
    return TransformationLanguagePackage.Literals.ASSIGN_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Ref newLhs, NotificationChain msgs)
  {
    Ref oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.ASSIGN_STMT__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Ref newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.ASSIGN_STMT__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.ASSIGN_STMT__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.ASSIGN_STMT__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(Value newRhs, NotificationChain msgs)
  {
    Value oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.ASSIGN_STMT__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(Value newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.ASSIGN_STMT__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.ASSIGN_STMT__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.ASSIGN_STMT__RHS, newRhs, newRhs));
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
      case TransformationLanguagePackage.ASSIGN_STMT__LHS:
        return basicSetLhs(null, msgs);
      case TransformationLanguagePackage.ASSIGN_STMT__RHS:
        return basicSetRhs(null, msgs);
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
      case TransformationLanguagePackage.ASSIGN_STMT__LHS:
        return getLhs();
      case TransformationLanguagePackage.ASSIGN_STMT__RHS:
        return getRhs();
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
      case TransformationLanguagePackage.ASSIGN_STMT__LHS:
        setLhs((Ref)newValue);
        return;
      case TransformationLanguagePackage.ASSIGN_STMT__RHS:
        setRhs((Value)newValue);
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
      case TransformationLanguagePackage.ASSIGN_STMT__LHS:
        setLhs((Ref)null);
        return;
      case TransformationLanguagePackage.ASSIGN_STMT__RHS:
        setRhs((Value)null);
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
      case TransformationLanguagePackage.ASSIGN_STMT__LHS:
        return lhs != null;
      case TransformationLanguagePackage.ASSIGN_STMT__RHS:
        return rhs != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignStmtImpl
