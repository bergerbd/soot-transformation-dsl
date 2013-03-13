/**
 */
package soot.jimple.toolkits.transformation.dsl.transformationLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TransformationLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface TransformationLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "transformationLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.informatik.uni-bremen.de/st/soot/TransformationLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "transformationLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TransformationLanguagePackage eINSTANCE = soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__REPLACEMENT = 1;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.PatternImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 1;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SequencePatternImpl <em>Sequence Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SequencePatternImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSequencePattern()
   * @generated
   */
  int SEQUENCE_PATTERN = 2;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PATTERN__SEQUENCE = PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodPatternImpl <em>Method Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodPatternImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMethodPattern()
   * @generated
   */
  int METHOD_PATTERN = 3;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__METHOD = PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Method Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypePatternImpl <em>Type Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypePatternImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getTypePattern()
   * @generated
   */
  int TYPE_PATTERN = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATTERN__TYPE = PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReplacementImpl <em>Replacement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReplacementImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getReplacement()
   * @generated
   */
  int REPLACEMENT = 5;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT__SEQUENCE = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT__METHOD = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT__TYPE = 2;

  /**
   * The number of structural features of the '<em>Replacement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 6;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VISIBILITY = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CLASS = 1;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INTERFACE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 3;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SUPER_CLASS = 4;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INTERFACES = 5;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__FIELDS = 6;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__METHODS = 7;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getField()
   * @generated
   */
  int FIELD = 7;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VISIBILITY = 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__STATIC = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 3;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMethod()
   * @generated
   */
  int METHOD = 8;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__VISIBILITY = 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__STATIC = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = 5;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BodyImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getBody()
   * @generated
   */
  int BODY = 9;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementSequenceImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStatementSequence()
   * @generated
   */
  int STATEMENT_SEQUENCE = 10;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Statement Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DeclarationImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Locals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__LOCALS = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelOrStatementImpl <em>Label Or Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelOrStatementImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLabelOrStatement()
   * @generated
   */
  int LABEL_OR_STATEMENT = 12;

  /**
   * The number of structural features of the '<em>Label Or Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_OR_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 13;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = LABEL_OR_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLabel()
   * @generated
   */
  int LABEL = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = LABEL_OR_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = LABEL_OR_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BreakpointStmtImpl <em>Breakpoint Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BreakpointStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getBreakpointStmt()
   * @generated
   */
  int BREAKPOINT_STMT = 15;

  /**
   * The number of structural features of the '<em>Breakpoint Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAKPOINT_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DefinitionStmtImpl <em>Definition Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DefinitionStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDefinitionStmt()
   * @generated
   */
  int DEFINITION_STMT = 16;

  /**
   * The number of structural features of the '<em>Definition Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AssignStmtImpl <em>Assign Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AssignStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAssignStmt()
   * @generated
   */
  int ASSIGN_STMT = 17;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT__LHS = DEFINITION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT__RHS = DEFINITION_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_STMT_FEATURE_COUNT = DEFINITION_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityStmtImpl <em>Identity Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIdentityStmt()
   * @generated
   */
  int IDENTITY_STMT = 18;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STMT__LHS = DEFINITION_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STMT__RHS = DEFINITION_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Identity Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STMT_FEATURE_COUNT = DEFINITION_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GotoStmtImpl <em>Goto Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GotoStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getGotoStmt()
   * @generated
   */
  int GOTO_STMT = 19;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STMT__TARGET = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goto Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IfStmtImpl <em>If Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IfStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIfStmt()
   * @generated
   */
  int IF_STMT = 20;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__THEN = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeStmtImpl <em>Invoke Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInvokeStmt()
   * @generated
   */
  int INVOKE_STMT = 21;

  /**
   * The feature id for the '<em><b>Invoke Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_STMT__INVOKE_EXPR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invoke Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TableSwitchStmtImpl <em>Table Switch Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TableSwitchStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getTableSwitchStmt()
   * @generated
   */
  int TABLE_SWITCH_STMT = 22;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_SWITCH_STMT__KEY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_SWITCH_STMT__CASES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_SWITCH_STMT__DEFAULT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Table Switch Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_SWITCH_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LookupSwitchStmtImpl <em>Lookup Switch Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LookupSwitchStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLookupSwitchStmt()
   * @generated
   */
  int LOOKUP_SWITCH_STMT = 23;

  /**
   * The number of structural features of the '<em>Lookup Switch Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_SWITCH_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MonitorStmtImpl <em>Monitor Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MonitorStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMonitorStmt()
   * @generated
   */
  int MONITOR_STMT = 24;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_STMT__OPERAND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Monitor Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EnterMonitorStmtImpl <em>Enter Monitor Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EnterMonitorStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getEnterMonitorStmt()
   * @generated
   */
  int ENTER_MONITOR_STMT = 25;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTER_MONITOR_STMT__OPERAND = MONITOR_STMT__OPERAND;

  /**
   * The number of structural features of the '<em>Enter Monitor Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTER_MONITOR_STMT_FEATURE_COUNT = MONITOR_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExitMonitorStmtImpl <em>Exit Monitor Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExitMonitorStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getExitMonitorStmt()
   * @generated
   */
  int EXIT_MONITOR_STMT = 26;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_MONITOR_STMT__OPERAND = MONITOR_STMT__OPERAND;

  /**
   * The number of structural features of the '<em>Exit Monitor Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_MONITOR_STMT_FEATURE_COUNT = MONITOR_STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NopStmtImpl <em>Nop Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NopStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNopStmt()
   * @generated
   */
  int NOP_STMT = 27;

  /**
   * The number of structural features of the '<em>Nop Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOP_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RetStmtImpl <em>Ret Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RetStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getRetStmt()
   * @generated
   */
  int RET_STMT = 28;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RET_STMT__TARGET = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ret Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RET_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnVoidStmtImpl <em>Return Void Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnVoidStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getReturnVoidStmt()
   * @generated
   */
  int RETURN_VOID_STMT = 29;

  /**
   * The number of structural features of the '<em>Return Void Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VOID_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getReturnStmt()
   * @generated
   */
  int RETURN_STMT = 30;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STMT__OPERAND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaseImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCase()
   * @generated
   */
  int CASE = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__TARGET = 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThrowStmtImpl <em>Throw Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThrowStmtImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getThrowStmt()
   * @generated
   */
  int THROW_STMT = 32;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STMT__OPERAND = 0;

  /**
   * The number of structural features of the '<em>Throw Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ValueImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getValue()
   * @generated
   */
  int VALUE = 33;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NonExprImpl <em>Non Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NonExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNonExpr()
   * @generated
   */
  int NON_EXPR = 34;

  /**
   * The number of structural features of the '<em>Non Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_EXPR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getExpr()
   * @generated
   */
  int EXPR = 35;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AnyNewExprImpl <em>Any New Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AnyNewExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAnyNewExpr()
   * @generated
   */
  int ANY_NEW_EXPR = 36;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_NEW_EXPR__TYPE = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Any New Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_NEW_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BinOpExprImpl <em>Bin Op Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BinOpExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getBinOpExpr()
   * @generated
   */
  int BIN_OP_EXPR = 37;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP_EXPR__LEFT_OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP_EXPR__RIGHT_OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bin Op Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AddExprImpl <em>Add Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AddExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAddExpr()
   * @generated
   */
  int ADD_EXPR = 38;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Add Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AndExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AndExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAndExpr()
   * @generated
   */
  int AND_EXPR = 39;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpExprImpl <em>Cmp Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCmpExpr()
   * @generated
   */
  int CMP_EXPR = 40;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Cmp Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpgExprImpl <em>Cmpg Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpgExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCmpgExpr()
   * @generated
   */
  int CMPG_EXPR = 41;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPG_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPG_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Cmpg Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPG_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmplExprImpl <em>Cmpl Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmplExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCmplExpr()
   * @generated
   */
  int CMPL_EXPR = 42;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPL_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPL_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Cmpl Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMPL_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConditionalExprImpl <em>Conditional Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConditionalExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getConditionalExpr()
   * @generated
   */
  int CONDITIONAL_EXPR = 43;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Conditional Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DivExprImpl <em>Div Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DivExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDivExpr()
   * @generated
   */
  int DIV_EXPR = 44;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Div Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MulExprImpl <em>Mul Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MulExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMulExpr()
   * @generated
   */
  int MUL_EXPR = 45;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Mul Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.OrExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 46;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RemExprImpl <em>Rem Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RemExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getRemExpr()
   * @generated
   */
  int REM_EXPR = 47;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Rem Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShlExprImpl <em>Shl Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShlExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getShlExpr()
   * @generated
   */
  int SHL_EXPR = 48;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHL_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHL_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Shl Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHL_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShrExprImpl <em>Shr Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShrExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getShrExpr()
   * @generated
   */
  int SHR_EXPR = 49;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHR_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHR_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Shr Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHR_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SubExprImpl <em>Sub Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SubExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSubExpr()
   * @generated
   */
  int SUB_EXPR = 50;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Sub Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UshrExprImpl <em>Ushr Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UshrExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getUshrExpr()
   * @generated
   */
  int USHR_EXPR = 51;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USHR_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USHR_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Ushr Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USHR_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.XorExprImpl <em>Xor Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.XorExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getXorExpr()
   * @generated
   */
  int XOR_EXPR = 52;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__LEFT_OP = BIN_OP_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__RIGHT_OP = BIN_OP_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Xor Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR_FEATURE_COUNT = BIN_OP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EqExprImpl <em>Eq Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EqExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getEqExpr()
   * @generated
   */
  int EQ_EXPR = 53;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__LEFT_OP = CONDITIONAL_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__RIGHT_OP = CONDITIONAL_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Eq Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR_FEATURE_COUNT = CONDITIONAL_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GeExprImpl <em>Ge Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getGeExpr()
   * @generated
   */
  int GE_EXPR = 54;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GE_EXPR__LEFT_OP = CONDITIONAL_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GE_EXPR__RIGHT_OP = CONDITIONAL_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Ge Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GE_EXPR_FEATURE_COUNT = CONDITIONAL_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GtExprImpl <em>Gt Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GtExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getGtExpr()
   * @generated
   */
  int GT_EXPR = 55;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GT_EXPR__LEFT_OP = CONDITIONAL_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GT_EXPR__RIGHT_OP = CONDITIONAL_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Gt Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GT_EXPR_FEATURE_COUNT = CONDITIONAL_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LeExprImpl <em>Le Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLeExpr()
   * @generated
   */
  int LE_EXPR = 56;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LE_EXPR__LEFT_OP = CONDITIONAL_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LE_EXPR__RIGHT_OP = CONDITIONAL_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Le Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LE_EXPR_FEATURE_COUNT = CONDITIONAL_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LtExprImpl <em>Lt Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LtExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLtExpr()
   * @generated
   */
  int LT_EXPR = 57;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LT_EXPR__LEFT_OP = CONDITIONAL_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LT_EXPR__RIGHT_OP = CONDITIONAL_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Lt Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LT_EXPR_FEATURE_COUNT = CONDITIONAL_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NeExprImpl <em>Ne Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNeExpr()
   * @generated
   */
  int NE_EXPR = 58;

  /**
   * The feature id for the '<em><b>Left Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NE_EXPR__LEFT_OP = CONDITIONAL_EXPR__LEFT_OP;

  /**
   * The feature id for the '<em><b>Right Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NE_EXPR__RIGHT_OP = CONDITIONAL_EXPR__RIGHT_OP;

  /**
   * The number of structural features of the '<em>Ne Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NE_EXPR_FEATURE_COUNT = CONDITIONAL_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CastExprImpl <em>Cast Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CastExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCastExpr()
   * @generated
   */
  int CAST_EXPR = 59;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR__TYPE = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR__OPERAND = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cast Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceOfExprImpl <em>Instance Of Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceOfExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInstanceOfExpr()
   * @generated
   */
  int INSTANCE_OF_EXPR = 60;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPR__OPERAND = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPR__TYPE = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance Of Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootMethodRefImpl <em>Soot Method Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootMethodRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSootMethodRef()
   * @generated
   */
  int SOOT_METHOD_REF = 61;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_METHOD_REF__CLASS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_METHOD_REF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_METHOD_REF__NAME = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_METHOD_REF__PARAMETERS = 3;

  /**
   * The number of structural features of the '<em>Soot Method Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_METHOD_REF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeExprImpl <em>Invoke Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInvokeExpr()
   * @generated
   */
  int INVOKE_EXPR = 62;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_EXPR__METHOD = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_EXPR__PARAMETERS = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Invoke Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceInvokeExprImpl <em>Instance Invoke Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceInvokeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInstanceInvokeExpr()
   * @generated
   */
  int INSTANCE_INVOKE_EXPR = 63;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_INVOKE_EXPR__METHOD = INVOKE_EXPR__METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_INVOKE_EXPR__PARAMETERS = INVOKE_EXPR__PARAMETERS;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_INVOKE_EXPR__BASE = INVOKE_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Invoke Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_INVOKE_EXPR_FEATURE_COUNT = INVOKE_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticInvokeExprImpl <em>Static Invoke Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticInvokeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStaticInvokeExpr()
   * @generated
   */
  int STATIC_INVOKE_EXPR = 64;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INVOKE_EXPR__METHOD = INVOKE_EXPR__METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INVOKE_EXPR__PARAMETERS = INVOKE_EXPR__PARAMETERS;

  /**
   * The number of structural features of the '<em>Static Invoke Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INVOKE_EXPR_FEATURE_COUNT = INVOKE_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InterfaceInvokeExprImpl <em>Interface Invoke Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InterfaceInvokeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInterfaceInvokeExpr()
   * @generated
   */
  int INTERFACE_INVOKE_EXPR = 65;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_INVOKE_EXPR__METHOD = INSTANCE_INVOKE_EXPR__METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_INVOKE_EXPR__PARAMETERS = INSTANCE_INVOKE_EXPR__PARAMETERS;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_INVOKE_EXPR__BASE = INSTANCE_INVOKE_EXPR__BASE;

  /**
   * The number of structural features of the '<em>Interface Invoke Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_INVOKE_EXPR_FEATURE_COUNT = INSTANCE_INVOKE_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SpecialInvokeExprImpl <em>Special Invoke Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SpecialInvokeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSpecialInvokeExpr()
   * @generated
   */
  int SPECIAL_INVOKE_EXPR = 66;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_INVOKE_EXPR__METHOD = INSTANCE_INVOKE_EXPR__METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_INVOKE_EXPR__PARAMETERS = INSTANCE_INVOKE_EXPR__PARAMETERS;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_INVOKE_EXPR__BASE = INSTANCE_INVOKE_EXPR__BASE;

  /**
   * The number of structural features of the '<em>Special Invoke Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_INVOKE_EXPR_FEATURE_COUNT = INSTANCE_INVOKE_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.VirtualInvokeExprImpl <em>Virtual Invoke Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.VirtualInvokeExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getVirtualInvokeExpr()
   * @generated
   */
  int VIRTUAL_INVOKE_EXPR = 67;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_INVOKE_EXPR__METHOD = INSTANCE_INVOKE_EXPR__METHOD;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_INVOKE_EXPR__PARAMETERS = INSTANCE_INVOKE_EXPR__PARAMETERS;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_INVOKE_EXPR__BASE = INSTANCE_INVOKE_EXPR__BASE;

  /**
   * The number of structural features of the '<em>Virtual Invoke Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_INVOKE_EXPR_FEATURE_COUNT = INSTANCE_INVOKE_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RefImpl <em>Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getRef()
   * @generated
   */
  int REF = 78;

  /**
   * The number of structural features of the '<em>Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FEATURE_COUNT = NON_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalOrWildcardImpl <em>Local Or Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalOrWildcardImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLocalOrWildcard()
   * @generated
   */
  int LOCAL_OR_WILDCARD = 68;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OR_WILDCARD__NAME = REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Or Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OR_WILDCARD_FEATURE_COUNT = REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.WildcardImpl <em>Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.WildcardImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getWildcard()
   * @generated
   */
  int WILDCARD = 69;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD__NAME = LOCAL_OR_WILDCARD__NAME;

  /**
   * The number of structural features of the '<em>Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_FEATURE_COUNT = LOCAL_OR_WILDCARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewArrayExprImpl <em>New Array Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewArrayExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNewArrayExpr()
   * @generated
   */
  int NEW_ARRAY_EXPR = 70;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARRAY_EXPR__TYPE = ANY_NEW_EXPR__TYPE;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARRAY_EXPR__SIZE = ANY_NEW_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Array Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARRAY_EXPR_FEATURE_COUNT = ANY_NEW_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewExprImpl <em>New Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNewExpr()
   * @generated
   */
  int NEW_EXPR = 71;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPR__TYPE = ANY_NEW_EXPR__TYPE;

  /**
   * The number of structural features of the '<em>New Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPR_FEATURE_COUNT = ANY_NEW_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewMultiArrayExprImpl <em>New Multi Array Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewMultiArrayExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNewMultiArrayExpr()
   * @generated
   */
  int NEW_MULTI_ARRAY_EXPR = 72;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MULTI_ARRAY_EXPR__TYPE = ANY_NEW_EXPR__TYPE;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MULTI_ARRAY_EXPR__SIZE = ANY_NEW_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Empty Size</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE = ANY_NEW_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>New Multi Array Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MULTI_ARRAY_EXPR_FEATURE_COUNT = ANY_NEW_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DimensionImpl <em>Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DimensionImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDimension()
   * @generated
   */
  int DIMENSION = 73;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION__SIZE = 0;

  /**
   * The number of structural features of the '<em>Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UnopExprImpl <em>Unop Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UnopExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getUnopExpr()
   * @generated
   */
  int UNOP_EXPR = 74;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNOP_EXPR__OPERAND = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unop Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNOP_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LengthExprImpl <em>Length Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LengthExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLengthExpr()
   * @generated
   */
  int LENGTH_EXPR = 75;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_EXPR__OPERAND = UNOP_EXPR__OPERAND;

  /**
   * The number of structural features of the '<em>Length Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_EXPR_FEATURE_COUNT = UNOP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NegExprImpl <em>Neg Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NegExprImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNegExpr()
   * @generated
   */
  int NEG_EXPR = 76;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPR__OPERAND = UNOP_EXPR__OPERAND;

  /**
   * The number of structural features of the '<em>Neg Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPR_FEATURE_COUNT = UNOP_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalImpl <em>Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLocal()
   * @generated
   */
  int LOCAL = 77;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL__NAME = LOCAL_OR_WILDCARD__NAME;

  /**
   * The number of structural features of the '<em>Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FEATURE_COUNT = LOCAL_OR_WILDCARD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityRefImpl <em>Identity Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIdentityRef()
   * @generated
   */
  int IDENTITY_REF = 79;

  /**
   * The number of structural features of the '<em>Identity Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ParameterRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getParameterRef()
   * @generated
   */
  int PARAMETER_REF = 80;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF__NAME = IDENTITY_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF__TYPE = IDENTITY_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF_FEATURE_COUNT = IDENTITY_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThisRefImpl <em>This Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThisRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getThisRef()
   * @generated
   */
  int THIS_REF = 81;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_REF__TYPE = IDENTITY_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>This Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_REF_FEATURE_COUNT = IDENTITY_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaughtExceptionRefImpl <em>Caught Exception Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaughtExceptionRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCaughtExceptionRef()
   * @generated
   */
  int CAUGHT_EXCEPTION_REF = 82;

  /**
   * The number of structural features of the '<em>Caught Exception Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUGHT_EXCEPTION_REF_FEATURE_COUNT = IDENTITY_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConcreteRefImpl <em>Concrete Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConcreteRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getConcreteRef()
   * @generated
   */
  int CONCRETE_REF = 83;

  /**
   * The number of structural features of the '<em>Concrete Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ArrayRefImpl <em>Array Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ArrayRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getArrayRef()
   * @generated
   */
  int ARRAY_REF = 84;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_REF__BASE = CONCRETE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_REF__INDEX = CONCRETE_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_REF_FEATURE_COUNT = CONCRETE_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldRefImpl <em>Field Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getFieldRef()
   * @generated
   */
  int FIELD_REF = 85;

  /**
   * The number of structural features of the '<em>Field Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REF_FEATURE_COUNT = CONCRETE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticFieldRefImpl <em>Static Field Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticFieldRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStaticFieldRef()
   * @generated
   */
  int STATIC_FIELD_REF = 86;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FIELD_REF__FIELD_REF = FIELD_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static Field Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FIELD_REF_FEATURE_COUNT = FIELD_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootFieldRefImpl <em>Soot Field Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootFieldRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSootFieldRef()
   * @generated
   */
  int SOOT_FIELD_REF = 87;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_FIELD_REF__CLASS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_FIELD_REF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_FIELD_REF__NAME = 2;

  /**
   * The number of structural features of the '<em>Soot Field Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOOT_FIELD_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceFieldRefImpl <em>Instance Field Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceFieldRefImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInstanceFieldRef()
   * @generated
   */
  int INSTANCE_FIELD_REF = 88;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FIELD_REF__BASE = FIELD_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FIELD_REF__FIELD_REF = FIELD_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance Field Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FIELD_REF_FEATURE_COUNT = FIELD_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 89;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = NON_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ClassConstantImpl <em>Class Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ClassConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getClassConstant()
   * @generated
   */
  int CLASS_CONSTANT = 90;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTANT__NAME = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NullConstantImpl <em>Null Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NullConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNullConstant()
   * @generated
   */
  int NULL_CONSTANT = 91;

  /**
   * The number of structural features of the '<em>Null Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NumericConstantImpl <em>Numeric Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NumericConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNumericConstant()
   * @generated
   */
  int NUMERIC_CONSTANT = 92;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IntConstantImpl <em>Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IntConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIntConstant()
   * @generated
   */
  int INT_CONSTANT = 93;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__VALUE = NUMERIC_CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_FEATURE_COUNT = NUMERIC_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LongConstantImpl <em>Long Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LongConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLongConstant()
   * @generated
   */
  int LONG_CONSTANT = 94;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_CONSTANT__VALUE = NUMERIC_CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Long Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_CONSTANT_FEATURE_COUNT = NUMERIC_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DoubleConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDoubleConstant()
   * @generated
   */
  int DOUBLE_CONSTANT = 95;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT__VALUE = NUMERIC_CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Double Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONSTANT_FEATURE_COUNT = NUMERIC_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FloatConstantImpl <em>Float Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FloatConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getFloatConstant()
   * @generated
   */
  int FLOAT_CONSTANT = 96;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__VALUE = NUMERIC_CONSTANT__VALUE;

  /**
   * The number of structural features of the '<em>Float Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT_FEATURE_COUNT = NUMERIC_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StringConstantImpl
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 97;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 98;


  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation#getPattern()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Transformation#getReplacement()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Replacement();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern <em>Sequence Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Pattern</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern
   * @generated
   */
  EClass getSequencePattern();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SequencePattern#getSequence()
   * @see #getSequencePattern()
   * @generated
   */
  EReference getSequencePattern_Sequence();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern <em>Method Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Pattern</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern
   * @generated
   */
  EClass getMethodPattern();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MethodPattern#getMethod()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_Method();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern <em>Type Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Pattern</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern
   * @generated
   */
  EClass getTypePattern();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TypePattern#getType()
   * @see #getTypePattern()
   * @generated
   */
  EReference getTypePattern_Type();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Replacement</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement
   * @generated
   */
  EClass getReplacement();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getSequence()
   * @see #getReplacement()
   * @generated
   */
  EReference getReplacement_Sequence();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getMethod()
   * @see #getReplacement()
   * @generated
   */
  EReference getReplacement_Method();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Replacement#getType()
   * @see #getReplacement()
   * @generated
   */
  EReference getReplacement_Type();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getVisibility()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Visibility();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#isClass <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#isClass()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Class();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#isInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#isInterface()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Interface();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super Class</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getSuperClass()
   * @see #getType()
   * @generated
   */
  EAttribute getType_SuperClass();

  /**
   * Returns the meta object for the attribute list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getInterfaces()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Interfaces();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getFields()
   * @see #getType()
   * @generated
   */
  EReference getType_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Type#getMethods()
   * @see #getType()
   * @generated
   */
  EReference getType_Methods();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#getVisibility()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Visibility();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#isStatic()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Static();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#getType()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Type();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getVisibility()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Visibility();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#isStatic()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Static();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the attribute list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getParameters()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body#getDeclarations()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Body#getStatements()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Statements();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Sequence</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence
   * @generated
   */
  EClass getStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StatementSequence#getStatements()
   * @see #getStatementSequence()
   * @generated
   */
  EReference getStatementSequence_Statements();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration#getType()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Type();

  /**
   * Returns the meta object for the attribute list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration#getLocals <em>Locals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Locals</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Declaration#getLocals()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Locals();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LabelOrStatement <em>Label Or Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Or Statement</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LabelOrStatement
   * @generated
   */
  EClass getLabelOrStatement();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BreakpointStmt <em>Breakpoint Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Breakpoint Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.BreakpointStmt
   * @generated
   */
  EClass getBreakpointStmt();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.DefinitionStmt <em>Definition Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.DefinitionStmt
   * @generated
   */
  EClass getDefinitionStmt();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt <em>Assign Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt
   * @generated
   */
  EClass getAssignStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getLhs()
   * @see #getAssignStmt()
   * @generated
   */
  EReference getAssignStmt_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AssignStmt#getRhs()
   * @see #getAssignStmt()
   * @generated
   */
  EReference getAssignStmt_Rhs();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt <em>Identity Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt
   * @generated
   */
  EClass getIdentityStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt#getLhs()
   * @see #getIdentityStmt()
   * @generated
   */
  EReference getIdentityStmt_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityStmt#getRhs()
   * @see #getIdentityStmt()
   * @generated
   */
  EReference getIdentityStmt_Rhs();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt <em>Goto Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt
   * @generated
   */
  EClass getGotoStmt();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.GotoStmt#getTarget()
   * @see #getGotoStmt()
   * @generated
   */
  EAttribute getGotoStmt_Target();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt <em>If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt
   * @generated
   */
  EClass getIfStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt#getCondition()
   * @see #getIfStmt()
   * @generated
   */
  EReference getIfStmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IfStmt#getThen()
   * @see #getIfStmt()
   * @generated
   */
  EReference getIfStmt_Then();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt <em>Invoke Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt
   * @generated
   */
  EClass getInvokeStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt#getInvokeExpr <em>Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invoke Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeStmt#getInvokeExpr()
   * @see #getInvokeStmt()
   * @generated
   */
  EReference getInvokeStmt_InvokeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt <em>Table Switch Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Switch Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt
   * @generated
   */
  EClass getTableSwitchStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt#getKey()
   * @see #getTableSwitchStmt()
   * @generated
   */
  EReference getTableSwitchStmt_Key();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt#getCases()
   * @see #getTableSwitchStmt()
   * @generated
   */
  EReference getTableSwitchStmt_Cases();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.TableSwitchStmt#getDefault()
   * @see #getTableSwitchStmt()
   * @generated
   */
  EReference getTableSwitchStmt_Default();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LookupSwitchStmt <em>Lookup Switch Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lookup Switch Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LookupSwitchStmt
   * @generated
   */
  EClass getLookupSwitchStmt();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MonitorStmt <em>Monitor Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitor Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MonitorStmt
   * @generated
   */
  EClass getMonitorStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MonitorStmt#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MonitorStmt#getOperand()
   * @see #getMonitorStmt()
   * @generated
   */
  EReference getMonitorStmt_Operand();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.EnterMonitorStmt <em>Enter Monitor Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enter Monitor Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.EnterMonitorStmt
   * @generated
   */
  EClass getEnterMonitorStmt();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ExitMonitorStmt <em>Exit Monitor Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Monitor Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ExitMonitorStmt
   * @generated
   */
  EClass getExitMonitorStmt();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NopStmt <em>Nop Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nop Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NopStmt
   * @generated
   */
  EClass getNopStmt();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.RetStmt <em>Ret Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ret Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.RetStmt
   * @generated
   */
  EClass getRetStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.RetStmt#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.RetStmt#getTarget()
   * @see #getRetStmt()
   * @generated
   */
  EReference getRetStmt_Target();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnVoidStmt <em>Return Void Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Void Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnVoidStmt
   * @generated
   */
  EClass getReturnVoidStmt();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnStmt <em>Return Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnStmt
   * @generated
   */
  EClass getReturnStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnStmt#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ReturnStmt#getOperand()
   * @see #getReturnStmt()
   * @generated
   */
  EReference getReturnStmt_Operand();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case#getValue()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_Value();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Case#getTarget()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Target();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt <em>Throw Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Throw Stmt</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt
   * @generated
   */
  EClass getThrowStmt();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThrowStmt#getOperand()
   * @see #getThrowStmt()
   * @generated
   */
  EReference getThrowStmt_Operand();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NonExpr <em>Non Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NonExpr
   * @generated
   */
  EClass getNonExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AnyNewExpr <em>Any New Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any New Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AnyNewExpr
   * @generated
   */
  EClass getAnyNewExpr();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AnyNewExpr#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AnyNewExpr#getType()
   * @see #getAnyNewExpr()
   * @generated
   */
  EAttribute getAnyNewExpr_Type();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr <em>Bin Op Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bin Op Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr
   * @generated
   */
  EClass getBinOpExpr();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getLeftOp <em>Left Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Op</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getLeftOp()
   * @see #getBinOpExpr()
   * @generated
   */
  EReference getBinOpExpr_LeftOp();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getRightOp <em>Right Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Op</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.BinOpExpr#getRightOp()
   * @see #getBinOpExpr()
   * @generated
   */
  EReference getBinOpExpr_RightOp();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AddExpr <em>Add Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AddExpr
   * @generated
   */
  EClass getAddExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.AndExpr
   * @generated
   */
  EClass getAndExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpExpr <em>Cmp Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cmp Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpExpr
   * @generated
   */
  EClass getCmpExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpgExpr <em>Cmpg Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cmpg Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmpgExpr
   * @generated
   */
  EClass getCmpgExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmplExpr <em>Cmpl Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cmpl Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CmplExpr
   * @generated
   */
  EClass getCmplExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConditionalExpr <em>Conditional Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConditionalExpr
   * @generated
   */
  EClass getConditionalExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.DivExpr <em>Div Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.DivExpr
   * @generated
   */
  EClass getDivExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.MulExpr <em>Mul Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.MulExpr
   * @generated
   */
  EClass getMulExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.RemExpr <em>Rem Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rem Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.RemExpr
   * @generated
   */
  EClass getRemExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShlExpr <em>Shl Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shl Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShlExpr
   * @generated
   */
  EClass getShlExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShrExpr <em>Shr Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shr Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ShrExpr
   * @generated
   */
  EClass getShrExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SubExpr <em>Sub Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SubExpr
   * @generated
   */
  EClass getSubExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.UshrExpr <em>Ushr Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ushr Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.UshrExpr
   * @generated
   */
  EClass getUshrExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.XorExpr <em>Xor Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.XorExpr
   * @generated
   */
  EClass getXorExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.EqExpr <em>Eq Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.EqExpr
   * @generated
   */
  EClass getEqExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.GeExpr <em>Ge Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ge Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.GeExpr
   * @generated
   */
  EClass getGeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.GtExpr <em>Gt Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gt Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.GtExpr
   * @generated
   */
  EClass getGtExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LeExpr <em>Le Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Le Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LeExpr
   * @generated
   */
  EClass getLeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LtExpr <em>Lt Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lt Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LtExpr
   * @generated
   */
  EClass getLtExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NeExpr <em>Ne Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ne Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NeExpr
   * @generated
   */
  EClass getNeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr
   * @generated
   */
  EClass getCastExpr();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr#getType()
   * @see #getCastExpr()
   * @generated
   */
  EAttribute getCastExpr_Type();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CastExpr#getOperand()
   * @see #getCastExpr()
   * @generated
   */
  EReference getCastExpr_Operand();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr <em>Instance Of Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Of Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr
   * @generated
   */
  EClass getInstanceOfExpr();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getOperand()
   * @see #getInstanceOfExpr()
   * @generated
   */
  EReference getInstanceOfExpr_Operand();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceOfExpr#getType()
   * @see #getInstanceOfExpr()
   * @generated
   */
  EAttribute getInstanceOfExpr_Type();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef <em>Soot Method Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Soot Method Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef
   * @generated
   */
  EClass getSootMethodRef();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getClass_()
   * @see #getSootMethodRef()
   * @generated
   */
  EAttribute getSootMethodRef_Class();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getType()
   * @see #getSootMethodRef()
   * @generated
   */
  EAttribute getSootMethodRef_Type();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getName()
   * @see #getSootMethodRef()
   * @generated
   */
  EAttribute getSootMethodRef_Name();

  /**
   * Returns the meta object for the attribute list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootMethodRef#getParameters()
   * @see #getSootMethodRef()
   * @generated
   */
  EAttribute getSootMethodRef_Parameters();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr <em>Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr
   * @generated
   */
  EClass getInvokeExpr();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr#getMethod()
   * @see #getInvokeExpr()
   * @generated
   */
  EReference getInvokeExpr_Method();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InvokeExpr#getParameters()
   * @see #getInvokeExpr()
   * @generated
   */
  EReference getInvokeExpr_Parameters();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceInvokeExpr <em>Instance Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Invoke Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceInvokeExpr
   * @generated
   */
  EClass getInstanceInvokeExpr();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceInvokeExpr#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceInvokeExpr#getBase()
   * @see #getInstanceInvokeExpr()
   * @generated
   */
  EReference getInstanceInvokeExpr_Base();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticInvokeExpr <em>Static Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Invoke Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticInvokeExpr
   * @generated
   */
  EClass getStaticInvokeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InterfaceInvokeExpr <em>Interface Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Invoke Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InterfaceInvokeExpr
   * @generated
   */
  EClass getInterfaceInvokeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SpecialInvokeExpr <em>Special Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Invoke Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SpecialInvokeExpr
   * @generated
   */
  EClass getSpecialInvokeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.VirtualInvokeExpr <em>Virtual Invoke Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Invoke Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.VirtualInvokeExpr
   * @generated
   */
  EClass getVirtualInvokeExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard <em>Local Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Or Wildcard</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard
   * @generated
   */
  EClass getLocalOrWildcard();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LocalOrWildcard#getName()
   * @see #getLocalOrWildcard()
   * @generated
   */
  EAttribute getLocalOrWildcard_Name();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Wildcard
   * @generated
   */
  EClass getWildcard();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr <em>New Array Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Array Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr
   * @generated
   */
  EClass getNewArrayExpr();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewArrayExpr#getSize()
   * @see #getNewArrayExpr()
   * @generated
   */
  EReference getNewArrayExpr_Size();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewExpr <em>New Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewExpr
   * @generated
   */
  EClass getNewExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr <em>New Multi Array Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Multi Array Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr
   * @generated
   */
  EClass getNewMultiArrayExpr();

  /**
   * Returns the meta object for the containment reference list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Size</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr#getSize()
   * @see #getNewMultiArrayExpr()
   * @generated
   */
  EReference getNewMultiArrayExpr_Size();

  /**
   * Returns the meta object for the attribute list '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr#getEmptySize <em>Empty Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Empty Size</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NewMultiArrayExpr#getEmptySize()
   * @see #getNewMultiArrayExpr()
   * @generated
   */
  EAttribute getNewMultiArrayExpr_EmptySize();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension
   * @generated
   */
  EClass getDimension();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Dimension#getSize()
   * @see #getDimension()
   * @generated
   */
  EAttribute getDimension_Size();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.UnopExpr <em>Unop Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unop Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.UnopExpr
   * @generated
   */
  EClass getUnopExpr();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.UnopExpr#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.UnopExpr#getOperand()
   * @see #getUnopExpr()
   * @generated
   */
  EReference getUnopExpr_Operand();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LengthExpr <em>Length Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LengthExpr
   * @generated
   */
  EClass getLengthExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NegExpr <em>Neg Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg Expr</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NegExpr
   * @generated
   */
  EClass getNegExpr();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Local <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Local
   * @generated
   */
  EClass getLocal();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Ref
   * @generated
   */
  EClass getRef();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityRef <em>Identity Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IdentityRef
   * @generated
   */
  EClass getIdentityRef();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef <em>Parameter Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef
   * @generated
   */
  EClass getParameterRef();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef#getName()
   * @see #getParameterRef()
   * @generated
   */
  EAttribute getParameterRef_Name();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ParameterRef#getType()
   * @see #getParameterRef()
   * @generated
   */
  EAttribute getParameterRef_Type();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef <em>This Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef
   * @generated
   */
  EClass getThisRef();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ThisRef#getType()
   * @see #getThisRef()
   * @generated
   */
  EAttribute getThisRef_Type();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.CaughtExceptionRef <em>Caught Exception Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Caught Exception Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.CaughtExceptionRef
   * @generated
   */
  EClass getCaughtExceptionRef();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConcreteRef <em>Concrete Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ConcreteRef
   * @generated
   */
  EClass getConcreteRef();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef <em>Array Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef
   * @generated
   */
  EClass getArrayRef();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef#getBase()
   * @see #getArrayRef()
   * @generated
   */
  EReference getArrayRef_Base();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ArrayRef#getIndex()
   * @see #getArrayRef()
   * @generated
   */
  EReference getArrayRef_Index();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.FieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.FieldRef
   * @generated
   */
  EClass getFieldRef();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef <em>Static Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Field Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef
   * @generated
   */
  EClass getStaticFieldRef();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StaticFieldRef#getFieldRef()
   * @see #getStaticFieldRef()
   * @generated
   */
  EReference getStaticFieldRef_FieldRef();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef <em>Soot Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Soot Field Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef
   * @generated
   */
  EClass getSootFieldRef();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef#getClass_()
   * @see #getSootFieldRef()
   * @generated
   */
  EAttribute getSootFieldRef_Class();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef#getType()
   * @see #getSootFieldRef()
   * @generated
   */
  EAttribute getSootFieldRef_Type();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.SootFieldRef#getName()
   * @see #getSootFieldRef()
   * @generated
   */
  EAttribute getSootFieldRef_Name();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef <em>Instance Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Field Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef
   * @generated
   */
  EClass getInstanceFieldRef();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef#getBase()
   * @see #getInstanceFieldRef()
   * @generated
   */
  EReference getInstanceFieldRef_Base();

  /**
   * Returns the meta object for the containment reference '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Ref</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.InstanceFieldRef#getFieldRef()
   * @see #getInstanceFieldRef()
   * @generated
   */
  EReference getInstanceFieldRef_FieldRef();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant <em>Class Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant
   * @generated
   */
  EClass getClassConstant();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.ClassConstant#getName()
   * @see #getClassConstant()
   * @generated
   */
  EAttribute getClassConstant_Name();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NullConstant <em>Null Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NullConstant
   * @generated
   */
  EClass getNullConstant();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NumericConstant <em>Numeric Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NumericConstant
   * @generated
   */
  EClass getNumericConstant();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.NumericConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.NumericConstant#getValue()
   * @see #getNumericConstant()
   * @generated
   */
  EAttribute getNumericConstant_Value();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.IntConstant
   * @generated
   */
  EClass getIntConstant();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.LongConstant <em>Long Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.LongConstant
   * @generated
   */
  EClass getLongConstant();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.DoubleConstant <em>Double Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.DoubleConstant
   * @generated
   */
  EClass getDoubleConstant();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.FloatConstant <em>Float Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.FloatConstant
   * @generated
   */
  EClass getFloatConstant();

  /**
   * Returns the meta object for class '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant
   * @generated
   */
  EClass getStringConstant();

  /**
   * Returns the meta object for the attribute '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.StringConstant#getValue()
   * @see #getStringConstant()
   * @generated
   */
  EAttribute getStringConstant_Value();

  /**
   * Returns the meta object for enum '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TransformationLanguageFactory getTransformationLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__PATTERN = eINSTANCE.getTransformation_Pattern();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__REPLACEMENT = eINSTANCE.getTransformation_Replacement();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.PatternImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SequencePatternImpl <em>Sequence Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SequencePatternImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSequencePattern()
     * @generated
     */
    EClass SEQUENCE_PATTERN = eINSTANCE.getSequencePattern();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_PATTERN__SEQUENCE = eINSTANCE.getSequencePattern_Sequence();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodPatternImpl <em>Method Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodPatternImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMethodPattern()
     * @generated
     */
    EClass METHOD_PATTERN = eINSTANCE.getMethodPattern();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__METHOD = eINSTANCE.getMethodPattern_Method();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypePatternImpl <em>Type Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypePatternImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getTypePattern()
     * @generated
     */
    EClass TYPE_PATTERN = eINSTANCE.getTypePattern();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PATTERN__TYPE = eINSTANCE.getTypePattern_Type();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReplacementImpl <em>Replacement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReplacementImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getReplacement()
     * @generated
     */
    EClass REPLACEMENT = eINSTANCE.getReplacement();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACEMENT__SEQUENCE = eINSTANCE.getReplacement_Sequence();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACEMENT__METHOD = eINSTANCE.getReplacement_Method();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACEMENT__TYPE = eINSTANCE.getReplacement_Type();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TypeImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__VISIBILITY = eINSTANCE.getType_Visibility();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__CLASS = eINSTANCE.getType_Class();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__INTERFACE = eINSTANCE.getType_Interface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Super Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__SUPER_CLASS = eINSTANCE.getType_SuperClass();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__INTERFACES = eINSTANCE.getType_Interfaces();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__FIELDS = eINSTANCE.getType_Fields();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__METHODS = eINSTANCE.getType_Methods();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__VISIBILITY = eINSTANCE.getField_Visibility();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__STATIC = eINSTANCE.getField_Static();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MethodImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__STATIC = eINSTANCE.getMethod_Static();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__TYPE = eINSTANCE.getMethod_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BodyImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__DECLARATIONS = eINSTANCE.getBody_Declarations();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__STATEMENTS = eINSTANCE.getBody_Statements();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementSequenceImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStatementSequence()
     * @generated
     */
    EClass STATEMENT_SEQUENCE = eINSTANCE.getStatementSequence();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_SEQUENCE__STATEMENTS = eINSTANCE.getStatementSequence_Statements();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DeclarationImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__TYPE = eINSTANCE.getDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Locals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__LOCALS = eINSTANCE.getDeclaration_Locals();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelOrStatementImpl <em>Label Or Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelOrStatementImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLabelOrStatement()
     * @generated
     */
    EClass LABEL_OR_STATEMENT = eINSTANCE.getLabelOrStatement();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StatementImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LabelImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BreakpointStmtImpl <em>Breakpoint Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BreakpointStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getBreakpointStmt()
     * @generated
     */
    EClass BREAKPOINT_STMT = eINSTANCE.getBreakpointStmt();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DefinitionStmtImpl <em>Definition Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DefinitionStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDefinitionStmt()
     * @generated
     */
    EClass DEFINITION_STMT = eINSTANCE.getDefinitionStmt();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AssignStmtImpl <em>Assign Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AssignStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAssignStmt()
     * @generated
     */
    EClass ASSIGN_STMT = eINSTANCE.getAssignStmt();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_STMT__LHS = eINSTANCE.getAssignStmt_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_STMT__RHS = eINSTANCE.getAssignStmt_Rhs();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityStmtImpl <em>Identity Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIdentityStmt()
     * @generated
     */
    EClass IDENTITY_STMT = eINSTANCE.getIdentityStmt();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTITY_STMT__LHS = eINSTANCE.getIdentityStmt_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTITY_STMT__RHS = eINSTANCE.getIdentityStmt_Rhs();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GotoStmtImpl <em>Goto Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GotoStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getGotoStmt()
     * @generated
     */
    EClass GOTO_STMT = eINSTANCE.getGotoStmt();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOTO_STMT__TARGET = eINSTANCE.getGotoStmt_Target();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IfStmtImpl <em>If Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IfStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIfStmt()
     * @generated
     */
    EClass IF_STMT = eINSTANCE.getIfStmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__CONDITION = eINSTANCE.getIfStmt_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__THEN = eINSTANCE.getIfStmt_Then();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeStmtImpl <em>Invoke Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInvokeStmt()
     * @generated
     */
    EClass INVOKE_STMT = eINSTANCE.getInvokeStmt();

    /**
     * The meta object literal for the '<em><b>Invoke Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE_STMT__INVOKE_EXPR = eINSTANCE.getInvokeStmt_InvokeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TableSwitchStmtImpl <em>Table Switch Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TableSwitchStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getTableSwitchStmt()
     * @generated
     */
    EClass TABLE_SWITCH_STMT = eINSTANCE.getTableSwitchStmt();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_SWITCH_STMT__KEY = eINSTANCE.getTableSwitchStmt_Key();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_SWITCH_STMT__CASES = eINSTANCE.getTableSwitchStmt_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_SWITCH_STMT__DEFAULT = eINSTANCE.getTableSwitchStmt_Default();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LookupSwitchStmtImpl <em>Lookup Switch Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LookupSwitchStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLookupSwitchStmt()
     * @generated
     */
    EClass LOOKUP_SWITCH_STMT = eINSTANCE.getLookupSwitchStmt();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MonitorStmtImpl <em>Monitor Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MonitorStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMonitorStmt()
     * @generated
     */
    EClass MONITOR_STMT = eINSTANCE.getMonitorStmt();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONITOR_STMT__OPERAND = eINSTANCE.getMonitorStmt_Operand();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EnterMonitorStmtImpl <em>Enter Monitor Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EnterMonitorStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getEnterMonitorStmt()
     * @generated
     */
    EClass ENTER_MONITOR_STMT = eINSTANCE.getEnterMonitorStmt();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExitMonitorStmtImpl <em>Exit Monitor Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExitMonitorStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getExitMonitorStmt()
     * @generated
     */
    EClass EXIT_MONITOR_STMT = eINSTANCE.getExitMonitorStmt();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NopStmtImpl <em>Nop Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NopStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNopStmt()
     * @generated
     */
    EClass NOP_STMT = eINSTANCE.getNopStmt();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RetStmtImpl <em>Ret Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RetStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getRetStmt()
     * @generated
     */
    EClass RET_STMT = eINSTANCE.getRetStmt();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RET_STMT__TARGET = eINSTANCE.getRetStmt_Target();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnVoidStmtImpl <em>Return Void Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnVoidStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getReturnVoidStmt()
     * @generated
     */
    EClass RETURN_VOID_STMT = eINSTANCE.getReturnVoidStmt();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnStmtImpl <em>Return Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ReturnStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getReturnStmt()
     * @generated
     */
    EClass RETURN_STMT = eINSTANCE.getReturnStmt();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STMT__OPERAND = eINSTANCE.getReturnStmt_Operand();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaseImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__VALUE = eINSTANCE.getCase_Value();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__TARGET = eINSTANCE.getCase_Target();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThrowStmtImpl <em>Throw Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThrowStmtImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getThrowStmt()
     * @generated
     */
    EClass THROW_STMT = eINSTANCE.getThrowStmt();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THROW_STMT__OPERAND = eINSTANCE.getThrowStmt_Operand();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ValueImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NonExprImpl <em>Non Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NonExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNonExpr()
     * @generated
     */
    EClass NON_EXPR = eINSTANCE.getNonExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AnyNewExprImpl <em>Any New Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AnyNewExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAnyNewExpr()
     * @generated
     */
    EClass ANY_NEW_EXPR = eINSTANCE.getAnyNewExpr();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANY_NEW_EXPR__TYPE = eINSTANCE.getAnyNewExpr_Type();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BinOpExprImpl <em>Bin Op Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.BinOpExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getBinOpExpr()
     * @generated
     */
    EClass BIN_OP_EXPR = eINSTANCE.getBinOpExpr();

    /**
     * The meta object literal for the '<em><b>Left Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_OP_EXPR__LEFT_OP = eINSTANCE.getBinOpExpr_LeftOp();

    /**
     * The meta object literal for the '<em><b>Right Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_OP_EXPR__RIGHT_OP = eINSTANCE.getBinOpExpr_RightOp();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AddExprImpl <em>Add Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AddExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAddExpr()
     * @generated
     */
    EClass ADD_EXPR = eINSTANCE.getAddExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AndExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.AndExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getAndExpr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAndExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpExprImpl <em>Cmp Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCmpExpr()
     * @generated
     */
    EClass CMP_EXPR = eINSTANCE.getCmpExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpgExprImpl <em>Cmpg Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmpgExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCmpgExpr()
     * @generated
     */
    EClass CMPG_EXPR = eINSTANCE.getCmpgExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmplExprImpl <em>Cmpl Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CmplExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCmplExpr()
     * @generated
     */
    EClass CMPL_EXPR = eINSTANCE.getCmplExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConditionalExprImpl <em>Conditional Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConditionalExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getConditionalExpr()
     * @generated
     */
    EClass CONDITIONAL_EXPR = eINSTANCE.getConditionalExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DivExprImpl <em>Div Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DivExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDivExpr()
     * @generated
     */
    EClass DIV_EXPR = eINSTANCE.getDivExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MulExprImpl <em>Mul Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.MulExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getMulExpr()
     * @generated
     */
    EClass MUL_EXPR = eINSTANCE.getMulExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.OrExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RemExprImpl <em>Rem Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RemExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getRemExpr()
     * @generated
     */
    EClass REM_EXPR = eINSTANCE.getRemExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShlExprImpl <em>Shl Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShlExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getShlExpr()
     * @generated
     */
    EClass SHL_EXPR = eINSTANCE.getShlExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShrExprImpl <em>Shr Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ShrExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getShrExpr()
     * @generated
     */
    EClass SHR_EXPR = eINSTANCE.getShrExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SubExprImpl <em>Sub Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SubExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSubExpr()
     * @generated
     */
    EClass SUB_EXPR = eINSTANCE.getSubExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UshrExprImpl <em>Ushr Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UshrExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getUshrExpr()
     * @generated
     */
    EClass USHR_EXPR = eINSTANCE.getUshrExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.XorExprImpl <em>Xor Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.XorExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getXorExpr()
     * @generated
     */
    EClass XOR_EXPR = eINSTANCE.getXorExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EqExprImpl <em>Eq Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.EqExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getEqExpr()
     * @generated
     */
    EClass EQ_EXPR = eINSTANCE.getEqExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GeExprImpl <em>Ge Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getGeExpr()
     * @generated
     */
    EClass GE_EXPR = eINSTANCE.getGeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GtExprImpl <em>Gt Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.GtExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getGtExpr()
     * @generated
     */
    EClass GT_EXPR = eINSTANCE.getGtExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LeExprImpl <em>Le Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLeExpr()
     * @generated
     */
    EClass LE_EXPR = eINSTANCE.getLeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LtExprImpl <em>Lt Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LtExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLtExpr()
     * @generated
     */
    EClass LT_EXPR = eINSTANCE.getLtExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NeExprImpl <em>Ne Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNeExpr()
     * @generated
     */
    EClass NE_EXPR = eINSTANCE.getNeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CastExprImpl <em>Cast Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CastExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCastExpr()
     * @generated
     */
    EClass CAST_EXPR = eINSTANCE.getCastExpr();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST_EXPR__TYPE = eINSTANCE.getCastExpr_Type();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPR__OPERAND = eINSTANCE.getCastExpr_Operand();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceOfExprImpl <em>Instance Of Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceOfExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInstanceOfExpr()
     * @generated
     */
    EClass INSTANCE_OF_EXPR = eINSTANCE.getInstanceOfExpr();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OF_EXPR__OPERAND = eINSTANCE.getInstanceOfExpr_Operand();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE_OF_EXPR__TYPE = eINSTANCE.getInstanceOfExpr_Type();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootMethodRefImpl <em>Soot Method Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootMethodRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSootMethodRef()
     * @generated
     */
    EClass SOOT_METHOD_REF = eINSTANCE.getSootMethodRef();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOOT_METHOD_REF__CLASS = eINSTANCE.getSootMethodRef_Class();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOOT_METHOD_REF__TYPE = eINSTANCE.getSootMethodRef_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOOT_METHOD_REF__NAME = eINSTANCE.getSootMethodRef_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOOT_METHOD_REF__PARAMETERS = eINSTANCE.getSootMethodRef_Parameters();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeExprImpl <em>Invoke Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InvokeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInvokeExpr()
     * @generated
     */
    EClass INVOKE_EXPR = eINSTANCE.getInvokeExpr();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE_EXPR__METHOD = eINSTANCE.getInvokeExpr_Method();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE_EXPR__PARAMETERS = eINSTANCE.getInvokeExpr_Parameters();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceInvokeExprImpl <em>Instance Invoke Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceInvokeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInstanceInvokeExpr()
     * @generated
     */
    EClass INSTANCE_INVOKE_EXPR = eINSTANCE.getInstanceInvokeExpr();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_INVOKE_EXPR__BASE = eINSTANCE.getInstanceInvokeExpr_Base();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticInvokeExprImpl <em>Static Invoke Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticInvokeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStaticInvokeExpr()
     * @generated
     */
    EClass STATIC_INVOKE_EXPR = eINSTANCE.getStaticInvokeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InterfaceInvokeExprImpl <em>Interface Invoke Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InterfaceInvokeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInterfaceInvokeExpr()
     * @generated
     */
    EClass INTERFACE_INVOKE_EXPR = eINSTANCE.getInterfaceInvokeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SpecialInvokeExprImpl <em>Special Invoke Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SpecialInvokeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSpecialInvokeExpr()
     * @generated
     */
    EClass SPECIAL_INVOKE_EXPR = eINSTANCE.getSpecialInvokeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.VirtualInvokeExprImpl <em>Virtual Invoke Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.VirtualInvokeExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getVirtualInvokeExpr()
     * @generated
     */
    EClass VIRTUAL_INVOKE_EXPR = eINSTANCE.getVirtualInvokeExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalOrWildcardImpl <em>Local Or Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalOrWildcardImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLocalOrWildcard()
     * @generated
     */
    EClass LOCAL_OR_WILDCARD = eINSTANCE.getLocalOrWildcard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_OR_WILDCARD__NAME = eINSTANCE.getLocalOrWildcard_Name();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.WildcardImpl <em>Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.WildcardImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getWildcard()
     * @generated
     */
    EClass WILDCARD = eINSTANCE.getWildcard();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewArrayExprImpl <em>New Array Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewArrayExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNewArrayExpr()
     * @generated
     */
    EClass NEW_ARRAY_EXPR = eINSTANCE.getNewArrayExpr();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_ARRAY_EXPR__SIZE = eINSTANCE.getNewArrayExpr_Size();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewExprImpl <em>New Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNewExpr()
     * @generated
     */
    EClass NEW_EXPR = eINSTANCE.getNewExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewMultiArrayExprImpl <em>New Multi Array Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NewMultiArrayExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNewMultiArrayExpr()
     * @generated
     */
    EClass NEW_MULTI_ARRAY_EXPR = eINSTANCE.getNewMultiArrayExpr();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_MULTI_ARRAY_EXPR__SIZE = eINSTANCE.getNewMultiArrayExpr_Size();

    /**
     * The meta object literal for the '<em><b>Empty Size</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_MULTI_ARRAY_EXPR__EMPTY_SIZE = eINSTANCE.getNewMultiArrayExpr_EmptySize();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DimensionImpl <em>Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DimensionImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDimension()
     * @generated
     */
    EClass DIMENSION = eINSTANCE.getDimension();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION__SIZE = eINSTANCE.getDimension_Size();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UnopExprImpl <em>Unop Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.UnopExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getUnopExpr()
     * @generated
     */
    EClass UNOP_EXPR = eINSTANCE.getUnopExpr();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNOP_EXPR__OPERAND = eINSTANCE.getUnopExpr_Operand();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LengthExprImpl <em>Length Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LengthExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLengthExpr()
     * @generated
     */
    EClass LENGTH_EXPR = eINSTANCE.getLengthExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NegExprImpl <em>Neg Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NegExprImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNegExpr()
     * @generated
     */
    EClass NEG_EXPR = eINSTANCE.getNegExpr();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalImpl <em>Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LocalImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLocal()
     * @generated
     */
    EClass LOCAL = eINSTANCE.getLocal();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RefImpl <em>Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.RefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getRef()
     * @generated
     */
    EClass REF = eINSTANCE.getRef();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityRefImpl <em>Identity Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IdentityRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIdentityRef()
     * @generated
     */
    EClass IDENTITY_REF = eINSTANCE.getIdentityRef();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ParameterRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getParameterRef()
     * @generated
     */
    EClass PARAMETER_REF = eINSTANCE.getParameterRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_REF__NAME = eINSTANCE.getParameterRef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_REF__TYPE = eINSTANCE.getParameterRef_Type();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThisRefImpl <em>This Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ThisRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getThisRef()
     * @generated
     */
    EClass THIS_REF = eINSTANCE.getThisRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THIS_REF__TYPE = eINSTANCE.getThisRef_Type();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaughtExceptionRefImpl <em>Caught Exception Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.CaughtExceptionRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getCaughtExceptionRef()
     * @generated
     */
    EClass CAUGHT_EXCEPTION_REF = eINSTANCE.getCaughtExceptionRef();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConcreteRefImpl <em>Concrete Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConcreteRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getConcreteRef()
     * @generated
     */
    EClass CONCRETE_REF = eINSTANCE.getConcreteRef();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ArrayRefImpl <em>Array Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ArrayRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getArrayRef()
     * @generated
     */
    EClass ARRAY_REF = eINSTANCE.getArrayRef();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_REF__BASE = eINSTANCE.getArrayRef_Base();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_REF__INDEX = eINSTANCE.getArrayRef_Index();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldRefImpl <em>Field Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FieldRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getFieldRef()
     * @generated
     */
    EClass FIELD_REF = eINSTANCE.getFieldRef();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticFieldRefImpl <em>Static Field Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StaticFieldRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStaticFieldRef()
     * @generated
     */
    EClass STATIC_FIELD_REF = eINSTANCE.getStaticFieldRef();

    /**
     * The meta object literal for the '<em><b>Field Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_FIELD_REF__FIELD_REF = eINSTANCE.getStaticFieldRef_FieldRef();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootFieldRefImpl <em>Soot Field Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.SootFieldRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getSootFieldRef()
     * @generated
     */
    EClass SOOT_FIELD_REF = eINSTANCE.getSootFieldRef();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOOT_FIELD_REF__CLASS = eINSTANCE.getSootFieldRef_Class();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOOT_FIELD_REF__TYPE = eINSTANCE.getSootFieldRef_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOOT_FIELD_REF__NAME = eINSTANCE.getSootFieldRef_Name();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceFieldRefImpl <em>Instance Field Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.InstanceFieldRefImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getInstanceFieldRef()
     * @generated
     */
    EClass INSTANCE_FIELD_REF = eINSTANCE.getInstanceFieldRef();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_FIELD_REF__BASE = eINSTANCE.getInstanceFieldRef_Base();

    /**
     * The meta object literal for the '<em><b>Field Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_FIELD_REF__FIELD_REF = eINSTANCE.getInstanceFieldRef_FieldRef();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ClassConstantImpl <em>Class Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.ClassConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getClassConstant()
     * @generated
     */
    EClass CLASS_CONSTANT = eINSTANCE.getClassConstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_CONSTANT__NAME = eINSTANCE.getClassConstant_Name();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NullConstantImpl <em>Null Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NullConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNullConstant()
     * @generated
     */
    EClass NULL_CONSTANT = eINSTANCE.getNullConstant();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NumericConstantImpl <em>Numeric Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.NumericConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getNumericConstant()
     * @generated
     */
    EClass NUMERIC_CONSTANT = eINSTANCE.getNumericConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_CONSTANT__VALUE = eINSTANCE.getNumericConstant_Value();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IntConstantImpl <em>Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.IntConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getIntConstant()
     * @generated
     */
    EClass INT_CONSTANT = eINSTANCE.getIntConstant();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LongConstantImpl <em>Long Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.LongConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getLongConstant()
     * @generated
     */
    EClass LONG_CONSTANT = eINSTANCE.getLongConstant();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DoubleConstantImpl <em>Double Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.DoubleConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getDoubleConstant()
     * @generated
     */
    EClass DOUBLE_CONSTANT = eINSTANCE.getDoubleConstant();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FloatConstantImpl <em>Float Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.FloatConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getFloatConstant()
     * @generated
     */
    EClass FLOAT_CONSTANT = eINSTANCE.getFloatConstant();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StringConstantImpl <em>String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.StringConstantImpl
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getStringConstant()
     * @generated
     */
    EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

    /**
     * The meta object literal for the '{@link soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.Visibility
     * @see soot.jimple.toolkits.transformation.dsl.transformationLanguage.impl.TransformationLanguagePackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

  }

} //TransformationLanguagePackage
