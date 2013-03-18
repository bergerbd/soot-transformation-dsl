/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage
 * @generated
 */
public interface TransformationLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TransformationLanguageFactory eINSTANCE = soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation</em>'.
   * @generated
   */
  Transformation createTransformation();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Sequence Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Pattern</em>'.
   * @generated
   */
  SequencePattern createSequencePattern();

  /**
   * Returns a new object of class '<em>Method Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Pattern</em>'.
   * @generated
   */
  MethodPattern createMethodPattern();

  /**
   * Returns a new object of class '<em>Type Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Pattern</em>'.
   * @generated
   */
  TypePattern createTypePattern();

  /**
   * Returns a new object of class '<em>Replacement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Replacement</em>'.
   * @generated
   */
  Replacement createReplacement();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body</em>'.
   * @generated
   */
  Body createBody();

  /**
   * Returns a new object of class '<em>Statement Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Sequence</em>'.
   * @generated
   */
  StatementSequence createStatementSequence();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Label Or Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Or Statement</em>'.
   * @generated
   */
  LabelOrStatement createLabelOrStatement();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Breakpoint Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Breakpoint Stmt</em>'.
   * @generated
   */
  BreakpointStmt createBreakpointStmt();

  /**
   * Returns a new object of class '<em>Definition Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Stmt</em>'.
   * @generated
   */
  DefinitionStmt createDefinitionStmt();

  /**
   * Returns a new object of class '<em>Assign Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Stmt</em>'.
   * @generated
   */
  AssignStmt createAssignStmt();

  /**
   * Returns a new object of class '<em>Identity Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identity Stmt</em>'.
   * @generated
   */
  IdentityStmt createIdentityStmt();

  /**
   * Returns a new object of class '<em>Goto Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goto Stmt</em>'.
   * @generated
   */
  GotoStmt createGotoStmt();

  /**
   * Returns a new object of class '<em>If Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Stmt</em>'.
   * @generated
   */
  IfStmt createIfStmt();

  /**
   * Returns a new object of class '<em>Invoke Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invoke Stmt</em>'.
   * @generated
   */
  InvokeStmt createInvokeStmt();

  /**
   * Returns a new object of class '<em>Table Switch Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Switch Stmt</em>'.
   * @generated
   */
  TableSwitchStmt createTableSwitchStmt();

  /**
   * Returns a new object of class '<em>Lookup Switch Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lookup Switch Stmt</em>'.
   * @generated
   */
  LookupSwitchStmt createLookupSwitchStmt();

  /**
   * Returns a new object of class '<em>Monitor Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monitor Stmt</em>'.
   * @generated
   */
  MonitorStmt createMonitorStmt();

  /**
   * Returns a new object of class '<em>Enter Monitor Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enter Monitor Stmt</em>'.
   * @generated
   */
  EnterMonitorStmt createEnterMonitorStmt();

  /**
   * Returns a new object of class '<em>Exit Monitor Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Monitor Stmt</em>'.
   * @generated
   */
  ExitMonitorStmt createExitMonitorStmt();

  /**
   * Returns a new object of class '<em>Nop Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nop Stmt</em>'.
   * @generated
   */
  NopStmt createNopStmt();

  /**
   * Returns a new object of class '<em>Ret Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ret Stmt</em>'.
   * @generated
   */
  RetStmt createRetStmt();

  /**
   * Returns a new object of class '<em>Return Void Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Void Stmt</em>'.
   * @generated
   */
  ReturnVoidStmt createReturnVoidStmt();

  /**
   * Returns a new object of class '<em>Return Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Stmt</em>'.
   * @generated
   */
  ReturnStmt createReturnStmt();

  /**
   * Returns a new object of class '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case</em>'.
   * @generated
   */
  Case createCase();

  /**
   * Returns a new object of class '<em>Throw Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Throw Stmt</em>'.
   * @generated
   */
  ThrowStmt createThrowStmt();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Non Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Expr</em>'.
   * @generated
   */
  NonExpr createNonExpr();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Any New Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any New Expr</em>'.
   * @generated
   */
  AnyNewExpr createAnyNewExpr();

  /**
   * Returns a new object of class '<em>Bin Op Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bin Op Expr</em>'.
   * @generated
   */
  BinOpExpr createBinOpExpr();

  /**
   * Returns a new object of class '<em>Add Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Expr</em>'.
   * @generated
   */
  AddExpr createAddExpr();

  /**
   * Returns a new object of class '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expr</em>'.
   * @generated
   */
  AndExpr createAndExpr();

  /**
   * Returns a new object of class '<em>Cmp Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cmp Expr</em>'.
   * @generated
   */
  CmpExpr createCmpExpr();

  /**
   * Returns a new object of class '<em>Cmpg Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cmpg Expr</em>'.
   * @generated
   */
  CmpgExpr createCmpgExpr();

  /**
   * Returns a new object of class '<em>Cmpl Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cmpl Expr</em>'.
   * @generated
   */
  CmplExpr createCmplExpr();

  /**
   * Returns a new object of class '<em>Conditional Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Expr</em>'.
   * @generated
   */
  ConditionalExpr createConditionalExpr();

  /**
   * Returns a new object of class '<em>Div Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div Expr</em>'.
   * @generated
   */
  DivExpr createDivExpr();

  /**
   * Returns a new object of class '<em>Mul Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Expr</em>'.
   * @generated
   */
  MulExpr createMulExpr();

  /**
   * Returns a new object of class '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expr</em>'.
   * @generated
   */
  OrExpr createOrExpr();

  /**
   * Returns a new object of class '<em>Rem Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rem Expr</em>'.
   * @generated
   */
  RemExpr createRemExpr();

  /**
   * Returns a new object of class '<em>Shl Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shl Expr</em>'.
   * @generated
   */
  ShlExpr createShlExpr();

  /**
   * Returns a new object of class '<em>Shr Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shr Expr</em>'.
   * @generated
   */
  ShrExpr createShrExpr();

  /**
   * Returns a new object of class '<em>Sub Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Expr</em>'.
   * @generated
   */
  SubExpr createSubExpr();

  /**
   * Returns a new object of class '<em>Ushr Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ushr Expr</em>'.
   * @generated
   */
  UshrExpr createUshrExpr();

  /**
   * Returns a new object of class '<em>Xor Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xor Expr</em>'.
   * @generated
   */
  XorExpr createXorExpr();

  /**
   * Returns a new object of class '<em>Eq Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eq Expr</em>'.
   * @generated
   */
  EqExpr createEqExpr();

  /**
   * Returns a new object of class '<em>Ge Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ge Expr</em>'.
   * @generated
   */
  GeExpr createGeExpr();

  /**
   * Returns a new object of class '<em>Gt Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gt Expr</em>'.
   * @generated
   */
  GtExpr createGtExpr();

  /**
   * Returns a new object of class '<em>Le Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Le Expr</em>'.
   * @generated
   */
  LeExpr createLeExpr();

  /**
   * Returns a new object of class '<em>Lt Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lt Expr</em>'.
   * @generated
   */
  LtExpr createLtExpr();

  /**
   * Returns a new object of class '<em>Ne Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ne Expr</em>'.
   * @generated
   */
  NeExpr createNeExpr();

  /**
   * Returns a new object of class '<em>Cast Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expr</em>'.
   * @generated
   */
  CastExpr createCastExpr();

  /**
   * Returns a new object of class '<em>Instance Of Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Of Expr</em>'.
   * @generated
   */
  InstanceOfExpr createInstanceOfExpr();

  /**
   * Returns a new object of class '<em>Soot Method Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Soot Method Ref</em>'.
   * @generated
   */
  SootMethodRef createSootMethodRef();

  /**
   * Returns a new object of class '<em>Soot Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Soot Type</em>'.
   * @generated
   */
  SootType createSootType();

  /**
   * Returns a new object of class '<em>Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invoke Expr</em>'.
   * @generated
   */
  InvokeExpr createInvokeExpr();

  /**
   * Returns a new object of class '<em>Instance Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Invoke Expr</em>'.
   * @generated
   */
  InstanceInvokeExpr createInstanceInvokeExpr();

  /**
   * Returns a new object of class '<em>Static Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Invoke Expr</em>'.
   * @generated
   */
  StaticInvokeExpr createStaticInvokeExpr();

  /**
   * Returns a new object of class '<em>Interface Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Invoke Expr</em>'.
   * @generated
   */
  InterfaceInvokeExpr createInterfaceInvokeExpr();

  /**
   * Returns a new object of class '<em>Special Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Special Invoke Expr</em>'.
   * @generated
   */
  SpecialInvokeExpr createSpecialInvokeExpr();

  /**
   * Returns a new object of class '<em>Virtual Invoke Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Invoke Expr</em>'.
   * @generated
   */
  VirtualInvokeExpr createVirtualInvokeExpr();

  /**
   * Returns a new object of class '<em>Local Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Or Wildcard</em>'.
   * @generated
   */
  LocalOrWildcard createLocalOrWildcard();

  /**
   * Returns a new object of class '<em>New Array Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Array Expr</em>'.
   * @generated
   */
  NewArrayExpr createNewArrayExpr();

  /**
   * Returns a new object of class '<em>New Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Expr</em>'.
   * @generated
   */
  NewExpr createNewExpr();

  /**
   * Returns a new object of class '<em>New Multi Array Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Multi Array Expr</em>'.
   * @generated
   */
  NewMultiArrayExpr createNewMultiArrayExpr();

  /**
   * Returns a new object of class '<em>Dimension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimension</em>'.
   * @generated
   */
  Dimension createDimension();

  /**
   * Returns a new object of class '<em>Unop Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unop Expr</em>'.
   * @generated
   */
  UnopExpr createUnopExpr();

  /**
   * Returns a new object of class '<em>Length Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Length Expr</em>'.
   * @generated
   */
  LengthExpr createLengthExpr();

  /**
   * Returns a new object of class '<em>Neg Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neg Expr</em>'.
   * @generated
   */
  NegExpr createNegExpr();

  /**
   * Returns a new object of class '<em>Local</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local</em>'.
   * @generated
   */
  Local createLocal();

  /**
   * Returns a new object of class '<em>Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref</em>'.
   * @generated
   */
  Ref createRef();

  /**
   * Returns a new object of class '<em>Identity Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identity Ref</em>'.
   * @generated
   */
  IdentityRef createIdentityRef();

  /**
   * Returns a new object of class '<em>Parameter Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Ref</em>'.
   * @generated
   */
  ParameterRef createParameterRef();

  /**
   * Returns a new object of class '<em>This Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>This Ref</em>'.
   * @generated
   */
  ThisRef createThisRef();

  /**
   * Returns a new object of class '<em>Caught Exception Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Caught Exception Ref</em>'.
   * @generated
   */
  CaughtExceptionRef createCaughtExceptionRef();

  /**
   * Returns a new object of class '<em>Concrete Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Ref</em>'.
   * @generated
   */
  ConcreteRef createConcreteRef();

  /**
   * Returns a new object of class '<em>Array Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Ref</em>'.
   * @generated
   */
  ArrayRef createArrayRef();

  /**
   * Returns a new object of class '<em>Field Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Ref</em>'.
   * @generated
   */
  FieldRef createFieldRef();

  /**
   * Returns a new object of class '<em>Static Field Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Field Ref</em>'.
   * @generated
   */
  StaticFieldRef createStaticFieldRef();

  /**
   * Returns a new object of class '<em>Soot Field Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Soot Field Ref</em>'.
   * @generated
   */
  SootFieldRef createSootFieldRef();

  /**
   * Returns a new object of class '<em>Instance Field Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Field Ref</em>'.
   * @generated
   */
  InstanceFieldRef createInstanceFieldRef();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Class Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Constant</em>'.
   * @generated
   */
  ClassConstant createClassConstant();

  /**
   * Returns a new object of class '<em>Qualified Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name Or Wildcard</em>'.
   * @generated
   */
  QualifiedNameOrWildcard createQualifiedNameOrWildcard();

  /**
   * Returns a new object of class '<em>Qualified Name Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name Wildcard</em>'.
   * @generated
   */
  QualifiedNameWildcard createQualifiedNameWildcard();

  /**
   * Returns a new object of class '<em>Null Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Constant</em>'.
   * @generated
   */
  NullConstant createNullConstant();

  /**
   * Returns a new object of class '<em>Numeric Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Constant</em>'.
   * @generated
   */
  NumericConstant createNumericConstant();

  /**
   * Returns a new object of class '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Constant</em>'.
   * @generated
   */
  IntConstant createIntConstant();

  /**
   * Returns a new object of class '<em>Long Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long Constant</em>'.
   * @generated
   */
  LongConstant createLongConstant();

  /**
   * Returns a new object of class '<em>Double Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Constant</em>'.
   * @generated
   */
  DoubleConstant createDoubleConstant();

  /**
   * Returns a new object of class '<em>Float Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Constant</em>'.
   * @generated
   */
  FloatConstant createFloatConstant();

  /**
   * Returns a new object of class '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant</em>'.
   * @generated
   */
  StringConstant createStringConstant();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns a new object of class '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard</em>'.
   * @generated
   */
  Wildcard createWildcard();

  /**
   * Returns a new object of class '<em>Wildcard Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Name</em>'.
   * @generated
   */
  WildcardName createWildcardName();

  /**
   * Returns a new object of class '<em>Wildcard Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Expression</em>'.
   * @generated
   */
  WildcardExpression createWildcardExpression();

  /**
   * Returns a new object of class '<em>Wildcard Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Conditional Or Expression</em>'.
   * @generated
   */
  WildcardConditionalOrExpression createWildcardConditionalOrExpression();

  /**
   * Returns a new object of class '<em>Wildcard Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Conditional And Expression</em>'.
   * @generated
   */
  WildcardConditionalAndExpression createWildcardConditionalAndExpression();

  /**
   * Returns a new object of class '<em>Wildcard Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Equality Expression</em>'.
   * @generated
   */
  WildcardEqualityExpression createWildcardEqualityExpression();

  /**
   * Returns a new object of class '<em>Wildcard Instance Of Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Instance Of Expression</em>'.
   * @generated
   */
  WildcardInstanceOfExpression createWildcardInstanceOfExpression();

  /**
   * Returns a new object of class '<em>Wildcard Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Relational Expression</em>'.
   * @generated
   */
  WildcardRelationalExpression createWildcardRelationalExpression();

  /**
   * Returns a new object of class '<em>Wildcard Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Additive Expression</em>'.
   * @generated
   */
  WildcardAdditiveExpression createWildcardAdditiveExpression();

  /**
   * Returns a new object of class '<em>Wildcard Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Multiplicative Expression</em>'.
   * @generated
   */
  WildcardMultiplicativeExpression createWildcardMultiplicativeExpression();

  /**
   * Returns a new object of class '<em>Wildcard Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Unary Expression</em>'.
   * @generated
   */
  WildcardUnaryExpression createWildcardUnaryExpression();

  /**
   * Returns a new object of class '<em>Wildcard Unary Expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Unary Expression Not Plus Minus</em>'.
   * @generated
   */
  WildcardUnaryExpressionNotPlusMinus createWildcardUnaryExpressionNotPlusMinus();

  /**
   * Returns a new object of class '<em>Wildcard Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Primary</em>'.
   * @generated
   */
  WildcardPrimary createWildcardPrimary();

  /**
   * Returns a new object of class '<em>Wildcard Par Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Par Expression</em>'.
   * @generated
   */
  WildcardParExpression createWildcardParExpression();

  /**
   * Returns a new object of class '<em>Wildcard Class Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Class Literal</em>'.
   * @generated
   */
  WildcardClassLiteral createWildcardClassLiteral();

  /**
   * Returns a new object of class '<em>Wildcard Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Type</em>'.
   * @generated
   */
  WildcardType createWildcardType();

  /**
   * Returns a new object of class '<em>Wildcard Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Primitive Type</em>'.
   * @generated
   */
  WildcardPrimitiveType createWildcardPrimitiveType();

  /**
   * Returns a new object of class '<em>Wildcard Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Literal</em>'.
   * @generated
   */
  WildcardLiteral createWildcardLiteral();

  /**
   * Returns a new object of class '<em>Wildcard Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Boolean</em>'.
   * @generated
   */
  WildcardBoolean createWildcardBoolean();

  /**
   * Returns a new object of class '<em>Wildcard Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Int</em>'.
   * @generated
   */
  WildcardInt createWildcardInt();

  /**
   * Returns a new object of class '<em>Wildcard Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Null</em>'.
   * @generated
   */
  WildcardNull createWildcardNull();

  /**
   * Returns a new object of class '<em>Wildcard String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard String</em>'.
   * @generated
   */
  WildcardString createWildcardString();

  /**
   * Returns a new object of class '<em>Wildcard New</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard New</em>'.
   * @generated
   */
  WildcardNew createWildcardNew();

  /**
   * Returns a new object of class '<em>Wildcard QName</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard QName</em>'.
   * @generated
   */
  WildcardQName createWildcardQName();

  /**
   * Returns a new object of class '<em>Wildcard Dereference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Dereference</em>'.
   * @generated
   */
  WildcardDereference createWildcardDereference();

  /**
   * Returns a new object of class '<em>Wildcard Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Call</em>'.
   * @generated
   */
  WildcardCall createWildcardCall();

  /**
   * Returns a new object of class '<em>Wildcard Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Field</em>'.
   * @generated
   */
  WildcardField createWildcardField();

  /**
   * Returns a new object of class '<em>Wildcard Char</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Char</em>'.
   * @generated
   */
  WildcardChar createWildcardChar();

  /**
   * Returns a new object of class '<em>Wildcard Byte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Byte</em>'.
   * @generated
   */
  WildcardByte createWildcardByte();

  /**
   * Returns a new object of class '<em>Wildcard Short</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Short</em>'.
   * @generated
   */
  WildcardShort createWildcardShort();

  /**
   * Returns a new object of class '<em>Wildcard Long</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Long</em>'.
   * @generated
   */
  WildcardLong createWildcardLong();

  /**
   * Returns a new object of class '<em>Wildcard Float</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Float</em>'.
   * @generated
   */
  WildcardFloat createWildcardFloat();

  /**
   * Returns a new object of class '<em>Wildcard Double</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Double</em>'.
   * @generated
   */
  WildcardDouble createWildcardDouble();

  /**
   * Returns a new object of class '<em>Wildcard Void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Void</em>'.
   * @generated
   */
  WildcardVoid createWildcardVoid();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TransformationLanguagePackage getTransformationLanguagePackage();

} //TransformationLanguageFactory
