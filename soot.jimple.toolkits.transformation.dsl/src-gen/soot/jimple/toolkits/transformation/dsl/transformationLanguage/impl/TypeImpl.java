/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#isClass <em>Class</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PACKAGE;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected Visibility visibility = VISIBILITY_EDEFAULT;

  /**
   * The default value of the '{@link #isClass() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClass()
   * @generated
   * @ordered
   */
  protected static final boolean CLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClass() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClass()
   * @generated
   * @ordered
   */
  protected boolean class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected static final boolean INTERFACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected boolean interface_ = INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSuperClass() <em>Super Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperClass()
   * @generated
   * @ordered
   */
  protected static final String SUPER_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperClass()
   * @generated
   * @ordered
   */
  protected String superClass = SUPER_CLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<String> interfaces;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return TransformationLanguagePackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(Visibility newVisibility)
  {
    Visibility oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TYPE__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(boolean newClass)
  {
    boolean oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TYPE__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(boolean newInterface)
  {
    boolean oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TYPE__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuperClass()
  {
    return superClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperClass(String newSuperClass)
  {
    String oldSuperClass = superClass;
    superClass = newSuperClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TYPE__SUPER_CLASS, oldSuperClass, superClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EDataTypeEList<String>(String.class, this, TransformationLanguagePackage.TYPE__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, TransformationLanguagePackage.TYPE__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, TransformationLanguagePackage.TYPE__METHODS);
    }
    return methods;
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
      case TransformationLanguagePackage.TYPE__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case TransformationLanguagePackage.TYPE__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case TransformationLanguagePackage.TYPE__VISIBILITY:
        return getVisibility();
      case TransformationLanguagePackage.TYPE__CLASS:
        return isClass();
      case TransformationLanguagePackage.TYPE__INTERFACE:
        return isInterface();
      case TransformationLanguagePackage.TYPE__NAME:
        return getName();
      case TransformationLanguagePackage.TYPE__SUPER_CLASS:
        return getSuperClass();
      case TransformationLanguagePackage.TYPE__INTERFACES:
        return getInterfaces();
      case TransformationLanguagePackage.TYPE__FIELDS:
        return getFields();
      case TransformationLanguagePackage.TYPE__METHODS:
        return getMethods();
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
      case TransformationLanguagePackage.TYPE__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case TransformationLanguagePackage.TYPE__CLASS:
        setClass((Boolean)newValue);
        return;
      case TransformationLanguagePackage.TYPE__INTERFACE:
        setInterface((Boolean)newValue);
        return;
      case TransformationLanguagePackage.TYPE__NAME:
        setName((String)newValue);
        return;
      case TransformationLanguagePackage.TYPE__SUPER_CLASS:
        setSuperClass((String)newValue);
        return;
      case TransformationLanguagePackage.TYPE__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends String>)newValue);
        return;
      case TransformationLanguagePackage.TYPE__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case TransformationLanguagePackage.TYPE__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
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
      case TransformationLanguagePackage.TYPE__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case TransformationLanguagePackage.TYPE__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TransformationLanguagePackage.TYPE__INTERFACE:
        setInterface(INTERFACE_EDEFAULT);
        return;
      case TransformationLanguagePackage.TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TransformationLanguagePackage.TYPE__SUPER_CLASS:
        setSuperClass(SUPER_CLASS_EDEFAULT);
        return;
      case TransformationLanguagePackage.TYPE__INTERFACES:
        getInterfaces().clear();
        return;
      case TransformationLanguagePackage.TYPE__FIELDS:
        getFields().clear();
        return;
      case TransformationLanguagePackage.TYPE__METHODS:
        getMethods().clear();
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
      case TransformationLanguagePackage.TYPE__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case TransformationLanguagePackage.TYPE__CLASS:
        return class_ != CLASS_EDEFAULT;
      case TransformationLanguagePackage.TYPE__INTERFACE:
        return interface_ != INTERFACE_EDEFAULT;
      case TransformationLanguagePackage.TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TransformationLanguagePackage.TYPE__SUPER_CLASS:
        return SUPER_CLASS_EDEFAULT == null ? superClass != null : !SUPER_CLASS_EDEFAULT.equals(superClass);
      case TransformationLanguagePackage.TYPE__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case TransformationLanguagePackage.TYPE__FIELDS:
        return fields != null && !fields.isEmpty();
      case TransformationLanguagePackage.TYPE__METHODS:
        return methods != null && !methods.isEmpty();
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
    result.append(" (visibility: ");
    result.append(visibility);
    result.append(", class: ");
    result.append(class_);
    result.append(", interface: ");
    result.append(interface_);
    result.append(", name: ");
    result.append(name);
    result.append(", superClass: ");
    result.append(superClass);
    result.append(", interfaces: ");
    result.append(interfaces);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
