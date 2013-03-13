/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import soot.jimple.toolkits.transformation.dsl.transformationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage
 * @generated
 */
public class TransformationLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TransformationLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TransformationLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformationLanguageSwitch<Adapter> modelSwitch =
    new TransformationLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseTransformation(Transformation object)
      {
        return createTransformationAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter caseSequencePattern(SequencePattern object)
      {
        return createSequencePatternAdapter();
      }
      @Override
      public Adapter caseMethodPattern(MethodPattern object)
      {
        return createMethodPatternAdapter();
      }
      @Override
      public Adapter caseTypePattern(TypePattern object)
      {
        return createTypePatternAdapter();
      }
      @Override
      public Adapter caseReplacement(Replacement object)
      {
        return createReplacementAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseStatementSequence(StatementSequence object)
      {
        return createStatementSequenceAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseLabelOrStatement(LabelOrStatement object)
      {
        return createLabelOrStatementAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseBreakpointStmt(BreakpointStmt object)
      {
        return createBreakpointStmtAdapter();
      }
      @Override
      public Adapter caseDefinitionStmt(DefinitionStmt object)
      {
        return createDefinitionStmtAdapter();
      }
      @Override
      public Adapter caseAssignStmt(AssignStmt object)
      {
        return createAssignStmtAdapter();
      }
      @Override
      public Adapter caseIdentityStmt(IdentityStmt object)
      {
        return createIdentityStmtAdapter();
      }
      @Override
      public Adapter caseGotoStmt(GotoStmt object)
      {
        return createGotoStmtAdapter();
      }
      @Override
      public Adapter caseIfStmt(IfStmt object)
      {
        return createIfStmtAdapter();
      }
      @Override
      public Adapter caseInvokeStmt(InvokeStmt object)
      {
        return createInvokeStmtAdapter();
      }
      @Override
      public Adapter caseTableSwitchStmt(TableSwitchStmt object)
      {
        return createTableSwitchStmtAdapter();
      }
      @Override
      public Adapter caseLookupSwitchStmt(LookupSwitchStmt object)
      {
        return createLookupSwitchStmtAdapter();
      }
      @Override
      public Adapter caseMonitorStmt(MonitorStmt object)
      {
        return createMonitorStmtAdapter();
      }
      @Override
      public Adapter caseEnterMonitorStmt(EnterMonitorStmt object)
      {
        return createEnterMonitorStmtAdapter();
      }
      @Override
      public Adapter caseExitMonitorStmt(ExitMonitorStmt object)
      {
        return createExitMonitorStmtAdapter();
      }
      @Override
      public Adapter caseNopStmt(NopStmt object)
      {
        return createNopStmtAdapter();
      }
      @Override
      public Adapter caseRetStmt(RetStmt object)
      {
        return createRetStmtAdapter();
      }
      @Override
      public Adapter caseReturnVoidStmt(ReturnVoidStmt object)
      {
        return createReturnVoidStmtAdapter();
      }
      @Override
      public Adapter caseReturnStmt(ReturnStmt object)
      {
        return createReturnStmtAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseThrowStmt(ThrowStmt object)
      {
        return createThrowStmtAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseNonExpr(NonExpr object)
      {
        return createNonExprAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseAnyNewExpr(AnyNewExpr object)
      {
        return createAnyNewExprAdapter();
      }
      @Override
      public Adapter caseBinOpExpr(BinOpExpr object)
      {
        return createBinOpExprAdapter();
      }
      @Override
      public Adapter caseAddExpr(AddExpr object)
      {
        return createAddExprAdapter();
      }
      @Override
      public Adapter caseAndExpr(AndExpr object)
      {
        return createAndExprAdapter();
      }
      @Override
      public Adapter caseCmpExpr(CmpExpr object)
      {
        return createCmpExprAdapter();
      }
      @Override
      public Adapter caseCmpgExpr(CmpgExpr object)
      {
        return createCmpgExprAdapter();
      }
      @Override
      public Adapter caseCmplExpr(CmplExpr object)
      {
        return createCmplExprAdapter();
      }
      @Override
      public Adapter caseConditionalExpr(ConditionalExpr object)
      {
        return createConditionalExprAdapter();
      }
      @Override
      public Adapter caseDivExpr(DivExpr object)
      {
        return createDivExprAdapter();
      }
      @Override
      public Adapter caseMulExpr(MulExpr object)
      {
        return createMulExprAdapter();
      }
      @Override
      public Adapter caseOrExpr(OrExpr object)
      {
        return createOrExprAdapter();
      }
      @Override
      public Adapter caseRemExpr(RemExpr object)
      {
        return createRemExprAdapter();
      }
      @Override
      public Adapter caseShlExpr(ShlExpr object)
      {
        return createShlExprAdapter();
      }
      @Override
      public Adapter caseShrExpr(ShrExpr object)
      {
        return createShrExprAdapter();
      }
      @Override
      public Adapter caseSubExpr(SubExpr object)
      {
        return createSubExprAdapter();
      }
      @Override
      public Adapter caseUshrExpr(UshrExpr object)
      {
        return createUshrExprAdapter();
      }
      @Override
      public Adapter caseXorExpr(XorExpr object)
      {
        return createXorExprAdapter();
      }
      @Override
      public Adapter caseEqExpr(EqExpr object)
      {
        return createEqExprAdapter();
      }
      @Override
      public Adapter caseGeExpr(GeExpr object)
      {
        return createGeExprAdapter();
      }
      @Override
      public Adapter caseGtExpr(GtExpr object)
      {
        return createGtExprAdapter();
      }
      @Override
      public Adapter caseLeExpr(LeExpr object)
      {
        return createLeExprAdapter();
      }
      @Override
      public Adapter caseLtExpr(LtExpr object)
      {
        return createLtExprAdapter();
      }
      @Override
      public Adapter caseNeExpr(NeExpr object)
      {
        return createNeExprAdapter();
      }
      @Override
      public Adapter caseCastExpr(CastExpr object)
      {
        return createCastExprAdapter();
      }
      @Override
      public Adapter caseInstanceOfExpr(InstanceOfExpr object)
      {
        return createInstanceOfExprAdapter();
      }
      @Override
      public Adapter caseSootMethodRef(SootMethodRef object)
      {
        return createSootMethodRefAdapter();
      }
      @Override
      public Adapter caseInvokeExpr(InvokeExpr object)
      {
        return createInvokeExprAdapter();
      }
      @Override
      public Adapter caseInstanceInvokeExpr(InstanceInvokeExpr object)
      {
        return createInstanceInvokeExprAdapter();
      }
      @Override
      public Adapter caseStaticInvokeExpr(StaticInvokeExpr object)
      {
        return createStaticInvokeExprAdapter();
      }
      @Override
      public Adapter caseInterfaceInvokeExpr(InterfaceInvokeExpr object)
      {
        return createInterfaceInvokeExprAdapter();
      }
      @Override
      public Adapter caseSpecialInvokeExpr(SpecialInvokeExpr object)
      {
        return createSpecialInvokeExprAdapter();
      }
      @Override
      public Adapter caseVirtualInvokeExpr(VirtualInvokeExpr object)
      {
        return createVirtualInvokeExprAdapter();
      }
      @Override
      public Adapter caseLocalOrWildcard(LocalOrWildcard object)
      {
        return createLocalOrWildcardAdapter();
      }
      @Override
      public Adapter caseWildcard(Wildcard object)
      {
        return createWildcardAdapter();
      }
      @Override
      public Adapter caseNewArrayExpr(NewArrayExpr object)
      {
        return createNewArrayExprAdapter();
      }
      @Override
      public Adapter caseNewExpr(NewExpr object)
      {
        return createNewExprAdapter();
      }
      @Override
      public Adapter caseNewMultiArrayExpr(NewMultiArrayExpr object)
      {
        return createNewMultiArrayExprAdapter();
      }
      @Override
      public Adapter caseDimension(Dimension object)
      {
        return createDimensionAdapter();
      }
      @Override
      public Adapter caseUnopExpr(UnopExpr object)
      {
        return createUnopExprAdapter();
      }
      @Override
      public Adapter caseLengthExpr(LengthExpr object)
      {
        return createLengthExprAdapter();
      }
      @Override
      public Adapter caseNegExpr(NegExpr object)
      {
        return createNegExprAdapter();
      }
      @Override
      public Adapter caseLocal(Local object)
      {
        return createLocalAdapter();
      }
      @Override
      public Adapter caseRef(Ref object)
      {
        return createRefAdapter();
      }
      @Override
      public Adapter caseIdentityRef(IdentityRef object)
      {
        return createIdentityRefAdapter();
      }
      @Override
      public Adapter caseParameterRef(ParameterRef object)
      {
        return createParameterRefAdapter();
      }
      @Override
      public Adapter caseThisRef(ThisRef object)
      {
        return createThisRefAdapter();
      }
      @Override
      public Adapter caseCaughtExceptionRef(CaughtExceptionRef object)
      {
        return createCaughtExceptionRefAdapter();
      }
      @Override
      public Adapter caseConcreteRef(ConcreteRef object)
      {
        return createConcreteRefAdapter();
      }
      @Override
      public Adapter caseArrayRef(ArrayRef object)
      {
        return createArrayRefAdapter();
      }
      @Override
      public Adapter caseFieldRef(FieldRef object)
      {
        return createFieldRefAdapter();
      }
      @Override
      public Adapter caseStaticFieldRef(StaticFieldRef object)
      {
        return createStaticFieldRefAdapter();
      }
      @Override
      public Adapter caseSootFieldRef(SootFieldRef object)
      {
        return createSootFieldRefAdapter();
      }
      @Override
      public Adapter caseInstanceFieldRef(InstanceFieldRef object)
      {
        return createInstanceFieldRefAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseClassConstant(ClassConstant object)
      {
        return createClassConstantAdapter();
      }
      @Override
      public Adapter caseNullConstant(NullConstant object)
      {
        return createNullConstantAdapter();
      }
      @Override
      public Adapter caseNumericConstant(NumericConstant object)
      {
        return createNumericConstantAdapter();
      }
      @Override
      public Adapter caseIntConstant(IntConstant object)
      {
        return createIntConstantAdapter();
      }
      @Override
      public Adapter caseLongConstant(LongConstant object)
      {
        return createLongConstantAdapter();
      }
      @Override
      public Adapter caseDoubleConstant(DoubleConstant object)
      {
        return createDoubleConstantAdapter();
      }
      @Override
      public Adapter caseFloatConstant(FloatConstant object)
      {
        return createFloatConstantAdapter();
      }
      @Override
      public Adapter caseStringConstant(StringConstant object)
      {
        return createStringConstantAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation
   * @generated
   */
  public Adapter createTransformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern <em>Sequence Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern
   * @generated
   */
  public Adapter createSequencePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern <em>Method Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern
   * @generated
   */
  public Adapter createMethodPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern <em>Type Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern
   * @generated
   */
  public Adapter createTypePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement
   * @generated
   */
  public Adapter createReplacementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence
   * @generated
   */
  public Adapter createStatementSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LabelOrStatement <em>Label Or Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LabelOrStatement
   * @generated
   */
  public Adapter createLabelOrStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BreakpointStmt <em>Breakpoint Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.BreakpointStmt
   * @generated
   */
  public Adapter createBreakpointStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.DefinitionStmt <em>Definition Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.DefinitionStmt
   * @generated
   */
  public Adapter createDefinitionStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt <em>Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt
   * @generated
   */
  public Adapter createAssignStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt <em>Identity Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt
   * @generated
   */
  public Adapter createIdentityStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt <em>Goto Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt
   * @generated
   */
  public Adapter createGotoStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt <em>If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt
   * @generated
   */
  public Adapter createIfStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt <em>Invoke Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt
   * @generated
   */
  public Adapter createInvokeStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt <em>Table Switch Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt
   * @generated
   */
  public Adapter createTableSwitchStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LookupSwitchStmt <em>Lookup Switch Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LookupSwitchStmt
   * @generated
   */
  public Adapter createLookupSwitchStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MonitorStmt <em>Monitor Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MonitorStmt
   * @generated
   */
  public Adapter createMonitorStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.EnterMonitorStmt <em>Enter Monitor Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.EnterMonitorStmt
   * @generated
   */
  public Adapter createEnterMonitorStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ExitMonitorStmt <em>Exit Monitor Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ExitMonitorStmt
   * @generated
   */
  public Adapter createExitMonitorStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NopStmt <em>Nop Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NopStmt
   * @generated
   */
  public Adapter createNopStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.RetStmt <em>Ret Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.RetStmt
   * @generated
   */
  public Adapter createRetStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnVoidStmt <em>Return Void Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnVoidStmt
   * @generated
   */
  public Adapter createReturnVoidStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnStmt <em>Return Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnStmt
   * @generated
   */
  public Adapter createReturnStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt <em>Throw Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt
   * @generated
   */
  public Adapter createThrowStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NonExpr <em>Non Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NonExpr
   * @generated
   */
  public Adapter createNonExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AnyNewExpr <em>Any New Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AnyNewExpr
   * @generated
   */
  public Adapter createAnyNewExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr <em>Bin Op Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr
   * @generated
   */
  public Adapter createBinOpExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AddExpr <em>Add Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AddExpr
   * @generated
   */
  public Adapter createAddExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AndExpr
   * @generated
   */
  public Adapter createAndExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpExpr <em>Cmp Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpExpr
   * @generated
   */
  public Adapter createCmpExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpgExpr <em>Cmpg Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpgExpr
   * @generated
   */
  public Adapter createCmpgExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmplExpr <em>Cmpl Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmplExpr
   * @generated
   */
  public Adapter createCmplExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConditionalExpr <em>Conditional Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConditionalExpr
   * @generated
   */
  public Adapter createConditionalExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.DivExpr <em>Div Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.DivExpr
   * @generated
   */
  public Adapter createDivExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MulExpr <em>Mul Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MulExpr
   * @generated
   */
  public Adapter createMulExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.OrExpr
   * @generated
   */
  public Adapter createOrExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.RemExpr <em>Rem Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.RemExpr
   * @generated
   */
  public Adapter createRemExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShlExpr <em>Shl Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShlExpr
   * @generated
   */
  public Adapter createShlExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShrExpr <em>Shr Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShrExpr
   * @generated
   */
  public Adapter createShrExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SubExpr <em>Sub Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SubExpr
   * @generated
   */
  public Adapter createSubExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.UshrExpr <em>Ushr Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.UshrExpr
   * @generated
   */
  public Adapter createUshrExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.XorExpr <em>Xor Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.XorExpr
   * @generated
   */
  public Adapter createXorExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.EqExpr <em>Eq Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.EqExpr
   * @generated
   */
  public Adapter createEqExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.GeExpr <em>Ge Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.GeExpr
   * @generated
   */
  public Adapter createGeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.GtExpr <em>Gt Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.GtExpr
   * @generated
   */
  public Adapter createGtExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LeExpr <em>Le Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LeExpr
   * @generated
   */
  public Adapter createLeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LtExpr <em>Lt Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LtExpr
   * @generated
   */
  public Adapter createLtExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NeExpr <em>Ne Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NeExpr
   * @generated
   */
  public Adapter createNeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr
   * @generated
   */
  public Adapter createCastExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr <em>Instance Of Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr
   * @generated
   */
  public Adapter createInstanceOfExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef <em>Soot Method Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef
   * @generated
   */
  public Adapter createSootMethodRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr <em>Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr
   * @generated
   */
  public Adapter createInvokeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceInvokeExpr <em>Instance Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceInvokeExpr
   * @generated
   */
  public Adapter createInstanceInvokeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticInvokeExpr <em>Static Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticInvokeExpr
   * @generated
   */
  public Adapter createStaticInvokeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InterfaceInvokeExpr <em>Interface Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InterfaceInvokeExpr
   * @generated
   */
  public Adapter createInterfaceInvokeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SpecialInvokeExpr <em>Special Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SpecialInvokeExpr
   * @generated
   */
  public Adapter createSpecialInvokeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.VirtualInvokeExpr <em>Virtual Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.VirtualInvokeExpr
   * @generated
   */
  public Adapter createVirtualInvokeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard <em>Local Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard
   * @generated
   */
  public Adapter createLocalOrWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Wildcard
   * @generated
   */
  public Adapter createWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr <em>New Array Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr
   * @generated
   */
  public Adapter createNewArrayExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewExpr <em>New Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewExpr
   * @generated
   */
  public Adapter createNewExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr <em>New Multi Array Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr
   * @generated
   */
  public Adapter createNewMultiArrayExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension
   * @generated
   */
  public Adapter createDimensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.UnopExpr <em>Unop Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.UnopExpr
   * @generated
   */
  public Adapter createUnopExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LengthExpr <em>Length Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LengthExpr
   * @generated
   */
  public Adapter createLengthExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NegExpr <em>Neg Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NegExpr
   * @generated
   */
  public Adapter createNegExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Local <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Local
   * @generated
   */
  public Adapter createLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Ref
   * @generated
   */
  public Adapter createRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityRef <em>Identity Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityRef
   * @generated
   */
  public Adapter createIdentityRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef <em>Parameter Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef
   * @generated
   */
  public Adapter createParameterRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef <em>This Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef
   * @generated
   */
  public Adapter createThisRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CaughtExceptionRef <em>Caught Exception Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CaughtExceptionRef
   * @generated
   */
  public Adapter createCaughtExceptionRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConcreteRef <em>Concrete Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConcreteRef
   * @generated
   */
  public Adapter createConcreteRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef <em>Array Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef
   * @generated
   */
  public Adapter createArrayRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.FieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.FieldRef
   * @generated
   */
  public Adapter createFieldRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef <em>Static Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef
   * @generated
   */
  public Adapter createStaticFieldRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef <em>Soot Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef
   * @generated
   */
  public Adapter createSootFieldRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef <em>Instance Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef
   * @generated
   */
  public Adapter createInstanceFieldRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant <em>Class Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant
   * @generated
   */
  public Adapter createClassConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NullConstant <em>Null Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NullConstant
   * @generated
   */
  public Adapter createNullConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NumericConstant <em>Numeric Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NumericConstant
   * @generated
   */
  public Adapter createNumericConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IntConstant
   * @generated
   */
  public Adapter createIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LongConstant <em>Long Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LongConstant
   * @generated
   */
  public Adapter createLongConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.DoubleConstant <em>Double Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.DoubleConstant
   * @generated
   */
  public Adapter createDoubleConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.FloatConstant <em>Float Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.FloatConstant
   * @generated
   */
  public Adapter createFloatConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant
   * @generated
   */
  public Adapter createStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TransformationLanguageAdapterFactory
