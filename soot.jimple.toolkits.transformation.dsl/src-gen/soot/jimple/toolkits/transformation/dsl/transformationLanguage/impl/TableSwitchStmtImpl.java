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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Local;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Switch Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TableSwitchStmtImpl#getKey <em>Key</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TableSwitchStmtImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TableSwitchStmtImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableSwitchStmtImpl extends StatementImpl implements TableSwitchStmt
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected Local key;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<Case> cases;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected GotoStmt default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableSwitchStmtImpl()
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
    return TransformationLanguagePackage.Literals.TABLE_SWITCH_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Local getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(Local newKey, NotificationChain msgs)
  {
    Local oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(Local newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY, newKey, newKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Case> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<Case>(Case.class, this, TransformationLanguagePackage.TABLE_SWITCH_STMT__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoStmt getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(GotoStmt newDefault, NotificationChain msgs)
  {
    GotoStmt oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(GotoStmt newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT, newDefault, newDefault));
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
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY:
        return basicSetKey(null, msgs);
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT:
        return basicSetDefault(null, msgs);
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
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY:
        return getKey();
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__CASES:
        return getCases();
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT:
        return getDefault();
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
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY:
        setKey((Local)newValue);
        return;
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends Case>)newValue);
        return;
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT:
        setDefault((GotoStmt)newValue);
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
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY:
        setKey((Local)null);
        return;
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__CASES:
        getCases().clear();
        return;
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT:
        setDefault((GotoStmt)null);
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
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__KEY:
        return key != null;
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__CASES:
        return cases != null && !cases.isEmpty();
      case TransformationLanguagePackage.TABLE_SWITCH_STMT__DEFAULT:
        return default_ != null;
    }
    return super.eIsSet(featureID);
  }

} //TableSwitchStmtImpl
