/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AddExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AndExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AnyNewExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.BreakpointStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CaughtExceptionRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpgExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmplExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConcreteRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConditionalExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Constant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.DefinitionStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.DivExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.DoubleConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.EnterMonitorStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.EqExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ExitMonitorStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Expr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.FieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.FloatConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.GeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.GtExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IntConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InterfaceInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LabelOrStatement;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LengthExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Local;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LongConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LookupSwitchStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LtExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.MonitorStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.MulExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NegExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NonExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NopStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NullConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NumericConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.OrExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Pattern;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.QualifiedName;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.QualifiedNameOrWildcard;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.QualifiedNameWildcard;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Ref;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.RemExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.RetStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnVoidStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShlExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShrExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootType;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SpecialInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Statement;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SubExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguageFactory;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.UnopExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.UshrExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Value;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.VirtualInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Wildcard;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardAdditiveExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardBoolean;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardByte;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardCall;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardChar;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardClassLiteral;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardConditionalAndExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardConditionalOrExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardDereference;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardDouble;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardEqualityExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardField;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardFloat;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardInstanceOfExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardInt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardLiteral;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardLong;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardMultiplicativeExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardName;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardNew;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardNull;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardParExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardPrimary;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardPrimitiveType;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardQName;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardRelationalExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardShort;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardString;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardType;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardUnaryExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardUnaryExpressionNotPlusMinus;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardVoid;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.XorExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationLanguagePackageImpl extends EPackageImpl implements TransformationLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequencePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass replacementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelOrStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakpointStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identityStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableSwitchStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookupSwitchStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monitorStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enterMonitorStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitMonitorStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nopStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass retStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnVoidStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass throwStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyNewExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binOpExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cmpExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cmpgExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cmplExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mulExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shlExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shrExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ushrExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xorExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eqExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gtExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ltExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceOfExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sootMethodRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sootTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceInvokeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticInvokeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceInvokeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specialInvokeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualInvokeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localOrWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newArrayExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newMultiArrayExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unopExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identityRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass thisRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caughtExceptionRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concreteRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticFieldRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sootFieldRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceFieldRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameOrWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardConditionalOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardConditionalAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardEqualityExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardInstanceOfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardRelationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardAdditiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardMultiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardUnaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardUnaryExpressionNotPlusMinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardPrimaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardParExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardClassLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardPrimitiveTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardBooleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardNewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardQNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardDereferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardCharEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardByteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardShortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardLongEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardFloatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardDoubleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardVoidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TransformationLanguagePackageImpl()
  {
    super(eNS_URI, TransformationLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TransformationLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TransformationLanguagePackage init()
  {
    if (isInited) return (TransformationLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(TransformationLanguagePackage.eNS_URI);

    // Obtain or create and register package
    TransformationLanguagePackageImpl theTransformationLanguagePackage = (TransformationLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransformationLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransformationLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTransformationLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theTransformationLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTransformationLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TransformationLanguagePackage.eNS_URI, theTransformationLanguagePackage);
    return theTransformationLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransformation()
  {
    return transformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformation_Pattern()
  {
    return (EReference)transformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformation_Replacement()
  {
    return (EReference)transformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformation_Condition()
  {
    return (EReference)transformationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequencePattern()
  {
    return sequencePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequencePattern_Sequence()
  {
    return (EReference)sequencePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodPattern()
  {
    return methodPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_Method()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypePattern()
  {
    return typePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePattern_Type()
  {
    return (EReference)typePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReplacement()
  {
    return replacementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReplacement_Sequence()
  {
    return (EReference)replacementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReplacement_Method()
  {
    return (EReference)replacementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReplacement_Type()
  {
    return (EReference)replacementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Visibility()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Class()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Interface()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Name()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_SuperClass()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Interfaces()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Fields()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Methods()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Visibility()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Static()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Type()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Name()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Visibility()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Static()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Type()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Parameters()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Body()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Declarations()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Statements()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementSequence()
  {
    return statementSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementSequence_Statements()
  {
    return (EReference)statementSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclaration_Type()
  {
    return (EReference)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_Locals()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelOrStatement()
  {
    return labelOrStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakpointStmt()
  {
    return breakpointStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitionStmt()
  {
    return definitionStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignStmt()
  {
    return assignStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignStmt_Lhs()
  {
    return (EReference)assignStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignStmt_Rhs()
  {
    return (EReference)assignStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentityStmt()
  {
    return identityStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentityStmt_Lhs()
  {
    return (EReference)identityStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentityStmt_Rhs()
  {
    return (EReference)identityStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGotoStmt()
  {
    return gotoStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGotoStmt_Target()
  {
    return (EAttribute)gotoStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStmt()
  {
    return ifStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStmt_Condition()
  {
    return (EReference)ifStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStmt_Then()
  {
    return (EReference)ifStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeStmt()
  {
    return invokeStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeStmt_InvokeExpr()
  {
    return (EReference)invokeStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableSwitchStmt()
  {
    return tableSwitchStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableSwitchStmt_Key()
  {
    return (EReference)tableSwitchStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableSwitchStmt_Cases()
  {
    return (EReference)tableSwitchStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableSwitchStmt_Default()
  {
    return (EReference)tableSwitchStmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLookupSwitchStmt()
  {
    return lookupSwitchStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonitorStmt()
  {
    return monitorStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMonitorStmt_Operand()
  {
    return (EReference)monitorStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnterMonitorStmt()
  {
    return enterMonitorStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitMonitorStmt()
  {
    return exitMonitorStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNopStmt()
  {
    return nopStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRetStmt()
  {
    return retStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRetStmt_Target()
  {
    return (EReference)retStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnVoidStmt()
  {
    return returnVoidStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnStmt()
  {
    return returnStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturnStmt_Operand()
  {
    return (EReference)returnStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase()
  {
    return caseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCase_Value()
  {
    return (EAttribute)caseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCase_Target()
  {
    return (EReference)caseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThrowStmt()
  {
    return throwStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThrowStmt_Operand()
  {
    return (EReference)throwStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonExpr()
  {
    return nonExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyNewExpr()
  {
    return anyNewExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnyNewExpr_Type()
  {
    return (EReference)anyNewExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinOpExpr()
  {
    return binOpExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinOpExpr_LeftOp()
  {
    return (EReference)binOpExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinOpExpr_RightOp()
  {
    return (EReference)binOpExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddExpr()
  {
    return addExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpr()
  {
    return andExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCmpExpr()
  {
    return cmpExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCmpgExpr()
  {
    return cmpgExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCmplExpr()
  {
    return cmplExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalExpr()
  {
    return conditionalExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivExpr()
  {
    return divExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulExpr()
  {
    return mulExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpr()
  {
    return orExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemExpr()
  {
    return remExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShlExpr()
  {
    return shlExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShrExpr()
  {
    return shrExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubExpr()
  {
    return subExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUshrExpr()
  {
    return ushrExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXorExpr()
  {
    return xorExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqExpr()
  {
    return eqExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeExpr()
  {
    return geExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGtExpr()
  {
    return gtExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeExpr()
  {
    return leExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLtExpr()
  {
    return ltExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeExpr()
  {
    return neExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastExpr()
  {
    return castExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpr_Type()
  {
    return (EReference)castExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpr_Operand()
  {
    return (EReference)castExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceOfExpr()
  {
    return instanceOfExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceOfExpr_Operand()
  {
    return (EReference)instanceOfExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceOfExpr_Type()
  {
    return (EReference)instanceOfExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSootMethodRef()
  {
    return sootMethodRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSootMethodRef_Class()
  {
    return (EReference)sootMethodRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSootMethodRef_Type()
  {
    return (EReference)sootMethodRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSootMethodRef_Name()
  {
    return (EAttribute)sootMethodRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSootMethodRef_Parameters()
  {
    return (EReference)sootMethodRefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSootType()
  {
    return sootTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeExpr()
  {
    return invokeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeExpr_Method()
  {
    return (EReference)invokeExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeExpr_Parameters()
  {
    return (EReference)invokeExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceInvokeExpr()
  {
    return instanceInvokeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceInvokeExpr_Base()
  {
    return (EReference)instanceInvokeExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticInvokeExpr()
  {
    return staticInvokeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceInvokeExpr()
  {
    return interfaceInvokeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecialInvokeExpr()
  {
    return specialInvokeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualInvokeExpr()
  {
    return virtualInvokeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalOrWildcard()
  {
    return localOrWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewArrayExpr()
  {
    return newArrayExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewArrayExpr_Size()
  {
    return (EReference)newArrayExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewExpr()
  {
    return newExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewMultiArrayExpr()
  {
    return newMultiArrayExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewMultiArrayExpr_Size()
  {
    return (EReference)newMultiArrayExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewMultiArrayExpr_EmptySize()
  {
    return (EAttribute)newMultiArrayExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimension()
  {
    return dimensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimension_Size()
  {
    return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnopExpr()
  {
    return unopExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnopExpr_Operand()
  {
    return (EReference)unopExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLengthExpr()
  {
    return lengthExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegExpr()
  {
    return negExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocal()
  {
    return localEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocal_Name()
  {
    return (EAttribute)localEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef()
  {
    return refEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentityRef()
  {
    return identityRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterRef()
  {
    return parameterRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterRef_Name()
  {
    return (EAttribute)parameterRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterRef_Type()
  {
    return (EReference)parameterRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThisRef()
  {
    return thisRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThisRef_Type()
  {
    return (EReference)thisRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaughtExceptionRef()
  {
    return caughtExceptionRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteRef()
  {
    return concreteRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayRef()
  {
    return arrayRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayRef_Base()
  {
    return (EReference)arrayRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayRef_Index()
  {
    return (EReference)arrayRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldRef()
  {
    return fieldRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticFieldRef()
  {
    return staticFieldRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticFieldRef_FieldRef()
  {
    return (EReference)staticFieldRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSootFieldRef()
  {
    return sootFieldRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSootFieldRef_Class()
  {
    return (EReference)sootFieldRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSootFieldRef_Type()
  {
    return (EReference)sootFieldRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSootFieldRef_Name()
  {
    return (EAttribute)sootFieldRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceFieldRef()
  {
    return instanceFieldRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceFieldRef_Base()
  {
    return (EReference)instanceFieldRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceFieldRef_FieldRef()
  {
    return (EReference)instanceFieldRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassConstant()
  {
    return classConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassConstant_Name()
  {
    return (EReference)classConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedNameOrWildcard()
  {
    return qualifiedNameOrWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedNameWildcard()
  {
    return qualifiedNameWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedNameWildcard_Name()
  {
    return (EAttribute)qualifiedNameWildcardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullConstant()
  {
    return nullConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericConstant()
  {
    return numericConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericConstant_Value()
  {
    return (EAttribute)numericConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntConstant()
  {
    return intConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongConstant()
  {
    return longConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleConstant()
  {
    return doubleConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatConstant()
  {
    return floatConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConstant()
  {
    return stringConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringConstant_Value()
  {
    return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedName()
  {
    return qualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedName_Name()
  {
    return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcard()
  {
    return wildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcard_Expression()
  {
    return (EReference)wildcardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardName()
  {
    return wildcardNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardName_WName()
  {
    return (EAttribute)wildcardNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardExpression()
  {
    return wildcardExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardExpression_Expression()
  {
    return (EReference)wildcardExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardConditionalOrExpression()
  {
    return wildcardConditionalOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardConditionalOrExpression_Operands()
  {
    return (EReference)wildcardConditionalOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardConditionalAndExpression()
  {
    return wildcardConditionalAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardConditionalAndExpression_Operands()
  {
    return (EReference)wildcardConditionalAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardEqualityExpression()
  {
    return wildcardEqualityExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardEqualityExpression_Operands()
  {
    return (EReference)wildcardEqualityExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardEqualityExpression_Operator()
  {
    return (EAttribute)wildcardEqualityExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardInstanceOfExpression()
  {
    return wildcardInstanceOfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardInstanceOfExpression_Operand()
  {
    return (EReference)wildcardInstanceOfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardInstanceOfExpression_Type()
  {
    return (EReference)wildcardInstanceOfExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardRelationalExpression()
  {
    return wildcardRelationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardRelationalExpression_Operands()
  {
    return (EReference)wildcardRelationalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardRelationalExpression_Operators()
  {
    return (EAttribute)wildcardRelationalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardAdditiveExpression()
  {
    return wildcardAdditiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardAdditiveExpression_Operands()
  {
    return (EReference)wildcardAdditiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardAdditiveExpression_Operators()
  {
    return (EAttribute)wildcardAdditiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardMultiplicativeExpression()
  {
    return wildcardMultiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardMultiplicativeExpression_Operands()
  {
    return (EReference)wildcardMultiplicativeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardMultiplicativeExpression_Operators()
  {
    return (EAttribute)wildcardMultiplicativeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardUnaryExpression()
  {
    return wildcardUnaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardUnaryExpression_Operator()
  {
    return (EAttribute)wildcardUnaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardUnaryExpression_Operand()
  {
    return (EReference)wildcardUnaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardUnaryExpressionNotPlusMinus()
  {
    return wildcardUnaryExpressionNotPlusMinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardUnaryExpressionNotPlusMinus_Not()
  {
    return (EAttribute)wildcardUnaryExpressionNotPlusMinusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardUnaryExpressionNotPlusMinus_Operand()
  {
    return (EReference)wildcardUnaryExpressionNotPlusMinusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardUnaryExpressionNotPlusMinus_Dereferences()
  {
    return (EReference)wildcardUnaryExpressionNotPlusMinusEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardPrimary()
  {
    return wildcardPrimaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardParExpression()
  {
    return wildcardParExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardParExpression_Expression()
  {
    return (EReference)wildcardParExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardClassLiteral()
  {
    return wildcardClassLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardClassLiteral_BaseType()
  {
    return (EReference)wildcardClassLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardClassLiteral_Dimension()
  {
    return (EAttribute)wildcardClassLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardType()
  {
    return wildcardTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardPrimitiveType()
  {
    return wildcardPrimitiveTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardLiteral()
  {
    return wildcardLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardBoolean()
  {
    return wildcardBooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardBoolean_Value()
  {
    return (EAttribute)wildcardBooleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardInt()
  {
    return wildcardIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardInt_Value()
  {
    return (EAttribute)wildcardIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardNull()
  {
    return wildcardNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardString()
  {
    return wildcardStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardString_Value()
  {
    return (EAttribute)wildcardStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardNew()
  {
    return wildcardNewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardNew_Name()
  {
    return (EReference)wildcardNewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardNew_Parameters()
  {
    return (EReference)wildcardNewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardQName()
  {
    return wildcardQNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardQName_Name()
  {
    return (EAttribute)wildcardQNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardDereference()
  {
    return wildcardDereferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWildcardDereference_Name()
  {
    return (EAttribute)wildcardDereferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardCall()
  {
    return wildcardCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWildcardCall_Parameters()
  {
    return (EReference)wildcardCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardField()
  {
    return wildcardFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardChar()
  {
    return wildcardCharEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardByte()
  {
    return wildcardByteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardShort()
  {
    return wildcardShortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardLong()
  {
    return wildcardLongEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardFloat()
  {
    return wildcardFloatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardDouble()
  {
    return wildcardDoubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardVoid()
  {
    return wildcardVoidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibility()
  {
    return visibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationLanguageFactory getTransformationLanguageFactory()
  {
    return (TransformationLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    transformationEClass = createEClass(TRANSFORMATION);
    createEReference(transformationEClass, TRANSFORMATION__PATTERN);
    createEReference(transformationEClass, TRANSFORMATION__REPLACEMENT);
    createEReference(transformationEClass, TRANSFORMATION__CONDITION);

    patternEClass = createEClass(PATTERN);

    sequencePatternEClass = createEClass(SEQUENCE_PATTERN);
    createEReference(sequencePatternEClass, SEQUENCE_PATTERN__SEQUENCE);

    methodPatternEClass = createEClass(METHOD_PATTERN);
    createEReference(methodPatternEClass, METHOD_PATTERN__METHOD);

    typePatternEClass = createEClass(TYPE_PATTERN);
    createEReference(typePatternEClass, TYPE_PATTERN__TYPE);

    replacementEClass = createEClass(REPLACEMENT);
    createEReference(replacementEClass, REPLACEMENT__SEQUENCE);
    createEReference(replacementEClass, REPLACEMENT__METHOD);
    createEReference(replacementEClass, REPLACEMENT__TYPE);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__VISIBILITY);
    createEAttribute(typeEClass, TYPE__CLASS);
    createEAttribute(typeEClass, TYPE__INTERFACE);
    createEReference(typeEClass, TYPE__NAME);
    createEReference(typeEClass, TYPE__SUPER_CLASS);
    createEReference(typeEClass, TYPE__INTERFACES);
    createEReference(typeEClass, TYPE__FIELDS);
    createEReference(typeEClass, TYPE__METHODS);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__VISIBILITY);
    createEAttribute(fieldEClass, FIELD__STATIC);
    createEReference(fieldEClass, FIELD__TYPE);
    createEAttribute(fieldEClass, FIELD__NAME);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__VISIBILITY);
    createEAttribute(methodEClass, METHOD__STATIC);
    createEAttribute(methodEClass, METHOD__TYPE);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAMETERS);
    createEReference(methodEClass, METHOD__BODY);

    bodyEClass = createEClass(BODY);
    createEReference(bodyEClass, BODY__DECLARATIONS);
    createEReference(bodyEClass, BODY__STATEMENTS);

    statementSequenceEClass = createEClass(STATEMENT_SEQUENCE);
    createEReference(statementSequenceEClass, STATEMENT_SEQUENCE__STATEMENTS);

    declarationEClass = createEClass(DECLARATION);
    createEReference(declarationEClass, DECLARATION__TYPE);
    createEAttribute(declarationEClass, DECLARATION__LOCALS);

    labelOrStatementEClass = createEClass(LABEL_OR_STATEMENT);

    statementEClass = createEClass(STATEMENT);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    breakpointStmtEClass = createEClass(BREAKPOINT_STMT);

    definitionStmtEClass = createEClass(DEFINITION_STMT);

    assignStmtEClass = createEClass(ASSIGN_STMT);
    createEReference(assignStmtEClass, ASSIGN_STMT__LHS);
    createEReference(assignStmtEClass, ASSIGN_STMT__RHS);

    identityStmtEClass = createEClass(IDENTITY_STMT);
    createEReference(identityStmtEClass, IDENTITY_STMT__LHS);
    createEReference(identityStmtEClass, IDENTITY_STMT__RHS);

    gotoStmtEClass = createEClass(GOTO_STMT);
    createEAttribute(gotoStmtEClass, GOTO_STMT__TARGET);

    ifStmtEClass = createEClass(IF_STMT);
    createEReference(ifStmtEClass, IF_STMT__CONDITION);
    createEReference(ifStmtEClass, IF_STMT__THEN);

    invokeStmtEClass = createEClass(INVOKE_STMT);
    createEReference(invokeStmtEClass, INVOKE_STMT__INVOKE_EXPR);

    tableSwitchStmtEClass = createEClass(TABLE_SWITCH_STMT);
    createEReference(tableSwitchStmtEClass, TABLE_SWITCH_STMT__KEY);
    createEReference(tableSwitchStmtEClass, TABLE_SWITCH_STMT__CASES);
    createEReference(tableSwitchStmtEClass, TABLE_SWITCH_STMT__DEFAULT);

    lookupSwitchStmtEClass = createEClass(LOOKUP_SWITCH_STMT);

    monitorStmtEClass = createEClass(MONITOR_STMT);
    createEReference(monitorStmtEClass, MONITOR_STMT__OPERAND);

    enterMonitorStmtEClass = createEClass(ENTER_MONITOR_STMT);

    exitMonitorStmtEClass = createEClass(EXIT_MONITOR_STMT);

    nopStmtEClass = createEClass(NOP_STMT);

    retStmtEClass = createEClass(RET_STMT);
    createEReference(retStmtEClass, RET_STMT__TARGET);

    returnVoidStmtEClass = createEClass(RETURN_VOID_STMT);

    returnStmtEClass = createEClass(RETURN_STMT);
    createEReference(returnStmtEClass, RETURN_STMT__OPERAND);

    caseEClass = createEClass(CASE);
    createEAttribute(caseEClass, CASE__VALUE);
    createEReference(caseEClass, CASE__TARGET);

    throwStmtEClass = createEClass(THROW_STMT);
    createEReference(throwStmtEClass, THROW_STMT__OPERAND);

    valueEClass = createEClass(VALUE);

    nonExprEClass = createEClass(NON_EXPR);

    exprEClass = createEClass(EXPR);

    anyNewExprEClass = createEClass(ANY_NEW_EXPR);
    createEReference(anyNewExprEClass, ANY_NEW_EXPR__TYPE);

    binOpExprEClass = createEClass(BIN_OP_EXPR);
    createEReference(binOpExprEClass, BIN_OP_EXPR__LEFT_OP);
    createEReference(binOpExprEClass, BIN_OP_EXPR__RIGHT_OP);

    addExprEClass = createEClass(ADD_EXPR);

    andExprEClass = createEClass(AND_EXPR);

    cmpExprEClass = createEClass(CMP_EXPR);

    cmpgExprEClass = createEClass(CMPG_EXPR);

    cmplExprEClass = createEClass(CMPL_EXPR);

    conditionalExprEClass = createEClass(CONDITIONAL_EXPR);

    divExprEClass = createEClass(DIV_EXPR);

    mulExprEClass = createEClass(MUL_EXPR);

    orExprEClass = createEClass(OR_EXPR);

    remExprEClass = createEClass(REM_EXPR);

    shlExprEClass = createEClass(SHL_EXPR);

    shrExprEClass = createEClass(SHR_EXPR);

    subExprEClass = createEClass(SUB_EXPR);

    ushrExprEClass = createEClass(USHR_EXPR);

    xorExprEClass = createEClass(XOR_EXPR);

    eqExprEClass = createEClass(EQ_EXPR);

    geExprEClass = createEClass(GE_EXPR);

    gtExprEClass = createEClass(GT_EXPR);

    leExprEClass = createEClass(LE_EXPR);

    ltExprEClass = createEClass(LT_EXPR);

    neExprEClass = createEClass(NE_EXPR);

    castExprEClass = createEClass(CAST_EXPR);
    createEReference(castExprEClass, CAST_EXPR__TYPE);
    createEReference(castExprEClass, CAST_EXPR__OPERAND);

    instanceOfExprEClass = createEClass(INSTANCE_OF_EXPR);
    createEReference(instanceOfExprEClass, INSTANCE_OF_EXPR__OPERAND);
    createEReference(instanceOfExprEClass, INSTANCE_OF_EXPR__TYPE);

    sootMethodRefEClass = createEClass(SOOT_METHOD_REF);
    createEReference(sootMethodRefEClass, SOOT_METHOD_REF__CLASS);
    createEReference(sootMethodRefEClass, SOOT_METHOD_REF__TYPE);
    createEAttribute(sootMethodRefEClass, SOOT_METHOD_REF__NAME);
    createEReference(sootMethodRefEClass, SOOT_METHOD_REF__PARAMETERS);

    sootTypeEClass = createEClass(SOOT_TYPE);

    invokeExprEClass = createEClass(INVOKE_EXPR);
    createEReference(invokeExprEClass, INVOKE_EXPR__METHOD);
    createEReference(invokeExprEClass, INVOKE_EXPR__PARAMETERS);

    instanceInvokeExprEClass = createEClass(INSTANCE_INVOKE_EXPR);
    createEReference(instanceInvokeExprEClass, INSTANCE_INVOKE_EXPR__BASE);

    staticInvokeExprEClass = createEClass(STATIC_INVOKE_EXPR);

    interfaceInvokeExprEClass = createEClass(INTERFACE_INVOKE_EXPR);

    specialInvokeExprEClass = createEClass(SPECIAL_INVOKE_EXPR);

    virtualInvokeExprEClass = createEClass(VIRTUAL_INVOKE_EXPR);

    localOrWildcardEClass = createEClass(LOCAL_OR_WILDCARD);

    newArrayExprEClass = createEClass(NEW_ARRAY_EXPR);
    createEReference(newArrayExprEClass, NEW_ARRAY_EXPR__SIZE);

    newExprEClass = createEClass(NEW_EXPR);

    newMultiArrayExprEClass = createEClass(NEW_MULTI_ARRAY_EXPR);
    createEReference(newMultiArrayExprEClass, NEW_MULTI_ARRAY_EXPR__SIZE);
    createEAttribute(newMultiArrayExprEClass, NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE);

    dimensionEClass = createEClass(DIMENSION);
    createEAttribute(dimensionEClass, DIMENSION__SIZE);

    unopExprEClass = createEClass(UNOP_EXPR);
    createEReference(unopExprEClass, UNOP_EXPR__OPERAND);

    lengthExprEClass = createEClass(LENGTH_EXPR);

    negExprEClass = createEClass(NEG_EXPR);

    localEClass = createEClass(LOCAL);
    createEAttribute(localEClass, LOCAL__NAME);

    refEClass = createEClass(REF);

    identityRefEClass = createEClass(IDENTITY_REF);

    parameterRefEClass = createEClass(PARAMETER_REF);
    createEAttribute(parameterRefEClass, PARAMETER_REF__NAME);
    createEReference(parameterRefEClass, PARAMETER_REF__TYPE);

    thisRefEClass = createEClass(THIS_REF);
    createEReference(thisRefEClass, THIS_REF__TYPE);

    caughtExceptionRefEClass = createEClass(CAUGHT_EXCEPTION_REF);

    concreteRefEClass = createEClass(CONCRETE_REF);

    arrayRefEClass = createEClass(ARRAY_REF);
    createEReference(arrayRefEClass, ARRAY_REF__BASE);
    createEReference(arrayRefEClass, ARRAY_REF__INDEX);

    fieldRefEClass = createEClass(FIELD_REF);

    staticFieldRefEClass = createEClass(STATIC_FIELD_REF);
    createEReference(staticFieldRefEClass, STATIC_FIELD_REF__FIELD_REF);

    sootFieldRefEClass = createEClass(SOOT_FIELD_REF);
    createEReference(sootFieldRefEClass, SOOT_FIELD_REF__CLASS);
    createEReference(sootFieldRefEClass, SOOT_FIELD_REF__TYPE);
    createEAttribute(sootFieldRefEClass, SOOT_FIELD_REF__NAME);

    instanceFieldRefEClass = createEClass(INSTANCE_FIELD_REF);
    createEReference(instanceFieldRefEClass, INSTANCE_FIELD_REF__BASE);
    createEReference(instanceFieldRefEClass, INSTANCE_FIELD_REF__FIELD_REF);

    constantEClass = createEClass(CONSTANT);

    classConstantEClass = createEClass(CLASS_CONSTANT);
    createEReference(classConstantEClass, CLASS_CONSTANT__NAME);

    qualifiedNameOrWildcardEClass = createEClass(QUALIFIED_NAME_OR_WILDCARD);

    qualifiedNameWildcardEClass = createEClass(QUALIFIED_NAME_WILDCARD);
    createEAttribute(qualifiedNameWildcardEClass, QUALIFIED_NAME_WILDCARD__NAME);

    nullConstantEClass = createEClass(NULL_CONSTANT);

    numericConstantEClass = createEClass(NUMERIC_CONSTANT);
    createEAttribute(numericConstantEClass, NUMERIC_CONSTANT__VALUE);

    intConstantEClass = createEClass(INT_CONSTANT);

    longConstantEClass = createEClass(LONG_CONSTANT);

    doubleConstantEClass = createEClass(DOUBLE_CONSTANT);

    floatConstantEClass = createEClass(FLOAT_CONSTANT);

    stringConstantEClass = createEClass(STRING_CONSTANT);
    createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

    qualifiedNameEClass = createEClass(QUALIFIED_NAME);
    createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__NAME);

    wildcardEClass = createEClass(WILDCARD);
    createEReference(wildcardEClass, WILDCARD__EXPRESSION);

    wildcardNameEClass = createEClass(WILDCARD_NAME);
    createEAttribute(wildcardNameEClass, WILDCARD_NAME__WNAME);

    wildcardExpressionEClass = createEClass(WILDCARD_EXPRESSION);
    createEReference(wildcardExpressionEClass, WILDCARD_EXPRESSION__EXPRESSION);

    wildcardConditionalOrExpressionEClass = createEClass(WILDCARD_CONDITIONAL_OR_EXPRESSION);
    createEReference(wildcardConditionalOrExpressionEClass, WILDCARD_CONDITIONAL_OR_EXPRESSION__OPERANDS);

    wildcardConditionalAndExpressionEClass = createEClass(WILDCARD_CONDITIONAL_AND_EXPRESSION);
    createEReference(wildcardConditionalAndExpressionEClass, WILDCARD_CONDITIONAL_AND_EXPRESSION__OPERANDS);

    wildcardEqualityExpressionEClass = createEClass(WILDCARD_EQUALITY_EXPRESSION);
    createEReference(wildcardEqualityExpressionEClass, WILDCARD_EQUALITY_EXPRESSION__OPERANDS);
    createEAttribute(wildcardEqualityExpressionEClass, WILDCARD_EQUALITY_EXPRESSION__OPERATOR);

    wildcardInstanceOfExpressionEClass = createEClass(WILDCARD_INSTANCE_OF_EXPRESSION);
    createEReference(wildcardInstanceOfExpressionEClass, WILDCARD_INSTANCE_OF_EXPRESSION__OPERAND);
    createEReference(wildcardInstanceOfExpressionEClass, WILDCARD_INSTANCE_OF_EXPRESSION__TYPE);

    wildcardRelationalExpressionEClass = createEClass(WILDCARD_RELATIONAL_EXPRESSION);
    createEReference(wildcardRelationalExpressionEClass, WILDCARD_RELATIONAL_EXPRESSION__OPERANDS);
    createEAttribute(wildcardRelationalExpressionEClass, WILDCARD_RELATIONAL_EXPRESSION__OPERATORS);

    wildcardAdditiveExpressionEClass = createEClass(WILDCARD_ADDITIVE_EXPRESSION);
    createEReference(wildcardAdditiveExpressionEClass, WILDCARD_ADDITIVE_EXPRESSION__OPERANDS);
    createEAttribute(wildcardAdditiveExpressionEClass, WILDCARD_ADDITIVE_EXPRESSION__OPERATORS);

    wildcardMultiplicativeExpressionEClass = createEClass(WILDCARD_MULTIPLICATIVE_EXPRESSION);
    createEReference(wildcardMultiplicativeExpressionEClass, WILDCARD_MULTIPLICATIVE_EXPRESSION__OPERANDS);
    createEAttribute(wildcardMultiplicativeExpressionEClass, WILDCARD_MULTIPLICATIVE_EXPRESSION__OPERATORS);

    wildcardUnaryExpressionEClass = createEClass(WILDCARD_UNARY_EXPRESSION);
    createEAttribute(wildcardUnaryExpressionEClass, WILDCARD_UNARY_EXPRESSION__OPERATOR);
    createEReference(wildcardUnaryExpressionEClass, WILDCARD_UNARY_EXPRESSION__OPERAND);

    wildcardUnaryExpressionNotPlusMinusEClass = createEClass(WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS);
    createEAttribute(wildcardUnaryExpressionNotPlusMinusEClass, WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__NOT);
    createEReference(wildcardUnaryExpressionNotPlusMinusEClass, WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__OPERAND);
    createEReference(wildcardUnaryExpressionNotPlusMinusEClass, WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS__DEREFERENCES);

    wildcardPrimaryEClass = createEClass(WILDCARD_PRIMARY);

    wildcardParExpressionEClass = createEClass(WILDCARD_PAR_EXPRESSION);
    createEReference(wildcardParExpressionEClass, WILDCARD_PAR_EXPRESSION__EXPRESSION);

    wildcardClassLiteralEClass = createEClass(WILDCARD_CLASS_LITERAL);
    createEReference(wildcardClassLiteralEClass, WILDCARD_CLASS_LITERAL__BASE_TYPE);
    createEAttribute(wildcardClassLiteralEClass, WILDCARD_CLASS_LITERAL__DIMENSION);

    wildcardTypeEClass = createEClass(WILDCARD_TYPE);

    wildcardPrimitiveTypeEClass = createEClass(WILDCARD_PRIMITIVE_TYPE);

    wildcardLiteralEClass = createEClass(WILDCARD_LITERAL);

    wildcardBooleanEClass = createEClass(WILDCARD_BOOLEAN);
    createEAttribute(wildcardBooleanEClass, WILDCARD_BOOLEAN__VALUE);

    wildcardIntEClass = createEClass(WILDCARD_INT);
    createEAttribute(wildcardIntEClass, WILDCARD_INT__VALUE);

    wildcardNullEClass = createEClass(WILDCARD_NULL);

    wildcardStringEClass = createEClass(WILDCARD_STRING);
    createEAttribute(wildcardStringEClass, WILDCARD_STRING__VALUE);

    wildcardNewEClass = createEClass(WILDCARD_NEW);
    createEReference(wildcardNewEClass, WILDCARD_NEW__NAME);
    createEReference(wildcardNewEClass, WILDCARD_NEW__PARAMETERS);

    wildcardQNameEClass = createEClass(WILDCARD_QNAME);
    createEAttribute(wildcardQNameEClass, WILDCARD_QNAME__NAME);

    wildcardDereferenceEClass = createEClass(WILDCARD_DEREFERENCE);
    createEAttribute(wildcardDereferenceEClass, WILDCARD_DEREFERENCE__NAME);

    wildcardCallEClass = createEClass(WILDCARD_CALL);
    createEReference(wildcardCallEClass, WILDCARD_CALL__PARAMETERS);

    wildcardFieldEClass = createEClass(WILDCARD_FIELD);

    wildcardCharEClass = createEClass(WILDCARD_CHAR);

    wildcardByteEClass = createEClass(WILDCARD_BYTE);

    wildcardShortEClass = createEClass(WILDCARD_SHORT);

    wildcardLongEClass = createEClass(WILDCARD_LONG);

    wildcardFloatEClass = createEClass(WILDCARD_FLOAT);

    wildcardDoubleEClass = createEClass(WILDCARD_DOUBLE);

    wildcardVoidEClass = createEClass(WILDCARD_VOID);

    // Create enums
    visibilityEEnum = createEEnum(VISIBILITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sequencePatternEClass.getESuperTypes().add(this.getPattern());
    methodPatternEClass.getESuperTypes().add(this.getPattern());
    typePatternEClass.getESuperTypes().add(this.getPattern());
    statementEClass.getESuperTypes().add(this.getLabelOrStatement());
    labelEClass.getESuperTypes().add(this.getLabelOrStatement());
    breakpointStmtEClass.getESuperTypes().add(this.getStatement());
    definitionStmtEClass.getESuperTypes().add(this.getStatement());
    assignStmtEClass.getESuperTypes().add(this.getDefinitionStmt());
    identityStmtEClass.getESuperTypes().add(this.getDefinitionStmt());
    gotoStmtEClass.getESuperTypes().add(this.getStatement());
    ifStmtEClass.getESuperTypes().add(this.getStatement());
    invokeStmtEClass.getESuperTypes().add(this.getStatement());
    tableSwitchStmtEClass.getESuperTypes().add(this.getStatement());
    lookupSwitchStmtEClass.getESuperTypes().add(this.getStatement());
    monitorStmtEClass.getESuperTypes().add(this.getStatement());
    enterMonitorStmtEClass.getESuperTypes().add(this.getMonitorStmt());
    exitMonitorStmtEClass.getESuperTypes().add(this.getMonitorStmt());
    nopStmtEClass.getESuperTypes().add(this.getStatement());
    retStmtEClass.getESuperTypes().add(this.getStatement());
    returnVoidStmtEClass.getESuperTypes().add(this.getStatement());
    returnStmtEClass.getESuperTypes().add(this.getStatement());
    nonExprEClass.getESuperTypes().add(this.getValue());
    exprEClass.getESuperTypes().add(this.getValue());
    anyNewExprEClass.getESuperTypes().add(this.getExpr());
    binOpExprEClass.getESuperTypes().add(this.getExpr());
    addExprEClass.getESuperTypes().add(this.getBinOpExpr());
    andExprEClass.getESuperTypes().add(this.getBinOpExpr());
    cmpExprEClass.getESuperTypes().add(this.getBinOpExpr());
    cmpgExprEClass.getESuperTypes().add(this.getBinOpExpr());
    cmplExprEClass.getESuperTypes().add(this.getBinOpExpr());
    conditionalExprEClass.getESuperTypes().add(this.getBinOpExpr());
    divExprEClass.getESuperTypes().add(this.getBinOpExpr());
    mulExprEClass.getESuperTypes().add(this.getBinOpExpr());
    orExprEClass.getESuperTypes().add(this.getBinOpExpr());
    remExprEClass.getESuperTypes().add(this.getBinOpExpr());
    shlExprEClass.getESuperTypes().add(this.getBinOpExpr());
    shrExprEClass.getESuperTypes().add(this.getBinOpExpr());
    subExprEClass.getESuperTypes().add(this.getBinOpExpr());
    ushrExprEClass.getESuperTypes().add(this.getBinOpExpr());
    xorExprEClass.getESuperTypes().add(this.getBinOpExpr());
    eqExprEClass.getESuperTypes().add(this.getConditionalExpr());
    geExprEClass.getESuperTypes().add(this.getConditionalExpr());
    gtExprEClass.getESuperTypes().add(this.getConditionalExpr());
    leExprEClass.getESuperTypes().add(this.getConditionalExpr());
    ltExprEClass.getESuperTypes().add(this.getConditionalExpr());
    neExprEClass.getESuperTypes().add(this.getConditionalExpr());
    castExprEClass.getESuperTypes().add(this.getExpr());
    instanceOfExprEClass.getESuperTypes().add(this.getExpr());
    invokeExprEClass.getESuperTypes().add(this.getExpr());
    instanceInvokeExprEClass.getESuperTypes().add(this.getInvokeExpr());
    staticInvokeExprEClass.getESuperTypes().add(this.getInvokeExpr());
    interfaceInvokeExprEClass.getESuperTypes().add(this.getInstanceInvokeExpr());
    specialInvokeExprEClass.getESuperTypes().add(this.getInstanceInvokeExpr());
    virtualInvokeExprEClass.getESuperTypes().add(this.getInstanceInvokeExpr());
    localOrWildcardEClass.getESuperTypes().add(this.getRef());
    newArrayExprEClass.getESuperTypes().add(this.getAnyNewExpr());
    newExprEClass.getESuperTypes().add(this.getAnyNewExpr());
    newMultiArrayExprEClass.getESuperTypes().add(this.getAnyNewExpr());
    unopExprEClass.getESuperTypes().add(this.getExpr());
    lengthExprEClass.getESuperTypes().add(this.getUnopExpr());
    negExprEClass.getESuperTypes().add(this.getUnopExpr());
    localEClass.getESuperTypes().add(this.getLocalOrWildcard());
    refEClass.getESuperTypes().add(this.getNonExpr());
    identityRefEClass.getESuperTypes().add(this.getRef());
    parameterRefEClass.getESuperTypes().add(this.getIdentityRef());
    thisRefEClass.getESuperTypes().add(this.getIdentityRef());
    caughtExceptionRefEClass.getESuperTypes().add(this.getIdentityRef());
    concreteRefEClass.getESuperTypes().add(this.getRef());
    arrayRefEClass.getESuperTypes().add(this.getConcreteRef());
    fieldRefEClass.getESuperTypes().add(this.getConcreteRef());
    staticFieldRefEClass.getESuperTypes().add(this.getFieldRef());
    instanceFieldRefEClass.getESuperTypes().add(this.getFieldRef());
    constantEClass.getESuperTypes().add(this.getNonExpr());
    classConstantEClass.getESuperTypes().add(this.getConstant());
    nullConstantEClass.getESuperTypes().add(this.getConstant());
    numericConstantEClass.getESuperTypes().add(this.getConstant());
    intConstantEClass.getESuperTypes().add(this.getNumericConstant());
    longConstantEClass.getESuperTypes().add(this.getNumericConstant());
    doubleConstantEClass.getESuperTypes().add(this.getNumericConstant());
    floatConstantEClass.getESuperTypes().add(this.getNumericConstant());
    stringConstantEClass.getESuperTypes().add(this.getConstant());
    qualifiedNameEClass.getESuperTypes().add(this.getSootType());
    qualifiedNameEClass.getESuperTypes().add(this.getQualifiedNameOrWildcard());
    wildcardEClass.getESuperTypes().add(this.getQualifiedNameOrWildcard());
    wildcardNameEClass.getESuperTypes().add(this.getLocalOrWildcard());
    wildcardParExpressionEClass.getESuperTypes().add(this.getWildcardPrimary());
    wildcardClassLiteralEClass.getESuperTypes().add(this.getWildcardPrimary());
    wildcardPrimitiveTypeEClass.getESuperTypes().add(this.getSootType());
    wildcardPrimitiveTypeEClass.getESuperTypes().add(this.getWildcardType());
    wildcardLiteralEClass.getESuperTypes().add(this.getWildcardPrimary());
    wildcardBooleanEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardBooleanEClass.getESuperTypes().add(this.getWildcardLiteral());
    wildcardIntEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardIntEClass.getESuperTypes().add(this.getWildcardLiteral());
    wildcardNullEClass.getESuperTypes().add(this.getWildcardLiteral());
    wildcardStringEClass.getESuperTypes().add(this.getWildcardLiteral());
    wildcardNewEClass.getESuperTypes().add(this.getWildcardPrimary());
    wildcardQNameEClass.getESuperTypes().add(this.getWildcardPrimary());
    wildcardQNameEClass.getESuperTypes().add(this.getWildcardType());
    wildcardDereferenceEClass.getESuperTypes().add(this.getWildcardPrimary());
    wildcardCallEClass.getESuperTypes().add(this.getWildcardDereference());
    wildcardFieldEClass.getESuperTypes().add(this.getWildcardDereference());
    wildcardCharEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardByteEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardShortEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardLongEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardFloatEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardDoubleEClass.getESuperTypes().add(this.getWildcardPrimitiveType());
    wildcardVoidEClass.getESuperTypes().add(this.getWildcardPrimitiveType());

    // Initialize classes and features; add operations and parameters
    initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransformation_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransformation_Replacement(), this.getReplacement(), null, "replacement", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransformation_Condition(), this.getWildcardExpression(), null, "condition", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sequencePatternEClass, SequencePattern.class, "SequencePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequencePattern_Sequence(), this.getStatementSequence(), null, "sequence", null, 0, 1, SequencePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodPatternEClass, MethodPattern.class, "MethodPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodPattern_Method(), this.getMethod(), null, "method", null, 0, 1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typePatternEClass, TypePattern.class, "TypePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypePattern_Type(), this.getType(), null, "type", null, 0, 1, TypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(replacementEClass, Replacement.class, "Replacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReplacement_Sequence(), this.getStatementSequence(), null, "sequence", null, 0, 1, Replacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReplacement_Method(), this.getMethod(), null, "method", null, 0, 1, Replacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReplacement_Type(), this.getType(), null, "type", null, 0, 1, Replacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Class(), ecorePackage.getEBoolean(), "class", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Interface(), ecorePackage.getEBoolean(), "interface", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Name(), this.getQualifiedName(), null, "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_SuperClass(), this.getQualifiedName(), null, "superClass", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Interfaces(), this.getQualifiedName(), null, "interfaces", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Fields(), this.getField(), null, "fields", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Methods(), this.getMethod(), null, "methods", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_Type(), this.getQualifiedName(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Type(), ecorePackage.getEString(), "type", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Parameters(), this.getQualifiedName(), null, "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Body(), this.getBody(), null, "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBody_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Statements(), this.getLabelOrStatement(), null, "statements", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementSequenceEClass, StatementSequence.class, "StatementSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementSequence_Statements(), this.getLabelOrStatement(), null, "statements", null, 0, -1, StatementSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaration_Type(), this.getQualifiedName(), null, "type", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_Locals(), ecorePackage.getEString(), "locals", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelOrStatementEClass, LabelOrStatement.class, "LabelOrStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(breakpointStmtEClass, BreakpointStmt.class, "BreakpointStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definitionStmtEClass, DefinitionStmt.class, "DefinitionStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignStmtEClass, AssignStmt.class, "AssignStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignStmt_Lhs(), this.getRef(), null, "lhs", null, 0, 1, AssignStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignStmt_Rhs(), this.getValue(), null, "rhs", null, 0, 1, AssignStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identityStmtEClass, IdentityStmt.class, "IdentityStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdentityStmt_Lhs(), this.getLocal(), null, "lhs", null, 0, 1, IdentityStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdentityStmt_Rhs(), this.getIdentityRef(), null, "rhs", null, 0, 1, IdentityStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gotoStmtEClass, GotoStmt.class, "GotoStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGotoStmt_Target(), ecorePackage.getEString(), "target", null, 0, 1, GotoStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStmtEClass, IfStmt.class, "IfStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStmt_Condition(), this.getConditionalExpr(), null, "condition", null, 0, 1, IfStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStmt_Then(), this.getGotoStmt(), null, "then", null, 0, 1, IfStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invokeStmtEClass, InvokeStmt.class, "InvokeStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvokeStmt_InvokeExpr(), this.getInvokeExpr(), null, "invokeExpr", null, 0, 1, InvokeStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableSwitchStmtEClass, TableSwitchStmt.class, "TableSwitchStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableSwitchStmt_Key(), this.getLocal(), null, "key", null, 0, 1, TableSwitchStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableSwitchStmt_Cases(), this.getCase(), null, "cases", null, 0, -1, TableSwitchStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableSwitchStmt_Default(), this.getGotoStmt(), null, "default", null, 0, 1, TableSwitchStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookupSwitchStmtEClass, LookupSwitchStmt.class, "LookupSwitchStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(monitorStmtEClass, MonitorStmt.class, "MonitorStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMonitorStmt_Operand(), this.getValue(), null, "operand", null, 0, 1, MonitorStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enterMonitorStmtEClass, EnterMonitorStmt.class, "EnterMonitorStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exitMonitorStmtEClass, ExitMonitorStmt.class, "ExitMonitorStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nopStmtEClass, NopStmt.class, "NopStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(retStmtEClass, RetStmt.class, "RetStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRetStmt_Target(), this.getLocal(), null, "target", null, 0, 1, RetStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnVoidStmtEClass, ReturnVoidStmt.class, "ReturnVoidStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnStmtEClass, ReturnStmt.class, "ReturnStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturnStmt_Operand(), this.getValue(), null, "operand", null, 0, 1, ReturnStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCase_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCase_Target(), this.getGotoStmt(), null, "target", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(throwStmtEClass, ThrowStmt.class, "ThrowStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getThrowStmt_Operand(), this.getValue(), null, "operand", null, 0, 1, ThrowStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nonExprEClass, NonExpr.class, "NonExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anyNewExprEClass, AnyNewExpr.class, "AnyNewExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnyNewExpr_Type(), this.getQualifiedName(), null, "type", null, 0, 1, AnyNewExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binOpExprEClass, BinOpExpr.class, "BinOpExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinOpExpr_LeftOp(), this.getNonExpr(), null, "leftOp", null, 0, 1, BinOpExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinOpExpr_RightOp(), this.getNonExpr(), null, "rightOp", null, 0, 1, BinOpExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addExprEClass, AddExpr.class, "AddExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andExprEClass, AndExpr.class, "AndExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cmpExprEClass, CmpExpr.class, "CmpExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cmpgExprEClass, CmpgExpr.class, "CmpgExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cmplExprEClass, CmplExpr.class, "CmplExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionalExprEClass, ConditionalExpr.class, "ConditionalExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divExprEClass, DivExpr.class, "DivExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mulExprEClass, MulExpr.class, "MulExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orExprEClass, OrExpr.class, "OrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(remExprEClass, RemExpr.class, "RemExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(shlExprEClass, ShlExpr.class, "ShlExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(shrExprEClass, ShrExpr.class, "ShrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subExprEClass, SubExpr.class, "SubExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ushrExprEClass, UshrExpr.class, "UshrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xorExprEClass, XorExpr.class, "XorExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eqExprEClass, EqExpr.class, "EqExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(geExprEClass, GeExpr.class, "GeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gtExprEClass, GtExpr.class, "GtExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leExprEClass, LeExpr.class, "LeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ltExprEClass, LtExpr.class, "LtExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(neExprEClass, NeExpr.class, "NeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(castExprEClass, CastExpr.class, "CastExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCastExpr_Type(), this.getQualifiedName(), null, "type", null, 0, 1, CastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCastExpr_Operand(), this.getValue(), null, "operand", null, 0, 1, CastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceOfExprEClass, InstanceOfExpr.class, "InstanceOfExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceOfExpr_Operand(), this.getRef(), null, "operand", null, 0, 1, InstanceOfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstanceOfExpr_Type(), this.getQualifiedName(), null, "type", null, 0, 1, InstanceOfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sootMethodRefEClass, SootMethodRef.class, "SootMethodRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSootMethodRef_Class(), this.getQualifiedName(), null, "class", null, 0, 1, SootMethodRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSootMethodRef_Type(), this.getSootType(), null, "type", null, 0, 1, SootMethodRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSootMethodRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, SootMethodRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSootMethodRef_Parameters(), this.getQualifiedName(), null, "parameters", null, 0, -1, SootMethodRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sootTypeEClass, SootType.class, "SootType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(invokeExprEClass, InvokeExpr.class, "InvokeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvokeExpr_Method(), this.getSootMethodRef(), null, "method", null, 0, 1, InvokeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvokeExpr_Parameters(), this.getNonExpr(), null, "parameters", null, 0, -1, InvokeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceInvokeExprEClass, InstanceInvokeExpr.class, "InstanceInvokeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceInvokeExpr_Base(), this.getLocalOrWildcard(), null, "base", null, 0, 1, InstanceInvokeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticInvokeExprEClass, StaticInvokeExpr.class, "StaticInvokeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceInvokeExprEClass, InterfaceInvokeExpr.class, "InterfaceInvokeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(specialInvokeExprEClass, SpecialInvokeExpr.class, "SpecialInvokeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(virtualInvokeExprEClass, VirtualInvokeExpr.class, "VirtualInvokeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localOrWildcardEClass, LocalOrWildcard.class, "LocalOrWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(newArrayExprEClass, NewArrayExpr.class, "NewArrayExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewArrayExpr_Size(), this.getDimension(), null, "size", null, 0, 1, NewArrayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newExprEClass, NewExpr.class, "NewExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(newMultiArrayExprEClass, NewMultiArrayExpr.class, "NewMultiArrayExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewMultiArrayExpr_Size(), this.getDimension(), null, "size", null, 0, -1, NewMultiArrayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNewMultiArrayExpr_EmptySize(), ecorePackage.getEString(), "emptySize", null, 0, -1, NewMultiArrayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimension_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unopExprEClass, UnopExpr.class, "UnopExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnopExpr_Operand(), this.getValue(), null, "operand", null, 0, 1, UnopExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lengthExprEClass, LengthExpr.class, "LengthExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negExprEClass, NegExpr.class, "NegExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localEClass, Local.class, "Local", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refEClass, Ref.class, "Ref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(identityRefEClass, IdentityRef.class, "IdentityRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterRefEClass, ParameterRef.class, "ParameterRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterRef_Type(), this.getQualifiedName(), null, "type", null, 0, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(thisRefEClass, ThisRef.class, "ThisRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getThisRef_Type(), this.getQualifiedName(), null, "type", null, 0, 1, ThisRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caughtExceptionRefEClass, CaughtExceptionRef.class, "CaughtExceptionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(concreteRefEClass, ConcreteRef.class, "ConcreteRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayRefEClass, ArrayRef.class, "ArrayRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayRef_Base(), this.getLocalOrWildcard(), null, "base", null, 0, 1, ArrayRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayRef_Index(), this.getNonExpr(), null, "index", null, 0, 1, ArrayRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldRefEClass, FieldRef.class, "FieldRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(staticFieldRefEClass, StaticFieldRef.class, "StaticFieldRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStaticFieldRef_FieldRef(), this.getSootFieldRef(), null, "fieldRef", null, 0, 1, StaticFieldRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sootFieldRefEClass, SootFieldRef.class, "SootFieldRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSootFieldRef_Class(), this.getQualifiedName(), null, "class", null, 0, 1, SootFieldRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSootFieldRef_Type(), this.getQualifiedName(), null, "Type", null, 0, 1, SootFieldRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSootFieldRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, SootFieldRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceFieldRefEClass, InstanceFieldRef.class, "InstanceFieldRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceFieldRef_Base(), this.getLocalOrWildcard(), null, "base", null, 0, 1, InstanceFieldRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstanceFieldRef_FieldRef(), this.getFieldRef(), null, "fieldRef", null, 0, 1, InstanceFieldRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classConstantEClass, ClassConstant.class, "ClassConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassConstant_Name(), this.getQualifiedNameOrWildcard(), null, "name", null, 0, 1, ClassConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameOrWildcardEClass, QualifiedNameOrWildcard.class, "QualifiedNameOrWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualifiedNameWildcardEClass, QualifiedNameWildcard.class, "QualifiedNameWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedNameWildcard_Name(), ecorePackage.getEString(), "name", null, 0, 1, QualifiedNameWildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullConstantEClass, NullConstant.class, "NullConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numericConstantEClass, NumericConstant.class, "NumericConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, NumericConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longConstantEClass, LongConstant.class, "LongConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleConstantEClass, DoubleConstant.class, "DoubleConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatConstantEClass, FloatConstant.class, "FloatConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameEClass, QualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedName_Name(), ecorePackage.getEString(), "name", null, 0, 1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardEClass, Wildcard.class, "Wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcard_Expression(), this.getWildcardExpression(), null, "expression", null, 0, 1, Wildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardNameEClass, WildcardName.class, "WildcardName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardName_WName(), ecorePackage.getEString(), "wName", null, 0, 1, WildcardName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardExpressionEClass, WildcardExpression.class, "WildcardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardExpression_Expression(), this.getWildcardConditionalOrExpression(), null, "expression", null, 0, 1, WildcardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardConditionalOrExpressionEClass, WildcardConditionalOrExpression.class, "WildcardConditionalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardConditionalOrExpression_Operands(), this.getWildcardConditionalAndExpression(), null, "operands", null, 0, -1, WildcardConditionalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardConditionalAndExpressionEClass, WildcardConditionalAndExpression.class, "WildcardConditionalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardConditionalAndExpression_Operands(), this.getWildcardEqualityExpression(), null, "operands", null, 0, -1, WildcardConditionalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardEqualityExpressionEClass, WildcardEqualityExpression.class, "WildcardEqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardEqualityExpression_Operands(), this.getWildcardInstanceOfExpression(), null, "operands", null, 0, -1, WildcardEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWildcardEqualityExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, WildcardEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardInstanceOfExpressionEClass, WildcardInstanceOfExpression.class, "WildcardInstanceOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardInstanceOfExpression_Operand(), this.getWildcardRelationalExpression(), null, "operand", null, 0, 1, WildcardInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWildcardInstanceOfExpression_Type(), this.getWildcardQName(), null, "type", null, 0, 1, WildcardInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardRelationalExpressionEClass, WildcardRelationalExpression.class, "WildcardRelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardRelationalExpression_Operands(), this.getWildcardAdditiveExpression(), null, "operands", null, 0, -1, WildcardRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWildcardRelationalExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, WildcardRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardAdditiveExpressionEClass, WildcardAdditiveExpression.class, "WildcardAdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardAdditiveExpression_Operands(), this.getWildcardMultiplicativeExpression(), null, "operands", null, 0, -1, WildcardAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWildcardAdditiveExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, WildcardAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardMultiplicativeExpressionEClass, WildcardMultiplicativeExpression.class, "WildcardMultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardMultiplicativeExpression_Operands(), this.getWildcardUnaryExpression(), null, "operands", null, 0, -1, WildcardMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWildcardMultiplicativeExpression_Operators(), ecorePackage.getEString(), "operators", null, 0, -1, WildcardMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardUnaryExpressionEClass, WildcardUnaryExpression.class, "WildcardUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardUnaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, WildcardUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWildcardUnaryExpression_Operand(), ecorePackage.getEObject(), null, "operand", null, 0, 1, WildcardUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardUnaryExpressionNotPlusMinusEClass, WildcardUnaryExpressionNotPlusMinus.class, "WildcardUnaryExpressionNotPlusMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardUnaryExpressionNotPlusMinus_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, WildcardUnaryExpressionNotPlusMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWildcardUnaryExpressionNotPlusMinus_Operand(), ecorePackage.getEObject(), null, "operand", null, 0, 1, WildcardUnaryExpressionNotPlusMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWildcardUnaryExpressionNotPlusMinus_Dereferences(), this.getWildcardDereference(), null, "dereferences", null, 0, -1, WildcardUnaryExpressionNotPlusMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardPrimaryEClass, WildcardPrimary.class, "WildcardPrimary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardParExpressionEClass, WildcardParExpression.class, "WildcardParExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardParExpression_Expression(), this.getWildcardExpression(), null, "expression", null, 0, 1, WildcardParExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardClassLiteralEClass, WildcardClassLiteral.class, "WildcardClassLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardClassLiteral_BaseType(), this.getWildcardType(), null, "baseType", null, 0, 1, WildcardClassLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWildcardClassLiteral_Dimension(), ecorePackage.getEString(), "dimension", null, 0, -1, WildcardClassLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardTypeEClass, WildcardType.class, "WildcardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardPrimitiveTypeEClass, WildcardPrimitiveType.class, "WildcardPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardLiteralEClass, WildcardLiteral.class, "WildcardLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardBooleanEClass, WildcardBoolean.class, "WildcardBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardBoolean_Value(), ecorePackage.getEString(), "value", null, 0, 1, WildcardBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardIntEClass, WildcardInt.class, "WildcardInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, WildcardInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardNullEClass, WildcardNull.class, "WildcardNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardStringEClass, WildcardString.class, "WildcardString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardString_Value(), ecorePackage.getEString(), "value", null, 0, 1, WildcardString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardNewEClass, WildcardNew.class, "WildcardNew", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardNew_Name(), this.getWildcardQName(), null, "name", null, 0, 1, WildcardNew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWildcardNew_Parameters(), this.getWildcardExpression(), null, "parameters", null, 0, -1, WildcardNew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardQNameEClass, WildcardQName.class, "WildcardQName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardQName_Name(), ecorePackage.getEString(), "name", null, 0, 1, WildcardQName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardDereferenceEClass, WildcardDereference.class, "WildcardDereference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWildcardDereference_Name(), ecorePackage.getEString(), "name", null, 0, 1, WildcardDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardCallEClass, WildcardCall.class, "WildcardCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWildcardCall_Parameters(), this.getWildcardExpression(), null, "parameters", null, 0, -1, WildcardCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wildcardFieldEClass, WildcardField.class, "WildcardField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardCharEClass, WildcardChar.class, "WildcardChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardByteEClass, WildcardByte.class, "WildcardByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardShortEClass, WildcardShort.class, "WildcardShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardLongEClass, WildcardLong.class, "WildcardLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardFloatEClass, WildcardFloat.class, "WildcardFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardDoubleEClass, WildcardDouble.class, "WildcardDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardVoidEClass, WildcardVoid.class, "WildcardVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PACKAGE);
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
    addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

    // Create resource
    createResource(eNS_URI);
  }

} //TransformationLanguagePackageImpl
