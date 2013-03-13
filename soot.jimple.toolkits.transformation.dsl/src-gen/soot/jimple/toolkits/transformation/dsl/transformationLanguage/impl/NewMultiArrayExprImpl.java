/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Multi Array Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewMultiArrayExprImpl#getSize <em>Size</em>}</li>
 *   <li>{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewMultiArrayExprImpl#getEmptySize <em>Empty Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewMultiArrayExprImpl extends AnyNewExprImpl implements NewMultiArrayExpr
{
  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected EList<Dimension> size;

  /**
   * The cached value of the '{@link #getEmptySize() <em>Empty Size</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptySize()
   * @generated
   * @ordered
   */
  protected EList<String> emptySize;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewMultiArrayExprImpl()
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
    return TransformationLanguagePackage.Literals.NEW_MULTI_ARRAY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dimension> getSize()
  {
    if (size == null)
    {
      size = new EObjectContainmentEList<Dimension>(Dimension.class, this, TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__SIZE);
    }
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getEmptySize()
  {
    if (emptySize == null)
    {
      emptySize = new EDataTypeEList<String>(String.class, this, TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE);
    }
    return emptySize;
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
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__SIZE:
        return ((InternalEList<?>)getSize()).basicRemove(otherEnd, msgs);
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
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__SIZE:
        return getSize();
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE:
        return getEmptySize();
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
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__SIZE:
        getSize().clear();
        getSize().addAll((Collection<? extends Dimension>)newValue);
        return;
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE:
        getEmptySize().clear();
        getEmptySize().addAll((Collection<? extends String>)newValue);
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
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__SIZE:
        getSize().clear();
        return;
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE:
        getEmptySize().clear();
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
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__SIZE:
        return size != null && !size.isEmpty();
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE:
        return emptySize != null && !emptySize.isEmpty();
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
    result.append(" (emptySize: ");
    result.append(emptySize);
    result.append(')');
    return result.toString();
  }

} //NewMultiArrayExprImpl
