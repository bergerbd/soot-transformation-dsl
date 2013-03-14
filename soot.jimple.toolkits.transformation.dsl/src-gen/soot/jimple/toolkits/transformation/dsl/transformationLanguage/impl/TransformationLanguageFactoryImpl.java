/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationLanguageFactoryImpl extends EFactoryImpl implements TransformationLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TransformationLanguageFactory init()
  {
    try
    {
      TransformationLanguageFactory theTransformationLanguageFactory = (TransformationLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.informatik.uni-bremen.de/st/soot/TransformationLanguage"); 
      if (theTransformationLanguageFactory != null)
      {
        return theTransformationLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TransformationLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TransformationLanguagePackage.TRANSFORMATION: return createTransformation();
      case TransformationLanguagePackage.PATTERN: return createPattern();
      case TransformationLanguagePackage.SEQUENCE_PATTERN: return createSequencePattern();
      case TransformationLanguagePackage.METHOD_PATTERN: return createMethodPattern();
      case TransformationLanguagePackage.TYPE_PATTERN: return createTypePattern();
      case TransformationLanguagePackage.REPLACEMENT: return createReplacement();
      case TransformationLanguagePackage.TYPE: return createType();
      case TransformationLanguagePackage.FIELD: return createField();
      case TransformationLanguagePackage.METHOD: return createMethod();
      case TransformationLanguagePackage.BODY: return createBody();
      case TransformationLanguagePackage.STATEMENT_SEQUENCE: return createStatementSequence();
      case TransformationLanguagePackage.DECLARATION: return createDeclaration();
      case TransformationLanguagePackage.LABEL_OR_STATEMENT: return createLabelOrStatement();
      case TransformationLanguagePackage.STATEMENT: return createStatement();
      case TransformationLanguagePackage.LABEL: return createLabel();
      case TransformationLanguagePackage.BREAKPOINT_STMT: return createBreakpointStmt();
      case TransformationLanguagePackage.DEFINITION_STMT: return createDefinitionStmt();
      case TransformationLanguagePackage.ASSIGN_STMT: return createAssignStmt();
      case TransformationLanguagePackage.IDENTITY_STMT: return createIdentityStmt();
      case TransformationLanguagePackage.GOTO_STMT: return createGotoStmt();
      case TransformationLanguagePackage.IF_STMT: return createIfStmt();
      case TransformationLanguagePackage.INVOKE_STMT: return createInvokeStmt();
      case TransformationLanguagePackage.TABLE_SWITCH_STMT: return createTableSwitchStmt();
      case TransformationLanguagePackage.LOOKUP_SWITCH_STMT: return createLookupSwitchStmt();
      case TransformationLanguagePackage.MONITOR_STMT: return createMonitorStmt();
      case TransformationLanguagePackage.ENTER_MONITOR_STMT: return createEnterMonitorStmt();
      case TransformationLanguagePackage.EXIT_MONITOR_STMT: return createExitMonitorStmt();
      case TransformationLanguagePackage.NOP_STMT: return createNopStmt();
      case TransformationLanguagePackage.RET_STMT: return createRetStmt();
      case TransformationLanguagePackage.RETURN_VOID_STMT: return createReturnVoidStmt();
      case TransformationLanguagePackage.RETURN_STMT: return createReturnStmt();
      case TransformationLanguagePackage.CASE: return createCase();
      case TransformationLanguagePackage.THROW_STMT: return createThrowStmt();
      case TransformationLanguagePackage.VALUE: return createValue();
      case TransformationLanguagePackage.NON_EXPR: return createNonExpr();
      case TransformationLanguagePackage.EXPR: return createExpr();
      case TransformationLanguagePackage.ANY_NEW_EXPR: return createAnyNewExpr();
      case TransformationLanguagePackage.BIN_OP_EXPR: return createBinOpExpr();
      case TransformationLanguagePackage.ADD_EXPR: return createAddExpr();
      case TransformationLanguagePackage.AND_EXPR: return createAndExpr();
      case TransformationLanguagePackage.CMP_EXPR: return createCmpExpr();
      case TransformationLanguagePackage.CMPG_EXPR: return createCmpgExpr();
      case TransformationLanguagePackage.CMPL_EXPR: return createCmplExpr();
      case TransformationLanguagePackage.CONDITIONAL_EXPR: return createConditionalExpr();
      case TransformationLanguagePackage.DIV_EXPR: return createDivExpr();
      case TransformationLanguagePackage.MUL_EXPR: return createMulExpr();
      case TransformationLanguagePackage.OR_EXPR: return createOrExpr();
      case TransformationLanguagePackage.REM_EXPR: return createRemExpr();
      case TransformationLanguagePackage.SHL_EXPR: return createShlExpr();
      case TransformationLanguagePackage.SHR_EXPR: return createShrExpr();
      case TransformationLanguagePackage.SUB_EXPR: return createSubExpr();
      case TransformationLanguagePackage.USHR_EXPR: return createUshrExpr();
      case TransformationLanguagePackage.XOR_EXPR: return createXorExpr();
      case TransformationLanguagePackage.EQ_EXPR: return createEqExpr();
      case TransformationLanguagePackage.GE_EXPR: return createGeExpr();
      case TransformationLanguagePackage.GT_EXPR: return createGtExpr();
      case TransformationLanguagePackage.LE_EXPR: return createLeExpr();
      case TransformationLanguagePackage.LT_EXPR: return createLtExpr();
      case TransformationLanguagePackage.NE_EXPR: return createNeExpr();
      case TransformationLanguagePackage.CAST_EXPR: return createCastExpr();
      case TransformationLanguagePackage.INSTANCE_OF_EXPR: return createInstanceOfExpr();
      case TransformationLanguagePackage.SOOT_METHOD_REF: return createSootMethodRef();
      case TransformationLanguagePackage.INVOKE_EXPR: return createInvokeExpr();
      case TransformationLanguagePackage.INSTANCE_INVOKE_EXPR: return createInstanceInvokeExpr();
      case TransformationLanguagePackage.STATIC_INVOKE_EXPR: return createStaticInvokeExpr();
      case TransformationLanguagePackage.INTERFACE_INVOKE_EXPR: return createInterfaceInvokeExpr();
      case TransformationLanguagePackage.SPECIAL_INVOKE_EXPR: return createSpecialInvokeExpr();
      case TransformationLanguagePackage.VIRTUAL_INVOKE_EXPR: return createVirtualInvokeExpr();
      case TransformationLanguagePackage.LOCAL_OR_WILDCARD: return createLocalOrWildcard();
      case TransformationLanguagePackage.WILDCARD: return createWildcard();
      case TransformationLanguagePackage.NEW_ARRAY_EXPR: return createNewArrayExpr();
      case TransformationLanguagePackage.NEW_EXPR: return createNewExpr();
      case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR: return createNewMultiArrayExpr();
      case TransformationLanguagePackage.DIMENSION: return createDimension();
      case TransformationLanguagePackage.UNOP_EXPR: return createUnopExpr();
      case TransformationLanguagePackage.LENGTH_EXPR: return createLengthExpr();
      case TransformationLanguagePackage.NEG_EXPR: return createNegExpr();
      case TransformationLanguagePackage.LOCAL: return createLocal();
      case TransformationLanguagePackage.REF: return createRef();
      case TransformationLanguagePackage.IDENTITY_REF: return createIdentityRef();
      case TransformationLanguagePackage.PARAMETER_REF: return createParameterRef();
      case TransformationLanguagePackage.THIS_REF: return createThisRef();
      case TransformationLanguagePackage.CAUGHT_EXCEPTION_REF: return createCaughtExceptionRef();
      case TransformationLanguagePackage.CONCRETE_REF: return createConcreteRef();
      case TransformationLanguagePackage.ARRAY_REF: return createArrayRef();
      case TransformationLanguagePackage.FIELD_REF: return createFieldRef();
      case TransformationLanguagePackage.STATIC_FIELD_REF: return createStaticFieldRef();
      case TransformationLanguagePackage.SOOT_FIELD_REF: return createSootFieldRef();
      case TransformationLanguagePackage.INSTANCE_FIELD_REF: return createInstanceFieldRef();
      case TransformationLanguagePackage.CONSTANT: return createConstant();
      case TransformationLanguagePackage.CLASS_CONSTANT: return createClassConstant();
      case TransformationLanguagePackage.QUALIFIED_NAME_OR_WILDCARD: return createQualifiedNameOrWildcard();
      case TransformationLanguagePackage.QUALIFIED_NAME_WILDCARD: return createQualifiedNameWildcard();
      case TransformationLanguagePackage.NULL_CONSTANT: return createNullConstant();
      case TransformationLanguagePackage.NUMERIC_CONSTANT: return createNumericConstant();
      case TransformationLanguagePackage.INT_CONSTANT: return createIntConstant();
      case TransformationLanguagePackage.LONG_CONSTANT: return createLongConstant();
      case TransformationLanguagePackage.DOUBLE_CONSTANT: return createDoubleConstant();
      case TransformationLanguagePackage.FLOAT_CONSTANT: return createFloatConstant();
      case TransformationLanguagePackage.STRING_CONSTANT: return createStringConstant();
      case TransformationLanguagePackage.QUALIFIED_NAME: return createQualifiedName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TransformationLanguagePackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TransformationLanguagePackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transformation createTransformation()
  {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequencePattern createSequencePattern()
  {
    SequencePatternImpl sequencePattern = new SequencePatternImpl();
    return sequencePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodPattern createMethodPattern()
  {
    MethodPatternImpl methodPattern = new MethodPatternImpl();
    return methodPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePattern createTypePattern()
  {
    TypePatternImpl typePattern = new TypePatternImpl();
    return typePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Replacement createReplacement()
  {
    ReplacementImpl replacement = new ReplacementImpl();
    return replacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementSequence createStatementSequence()
  {
    StatementSequenceImpl statementSequence = new StatementSequenceImpl();
    return statementSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelOrStatement createLabelOrStatement()
  {
    LabelOrStatementImpl labelOrStatement = new LabelOrStatementImpl();
    return labelOrStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakpointStmt createBreakpointStmt()
  {
    BreakpointStmtImpl breakpointStmt = new BreakpointStmtImpl();
    return breakpointStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionStmt createDefinitionStmt()
  {
    DefinitionStmtImpl definitionStmt = new DefinitionStmtImpl();
    return definitionStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignStmt createAssignStmt()
  {
    AssignStmtImpl assignStmt = new AssignStmtImpl();
    return assignStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityStmt createIdentityStmt()
  {
    IdentityStmtImpl identityStmt = new IdentityStmtImpl();
    return identityStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoStmt createGotoStmt()
  {
    GotoStmtImpl gotoStmt = new GotoStmtImpl();
    return gotoStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStmt createIfStmt()
  {
    IfStmtImpl ifStmt = new IfStmtImpl();
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokeStmt createInvokeStmt()
  {
    InvokeStmtImpl invokeStmt = new InvokeStmtImpl();
    return invokeStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableSwitchStmt createTableSwitchStmt()
  {
    TableSwitchStmtImpl tableSwitchStmt = new TableSwitchStmtImpl();
    return tableSwitchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupSwitchStmt createLookupSwitchStmt()
  {
    LookupSwitchStmtImpl lookupSwitchStmt = new LookupSwitchStmtImpl();
    return lookupSwitchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitorStmt createMonitorStmt()
  {
    MonitorStmtImpl monitorStmt = new MonitorStmtImpl();
    return monitorStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnterMonitorStmt createEnterMonitorStmt()
  {
    EnterMonitorStmtImpl enterMonitorStmt = new EnterMonitorStmtImpl();
    return enterMonitorStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitMonitorStmt createExitMonitorStmt()
  {
    ExitMonitorStmtImpl exitMonitorStmt = new ExitMonitorStmtImpl();
    return exitMonitorStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NopStmt createNopStmt()
  {
    NopStmtImpl nopStmt = new NopStmtImpl();
    return nopStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetStmt createRetStmt()
  {
    RetStmtImpl retStmt = new RetStmtImpl();
    return retStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnVoidStmt createReturnVoidStmt()
  {
    ReturnVoidStmtImpl returnVoidStmt = new ReturnVoidStmtImpl();
    return returnVoidStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStmt createReturnStmt()
  {
    ReturnStmtImpl returnStmt = new ReturnStmtImpl();
    return returnStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThrowStmt createThrowStmt()
  {
    ThrowStmtImpl throwStmt = new ThrowStmtImpl();
    return throwStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonExpr createNonExpr()
  {
    NonExprImpl nonExpr = new NonExprImpl();
    return nonExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyNewExpr createAnyNewExpr()
  {
    AnyNewExprImpl anyNewExpr = new AnyNewExprImpl();
    return anyNewExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinOpExpr createBinOpExpr()
  {
    BinOpExprImpl binOpExpr = new BinOpExprImpl();
    return binOpExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddExpr createAddExpr()
  {
    AddExprImpl addExpr = new AddExprImpl();
    return addExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpr createAndExpr()
  {
    AndExprImpl andExpr = new AndExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmpExpr createCmpExpr()
  {
    CmpExprImpl cmpExpr = new CmpExprImpl();
    return cmpExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmpgExpr createCmpgExpr()
  {
    CmpgExprImpl cmpgExpr = new CmpgExprImpl();
    return cmpgExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmplExpr createCmplExpr()
  {
    CmplExprImpl cmplExpr = new CmplExprImpl();
    return cmplExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpr createConditionalExpr()
  {
    ConditionalExprImpl conditionalExpr = new ConditionalExprImpl();
    return conditionalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivExpr createDivExpr()
  {
    DivExprImpl divExpr = new DivExprImpl();
    return divExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulExpr createMulExpr()
  {
    MulExprImpl mulExpr = new MulExprImpl();
    return mulExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpr createOrExpr()
  {
    OrExprImpl orExpr = new OrExprImpl();
    return orExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemExpr createRemExpr()
  {
    RemExprImpl remExpr = new RemExprImpl();
    return remExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShlExpr createShlExpr()
  {
    ShlExprImpl shlExpr = new ShlExprImpl();
    return shlExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShrExpr createShrExpr()
  {
    ShrExprImpl shrExpr = new ShrExprImpl();
    return shrExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubExpr createSubExpr()
  {
    SubExprImpl subExpr = new SubExprImpl();
    return subExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UshrExpr createUshrExpr()
  {
    UshrExprImpl ushrExpr = new UshrExprImpl();
    return ushrExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XorExpr createXorExpr()
  {
    XorExprImpl xorExpr = new XorExprImpl();
    return xorExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqExpr createEqExpr()
  {
    EqExprImpl eqExpr = new EqExprImpl();
    return eqExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeExpr createGeExpr()
  {
    GeExprImpl geExpr = new GeExprImpl();
    return geExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GtExpr createGtExpr()
  {
    GtExprImpl gtExpr = new GtExprImpl();
    return gtExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeExpr createLeExpr()
  {
    LeExprImpl leExpr = new LeExprImpl();
    return leExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LtExpr createLtExpr()
  {
    LtExprImpl ltExpr = new LtExprImpl();
    return ltExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeExpr createNeExpr()
  {
    NeExprImpl neExpr = new NeExprImpl();
    return neExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpr createCastExpr()
  {
    CastExprImpl castExpr = new CastExprImpl();
    return castExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOfExpr createInstanceOfExpr()
  {
    InstanceOfExprImpl instanceOfExpr = new InstanceOfExprImpl();
    return instanceOfExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SootMethodRef createSootMethodRef()
  {
    SootMethodRefImpl sootMethodRef = new SootMethodRefImpl();
    return sootMethodRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokeExpr createInvokeExpr()
  {
    InvokeExprImpl invokeExpr = new InvokeExprImpl();
    return invokeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceInvokeExpr createInstanceInvokeExpr()
  {
    InstanceInvokeExprImpl instanceInvokeExpr = new InstanceInvokeExprImpl();
    return instanceInvokeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticInvokeExpr createStaticInvokeExpr()
  {
    StaticInvokeExprImpl staticInvokeExpr = new StaticInvokeExprImpl();
    return staticInvokeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceInvokeExpr createInterfaceInvokeExpr()
  {
    InterfaceInvokeExprImpl interfaceInvokeExpr = new InterfaceInvokeExprImpl();
    return interfaceInvokeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecialInvokeExpr createSpecialInvokeExpr()
  {
    SpecialInvokeExprImpl specialInvokeExpr = new SpecialInvokeExprImpl();
    return specialInvokeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualInvokeExpr createVirtualInvokeExpr()
  {
    VirtualInvokeExprImpl virtualInvokeExpr = new VirtualInvokeExprImpl();
    return virtualInvokeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalOrWildcard createLocalOrWildcard()
  {
    LocalOrWildcardImpl localOrWildcard = new LocalOrWildcardImpl();
    return localOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wildcard createWildcard()
  {
    WildcardImpl wildcard = new WildcardImpl();
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewArrayExpr createNewArrayExpr()
  {
    NewArrayExprImpl newArrayExpr = new NewArrayExprImpl();
    return newArrayExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewExpr createNewExpr()
  {
    NewExprImpl newExpr = new NewExprImpl();
    return newExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewMultiArrayExpr createNewMultiArrayExpr()
  {
    NewMultiArrayExprImpl newMultiArrayExpr = new NewMultiArrayExprImpl();
    return newMultiArrayExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dimension createDimension()
  {
    DimensionImpl dimension = new DimensionImpl();
    return dimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnopExpr createUnopExpr()
  {
    UnopExprImpl unopExpr = new UnopExprImpl();
    return unopExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthExpr createLengthExpr()
  {
    LengthExprImpl lengthExpr = new LengthExprImpl();
    return lengthExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegExpr createNegExpr()
  {
    NegExprImpl negExpr = new NegExprImpl();
    return negExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Local createLocal()
  {
    LocalImpl local = new LocalImpl();
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref createRef()
  {
    RefImpl ref = new RefImpl();
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityRef createIdentityRef()
  {
    IdentityRefImpl identityRef = new IdentityRefImpl();
    return identityRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterRef createParameterRef()
  {
    ParameterRefImpl parameterRef = new ParameterRefImpl();
    return parameterRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThisRef createThisRef()
  {
    ThisRefImpl thisRef = new ThisRefImpl();
    return thisRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaughtExceptionRef createCaughtExceptionRef()
  {
    CaughtExceptionRefImpl caughtExceptionRef = new CaughtExceptionRefImpl();
    return caughtExceptionRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteRef createConcreteRef()
  {
    ConcreteRefImpl concreteRef = new ConcreteRefImpl();
    return concreteRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayRef createArrayRef()
  {
    ArrayRefImpl arrayRef = new ArrayRefImpl();
    return arrayRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldRef createFieldRef()
  {
    FieldRefImpl fieldRef = new FieldRefImpl();
    return fieldRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticFieldRef createStaticFieldRef()
  {
    StaticFieldRefImpl staticFieldRef = new StaticFieldRefImpl();
    return staticFieldRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SootFieldRef createSootFieldRef()
  {
    SootFieldRefImpl sootFieldRef = new SootFieldRefImpl();
    return sootFieldRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceFieldRef createInstanceFieldRef()
  {
    InstanceFieldRefImpl instanceFieldRef = new InstanceFieldRefImpl();
    return instanceFieldRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassConstant createClassConstant()
  {
    ClassConstantImpl classConstant = new ClassConstantImpl();
    return classConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedNameOrWildcard createQualifiedNameOrWildcard()
  {
    QualifiedNameOrWildcardImpl qualifiedNameOrWildcard = new QualifiedNameOrWildcardImpl();
    return qualifiedNameOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedNameWildcard createQualifiedNameWildcard()
  {
    QualifiedNameWildcardImpl qualifiedNameWildcard = new QualifiedNameWildcardImpl();
    return qualifiedNameWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullConstant createNullConstant()
  {
    NullConstantImpl nullConstant = new NullConstantImpl();
    return nullConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericConstant createNumericConstant()
  {
    NumericConstantImpl numericConstant = new NumericConstantImpl();
    return numericConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongConstant createLongConstant()
  {
    LongConstantImpl longConstant = new LongConstantImpl();
    return longConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleConstant createDoubleConstant()
  {
    DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
    return doubleConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatConstant createFloatConstant()
  {
    FloatConstantImpl floatConstant = new FloatConstantImpl();
    return floatConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationLanguagePackage getTransformationLanguagePackage()
  {
    return (TransformationLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TransformationLanguagePackage getPackage()
  {
    return TransformationLanguagePackage.eINSTANCE;
  }

} //TransformationLanguageFactoryImpl
