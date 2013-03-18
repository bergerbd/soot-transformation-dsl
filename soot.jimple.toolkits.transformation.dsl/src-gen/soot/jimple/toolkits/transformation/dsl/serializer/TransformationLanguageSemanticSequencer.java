package soot.jimple.toolkits.transformation.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import soot.jimple.toolkits.transformation.dsl.services.TransformationLanguageGrammarAccess;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AddExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AndExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.BreakpointStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CaughtExceptionRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpgExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmplExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.DivExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.DoubleConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.EnterMonitorStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.EqExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ExitMonitorStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.FloatConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.GeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.GtExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.IntConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InterfaceInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LengthExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Local;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LongConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LookupSwitchStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.LtExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.MulExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NegExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NopStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.NullConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.OrExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.QualifiedName;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.QualifiedNameWildcard;
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
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SpecialInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.SubExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguagePackage;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.UshrExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.VirtualInvokeExpr;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.Wildcard;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardAdditiveExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardBoolean;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardByte;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardCall;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardChar;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardClassLiteral;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardConditionalAndExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardConditionalOrExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardDouble;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardEqualityExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardField;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardFloat;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardInstanceOfExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardInt;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardLong;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardMultiplicativeExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardName;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardNew;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardNull;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardParExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardQName;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardRelationalExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardShort;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardString;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardUnaryExpression;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardUnaryExpressionNotPlusMinus;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.WildcardVoid;
import soot.jimple.toolkits.transformation.dsl.transformationLanguage.XorExpr;

@SuppressWarnings("all")
public class TransformationLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TransformationLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TransformationLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TransformationLanguagePackage.ADD_EXPR:
				if(context == grammarAccess.getAddExprRule() ||
				   context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_AddExpr(context, (AddExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.AND_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_AndExpr(context, (AndExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.ARRAY_REF:
				if(context == grammarAccess.getArrayRefRule() ||
				   context == grammarAccess.getConcreteRefRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ArrayRef(context, (ArrayRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.ASSIGN_STMT:
				if(context == grammarAccess.getAssignStmtRule() ||
				   context == grammarAccess.getDefinitionStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AssignStmt(context, (AssignStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.BODY:
				if(context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.BREAKPOINT_STMT:
				if(context == grammarAccess.getBreakpointStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_BreakpointStmt(context, (BreakpointStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.CASE:
				if(context == grammarAccess.getCaseRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.CAST_EXPR:
				if(context == grammarAccess.getCastExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_CastExpr(context, (CastExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.CAUGHT_EXCEPTION_REF:
				if(context == grammarAccess.getCaughtExceptionRefRule() ||
				   context == grammarAccess.getIdentityRefRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_CaughtExceptionRef(context, (CaughtExceptionRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.CLASS_CONSTANT:
				if(context == grammarAccess.getClassConstantRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ClassConstant(context, (ClassConstant) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.CMP_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getCmpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_CmpExpr(context, (CmpExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.CMPG_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getCmpgExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_CmpgExpr(context, (CmpgExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.CMPL_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getCmplExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_CmplExpr(context, (CmplExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.DIMENSION:
				if(context == grammarAccess.getDimensionRule()) {
					sequence_Dimension(context, (Dimension) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.DIV_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getDivExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_DivExpr(context, (DivExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.DOUBLE_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDoubleConstantRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getNumericConstantRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_DoubleConstant(context, (DoubleConstant) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.ENTER_MONITOR_STMT:
				if(context == grammarAccess.getEnterMonitorStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getMonitorStmtRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_EnterMonitorStmt(context, (EnterMonitorStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.EQ_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getConditionalExprRule() ||
				   context == grammarAccess.getEqExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_EqExpr(context, (EqExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.EXIT_MONITOR_STMT:
				if(context == grammarAccess.getExitMonitorStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getMonitorStmtRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ExitMonitorStmt(context, (ExitMonitorStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.FLOAT_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getFloatConstantRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getNumericConstantRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_FloatConstant(context, (FloatConstant) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.GE_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getConditionalExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getGeExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_GeExpr(context, (GeExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.GOTO_STMT:
				if(context == grammarAccess.getGotoStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_GotoStmt(context, (GotoStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.GT_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getConditionalExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getGtExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_GtExpr(context, (GtExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.IDENTITY_STMT:
				if(context == grammarAccess.getDefinitionStmtRule() ||
				   context == grammarAccess.getIdentityStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IdentityStmt(context, (IdentityStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.IF_STMT:
				if(context == grammarAccess.getIfStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IfStmt(context, (IfStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.INSTANCE_FIELD_REF:
				if(context == grammarAccess.getConcreteRefRule() ||
				   context == grammarAccess.getFieldRefRule() ||
				   context == grammarAccess.getInstanceFieldRefRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_InstanceFieldRef(context, (InstanceFieldRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.INSTANCE_OF_EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getInstanceOfExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_InstanceOfExpr(context, (InstanceOfExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.INT_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getIntConstantRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getNumericConstantRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntConstant(context, (IntConstant) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.INTERFACE_INVOKE_EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getInstanceInvokeExprRule() ||
				   context == grammarAccess.getInterfaceInvokeExprRule() ||
				   context == grammarAccess.getInvokeExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_InterfaceInvokeExpr(context, (InterfaceInvokeExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.INVOKE_STMT:
				if(context == grammarAccess.getInvokeStmtRule() ||
				   context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_InvokeStmt(context, (InvokeStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.LABEL:
				if(context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getLabelOrStatementRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.LE_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getConditionalExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getLeExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_LeExpr(context, (LeExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.LENGTH_EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getLengthExprRule() ||
				   context == grammarAccess.getUnopExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_LengthExpr(context, (LengthExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.LOCAL:
				if(context == grammarAccess.getLocalRule() ||
				   context == grammarAccess.getLocalOrWildcardRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Local(context, (Local) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.LONG_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getLongConstantRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getNumericConstantRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_LongConstant(context, (LongConstant) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.LOOKUP_SWITCH_STMT:
				if(context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getLookupSwitchStmtRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LookupSwitchStmt(context, (LookupSwitchStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.LT_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getConditionalExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getLtExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_LtExpr(context, (LtExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.METHOD_PATTERN:
				if(context == grammarAccess.getMethodPatternRule() ||
				   context == grammarAccess.getPatternRule()) {
					sequence_MethodPattern(context, (MethodPattern) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.MUL_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMulExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_MulExpr(context, (MulExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.NE_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getConditionalExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getNeExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NeExpr(context, (NeExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.NEG_EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getNegExprRule() ||
				   context == grammarAccess.getUnopExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NegExpr(context, (NegExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.NEW_ARRAY_EXPR:
				if(context == grammarAccess.getAnyNewExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getNewArrayExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NewArrayExpr(context, (NewArrayExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.NEW_EXPR:
				if(context == grammarAccess.getAnyNewExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getNewExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NewExpr(context, (NewExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.NEW_MULTI_ARRAY_EXPR:
				if(context == grammarAccess.getAnyNewExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getNewMultiArrayExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NewMultiArrayExpr(context, (NewMultiArrayExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.NOP_STMT:
				if(context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getNopStmtRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_NopStmt(context, (NopStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.NULL_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getNullConstantRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NullConstant(context, (NullConstant) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.OR_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_OrExpr(context, (OrExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.PARAMETER_REF:
				if(context == grammarAccess.getIdentityRefRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getParameterRefRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ParameterRef(context, (ParameterRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.QUALIFIED_NAME:
				if(context == grammarAccess.getQualifiedNameRule() ||
				   context == grammarAccess.getQualifiedNameOrWildcardRule() ||
				   context == grammarAccess.getSootTypeRule()) {
					sequence_QualifiedName(context, (QualifiedName) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.QUALIFIED_NAME_WILDCARD:
				if(context == grammarAccess.getQualifiedNameWildcardRule()) {
					sequence_QualifiedNameWildcard(context, (QualifiedNameWildcard) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.REM_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getRemExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_RemExpr(context, (RemExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.REPLACEMENT:
				if(context == grammarAccess.getReplacementRule()) {
					sequence_Replacement(context, (Replacement) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.RET_STMT:
				if(context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getRetStmtRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_RetStmt(context, (RetStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.RETURN_STMT:
				if(context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getReturnStmtRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ReturnStmt(context, (ReturnStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.RETURN_VOID_STMT:
				if(context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getReturnVoidStmtRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ReturnVoidStmt(context, (ReturnVoidStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.SEQUENCE_PATTERN:
				if(context == grammarAccess.getPatternRule() ||
				   context == grammarAccess.getSequencePatternRule()) {
					sequence_SequencePattern(context, (SequencePattern) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.SHL_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getShlExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ShlExpr(context, (ShlExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.SHR_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getShrExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ShrExpr(context, (ShrExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.SOOT_FIELD_REF:
				if(context == grammarAccess.getSootFieldRefRule()) {
					sequence_SootFieldRef(context, (SootFieldRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.SOOT_METHOD_REF:
				if(context == grammarAccess.getSootMethodRefRule()) {
					sequence_SootMethodRef(context, (SootMethodRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.SPECIAL_INVOKE_EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getInstanceInvokeExprRule() ||
				   context == grammarAccess.getInvokeExprRule() ||
				   context == grammarAccess.getSpecialInvokeExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_SpecialInvokeExpr(context, (SpecialInvokeExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.STATEMENT_SEQUENCE:
				if(context == grammarAccess.getStatementSequenceRule()) {
					sequence_StatementSequence(context, (StatementSequence) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.STATIC_FIELD_REF:
				if(context == grammarAccess.getConcreteRefRule() ||
				   context == grammarAccess.getFieldRefRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getStaticFieldRefRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StaticFieldRef(context, (StaticFieldRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.STATIC_INVOKE_EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getInvokeExprRule() ||
				   context == grammarAccess.getStaticInvokeExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StaticInvokeExpr(context, (StaticInvokeExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.STRING_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getStringConstantRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringConstant(context, (StringConstant) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.SUB_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getSubExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_SubExpr(context, (SubExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.TABLE_SWITCH_STMT:
				if(context == grammarAccess.getLabelOrStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTableSwitchStmtRule()) {
					sequence_TableSwitchStmt(context, (TableSwitchStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.THIS_REF:
				if(context == grammarAccess.getIdentityRefRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getThisRefRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ThisRef(context, (ThisRef) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.THROW_STMT:
				if(context == grammarAccess.getThrowStmtRule()) {
					sequence_ThrowStmt(context, (ThrowStmt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.TRANSFORMATION:
				if(context == grammarAccess.getTransformationRule()) {
					sequence_Transformation(context, (Transformation) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.TYPE_PATTERN:
				if(context == grammarAccess.getPatternRule() ||
				   context == grammarAccess.getTypePatternRule()) {
					sequence_TypePattern(context, (TypePattern) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.USHR_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getUshrExprRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_UshrExpr(context, (UshrExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.VIRTUAL_INVOKE_EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getInstanceInvokeExprRule() ||
				   context == grammarAccess.getInvokeExprRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getVirtualInvokeExprRule()) {
					sequence_VirtualInvokeExpr(context, (VirtualInvokeExpr) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD:
				if(context == grammarAccess.getQualifiedNameOrWildcardRule() ||
				   context == grammarAccess.getWildcardRule()) {
					sequence_Wildcard(context, (Wildcard) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getWildcardAdditiveExpressionRule()) {
					sequence_WildcardAdditiveExpression(context, (WildcardAdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_BOOLEAN:
				if(context == grammarAccess.getWildcardBooleanRule() ||
				   context == grammarAccess.getWildcardLiteralRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardBoolean(context, (WildcardBoolean) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardBoolean) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_BYTE:
				if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardByte) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_CALL:
				if(context == grammarAccess.getWildcardCallRule() ||
				   context == grammarAccess.getWildcardDereferenceRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardCall(context, (WildcardCall) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_CHAR:
				if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardChar) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_CLASS_LITERAL:
				if(context == grammarAccess.getWildcardClassLiteralRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardClassLiteral(context, (WildcardClassLiteral) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_CONDITIONAL_AND_EXPRESSION:
				if(context == grammarAccess.getWildcardConditionalAndExpressionRule()) {
					sequence_WildcardConditionalAndExpression(context, (WildcardConditionalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_CONDITIONAL_OR_EXPRESSION:
				if(context == grammarAccess.getWildcardConditionalOrExpressionRule()) {
					sequence_WildcardConditionalOrExpression(context, (WildcardConditionalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_DOUBLE:
				if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardDouble) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_EQUALITY_EXPRESSION:
				if(context == grammarAccess.getWildcardEqualityExpressionRule()) {
					sequence_WildcardEqualityExpression(context, (WildcardEqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_EXPRESSION:
				if(context == grammarAccess.getWildcardExpressionRule()) {
					sequence_WildcardExpression(context, (WildcardExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_FIELD:
				if(context == grammarAccess.getWildcardDereferenceRule() ||
				   context == grammarAccess.getWildcardFieldRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardField(context, (WildcardField) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_FLOAT:
				if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardFloat) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_INSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getWildcardInstanceOfExpressionRule()) {
					sequence_WildcardInstanceOfExpression(context, (WildcardInstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_INT:
				if(context == grammarAccess.getWildcardIntRule() ||
				   context == grammarAccess.getWildcardLiteralRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardInt(context, (WildcardInt) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardInt) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_LONG:
				if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardLong) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getWildcardMultiplicativeExpressionRule()) {
					sequence_WildcardMultiplicativeExpression(context, (WildcardMultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_NAME:
				if(context == grammarAccess.getLocalOrWildcardRule() ||
				   context == grammarAccess.getNonExprRule() ||
				   context == grammarAccess.getRefRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getWildcardNameRule()) {
					sequence_WildcardName(context, (WildcardName) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_NEW:
				if(context == grammarAccess.getWildcardNewRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardNew(context, (WildcardNew) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_NULL:
				if(context == grammarAccess.getWildcardLiteralRule() ||
				   context == grammarAccess.getWildcardNullRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardNull(context, (WildcardNull) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_PAR_EXPRESSION:
				if(context == grammarAccess.getWildcardParExpressionRule() ||
				   context == grammarAccess.getWildcardPrimaryRule()) {
					sequence_WildcardParExpression(context, (WildcardParExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_QNAME:
				if(context == grammarAccess.getWildcardPrimaryRule() ||
				   context == grammarAccess.getWildcardQNameRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardQName(context, (WildcardQName) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getWildcardRelationalExpressionRule()) {
					sequence_WildcardRelationalExpression(context, (WildcardRelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_SHORT:
				if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardShort) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_STRING:
				if(context == grammarAccess.getWildcardLiteralRule() ||
				   context == grammarAccess.getWildcardPrimaryRule() ||
				   context == grammarAccess.getWildcardStringRule()) {
					sequence_WildcardString(context, (WildcardString) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION:
				if(context == grammarAccess.getWildcardUnaryExpressionRule()) {
					sequence_WildcardUnaryExpression(context, (WildcardUnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_UNARY_EXPRESSION_NOT_PLUS_MINUS:
				if(context == grammarAccess.getWildcardUnaryExpressionNotPlusMinusRule()) {
					sequence_WildcardUnaryExpressionNotPlusMinus(context, (WildcardUnaryExpressionNotPlusMinus) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.WILDCARD_VOID:
				if(context == grammarAccess.getSootTypeRule() ||
				   context == grammarAccess.getWildcardPrimitiveTypeRule() ||
				   context == grammarAccess.getWildcardTypeRule()) {
					sequence_WildcardPrimitiveType(context, (WildcardVoid) semanticObject); 
					return; 
				}
				else break;
			case TransformationLanguagePackage.XOR_EXPR:
				if(context == grammarAccess.getBinOpExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getXorExprRule()) {
					sequence_XorExpr(context, (XorExpr) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_AddExpr(EObject context, AddExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getAddExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_AndExpr(EObject context, AndExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getAndExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (base=LocalOrWildcard index=NonExpr)
	 */
	protected void sequence_ArrayRef(EObject context, ArrayRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.ARRAY_REF__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.ARRAY_REF__BASE));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.ARRAY_REF__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.ARRAY_REF__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayRefAccess().getBaseLocalOrWildcardParserRuleCall_0_0(), semanticObject.getBase());
		feeder.accept(grammarAccess.getArrayRefAccess().getIndexNonExprParserRuleCall_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Ref rhs=Value)
	 */
	protected void sequence_AssignStmt(EObject context, AssignStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.ASSIGN_STMT__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.ASSIGN_STMT__LHS));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.ASSIGN_STMT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.ASSIGN_STMT__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignStmtAccess().getLhsRefParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAssignStmtAccess().getRhsValueParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration* statements+=LabelOrStatement*)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BreakpointStmt}
	 */
	protected void sequence_BreakpointStmt(EObject context, BreakpointStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT target=GotoStmt)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.CASE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.CASE__VALUE));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.CASE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.CASE__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaseAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getCaseAccess().getTargetGotoStmtParserRuleCall_3_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=QualifiedName operand=Value)
	 */
	protected void sequence_CastExpr(EObject context, CastExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.CAST_EXPR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.CAST_EXPR__TYPE));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.CAST_EXPR__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.CAST_EXPR__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastExprAccess().getTypeQualifiedNameParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCastExprAccess().getOperandValueParserRuleCall_3_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {CaughtExceptionRef}
	 */
	protected void sequence_CaughtExceptionRef(EObject context, CaughtExceptionRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedNameOrWildcard
	 */
	protected void sequence_ClassConstant(EObject context, ClassConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.CLASS_CONSTANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.CLASS_CONSTANT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassConstantAccess().getNameQualifiedNameOrWildcardParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_CmpExpr(EObject context, CmpExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCmpExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getCmpExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_CmpgExpr(EObject context, CmpgExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCmpgExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getCmpgExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_CmplExpr(EObject context, CmplExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCmplExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getCmplExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=QualifiedName locals+=ID locals+=ID*)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     size=INT
	 */
	protected void sequence_Dimension(EObject context, Dimension semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.DIMENSION__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.DIMENSION__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDimensionAccess().getSizeINTTerminalRuleCall_1_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_DivExpr(EObject context, DivExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getDivExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_DoubleConstant(EObject context, DoubleConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleConstantAccess().getValueINTTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=Value
	 */
	protected void sequence_EnterMonitorStmt(EObject context, EnterMonitorStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.MONITOR_STMT__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.MONITOR_STMT__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnterMonitorStmtAccess().getOperandValueParserRuleCall_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_EqExpr(EObject context, EqExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getEqExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=Value
	 */
	protected void sequence_ExitMonitorStmt(EObject context, ExitMonitorStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.MONITOR_STMT__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.MONITOR_STMT__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExitMonitorStmtAccess().getOperandValueParserRuleCall_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=Visibility? static?='static' type=QualifiedName name=ID)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_FloatConstant(EObject context, FloatConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_GeExpr(EObject context, GeExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGeExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getGeExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     target=LABELNAME
	 */
	protected void sequence_GotoStmt(EObject context, GotoStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.GOTO_STMT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.GOTO_STMT__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGotoStmtAccess().getTargetLABELNAMETerminalRuleCall_1_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_GtExpr(EObject context, GtExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGtExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getGtExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Local rhs=IdentityRef)
	 */
	protected void sequence_IdentityStmt(EObject context, IdentityStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.IDENTITY_STMT__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.IDENTITY_STMT__LHS));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.IDENTITY_STMT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.IDENTITY_STMT__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentityStmtAccess().getLhsLocalParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getIdentityStmtAccess().getRhsIdentityRefParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=ConditionalExpr then=GotoStmt)
	 */
	protected void sequence_IfStmt(EObject context, IfStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.IF_STMT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.IF_STMT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.IF_STMT__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.IF_STMT__THEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfStmtAccess().getConditionConditionalExprParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getIfStmtAccess().getThenGotoStmtParserRuleCall_2_0(), semanticObject.getThen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (base=LocalOrWildcard fieldRef=FieldRef)
	 */
	protected void sequence_InstanceFieldRef(EObject context, InstanceFieldRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_FIELD_REF__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_FIELD_REF__BASE));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_FIELD_REF__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_FIELD_REF__FIELD_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceFieldRefAccess().getBaseLocalOrWildcardParserRuleCall_0_0(), semanticObject.getBase());
		feeder.accept(grammarAccess.getInstanceFieldRefAccess().getFieldRefFieldRefParserRuleCall_2_0(), semanticObject.getFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operand=Ref type=QualifiedName)
	 */
	protected void sequence_InstanceOfExpr(EObject context, InstanceOfExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_OF_EXPR__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_OF_EXPR__OPERAND));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_OF_EXPR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.INSTANCE_OF_EXPR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceOfExprAccess().getOperandRefParserRuleCall_0_0(), semanticObject.getOperand());
		feeder.accept(grammarAccess.getInstanceOfExprAccess().getTypeQualifiedNameParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntConstant(EObject context, IntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntConstantAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (base=LocalOrWildcard method=SootMethodRef (parameters+=NonExpr parameters+=NonExpr*)?)
	 */
	protected void sequence_InterfaceInvokeExpr(EObject context, InterfaceInvokeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     invokeExpr=InvokeExpr
	 */
	protected void sequence_InvokeStmt(EObject context, InvokeStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.INVOKE_STMT__INVOKE_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.INVOKE_STMT__INVOKE_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInvokeStmtAccess().getInvokeExprInvokeExprParserRuleCall_0(), semanticObject.getInvokeExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=LABELNAME
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.LABEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getNameLABELNAMETerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_LeExpr(EObject context, LeExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLeExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getLeExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=Value
	 */
	protected void sequence_LengthExpr(EObject context, LengthExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.UNOP_EXPR__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.UNOP_EXPR__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLengthExprAccess().getOperandValueParserRuleCall_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Local(EObject context, Local semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.LOCAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.LOCAL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_LongConstant(EObject context, LongConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.NUMERIC_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLongConstantAccess().getValueINTTerminalRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {LookupSwitchStmt}
	 */
	protected void sequence_LookupSwitchStmt(EObject context, LookupSwitchStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_LtExpr(EObject context, LtExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLtExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getLtExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     method=Method
	 */
	protected void sequence_MethodPattern(EObject context, MethodPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.METHOD_PATTERN__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.METHOD_PATTERN__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodPatternAccess().getMethodMethodParserRuleCall_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         static?='static'? 
	 *         type=ID 
	 *         name=MethodName 
	 *         (parameters+=QualifiedName parameters+=QualifiedName*)? 
	 *         body=Body
	 *     )
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_MulExpr(EObject context, MulExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMulExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getMulExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_NeExpr(EObject context, NeExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNeExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getNeExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=Value
	 */
	protected void sequence_NegExpr(EObject context, NegExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.UNOP_EXPR__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.UNOP_EXPR__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegExprAccess().getOperandValueParserRuleCall_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=QualifiedName size=Dimension)
	 */
	protected void sequence_NewArrayExpr(EObject context, NewArrayExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.ANY_NEW_EXPR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.ANY_NEW_EXPR__TYPE));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.NEW_ARRAY_EXPR__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.NEW_ARRAY_EXPR__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNewArrayExprAccess().getTypeQualifiedNameParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getNewArrayExprAccess().getSizeDimensionParserRuleCall_4_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=QualifiedName
	 */
	protected void sequence_NewExpr(EObject context, NewExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.ANY_NEW_EXPR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.ANY_NEW_EXPR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNewExprAccess().getTypeQualifiedNameParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=QualifiedName size+=Dimension* emptySize+='[]'*)
	 */
	protected void sequence_NewMultiArrayExpr(EObject context, NewMultiArrayExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NopStmt}
	 */
	protected void sequence_NopStmt(EObject context, NopStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullConstant}
	 */
	protected void sequence_NullConstant(EObject context, NullConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_OrExpr(EObject context, OrExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getOrExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=QualifiedName)
	 */
	protected void sequence_ParameterRef(EObject context, ParameterRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.PARAMETER_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.PARAMETER_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.PARAMETER_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.PARAMETER_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterRefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterRefAccess().getTypeQualifiedNameParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_QualifiedNameWildcard(EObject context, QualifiedNameWildcard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.QUALIFIED_NAME_WILDCARD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.QUALIFIED_NAME_WILDCARD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualifiedNameWildcardAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=QName
	 */
	protected void sequence_QualifiedName(EObject context, QualifiedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.QUALIFIED_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.QUALIFIED_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualifiedNameAccess().getNameQNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_RemExpr(EObject context, RemExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRemExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getRemExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sequence=StatementSequence | method=Method | type=Type)
	 */
	protected void sequence_Replacement(EObject context, Replacement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     target=Local
	 */
	protected void sequence_RetStmt(EObject context, RetStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.RET_STMT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.RET_STMT__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRetStmtAccess().getTargetLocalParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=Value
	 */
	protected void sequence_ReturnStmt(EObject context, ReturnStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.RETURN_STMT__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.RETURN_STMT__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnStmtAccess().getOperandValueParserRuleCall_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ReturnVoidStmt}
	 */
	protected void sequence_ReturnVoidStmt(EObject context, ReturnVoidStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sequence=StatementSequence
	 */
	protected void sequence_SequencePattern(EObject context, SequencePattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.SEQUENCE_PATTERN__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.SEQUENCE_PATTERN__SEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSequencePatternAccess().getSequenceStatementSequenceParserRuleCall_0(), semanticObject.getSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_ShlExpr(EObject context, ShlExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShlExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getShlExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_ShrExpr(EObject context, ShrExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShrExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getShrExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (class=QualifiedName Type=QualifiedName name=ID)
	 */
	protected void sequence_SootFieldRef(EObject context, SootFieldRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.SOOT_FIELD_REF__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.SOOT_FIELD_REF__CLASS));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.SOOT_FIELD_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.SOOT_FIELD_REF__TYPE));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.SOOT_FIELD_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.SOOT_FIELD_REF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSootFieldRefAccess().getClassQualifiedNameParserRuleCall_1_0(), semanticObject.getClass_());
		feeder.accept(grammarAccess.getSootFieldRefAccess().getTypeQualifiedNameParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getSootFieldRefAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (class=QualifiedName type=SootType name=MethodName (parameters+=QualifiedName parameters+=QualifiedName*)?)
	 */
	protected void sequence_SootMethodRef(EObject context, SootMethodRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=LocalOrWildcard method=SootMethodRef (parameters+=NonExpr parameters+=NonExpr*)?)
	 */
	protected void sequence_SpecialInvokeExpr(EObject context, SpecialInvokeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=LabelOrStatement+
	 */
	protected void sequence_StatementSequence(EObject context, StatementSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fieldRef=SootFieldRef
	 */
	protected void sequence_StaticFieldRef(EObject context, StaticFieldRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.STATIC_FIELD_REF__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.STATIC_FIELD_REF__FIELD_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStaticFieldRefAccess().getFieldRefSootFieldRefParserRuleCall_0(), semanticObject.getFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (method=SootMethodRef (parameters+=NonExpr parameters+=NonExpr*)?)
	 */
	protected void sequence_StaticInvokeExpr(EObject context, StaticInvokeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringConstant(EObject context, StringConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.STRING_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_SubExpr(EObject context, SubExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getSubExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=Local cases+=Case* default=GotoStmt)
	 */
	protected void sequence_TableSwitchStmt(EObject context, TableSwitchStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=QualifiedName
	 */
	protected void sequence_ThisRef(EObject context, ThisRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.THIS_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.THIS_REF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThisRefAccess().getTypeQualifiedNameParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=Value
	 */
	protected void sequence_ThrowStmt(EObject context, ThrowStmt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.THROW_STMT__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.THROW_STMT__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThrowStmtAccess().getOperandValueParserRuleCall_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=Pattern replacement=Replacement condition=WildcardExpression?)
	 */
	protected void sequence_Transformation(EObject context, Transformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_TypePattern(EObject context, TypePattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.TYPE_PATTERN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.TYPE_PATTERN__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypePatternAccess().getTypeTypeParserRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         (class?='class' | interface?='interface') 
	 *         name=QualifiedName 
	 *         superClass=QualifiedName? 
	 *         (interfaces+=QualifiedName interfaces+=QualifiedName*)? 
	 *         fields+=Field* 
	 *         methods+=Method*
	 *     )
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_UshrExpr(EObject context, UshrExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUshrExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getUshrExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (base=LocalOrWildcard method=SootMethodRef (parameters+=NonExpr parameters+=NonExpr*)?)
	 */
	protected void sequence_VirtualInvokeExpr(EObject context, VirtualInvokeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=WildcardMultiplicativeExpression ((operators+='+' | operators+='-') operands+=WildcardMultiplicativeExpression)*)
	 */
	protected void sequence_WildcardAdditiveExpression(EObject context, WildcardAdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_WildcardBoolean(EObject context, WildcardBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=WildcardExpression parameters+=WildcardExpression*)?)
	 */
	protected void sequence_WildcardCall(EObject context, WildcardCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (baseType=WildcardType (dimension+='[' dimension+=']')*)
	 */
	protected void sequence_WildcardClassLiteral(EObject context, WildcardClassLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=WildcardEqualityExpression operands+=WildcardEqualityExpression*)
	 */
	protected void sequence_WildcardConditionalAndExpression(EObject context, WildcardConditionalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=WildcardConditionalAndExpression operands+=WildcardConditionalAndExpression*)
	 */
	protected void sequence_WildcardConditionalOrExpression(EObject context, WildcardConditionalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=WildcardInstanceOfExpression ((operator+='==' | operator+='!=') operands+=WildcardInstanceOfExpression)*)
	 */
	protected void sequence_WildcardEqualityExpression(EObject context, WildcardEqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=WildcardConditionalOrExpression
	 */
	protected void sequence_WildcardExpression(EObject context, WildcardExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardExpressionAccess().getExpressionWildcardConditionalOrExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_WildcardField(EObject context, WildcardField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_DEREFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_DEREFERENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operand=WildcardRelationalExpression type=WildcardQName?)
	 */
	protected void sequence_WildcardInstanceOfExpression(EObject context, WildcardInstanceOfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_WildcardInt(EObject context, WildcardInt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_INT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_INT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardIntAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=WildcardUnaryExpression ((operators+='*' | operators+='/' | operators+='%') operands+=WildcardUnaryExpression)*)
	 */
	protected void sequence_WildcardMultiplicativeExpression(EObject context, WildcardMultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     wName=ID
	 */
	protected void sequence_WildcardName(EObject context, WildcardName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_NAME__WNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_NAME__WNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardNameAccess().getWNameIDTerminalRuleCall_1_0(), semanticObject.getWName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=WildcardQName (parameters+=WildcardExpression parameters+=WildcardExpression*)?)
	 */
	protected void sequence_WildcardNew(EObject context, WildcardNew semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardNull}
	 */
	protected void sequence_WildcardNull(EObject context, WildcardNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=WildcardExpression
	 */
	protected void sequence_WildcardParExpression(EObject context, WildcardParExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_PAR_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_PAR_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardParExpressionAccess().getExpressionWildcardExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardBoolean}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardByte}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardByte semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardChar}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardChar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardDouble}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardDouble semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardFloat}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardFloat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardInt}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardLong}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardLong semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardShort}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardShort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardVoid}
	 */
	protected void sequence_WildcardPrimitiveType(EObject context, WildcardVoid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=WildcardQNameTerminal
	 */
	protected void sequence_WildcardQName(EObject context, WildcardQName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_QNAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_QNAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardQNameAccess().getNameWildcardQNameTerminalParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=WildcardAdditiveExpression (operators+=WildcardRelationalOp operands+=WildcardAdditiveExpression)*)
	 */
	protected void sequence_WildcardRelationalExpression(EObject context, WildcardRelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_WildcardString(EObject context, WildcardString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardStringAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((not?='!' operand=WildcardUnaryExpression) | (operand=WildcardPrimary dereferences+=WildcardDereference*))
	 */
	protected void sequence_WildcardUnaryExpressionNotPlusMinus(EObject context, WildcardUnaryExpressionNotPlusMinus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator='+' operand=WildcardUnaryExpression) | (operator='-' operand=WildcardUnaryExpression) | operand=WildcardUnaryExpressionNotPlusMinus)
	 */
	protected void sequence_WildcardUnaryExpression(EObject context, WildcardUnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=WildcardExpression
	 */
	protected void sequence_Wildcard(EObject context, Wildcard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.WILDCARD__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.WILDCARD__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWildcardAccess().getExpressionWildcardExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOp=NonExpr rightOp=NonExpr)
	 */
	protected void sequence_XorExpr(EObject context, XorExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__LEFT_OP));
			if(transientValues.isValueTransient(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransformationLanguagePackage.Literals.BIN_OP_EXPR__RIGHT_OP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXorExprAccess().getLeftOpNonExprParserRuleCall_0_0(), semanticObject.getLeftOp());
		feeder.accept(grammarAccess.getXorExprAccess().getRightOpNonExprParserRuleCall_2_0(), semanticObject.getRightOp());
		feeder.finish();
	}
}
