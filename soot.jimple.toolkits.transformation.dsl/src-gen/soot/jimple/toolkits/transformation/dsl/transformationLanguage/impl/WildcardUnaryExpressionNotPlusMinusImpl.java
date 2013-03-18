/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardDereference;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardUnaryExpressionNotPlusMinus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard Unary Expression Not Plus Minus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.WildcardUnaryExpressionNotPlusMinusImpl#isNot <em>Not</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.WildcardUnaryExpressionNotPlusMinusImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.WildcardUnaryExpressionNotPlusMinusImpl#getDereferences <em>Dereferences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WildcardUnaryExpressionNotPlusMinusImpl extends MinimalEObjectImpl.Container implements WildcardUnaryExpressionNotPlusMinus
{
  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected EObject operand;

  /**
   * The cached value of the '{@link #getDereferences() <em>Dereferences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDereferences()
   * @generated
   * @ordered
   */
  protected EList<WildcardDereference> dereferences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WildcardUnaryExpressionNotPlusMinusImpl()
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
    return TransformationLanguagePackage.Literals.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getOperand()
  {
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand(EObject newOperand, NotificationChain msgs)
  {
    EObject oldOperand = operand;
    operand = newOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND, oldOperand, newOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand(EObject newOperand)
  {
    if (newOperand != operand)
    {
      NotificationChain msgs = null;
      if (operand != null)
        msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND, null, msgs);
      if (newOperand != null)
        msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND, null, msgs);
      msgs = basicSetOperand(newOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND, newOperand, newOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WildcardDereference> getDereferences()
  {
    if (dereferences == null)
    {
      dereferences = new EObjectContainmentEList<WildcardDereference>(WildcardDereference.class, this, TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__DEREFERENCES);
    }
    return dereferences;
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
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND:
        return basicSetOperand(null, msgs);
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__DEREFERENCES:
        return ((InternalEList<?>)getDereferences()).basicRemove(otherEnd, msgs);
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
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__NOT:
        return isNot();
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND:
        return getOperand();
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__DEREFERENCES:
        return getDereferences();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__NOT:
        setNot((Boolean)newValue);
        return;
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND:
        setOperand((EObject)newValue);
        return;
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__DEREFERENCES:
        getDereferences().clear();
        getDereferences().addAll((Collection<? extends WildcardDereference>)newValue);
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
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND:
        setOperand((EObject)null);
        return;
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__DEREFERENCES:
        getDereferences().clear();
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
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__NOT:
        return not != NOT_EDEFAULT;
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND:
        return operand != null;
      case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__DEREFERENCES:
        return dereferences != null && !dereferences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (not: ");
    result.append(not);
    result.append(')');
    return result.toString();
  }

} //WildcardUnaryExpressionNotPlusMinusImpl
