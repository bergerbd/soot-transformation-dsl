/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.FieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Field Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceFieldRefImpl#getBase <em>Base</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceFieldRefImpl#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceFieldRefImpl extends FieldRefImpl implements InstanceFieldRef
{
  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected LocalOrWildcard base;

  /**
   * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldRef()
   * @generated
   * @ordered
   */
  protected FieldRef fieldRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceFieldRefImpl()
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
    return TransformationLanguagePackage.Literals.INSTANCE_FIELD_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalOrWildcard getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBase(LocalOrWildcard newBase, NotificationChain msgs)
  {
    LocalOrWildcard oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE, oldBase, newBase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(LocalOrWildcard newBase)
  {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE, newBase, newBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldRef getFieldRef()
  {
    return fieldRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldRef(FieldRef newFieldRef, NotificationChain msgs)
  {
    FieldRef oldFieldRef = fieldRef;
    fieldRef = newFieldRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF, oldFieldRef, newFieldRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldRef(FieldRef newFieldRef)
  {
    if (newFieldRef != fieldRef)
    {
      NotificationChain msgs = null;
      if (fieldRef != null)
        msgs = ((InternalEObject)fieldRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF, null, msgs);
      if (newFieldRef != null)
        msgs = ((InternalEObject)newFieldRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF, null, msgs);
      msgs = basicSetFieldRef(newFieldRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF, newFieldRef, newFieldRef));
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
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE:
        return basicSetBase(null, msgs);
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF:
        return basicSetFieldRef(null, msgs);
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
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE:
        return getBase();
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF:
        return getFieldRef();
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
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE:
        setBase((LocalOrWildcard)newValue);
        return;
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF:
        setFieldRef((FieldRef)newValue);
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
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE:
        setBase((LocalOrWildcard)null);
        return;
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF:
        setFieldRef((FieldRef)null);
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
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__BASE:
        return base != null;
      case TransformationLanguagePackage.INSTANCE_FIELD_REF__FIELD_REF:
        return fieldRef != null;
    }
    return super.eIsSet(featureID);
  }

} //InstanceFieldRefImpl
