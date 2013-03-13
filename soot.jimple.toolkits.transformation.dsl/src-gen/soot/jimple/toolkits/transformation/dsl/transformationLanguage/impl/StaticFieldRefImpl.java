/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Field Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticFieldRefImpl#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticFieldRefImpl extends FieldRefImpl implements StaticFieldRef
{
  /**
   * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldRef()
   * @generated
   * @ordered
   */
  protected SootFieldRef fieldRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticFieldRefImpl()
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
    return TransformationLanguagePackage.Literals.STATIC_FIELD_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SootFieldRef getFieldRef()
  {
    return fieldRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldRef(SootFieldRef newFieldRef, NotificationChain msgs)
  {
    SootFieldRef oldFieldRef = fieldRef;
    fieldRef = newFieldRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF, oldFieldRef, newFieldRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldRef(SootFieldRef newFieldRef)
  {
    if (newFieldRef != fieldRef)
    {
      NotificationChain msgs = null;
      if (fieldRef != null)
        msgs = ((InternalEObject)fieldRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF, null, msgs);
      if (newFieldRef != null)
        msgs = ((InternalEObject)newFieldRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF, null, msgs);
      msgs = basicSetFieldRef(newFieldRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF, newFieldRef, newFieldRef));
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
      case TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF:
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
      case TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF:
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
      case TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF:
        setFieldRef((SootFieldRef)newValue);
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
      case TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF:
        setFieldRef((SootFieldRef)null);
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
      case TransformationLanguagePackage.STATIC_FIELD_REF__FIELD_REF:
        return fieldRef != null;
    }
    return super.eIsSet(featureID);
  }

} //StaticFieldRefImpl
