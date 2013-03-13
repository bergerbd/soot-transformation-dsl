package soot.jimple.toolkits.transformation.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import soot.jimple.toolkits.transformation.dsl.services.TransformationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTransformationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LABELNAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u00ABtransformation\\u00BB'", "'\\u00ABreplace\\u00BB'", "'\\u00ABend\\u00BB'", "'\\u00ABby\\u00BB'", "'class'", "'interface'", "'extends'", "'implements'", "','", "'{'", "'}'", "'static'", "';'", "'('", "')'", "':'", "'breakpoint'", "'='", "':='", "'goto'", "'if'", "'tableswitch'", "'default'", "'lookupswitch'", "'entermonitor'", "'exitmonitor'", "'nop'", "'ret'", "'return'", "'case'", "'+'", "'&'", "'cmp'", "'cmpg'", "'cmpl'", "'/'", "'*'", "'|'", "'%'", "'<<'", "'>>'", "'-'", "'>>>'", "'^'", "'=='", "'>='", "'>'", "'<='", "'<'", "'!='", "'instanceof'", "'staticinvoke'", "'interfaceinvoke'", "'.'", "'specialinvoke'", "'virtualinvoke'", "'\\u00AB'", "'\\u00BB'", "'newarray'", "'new'", "'newmultiarray'", "'[]'", "'['", "']'", "'lengthof'", "'neg'", "'@'", "'this'", "'caughtexception'", "'null'", "'L'", "'D'", "'F'", "'package'", "'public'", "'protected'", "'private'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_LABELNAME=5;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalTransformationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTransformationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTransformationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private TransformationLanguageGrammarAccess grammarAccess;
     	
        public InternalTransformationLanguageParser(TokenStream input, TransformationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Transformation";	
       	}
       	
       	@Override
       	protected TransformationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTransformation"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:74:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:75:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:76:2: iv_ruleTransformation= ruleTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationRule()); 
            }
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation81);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:83:1: ruleTransformation returns [EObject current=null] : (otherlv_0= '\\u00ABtransformation\\u00BB' otherlv_1= '\\u00ABreplace\\u00BB' ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= '\\u00ABend\\u00BB' otherlv_4= '\\u00ABby\\u00BB' ( (lv_replacement_5_0= ruleReplacement ) ) otherlv_6= '\\u00ABend\\u00BB' otherlv_7= '\\u00ABend\\u00BB' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_pattern_2_0 = null;

        EObject lv_replacement_5_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:86:28: ( (otherlv_0= '\\u00ABtransformation\\u00BB' otherlv_1= '\\u00ABreplace\\u00BB' ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= '\\u00ABend\\u00BB' otherlv_4= '\\u00ABby\\u00BB' ( (lv_replacement_5_0= ruleReplacement ) ) otherlv_6= '\\u00ABend\\u00BB' otherlv_7= '\\u00ABend\\u00BB' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:87:1: (otherlv_0= '\\u00ABtransformation\\u00BB' otherlv_1= '\\u00ABreplace\\u00BB' ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= '\\u00ABend\\u00BB' otherlv_4= '\\u00ABby\\u00BB' ( (lv_replacement_5_0= ruleReplacement ) ) otherlv_6= '\\u00ABend\\u00BB' otherlv_7= '\\u00ABend\\u00BB' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:87:1: (otherlv_0= '\\u00ABtransformation\\u00BB' otherlv_1= '\\u00ABreplace\\u00BB' ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= '\\u00ABend\\u00BB' otherlv_4= '\\u00ABby\\u00BB' ( (lv_replacement_5_0= ruleReplacement ) ) otherlv_6= '\\u00ABend\\u00BB' otherlv_7= '\\u00ABend\\u00BB' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:87:3: otherlv_0= '\\u00ABtransformation\\u00BB' otherlv_1= '\\u00ABreplace\\u00BB' ( (lv_pattern_2_0= rulePattern ) ) otherlv_3= '\\u00ABend\\u00BB' otherlv_4= '\\u00ABby\\u00BB' ( (lv_replacement_5_0= ruleReplacement ) ) otherlv_6= '\\u00ABend\\u00BB' otherlv_7= '\\u00ABend\\u00BB'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTransformation128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTransformation140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTransformationAccess().getReplaceKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:95:1: ( (lv_pattern_2_0= rulePattern ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:96:1: (lv_pattern_2_0= rulePattern )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:96:1: (lv_pattern_2_0= rulePattern )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:97:3: lv_pattern_2_0= rulePattern
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationAccess().getPatternPatternParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePattern_in_ruleTransformation161);
            lv_pattern_2_0=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransformationRule());
              	        }
                     		set(
                     			current, 
                     			"pattern",
                      		lv_pattern_2_0, 
                      		"Pattern");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTransformation173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTransformationAccess().getEndKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTransformation185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTransformationAccess().getByKeyword_4());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:121:1: ( (lv_replacement_5_0= ruleReplacement ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:122:1: (lv_replacement_5_0= ruleReplacement )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:122:1: (lv_replacement_5_0= ruleReplacement )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:123:3: lv_replacement_5_0= ruleReplacement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationAccess().getReplacementReplacementParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReplacement_in_ruleTransformation206);
            lv_replacement_5_0=ruleReplacement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransformationRule());
              	        }
                     		set(
                     			current, 
                     			"replacement",
                      		lv_replacement_5_0, 
                      		"Replacement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTransformation218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getEndKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleTransformation230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTransformationAccess().getEndKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRulePattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:155:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:156:2: (iv_rulePattern= rulePattern EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:157:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern266);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:164:1: rulePattern returns [EObject current=null] : (this_SequencePattern_0= ruleSequencePattern | this_MethodPattern_1= ruleMethodPattern | this_TypePattern_2= ruleTypePattern ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        EObject this_SequencePattern_0 = null;

        EObject this_MethodPattern_1 = null;

        EObject this_TypePattern_2 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:167:28: ( (this_SequencePattern_0= ruleSequencePattern | this_MethodPattern_1= ruleMethodPattern | this_TypePattern_2= ruleTypePattern ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:168:1: (this_SequencePattern_0= ruleSequencePattern | this_MethodPattern_1= ruleMethodPattern | this_TypePattern_2= ruleTypePattern )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:168:1: (this_SequencePattern_0= ruleSequencePattern | this_MethodPattern_1= ruleMethodPattern | this_TypePattern_2= ruleTypePattern )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_LABELNAME:
            case 28:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 60:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 78:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( ((LA1_2>=29 && LA1_2<=30)||LA1_2==65||LA1_2==74) ) {
                    alt1=1;
                }
                else if ( (LA1_2==RULE_ID||LA1_2==60) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 85:
                {
                int LA1_3 = input.LA(2);

                if ( ((LA1_3>=16 && LA1_3<=17)) ) {
                    alt1=3;
                }
                else if ( (LA1_3==RULE_ID||LA1_3==23) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                int LA1_4 = input.LA(2);

                if ( ((LA1_4>=16 && LA1_4<=17)) ) {
                    alt1=3;
                }
                else if ( (LA1_4==RULE_ID||LA1_4==23) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                int LA1_5 = input.LA(2);

                if ( ((LA1_5>=16 && LA1_5<=17)) ) {
                    alt1=3;
                }
                else if ( (LA1_5==RULE_ID||LA1_5==23) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            case 88:
                {
                int LA1_6 = input.LA(2);

                if ( ((LA1_6>=16 && LA1_6<=17)) ) {
                    alt1=3;
                }
                else if ( (LA1_6==RULE_ID||LA1_6==23) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 6, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 16:
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:169:2: this_SequencePattern_0= ruleSequencePattern
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPatternAccess().getSequencePatternParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSequencePattern_in_rulePattern326);
                    this_SequencePattern_0=ruleSequencePattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SequencePattern_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:182:2: this_MethodPattern_1= ruleMethodPattern
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPatternAccess().getMethodPatternParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethodPattern_in_rulePattern356);
                    this_MethodPattern_1=ruleMethodPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MethodPattern_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:195:2: this_TypePattern_2= ruleTypePattern
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPatternAccess().getTypePatternParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypePattern_in_rulePattern386);
                    this_TypePattern_2=ruleTypePattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypePattern_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleSequencePattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:214:1: entryRuleSequencePattern returns [EObject current=null] : iv_ruleSequencePattern= ruleSequencePattern EOF ;
    public final EObject entryRuleSequencePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencePattern = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:215:2: (iv_ruleSequencePattern= ruleSequencePattern EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:216:2: iv_ruleSequencePattern= ruleSequencePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequencePatternRule()); 
            }
            pushFollow(FOLLOW_ruleSequencePattern_in_entryRuleSequencePattern421);
            iv_ruleSequencePattern=ruleSequencePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequencePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencePattern431); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequencePattern"


    // $ANTLR start "ruleSequencePattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:223:1: ruleSequencePattern returns [EObject current=null] : ( (lv_sequence_0_0= ruleStatementSequence ) ) ;
    public final EObject ruleSequencePattern() throws RecognitionException {
        EObject current = null;

        EObject lv_sequence_0_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:226:28: ( ( (lv_sequence_0_0= ruleStatementSequence ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:227:1: ( (lv_sequence_0_0= ruleStatementSequence ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:227:1: ( (lv_sequence_0_0= ruleStatementSequence ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:228:1: (lv_sequence_0_0= ruleStatementSequence )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:228:1: (lv_sequence_0_0= ruleStatementSequence )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:229:3: lv_sequence_0_0= ruleStatementSequence
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequencePatternAccess().getSequenceStatementSequenceParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementSequence_in_ruleSequencePattern476);
            lv_sequence_0_0=ruleStatementSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSequencePatternRule());
              	        }
                     		set(
                     			current, 
                     			"sequence",
                      		lv_sequence_0_0, 
                      		"StatementSequence");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequencePattern"


    // $ANTLR start "entryRuleMethodPattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:253:1: entryRuleMethodPattern returns [EObject current=null] : iv_ruleMethodPattern= ruleMethodPattern EOF ;
    public final EObject entryRuleMethodPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodPattern = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:254:2: (iv_ruleMethodPattern= ruleMethodPattern EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:255:2: iv_ruleMethodPattern= ruleMethodPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodPatternRule()); 
            }
            pushFollow(FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern511);
            iv_ruleMethodPattern=ruleMethodPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodPattern521); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodPattern"


    // $ANTLR start "ruleMethodPattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:262:1: ruleMethodPattern returns [EObject current=null] : ( (lv_method_0_0= ruleMethod ) ) ;
    public final EObject ruleMethodPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_method_0_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:265:28: ( ( (lv_method_0_0= ruleMethod ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:266:1: ( (lv_method_0_0= ruleMethod ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:266:1: ( (lv_method_0_0= ruleMethod ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:267:1: (lv_method_0_0= ruleMethod )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:267:1: (lv_method_0_0= ruleMethod )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:268:3: lv_method_0_0= ruleMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodPatternAccess().getMethodMethodParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethod_in_ruleMethodPattern566);
            lv_method_0_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_0_0, 
                      		"Method");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodPattern"


    // $ANTLR start "entryRuleTypePattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:292:1: entryRuleTypePattern returns [EObject current=null] : iv_ruleTypePattern= ruleTypePattern EOF ;
    public final EObject entryRuleTypePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypePattern = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:293:2: (iv_ruleTypePattern= ruleTypePattern EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:294:2: iv_ruleTypePattern= ruleTypePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypePatternRule()); 
            }
            pushFollow(FOLLOW_ruleTypePattern_in_entryRuleTypePattern601);
            iv_ruleTypePattern=ruleTypePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypePattern611); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypePattern"


    // $ANTLR start "ruleTypePattern"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:301:1: ruleTypePattern returns [EObject current=null] : ( (lv_type_0_0= ruleType ) ) ;
    public final EObject ruleTypePattern() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:304:28: ( ( (lv_type_0_0= ruleType ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:305:1: ( (lv_type_0_0= ruleType ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:305:1: ( (lv_type_0_0= ruleType ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:306:1: (lv_type_0_0= ruleType )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:306:1: (lv_type_0_0= ruleType )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:307:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypePatternAccess().getTypeTypeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleTypePattern656);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypePatternRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypePattern"


    // $ANTLR start "entryRuleReplacement"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:331:1: entryRuleReplacement returns [EObject current=null] : iv_ruleReplacement= ruleReplacement EOF ;
    public final EObject entryRuleReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplacement = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:332:2: (iv_ruleReplacement= ruleReplacement EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:333:2: iv_ruleReplacement= ruleReplacement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReplacementRule()); 
            }
            pushFollow(FOLLOW_ruleReplacement_in_entryRuleReplacement691);
            iv_ruleReplacement=ruleReplacement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReplacement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplacement701); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReplacement"


    // $ANTLR start "ruleReplacement"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:340:1: ruleReplacement returns [EObject current=null] : ( ( (lv_sequence_0_0= ruleStatementSequence ) ) | ( (lv_method_1_0= ruleMethod ) ) | ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleReplacement() throws RecognitionException {
        EObject current = null;

        EObject lv_sequence_0_0 = null;

        EObject lv_method_1_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:343:28: ( ( ( (lv_sequence_0_0= ruleStatementSequence ) ) | ( (lv_method_1_0= ruleMethod ) ) | ( (lv_type_2_0= ruleType ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:344:1: ( ( (lv_sequence_0_0= ruleStatementSequence ) ) | ( (lv_method_1_0= ruleMethod ) ) | ( (lv_type_2_0= ruleType ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:344:1: ( ( (lv_sequence_0_0= ruleStatementSequence ) ) | ( (lv_method_1_0= ruleMethod ) ) | ( (lv_type_2_0= ruleType ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_LABELNAME:
            case 28:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 60:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 78:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=29 && LA2_2<=30)||LA2_2==65||LA2_2==74) ) {
                    alt2=1;
                }
                else if ( (LA2_2==RULE_ID||LA2_2==60) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 85:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID||LA2_3==23) ) {
                    alt2=2;
                }
                else if ( ((LA2_3>=16 && LA2_3<=17)) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==RULE_ID||LA2_4==23) ) {
                    alt2=2;
                }
                else if ( ((LA2_4>=16 && LA2_4<=17)) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                int LA2_5 = input.LA(2);

                if ( ((LA2_5>=16 && LA2_5<=17)) ) {
                    alt2=3;
                }
                else if ( (LA2_5==RULE_ID||LA2_5==23) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case 88:
                {
                int LA2_6 = input.LA(2);

                if ( (LA2_6==RULE_ID||LA2_6==23) ) {
                    alt2=2;
                }
                else if ( ((LA2_6>=16 && LA2_6<=17)) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 16:
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:344:2: ( (lv_sequence_0_0= ruleStatementSequence ) )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:344:2: ( (lv_sequence_0_0= ruleStatementSequence ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:345:1: (lv_sequence_0_0= ruleStatementSequence )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:345:1: (lv_sequence_0_0= ruleStatementSequence )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:346:3: lv_sequence_0_0= ruleStatementSequence
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReplacementAccess().getSequenceStatementSequenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementSequence_in_ruleReplacement747);
                    lv_sequence_0_0=ruleStatementSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReplacementRule());
                      	        }
                             		set(
                             			current, 
                             			"sequence",
                              		lv_sequence_0_0, 
                              		"StatementSequence");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:363:6: ( (lv_method_1_0= ruleMethod ) )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:363:6: ( (lv_method_1_0= ruleMethod ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:364:1: (lv_method_1_0= ruleMethod )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:364:1: (lv_method_1_0= ruleMethod )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:365:3: lv_method_1_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReplacementAccess().getMethodMethodParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleReplacement774);
                    lv_method_1_0=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReplacementRule());
                      	        }
                             		set(
                             			current, 
                             			"method",
                              		lv_method_1_0, 
                              		"Method");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:382:6: ( (lv_type_2_0= ruleType ) )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:382:6: ( (lv_type_2_0= ruleType ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:383:1: (lv_type_2_0= ruleType )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:383:1: (lv_type_2_0= ruleType )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:384:3: lv_type_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReplacementAccess().getTypeTypeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleReplacement801);
                    lv_type_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReplacementRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReplacement"


    // $ANTLR start "entryRuleType"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:408:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:409:2: (iv_ruleType= ruleType EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:410:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType837);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:417:1: ruleType returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( (lv_class_1_0= 'class' ) ) | ( (lv_interface_2_0= 'interface' ) ) ) ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( (lv_interfaces_7_0= ruleQualifiedName ) ) (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_fields_11_0= ruleField ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_class_1_0=null;
        Token lv_interface_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_superClass_5_0 = null;

        AntlrDatatypeRuleToken lv_interfaces_7_0 = null;

        AntlrDatatypeRuleToken lv_interfaces_9_0 = null;

        EObject lv_fields_11_0 = null;

        EObject lv_methods_12_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:420:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( (lv_class_1_0= 'class' ) ) | ( (lv_interface_2_0= 'interface' ) ) ) ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( (lv_interfaces_7_0= ruleQualifiedName ) ) (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_fields_11_0= ruleField ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:421:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( (lv_class_1_0= 'class' ) ) | ( (lv_interface_2_0= 'interface' ) ) ) ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( (lv_interfaces_7_0= ruleQualifiedName ) ) (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_fields_11_0= ruleField ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:421:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( (lv_class_1_0= 'class' ) ) | ( (lv_interface_2_0= 'interface' ) ) ) ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( (lv_interfaces_7_0= ruleQualifiedName ) ) (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_fields_11_0= ruleField ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:421:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( ( (lv_class_1_0= 'class' ) ) | ( (lv_interface_2_0= 'interface' ) ) ) ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( (lv_interfaces_7_0= ruleQualifiedName ) ) (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_fields_11_0= ruleField ) )* ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:421:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=85 && LA3_0<=88)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:422:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:422:1: (lv_visibility_0_0= ruleVisibility )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:423:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleType893);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"visibility",
                              		lv_visibility_0_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:439:3: ( ( (lv_class_1_0= 'class' ) ) | ( (lv_interface_2_0= 'interface' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:439:4: ( (lv_class_1_0= 'class' ) )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:439:4: ( (lv_class_1_0= 'class' ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:440:1: (lv_class_1_0= 'class' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:440:1: (lv_class_1_0= 'class' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:441:3: lv_class_1_0= 'class'
                    {
                    lv_class_1_0=(Token)match(input,16,FOLLOW_16_in_ruleType913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_class_1_0, grammarAccess.getTypeAccess().getClassClassKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(current, "class", true, "class");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:455:6: ( (lv_interface_2_0= 'interface' ) )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:455:6: ( (lv_interface_2_0= 'interface' ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:456:1: (lv_interface_2_0= 'interface' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:456:1: (lv_interface_2_0= 'interface' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:457:3: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,17,FOLLOW_17_in_ruleType950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_interface_2_0, grammarAccess.getTypeAccess().getInterfaceInterfaceKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(current, "interface", true, "interface");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:470:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:471:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:471:1: (lv_name_3_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:472:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleType985);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:488:2: (otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:488:4: otherlv_4= 'extends' ( (lv_superClass_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleType998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:492:1: ( (lv_superClass_5_0= ruleQualifiedName ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:493:1: (lv_superClass_5_0= ruleQualifiedName )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:493:1: (lv_superClass_5_0= ruleQualifiedName )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:494:3: lv_superClass_5_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getSuperClassQualifiedNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleType1019);
                    lv_superClass_5_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"superClass",
                              		lv_superClass_5_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:510:4: (otherlv_6= 'implements' ( (lv_interfaces_7_0= ruleQualifiedName ) ) (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:510:6: otherlv_6= 'implements' ( (lv_interfaces_7_0= ruleQualifiedName ) ) (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleType1034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:514:1: ( (lv_interfaces_7_0= ruleQualifiedName ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:515:1: (lv_interfaces_7_0= ruleQualifiedName )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:515:1: (lv_interfaces_7_0= ruleQualifiedName )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:516:3: lv_interfaces_7_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getInterfacesQualifiedNameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleType1055);
                    lv_interfaces_7_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"interfaces",
                              		lv_interfaces_7_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:532:2: (otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:532:4: otherlv_8= ',' ( (lv_interfaces_9_0= ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleType1068); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:536:1: ( (lv_interfaces_9_0= ruleQualifiedName ) )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:537:1: (lv_interfaces_9_0= ruleQualifiedName )
                    	    {
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:537:1: (lv_interfaces_9_0= ruleQualifiedName )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:538:3: lv_interfaces_9_0= ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeAccess().getInterfacesQualifiedNameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleType1089);
                    	    lv_interfaces_9_0=ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"interfaces",
                    	              		lv_interfaces_9_0, 
                    	              		"QualifiedName");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleType1105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:558:1: ( (lv_fields_11_0= ruleField ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:559:1: (lv_fields_11_0= ruleField )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:559:1: (lv_fields_11_0= ruleField )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:560:3: lv_fields_11_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleType1126);
            	    lv_fields_11_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_11_0, 
            	              		"Field");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:576:3: ( (lv_methods_12_0= ruleMethod ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==23||(LA9_0>=85 && LA9_0<=88)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:577:1: (lv_methods_12_0= ruleMethod )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:577:1: (lv_methods_12_0= ruleMethod )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:578:3: lv_methods_12_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getMethodsMethodParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMethod_in_ruleType1148);
            	    lv_methods_12_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methods",
            	              		lv_methods_12_0, 
            	              		"Method");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleType1161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleField"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:606:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:607:2: (iv_ruleField= ruleField EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:608:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1197);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1207); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:615:1: ruleField returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) ) ( (lv_type_2_0= ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:618:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) ) ( (lv_type_2_0= ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:619:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) ) ( (lv_type_2_0= ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:619:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) ) ( (lv_type_2_0= ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:619:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) ) ( (lv_type_2_0= ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:619:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=85 && LA10_0<=88)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:620:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:620:1: (lv_visibility_0_0= ruleVisibility )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:621:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleField1253);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"visibility",
                              		lv_visibility_0_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:637:3: ( (lv_static_1_0= 'static' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:638:1: (lv_static_1_0= 'static' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:638:1: (lv_static_1_0= 'static' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:639:3: lv_static_1_0= 'static'
            {
            lv_static_1_0=(Token)match(input,23,FOLLOW_23_in_ruleField1272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_static_1_0, grammarAccess.getFieldAccess().getStaticStaticKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(current, "static", true, "static");
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:652:2: ( (lv_type_2_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:653:1: (lv_type_2_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:653:1: (lv_type_2_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:654:3: lv_type_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleField1306);
            lv_type_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:670:2: ( (lv_name_3_0= RULE_ID ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:671:1: (lv_name_3_0= RULE_ID )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:671:1: (lv_name_3_0= RULE_ID )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:672:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleField1340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:700:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:701:2: (iv_ruleMethod= ruleMethod EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:702:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1376);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1386); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:709:1: ruleMethod returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= ruleMethodName ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )* )? otherlv_8= ')' ( (lv_body_9_0= ruleBody ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_type_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_parameters_5_0 = null;

        AntlrDatatypeRuleToken lv_parameters_7_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:712:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= ruleMethodName ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )* )? otherlv_8= ')' ( (lv_body_9_0= ruleBody ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:713:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= ruleMethodName ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )* )? otherlv_8= ')' ( (lv_body_9_0= ruleBody ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:713:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= ruleMethodName ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )* )? otherlv_8= ')' ( (lv_body_9_0= ruleBody ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:713:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= ruleMethodName ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )* )? otherlv_8= ')' ( (lv_body_9_0= ruleBody ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:713:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=85 && LA11_0<=88)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:714:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:714:1: (lv_visibility_0_0= ruleVisibility )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:715:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleMethod1432);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"visibility",
                              		lv_visibility_0_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:731:3: ( (lv_static_1_0= 'static' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:732:1: (lv_static_1_0= 'static' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:732:1: (lv_static_1_0= 'static' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:733:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,23,FOLLOW_23_in_ruleMethod1451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:746:3: ( (lv_type_2_0= RULE_ID ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:747:1: (lv_type_2_0= RULE_ID )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:747:1: (lv_type_2_0= RULE_ID )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:748:3: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_2_0, grammarAccess.getMethodAccess().getTypeIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:764:2: ( (lv_name_3_0= ruleMethodName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:765:1: (lv_name_3_0= ruleMethodName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:765:1: (lv_name_3_0= ruleMethodName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:766:3: lv_name_3_0= ruleMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodName_in_ruleMethod1508);
            lv_name_3_0=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"MethodName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleMethod1520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:786:1: ( ( (lv_parameters_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:786:2: ( (lv_parameters_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )*
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:786:2: ( (lv_parameters_5_0= ruleQualifiedName ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:787:1: (lv_parameters_5_0= ruleQualifiedName )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:787:1: (lv_parameters_5_0= ruleQualifiedName )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:788:3: lv_parameters_5_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParametersQualifiedNameParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethod1542);
                    lv_parameters_5_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_5_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:804:2: (otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==20) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:804:4: otherlv_6= ',' ( (lv_parameters_7_0= ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleMethod1555); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:808:1: ( (lv_parameters_7_0= ruleQualifiedName ) )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:809:1: (lv_parameters_7_0= ruleQualifiedName )
                    	    {
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:809:1: (lv_parameters_7_0= ruleQualifiedName )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:810:3: lv_parameters_7_0= ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParametersQualifiedNameParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethod1576);
                    	    lv_parameters_7_0=ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_7_0, 
                    	              		"QualifiedName");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleMethod1592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:830:1: ( (lv_body_9_0= ruleBody ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:831:1: (lv_body_9_0= ruleBody )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:831:1: (lv_body_9_0= ruleBody )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:832:3: lv_body_9_0= ruleBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getBodyBodyParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBody_in_ruleMethod1613);
            lv_body_9_0=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_9_0, 
                      		"Body");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleBody"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:856:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:857:2: (iv_ruleBody= ruleBody EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:858:2: iv_ruleBody= ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1649);
            iv_ruleBody=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1659); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:865:1: ruleBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( (lv_statements_3_0= ruleLabelOrStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_declarations_2_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:868:28: ( ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( (lv_statements_3_0= ruleLabelOrStatement ) )* otherlv_4= '}' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:869:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( (lv_statements_3_0= ruleLabelOrStatement ) )* otherlv_4= '}' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:869:1: ( () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( (lv_statements_3_0= ruleLabelOrStatement ) )* otherlv_4= '}' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:869:2: () otherlv_1= '{' ( (lv_declarations_2_0= ruleDeclaration ) )* ( (lv_statements_3_0= ruleLabelOrStatement ) )* otherlv_4= '}'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:869:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:870:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBodyAccess().getBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBody1708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:882:1: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:883:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:883:1: (lv_declarations_2_0= ruleDeclaration )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:884:3: lv_declarations_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleBody1729);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_2_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:900:3: ( (lv_statements_3_0= ruleLabelOrStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_LABELNAME)||LA16_0==28||(LA16_0>=31 && LA16_0<=33)||(LA16_0>=35 && LA16_0<=40)||LA16_0==60||(LA16_0>=63 && LA16_0<=64)||(LA16_0>=66 && LA16_0<=68)||LA16_0==78) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:901:1: (lv_statements_3_0= ruleLabelOrStatement )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:901:1: (lv_statements_3_0= ruleLabelOrStatement )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:902:3: lv_statements_3_0= ruleLabelOrStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getStatementsLabelOrStatementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLabelOrStatement_in_ruleBody1751);
            	    lv_statements_3_0=ruleLabelOrStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"LabelOrStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleBody1764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleStatementSequence"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:930:1: entryRuleStatementSequence returns [EObject current=null] : iv_ruleStatementSequence= ruleStatementSequence EOF ;
    public final EObject entryRuleStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementSequence = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:931:2: (iv_ruleStatementSequence= ruleStatementSequence EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:932:2: iv_ruleStatementSequence= ruleStatementSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleStatementSequence_in_entryRuleStatementSequence1800);
            iv_ruleStatementSequence=ruleStatementSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementSequence1810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementSequence"


    // $ANTLR start "ruleStatementSequence"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:939:1: ruleStatementSequence returns [EObject current=null] : ( (lv_statements_0_0= ruleLabelOrStatement ) )+ ;
    public final EObject ruleStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:942:28: ( ( (lv_statements_0_0= ruleLabelOrStatement ) )+ )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:943:1: ( (lv_statements_0_0= ruleLabelOrStatement ) )+
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:943:1: ( (lv_statements_0_0= ruleLabelOrStatement ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_LABELNAME)||LA17_0==28||(LA17_0>=31 && LA17_0<=33)||(LA17_0>=35 && LA17_0<=40)||LA17_0==60||(LA17_0>=63 && LA17_0<=64)||(LA17_0>=66 && LA17_0<=68)||LA17_0==78) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:944:1: (lv_statements_0_0= ruleLabelOrStatement )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:944:1: (lv_statements_0_0= ruleLabelOrStatement )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:945:3: lv_statements_0_0= ruleLabelOrStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementSequenceAccess().getStatementsLabelOrStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLabelOrStatement_in_ruleStatementSequence1855);
            	    lv_statements_0_0=ruleLabelOrStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_0_0, 
            	              		"LabelOrStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementSequence"


    // $ANTLR start "entryRuleDeclaration"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:969:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:970:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:971:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1891);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1901); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:978:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedName ) ) ( (lv_locals_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_locals_3_0= RULE_ID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_locals_1_0=null;
        Token otherlv_2=null;
        Token lv_locals_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:981:28: ( ( ( (lv_type_0_0= ruleQualifiedName ) ) ( (lv_locals_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_locals_3_0= RULE_ID ) ) )* otherlv_4= ';' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:982:1: ( ( (lv_type_0_0= ruleQualifiedName ) ) ( (lv_locals_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_locals_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:982:1: ( ( (lv_type_0_0= ruleQualifiedName ) ) ( (lv_locals_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_locals_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:982:2: ( (lv_type_0_0= ruleQualifiedName ) ) ( (lv_locals_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_locals_3_0= RULE_ID ) ) )* otherlv_4= ';'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:982:2: ( (lv_type_0_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:983:1: (lv_type_0_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:983:1: (lv_type_0_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:984:3: lv_type_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeQualifiedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDeclaration1947);
            lv_type_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1000:2: ( (lv_locals_1_0= RULE_ID ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1001:1: (lv_locals_1_0= RULE_ID )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1001:1: (lv_locals_1_0= RULE_ID )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1002:3: lv_locals_1_0= RULE_ID
            {
            lv_locals_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration1964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_locals_1_0, grammarAccess.getDeclarationAccess().getLocalsIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeclarationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"locals",
                      		lv_locals_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1018:2: (otherlv_2= ',' ( (lv_locals_3_0= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1018:4: otherlv_2= ',' ( (lv_locals_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration1982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1022:1: ( (lv_locals_3_0= RULE_ID ) )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1023:1: (lv_locals_3_0= RULE_ID )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1023:1: (lv_locals_3_0= RULE_ID )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1024:3: lv_locals_3_0= RULE_ID
            	    {
            	    lv_locals_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration1999); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_locals_3_0, grammarAccess.getDeclarationAccess().getLocalsIDTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDeclarationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"locals",
            	              		lv_locals_3_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration2018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleLabelOrStatement"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1052:1: entryRuleLabelOrStatement returns [EObject current=null] : iv_ruleLabelOrStatement= ruleLabelOrStatement EOF ;
    public final EObject entryRuleLabelOrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelOrStatement = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1053:2: (iv_ruleLabelOrStatement= ruleLabelOrStatement EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1054:2: iv_ruleLabelOrStatement= ruleLabelOrStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelOrStatementRule()); 
            }
            pushFollow(FOLLOW_ruleLabelOrStatement_in_entryRuleLabelOrStatement2054);
            iv_ruleLabelOrStatement=ruleLabelOrStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelOrStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelOrStatement2064); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelOrStatement"


    // $ANTLR start "ruleLabelOrStatement"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1061:1: ruleLabelOrStatement returns [EObject current=null] : (this_Label_0= ruleLabel | (this_Statement_1= ruleStatement otherlv_2= ';' ) ) ;
    public final EObject ruleLabelOrStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Label_0 = null;

        EObject this_Statement_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1064:28: ( (this_Label_0= ruleLabel | (this_Statement_1= ruleStatement otherlv_2= ';' ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1065:1: (this_Label_0= ruleLabel | (this_Statement_1= ruleStatement otherlv_2= ';' ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1065:1: (this_Label_0= ruleLabel | (this_Statement_1= ruleStatement otherlv_2= ';' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LABELNAME) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID||LA19_0==28||(LA19_0>=31 && LA19_0<=33)||(LA19_0>=35 && LA19_0<=40)||LA19_0==60||(LA19_0>=63 && LA19_0<=64)||(LA19_0>=66 && LA19_0<=68)||LA19_0==78) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1066:2: this_Label_0= ruleLabel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabelOrStatementAccess().getLabelParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabel_in_ruleLabelOrStatement2114);
                    this_Label_0=ruleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Label_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1078:6: (this_Statement_1= ruleStatement otherlv_2= ';' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1078:6: (this_Statement_1= ruleStatement otherlv_2= ';' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1079:2: this_Statement_1= ruleStatement otherlv_2= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabelOrStatementAccess().getStatementParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleLabelOrStatement2145);
                    this_Statement_1=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLabelOrStatement2156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLabelOrStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelOrStatement"


    // $ANTLR start "entryRuleStatement"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1102:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1103:2: (iv_ruleStatement= ruleStatement EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1104:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2193);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2203); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1111:1: ruleStatement returns [EObject current=null] : (this_BreakpointStmt_0= ruleBreakpointStmt | this_DefinitionStmt_1= ruleDefinitionStmt | this_GotoStmt_2= ruleGotoStmt | this_IfStmt_3= ruleIfStmt | this_InvokeStmt_4= ruleInvokeStmt | this_LookupSwitchStmt_5= ruleLookupSwitchStmt | this_MonitorStmt_6= ruleMonitorStmt | this_NopStmt_7= ruleNopStmt | this_RetStmt_8= ruleRetStmt | this_ReturnVoidStmt_9= ruleReturnVoidStmt | this_ReturnStmt_10= ruleReturnStmt | this_TableSwitchStmt_11= ruleTableSwitchStmt ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BreakpointStmt_0 = null;

        EObject this_DefinitionStmt_1 = null;

        EObject this_GotoStmt_2 = null;

        EObject this_IfStmt_3 = null;

        EObject this_InvokeStmt_4 = null;

        EObject this_LookupSwitchStmt_5 = null;

        EObject this_MonitorStmt_6 = null;

        EObject this_NopStmt_7 = null;

        EObject this_RetStmt_8 = null;

        EObject this_ReturnVoidStmt_9 = null;

        EObject this_ReturnStmt_10 = null;

        EObject this_TableSwitchStmt_11 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1114:28: ( (this_BreakpointStmt_0= ruleBreakpointStmt | this_DefinitionStmt_1= ruleDefinitionStmt | this_GotoStmt_2= ruleGotoStmt | this_IfStmt_3= ruleIfStmt | this_InvokeStmt_4= ruleInvokeStmt | this_LookupSwitchStmt_5= ruleLookupSwitchStmt | this_MonitorStmt_6= ruleMonitorStmt | this_NopStmt_7= ruleNopStmt | this_RetStmt_8= ruleRetStmt | this_ReturnVoidStmt_9= ruleReturnVoidStmt | this_ReturnStmt_10= ruleReturnStmt | this_TableSwitchStmt_11= ruleTableSwitchStmt ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1115:1: (this_BreakpointStmt_0= ruleBreakpointStmt | this_DefinitionStmt_1= ruleDefinitionStmt | this_GotoStmt_2= ruleGotoStmt | this_IfStmt_3= ruleIfStmt | this_InvokeStmt_4= ruleInvokeStmt | this_LookupSwitchStmt_5= ruleLookupSwitchStmt | this_MonitorStmt_6= ruleMonitorStmt | this_NopStmt_7= ruleNopStmt | this_RetStmt_8= ruleRetStmt | this_ReturnVoidStmt_9= ruleReturnVoidStmt | this_ReturnStmt_10= ruleReturnStmt | this_TableSwitchStmt_11= ruleTableSwitchStmt )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1115:1: (this_BreakpointStmt_0= ruleBreakpointStmt | this_DefinitionStmt_1= ruleDefinitionStmt | this_GotoStmt_2= ruleGotoStmt | this_IfStmt_3= ruleIfStmt | this_InvokeStmt_4= ruleInvokeStmt | this_LookupSwitchStmt_5= ruleLookupSwitchStmt | this_MonitorStmt_6= ruleMonitorStmt | this_NopStmt_7= ruleNopStmt | this_RetStmt_8= ruleRetStmt | this_ReturnVoidStmt_9= ruleReturnVoidStmt | this_ReturnStmt_10= ruleReturnStmt | this_TableSwitchStmt_11= ruleTableSwitchStmt )
            int alt20=12;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1116:2: this_BreakpointStmt_0= ruleBreakpointStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakpointStmtParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakpointStmt_in_ruleStatement2253);
                    this_BreakpointStmt_0=ruleBreakpointStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakpointStmt_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1129:2: this_DefinitionStmt_1= ruleDefinitionStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDefinitionStmtParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefinitionStmt_in_ruleStatement2283);
                    this_DefinitionStmt_1=ruleDefinitionStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefinitionStmt_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1142:2: this_GotoStmt_2= ruleGotoStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getGotoStmtParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGotoStmt_in_ruleStatement2313);
                    this_GotoStmt_2=ruleGotoStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GotoStmt_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1155:2: this_IfStmt_3= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStmt_in_ruleStatement2343);
                    this_IfStmt_3=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfStmt_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1168:2: this_InvokeStmt_4= ruleInvokeStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getInvokeStmtParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInvokeStmt_in_ruleStatement2373);
                    this_InvokeStmt_4=ruleInvokeStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvokeStmt_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1181:2: this_LookupSwitchStmt_5= ruleLookupSwitchStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLookupSwitchStmtParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLookupSwitchStmt_in_ruleStatement2403);
                    this_LookupSwitchStmt_5=ruleLookupSwitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LookupSwitchStmt_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1194:2: this_MonitorStmt_6= ruleMonitorStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getMonitorStmtParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMonitorStmt_in_ruleStatement2433);
                    this_MonitorStmt_6=ruleMonitorStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MonitorStmt_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1207:2: this_NopStmt_7= ruleNopStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getNopStmtParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNopStmt_in_ruleStatement2463);
                    this_NopStmt_7=ruleNopStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NopStmt_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1220:2: this_RetStmt_8= ruleRetStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getRetStmtParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRetStmt_in_ruleStatement2493);
                    this_RetStmt_8=ruleRetStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RetStmt_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1233:2: this_ReturnVoidStmt_9= ruleReturnVoidStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnVoidStmtParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnVoidStmt_in_ruleStatement2523);
                    this_ReturnVoidStmt_9=ruleReturnVoidStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnVoidStmt_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1246:2: this_ReturnStmt_10= ruleReturnStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStmtParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStmt_in_ruleStatement2553);
                    this_ReturnStmt_10=ruleReturnStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStmt_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1259:2: this_TableSwitchStmt_11= ruleTableSwitchStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTableSwitchStmtParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTableSwitchStmt_in_ruleStatement2583);
                    this_TableSwitchStmt_11=ruleTableSwitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TableSwitchStmt_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLabel"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1278:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1279:2: (iv_ruleLabel= ruleLabel EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1280:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2618);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2628); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1287:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_LABELNAME ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1290:28: ( ( ( (lv_name_0_0= RULE_LABELNAME ) ) otherlv_1= ':' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1291:1: ( ( (lv_name_0_0= RULE_LABELNAME ) ) otherlv_1= ':' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1291:1: ( ( (lv_name_0_0= RULE_LABELNAME ) ) otherlv_1= ':' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1291:2: ( (lv_name_0_0= RULE_LABELNAME ) ) otherlv_1= ':'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1291:2: ( (lv_name_0_0= RULE_LABELNAME ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1292:1: (lv_name_0_0= RULE_LABELNAME )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1292:1: (lv_name_0_0= RULE_LABELNAME )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1293:3: lv_name_0_0= RULE_LABELNAME
            {
            lv_name_0_0=(Token)match(input,RULE_LABELNAME,FOLLOW_RULE_LABELNAME_in_ruleLabel2670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameLABELNAMETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLabelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"LABELNAME");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleLabel2687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleBreakpointStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1321:1: entryRuleBreakpointStmt returns [EObject current=null] : iv_ruleBreakpointStmt= ruleBreakpointStmt EOF ;
    public final EObject entryRuleBreakpointStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakpointStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1322:2: (iv_ruleBreakpointStmt= ruleBreakpointStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1323:2: iv_ruleBreakpointStmt= ruleBreakpointStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakpointStmtRule()); 
            }
            pushFollow(FOLLOW_ruleBreakpointStmt_in_entryRuleBreakpointStmt2723);
            iv_ruleBreakpointStmt=ruleBreakpointStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakpointStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakpointStmt2733); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakpointStmt"


    // $ANTLR start "ruleBreakpointStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1330:1: ruleBreakpointStmt returns [EObject current=null] : ( () otherlv_1= 'breakpoint' ) ;
    public final EObject ruleBreakpointStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1333:28: ( ( () otherlv_1= 'breakpoint' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1334:1: ( () otherlv_1= 'breakpoint' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1334:1: ( () otherlv_1= 'breakpoint' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1334:2: () otherlv_1= 'breakpoint'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1334:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1335:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakpointStmtAccess().getBreakpointStmtAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleBreakpointStmt2782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakpointStmtAccess().getBreakpointKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakpointStmt"


    // $ANTLR start "entryRuleDefinitionStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1355:1: entryRuleDefinitionStmt returns [EObject current=null] : iv_ruleDefinitionStmt= ruleDefinitionStmt EOF ;
    public final EObject entryRuleDefinitionStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1356:2: (iv_ruleDefinitionStmt= ruleDefinitionStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1357:2: iv_ruleDefinitionStmt= ruleDefinitionStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionStmtRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitionStmt_in_entryRuleDefinitionStmt2818);
            iv_ruleDefinitionStmt=ruleDefinitionStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionStmt2828); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionStmt"


    // $ANTLR start "ruleDefinitionStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1364:1: ruleDefinitionStmt returns [EObject current=null] : (this_AssignStmt_0= ruleAssignStmt | this_IdentityStmt_1= ruleIdentityStmt ) ;
    public final EObject ruleDefinitionStmt() throws RecognitionException {
        EObject current = null;

        EObject this_AssignStmt_0 = null;

        EObject this_IdentityStmt_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1367:28: ( (this_AssignStmt_0= ruleAssignStmt | this_IdentityStmt_1= ruleIdentityStmt ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1368:1: (this_AssignStmt_0= ruleAssignStmt | this_IdentityStmt_1= ruleIdentityStmt )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1368:1: (this_AssignStmt_0= ruleAssignStmt | this_IdentityStmt_1= ruleIdentityStmt )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==30) ) {
                    alt21=2;
                }
                else if ( (LA21_1==29||LA21_1==65||LA21_1==74) ) {
                    alt21=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==60||LA21_0==68||LA21_0==78) ) {
                alt21=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1369:2: this_AssignStmt_0= ruleAssignStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionStmtAccess().getAssignStmtParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignStmt_in_ruleDefinitionStmt2878);
                    this_AssignStmt_0=ruleAssignStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignStmt_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1382:2: this_IdentityStmt_1= ruleIdentityStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionStmtAccess().getIdentityStmtParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentityStmt_in_ruleDefinitionStmt2908);
                    this_IdentityStmt_1=ruleIdentityStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdentityStmt_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionStmt"


    // $ANTLR start "entryRuleAssignStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1401:1: entryRuleAssignStmt returns [EObject current=null] : iv_ruleAssignStmt= ruleAssignStmt EOF ;
    public final EObject entryRuleAssignStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1402:2: (iv_ruleAssignStmt= ruleAssignStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1403:2: iv_ruleAssignStmt= ruleAssignStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignStmtRule()); 
            }
            pushFollow(FOLLOW_ruleAssignStmt_in_entryRuleAssignStmt2943);
            iv_ruleAssignStmt=ruleAssignStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignStmt2953); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignStmt"


    // $ANTLR start "ruleAssignStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1410:1: ruleAssignStmt returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleRef ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1413:28: ( ( ( (lv_lhs_0_0= ruleRef ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleValue ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1414:1: ( ( (lv_lhs_0_0= ruleRef ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleValue ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1414:1: ( ( (lv_lhs_0_0= ruleRef ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleValue ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1414:2: ( (lv_lhs_0_0= ruleRef ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleValue ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1414:2: ( (lv_lhs_0_0= ruleRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1415:1: (lv_lhs_0_0= ruleRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1415:1: (lv_lhs_0_0= ruleRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1416:3: lv_lhs_0_0= ruleRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignStmtAccess().getLhsRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRef_in_ruleAssignStmt2999);
            lv_lhs_0_0=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignStmtRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Ref");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAssignStmt3011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignStmtAccess().getEqualsSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1436:1: ( (lv_rhs_2_0= ruleValue ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1437:1: (lv_rhs_2_0= ruleValue )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1437:1: (lv_rhs_2_0= ruleValue )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1438:3: lv_rhs_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignStmtAccess().getRhsValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleAssignStmt3032);
            lv_rhs_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignStmtRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignStmt"


    // $ANTLR start "entryRuleIdentityStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1462:1: entryRuleIdentityStmt returns [EObject current=null] : iv_ruleIdentityStmt= ruleIdentityStmt EOF ;
    public final EObject entryRuleIdentityStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentityStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1463:2: (iv_ruleIdentityStmt= ruleIdentityStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1464:2: iv_ruleIdentityStmt= ruleIdentityStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentityStmtRule()); 
            }
            pushFollow(FOLLOW_ruleIdentityStmt_in_entryRuleIdentityStmt3068);
            iv_ruleIdentityStmt=ruleIdentityStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentityStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentityStmt3078); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentityStmt"


    // $ANTLR start "ruleIdentityStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1471:1: ruleIdentityStmt returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleLocal ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleIdentityRef ) ) ) ;
    public final EObject ruleIdentityStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1474:28: ( ( ( (lv_lhs_0_0= ruleLocal ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleIdentityRef ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1475:1: ( ( (lv_lhs_0_0= ruleLocal ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleIdentityRef ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1475:1: ( ( (lv_lhs_0_0= ruleLocal ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleIdentityRef ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1475:2: ( (lv_lhs_0_0= ruleLocal ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleIdentityRef ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1475:2: ( (lv_lhs_0_0= ruleLocal ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1476:1: (lv_lhs_0_0= ruleLocal )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1476:1: (lv_lhs_0_0= ruleLocal )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1477:3: lv_lhs_0_0= ruleLocal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdentityStmtAccess().getLhsLocalParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocal_in_ruleIdentityStmt3124);
            lv_lhs_0_0=ruleLocal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdentityStmtRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Local");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleIdentityStmt3136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIdentityStmtAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1497:1: ( (lv_rhs_2_0= ruleIdentityRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1498:1: (lv_rhs_2_0= ruleIdentityRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1498:1: (lv_rhs_2_0= ruleIdentityRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1499:3: lv_rhs_2_0= ruleIdentityRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdentityStmtAccess().getRhsIdentityRefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentityRef_in_ruleIdentityStmt3157);
            lv_rhs_2_0=ruleIdentityRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdentityStmtRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
                      		"IdentityRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentityStmt"


    // $ANTLR start "entryRuleGotoStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1523:1: entryRuleGotoStmt returns [EObject current=null] : iv_ruleGotoStmt= ruleGotoStmt EOF ;
    public final EObject entryRuleGotoStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGotoStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1524:2: (iv_ruleGotoStmt= ruleGotoStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1525:2: iv_ruleGotoStmt= ruleGotoStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoStmtRule()); 
            }
            pushFollow(FOLLOW_ruleGotoStmt_in_entryRuleGotoStmt3193);
            iv_ruleGotoStmt=ruleGotoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGotoStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGotoStmt3203); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGotoStmt"


    // $ANTLR start "ruleGotoStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1532:1: ruleGotoStmt returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_target_1_0= RULE_LABELNAME ) ) ) ;
    public final EObject ruleGotoStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_target_1_0=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1535:28: ( (otherlv_0= 'goto' ( (lv_target_1_0= RULE_LABELNAME ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1536:1: (otherlv_0= 'goto' ( (lv_target_1_0= RULE_LABELNAME ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1536:1: (otherlv_0= 'goto' ( (lv_target_1_0= RULE_LABELNAME ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1536:3: otherlv_0= 'goto' ( (lv_target_1_0= RULE_LABELNAME ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleGotoStmt3240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGotoStmtAccess().getGotoKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1540:1: ( (lv_target_1_0= RULE_LABELNAME ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1541:1: (lv_target_1_0= RULE_LABELNAME )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1541:1: (lv_target_1_0= RULE_LABELNAME )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1542:3: lv_target_1_0= RULE_LABELNAME
            {
            lv_target_1_0=(Token)match(input,RULE_LABELNAME,FOLLOW_RULE_LABELNAME_in_ruleGotoStmt3257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_target_1_0, grammarAccess.getGotoStmtAccess().getTargetLABELNAMETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGotoStmtRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"LABELNAME");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGotoStmt"


    // $ANTLR start "entryRuleIfStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1566:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1567:2: (iv_ruleIfStmt= ruleIfStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1568:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_ruleIfStmt_in_entryRuleIfStmt3298);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStmt3308); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1575:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleConditionalExpr ) ) ( (lv_then_2_0= ruleGotoStmt ) ) ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_then_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1578:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleConditionalExpr ) ) ( (lv_then_2_0= ruleGotoStmt ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1579:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleConditionalExpr ) ) ( (lv_then_2_0= ruleGotoStmt ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1579:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleConditionalExpr ) ) ( (lv_then_2_0= ruleGotoStmt ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1579:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleConditionalExpr ) ) ( (lv_then_2_0= ruleGotoStmt ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleIfStmt3345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1583:1: ( (lv_condition_1_0= ruleConditionalExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1584:1: (lv_condition_1_0= ruleConditionalExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1584:1: (lv_condition_1_0= ruleConditionalExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1585:3: lv_condition_1_0= ruleConditionalExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStmtAccess().getConditionConditionalExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpr_in_ruleIfStmt3366);
            lv_condition_1_0=ruleConditionalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStmtRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"ConditionalExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1601:2: ( (lv_then_2_0= ruleGotoStmt ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1602:1: (lv_then_2_0= ruleGotoStmt )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1602:1: (lv_then_2_0= ruleGotoStmt )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1603:3: lv_then_2_0= ruleGotoStmt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStmtAccess().getThenGotoStmtParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGotoStmt_in_ruleIfStmt3387);
            lv_then_2_0=ruleGotoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStmtRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_2_0, 
                      		"GotoStmt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleInvokeStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1627:1: entryRuleInvokeStmt returns [EObject current=null] : iv_ruleInvokeStmt= ruleInvokeStmt EOF ;
    public final EObject entryRuleInvokeStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1628:2: (iv_ruleInvokeStmt= ruleInvokeStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1629:2: iv_ruleInvokeStmt= ruleInvokeStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvokeStmtRule()); 
            }
            pushFollow(FOLLOW_ruleInvokeStmt_in_entryRuleInvokeStmt3423);
            iv_ruleInvokeStmt=ruleInvokeStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvokeStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokeStmt3433); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvokeStmt"


    // $ANTLR start "ruleInvokeStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1636:1: ruleInvokeStmt returns [EObject current=null] : ( (lv_invokeExpr_0_0= ruleInvokeExpr ) ) ;
    public final EObject ruleInvokeStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_invokeExpr_0_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1639:28: ( ( (lv_invokeExpr_0_0= ruleInvokeExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1640:1: ( (lv_invokeExpr_0_0= ruleInvokeExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1640:1: ( (lv_invokeExpr_0_0= ruleInvokeExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1641:1: (lv_invokeExpr_0_0= ruleInvokeExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1641:1: (lv_invokeExpr_0_0= ruleInvokeExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1642:3: lv_invokeExpr_0_0= ruleInvokeExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvokeStmtAccess().getInvokeExprInvokeExprParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInvokeExpr_in_ruleInvokeStmt3478);
            lv_invokeExpr_0_0=ruleInvokeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvokeStmtRule());
              	        }
                     		set(
                     			current, 
                     			"invokeExpr",
                      		lv_invokeExpr_0_0, 
                      		"InvokeExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvokeStmt"


    // $ANTLR start "entryRuleTableSwitchStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1666:1: entryRuleTableSwitchStmt returns [EObject current=null] : iv_ruleTableSwitchStmt= ruleTableSwitchStmt EOF ;
    public final EObject entryRuleTableSwitchStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableSwitchStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1667:2: (iv_ruleTableSwitchStmt= ruleTableSwitchStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1668:2: iv_ruleTableSwitchStmt= ruleTableSwitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_ruleTableSwitchStmt_in_entryRuleTableSwitchStmt3513);
            iv_ruleTableSwitchStmt=ruleTableSwitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableSwitchStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableSwitchStmt3523); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableSwitchStmt"


    // $ANTLR start "ruleTableSwitchStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1675:1: ruleTableSwitchStmt returns [EObject current=null] : (otherlv_0= 'tableswitch' otherlv_1= '(' ( (lv_key_2_0= ruleLocal ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_cases_5_0= ruleCase ) ) otherlv_6= ';' )* otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleGotoStmt ) ) otherlv_10= ';' otherlv_11= '}' ) ;
    public final EObject ruleTableSwitchStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_key_2_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1678:28: ( (otherlv_0= 'tableswitch' otherlv_1= '(' ( (lv_key_2_0= ruleLocal ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_cases_5_0= ruleCase ) ) otherlv_6= ';' )* otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleGotoStmt ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1679:1: (otherlv_0= 'tableswitch' otherlv_1= '(' ( (lv_key_2_0= ruleLocal ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_cases_5_0= ruleCase ) ) otherlv_6= ';' )* otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleGotoStmt ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1679:1: (otherlv_0= 'tableswitch' otherlv_1= '(' ( (lv_key_2_0= ruleLocal ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_cases_5_0= ruleCase ) ) otherlv_6= ';' )* otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleGotoStmt ) ) otherlv_10= ';' otherlv_11= '}' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1679:3: otherlv_0= 'tableswitch' otherlv_1= '(' ( (lv_key_2_0= ruleLocal ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_cases_5_0= ruleCase ) ) otherlv_6= ';' )* otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleGotoStmt ) ) otherlv_10= ';' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTableSwitchStmt3560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableSwitchStmtAccess().getTableswitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTableSwitchStmt3572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTableSwitchStmtAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1687:1: ( (lv_key_2_0= ruleLocal ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1688:1: (lv_key_2_0= ruleLocal )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1688:1: (lv_key_2_0= ruleLocal )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1689:3: lv_key_2_0= ruleLocal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableSwitchStmtAccess().getKeyLocalParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocal_in_ruleTableSwitchStmt3593);
            lv_key_2_0=ruleLocal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTableSwitchStmtRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_2_0, 
                      		"Local");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleTableSwitchStmt3605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTableSwitchStmtAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTableSwitchStmt3617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTableSwitchStmtAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1713:1: ( ( (lv_cases_5_0= ruleCase ) ) otherlv_6= ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1713:2: ( (lv_cases_5_0= ruleCase ) ) otherlv_6= ';'
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1713:2: ( (lv_cases_5_0= ruleCase ) )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1714:1: (lv_cases_5_0= ruleCase )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1714:1: (lv_cases_5_0= ruleCase )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1715:3: lv_cases_5_0= ruleCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTableSwitchStmtAccess().getCasesCaseParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCase_in_ruleTableSwitchStmt3639);
            	    lv_cases_5_0=ruleCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTableSwitchStmtRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_5_0, 
            	              		"Case");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTableSwitchStmt3651); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTableSwitchStmtAccess().getSemicolonKeyword_5_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleTableSwitchStmt3665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTableSwitchStmtAccess().getDefaultKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleTableSwitchStmt3677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTableSwitchStmtAccess().getColonKeyword_7());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1743:1: ( (lv_default_9_0= ruleGotoStmt ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1744:1: (lv_default_9_0= ruleGotoStmt )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1744:1: (lv_default_9_0= ruleGotoStmt )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1745:3: lv_default_9_0= ruleGotoStmt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableSwitchStmtAccess().getDefaultGotoStmtParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGotoStmt_in_ruleTableSwitchStmt3698);
            lv_default_9_0=ruleGotoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTableSwitchStmtRule());
              	        }
                     		set(
                     			current, 
                     			"default",
                      		lv_default_9_0, 
                      		"GotoStmt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleTableSwitchStmt3710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getTableSwitchStmtAccess().getSemicolonKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleTableSwitchStmt3722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getTableSwitchStmtAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableSwitchStmt"


    // $ANTLR start "entryRuleLookupSwitchStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1777:1: entryRuleLookupSwitchStmt returns [EObject current=null] : iv_ruleLookupSwitchStmt= ruleLookupSwitchStmt EOF ;
    public final EObject entryRuleLookupSwitchStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupSwitchStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1778:2: (iv_ruleLookupSwitchStmt= ruleLookupSwitchStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1779:2: iv_ruleLookupSwitchStmt= ruleLookupSwitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLookupSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_ruleLookupSwitchStmt_in_entryRuleLookupSwitchStmt3758);
            iv_ruleLookupSwitchStmt=ruleLookupSwitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLookupSwitchStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLookupSwitchStmt3768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLookupSwitchStmt"


    // $ANTLR start "ruleLookupSwitchStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1786:1: ruleLookupSwitchStmt returns [EObject current=null] : ( () otherlv_1= 'lookupswitch' ) ;
    public final EObject ruleLookupSwitchStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1789:28: ( ( () otherlv_1= 'lookupswitch' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1790:1: ( () otherlv_1= 'lookupswitch' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1790:1: ( () otherlv_1= 'lookupswitch' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1790:2: () otherlv_1= 'lookupswitch'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1790:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1791:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLookupSwitchStmtAccess().getLookupSwitchStmtAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleLookupSwitchStmt3817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLookupSwitchStmtAccess().getLookupswitchKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLookupSwitchStmt"


    // $ANTLR start "entryRuleMonitorStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1811:1: entryRuleMonitorStmt returns [EObject current=null] : iv_ruleMonitorStmt= ruleMonitorStmt EOF ;
    public final EObject entryRuleMonitorStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1812:2: (iv_ruleMonitorStmt= ruleMonitorStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1813:2: iv_ruleMonitorStmt= ruleMonitorStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMonitorStmtRule()); 
            }
            pushFollow(FOLLOW_ruleMonitorStmt_in_entryRuleMonitorStmt3853);
            iv_ruleMonitorStmt=ruleMonitorStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMonitorStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonitorStmt3863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitorStmt"


    // $ANTLR start "ruleMonitorStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1820:1: ruleMonitorStmt returns [EObject current=null] : (this_EnterMonitorStmt_0= ruleEnterMonitorStmt | this_ExitMonitorStmt_1= ruleExitMonitorStmt ) ;
    public final EObject ruleMonitorStmt() throws RecognitionException {
        EObject current = null;

        EObject this_EnterMonitorStmt_0 = null;

        EObject this_ExitMonitorStmt_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1823:28: ( (this_EnterMonitorStmt_0= ruleEnterMonitorStmt | this_ExitMonitorStmt_1= ruleExitMonitorStmt ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1824:1: (this_EnterMonitorStmt_0= ruleEnterMonitorStmt | this_ExitMonitorStmt_1= ruleExitMonitorStmt )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1824:1: (this_EnterMonitorStmt_0= ruleEnterMonitorStmt | this_ExitMonitorStmt_1= ruleExitMonitorStmt )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1825:2: this_EnterMonitorStmt_0= ruleEnterMonitorStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMonitorStmtAccess().getEnterMonitorStmtParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnterMonitorStmt_in_ruleMonitorStmt3913);
                    this_EnterMonitorStmt_0=ruleEnterMonitorStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnterMonitorStmt_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1838:2: this_ExitMonitorStmt_1= ruleExitMonitorStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMonitorStmtAccess().getExitMonitorStmtParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitMonitorStmt_in_ruleMonitorStmt3943);
                    this_ExitMonitorStmt_1=ruleExitMonitorStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitMonitorStmt_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitorStmt"


    // $ANTLR start "entryRuleEnterMonitorStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1857:1: entryRuleEnterMonitorStmt returns [EObject current=null] : iv_ruleEnterMonitorStmt= ruleEnterMonitorStmt EOF ;
    public final EObject entryRuleEnterMonitorStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnterMonitorStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1858:2: (iv_ruleEnterMonitorStmt= ruleEnterMonitorStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1859:2: iv_ruleEnterMonitorStmt= ruleEnterMonitorStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnterMonitorStmtRule()); 
            }
            pushFollow(FOLLOW_ruleEnterMonitorStmt_in_entryRuleEnterMonitorStmt3978);
            iv_ruleEnterMonitorStmt=ruleEnterMonitorStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnterMonitorStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnterMonitorStmt3988); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnterMonitorStmt"


    // $ANTLR start "ruleEnterMonitorStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1866:1: ruleEnterMonitorStmt returns [EObject current=null] : (otherlv_0= 'entermonitor' ( (lv_operand_1_0= ruleValue ) ) ) ;
    public final EObject ruleEnterMonitorStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1869:28: ( (otherlv_0= 'entermonitor' ( (lv_operand_1_0= ruleValue ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1870:1: (otherlv_0= 'entermonitor' ( (lv_operand_1_0= ruleValue ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1870:1: (otherlv_0= 'entermonitor' ( (lv_operand_1_0= ruleValue ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1870:3: otherlv_0= 'entermonitor' ( (lv_operand_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEnterMonitorStmt4025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnterMonitorStmtAccess().getEntermonitorKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1874:1: ( (lv_operand_1_0= ruleValue ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1875:1: (lv_operand_1_0= ruleValue )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1875:1: (lv_operand_1_0= ruleValue )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1876:3: lv_operand_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnterMonitorStmtAccess().getOperandValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleEnterMonitorStmt4046);
            lv_operand_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnterMonitorStmtRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_1_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnterMonitorStmt"


    // $ANTLR start "entryRuleExitMonitorStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1900:1: entryRuleExitMonitorStmt returns [EObject current=null] : iv_ruleExitMonitorStmt= ruleExitMonitorStmt EOF ;
    public final EObject entryRuleExitMonitorStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitMonitorStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1901:2: (iv_ruleExitMonitorStmt= ruleExitMonitorStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1902:2: iv_ruleExitMonitorStmt= ruleExitMonitorStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitMonitorStmtRule()); 
            }
            pushFollow(FOLLOW_ruleExitMonitorStmt_in_entryRuleExitMonitorStmt4082);
            iv_ruleExitMonitorStmt=ruleExitMonitorStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitMonitorStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitMonitorStmt4092); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExitMonitorStmt"


    // $ANTLR start "ruleExitMonitorStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1909:1: ruleExitMonitorStmt returns [EObject current=null] : (otherlv_0= 'exitmonitor' ( (lv_operand_1_0= ruleValue ) ) ) ;
    public final EObject ruleExitMonitorStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1912:28: ( (otherlv_0= 'exitmonitor' ( (lv_operand_1_0= ruleValue ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1913:1: (otherlv_0= 'exitmonitor' ( (lv_operand_1_0= ruleValue ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1913:1: (otherlv_0= 'exitmonitor' ( (lv_operand_1_0= ruleValue ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1913:3: otherlv_0= 'exitmonitor' ( (lv_operand_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleExitMonitorStmt4129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExitMonitorStmtAccess().getExitmonitorKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1917:1: ( (lv_operand_1_0= ruleValue ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1918:1: (lv_operand_1_0= ruleValue )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1918:1: (lv_operand_1_0= ruleValue )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1919:3: lv_operand_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitMonitorStmtAccess().getOperandValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleExitMonitorStmt4150);
            lv_operand_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExitMonitorStmtRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_1_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExitMonitorStmt"


    // $ANTLR start "entryRuleNopStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1943:1: entryRuleNopStmt returns [EObject current=null] : iv_ruleNopStmt= ruleNopStmt EOF ;
    public final EObject entryRuleNopStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNopStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1944:2: (iv_ruleNopStmt= ruleNopStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1945:2: iv_ruleNopStmt= ruleNopStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopStmtRule()); 
            }
            pushFollow(FOLLOW_ruleNopStmt_in_entryRuleNopStmt4186);
            iv_ruleNopStmt=ruleNopStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNopStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNopStmt4196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNopStmt"


    // $ANTLR start "ruleNopStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1952:1: ruleNopStmt returns [EObject current=null] : ( () otherlv_1= 'nop' ) ;
    public final EObject ruleNopStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1955:28: ( ( () otherlv_1= 'nop' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1956:1: ( () otherlv_1= 'nop' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1956:1: ( () otherlv_1= 'nop' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1956:2: () otherlv_1= 'nop'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1956:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1957:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNopStmtAccess().getNopStmtAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleNopStmt4245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNopStmtAccess().getNopKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNopStmt"


    // $ANTLR start "entryRuleRetStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1977:1: entryRuleRetStmt returns [EObject current=null] : iv_ruleRetStmt= ruleRetStmt EOF ;
    public final EObject entryRuleRetStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1978:2: (iv_ruleRetStmt= ruleRetStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1979:2: iv_ruleRetStmt= ruleRetStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRetStmtRule()); 
            }
            pushFollow(FOLLOW_ruleRetStmt_in_entryRuleRetStmt4281);
            iv_ruleRetStmt=ruleRetStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRetStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetStmt4291); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetStmt"


    // $ANTLR start "ruleRetStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1986:1: ruleRetStmt returns [EObject current=null] : (otherlv_0= 'ret' ( (lv_target_1_0= ruleLocal ) ) ) ;
    public final EObject ruleRetStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_target_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1989:28: ( (otherlv_0= 'ret' ( (lv_target_1_0= ruleLocal ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1990:1: (otherlv_0= 'ret' ( (lv_target_1_0= ruleLocal ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1990:1: (otherlv_0= 'ret' ( (lv_target_1_0= ruleLocal ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1990:3: otherlv_0= 'ret' ( (lv_target_1_0= ruleLocal ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleRetStmt4328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRetStmtAccess().getRetKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1994:1: ( (lv_target_1_0= ruleLocal ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1995:1: (lv_target_1_0= ruleLocal )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1995:1: (lv_target_1_0= ruleLocal )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:1996:3: lv_target_1_0= ruleLocal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRetStmtAccess().getTargetLocalParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocal_in_ruleRetStmt4349);
            lv_target_1_0=ruleLocal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRetStmtRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"Local");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetStmt"


    // $ANTLR start "entryRuleReturnVoidStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2020:1: entryRuleReturnVoidStmt returns [EObject current=null] : iv_ruleReturnVoidStmt= ruleReturnVoidStmt EOF ;
    public final EObject entryRuleReturnVoidStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnVoidStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2021:2: (iv_ruleReturnVoidStmt= ruleReturnVoidStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2022:2: iv_ruleReturnVoidStmt= ruleReturnVoidStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnVoidStmtRule()); 
            }
            pushFollow(FOLLOW_ruleReturnVoidStmt_in_entryRuleReturnVoidStmt4385);
            iv_ruleReturnVoidStmt=ruleReturnVoidStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnVoidStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnVoidStmt4395); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnVoidStmt"


    // $ANTLR start "ruleReturnVoidStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2029:1: ruleReturnVoidStmt returns [EObject current=null] : ( () otherlv_1= 'return' ) ;
    public final EObject ruleReturnVoidStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2032:28: ( ( () otherlv_1= 'return' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2033:1: ( () otherlv_1= 'return' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2033:1: ( () otherlv_1= 'return' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2033:2: () otherlv_1= 'return'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2033:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2034:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnVoidStmtAccess().getReturnVoidStmtAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleReturnVoidStmt4444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnVoidStmtAccess().getReturnKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnVoidStmt"


    // $ANTLR start "entryRuleReturnStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2054:1: entryRuleReturnStmt returns [EObject current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final EObject entryRuleReturnStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStmt = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2055:2: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2056:2: iv_ruleReturnStmt= ruleReturnStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStmtRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStmt_in_entryRuleReturnStmt4480);
            iv_ruleReturnStmt=ruleReturnStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStmt4490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStmt"


    // $ANTLR start "ruleReturnStmt"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2063:1: ruleReturnStmt returns [EObject current=null] : (otherlv_0= 'return' ( (lv_operand_1_0= ruleValue ) ) ) ;
    public final EObject ruleReturnStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2066:28: ( (otherlv_0= 'return' ( (lv_operand_1_0= ruleValue ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2067:1: (otherlv_0= 'return' ( (lv_operand_1_0= ruleValue ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2067:1: (otherlv_0= 'return' ( (lv_operand_1_0= ruleValue ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2067:3: otherlv_0= 'return' ( (lv_operand_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleReturnStmt4527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnStmtAccess().getReturnKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2071:1: ( (lv_operand_1_0= ruleValue ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2072:1: (lv_operand_1_0= ruleValue )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2072:1: (lv_operand_1_0= ruleValue )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2073:3: lv_operand_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnStmtAccess().getOperandValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleReturnStmt4548);
            lv_operand_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnStmtRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_1_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStmt"


    // $ANTLR start "entryRuleCase"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2097:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2098:2: (iv_ruleCase= ruleCase EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2099:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4584);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2106:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_target_3_0= ruleGotoStmt ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_target_3_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2109:28: ( (otherlv_0= 'case' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_target_3_0= ruleGotoStmt ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2110:1: (otherlv_0= 'case' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_target_3_0= ruleGotoStmt ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2110:1: (otherlv_0= 'case' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_target_3_0= ruleGotoStmt ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2110:3: otherlv_0= 'case' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_target_3_0= ruleGotoStmt ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCase4631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2114:1: ( (lv_value_1_0= RULE_INT ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2115:1: (lv_value_1_0= RULE_INT )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2115:1: (lv_value_1_0= RULE_INT )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2116:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCase4648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getCaseAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCaseRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCase4665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getColonKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2136:1: ( (lv_target_3_0= ruleGotoStmt ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2137:1: (lv_target_3_0= ruleGotoStmt )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2137:1: (lv_target_3_0= ruleGotoStmt )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2138:3: lv_target_3_0= ruleGotoStmt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getTargetGotoStmtParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGotoStmt_in_ruleCase4686);
            lv_target_3_0=ruleGotoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_3_0, 
                      		"GotoStmt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleValue"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2164:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2165:2: (iv_ruleValue= ruleValue EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2166:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4724);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4734); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2173:1: ruleValue returns [EObject current=null] : (this_NonExpr_0= ruleNonExpr | this_Expr_1= ruleExpr ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_NonExpr_0 = null;

        EObject this_Expr_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2176:28: ( (this_NonExpr_0= ruleNonExpr | this_Expr_1= ruleExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2177:1: (this_NonExpr_0= ruleNonExpr | this_Expr_1= ruleExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2177:1: (this_NonExpr_0= ruleNonExpr | this_Expr_1= ruleExpr )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2178:2: this_NonExpr_0= ruleNonExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNonExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNonExpr_in_ruleValue4784);
                    this_NonExpr_0=ruleNonExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NonExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2191:2: this_Expr_1= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleValue4814);
                    this_Expr_1=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNonExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2210:1: entryRuleNonExpr returns [EObject current=null] : iv_ruleNonExpr= ruleNonExpr EOF ;
    public final EObject entryRuleNonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2211:2: (iv_ruleNonExpr= ruleNonExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2212:2: iv_ruleNonExpr= ruleNonExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonExprRule()); 
            }
            pushFollow(FOLLOW_ruleNonExpr_in_entryRuleNonExpr4849);
            iv_ruleNonExpr=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonExpr4859); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonExpr"


    // $ANTLR start "ruleNonExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2219:1: ruleNonExpr returns [EObject current=null] : (this_Constant_0= ruleConstant | this_Ref_1= ruleRef ) ;
    public final EObject ruleNonExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_Ref_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2222:28: ( (this_Constant_0= ruleConstant | this_Ref_1= ruleRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2223:1: (this_Constant_0= ruleConstant | this_Ref_1= ruleRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2223:1: (this_Constant_0= ruleConstant | this_Ref_1= ruleRef )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_STRING)||LA25_0==16||LA25_0==81) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||LA25_0==60||LA25_0==68||LA25_0==78) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2224:2: this_Constant_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonExprAccess().getConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleNonExpr4909);
                    this_Constant_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2237:2: this_Ref_1= ruleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonExprAccess().getRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleNonExpr4939);
                    this_Ref_1=ruleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Ref_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonExpr"


    // $ANTLR start "entryRuleExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2256:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2257:2: (iv_ruleExpr= ruleExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2258:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr4974);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr4984); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2265:1: ruleExpr returns [EObject current=null] : (this_AnyNewExpr_0= ruleAnyNewExpr | this_BinOpExpr_1= ruleBinOpExpr | this_CastExpr_2= ruleCastExpr | this_InstanceOfExpr_3= ruleInstanceOfExpr | this_InvokeExpr_4= ruleInvokeExpr | this_UnopExpr_5= ruleUnopExpr ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AnyNewExpr_0 = null;

        EObject this_BinOpExpr_1 = null;

        EObject this_CastExpr_2 = null;

        EObject this_InstanceOfExpr_3 = null;

        EObject this_InvokeExpr_4 = null;

        EObject this_UnopExpr_5 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2268:28: ( (this_AnyNewExpr_0= ruleAnyNewExpr | this_BinOpExpr_1= ruleBinOpExpr | this_CastExpr_2= ruleCastExpr | this_InstanceOfExpr_3= ruleInstanceOfExpr | this_InvokeExpr_4= ruleInvokeExpr | this_UnopExpr_5= ruleUnopExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2269:1: (this_AnyNewExpr_0= ruleAnyNewExpr | this_BinOpExpr_1= ruleBinOpExpr | this_CastExpr_2= ruleCastExpr | this_InstanceOfExpr_3= ruleInstanceOfExpr | this_InvokeExpr_4= ruleInvokeExpr | this_UnopExpr_5= ruleUnopExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2269:1: (this_AnyNewExpr_0= ruleAnyNewExpr | this_BinOpExpr_1= ruleBinOpExpr | this_CastExpr_2= ruleCastExpr | this_InstanceOfExpr_3= ruleInstanceOfExpr | this_InvokeExpr_4= ruleInvokeExpr | this_UnopExpr_5= ruleUnopExpr )
            int alt26=6;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2270:2: this_AnyNewExpr_0= ruleAnyNewExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getAnyNewExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyNewExpr_in_ruleExpr5034);
                    this_AnyNewExpr_0=ruleAnyNewExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnyNewExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2283:2: this_BinOpExpr_1= ruleBinOpExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getBinOpExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinOpExpr_in_ruleExpr5064);
                    this_BinOpExpr_1=ruleBinOpExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BinOpExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2296:2: this_CastExpr_2= ruleCastExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getCastExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCastExpr_in_ruleExpr5094);
                    this_CastExpr_2=ruleCastExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CastExpr_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2309:2: this_InstanceOfExpr_3= ruleInstanceOfExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getInstanceOfExprParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceOfExpr_in_ruleExpr5124);
                    this_InstanceOfExpr_3=ruleInstanceOfExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstanceOfExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2322:2: this_InvokeExpr_4= ruleInvokeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getInvokeExprParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInvokeExpr_in_ruleExpr5154);
                    this_InvokeExpr_4=ruleInvokeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvokeExpr_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2335:2: this_UnopExpr_5= ruleUnopExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getUnopExprParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnopExpr_in_ruleExpr5184);
                    this_UnopExpr_5=ruleUnopExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnopExpr_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAnyNewExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2354:1: entryRuleAnyNewExpr returns [EObject current=null] : iv_ruleAnyNewExpr= ruleAnyNewExpr EOF ;
    public final EObject entryRuleAnyNewExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyNewExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2355:2: (iv_ruleAnyNewExpr= ruleAnyNewExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2356:2: iv_ruleAnyNewExpr= ruleAnyNewExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyNewExprRule()); 
            }
            pushFollow(FOLLOW_ruleAnyNewExpr_in_entryRuleAnyNewExpr5219);
            iv_ruleAnyNewExpr=ruleAnyNewExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyNewExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyNewExpr5229); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyNewExpr"


    // $ANTLR start "ruleAnyNewExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2363:1: ruleAnyNewExpr returns [EObject current=null] : (this_NewArrayExpr_0= ruleNewArrayExpr | this_NewExpr_1= ruleNewExpr | this_NewMultiArrayExpr_2= ruleNewMultiArrayExpr ) ;
    public final EObject ruleAnyNewExpr() throws RecognitionException {
        EObject current = null;

        EObject this_NewArrayExpr_0 = null;

        EObject this_NewExpr_1 = null;

        EObject this_NewMultiArrayExpr_2 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2366:28: ( (this_NewArrayExpr_0= ruleNewArrayExpr | this_NewExpr_1= ruleNewExpr | this_NewMultiArrayExpr_2= ruleNewMultiArrayExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2367:1: (this_NewArrayExpr_0= ruleNewArrayExpr | this_NewExpr_1= ruleNewExpr | this_NewMultiArrayExpr_2= ruleNewMultiArrayExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2367:1: (this_NewArrayExpr_0= ruleNewArrayExpr | this_NewExpr_1= ruleNewExpr | this_NewMultiArrayExpr_2= ruleNewMultiArrayExpr )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt27=1;
                }
                break;
            case 71:
                {
                alt27=2;
                }
                break;
            case 72:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2368:2: this_NewArrayExpr_0= ruleNewArrayExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyNewExprAccess().getNewArrayExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewArrayExpr_in_ruleAnyNewExpr5279);
                    this_NewArrayExpr_0=ruleNewArrayExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewArrayExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2381:2: this_NewExpr_1= ruleNewExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyNewExprAccess().getNewExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewExpr_in_ruleAnyNewExpr5309);
                    this_NewExpr_1=ruleNewExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2394:2: this_NewMultiArrayExpr_2= ruleNewMultiArrayExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyNewExprAccess().getNewMultiArrayExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewMultiArrayExpr_in_ruleAnyNewExpr5339);
                    this_NewMultiArrayExpr_2=ruleNewMultiArrayExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewMultiArrayExpr_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyNewExpr"


    // $ANTLR start "entryRuleBinOpExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2413:1: entryRuleBinOpExpr returns [EObject current=null] : iv_ruleBinOpExpr= ruleBinOpExpr EOF ;
    public final EObject entryRuleBinOpExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinOpExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2414:2: (iv_ruleBinOpExpr= ruleBinOpExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2415:2: iv_ruleBinOpExpr= ruleBinOpExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinOpExprRule()); 
            }
            pushFollow(FOLLOW_ruleBinOpExpr_in_entryRuleBinOpExpr5374);
            iv_ruleBinOpExpr=ruleBinOpExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinOpExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinOpExpr5384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinOpExpr"


    // $ANTLR start "ruleBinOpExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2422:1: ruleBinOpExpr returns [EObject current=null] : (this_AddExpr_0= ruleAddExpr | this_AndExpr_1= ruleAndExpr | this_CmpExpr_2= ruleCmpExpr | this_CmpgExpr_3= ruleCmpgExpr | this_CmplExpr_4= ruleCmplExpr | this_ConditionalExpr_5= ruleConditionalExpr | this_DivExpr_6= ruleDivExpr | this_MulExpr_7= ruleMulExpr | this_OrExpr_8= ruleOrExpr | this_RemExpr_9= ruleRemExpr | this_ShlExpr_10= ruleShlExpr | this_ShrExpr_11= ruleShrExpr | this_SubExpr_12= ruleSubExpr | this_UshrExpr_13= ruleUshrExpr | this_XorExpr_14= ruleXorExpr ) ;
    public final EObject ruleBinOpExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpr_0 = null;

        EObject this_AndExpr_1 = null;

        EObject this_CmpExpr_2 = null;

        EObject this_CmpgExpr_3 = null;

        EObject this_CmplExpr_4 = null;

        EObject this_ConditionalExpr_5 = null;

        EObject this_DivExpr_6 = null;

        EObject this_MulExpr_7 = null;

        EObject this_OrExpr_8 = null;

        EObject this_RemExpr_9 = null;

        EObject this_ShlExpr_10 = null;

        EObject this_ShrExpr_11 = null;

        EObject this_SubExpr_12 = null;

        EObject this_UshrExpr_13 = null;

        EObject this_XorExpr_14 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2425:28: ( (this_AddExpr_0= ruleAddExpr | this_AndExpr_1= ruleAndExpr | this_CmpExpr_2= ruleCmpExpr | this_CmpgExpr_3= ruleCmpgExpr | this_CmplExpr_4= ruleCmplExpr | this_ConditionalExpr_5= ruleConditionalExpr | this_DivExpr_6= ruleDivExpr | this_MulExpr_7= ruleMulExpr | this_OrExpr_8= ruleOrExpr | this_RemExpr_9= ruleRemExpr | this_ShlExpr_10= ruleShlExpr | this_ShrExpr_11= ruleShrExpr | this_SubExpr_12= ruleSubExpr | this_UshrExpr_13= ruleUshrExpr | this_XorExpr_14= ruleXorExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2426:1: (this_AddExpr_0= ruleAddExpr | this_AndExpr_1= ruleAndExpr | this_CmpExpr_2= ruleCmpExpr | this_CmpgExpr_3= ruleCmpgExpr | this_CmplExpr_4= ruleCmplExpr | this_ConditionalExpr_5= ruleConditionalExpr | this_DivExpr_6= ruleDivExpr | this_MulExpr_7= ruleMulExpr | this_OrExpr_8= ruleOrExpr | this_RemExpr_9= ruleRemExpr | this_ShlExpr_10= ruleShlExpr | this_ShrExpr_11= ruleShrExpr | this_SubExpr_12= ruleSubExpr | this_UshrExpr_13= ruleUshrExpr | this_XorExpr_14= ruleXorExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2426:1: (this_AddExpr_0= ruleAddExpr | this_AndExpr_1= ruleAndExpr | this_CmpExpr_2= ruleCmpExpr | this_CmpgExpr_3= ruleCmpgExpr | this_CmplExpr_4= ruleCmplExpr | this_ConditionalExpr_5= ruleConditionalExpr | this_DivExpr_6= ruleDivExpr | this_MulExpr_7= ruleMulExpr | this_OrExpr_8= ruleOrExpr | this_RemExpr_9= ruleRemExpr | this_ShlExpr_10= ruleShlExpr | this_ShrExpr_11= ruleShrExpr | this_SubExpr_12= ruleSubExpr | this_UshrExpr_13= ruleUshrExpr | this_XorExpr_14= ruleXorExpr )
            int alt28=15;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2427:2: this_AddExpr_0= ruleAddExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getAddExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAddExpr_in_ruleBinOpExpr5434);
                    this_AddExpr_0=ruleAddExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AddExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2440:2: this_AndExpr_1= ruleAndExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getAndExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAndExpr_in_ruleBinOpExpr5464);
                    this_AndExpr_1=ruleAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AndExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2453:2: this_CmpExpr_2= ruleCmpExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getCmpExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCmpExpr_in_ruleBinOpExpr5494);
                    this_CmpExpr_2=ruleCmpExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CmpExpr_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2466:2: this_CmpgExpr_3= ruleCmpgExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getCmpgExprParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCmpgExpr_in_ruleBinOpExpr5524);
                    this_CmpgExpr_3=ruleCmpgExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CmpgExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2479:2: this_CmplExpr_4= ruleCmplExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getCmplExprParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCmplExpr_in_ruleBinOpExpr5554);
                    this_CmplExpr_4=ruleCmplExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CmplExpr_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2492:2: this_ConditionalExpr_5= ruleConditionalExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getConditionalExprParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditionalExpr_in_ruleBinOpExpr5584);
                    this_ConditionalExpr_5=ruleConditionalExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConditionalExpr_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2505:2: this_DivExpr_6= ruleDivExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getDivExprParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivExpr_in_ruleBinOpExpr5614);
                    this_DivExpr_6=ruleDivExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DivExpr_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2518:2: this_MulExpr_7= ruleMulExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getMulExprParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMulExpr_in_ruleBinOpExpr5644);
                    this_MulExpr_7=ruleMulExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MulExpr_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2531:2: this_OrExpr_8= ruleOrExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getOrExprParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrExpr_in_ruleBinOpExpr5674);
                    this_OrExpr_8=ruleOrExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OrExpr_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2544:2: this_RemExpr_9= ruleRemExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getRemExprParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRemExpr_in_ruleBinOpExpr5704);
                    this_RemExpr_9=ruleRemExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RemExpr_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2557:2: this_ShlExpr_10= ruleShlExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getShlExprParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleShlExpr_in_ruleBinOpExpr5734);
                    this_ShlExpr_10=ruleShlExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ShlExpr_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2570:2: this_ShrExpr_11= ruleShrExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getShrExprParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleShrExpr_in_ruleBinOpExpr5764);
                    this_ShrExpr_11=ruleShrExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ShrExpr_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2583:2: this_SubExpr_12= ruleSubExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getSubExprParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubExpr_in_ruleBinOpExpr5794);
                    this_SubExpr_12=ruleSubExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubExpr_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2596:2: this_UshrExpr_13= ruleUshrExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getUshrExprParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUshrExpr_in_ruleBinOpExpr5824);
                    this_UshrExpr_13=ruleUshrExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UshrExpr_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2609:2: this_XorExpr_14= ruleXorExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinOpExprAccess().getXorExprParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXorExpr_in_ruleBinOpExpr5854);
                    this_XorExpr_14=ruleXorExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XorExpr_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinOpExpr"


    // $ANTLR start "entryRuleAddExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2628:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2629:2: (iv_ruleAddExpr= ruleAddExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2630:2: iv_ruleAddExpr= ruleAddExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExprRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpr_in_entryRuleAddExpr5889);
            iv_ruleAddExpr=ruleAddExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpr5899); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2637:1: ruleAddExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '+' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2640:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '+' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2641:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '+' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2641:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '+' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2641:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '+' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2641:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2642:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2642:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2643:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAddExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleAddExpr5945);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAddExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleAddExpr5957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAddExprAccess().getPlusSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2663:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2664:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2664:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2665:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAddExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleAddExpr5978);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAddExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2689:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2690:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2691:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr6014);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr6024); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2698:1: ruleAndExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '&' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2701:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '&' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2702:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '&' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2702:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '&' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2702:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '&' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2702:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2703:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2703:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2704:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleAndExpr6070);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAndExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAndExpr6082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAndExprAccess().getAmpersandKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2724:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2725:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2725:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2726:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleAndExpr6103);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAndExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleCmpExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2750:1: entryRuleCmpExpr returns [EObject current=null] : iv_ruleCmpExpr= ruleCmpExpr EOF ;
    public final EObject entryRuleCmpExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2751:2: (iv_ruleCmpExpr= ruleCmpExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2752:2: iv_ruleCmpExpr= ruleCmpExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCmpExprRule()); 
            }
            pushFollow(FOLLOW_ruleCmpExpr_in_entryRuleCmpExpr6139);
            iv_ruleCmpExpr=ruleCmpExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCmpExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpExpr6149); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmpExpr"


    // $ANTLR start "ruleCmpExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2759:1: ruleCmpExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmp' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleCmpExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2762:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmp' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2763:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmp' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2763:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmp' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2763:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmp' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2763:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2764:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2764:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2765:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCmpExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleCmpExpr6195);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCmpExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCmpExpr6207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCmpExprAccess().getCmpKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2785:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2786:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2786:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2787:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCmpExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleCmpExpr6228);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCmpExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmpExpr"


    // $ANTLR start "entryRuleCmpgExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2811:1: entryRuleCmpgExpr returns [EObject current=null] : iv_ruleCmpgExpr= ruleCmpgExpr EOF ;
    public final EObject entryRuleCmpgExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpgExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2812:2: (iv_ruleCmpgExpr= ruleCmpgExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2813:2: iv_ruleCmpgExpr= ruleCmpgExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCmpgExprRule()); 
            }
            pushFollow(FOLLOW_ruleCmpgExpr_in_entryRuleCmpgExpr6264);
            iv_ruleCmpgExpr=ruleCmpgExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCmpgExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpgExpr6274); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmpgExpr"


    // $ANTLR start "ruleCmpgExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2820:1: ruleCmpgExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpg' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleCmpgExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2823:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpg' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2824:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpg' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2824:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpg' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2824:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpg' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2824:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2825:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2825:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2826:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCmpgExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleCmpgExpr6320);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCmpgExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleCmpgExpr6332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCmpgExprAccess().getCmpgKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2846:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2847:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2847:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2848:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCmpgExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleCmpgExpr6353);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCmpgExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmpgExpr"


    // $ANTLR start "entryRuleCmplExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2872:1: entryRuleCmplExpr returns [EObject current=null] : iv_ruleCmplExpr= ruleCmplExpr EOF ;
    public final EObject entryRuleCmplExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmplExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2873:2: (iv_ruleCmplExpr= ruleCmplExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2874:2: iv_ruleCmplExpr= ruleCmplExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCmplExprRule()); 
            }
            pushFollow(FOLLOW_ruleCmplExpr_in_entryRuleCmplExpr6389);
            iv_ruleCmplExpr=ruleCmplExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCmplExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmplExpr6399); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmplExpr"


    // $ANTLR start "ruleCmplExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2881:1: ruleCmplExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpl' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleCmplExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2884:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpl' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2885:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpl' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2885:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpl' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2885:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= 'cmpl' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2885:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2886:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2886:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2887:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCmplExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleCmplExpr6445);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCmplExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleCmplExpr6457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCmplExprAccess().getCmplKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2907:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2908:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2908:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2909:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCmplExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleCmplExpr6478);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCmplExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmplExpr"


    // $ANTLR start "entryRuleConditionalExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2933:1: entryRuleConditionalExpr returns [EObject current=null] : iv_ruleConditionalExpr= ruleConditionalExpr EOF ;
    public final EObject entryRuleConditionalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2934:2: (iv_ruleConditionalExpr= ruleConditionalExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2935:2: iv_ruleConditionalExpr= ruleConditionalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExprRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpr_in_entryRuleConditionalExpr6514);
            iv_ruleConditionalExpr=ruleConditionalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpr6524); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpr"


    // $ANTLR start "ruleConditionalExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2942:1: ruleConditionalExpr returns [EObject current=null] : (this_EqExpr_0= ruleEqExpr | this_GeExpr_1= ruleGeExpr | this_GtExpr_2= ruleGtExpr | this_LeExpr_3= ruleLeExpr | this_LtExpr_4= ruleLtExpr | this_NeExpr_5= ruleNeExpr ) ;
    public final EObject ruleConditionalExpr() throws RecognitionException {
        EObject current = null;

        EObject this_EqExpr_0 = null;

        EObject this_GeExpr_1 = null;

        EObject this_GtExpr_2 = null;

        EObject this_LeExpr_3 = null;

        EObject this_LtExpr_4 = null;

        EObject this_NeExpr_5 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2945:28: ( (this_EqExpr_0= ruleEqExpr | this_GeExpr_1= ruleGeExpr | this_GtExpr_2= ruleGtExpr | this_LeExpr_3= ruleLeExpr | this_LtExpr_4= ruleLtExpr | this_NeExpr_5= ruleNeExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2946:1: (this_EqExpr_0= ruleEqExpr | this_GeExpr_1= ruleGeExpr | this_GtExpr_2= ruleGtExpr | this_LeExpr_3= ruleLeExpr | this_LtExpr_4= ruleLtExpr | this_NeExpr_5= ruleNeExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2946:1: (this_EqExpr_0= ruleEqExpr | this_GeExpr_1= ruleGeExpr | this_GtExpr_2= ruleGtExpr | this_LeExpr_3= ruleLeExpr | this_LtExpr_4= ruleLtExpr | this_NeExpr_5= ruleNeExpr )
            int alt29=6;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2947:2: this_EqExpr_0= ruleEqExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalExprAccess().getEqExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEqExpr_in_ruleConditionalExpr6574);
                    this_EqExpr_0=ruleEqExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EqExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2960:2: this_GeExpr_1= ruleGeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalExprAccess().getGeExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGeExpr_in_ruleConditionalExpr6604);
                    this_GeExpr_1=ruleGeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GeExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2973:2: this_GtExpr_2= ruleGtExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalExprAccess().getGtExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGtExpr_in_ruleConditionalExpr6634);
                    this_GtExpr_2=ruleGtExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GtExpr_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2986:2: this_LeExpr_3= ruleLeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalExprAccess().getLeExprParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLeExpr_in_ruleConditionalExpr6664);
                    this_LeExpr_3=ruleLeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LeExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2999:2: this_LtExpr_4= ruleLtExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalExprAccess().getLtExprParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLtExpr_in_ruleConditionalExpr6694);
                    this_LtExpr_4=ruleLtExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LtExpr_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3012:2: this_NeExpr_5= ruleNeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalExprAccess().getNeExprParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNeExpr_in_ruleConditionalExpr6724);
                    this_NeExpr_5=ruleNeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NeExpr_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpr"


    // $ANTLR start "entryRuleDivExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3031:1: entryRuleDivExpr returns [EObject current=null] : iv_ruleDivExpr= ruleDivExpr EOF ;
    public final EObject entryRuleDivExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3032:2: (iv_ruleDivExpr= ruleDivExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3033:2: iv_ruleDivExpr= ruleDivExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExprRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpr_in_entryRuleDivExpr6759);
            iv_ruleDivExpr=ruleDivExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpr6769); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpr"


    // $ANTLR start "ruleDivExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3040:1: ruleDivExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '/' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleDivExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3043:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '/' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3044:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '/' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3044:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '/' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3044:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '/' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3044:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3045:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3045:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3046:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDivExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleDivExpr6815);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDivExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDivExpr6827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDivExprAccess().getSolidusKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3066:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3067:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3067:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3068:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDivExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleDivExpr6848);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDivExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivExpr"


    // $ANTLR start "entryRuleMulExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3092:1: entryRuleMulExpr returns [EObject current=null] : iv_ruleMulExpr= ruleMulExpr EOF ;
    public final EObject entryRuleMulExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3093:2: (iv_ruleMulExpr= ruleMulExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3094:2: iv_ruleMulExpr= ruleMulExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulExprRule()); 
            }
            pushFollow(FOLLOW_ruleMulExpr_in_entryRuleMulExpr6884);
            iv_ruleMulExpr=ruleMulExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulExpr6894); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulExpr"


    // $ANTLR start "ruleMulExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3101:1: ruleMulExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '*' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleMulExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3104:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '*' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3105:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '*' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3105:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '*' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3105:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '*' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3105:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3106:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3106:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3107:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMulExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleMulExpr6940);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMulExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleMulExpr6952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMulExprAccess().getAsteriskKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3127:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3128:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3128:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3129:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMulExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleMulExpr6973);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMulExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3153:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3154:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3155:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr7009);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr7019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3162:1: ruleOrExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '|' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3165:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '|' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3166:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '|' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3166:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '|' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3166:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '|' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3166:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3167:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3167:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3168:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleOrExpr7065);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleOrExpr7077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrExprAccess().getVerticalLineKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3188:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3189:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3189:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3190:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleOrExpr7098);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleRemExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3214:1: entryRuleRemExpr returns [EObject current=null] : iv_ruleRemExpr= ruleRemExpr EOF ;
    public final EObject entryRuleRemExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3215:2: (iv_ruleRemExpr= ruleRemExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3216:2: iv_ruleRemExpr= ruleRemExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemExprRule()); 
            }
            pushFollow(FOLLOW_ruleRemExpr_in_entryRuleRemExpr7134);
            iv_ruleRemExpr=ruleRemExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRemExpr7144); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemExpr"


    // $ANTLR start "ruleRemExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3223:1: ruleRemExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '%' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleRemExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3226:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '%' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3227:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '%' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3227:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '%' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3227:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '%' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3227:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3228:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3228:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3229:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRemExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleRemExpr7190);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRemExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleRemExpr7202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRemExprAccess().getPercentSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3249:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3250:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3250:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3251:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRemExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleRemExpr7223);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRemExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemExpr"


    // $ANTLR start "entryRuleShlExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3275:1: entryRuleShlExpr returns [EObject current=null] : iv_ruleShlExpr= ruleShlExpr EOF ;
    public final EObject entryRuleShlExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShlExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3276:2: (iv_ruleShlExpr= ruleShlExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3277:2: iv_ruleShlExpr= ruleShlExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShlExprRule()); 
            }
            pushFollow(FOLLOW_ruleShlExpr_in_entryRuleShlExpr7259);
            iv_ruleShlExpr=ruleShlExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShlExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShlExpr7269); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShlExpr"


    // $ANTLR start "ruleShlExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3284:1: ruleShlExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<<' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleShlExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3287:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<<' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3288:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<<' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3288:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<<' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3288:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<<' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3288:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3289:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3289:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3290:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShlExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleShlExpr7315);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getShlExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleShlExpr7327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShlExprAccess().getLessThanSignLessThanSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3310:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3311:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3311:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3312:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShlExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleShlExpr7348);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getShlExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShlExpr"


    // $ANTLR start "entryRuleShrExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3336:1: entryRuleShrExpr returns [EObject current=null] : iv_ruleShrExpr= ruleShrExpr EOF ;
    public final EObject entryRuleShrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShrExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3337:2: (iv_ruleShrExpr= ruleShrExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3338:2: iv_ruleShrExpr= ruleShrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShrExprRule()); 
            }
            pushFollow(FOLLOW_ruleShrExpr_in_entryRuleShrExpr7384);
            iv_ruleShrExpr=ruleShrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShrExpr7394); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShrExpr"


    // $ANTLR start "ruleShrExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3345:1: ruleShrExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleShrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3348:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3349:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3349:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3349:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3349:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3350:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3350:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3351:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShrExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleShrExpr7440);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getShrExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleShrExpr7452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShrExprAccess().getGreaterThanSignGreaterThanSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3371:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3372:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3372:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3373:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShrExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleShrExpr7473);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getShrExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShrExpr"


    // $ANTLR start "entryRuleSubExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3397:1: entryRuleSubExpr returns [EObject current=null] : iv_ruleSubExpr= ruleSubExpr EOF ;
    public final EObject entryRuleSubExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3398:2: (iv_ruleSubExpr= ruleSubExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3399:2: iv_ruleSubExpr= ruleSubExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExprRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpr_in_entryRuleSubExpr7509);
            iv_ruleSubExpr=ruleSubExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpr7519); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpr"


    // $ANTLR start "ruleSubExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3406:1: ruleSubExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '-' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleSubExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3409:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '-' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3410:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '-' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3410:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '-' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3410:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '-' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3410:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3411:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3411:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3412:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleSubExpr7565);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleSubExpr7577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubExprAccess().getHyphenMinusKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3432:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3433:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3433:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3434:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleSubExpr7598);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubExpr"


    // $ANTLR start "entryRuleUshrExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3458:1: entryRuleUshrExpr returns [EObject current=null] : iv_ruleUshrExpr= ruleUshrExpr EOF ;
    public final EObject entryRuleUshrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUshrExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3459:2: (iv_ruleUshrExpr= ruleUshrExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3460:2: iv_ruleUshrExpr= ruleUshrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUshrExprRule()); 
            }
            pushFollow(FOLLOW_ruleUshrExpr_in_entryRuleUshrExpr7634);
            iv_ruleUshrExpr=ruleUshrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUshrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUshrExpr7644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUshrExpr"


    // $ANTLR start "ruleUshrExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3467:1: ruleUshrExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleUshrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3470:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3471:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3471:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>>' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3471:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>>>' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3471:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3472:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3472:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3473:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUshrExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleUshrExpr7690);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUshrExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleUshrExpr7702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUshrExprAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3493:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3494:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3494:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3495:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUshrExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleUshrExpr7723);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUshrExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUshrExpr"


    // $ANTLR start "entryRuleXorExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3519:1: entryRuleXorExpr returns [EObject current=null] : iv_ruleXorExpr= ruleXorExpr EOF ;
    public final EObject entryRuleXorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3520:2: (iv_ruleXorExpr= ruleXorExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3521:2: iv_ruleXorExpr= ruleXorExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExprRule()); 
            }
            pushFollow(FOLLOW_ruleXorExpr_in_entryRuleXorExpr7759);
            iv_ruleXorExpr=ruleXorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXorExpr7769); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorExpr"


    // $ANTLR start "ruleXorExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3528:1: ruleXorExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '^' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleXorExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3531:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '^' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3532:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '^' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3532:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '^' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3532:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '^' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3532:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3533:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3533:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3534:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXorExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleXorExpr7815);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXorExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXorExpr7827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXorExprAccess().getCircumflexAccentKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3554:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3555:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3555:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3556:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXorExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleXorExpr7848);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXorExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorExpr"


    // $ANTLR start "entryRuleEqExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3580:1: entryRuleEqExpr returns [EObject current=null] : iv_ruleEqExpr= ruleEqExpr EOF ;
    public final EObject entryRuleEqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3581:2: (iv_ruleEqExpr= ruleEqExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3582:2: iv_ruleEqExpr= ruleEqExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqExprRule()); 
            }
            pushFollow(FOLLOW_ruleEqExpr_in_entryRuleEqExpr7884);
            iv_ruleEqExpr=ruleEqExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqExpr7894); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqExpr"


    // $ANTLR start "ruleEqExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3589:1: ruleEqExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '==' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleEqExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3592:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '==' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3593:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '==' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3593:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '==' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3593:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '==' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3593:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3594:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3594:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3595:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleEqExpr7940);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEqExpr7952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3615:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3616:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3616:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3617:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleEqExpr7973);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqExpr"


    // $ANTLR start "entryRuleGeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3641:1: entryRuleGeExpr returns [EObject current=null] : iv_ruleGeExpr= ruleGeExpr EOF ;
    public final EObject entryRuleGeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3642:2: (iv_ruleGeExpr= ruleGeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3643:2: iv_ruleGeExpr= ruleGeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeExprRule()); 
            }
            pushFollow(FOLLOW_ruleGeExpr_in_entryRuleGeExpr8009);
            iv_ruleGeExpr=ruleGeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeExpr8019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeExpr"


    // $ANTLR start "ruleGeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3650:1: ruleGeExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>=' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleGeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3653:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>=' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3654:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>=' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3654:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>=' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3654:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>=' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3654:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3655:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3655:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3656:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleGeExpr8065);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleGeExpr8077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGeExprAccess().getGreaterThanSignEqualsSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3676:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3677:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3677:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3678:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleGeExpr8098);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeExpr"


    // $ANTLR start "entryRuleGtExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3702:1: entryRuleGtExpr returns [EObject current=null] : iv_ruleGtExpr= ruleGtExpr EOF ;
    public final EObject entryRuleGtExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGtExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3703:2: (iv_ruleGtExpr= ruleGtExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3704:2: iv_ruleGtExpr= ruleGtExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGtExprRule()); 
            }
            pushFollow(FOLLOW_ruleGtExpr_in_entryRuleGtExpr8134);
            iv_ruleGtExpr=ruleGtExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGtExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGtExpr8144); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGtExpr"


    // $ANTLR start "ruleGtExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3711:1: ruleGtExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleGtExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3714:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3715:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3715:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3715:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '>' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3715:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3716:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3716:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3717:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGtExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleGtExpr8190);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGtExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleGtExpr8202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGtExprAccess().getGreaterThanSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3737:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3738:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3738:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3739:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGtExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleGtExpr8223);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGtExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGtExpr"


    // $ANTLR start "entryRuleLeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3763:1: entryRuleLeExpr returns [EObject current=null] : iv_ruleLeExpr= ruleLeExpr EOF ;
    public final EObject entryRuleLeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3764:2: (iv_ruleLeExpr= ruleLeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3765:2: iv_ruleLeExpr= ruleLeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeExprRule()); 
            }
            pushFollow(FOLLOW_ruleLeExpr_in_entryRuleLeExpr8259);
            iv_ruleLeExpr=ruleLeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeExpr8269); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeExpr"


    // $ANTLR start "ruleLeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3772:1: ruleLeExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<=' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleLeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3775:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<=' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3776:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<=' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3776:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<=' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3776:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<=' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3776:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3777:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3777:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3778:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleLeExpr8315);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLeExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleLeExpr8327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLeExprAccess().getLessThanSignEqualsSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3798:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3799:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3799:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3800:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleLeExpr8348);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLeExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeExpr"


    // $ANTLR start "entryRuleLtExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3824:1: entryRuleLtExpr returns [EObject current=null] : iv_ruleLtExpr= ruleLtExpr EOF ;
    public final EObject entryRuleLtExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLtExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3825:2: (iv_ruleLtExpr= ruleLtExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3826:2: iv_ruleLtExpr= ruleLtExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLtExprRule()); 
            }
            pushFollow(FOLLOW_ruleLtExpr_in_entryRuleLtExpr8384);
            iv_ruleLtExpr=ruleLtExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLtExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLtExpr8394); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLtExpr"


    // $ANTLR start "ruleLtExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3833:1: ruleLtExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleLtExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3836:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3837:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3837:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3837:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '<' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3837:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3838:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3838:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3839:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLtExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleLtExpr8440);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLtExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleLtExpr8452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLtExprAccess().getLessThanSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3859:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3860:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3860:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3861:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLtExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleLtExpr8473);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLtExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLtExpr"


    // $ANTLR start "entryRuleNeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3885:1: entryRuleNeExpr returns [EObject current=null] : iv_ruleNeExpr= ruleNeExpr EOF ;
    public final EObject entryRuleNeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3886:2: (iv_ruleNeExpr= ruleNeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3887:2: iv_ruleNeExpr= ruleNeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNeExprRule()); 
            }
            pushFollow(FOLLOW_ruleNeExpr_in_entryRuleNeExpr8509);
            iv_ruleNeExpr=ruleNeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeExpr8519); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeExpr"


    // $ANTLR start "ruleNeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3894:1: ruleNeExpr returns [EObject current=null] : ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '!=' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) ;
    public final EObject ruleNeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftOp_0_0 = null;

        EObject lv_rightOp_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3897:28: ( ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '!=' ( (lv_rightOp_2_0= ruleNonExpr ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3898:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '!=' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3898:1: ( ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '!=' ( (lv_rightOp_2_0= ruleNonExpr ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3898:2: ( (lv_leftOp_0_0= ruleNonExpr ) ) otherlv_1= '!=' ( (lv_rightOp_2_0= ruleNonExpr ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3898:2: ( (lv_leftOp_0_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3899:1: (lv_leftOp_0_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3899:1: (lv_leftOp_0_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3900:3: lv_leftOp_0_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNeExprAccess().getLeftOpNonExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleNeExpr8565);
            lv_leftOp_0_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNeExprRule());
              	        }
                     		set(
                     			current, 
                     			"leftOp",
                      		lv_leftOp_0_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleNeExpr8577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNeExprAccess().getExclamationMarkEqualsSignKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3920:1: ( (lv_rightOp_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3921:1: (lv_rightOp_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3921:1: (lv_rightOp_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3922:3: lv_rightOp_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNeExprAccess().getRightOpNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleNeExpr8598);
            lv_rightOp_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNeExprRule());
              	        }
                     		set(
                     			current, 
                     			"rightOp",
                      		lv_rightOp_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeExpr"


    // $ANTLR start "entryRuleCastExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3946:1: entryRuleCastExpr returns [EObject current=null] : iv_ruleCastExpr= ruleCastExpr EOF ;
    public final EObject entryRuleCastExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3947:2: (iv_ruleCastExpr= ruleCastExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3948:2: iv_ruleCastExpr= ruleCastExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastExprRule()); 
            }
            pushFollow(FOLLOW_ruleCastExpr_in_entryRuleCastExpr8634);
            iv_ruleCastExpr=ruleCastExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastExpr8644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastExpr"


    // $ANTLR start "ruleCastExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3955:1: ruleCastExpr returns [EObject current=null] : (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedName ) ) otherlv_2= ')' ( (lv_operand_3_0= ruleValue ) ) ) ;
    public final EObject ruleCastExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3958:28: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedName ) ) otherlv_2= ')' ( (lv_operand_3_0= ruleValue ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3959:1: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedName ) ) otherlv_2= ')' ( (lv_operand_3_0= ruleValue ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3959:1: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedName ) ) otherlv_2= ')' ( (lv_operand_3_0= ruleValue ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3959:3: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedName ) ) otherlv_2= ')' ( (lv_operand_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleCastExpr8681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCastExprAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3963:1: ( (lv_type_1_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3964:1: (lv_type_1_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3964:1: (lv_type_1_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3965:3: lv_type_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCastExprAccess().getTypeQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCastExpr8702);
            lv_type_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCastExprRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleCastExpr8714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCastExprAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3985:1: ( (lv_operand_3_0= ruleValue ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3986:1: (lv_operand_3_0= ruleValue )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3986:1: (lv_operand_3_0= ruleValue )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:3987:3: lv_operand_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCastExprAccess().getOperandValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleCastExpr8735);
            lv_operand_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCastExprRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_3_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastExpr"


    // $ANTLR start "entryRuleInstanceOfExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4011:1: entryRuleInstanceOfExpr returns [EObject current=null] : iv_ruleInstanceOfExpr= ruleInstanceOfExpr EOF ;
    public final EObject entryRuleInstanceOfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceOfExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4012:2: (iv_ruleInstanceOfExpr= ruleInstanceOfExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4013:2: iv_ruleInstanceOfExpr= ruleInstanceOfExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceOfExprRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceOfExpr_in_entryRuleInstanceOfExpr8771);
            iv_ruleInstanceOfExpr=ruleInstanceOfExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceOfExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceOfExpr8781); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceOfExpr"


    // $ANTLR start "ruleInstanceOfExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4020:1: ruleInstanceOfExpr returns [EObject current=null] : ( ( (lv_operand_0_0= ruleRef ) ) otherlv_1= 'instanceof' ( (lv_type_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleInstanceOfExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4023:28: ( ( ( (lv_operand_0_0= ruleRef ) ) otherlv_1= 'instanceof' ( (lv_type_2_0= ruleQualifiedName ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4024:1: ( ( (lv_operand_0_0= ruleRef ) ) otherlv_1= 'instanceof' ( (lv_type_2_0= ruleQualifiedName ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4024:1: ( ( (lv_operand_0_0= ruleRef ) ) otherlv_1= 'instanceof' ( (lv_type_2_0= ruleQualifiedName ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4024:2: ( (lv_operand_0_0= ruleRef ) ) otherlv_1= 'instanceof' ( (lv_type_2_0= ruleQualifiedName ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4024:2: ( (lv_operand_0_0= ruleRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4025:1: (lv_operand_0_0= ruleRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4025:1: (lv_operand_0_0= ruleRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4026:3: lv_operand_0_0= ruleRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceOfExprAccess().getOperandRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRef_in_ruleInstanceOfExpr8827);
            lv_operand_0_0=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstanceOfExprRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_0_0, 
                      		"Ref");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleInstanceOfExpr8839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInstanceOfExprAccess().getInstanceofKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4046:1: ( (lv_type_2_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4047:1: (lv_type_2_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4047:1: (lv_type_2_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4048:3: lv_type_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceOfExprAccess().getTypeQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceOfExpr8860);
            lv_type_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstanceOfExprRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceOfExpr"


    // $ANTLR start "entryRuleSootMethodRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4072:1: entryRuleSootMethodRef returns [EObject current=null] : iv_ruleSootMethodRef= ruleSootMethodRef EOF ;
    public final EObject entryRuleSootMethodRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSootMethodRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4073:2: (iv_ruleSootMethodRef= ruleSootMethodRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4074:2: iv_ruleSootMethodRef= ruleSootMethodRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSootMethodRefRule()); 
            }
            pushFollow(FOLLOW_ruleSootMethodRef_in_entryRuleSootMethodRef8896);
            iv_ruleSootMethodRef=ruleSootMethodRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSootMethodRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSootMethodRef8906); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSootMethodRef"


    // $ANTLR start "ruleSootMethodRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4081:1: ruleSootMethodRef returns [EObject current=null] : (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= ruleMethodName ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleQualifiedName ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )* )? otherlv_9= ')' otherlv_10= '>' ) ;
    public final EObject ruleSootMethodRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_class_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_parameters_6_0 = null;

        AntlrDatatypeRuleToken lv_parameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4084:28: ( (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= ruleMethodName ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleQualifiedName ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )* )? otherlv_9= ')' otherlv_10= '>' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4085:1: (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= ruleMethodName ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleQualifiedName ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )* )? otherlv_9= ')' otherlv_10= '>' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4085:1: (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= ruleMethodName ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleQualifiedName ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )* )? otherlv_9= ')' otherlv_10= '>' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4085:3: otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= ruleMethodName ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleQualifiedName ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )* )? otherlv_9= ')' otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleSootMethodRef8943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSootMethodRefAccess().getLessThanSignKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4089:1: ( (lv_class_1_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4090:1: (lv_class_1_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4090:1: (lv_class_1_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4091:3: lv_class_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSootMethodRefAccess().getClassQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSootMethodRef8964);
            lv_class_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSootMethodRefRule());
              	        }
                     		set(
                     			current, 
                     			"class",
                      		lv_class_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSootMethodRef8976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSootMethodRefAccess().getColonKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4111:1: ( (lv_type_3_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4112:1: (lv_type_3_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4112:1: (lv_type_3_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4113:3: lv_type_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSootMethodRefAccess().getTypeQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSootMethodRef8997);
            lv_type_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSootMethodRefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4129:2: ( (lv_name_4_0= ruleMethodName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4130:1: (lv_name_4_0= ruleMethodName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4130:1: (lv_name_4_0= ruleMethodName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4131:3: lv_name_4_0= ruleMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSootMethodRefAccess().getNameMethodNameParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodName_in_ruleSootMethodRef9018);
            lv_name_4_0=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSootMethodRefRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"MethodName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleSootMethodRef9030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSootMethodRefAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4151:1: ( ( (lv_parameters_6_0= ruleQualifiedName ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4151:2: ( (lv_parameters_6_0= ruleQualifiedName ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )*
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4151:2: ( (lv_parameters_6_0= ruleQualifiedName ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4152:1: (lv_parameters_6_0= ruleQualifiedName )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4152:1: (lv_parameters_6_0= ruleQualifiedName )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4153:3: lv_parameters_6_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSootMethodRefAccess().getParametersQualifiedNameParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSootMethodRef9052);
                    lv_parameters_6_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSootMethodRefRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_6_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4169:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==20) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4169:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleSootMethodRef9065); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getSootMethodRefAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4173:1: ( (lv_parameters_8_0= ruleQualifiedName ) )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4174:1: (lv_parameters_8_0= ruleQualifiedName )
                    	    {
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4174:1: (lv_parameters_8_0= ruleQualifiedName )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4175:3: lv_parameters_8_0= ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSootMethodRefAccess().getParametersQualifiedNameParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSootMethodRef9086);
                    	    lv_parameters_8_0=ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSootMethodRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_8_0, 
                    	              		"QualifiedName");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleSootMethodRef9102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSootMethodRefAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_10=(Token)match(input,58,FOLLOW_58_in_ruleSootMethodRef9114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSootMethodRefAccess().getGreaterThanSignKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSootMethodRef"


    // $ANTLR start "entryRuleInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4207:1: entryRuleInvokeExpr returns [EObject current=null] : iv_ruleInvokeExpr= ruleInvokeExpr EOF ;
    public final EObject entryRuleInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4208:2: (iv_ruleInvokeExpr= ruleInvokeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4209:2: iv_ruleInvokeExpr= ruleInvokeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvokeExprRule()); 
            }
            pushFollow(FOLLOW_ruleInvokeExpr_in_entryRuleInvokeExpr9150);
            iv_ruleInvokeExpr=ruleInvokeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvokeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokeExpr9160); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvokeExpr"


    // $ANTLR start "ruleInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4216:1: ruleInvokeExpr returns [EObject current=null] : (this_InstanceInvokeExpr_0= ruleInstanceInvokeExpr | this_StaticInvokeExpr_1= ruleStaticInvokeExpr ) ;
    public final EObject ruleInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject this_InstanceInvokeExpr_0 = null;

        EObject this_StaticInvokeExpr_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4219:28: ( (this_InstanceInvokeExpr_0= ruleInstanceInvokeExpr | this_StaticInvokeExpr_1= ruleStaticInvokeExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4220:1: (this_InstanceInvokeExpr_0= ruleInstanceInvokeExpr | this_StaticInvokeExpr_1= ruleStaticInvokeExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4220:1: (this_InstanceInvokeExpr_0= ruleInstanceInvokeExpr | this_StaticInvokeExpr_1= ruleStaticInvokeExpr )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==64||(LA32_0>=66 && LA32_0<=67)) ) {
                alt32=1;
            }
            else if ( (LA32_0==63) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4221:2: this_InstanceInvokeExpr_0= ruleInstanceInvokeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInvokeExprAccess().getInstanceInvokeExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceInvokeExpr_in_ruleInvokeExpr9210);
                    this_InstanceInvokeExpr_0=ruleInstanceInvokeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstanceInvokeExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4234:2: this_StaticInvokeExpr_1= ruleStaticInvokeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInvokeExprAccess().getStaticInvokeExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticInvokeExpr_in_ruleInvokeExpr9240);
                    this_StaticInvokeExpr_1=ruleStaticInvokeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StaticInvokeExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvokeExpr"


    // $ANTLR start "entryRuleInstanceInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4253:1: entryRuleInstanceInvokeExpr returns [EObject current=null] : iv_ruleInstanceInvokeExpr= ruleInstanceInvokeExpr EOF ;
    public final EObject entryRuleInstanceInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceInvokeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4254:2: (iv_ruleInstanceInvokeExpr= ruleInstanceInvokeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4255:2: iv_ruleInstanceInvokeExpr= ruleInstanceInvokeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceInvokeExprRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceInvokeExpr_in_entryRuleInstanceInvokeExpr9275);
            iv_ruleInstanceInvokeExpr=ruleInstanceInvokeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceInvokeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceInvokeExpr9285); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceInvokeExpr"


    // $ANTLR start "ruleInstanceInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4262:1: ruleInstanceInvokeExpr returns [EObject current=null] : (this_InterfaceInvokeExpr_0= ruleInterfaceInvokeExpr | this_SpecialInvokeExpr_1= ruleSpecialInvokeExpr | this_VirtualInvokeExpr_2= ruleVirtualInvokeExpr ) ;
    public final EObject ruleInstanceInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceInvokeExpr_0 = null;

        EObject this_SpecialInvokeExpr_1 = null;

        EObject this_VirtualInvokeExpr_2 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4265:28: ( (this_InterfaceInvokeExpr_0= ruleInterfaceInvokeExpr | this_SpecialInvokeExpr_1= ruleSpecialInvokeExpr | this_VirtualInvokeExpr_2= ruleVirtualInvokeExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4266:1: (this_InterfaceInvokeExpr_0= ruleInterfaceInvokeExpr | this_SpecialInvokeExpr_1= ruleSpecialInvokeExpr | this_VirtualInvokeExpr_2= ruleVirtualInvokeExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4266:1: (this_InterfaceInvokeExpr_0= ruleInterfaceInvokeExpr | this_SpecialInvokeExpr_1= ruleSpecialInvokeExpr | this_VirtualInvokeExpr_2= ruleVirtualInvokeExpr )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt33=1;
                }
                break;
            case 66:
                {
                alt33=2;
                }
                break;
            case 67:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4267:2: this_InterfaceInvokeExpr_0= ruleInterfaceInvokeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstanceInvokeExprAccess().getInterfaceInvokeExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceInvokeExpr_in_ruleInstanceInvokeExpr9335);
                    this_InterfaceInvokeExpr_0=ruleInterfaceInvokeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceInvokeExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4280:2: this_SpecialInvokeExpr_1= ruleSpecialInvokeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstanceInvokeExprAccess().getSpecialInvokeExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSpecialInvokeExpr_in_ruleInstanceInvokeExpr9365);
                    this_SpecialInvokeExpr_1=ruleSpecialInvokeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SpecialInvokeExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4293:2: this_VirtualInvokeExpr_2= ruleVirtualInvokeExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstanceInvokeExprAccess().getVirtualInvokeExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVirtualInvokeExpr_in_ruleInstanceInvokeExpr9395);
                    this_VirtualInvokeExpr_2=ruleVirtualInvokeExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VirtualInvokeExpr_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceInvokeExpr"


    // $ANTLR start "entryRuleStaticInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4312:1: entryRuleStaticInvokeExpr returns [EObject current=null] : iv_ruleStaticInvokeExpr= ruleStaticInvokeExpr EOF ;
    public final EObject entryRuleStaticInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticInvokeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4313:2: (iv_ruleStaticInvokeExpr= ruleStaticInvokeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4314:2: iv_ruleStaticInvokeExpr= ruleStaticInvokeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticInvokeExprRule()); 
            }
            pushFollow(FOLLOW_ruleStaticInvokeExpr_in_entryRuleStaticInvokeExpr9430);
            iv_ruleStaticInvokeExpr=ruleStaticInvokeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticInvokeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticInvokeExpr9440); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticInvokeExpr"


    // $ANTLR start "ruleStaticInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4321:1: ruleStaticInvokeExpr returns [EObject current=null] : ( () otherlv_1= 'staticinvoke' ( (lv_method_2_0= ruleSootMethodRef ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleNonExpr ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleStaticInvokeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_method_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4324:28: ( ( () otherlv_1= 'staticinvoke' ( (lv_method_2_0= ruleSootMethodRef ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleNonExpr ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )* )? otherlv_7= ')' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4325:1: ( () otherlv_1= 'staticinvoke' ( (lv_method_2_0= ruleSootMethodRef ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleNonExpr ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )* )? otherlv_7= ')' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4325:1: ( () otherlv_1= 'staticinvoke' ( (lv_method_2_0= ruleSootMethodRef ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleNonExpr ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )* )? otherlv_7= ')' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4325:2: () otherlv_1= 'staticinvoke' ( (lv_method_2_0= ruleSootMethodRef ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleNonExpr ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )* )? otherlv_7= ')'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4325:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4326:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStaticInvokeExprAccess().getStaticInvokeExprAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleStaticInvokeExpr9489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStaticInvokeExprAccess().getStaticinvokeKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4338:1: ( (lv_method_2_0= ruleSootMethodRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4339:1: (lv_method_2_0= ruleSootMethodRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4339:1: (lv_method_2_0= ruleSootMethodRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4340:3: lv_method_2_0= ruleSootMethodRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticInvokeExprAccess().getMethodSootMethodRefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSootMethodRef_in_ruleStaticInvokeExpr9510);
            lv_method_2_0=ruleSootMethodRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStaticInvokeExprRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_2_0, 
                      		"SootMethodRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleStaticInvokeExpr9522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStaticInvokeExprAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4360:1: ( ( (lv_parameters_4_0= ruleNonExpr ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||(LA35_0>=RULE_INT && LA35_0<=RULE_STRING)||LA35_0==16||LA35_0==60||LA35_0==68||LA35_0==78||LA35_0==81) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4360:2: ( (lv_parameters_4_0= ruleNonExpr ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )*
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4360:2: ( (lv_parameters_4_0= ruleNonExpr ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4361:1: (lv_parameters_4_0= ruleNonExpr )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4361:1: (lv_parameters_4_0= ruleNonExpr )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4362:3: lv_parameters_4_0= ruleNonExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticInvokeExprAccess().getParametersNonExprParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNonExpr_in_ruleStaticInvokeExpr9544);
                    lv_parameters_4_0=ruleNonExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticInvokeExprRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"NonExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4378:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==20) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4378:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleNonExpr ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleStaticInvokeExpr9557); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getStaticInvokeExprAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4382:1: ( (lv_parameters_6_0= ruleNonExpr ) )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4383:1: (lv_parameters_6_0= ruleNonExpr )
                    	    {
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4383:1: (lv_parameters_6_0= ruleNonExpr )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4384:3: lv_parameters_6_0= ruleNonExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStaticInvokeExprAccess().getParametersNonExprParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNonExpr_in_ruleStaticInvokeExpr9578);
                    	    lv_parameters_6_0=ruleNonExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStaticInvokeExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"NonExpr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleStaticInvokeExpr9594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getStaticInvokeExprAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticInvokeExpr"


    // $ANTLR start "entryRuleInterfaceInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4412:1: entryRuleInterfaceInvokeExpr returns [EObject current=null] : iv_ruleInterfaceInvokeExpr= ruleInterfaceInvokeExpr EOF ;
    public final EObject entryRuleInterfaceInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceInvokeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4413:2: (iv_ruleInterfaceInvokeExpr= ruleInterfaceInvokeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4414:2: iv_ruleInterfaceInvokeExpr= ruleInterfaceInvokeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceInvokeExprRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceInvokeExpr_in_entryRuleInterfaceInvokeExpr9630);
            iv_ruleInterfaceInvokeExpr=ruleInterfaceInvokeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceInvokeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceInvokeExpr9640); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceInvokeExpr"


    // $ANTLR start "ruleInterfaceInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4421:1: ruleInterfaceInvokeExpr returns [EObject current=null] : (otherlv_0= 'interfaceinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleInterfaceInvokeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_base_1_0 = null;

        EObject lv_method_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4424:28: ( (otherlv_0= 'interfaceinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4425:1: (otherlv_0= 'interfaceinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4425:1: (otherlv_0= 'interfaceinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4425:3: otherlv_0= 'interfaceinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleInterfaceInvokeExpr9677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInterfaceInvokeExprAccess().getInterfaceinvokeKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4429:1: ( (lv_base_1_0= ruleLocalOrWildcard ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4430:1: (lv_base_1_0= ruleLocalOrWildcard )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4430:1: (lv_base_1_0= ruleLocalOrWildcard )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4431:3: lv_base_1_0= ruleLocalOrWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceInvokeExprAccess().getBaseLocalOrWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalOrWildcard_in_ruleInterfaceInvokeExpr9698);
            lv_base_1_0=ruleLocalOrWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInterfaceInvokeExprRule());
              	        }
                     		set(
                     			current, 
                     			"base",
                      		lv_base_1_0, 
                      		"LocalOrWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleInterfaceInvokeExpr9710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInterfaceInvokeExprAccess().getFullStopKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4451:1: ( (lv_method_3_0= ruleSootMethodRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4452:1: (lv_method_3_0= ruleSootMethodRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4452:1: (lv_method_3_0= ruleSootMethodRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4453:3: lv_method_3_0= ruleSootMethodRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceInvokeExprAccess().getMethodSootMethodRefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSootMethodRef_in_ruleInterfaceInvokeExpr9731);
            lv_method_3_0=ruleSootMethodRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInterfaceInvokeExprRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_3_0, 
                      		"SootMethodRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleInterfaceInvokeExpr9743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInterfaceInvokeExprAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4473:1: ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=RULE_INT && LA37_0<=RULE_STRING)||LA37_0==16||LA37_0==60||LA37_0==68||LA37_0==78||LA37_0==81) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4473:2: ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )*
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4473:2: ( (lv_parameters_5_0= ruleNonExpr ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4474:1: (lv_parameters_5_0= ruleNonExpr )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4474:1: (lv_parameters_5_0= ruleNonExpr )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4475:3: lv_parameters_5_0= ruleNonExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceInvokeExprAccess().getParametersNonExprParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNonExpr_in_ruleInterfaceInvokeExpr9765);
                    lv_parameters_5_0=ruleNonExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceInvokeExprRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_5_0, 
                              		"NonExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4491:2: (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4491:4: otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleInterfaceInvokeExpr9778); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getInterfaceInvokeExprAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4495:1: ( (lv_parameters_7_0= ruleNonExpr ) )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4496:1: (lv_parameters_7_0= ruleNonExpr )
                    	    {
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4496:1: (lv_parameters_7_0= ruleNonExpr )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4497:3: lv_parameters_7_0= ruleNonExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterfaceInvokeExprAccess().getParametersNonExprParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNonExpr_in_ruleInterfaceInvokeExpr9799);
                    	    lv_parameters_7_0=ruleNonExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInterfaceInvokeExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_7_0, 
                    	              		"NonExpr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleInterfaceInvokeExpr9815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInterfaceInvokeExprAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceInvokeExpr"


    // $ANTLR start "entryRuleSpecialInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4525:1: entryRuleSpecialInvokeExpr returns [EObject current=null] : iv_ruleSpecialInvokeExpr= ruleSpecialInvokeExpr EOF ;
    public final EObject entryRuleSpecialInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialInvokeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4526:2: (iv_ruleSpecialInvokeExpr= ruleSpecialInvokeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4527:2: iv_ruleSpecialInvokeExpr= ruleSpecialInvokeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialInvokeExprRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialInvokeExpr_in_entryRuleSpecialInvokeExpr9851);
            iv_ruleSpecialInvokeExpr=ruleSpecialInvokeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialInvokeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialInvokeExpr9861); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialInvokeExpr"


    // $ANTLR start "ruleSpecialInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4534:1: ruleSpecialInvokeExpr returns [EObject current=null] : (otherlv_0= 'specialinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleSpecialInvokeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_base_1_0 = null;

        EObject lv_method_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4537:28: ( (otherlv_0= 'specialinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4538:1: (otherlv_0= 'specialinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4538:1: (otherlv_0= 'specialinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4538:3: otherlv_0= 'specialinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleSpecialInvokeExpr9898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSpecialInvokeExprAccess().getSpecialinvokeKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4542:1: ( (lv_base_1_0= ruleLocalOrWildcard ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4543:1: (lv_base_1_0= ruleLocalOrWildcard )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4543:1: (lv_base_1_0= ruleLocalOrWildcard )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4544:3: lv_base_1_0= ruleLocalOrWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSpecialInvokeExprAccess().getBaseLocalOrWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalOrWildcard_in_ruleSpecialInvokeExpr9919);
            lv_base_1_0=ruleLocalOrWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSpecialInvokeExprRule());
              	        }
                     		set(
                     			current, 
                     			"base",
                      		lv_base_1_0, 
                      		"LocalOrWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleSpecialInvokeExpr9931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSpecialInvokeExprAccess().getFullStopKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4564:1: ( (lv_method_3_0= ruleSootMethodRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4565:1: (lv_method_3_0= ruleSootMethodRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4565:1: (lv_method_3_0= ruleSootMethodRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4566:3: lv_method_3_0= ruleSootMethodRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSpecialInvokeExprAccess().getMethodSootMethodRefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSootMethodRef_in_ruleSpecialInvokeExpr9952);
            lv_method_3_0=ruleSootMethodRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSpecialInvokeExprRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_3_0, 
                      		"SootMethodRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleSpecialInvokeExpr9964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSpecialInvokeExprAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4586:1: ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||(LA39_0>=RULE_INT && LA39_0<=RULE_STRING)||LA39_0==16||LA39_0==60||LA39_0==68||LA39_0==78||LA39_0==81) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4586:2: ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )*
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4586:2: ( (lv_parameters_5_0= ruleNonExpr ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4587:1: (lv_parameters_5_0= ruleNonExpr )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4587:1: (lv_parameters_5_0= ruleNonExpr )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4588:3: lv_parameters_5_0= ruleNonExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSpecialInvokeExprAccess().getParametersNonExprParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNonExpr_in_ruleSpecialInvokeExpr9986);
                    lv_parameters_5_0=ruleNonExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSpecialInvokeExprRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_5_0, 
                              		"NonExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4604:2: (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4604:4: otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleSpecialInvokeExpr9999); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getSpecialInvokeExprAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4608:1: ( (lv_parameters_7_0= ruleNonExpr ) )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4609:1: (lv_parameters_7_0= ruleNonExpr )
                    	    {
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4609:1: (lv_parameters_7_0= ruleNonExpr )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4610:3: lv_parameters_7_0= ruleNonExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSpecialInvokeExprAccess().getParametersNonExprParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNonExpr_in_ruleSpecialInvokeExpr10020);
                    	    lv_parameters_7_0=ruleNonExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSpecialInvokeExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_7_0, 
                    	              		"NonExpr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleSpecialInvokeExpr10036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSpecialInvokeExprAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialInvokeExpr"


    // $ANTLR start "entryRuleVirtualInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4638:1: entryRuleVirtualInvokeExpr returns [EObject current=null] : iv_ruleVirtualInvokeExpr= ruleVirtualInvokeExpr EOF ;
    public final EObject entryRuleVirtualInvokeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualInvokeExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4639:2: (iv_ruleVirtualInvokeExpr= ruleVirtualInvokeExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4640:2: iv_ruleVirtualInvokeExpr= ruleVirtualInvokeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualInvokeExprRule()); 
            }
            pushFollow(FOLLOW_ruleVirtualInvokeExpr_in_entryRuleVirtualInvokeExpr10072);
            iv_ruleVirtualInvokeExpr=ruleVirtualInvokeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualInvokeExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualInvokeExpr10082); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVirtualInvokeExpr"


    // $ANTLR start "ruleVirtualInvokeExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4647:1: ruleVirtualInvokeExpr returns [EObject current=null] : (otherlv_0= 'virtualinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleVirtualInvokeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_base_1_0 = null;

        EObject lv_method_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4650:28: ( (otherlv_0= 'virtualinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4651:1: (otherlv_0= 'virtualinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4651:1: (otherlv_0= 'virtualinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4651:3: otherlv_0= 'virtualinvoke' ( (lv_base_1_0= ruleLocalOrWildcard ) ) otherlv_2= '.' ( (lv_method_3_0= ruleSootMethodRef ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleVirtualInvokeExpr10119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVirtualInvokeExprAccess().getVirtualinvokeKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4655:1: ( (lv_base_1_0= ruleLocalOrWildcard ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4656:1: (lv_base_1_0= ruleLocalOrWildcard )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4656:1: (lv_base_1_0= ruleLocalOrWildcard )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4657:3: lv_base_1_0= ruleLocalOrWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVirtualInvokeExprAccess().getBaseLocalOrWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalOrWildcard_in_ruleVirtualInvokeExpr10140);
            lv_base_1_0=ruleLocalOrWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVirtualInvokeExprRule());
              	        }
                     		set(
                     			current, 
                     			"base",
                      		lv_base_1_0, 
                      		"LocalOrWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleVirtualInvokeExpr10152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVirtualInvokeExprAccess().getFullStopKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4677:1: ( (lv_method_3_0= ruleSootMethodRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4678:1: (lv_method_3_0= ruleSootMethodRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4678:1: (lv_method_3_0= ruleSootMethodRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4679:3: lv_method_3_0= ruleSootMethodRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVirtualInvokeExprAccess().getMethodSootMethodRefParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSootMethodRef_in_ruleVirtualInvokeExpr10173);
            lv_method_3_0=ruleSootMethodRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVirtualInvokeExprRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_3_0, 
                      		"SootMethodRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleVirtualInvokeExpr10185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVirtualInvokeExprAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4699:1: ( ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||(LA41_0>=RULE_INT && LA41_0<=RULE_STRING)||LA41_0==16||LA41_0==60||LA41_0==68||LA41_0==78||LA41_0==81) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4699:2: ( (lv_parameters_5_0= ruleNonExpr ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )*
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4699:2: ( (lv_parameters_5_0= ruleNonExpr ) )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4700:1: (lv_parameters_5_0= ruleNonExpr )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4700:1: (lv_parameters_5_0= ruleNonExpr )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4701:3: lv_parameters_5_0= ruleNonExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVirtualInvokeExprAccess().getParametersNonExprParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNonExpr_in_ruleVirtualInvokeExpr10207);
                    lv_parameters_5_0=ruleNonExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVirtualInvokeExprRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_5_0, 
                              		"NonExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4717:2: (otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4717:4: otherlv_6= ',' ( (lv_parameters_7_0= ruleNonExpr ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVirtualInvokeExpr10220); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getVirtualInvokeExprAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4721:1: ( (lv_parameters_7_0= ruleNonExpr ) )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4722:1: (lv_parameters_7_0= ruleNonExpr )
                    	    {
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4722:1: (lv_parameters_7_0= ruleNonExpr )
                    	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4723:3: lv_parameters_7_0= ruleNonExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVirtualInvokeExprAccess().getParametersNonExprParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNonExpr_in_ruleVirtualInvokeExpr10241);
                    	    lv_parameters_7_0=ruleNonExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getVirtualInvokeExprRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_7_0, 
                    	              		"NonExpr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleVirtualInvokeExpr10257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getVirtualInvokeExprAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVirtualInvokeExpr"


    // $ANTLR start "entryRuleLocalOrWildcard"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4751:1: entryRuleLocalOrWildcard returns [EObject current=null] : iv_ruleLocalOrWildcard= ruleLocalOrWildcard EOF ;
    public final EObject entryRuleLocalOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalOrWildcard = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4752:2: (iv_ruleLocalOrWildcard= ruleLocalOrWildcard EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4753:2: iv_ruleLocalOrWildcard= ruleLocalOrWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalOrWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleLocalOrWildcard_in_entryRuleLocalOrWildcard10293);
            iv_ruleLocalOrWildcard=ruleLocalOrWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalOrWildcard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalOrWildcard10303); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalOrWildcard"


    // $ANTLR start "ruleLocalOrWildcard"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4760:1: ruleLocalOrWildcard returns [EObject current=null] : (this_Local_0= ruleLocal | this_Wildcard_1= ruleWildcard ) ;
    public final EObject ruleLocalOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject this_Local_0 = null;

        EObject this_Wildcard_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4763:28: ( (this_Local_0= ruleLocal | this_Wildcard_1= ruleWildcard ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4764:1: (this_Local_0= ruleLocal | this_Wildcard_1= ruleWildcard )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4764:1: (this_Local_0= ruleLocal | this_Wildcard_1= ruleWildcard )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==68) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4765:2: this_Local_0= ruleLocal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalOrWildcardAccess().getLocalParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocal_in_ruleLocalOrWildcard10353);
                    this_Local_0=ruleLocal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Local_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4778:2: this_Wildcard_1= ruleWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalOrWildcardAccess().getWildcardParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWildcard_in_ruleLocalOrWildcard10383);
                    this_Wildcard_1=ruleWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Wildcard_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalOrWildcard"


    // $ANTLR start "entryRuleWildcard"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4797:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4798:2: (iv_ruleWildcard= ruleWildcard EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4799:2: iv_ruleWildcard= ruleWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard10418);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard10428); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4806:1: ruleWildcard returns [EObject current=null] : (otherlv_0= '\\u00AB' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\u00BB' ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4809:28: ( (otherlv_0= '\\u00AB' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\u00BB' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4810:1: (otherlv_0= '\\u00AB' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\u00BB' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4810:1: (otherlv_0= '\\u00AB' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\u00BB' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4810:3: otherlv_0= '\\u00AB' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\u00BB'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleWildcard10465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWildcardAccess().getLeftPointingDoubleAngleQuotationMarkKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4814:1: ( (lv_name_1_0= RULE_ID ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4815:1: (lv_name_1_0= RULE_ID )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4815:1: (lv_name_1_0= RULE_ID )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4816:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWildcard10482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getWildcardAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWildcardRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleWildcard10499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWildcardAccess().getRightPointingDoubleAngleQuotationMarkKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleNewArrayExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4844:1: entryRuleNewArrayExpr returns [EObject current=null] : iv_ruleNewArrayExpr= ruleNewArrayExpr EOF ;
    public final EObject entryRuleNewArrayExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewArrayExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4845:2: (iv_ruleNewArrayExpr= ruleNewArrayExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4846:2: iv_ruleNewArrayExpr= ruleNewArrayExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewArrayExprRule()); 
            }
            pushFollow(FOLLOW_ruleNewArrayExpr_in_entryRuleNewArrayExpr10535);
            iv_ruleNewArrayExpr=ruleNewArrayExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewArrayExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewArrayExpr10545); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewArrayExpr"


    // $ANTLR start "ruleNewArrayExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4853:1: ruleNewArrayExpr returns [EObject current=null] : (otherlv_0= 'newarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) ) ) ;
    public final EObject ruleNewArrayExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_size_4_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4856:28: ( (otherlv_0= 'newarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4857:1: (otherlv_0= 'newarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4857:1: (otherlv_0= 'newarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4857:3: otherlv_0= 'newarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleNewArrayExpr10582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewArrayExprAccess().getNewarrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleNewArrayExpr10594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewArrayExprAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4865:1: ( (lv_type_2_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4866:1: (lv_type_2_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4866:1: (lv_type_2_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4867:3: lv_type_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewArrayExprAccess().getTypeQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewArrayExpr10615);
            lv_type_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNewArrayExprRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleNewArrayExpr10627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNewArrayExprAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4887:1: ( (lv_size_4_0= ruleDimension ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4888:1: (lv_size_4_0= ruleDimension )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4888:1: (lv_size_4_0= ruleDimension )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4889:3: lv_size_4_0= ruleDimension
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewArrayExprAccess().getSizeDimensionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDimension_in_ruleNewArrayExpr10648);
            lv_size_4_0=ruleDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNewArrayExprRule());
              	        }
                     		set(
                     			current, 
                     			"size",
                      		lv_size_4_0, 
                      		"Dimension");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewArrayExpr"


    // $ANTLR start "entryRuleNewExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4913:1: entryRuleNewExpr returns [EObject current=null] : iv_ruleNewExpr= ruleNewExpr EOF ;
    public final EObject entryRuleNewExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4914:2: (iv_ruleNewExpr= ruleNewExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4915:2: iv_ruleNewExpr= ruleNewExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewExprRule()); 
            }
            pushFollow(FOLLOW_ruleNewExpr_in_entryRuleNewExpr10684);
            iv_ruleNewExpr=ruleNewExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewExpr10694); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewExpr"


    // $ANTLR start "ruleNewExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4922:1: ruleNewExpr returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleNewExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4925:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleQualifiedName ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4926:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleQualifiedName ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4926:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleQualifiedName ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4926:3: otherlv_0= 'new' ( (lv_type_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleNewExpr10731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewExprAccess().getNewKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4930:1: ( (lv_type_1_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4931:1: (lv_type_1_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4931:1: (lv_type_1_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4932:3: lv_type_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewExprAccess().getTypeQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewExpr10752);
            lv_type_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNewExprRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewExpr"


    // $ANTLR start "entryRuleNewMultiArrayExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4956:1: entryRuleNewMultiArrayExpr returns [EObject current=null] : iv_ruleNewMultiArrayExpr= ruleNewMultiArrayExpr EOF ;
    public final EObject entryRuleNewMultiArrayExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewMultiArrayExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4957:2: (iv_ruleNewMultiArrayExpr= ruleNewMultiArrayExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4958:2: iv_ruleNewMultiArrayExpr= ruleNewMultiArrayExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewMultiArrayExprRule()); 
            }
            pushFollow(FOLLOW_ruleNewMultiArrayExpr_in_entryRuleNewMultiArrayExpr10788);
            iv_ruleNewMultiArrayExpr=ruleNewMultiArrayExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewMultiArrayExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMultiArrayExpr10798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewMultiArrayExpr"


    // $ANTLR start "ruleNewMultiArrayExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4965:1: ruleNewMultiArrayExpr returns [EObject current=null] : (otherlv_0= 'newmultiarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) )* ( (lv_emptySize_5_0= '[]' ) )* ) ;
    public final EObject ruleNewMultiArrayExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_emptySize_5_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_size_4_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4968:28: ( (otherlv_0= 'newmultiarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) )* ( (lv_emptySize_5_0= '[]' ) )* ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4969:1: (otherlv_0= 'newmultiarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) )* ( (lv_emptySize_5_0= '[]' ) )* )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4969:1: (otherlv_0= 'newmultiarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) )* ( (lv_emptySize_5_0= '[]' ) )* )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4969:3: otherlv_0= 'newmultiarray' otherlv_1= '(' ( (lv_type_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_size_4_0= ruleDimension ) )* ( (lv_emptySize_5_0= '[]' ) )*
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleNewMultiArrayExpr10835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewMultiArrayExprAccess().getNewmultiarrayKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleNewMultiArrayExpr10847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNewMultiArrayExprAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4977:1: ( (lv_type_2_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4978:1: (lv_type_2_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4978:1: (lv_type_2_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4979:3: lv_type_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewMultiArrayExprAccess().getTypeQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewMultiArrayExpr10868);
            lv_type_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNewMultiArrayExprRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleNewMultiArrayExpr10880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNewMultiArrayExprAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:4999:1: ( (lv_size_4_0= ruleDimension ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==74) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5000:1: (lv_size_4_0= ruleDimension )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5000:1: (lv_size_4_0= ruleDimension )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5001:3: lv_size_4_0= ruleDimension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNewMultiArrayExprAccess().getSizeDimensionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDimension_in_ruleNewMultiArrayExpr10901);
            	    lv_size_4_0=ruleDimension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNewMultiArrayExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"size",
            	              		lv_size_4_0, 
            	              		"Dimension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5017:3: ( (lv_emptySize_5_0= '[]' ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==73) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5018:1: (lv_emptySize_5_0= '[]' )
            	    {
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5018:1: (lv_emptySize_5_0= '[]' )
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5019:3: lv_emptySize_5_0= '[]'
            	    {
            	    lv_emptySize_5_0=(Token)match(input,73,FOLLOW_73_in_ruleNewMultiArrayExpr10920); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_emptySize_5_0, grammarAccess.getNewMultiArrayExprAccess().getEmptySizeLeftSquareBracketRightSquareBracketKeyword_5_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNewMultiArrayExprRule());
            	      	        }
            	             		addWithLastConsumed(current, "emptySize", lv_emptySize_5_0, "[]");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewMultiArrayExpr"


    // $ANTLR start "entryRuleDimension"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5040:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5041:2: (iv_ruleDimension= ruleDimension EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5042:2: iv_ruleDimension= ruleDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDimensionRule()); 
            }
            pushFollow(FOLLOW_ruleDimension_in_entryRuleDimension10970);
            iv_ruleDimension=ruleDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDimension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimension10980); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5049:1: ruleDimension returns [EObject current=null] : (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5052:28: ( (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5053:1: (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5053:1: (otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5053:3: otherlv_0= '[' ( (lv_size_1_0= RULE_INT ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleDimension11017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5057:1: ( (lv_size_1_0= RULE_INT ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5058:1: (lv_size_1_0= RULE_INT )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5058:1: (lv_size_1_0= RULE_INT )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5059:3: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDimension11034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_size_1_0, grammarAccess.getDimensionAccess().getSizeINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDimensionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"size",
                      		lv_size_1_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,75,FOLLOW_75_in_ruleDimension11051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDimensionAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleUnopExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5087:1: entryRuleUnopExpr returns [EObject current=null] : iv_ruleUnopExpr= ruleUnopExpr EOF ;
    public final EObject entryRuleUnopExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnopExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5088:2: (iv_ruleUnopExpr= ruleUnopExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5089:2: iv_ruleUnopExpr= ruleUnopExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnopExprRule()); 
            }
            pushFollow(FOLLOW_ruleUnopExpr_in_entryRuleUnopExpr11087);
            iv_ruleUnopExpr=ruleUnopExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnopExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnopExpr11097); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnopExpr"


    // $ANTLR start "ruleUnopExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5096:1: ruleUnopExpr returns [EObject current=null] : (this_LengthExpr_0= ruleLengthExpr | this_NegExpr_1= ruleNegExpr ) ;
    public final EObject ruleUnopExpr() throws RecognitionException {
        EObject current = null;

        EObject this_LengthExpr_0 = null;

        EObject this_NegExpr_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5099:28: ( (this_LengthExpr_0= ruleLengthExpr | this_NegExpr_1= ruleNegExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5100:1: (this_LengthExpr_0= ruleLengthExpr | this_NegExpr_1= ruleNegExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5100:1: (this_LengthExpr_0= ruleLengthExpr | this_NegExpr_1= ruleNegExpr )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==76) ) {
                alt45=1;
            }
            else if ( (LA45_0==77) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5101:2: this_LengthExpr_0= ruleLengthExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnopExprAccess().getLengthExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLengthExpr_in_ruleUnopExpr11147);
                    this_LengthExpr_0=ruleLengthExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LengthExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5114:2: this_NegExpr_1= ruleNegExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnopExprAccess().getNegExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegExpr_in_ruleUnopExpr11177);
                    this_NegExpr_1=ruleNegExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NegExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnopExpr"


    // $ANTLR start "entryRuleLengthExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5133:1: entryRuleLengthExpr returns [EObject current=null] : iv_ruleLengthExpr= ruleLengthExpr EOF ;
    public final EObject entryRuleLengthExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLengthExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5134:2: (iv_ruleLengthExpr= ruleLengthExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5135:2: iv_ruleLengthExpr= ruleLengthExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLengthExprRule()); 
            }
            pushFollow(FOLLOW_ruleLengthExpr_in_entryRuleLengthExpr11212);
            iv_ruleLengthExpr=ruleLengthExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLengthExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthExpr11222); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLengthExpr"


    // $ANTLR start "ruleLengthExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5142:1: ruleLengthExpr returns [EObject current=null] : (otherlv_0= 'lengthof' ( (lv_operand_1_0= ruleValue ) ) ) ;
    public final EObject ruleLengthExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5145:28: ( (otherlv_0= 'lengthof' ( (lv_operand_1_0= ruleValue ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5146:1: (otherlv_0= 'lengthof' ( (lv_operand_1_0= ruleValue ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5146:1: (otherlv_0= 'lengthof' ( (lv_operand_1_0= ruleValue ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5146:3: otherlv_0= 'lengthof' ( (lv_operand_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleLengthExpr11259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLengthExprAccess().getLengthofKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5150:1: ( (lv_operand_1_0= ruleValue ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5151:1: (lv_operand_1_0= ruleValue )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5151:1: (lv_operand_1_0= ruleValue )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5152:3: lv_operand_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLengthExprAccess().getOperandValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleLengthExpr11280);
            lv_operand_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLengthExprRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_1_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLengthExpr"


    // $ANTLR start "entryRuleNegExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5176:1: entryRuleNegExpr returns [EObject current=null] : iv_ruleNegExpr= ruleNegExpr EOF ;
    public final EObject entryRuleNegExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpr = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5177:2: (iv_ruleNegExpr= ruleNegExpr EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5178:2: iv_ruleNegExpr= ruleNegExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExprRule()); 
            }
            pushFollow(FOLLOW_ruleNegExpr_in_entryRuleNegExpr11316);
            iv_ruleNegExpr=ruleNegExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpr11326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpr"


    // $ANTLR start "ruleNegExpr"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5185:1: ruleNegExpr returns [EObject current=null] : (otherlv_0= 'neg' ( (lv_operand_1_0= ruleValue ) ) ) ;
    public final EObject ruleNegExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operand_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5188:28: ( (otherlv_0= 'neg' ( (lv_operand_1_0= ruleValue ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5189:1: (otherlv_0= 'neg' ( (lv_operand_1_0= ruleValue ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5189:1: (otherlv_0= 'neg' ( (lv_operand_1_0= ruleValue ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5189:3: otherlv_0= 'neg' ( (lv_operand_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleNegExpr11363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNegExprAccess().getNegKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5193:1: ( (lv_operand_1_0= ruleValue ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5194:1: (lv_operand_1_0= ruleValue )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5194:1: (lv_operand_1_0= ruleValue )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5195:3: lv_operand_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegExprAccess().getOperandValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNegExpr11384);
            lv_operand_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegExprRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_1_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegExpr"


    // $ANTLR start "entryRuleLocal"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5219:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5220:2: (iv_ruleLocal= ruleLocal EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5221:2: iv_ruleLocal= ruleLocal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalRule()); 
            }
            pushFollow(FOLLOW_ruleLocal_in_entryRuleLocal11420);
            iv_ruleLocal=ruleLocal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocal11430); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocal"


    // $ANTLR start "ruleLocal"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5228:1: ruleLocal returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5231:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5232:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5232:1: ( (lv_name_0_0= RULE_ID ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5233:1: (lv_name_0_0= RULE_ID )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5233:1: (lv_name_0_0= RULE_ID )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5234:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocal11471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getLocalAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocal"


    // $ANTLR start "entryRuleRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5258:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5259:2: (iv_ruleRef= ruleRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5260:2: iv_ruleRef= ruleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefRule()); 
            }
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef11511);
            iv_ruleRef=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef11521); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5267:1: ruleRef returns [EObject current=null] : (this_ConcreteRef_0= ruleConcreteRef | this_IdentityRef_1= ruleIdentityRef | this_LocalOrWildcard_2= ruleLocalOrWildcard ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteRef_0 = null;

        EObject this_IdentityRef_1 = null;

        EObject this_LocalOrWildcard_2 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5270:28: ( (this_ConcreteRef_0= ruleConcreteRef | this_IdentityRef_1= ruleIdentityRef | this_LocalOrWildcard_2= ruleLocalOrWildcard ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5271:1: (this_ConcreteRef_0= ruleConcreteRef | this_IdentityRef_1= ruleIdentityRef | this_LocalOrWildcard_2= ruleLocalOrWildcard )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5271:1: (this_ConcreteRef_0= ruleConcreteRef | this_IdentityRef_1= ruleIdentityRef | this_LocalOrWildcard_2= ruleLocalOrWildcard )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==65||LA46_1==74) ) {
                    alt46=1;
                }
                else if ( (LA46_1==EOF||LA46_1==20||LA46_1==24||LA46_1==26||LA46_1==29||LA46_1==31||(LA46_1>=42 && LA46_1<=62)||LA46_1==75) ) {
                    alt46=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==RULE_ID) ) {
                    int LA46_6 = input.LA(3);

                    if ( (LA46_6==69) ) {
                        int LA46_7 = input.LA(4);

                        if ( (LA46_7==65||LA46_7==74) ) {
                            alt46=1;
                        }
                        else if ( (LA46_7==EOF||LA46_7==20||LA46_7==24||LA46_7==26||LA46_7==29||LA46_7==31||(LA46_7>=42 && LA46_7<=62)||LA46_7==75) ) {
                            alt46=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 46, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                alt46=1;
                }
                break;
            case 78:
                {
                alt46=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5272:2: this_ConcreteRef_0= ruleConcreteRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRefAccess().getConcreteRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConcreteRef_in_ruleRef11571);
                    this_ConcreteRef_0=ruleConcreteRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConcreteRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5285:2: this_IdentityRef_1= ruleIdentityRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRefAccess().getIdentityRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentityRef_in_ruleRef11601);
                    this_IdentityRef_1=ruleIdentityRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdentityRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5298:2: this_LocalOrWildcard_2= ruleLocalOrWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRefAccess().getLocalOrWildcardParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalOrWildcard_in_ruleRef11631);
                    this_LocalOrWildcard_2=ruleLocalOrWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalOrWildcard_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleIdentityRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5317:1: entryRuleIdentityRef returns [EObject current=null] : iv_ruleIdentityRef= ruleIdentityRef EOF ;
    public final EObject entryRuleIdentityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentityRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5318:2: (iv_ruleIdentityRef= ruleIdentityRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5319:2: iv_ruleIdentityRef= ruleIdentityRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentityRefRule()); 
            }
            pushFollow(FOLLOW_ruleIdentityRef_in_entryRuleIdentityRef11666);
            iv_ruleIdentityRef=ruleIdentityRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentityRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentityRef11676); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentityRef"


    // $ANTLR start "ruleIdentityRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5326:1: ruleIdentityRef returns [EObject current=null] : (this_ParameterRef_0= ruleParameterRef | this_ThisRef_1= ruleThisRef | this_CaughtExceptionRef_2= ruleCaughtExceptionRef ) ;
    public final EObject ruleIdentityRef() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterRef_0 = null;

        EObject this_ThisRef_1 = null;

        EObject this_CaughtExceptionRef_2 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5329:28: ( (this_ParameterRef_0= ruleParameterRef | this_ThisRef_1= ruleThisRef | this_CaughtExceptionRef_2= ruleCaughtExceptionRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5330:1: (this_ParameterRef_0= ruleParameterRef | this_ThisRef_1= ruleThisRef | this_CaughtExceptionRef_2= ruleCaughtExceptionRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5330:1: (this_ParameterRef_0= ruleParameterRef | this_ThisRef_1= ruleThisRef | this_CaughtExceptionRef_2= ruleCaughtExceptionRef )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==78) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt47=1;
                    }
                    break;
                case 80:
                    {
                    alt47=3;
                    }
                    break;
                case 79:
                    {
                    alt47=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5331:2: this_ParameterRef_0= ruleParameterRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentityRefAccess().getParameterRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterRef_in_ruleIdentityRef11726);
                    this_ParameterRef_0=ruleParameterRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5344:2: this_ThisRef_1= ruleThisRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentityRefAccess().getThisRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThisRef_in_ruleIdentityRef11756);
                    this_ThisRef_1=ruleThisRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ThisRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5357:2: this_CaughtExceptionRef_2= ruleCaughtExceptionRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentityRefAccess().getCaughtExceptionRefParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCaughtExceptionRef_in_ruleIdentityRef11786);
                    this_CaughtExceptionRef_2=ruleCaughtExceptionRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CaughtExceptionRef_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentityRef"


    // $ANTLR start "entryRuleParameterRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5376:1: entryRuleParameterRef returns [EObject current=null] : iv_ruleParameterRef= ruleParameterRef EOF ;
    public final EObject entryRuleParameterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5377:2: (iv_ruleParameterRef= ruleParameterRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5378:2: iv_ruleParameterRef= ruleParameterRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRefRule()); 
            }
            pushFollow(FOLLOW_ruleParameterRef_in_entryRuleParameterRef11821);
            iv_ruleParameterRef=ruleParameterRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterRef11831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterRef"


    // $ANTLR start "ruleParameterRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5385:1: ruleParameterRef returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleParameterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5388:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5389:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5389:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5389:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleParameterRef11868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterRefAccess().getCommercialAtKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5393:1: ( (lv_name_1_0= RULE_ID ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5394:1: (lv_name_1_0= RULE_ID )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5394:1: (lv_name_1_0= RULE_ID )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5395:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterRef11885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterRefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleParameterRef11902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterRefAccess().getColonKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5415:1: ( (lv_type_3_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5416:1: (lv_type_3_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5416:1: (lv_type_3_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5417:3: lv_type_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterRefAccess().getTypeQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleParameterRef11923);
            lv_type_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterRef"


    // $ANTLR start "entryRuleThisRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5441:1: entryRuleThisRef returns [EObject current=null] : iv_ruleThisRef= ruleThisRef EOF ;
    public final EObject entryRuleThisRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5442:2: (iv_ruleThisRef= ruleThisRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5443:2: iv_ruleThisRef= ruleThisRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThisRefRule()); 
            }
            pushFollow(FOLLOW_ruleThisRef_in_entryRuleThisRef11959);
            iv_ruleThisRef=ruleThisRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThisRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThisRef11969); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThisRef"


    // $ANTLR start "ruleThisRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5450:1: ruleThisRef returns [EObject current=null] : (otherlv_0= '@' otherlv_1= 'this' otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleThisRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5453:28: ( (otherlv_0= '@' otherlv_1= 'this' otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5454:1: (otherlv_0= '@' otherlv_1= 'this' otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5454:1: (otherlv_0= '@' otherlv_1= 'this' otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5454:3: otherlv_0= '@' otherlv_1= 'this' otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleThisRef12006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getThisRefAccess().getCommercialAtKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleThisRef12018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getThisRefAccess().getThisKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleThisRef12030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getThisRefAccess().getColonKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5466:1: ( (lv_type_3_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5467:1: (lv_type_3_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5467:1: (lv_type_3_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5468:3: lv_type_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getThisRefAccess().getTypeQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleThisRef12051);
            lv_type_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getThisRefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThisRef"


    // $ANTLR start "entryRuleCaughtExceptionRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5492:1: entryRuleCaughtExceptionRef returns [EObject current=null] : iv_ruleCaughtExceptionRef= ruleCaughtExceptionRef EOF ;
    public final EObject entryRuleCaughtExceptionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaughtExceptionRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5493:2: (iv_ruleCaughtExceptionRef= ruleCaughtExceptionRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5494:2: iv_ruleCaughtExceptionRef= ruleCaughtExceptionRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaughtExceptionRefRule()); 
            }
            pushFollow(FOLLOW_ruleCaughtExceptionRef_in_entryRuleCaughtExceptionRef12087);
            iv_ruleCaughtExceptionRef=ruleCaughtExceptionRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaughtExceptionRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaughtExceptionRef12097); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaughtExceptionRef"


    // $ANTLR start "ruleCaughtExceptionRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5501:1: ruleCaughtExceptionRef returns [EObject current=null] : ( () otherlv_1= '@' otherlv_2= 'caughtexception' ) ;
    public final EObject ruleCaughtExceptionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5504:28: ( ( () otherlv_1= '@' otherlv_2= 'caughtexception' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5505:1: ( () otherlv_1= '@' otherlv_2= 'caughtexception' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5505:1: ( () otherlv_1= '@' otherlv_2= 'caughtexception' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5505:2: () otherlv_1= '@' otherlv_2= 'caughtexception'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5505:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5506:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCaughtExceptionRefAccess().getCaughtExceptionRefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleCaughtExceptionRef12146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCaughtExceptionRefAccess().getCommercialAtKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleCaughtExceptionRef12158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaughtExceptionRefAccess().getCaughtexceptionKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaughtExceptionRef"


    // $ANTLR start "entryRuleConcreteRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5530:1: entryRuleConcreteRef returns [EObject current=null] : iv_ruleConcreteRef= ruleConcreteRef EOF ;
    public final EObject entryRuleConcreteRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5531:2: (iv_ruleConcreteRef= ruleConcreteRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5532:2: iv_ruleConcreteRef= ruleConcreteRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteRefRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteRef_in_entryRuleConcreteRef12194);
            iv_ruleConcreteRef=ruleConcreteRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteRef12204); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteRef"


    // $ANTLR start "ruleConcreteRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5539:1: ruleConcreteRef returns [EObject current=null] : (this_ArrayRef_0= ruleArrayRef | this_FieldRef_1= ruleFieldRef ) ;
    public final EObject ruleConcreteRef() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayRef_0 = null;

        EObject this_FieldRef_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5542:28: ( (this_ArrayRef_0= ruleArrayRef | this_FieldRef_1= ruleFieldRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5543:1: (this_ArrayRef_0= ruleArrayRef | this_FieldRef_1= ruleFieldRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5543:1: (this_ArrayRef_0= ruleArrayRef | this_FieldRef_1= ruleFieldRef )
            int alt48=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==74) ) {
                    alt48=1;
                }
                else if ( (LA48_1==65) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_5 = input.LA(3);

                    if ( (LA48_5==69) ) {
                        int LA48_6 = input.LA(4);

                        if ( (LA48_6==65) ) {
                            alt48=2;
                        }
                        else if ( (LA48_6==74) ) {
                            alt48=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                alt48=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5544:2: this_ArrayRef_0= ruleArrayRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteRefAccess().getArrayRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayRef_in_ruleConcreteRef12254);
                    this_ArrayRef_0=ruleArrayRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5557:2: this_FieldRef_1= ruleFieldRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteRefAccess().getFieldRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFieldRef_in_ruleConcreteRef12284);
                    this_FieldRef_1=ruleFieldRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FieldRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcreteRef"


    // $ANTLR start "entryRuleArrayRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5576:1: entryRuleArrayRef returns [EObject current=null] : iv_ruleArrayRef= ruleArrayRef EOF ;
    public final EObject entryRuleArrayRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5577:2: (iv_ruleArrayRef= ruleArrayRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5578:2: iv_ruleArrayRef= ruleArrayRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRefRule()); 
            }
            pushFollow(FOLLOW_ruleArrayRef_in_entryRuleArrayRef12319);
            iv_ruleArrayRef=ruleArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayRef12329); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayRef"


    // $ANTLR start "ruleArrayRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5585:1: ruleArrayRef returns [EObject current=null] : ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '[' ( (lv_index_2_0= ruleNonExpr ) ) otherlv_3= ']' ) ;
    public final EObject ruleArrayRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_base_0_0 = null;

        EObject lv_index_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5588:28: ( ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '[' ( (lv_index_2_0= ruleNonExpr ) ) otherlv_3= ']' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5589:1: ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '[' ( (lv_index_2_0= ruleNonExpr ) ) otherlv_3= ']' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5589:1: ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '[' ( (lv_index_2_0= ruleNonExpr ) ) otherlv_3= ']' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5589:2: ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '[' ( (lv_index_2_0= ruleNonExpr ) ) otherlv_3= ']'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5589:2: ( (lv_base_0_0= ruleLocalOrWildcard ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5590:1: (lv_base_0_0= ruleLocalOrWildcard )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5590:1: (lv_base_0_0= ruleLocalOrWildcard )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5591:3: lv_base_0_0= ruleLocalOrWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayRefAccess().getBaseLocalOrWildcardParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalOrWildcard_in_ruleArrayRef12375);
            lv_base_0_0=ruleLocalOrWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayRefRule());
              	        }
                     		set(
                     			current, 
                     			"base",
                      		lv_base_0_0, 
                      		"LocalOrWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleArrayRef12387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayRefAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5611:1: ( (lv_index_2_0= ruleNonExpr ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5612:1: (lv_index_2_0= ruleNonExpr )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5612:1: (lv_index_2_0= ruleNonExpr )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5613:3: lv_index_2_0= ruleNonExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayRefAccess().getIndexNonExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNonExpr_in_ruleArrayRef12408);
            lv_index_2_0=ruleNonExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayRefRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_2_0, 
                      		"NonExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleArrayRef12420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayRefAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayRef"


    // $ANTLR start "entryRuleFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5641:1: entryRuleFieldRef returns [EObject current=null] : iv_ruleFieldRef= ruleFieldRef EOF ;
    public final EObject entryRuleFieldRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5642:2: (iv_ruleFieldRef= ruleFieldRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5643:2: iv_ruleFieldRef= ruleFieldRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRefRule()); 
            }
            pushFollow(FOLLOW_ruleFieldRef_in_entryRuleFieldRef12456);
            iv_ruleFieldRef=ruleFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldRef12466); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldRef"


    // $ANTLR start "ruleFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5650:1: ruleFieldRef returns [EObject current=null] : (this_StaticFieldRef_0= ruleStaticFieldRef | this_InstanceFieldRef_1= ruleInstanceFieldRef ) ;
    public final EObject ruleFieldRef() throws RecognitionException {
        EObject current = null;

        EObject this_StaticFieldRef_0 = null;

        EObject this_InstanceFieldRef_1 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5653:28: ( (this_StaticFieldRef_0= ruleStaticFieldRef | this_InstanceFieldRef_1= ruleInstanceFieldRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5654:1: (this_StaticFieldRef_0= ruleStaticFieldRef | this_InstanceFieldRef_1= ruleInstanceFieldRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5654:1: (this_StaticFieldRef_0= ruleStaticFieldRef | this_InstanceFieldRef_1= ruleInstanceFieldRef )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_ID||LA49_0==68) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5655:2: this_StaticFieldRef_0= ruleStaticFieldRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldRefAccess().getStaticFieldRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticFieldRef_in_ruleFieldRef12516);
                    this_StaticFieldRef_0=ruleStaticFieldRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StaticFieldRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5668:2: this_InstanceFieldRef_1= ruleInstanceFieldRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldRefAccess().getInstanceFieldRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceFieldRef_in_ruleFieldRef12546);
                    this_InstanceFieldRef_1=ruleInstanceFieldRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstanceFieldRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldRef"


    // $ANTLR start "entryRuleStaticFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5687:1: entryRuleStaticFieldRef returns [EObject current=null] : iv_ruleStaticFieldRef= ruleStaticFieldRef EOF ;
    public final EObject entryRuleStaticFieldRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticFieldRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5688:2: (iv_ruleStaticFieldRef= ruleStaticFieldRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5689:2: iv_ruleStaticFieldRef= ruleStaticFieldRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticFieldRefRule()); 
            }
            pushFollow(FOLLOW_ruleStaticFieldRef_in_entryRuleStaticFieldRef12581);
            iv_ruleStaticFieldRef=ruleStaticFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticFieldRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticFieldRef12591); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticFieldRef"


    // $ANTLR start "ruleStaticFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5696:1: ruleStaticFieldRef returns [EObject current=null] : ( (lv_fieldRef_0_0= ruleSootFieldRef ) ) ;
    public final EObject ruleStaticFieldRef() throws RecognitionException {
        EObject current = null;

        EObject lv_fieldRef_0_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5699:28: ( ( (lv_fieldRef_0_0= ruleSootFieldRef ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5700:1: ( (lv_fieldRef_0_0= ruleSootFieldRef ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5700:1: ( (lv_fieldRef_0_0= ruleSootFieldRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5701:1: (lv_fieldRef_0_0= ruleSootFieldRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5701:1: (lv_fieldRef_0_0= ruleSootFieldRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5702:3: lv_fieldRef_0_0= ruleSootFieldRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticFieldRefAccess().getFieldRefSootFieldRefParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSootFieldRef_in_ruleStaticFieldRef12636);
            lv_fieldRef_0_0=ruleSootFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStaticFieldRefRule());
              	        }
                     		set(
                     			current, 
                     			"fieldRef",
                      		lv_fieldRef_0_0, 
                      		"SootFieldRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticFieldRef"


    // $ANTLR start "entryRuleSootFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5726:1: entryRuleSootFieldRef returns [EObject current=null] : iv_ruleSootFieldRef= ruleSootFieldRef EOF ;
    public final EObject entryRuleSootFieldRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSootFieldRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5727:2: (iv_ruleSootFieldRef= ruleSootFieldRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5728:2: iv_ruleSootFieldRef= ruleSootFieldRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSootFieldRefRule()); 
            }
            pushFollow(FOLLOW_ruleSootFieldRef_in_entryRuleSootFieldRef12671);
            iv_ruleSootFieldRef=ruleSootFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSootFieldRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSootFieldRef12681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSootFieldRef"


    // $ANTLR start "ruleSootFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5735:1: ruleSootFieldRef returns [EObject current=null] : (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_Type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '>' ) ;
    public final EObject ruleSootFieldRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_class_1_0 = null;

        AntlrDatatypeRuleToken lv_Type_3_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5738:28: ( (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_Type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '>' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5739:1: (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_Type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '>' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5739:1: (otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_Type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '>' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5739:3: otherlv_0= '<' ( (lv_class_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (lv_Type_3_0= ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleSootFieldRef12718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSootFieldRefAccess().getLessThanSignKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5743:1: ( (lv_class_1_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5744:1: (lv_class_1_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5744:1: (lv_class_1_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5745:3: lv_class_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSootFieldRefAccess().getClassQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSootFieldRef12739);
            lv_class_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSootFieldRefRule());
              	        }
                     		set(
                     			current, 
                     			"class",
                      		lv_class_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSootFieldRef12751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSootFieldRefAccess().getColonKeyword_2());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5765:1: ( (lv_Type_3_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5766:1: (lv_Type_3_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5766:1: (lv_Type_3_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5767:3: lv_Type_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSootFieldRefAccess().getTypeQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSootFieldRef12772);
            lv_Type_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSootFieldRefRule());
              	        }
                     		set(
                     			current, 
                     			"Type",
                      		lv_Type_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5783:2: ( (lv_name_4_0= RULE_ID ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5784:1: (lv_name_4_0= RULE_ID )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5784:1: (lv_name_4_0= RULE_ID )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5785:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSootFieldRef12789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getSootFieldRefAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSootFieldRefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleSootFieldRef12806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSootFieldRefAccess().getGreaterThanSignKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSootFieldRef"


    // $ANTLR start "entryRuleInstanceFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5813:1: entryRuleInstanceFieldRef returns [EObject current=null] : iv_ruleInstanceFieldRef= ruleInstanceFieldRef EOF ;
    public final EObject entryRuleInstanceFieldRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceFieldRef = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5814:2: (iv_ruleInstanceFieldRef= ruleInstanceFieldRef EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5815:2: iv_ruleInstanceFieldRef= ruleInstanceFieldRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceFieldRefRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceFieldRef_in_entryRuleInstanceFieldRef12842);
            iv_ruleInstanceFieldRef=ruleInstanceFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceFieldRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceFieldRef12852); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceFieldRef"


    // $ANTLR start "ruleInstanceFieldRef"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5822:1: ruleInstanceFieldRef returns [EObject current=null] : ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '.' ( (lv_fieldRef_2_0= ruleFieldRef ) ) ) ;
    public final EObject ruleInstanceFieldRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_base_0_0 = null;

        EObject lv_fieldRef_2_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5825:28: ( ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '.' ( (lv_fieldRef_2_0= ruleFieldRef ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5826:1: ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '.' ( (lv_fieldRef_2_0= ruleFieldRef ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5826:1: ( ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '.' ( (lv_fieldRef_2_0= ruleFieldRef ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5826:2: ( (lv_base_0_0= ruleLocalOrWildcard ) ) otherlv_1= '.' ( (lv_fieldRef_2_0= ruleFieldRef ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5826:2: ( (lv_base_0_0= ruleLocalOrWildcard ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5827:1: (lv_base_0_0= ruleLocalOrWildcard )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5827:1: (lv_base_0_0= ruleLocalOrWildcard )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5828:3: lv_base_0_0= ruleLocalOrWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceFieldRefAccess().getBaseLocalOrWildcardParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalOrWildcard_in_ruleInstanceFieldRef12898);
            lv_base_0_0=ruleLocalOrWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstanceFieldRefRule());
              	        }
                     		set(
                     			current, 
                     			"base",
                      		lv_base_0_0, 
                      		"LocalOrWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleInstanceFieldRef12910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInstanceFieldRefAccess().getFullStopKeyword_1());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5848:1: ( (lv_fieldRef_2_0= ruleFieldRef ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5849:1: (lv_fieldRef_2_0= ruleFieldRef )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5849:1: (lv_fieldRef_2_0= ruleFieldRef )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5850:3: lv_fieldRef_2_0= ruleFieldRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceFieldRefAccess().getFieldRefFieldRefParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldRef_in_ruleInstanceFieldRef12931);
            lv_fieldRef_2_0=ruleFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstanceFieldRefRule());
              	        }
                     		set(
                     			current, 
                     			"fieldRef",
                      		lv_fieldRef_2_0, 
                      		"FieldRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceFieldRef"


    // $ANTLR start "entryRuleConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5874:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5875:2: (iv_ruleConstant= ruleConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5876:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant12967);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant12977); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5883:1: ruleConstant returns [EObject current=null] : (this_ClassConstant_0= ruleClassConstant | this_NullConstant_1= ruleNullConstant | this_NumericConstant_2= ruleNumericConstant | this_StringConstant_3= ruleStringConstant ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_ClassConstant_0 = null;

        EObject this_NullConstant_1 = null;

        EObject this_NumericConstant_2 = null;

        EObject this_StringConstant_3 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5886:28: ( (this_ClassConstant_0= ruleClassConstant | this_NullConstant_1= ruleNullConstant | this_NumericConstant_2= ruleNumericConstant | this_StringConstant_3= ruleStringConstant ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5887:1: (this_ClassConstant_0= ruleClassConstant | this_NullConstant_1= ruleNullConstant | this_NumericConstant_2= ruleNumericConstant | this_StringConstant_3= ruleStringConstant )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5887:1: (this_ClassConstant_0= ruleClassConstant | this_NullConstant_1= ruleNullConstant | this_NumericConstant_2= ruleNumericConstant | this_StringConstant_3= ruleStringConstant )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt50=1;
                }
                break;
            case 81:
                {
                alt50=2;
                }
                break;
            case RULE_INT:
                {
                alt50=3;
                }
                break;
            case RULE_STRING:
                {
                alt50=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5888:2: this_ClassConstant_0= ruleClassConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantAccess().getClassConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassConstant_in_ruleConstant13027);
                    this_ClassConstant_0=ruleClassConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassConstant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5901:2: this_NullConstant_1= ruleNullConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantAccess().getNullConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullConstant_in_ruleConstant13057);
                    this_NullConstant_1=ruleNullConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullConstant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5914:2: this_NumericConstant_2= ruleNumericConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantAccess().getNumericConstantParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericConstant_in_ruleConstant13087);
                    this_NumericConstant_2=ruleNumericConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumericConstant_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5927:2: this_StringConstant_3= ruleStringConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringConstant_in_ruleConstant13117);
                    this_StringConstant_3=ruleStringConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringConstant_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleClassConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5946:1: entryRuleClassConstant returns [EObject current=null] : iv_ruleClassConstant= ruleClassConstant EOF ;
    public final EObject entryRuleClassConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5947:2: (iv_ruleClassConstant= ruleClassConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5948:2: iv_ruleClassConstant= ruleClassConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassConstantRule()); 
            }
            pushFollow(FOLLOW_ruleClassConstant_in_entryRuleClassConstant13152);
            iv_ruleClassConstant=ruleClassConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassConstant13162); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassConstant"


    // $ANTLR start "ruleClassConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5955:1: ruleClassConstant returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleClassConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5958:28: ( (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5959:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5959:1: (otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5959:3: otherlv_0= 'class' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleClassConstant13199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClassConstantAccess().getClassKeyword_0());
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5963:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5964:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5964:1: (lv_name_1_0= ruleQualifiedName )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5965:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassConstantAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleClassConstant13220);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassConstantRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassConstant"


    // $ANTLR start "entryRuleNullConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5989:1: entryRuleNullConstant returns [EObject current=null] : iv_ruleNullConstant= ruleNullConstant EOF ;
    public final EObject entryRuleNullConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5990:2: (iv_ruleNullConstant= ruleNullConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5991:2: iv_ruleNullConstant= ruleNullConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullConstantRule()); 
            }
            pushFollow(FOLLOW_ruleNullConstant_in_entryRuleNullConstant13256);
            iv_ruleNullConstant=ruleNullConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullConstant13266); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullConstant"


    // $ANTLR start "ruleNullConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:5998:1: ruleNullConstant returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6001:28: ( ( () otherlv_1= 'null' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6002:1: ( () otherlv_1= 'null' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6002:1: ( () otherlv_1= 'null' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6002:2: () otherlv_1= 'null'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6002:2: ()
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6003:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullConstantAccess().getNullConstantAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleNullConstant13315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullConstantAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullConstant"


    // $ANTLR start "entryRuleNumericConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6023:1: entryRuleNumericConstant returns [EObject current=null] : iv_ruleNumericConstant= ruleNumericConstant EOF ;
    public final EObject entryRuleNumericConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6024:2: (iv_ruleNumericConstant= ruleNumericConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6025:2: iv_ruleNumericConstant= ruleNumericConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericConstantRule()); 
            }
            pushFollow(FOLLOW_ruleNumericConstant_in_entryRuleNumericConstant13351);
            iv_ruleNumericConstant=ruleNumericConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericConstant13361); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericConstant"


    // $ANTLR start "ruleNumericConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6032:1: ruleNumericConstant returns [EObject current=null] : (this_IntConstant_0= ruleIntConstant | this_LongConstant_1= ruleLongConstant | this_DoubleConstant_2= ruleDoubleConstant | this_FloatConstant_3= ruleFloatConstant ) ;
    public final EObject ruleNumericConstant() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstant_0 = null;

        EObject this_LongConstant_1 = null;

        EObject this_DoubleConstant_2 = null;

        EObject this_FloatConstant_3 = null;


         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6035:28: ( (this_IntConstant_0= ruleIntConstant | this_LongConstant_1= ruleLongConstant | this_DoubleConstant_2= ruleDoubleConstant | this_FloatConstant_3= ruleFloatConstant ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6036:1: (this_IntConstant_0= ruleIntConstant | this_LongConstant_1= ruleLongConstant | this_DoubleConstant_2= ruleDoubleConstant | this_FloatConstant_3= ruleFloatConstant )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6036:1: (this_IntConstant_0= ruleIntConstant | this_LongConstant_1= ruleLongConstant | this_DoubleConstant_2= ruleDoubleConstant | this_FloatConstant_3= ruleFloatConstant )
            int alt51=4;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 20:
                case 24:
                case 26:
                case 31:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 75:
                    {
                    alt51=1;
                    }
                    break;
                case 83:
                    {
                    alt51=3;
                    }
                    break;
                case 84:
                    {
                    alt51=4;
                    }
                    break;
                case 82:
                    {
                    alt51=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6037:2: this_IntConstant_0= ruleIntConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericConstantAccess().getIntConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntConstant_in_ruleNumericConstant13411);
                    this_IntConstant_0=ruleIntConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntConstant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6050:2: this_LongConstant_1= ruleLongConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericConstantAccess().getLongConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLongConstant_in_ruleNumericConstant13441);
                    this_LongConstant_1=ruleLongConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LongConstant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6063:2: this_DoubleConstant_2= ruleDoubleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericConstantAccess().getDoubleConstantParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleConstant_in_ruleNumericConstant13471);
                    this_DoubleConstant_2=ruleDoubleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleConstant_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6076:2: this_FloatConstant_3= ruleFloatConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericConstantAccess().getFloatConstantParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatConstant_in_ruleNumericConstant13501);
                    this_FloatConstant_3=ruleFloatConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatConstant_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericConstant"


    // $ANTLR start "entryRuleIntConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6095:1: entryRuleIntConstant returns [EObject current=null] : iv_ruleIntConstant= ruleIntConstant EOF ;
    public final EObject entryRuleIntConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6096:2: (iv_ruleIntConstant= ruleIntConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6097:2: iv_ruleIntConstant= ruleIntConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntConstantRule()); 
            }
            pushFollow(FOLLOW_ruleIntConstant_in_entryRuleIntConstant13536);
            iv_ruleIntConstant=ruleIntConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntConstant13546); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6104:1: ruleIntConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6107:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6108:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6108:1: ( (lv_value_0_0= RULE_INT ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6109:1: (lv_value_0_0= RULE_INT )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6109:1: (lv_value_0_0= RULE_INT )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6110:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntConstant13587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntConstantAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleLongConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6134:1: entryRuleLongConstant returns [EObject current=null] : iv_ruleLongConstant= ruleLongConstant EOF ;
    public final EObject entryRuleLongConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6135:2: (iv_ruleLongConstant= ruleLongConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6136:2: iv_ruleLongConstant= ruleLongConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLongConstantRule()); 
            }
            pushFollow(FOLLOW_ruleLongConstant_in_entryRuleLongConstant13627);
            iv_ruleLongConstant=ruleLongConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLongConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongConstant13637); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLongConstant"


    // $ANTLR start "ruleLongConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6143:1: ruleLongConstant returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'L' ) ;
    public final EObject ruleLongConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6146:28: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'L' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6147:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'L' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6147:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'L' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6147:2: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'L'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6147:2: ( (lv_value_0_0= RULE_INT ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6148:1: (lv_value_0_0= RULE_INT )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6148:1: (lv_value_0_0= RULE_INT )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6149:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLongConstant13679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getLongConstantAccess().getValueINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLongConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleLongConstant13696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLongConstantAccess().getLKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLongConstant"


    // $ANTLR start "entryRuleDoubleConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6177:1: entryRuleDoubleConstant returns [EObject current=null] : iv_ruleDoubleConstant= ruleDoubleConstant EOF ;
    public final EObject entryRuleDoubleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6178:2: (iv_ruleDoubleConstant= ruleDoubleConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6179:2: iv_ruleDoubleConstant= ruleDoubleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleConstantRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleConstant_in_entryRuleDoubleConstant13732);
            iv_ruleDoubleConstant=ruleDoubleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleConstant13742); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleConstant"


    // $ANTLR start "ruleDoubleConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6186:1: ruleDoubleConstant returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'D' ) ;
    public final EObject ruleDoubleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6189:28: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'D' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6190:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'D' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6190:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'D' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6190:2: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'D'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6190:2: ( (lv_value_0_0= RULE_INT ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6191:1: (lv_value_0_0= RULE_INT )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6191:1: (lv_value_0_0= RULE_INT )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6192:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDoubleConstant13784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getDoubleConstantAccess().getValueINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDoubleConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleDoubleConstant13801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDoubleConstantAccess().getDKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleConstant"


    // $ANTLR start "entryRuleFloatConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6220:1: entryRuleFloatConstant returns [EObject current=null] : iv_ruleFloatConstant= ruleFloatConstant EOF ;
    public final EObject entryRuleFloatConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6221:2: (iv_ruleFloatConstant= ruleFloatConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6222:2: iv_ruleFloatConstant= ruleFloatConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatConstantRule()); 
            }
            pushFollow(FOLLOW_ruleFloatConstant_in_entryRuleFloatConstant13837);
            iv_ruleFloatConstant=ruleFloatConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatConstant13847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatConstant"


    // $ANTLR start "ruleFloatConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6229:1: ruleFloatConstant returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'F' ) ;
    public final EObject ruleFloatConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6232:28: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'F' ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6233:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'F' )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6233:1: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'F' )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6233:2: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= 'F'
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6233:2: ( (lv_value_0_0= RULE_INT ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6234:1: (lv_value_0_0= RULE_INT )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6234:1: (lv_value_0_0= RULE_INT )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6235:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloatConstant13889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatConstantAccess().getValueINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleFloatConstant13906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloatConstantAccess().getFKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatConstant"


    // $ANTLR start "entryRuleStringConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6263:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6264:2: (iv_ruleStringConstant= ruleStringConstant EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6265:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringConstantRule()); 
            }
            pushFollow(FOLLOW_ruleStringConstant_in_entryRuleStringConstant13942);
            iv_ruleStringConstant=ruleStringConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstant13952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6272:1: ruleStringConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6275:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6276:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6276:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6277:1: (lv_value_0_0= RULE_STRING )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6277:1: (lv_value_0_0= RULE_STRING )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6278:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstant13993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringConstantAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleMethodName"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6304:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6305:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6306:2: iv_ruleMethodName= ruleMethodName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodNameRule()); 
            }
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName14036);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName14047); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6313:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<' )? this_ID_1= RULE_ID (kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6316:28: ( ( (kw= '<' )? this_ID_1= RULE_ID (kw= '>' )? ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6317:1: ( (kw= '<' )? this_ID_1= RULE_ID (kw= '>' )? )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6317:1: ( (kw= '<' )? this_ID_1= RULE_ID (kw= '>' )? )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6317:2: (kw= '<' )? this_ID_1= RULE_ID (kw= '>' )?
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6317:2: (kw= '<' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6318:2: kw= '<'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleMethodName14086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodName14103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6330:1: (kw= '>' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==58) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6331:2: kw= '>'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleMethodName14122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "entryRuleQualifiedName"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6344:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6345:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6346:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14165);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName14176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6353:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6356:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6357:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6357:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6357:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6364:1: (kw= '.' this_ID_2= RULE_ID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==65) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6365:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleQualifiedName14235); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14250); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleVisibility"
    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6385:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6387:28: ( ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) ) )
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6388:1: ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) )
            {
            // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6388:1: ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt55=1;
                }
                break;
            case 86:
                {
                alt55=2;
                }
                break;
            case 87:
                {
                alt55=3;
                }
                break;
            case 88:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6388:2: (enumLiteral_0= 'package' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6388:2: (enumLiteral_0= 'package' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6388:4: enumLiteral_0= 'package'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleVisibility14311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6394:6: (enumLiteral_1= 'public' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6394:6: (enumLiteral_1= 'public' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6394:8: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleVisibility14328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6400:6: (enumLiteral_2= 'protected' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6400:6: (enumLiteral_2= 'protected' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6400:8: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_87_in_ruleVisibility14345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6406:6: (enumLiteral_3= 'private' )
                    {
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6406:6: (enumLiteral_3= 'private' )
                    // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:6406:8: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_88_in_ruleVisibility14362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"

    // $ANTLR start synpred17_InternalTransformationLanguage
    public final void synpred17_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject lv_declarations_2_0 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:883:1: ( (lv_declarations_2_0= ruleDeclaration ) )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:883:1: (lv_declarations_2_0= ruleDeclaration )
        {
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:883:1: (lv_declarations_2_0= ruleDeclaration )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:884:3: lv_declarations_2_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBodyAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDeclaration_in_synpred17_InternalTransformationLanguage1729);
        lv_declarations_2_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalTransformationLanguage

    // $ANTLR start synpred36_InternalTransformationLanguage
    public final void synpred36_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_NonExpr_0 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2178:2: (this_NonExpr_0= ruleNonExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2178:2: this_NonExpr_0= ruleNonExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNonExpr_in_synpred36_InternalTransformationLanguage4784);
        this_NonExpr_0=ruleNonExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalTransformationLanguage

    // $ANTLR start synpred39_InternalTransformationLanguage
    public final void synpred39_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_BinOpExpr_1 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2283:2: (this_BinOpExpr_1= ruleBinOpExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2283:2: this_BinOpExpr_1= ruleBinOpExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBinOpExpr_in_synpred39_InternalTransformationLanguage5064);
        this_BinOpExpr_1=ruleBinOpExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalTransformationLanguage

    // $ANTLR start synpred41_InternalTransformationLanguage
    public final void synpred41_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_InstanceOfExpr_3 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2309:2: (this_InstanceOfExpr_3= ruleInstanceOfExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2309:2: this_InstanceOfExpr_3= ruleInstanceOfExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleInstanceOfExpr_in_synpred41_InternalTransformationLanguage5124);
        this_InstanceOfExpr_3=ruleInstanceOfExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalTransformationLanguage

    // $ANTLR start synpred45_InternalTransformationLanguage
    public final void synpred45_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_AddExpr_0 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2427:2: (this_AddExpr_0= ruleAddExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2427:2: this_AddExpr_0= ruleAddExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAddExpr_in_synpred45_InternalTransformationLanguage5434);
        this_AddExpr_0=ruleAddExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalTransformationLanguage

    // $ANTLR start synpred46_InternalTransformationLanguage
    public final void synpred46_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_AndExpr_1 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2440:2: (this_AndExpr_1= ruleAndExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2440:2: this_AndExpr_1= ruleAndExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAndExpr_in_synpred46_InternalTransformationLanguage5464);
        this_AndExpr_1=ruleAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalTransformationLanguage

    // $ANTLR start synpred47_InternalTransformationLanguage
    public final void synpred47_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_CmpExpr_2 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2453:2: (this_CmpExpr_2= ruleCmpExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2453:2: this_CmpExpr_2= ruleCmpExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCmpExpr_in_synpred47_InternalTransformationLanguage5494);
        this_CmpExpr_2=ruleCmpExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalTransformationLanguage

    // $ANTLR start synpred48_InternalTransformationLanguage
    public final void synpred48_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_CmpgExpr_3 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2466:2: (this_CmpgExpr_3= ruleCmpgExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2466:2: this_CmpgExpr_3= ruleCmpgExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCmpgExpr_in_synpred48_InternalTransformationLanguage5524);
        this_CmpgExpr_3=ruleCmpgExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalTransformationLanguage

    // $ANTLR start synpred49_InternalTransformationLanguage
    public final void synpred49_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_CmplExpr_4 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2479:2: (this_CmplExpr_4= ruleCmplExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2479:2: this_CmplExpr_4= ruleCmplExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCmplExpr_in_synpred49_InternalTransformationLanguage5554);
        this_CmplExpr_4=ruleCmplExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalTransformationLanguage

    // $ANTLR start synpred50_InternalTransformationLanguage
    public final void synpred50_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_ConditionalExpr_5 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2492:2: (this_ConditionalExpr_5= ruleConditionalExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2492:2: this_ConditionalExpr_5= ruleConditionalExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleConditionalExpr_in_synpred50_InternalTransformationLanguage5584);
        this_ConditionalExpr_5=ruleConditionalExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalTransformationLanguage

    // $ANTLR start synpred51_InternalTransformationLanguage
    public final void synpred51_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_DivExpr_6 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2505:2: (this_DivExpr_6= ruleDivExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2505:2: this_DivExpr_6= ruleDivExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleDivExpr_in_synpred51_InternalTransformationLanguage5614);
        this_DivExpr_6=ruleDivExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalTransformationLanguage

    // $ANTLR start synpred52_InternalTransformationLanguage
    public final void synpred52_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_MulExpr_7 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2518:2: (this_MulExpr_7= ruleMulExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2518:2: this_MulExpr_7= ruleMulExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleMulExpr_in_synpred52_InternalTransformationLanguage5644);
        this_MulExpr_7=ruleMulExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalTransformationLanguage

    // $ANTLR start synpred53_InternalTransformationLanguage
    public final void synpred53_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_OrExpr_8 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2531:2: (this_OrExpr_8= ruleOrExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2531:2: this_OrExpr_8= ruleOrExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleOrExpr_in_synpred53_InternalTransformationLanguage5674);
        this_OrExpr_8=ruleOrExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalTransformationLanguage

    // $ANTLR start synpred54_InternalTransformationLanguage
    public final void synpred54_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_RemExpr_9 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2544:2: (this_RemExpr_9= ruleRemExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2544:2: this_RemExpr_9= ruleRemExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleRemExpr_in_synpred54_InternalTransformationLanguage5704);
        this_RemExpr_9=ruleRemExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalTransformationLanguage

    // $ANTLR start synpred55_InternalTransformationLanguage
    public final void synpred55_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_ShlExpr_10 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2557:2: (this_ShlExpr_10= ruleShlExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2557:2: this_ShlExpr_10= ruleShlExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleShlExpr_in_synpred55_InternalTransformationLanguage5734);
        this_ShlExpr_10=ruleShlExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalTransformationLanguage

    // $ANTLR start synpred56_InternalTransformationLanguage
    public final void synpred56_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_ShrExpr_11 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2570:2: (this_ShrExpr_11= ruleShrExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2570:2: this_ShrExpr_11= ruleShrExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleShrExpr_in_synpred56_InternalTransformationLanguage5764);
        this_ShrExpr_11=ruleShrExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalTransformationLanguage

    // $ANTLR start synpred57_InternalTransformationLanguage
    public final void synpred57_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_SubExpr_12 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2583:2: (this_SubExpr_12= ruleSubExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2583:2: this_SubExpr_12= ruleSubExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubExpr_in_synpred57_InternalTransformationLanguage5794);
        this_SubExpr_12=ruleSubExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalTransformationLanguage

    // $ANTLR start synpred58_InternalTransformationLanguage
    public final void synpred58_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_UshrExpr_13 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2596:2: (this_UshrExpr_13= ruleUshrExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2596:2: this_UshrExpr_13= ruleUshrExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleUshrExpr_in_synpred58_InternalTransformationLanguage5824);
        this_UshrExpr_13=ruleUshrExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalTransformationLanguage

    // $ANTLR start synpred59_InternalTransformationLanguage
    public final void synpred59_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_EqExpr_0 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2947:2: (this_EqExpr_0= ruleEqExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2947:2: this_EqExpr_0= ruleEqExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEqExpr_in_synpred59_InternalTransformationLanguage6574);
        this_EqExpr_0=ruleEqExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalTransformationLanguage

    // $ANTLR start synpred60_InternalTransformationLanguage
    public final void synpred60_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_GeExpr_1 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2960:2: (this_GeExpr_1= ruleGeExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2960:2: this_GeExpr_1= ruleGeExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleGeExpr_in_synpred60_InternalTransformationLanguage6604);
        this_GeExpr_1=ruleGeExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalTransformationLanguage

    // $ANTLR start synpred61_InternalTransformationLanguage
    public final void synpred61_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_GtExpr_2 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2973:2: (this_GtExpr_2= ruleGtExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2973:2: this_GtExpr_2= ruleGtExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleGtExpr_in_synpred61_InternalTransformationLanguage6634);
        this_GtExpr_2=ruleGtExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalTransformationLanguage

    // $ANTLR start synpred62_InternalTransformationLanguage
    public final void synpred62_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_LeExpr_3 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2986:2: (this_LeExpr_3= ruleLeExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2986:2: this_LeExpr_3= ruleLeExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleLeExpr_in_synpred62_InternalTransformationLanguage6664);
        this_LeExpr_3=ruleLeExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalTransformationLanguage

    // $ANTLR start synpred63_InternalTransformationLanguage
    public final void synpred63_InternalTransformationLanguage_fragment() throws RecognitionException {   
        EObject this_LtExpr_4 = null;


        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2999:2: (this_LtExpr_4= ruleLtExpr )
        // ../soot.jimple.toolkits.transformation.dsl/src-gen/soot/jimple/toolkits/transformation/dsl/parser/antlr/internal/InternalTransformationLanguage.g:2999:2: this_LtExpr_4= ruleLtExpr
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleLtExpr_in_synpred63_InternalTransformationLanguage6694);
        this_LtExpr_4=ruleLtExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalTransformationLanguage

    // Delegated rules

    public final boolean synpred63_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalTransformationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalTransformationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\6\4\1\uffff\1\4\1\30\1\uffff";
    static final String DFA8_maxS =
        "\1\130\4\27\1\4\1\uffff\1\101\1\72\1\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\2\2\uffff\1\1";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\6\21\uffff\1\6\1\5\75\uffff\1\1\1\2\1\3\1\4",
            "\1\6\22\uffff\1\5",
            "\1\6\22\uffff\1\5",
            "\1\6\22\uffff\1\5",
            "\1\6\22\uffff\1\5",
            "\1\7",
            "",
            "\1\10\67\uffff\1\6\4\uffff\1\11",
            "\1\11\1\6\40\uffff\1\6",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 558:1: ( (lv_fields_11_0= ruleField ) )*";
        }
    }
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\4\1\uffff\2\4\1\uffff\5\4\1\0";
    static final String DFA15_maxS =
        "\1\116\1\uffff\1\112\1\104\1\uffff\1\101\1\104\1\101\1\104\1\101"+
        "\1\0";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\6\uffff";
    static final String DFA15_specialS =
        "\12\uffff\1\0}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\1\20\uffff\1\1\5\uffff\1\1\2\uffff\3\1\1\uffff\6\1\23"+
            "\uffff\1\1\2\uffff\2\1\1\uffff\3\1\11\uffff\1\1",
            "",
            "\1\4\30\uffff\2\1\42\uffff\1\3\10\uffff\1\1",
            "\1\5\67\uffff\1\1\7\uffff\1\1",
            "",
            "\1\4\74\uffff\1\6",
            "\1\7\67\uffff\1\1\7\uffff\1\1",
            "\1\4\74\uffff\1\10",
            "\1\11\67\uffff\1\1\7\uffff\1\1",
            "\1\4\74\uffff\1\12",
            "\1\uffff"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 882:1: ( (lv_declarations_2_0= ruleDeclaration ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalTransformationLanguage()) ) {s = 4;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\16\uffff";
    static final String DFA20_eofS =
        "\12\uffff\1\15\3\uffff";
    static final String DFA20_minS =
        "\1\4\11\uffff\1\4\3\uffff";
    static final String DFA20_maxS =
        "\1\116\11\uffff\1\121\3\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\14\1\13"+
        "\1\12";
    static final String DFA20_specialS =
        "\16\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\27\uffff\1\1\2\uffff\1\3\1\4\1\13\1\uffff\1\6\2\7\1\10"+
            "\1\11\1\12\23\uffff\1\2\2\uffff\2\5\1\uffff\2\5\1\2\11\uffff"+
            "\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\uffff\2\14\10\uffff\1\14\7\uffff\1\15\1\14\42\uffff"+
            "\1\14\2\uffff\2\14\1\uffff\3\14\1\uffff\3\14\3\uffff\3\14\2"+
            "\uffff\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1115:1: (this_BreakpointStmt_0= ruleBreakpointStmt | this_DefinitionStmt_1= ruleDefinitionStmt | this_GotoStmt_2= ruleGotoStmt | this_IfStmt_3= ruleIfStmt | this_InvokeStmt_4= ruleInvokeStmt | this_LookupSwitchStmt_5= ruleLookupSwitchStmt | this_MonitorStmt_6= ruleMonitorStmt | this_NopStmt_7= ruleNopStmt | this_RetStmt_8= ruleRetStmt | this_ReturnVoidStmt_9= ruleReturnVoidStmt | this_ReturnStmt_10= ruleReturnStmt | this_TableSwitchStmt_11= ruleTableSwitchStmt )";
        }
    }
    static final String DFA24_eotS =
        "\24\uffff";
    static final String DFA24_eofS =
        "\24\uffff";
    static final String DFA24_minS =
        "\1\4\10\0\13\uffff";
    static final String DFA24_maxS =
        "\1\121\10\0\13\uffff";
    static final String DFA24_acceptS =
        "\11\uffff\1\2\11\uffff\1\1";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\13\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\5\1\uffff\1\3\1\4\10\uffff\1\1\10\uffff\1\11\42\uffff\1\7"+
            "\2\uffff\2\11\1\uffff\2\11\1\6\1\uffff\3\11\3\uffff\2\11\1\10"+
            "\2\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "2177:1: (this_NonExpr_0= ruleNonExpr | this_Expr_1= ruleExpr )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\24\uffff";
    static final String DFA26_eofS =
        "\24\uffff";
    static final String DFA26_minS =
        "\1\4\7\uffff\4\0\10\uffff";
    static final String DFA26_maxS =
        "\1\121\7\uffff\4\0\10\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\7\uffff\1\3\1\5\3\uffff\1\6\1\uffff\1\4";
    static final String DFA26_specialS =
        "\10\uffff\1\0\1\1\1\2\1\3\10\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\10\1\uffff\2\4\10\uffff\1\4\10\uffff\1\14\42\uffff\1\12\2"+
            "\uffff\2\15\1\uffff\2\15\1\11\1\uffff\3\1\3\uffff\2\21\1\13"+
            "\2\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "2269:1: (this_AnyNewExpr_0= ruleAnyNewExpr | this_BinOpExpr_1= ruleBinOpExpr | this_CastExpr_2= ruleCastExpr | this_InstanceOfExpr_3= ruleInstanceOfExpr | this_InvokeExpr_4= ruleInvokeExpr | this_UnopExpr_5= ruleUnopExpr )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalTransformationLanguage()) ) {s = 4;}

                        else if ( (synpred41_InternalTransformationLanguage()) ) {s = 19;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalTransformationLanguage()) ) {s = 4;}

                        else if ( (synpred41_InternalTransformationLanguage()) ) {s = 19;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalTransformationLanguage()) ) {s = 4;}

                        else if ( (synpred41_InternalTransformationLanguage()) ) {s = 19;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_11 = input.LA(1);

                         
                        int index26_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalTransformationLanguage()) ) {s = 4;}

                        else if ( (synpred41_InternalTransformationLanguage()) ) {s = 19;}

                         
                        input.seek(index26_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\30\uffff";
    static final String DFA28_eofS =
        "\30\uffff";
    static final String DFA28_minS =
        "\1\4\10\0\17\uffff";
    static final String DFA28_maxS =
        "\1\121\10\0\17\uffff";
    static final String DFA28_acceptS =
        "\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\17\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\5\1\uffff\1\3\1\4\10\uffff\1\1\53\uffff\1\7\7\uffff\1\6\11"+
            "\uffff\1\10\2\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "2426:1: (this_AddExpr_0= ruleAddExpr | this_AndExpr_1= ruleAndExpr | this_CmpExpr_2= ruleCmpExpr | this_CmpgExpr_3= ruleCmpgExpr | this_CmplExpr_4= ruleCmplExpr | this_ConditionalExpr_5= ruleConditionalExpr | this_DivExpr_6= ruleDivExpr | this_MulExpr_7= ruleMulExpr | this_OrExpr_8= ruleOrExpr | this_RemExpr_9= ruleRemExpr | this_ShlExpr_10= ruleShlExpr | this_ShrExpr_11= ruleShrExpr | this_SubExpr_12= ruleSubExpr | this_UshrExpr_13= ruleUshrExpr | this_XorExpr_14= ruleXorExpr )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred46_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred47_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred48_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred49_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (synpred50_InternalTransformationLanguage()) ) {s = 14;}

                        else if ( (synpred51_InternalTransformationLanguage()) ) {s = 15;}

                        else if ( (synpred52_InternalTransformationLanguage()) ) {s = 16;}

                        else if ( (synpred53_InternalTransformationLanguage()) ) {s = 17;}

                        else if ( (synpred54_InternalTransformationLanguage()) ) {s = 18;}

                        else if ( (synpred55_InternalTransformationLanguage()) ) {s = 19;}

                        else if ( (synpred56_InternalTransformationLanguage()) ) {s = 20;}

                        else if ( (synpred57_InternalTransformationLanguage()) ) {s = 21;}

                        else if ( (synpred58_InternalTransformationLanguage()) ) {s = 22;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\17\uffff";
    static final String DFA29_eofS =
        "\17\uffff";
    static final String DFA29_minS =
        "\1\4\10\0\6\uffff";
    static final String DFA29_maxS =
        "\1\121\10\0\6\uffff";
    static final String DFA29_acceptS =
        "\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String DFA29_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\5\1\uffff\1\3\1\4\10\uffff\1\1\53\uffff\1\7\7\uffff\1\6\11"+
            "\uffff\1\10\2\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2946:1: (this_EqExpr_0= ruleEqExpr | this_GeExpr_1= ruleGeExpr | this_GtExpr_2= ruleGtExpr | this_LeExpr_3= ruleLeExpr | this_LtExpr_4= ruleLtExpr | this_NeExpr_5= ruleNeExpr )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalTransformationLanguage()) ) {s = 9;}

                        else if ( (synpred60_InternalTransformationLanguage()) ) {s = 10;}

                        else if ( (synpred61_InternalTransformationLanguage()) ) {s = 11;}

                        else if ( (synpred62_InternalTransformationLanguage()) ) {s = 12;}

                        else if ( (synpred63_InternalTransformationLanguage()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTransformation128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransformation140 = new BitSet(new long[]{0x900001FB90830030L,0x0000000001E0401DL});
    public static final BitSet FOLLOW_rulePattern_in_ruleTransformation161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransformation173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransformation185 = new BitSet(new long[]{0x900001FB90830030L,0x0000000001E0401DL});
    public static final BitSet FOLLOW_ruleReplacement_in_ruleTransformation206 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransformation218 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransformation230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePattern_in_rulePattern326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodPattern_in_rulePattern356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypePattern_in_rulePattern386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePattern_in_entryRuleSequencePattern421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencePattern431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementSequence_in_ruleSequencePattern476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPattern521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMethodPattern566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypePattern_in_entryRuleTypePattern601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypePattern611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypePattern656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplacement_in_entryRuleReplacement691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplacement701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementSequence_in_ruleReplacement747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleReplacement774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleReplacement801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleType893 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleType913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17_in_ruleType950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleType985 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_18_in_ruleType998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleType1019 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleType1034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleType1055 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleType1068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleType1089 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleType1105 = new BitSet(new long[]{0x0000000000C00010L,0x0000000001E00000L});
    public static final BitSet FOLLOW_ruleField_in_ruleType1126 = new BitSet(new long[]{0x0000000000C00010L,0x0000000001E00000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleType1148 = new BitSet(new long[]{0x0000000000C00010L,0x0000000001E00000L});
    public static final BitSet FOLLOW_22_in_ruleType1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleField1253 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleField1272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleField1306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1323 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleField1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleMethod1432 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleMethod1451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1482 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleMethod1508 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMethod1520 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod1542 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleMethod1555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethod1576 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_26_in_ruleMethod1592 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleMethod1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBody1708 = new BitSet(new long[]{0x900001FB90400030L,0x000000000000401DL});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleBody1729 = new BitSet(new long[]{0x900001FB90400030L,0x000000000000401DL});
    public static final BitSet FOLLOW_ruleLabelOrStatement_in_ruleBody1751 = new BitSet(new long[]{0x900001FB90400030L,0x000000000000401DL});
    public static final BitSet FOLLOW_22_in_ruleBody1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementSequence_in_entryRuleStatementSequence1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementSequence1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelOrStatement_in_ruleStatementSequence1855 = new BitSet(new long[]{0x900001FB90000032L,0x000000000000401DL});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDeclaration1947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration1964 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration1982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration1999 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_24_in_ruleDeclaration2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelOrStatement_in_entryRuleLabelOrStatement2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelOrStatement2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleLabelOrStatement2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLabelOrStatement2145 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLabelOrStatement2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakpointStmt_in_ruleStatement2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionStmt_in_ruleStatement2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGotoStmt_in_ruleStatement2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_ruleStatement2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeStmt_in_ruleStatement2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookupSwitchStmt_in_ruleStatement2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonitorStmt_in_ruleStatement2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNopStmt_in_ruleStatement2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetStmt_in_ruleStatement2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnVoidStmt_in_ruleStatement2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStmt_in_ruleStatement2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableSwitchStmt_in_ruleStatement2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LABELNAME_in_ruleLabel2670 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLabel2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakpointStmt_in_entryRuleBreakpointStmt2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakpointStmt2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBreakpointStmt2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionStmt_in_entryRuleDefinitionStmt2818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionStmt2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStmt_in_ruleDefinitionStmt2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentityStmt_in_ruleDefinitionStmt2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignStmt_in_entryRuleAssignStmt2943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignStmt2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleAssignStmt2999 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAssignStmt3011 = new BitSet(new long[]{0x90000000020100D0L,0x00000000000271DDL});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignStmt3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentityStmt_in_entryRuleIdentityStmt3068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentityStmt3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_ruleIdentityStmt3124 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIdentityStmt3136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleIdentityRef_in_ruleIdentityStmt3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGotoStmt_in_entryRuleGotoStmt3193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGotoStmt3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleGotoStmt3240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LABELNAME_in_ruleGotoStmt3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_entryRuleIfStmt3298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStmt3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIfStmt3345 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleConditionalExpr_in_ruleIfStmt3366 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleGotoStmt_in_ruleIfStmt3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeStmt_in_entryRuleInvokeStmt3423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokeStmt3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeExpr_in_ruleInvokeStmt3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableSwitchStmt_in_entryRuleTableSwitchStmt3513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableSwitchStmt3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTableSwitchStmt3560 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTableSwitchStmt3572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocal_in_ruleTableSwitchStmt3593 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTableSwitchStmt3605 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTableSwitchStmt3617 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_ruleCase_in_ruleTableSwitchStmt3639 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTableSwitchStmt3651 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_34_in_ruleTableSwitchStmt3665 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTableSwitchStmt3677 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleGotoStmt_in_ruleTableSwitchStmt3698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTableSwitchStmt3710 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTableSwitchStmt3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookupSwitchStmt_in_entryRuleLookupSwitchStmt3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLookupSwitchStmt3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLookupSwitchStmt3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonitorStmt_in_entryRuleMonitorStmt3853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonitorStmt3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnterMonitorStmt_in_ruleMonitorStmt3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitMonitorStmt_in_ruleMonitorStmt3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnterMonitorStmt_in_entryRuleEnterMonitorStmt3978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnterMonitorStmt3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEnterMonitorStmt4025 = new BitSet(new long[]{0x90000000020100D0L,0x00000000000271DDL});
    public static final BitSet FOLLOW_ruleValue_in_ruleEnterMonitorStmt4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitMonitorStmt_in_entryRuleExitMonitorStmt4082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitMonitorStmt4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExitMonitorStmt4129 = new BitSet(new long[]{0x90000000020100D0L,0x00000000000271DDL});
    public static final BitSet FOLLOW_ruleValue_in_ruleExitMonitorStmt4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNopStmt_in_entryRuleNopStmt4186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNopStmt4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNopStmt4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetStmt_in_entryRuleRetStmt4281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetStmt4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRetStmt4328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocal_in_ruleRetStmt4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnVoidStmt_in_entryRuleReturnVoidStmt4385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnVoidStmt4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleReturnVoidStmt4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStmt_in_entryRuleReturnStmt4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStmt4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleReturnStmt4527 = new BitSet(new long[]{0x90000000020100D0L,0x00000000000271DDL});
    public static final BitSet FOLLOW_ruleValue_in_ruleReturnStmt4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCase4631 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCase4648 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCase4665 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleGotoStmt_in_ruleCase4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleValue4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleValue4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_entryRuleNonExpr4849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonExpr4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleNonExpr4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleNonExpr4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr4974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyNewExpr_in_ruleExpr5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOpExpr_in_ruleExpr5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_ruleExpr5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpr_in_ruleExpr5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeExpr_in_ruleExpr5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnopExpr_in_ruleExpr5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyNewExpr_in_entryRuleAnyNewExpr5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyNewExpr5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewArrayExpr_in_ruleAnyNewExpr5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpr_in_ruleAnyNewExpr5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMultiArrayExpr_in_ruleAnyNewExpr5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOpExpr_in_entryRuleBinOpExpr5374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinOpExpr5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpr_in_ruleBinOpExpr5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleBinOpExpr5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpExpr_in_ruleBinOpExpr5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpgExpr_in_ruleBinOpExpr5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmplExpr_in_ruleBinOpExpr5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpr_in_ruleBinOpExpr5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpr_in_ruleBinOpExpr5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulExpr_in_ruleBinOpExpr5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleBinOpExpr5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemExpr_in_ruleBinOpExpr5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShlExpr_in_ruleBinOpExpr5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShrExpr_in_ruleBinOpExpr5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpr_in_ruleBinOpExpr5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUshrExpr_in_ruleBinOpExpr5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXorExpr_in_ruleBinOpExpr5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpr_in_entryRuleAddExpr5889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpr5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleAddExpr5945 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAddExpr5957 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleAddExpr5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr6014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleAndExpr6070 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAndExpr6082 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleAndExpr6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpExpr_in_entryRuleCmpExpr6139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpExpr6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleCmpExpr6195 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCmpExpr6207 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleCmpExpr6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpgExpr_in_entryRuleCmpgExpr6264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpgExpr6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleCmpgExpr6320 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCmpgExpr6332 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleCmpgExpr6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmplExpr_in_entryRuleCmplExpr6389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmplExpr6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleCmplExpr6445 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCmplExpr6457 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleCmplExpr6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpr_in_entryRuleConditionalExpr6514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpr6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqExpr_in_ruleConditionalExpr6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeExpr_in_ruleConditionalExpr6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGtExpr_in_ruleConditionalExpr6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeExpr_in_ruleConditionalExpr6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLtExpr_in_ruleConditionalExpr6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeExpr_in_ruleConditionalExpr6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpr_in_entryRuleDivExpr6759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpr6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleDivExpr6815 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDivExpr6827 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleDivExpr6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulExpr_in_entryRuleMulExpr6884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulExpr6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleMulExpr6940 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleMulExpr6952 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleMulExpr6973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr7009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleOrExpr7065 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleOrExpr7077 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleOrExpr7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemExpr_in_entryRuleRemExpr7134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRemExpr7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleRemExpr7190 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRemExpr7202 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleRemExpr7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShlExpr_in_entryRuleShlExpr7259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShlExpr7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleShlExpr7315 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleShlExpr7327 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleShlExpr7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShrExpr_in_entryRuleShrExpr7384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShrExpr7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleShrExpr7440 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleShrExpr7452 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleShrExpr7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpr_in_entryRuleSubExpr7509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpr7519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleSubExpr7565 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleSubExpr7577 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleSubExpr7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUshrExpr_in_entryRuleUshrExpr7634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUshrExpr7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleUshrExpr7690 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleUshrExpr7702 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleUshrExpr7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXorExpr_in_entryRuleXorExpr7759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXorExpr7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleXorExpr7815 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXorExpr7827 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleXorExpr7848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqExpr_in_entryRuleEqExpr7884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqExpr7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleEqExpr7940 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleEqExpr7952 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleEqExpr7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeExpr_in_entryRuleGeExpr8009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeExpr8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleGeExpr8065 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleGeExpr8077 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleGeExpr8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGtExpr_in_entryRuleGtExpr8134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGtExpr8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleGtExpr8190 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleGtExpr8202 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleGtExpr8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeExpr_in_entryRuleLeExpr8259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeExpr8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleLeExpr8315 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleLeExpr8327 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleLeExpr8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLtExpr_in_entryRuleLtExpr8384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLtExpr8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleLtExpr8440 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleLtExpr8452 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleLtExpr8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeExpr_in_entryRuleNeExpr8509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeExpr8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleNeExpr8565 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleNeExpr8577 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleNeExpr8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_entryRuleCastExpr8634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastExpr8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCastExpr8681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCastExpr8702 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCastExpr8714 = new BitSet(new long[]{0x90000000020100D0L,0x00000000000271DDL});
    public static final BitSet FOLLOW_ruleValue_in_ruleCastExpr8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpr_in_entryRuleInstanceOfExpr8771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceOfExpr8781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleInstanceOfExpr8827 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleInstanceOfExpr8839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceOfExpr8860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSootMethodRef_in_entryRuleSootMethodRef8896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSootMethodRef8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSootMethodRef8943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSootMethodRef8964 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSootMethodRef8976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSootMethodRef8997 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleSootMethodRef9018 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSootMethodRef9030 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSootMethodRef9052 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleSootMethodRef9065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSootMethodRef9086 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_26_in_ruleSootMethodRef9102 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleSootMethodRef9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeExpr_in_entryRuleInvokeExpr9150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokeExpr9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceInvokeExpr_in_ruleInvokeExpr9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticInvokeExpr_in_ruleInvokeExpr9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceInvokeExpr_in_entryRuleInstanceInvokeExpr9275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceInvokeExpr9285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceInvokeExpr_in_ruleInstanceInvokeExpr9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialInvokeExpr_in_ruleInstanceInvokeExpr9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualInvokeExpr_in_ruleInstanceInvokeExpr9395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticInvokeExpr_in_entryRuleStaticInvokeExpr9430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticInvokeExpr9440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStaticInvokeExpr9489 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleSootMethodRef_in_ruleStaticInvokeExpr9510 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStaticInvokeExpr9522 = new BitSet(new long[]{0x10000000040100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleStaticInvokeExpr9544 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleStaticInvokeExpr9557 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleStaticInvokeExpr9578 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_26_in_ruleStaticInvokeExpr9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceInvokeExpr_in_entryRuleInterfaceInvokeExpr9630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceInvokeExpr9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleInterfaceInvokeExpr9677 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocalOrWildcard_in_ruleInterfaceInvokeExpr9698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleInterfaceInvokeExpr9710 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleSootMethodRef_in_ruleInterfaceInvokeExpr9731 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInterfaceInvokeExpr9743 = new BitSet(new long[]{0x10000000040100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleInterfaceInvokeExpr9765 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceInvokeExpr9778 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleInterfaceInvokeExpr9799 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_26_in_ruleInterfaceInvokeExpr9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialInvokeExpr_in_entryRuleSpecialInvokeExpr9851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialInvokeExpr9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSpecialInvokeExpr9898 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocalOrWildcard_in_ruleSpecialInvokeExpr9919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSpecialInvokeExpr9931 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleSootMethodRef_in_ruleSpecialInvokeExpr9952 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSpecialInvokeExpr9964 = new BitSet(new long[]{0x10000000040100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleSpecialInvokeExpr9986 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleSpecialInvokeExpr9999 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleSpecialInvokeExpr10020 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_26_in_ruleSpecialInvokeExpr10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualInvokeExpr_in_entryRuleVirtualInvokeExpr10072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualInvokeExpr10082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleVirtualInvokeExpr10119 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocalOrWildcard_in_ruleVirtualInvokeExpr10140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleVirtualInvokeExpr10152 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleSootMethodRef_in_ruleVirtualInvokeExpr10173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVirtualInvokeExpr10185 = new BitSet(new long[]{0x10000000040100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleVirtualInvokeExpr10207 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20_in_ruleVirtualInvokeExpr10220 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleVirtualInvokeExpr10241 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_26_in_ruleVirtualInvokeExpr10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalOrWildcard_in_entryRuleLocalOrWildcard10293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalOrWildcard10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_ruleLocalOrWildcard10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleLocalOrWildcard10383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard10418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard10428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleWildcard10465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWildcard10482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleWildcard10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewArrayExpr_in_entryRuleNewArrayExpr10535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewArrayExpr10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleNewArrayExpr10582 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNewArrayExpr10594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewArrayExpr10615 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNewArrayExpr10627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleDimension_in_ruleNewArrayExpr10648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpr_in_entryRuleNewExpr10684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewExpr10694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleNewExpr10731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewExpr10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMultiArrayExpr_in_entryRuleNewMultiArrayExpr10788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMultiArrayExpr10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleNewMultiArrayExpr10835 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNewMultiArrayExpr10847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewMultiArrayExpr10868 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNewMultiArrayExpr10880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleDimension_in_ruleNewMultiArrayExpr10901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleNewMultiArrayExpr10920 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDimension_in_entryRuleDimension10970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimension10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDimension11017 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDimension11034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleDimension11051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnopExpr_in_entryRuleUnopExpr11087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnopExpr11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthExpr_in_ruleUnopExpr11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpr_in_ruleUnopExpr11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthExpr_in_entryRuleLengthExpr11212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthExpr11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleLengthExpr11259 = new BitSet(new long[]{0x90000000020100D0L,0x00000000000271DDL});
    public static final BitSet FOLLOW_ruleValue_in_ruleLengthExpr11280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpr_in_entryRuleNegExpr11316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpr11326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleNegExpr11363 = new BitSet(new long[]{0x90000000020100D0L,0x00000000000271DDL});
    public static final BitSet FOLLOW_ruleValue_in_ruleNegExpr11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_entryRuleLocal11420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocal11430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocal11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef11511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef11521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteRef_in_ruleRef11571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentityRef_in_ruleRef11601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalOrWildcard_in_ruleRef11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentityRef_in_entryRuleIdentityRef11666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentityRef11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterRef_in_ruleIdentityRef11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisRef_in_ruleIdentityRef11756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaughtExceptionRef_in_ruleIdentityRef11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterRef_in_entryRuleParameterRef11821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterRef11831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleParameterRef11868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterRef11885 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParameterRef11902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParameterRef11923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisRef_in_entryRuleThisRef11959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThisRef11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleThisRef12006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleThisRef12018 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleThisRef12030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleThisRef12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaughtExceptionRef_in_entryRuleCaughtExceptionRef12087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaughtExceptionRef12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCaughtExceptionRef12146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleCaughtExceptionRef12158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteRef_in_entryRuleConcreteRef12194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteRef12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayRef_in_ruleConcreteRef12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldRef_in_ruleConcreteRef12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayRef_in_entryRuleArrayRef12319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayRef12329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalOrWildcard_in_ruleArrayRef12375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleArrayRef12387 = new BitSet(new long[]{0x10000000000100D0L,0x0000000000024010L});
    public static final BitSet FOLLOW_ruleNonExpr_in_ruleArrayRef12408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleArrayRef12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldRef_in_entryRuleFieldRef12456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldRef12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticFieldRef_in_ruleFieldRef12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceFieldRef_in_ruleFieldRef12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticFieldRef_in_entryRuleStaticFieldRef12581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticFieldRef12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSootFieldRef_in_ruleStaticFieldRef12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSootFieldRef_in_entryRuleSootFieldRef12671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSootFieldRef12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSootFieldRef12718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSootFieldRef12739 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSootFieldRef12751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSootFieldRef12772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSootFieldRef12789 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleSootFieldRef12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceFieldRef_in_entryRuleInstanceFieldRef12842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceFieldRef12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalOrWildcard_in_ruleInstanceFieldRef12898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleInstanceFieldRef12910 = new BitSet(new long[]{0x1000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldRef_in_ruleInstanceFieldRef12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant12967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant12977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassConstant_in_ruleConstant13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullConstant_in_ruleConstant13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericConstant_in_ruleConstant13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_ruleConstant13117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassConstant_in_entryRuleClassConstant13152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassConstant13162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleClassConstant13199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClassConstant13220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullConstant_in_entryRuleNullConstant13256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullConstant13266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleNullConstant13315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericConstant_in_entryRuleNumericConstant13351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericConstant13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstant_in_ruleNumericConstant13411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongConstant_in_ruleNumericConstant13441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleConstant_in_ruleNumericConstant13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatConstant_in_ruleNumericConstant13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstant_in_entryRuleIntConstant13536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntConstant13546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntConstant13587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongConstant_in_entryRuleLongConstant13627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongConstant13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLongConstant13679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleLongConstant13696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleConstant_in_entryRuleDoubleConstant13732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleConstant13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDoubleConstant13784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleDoubleConstant13801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatConstant_in_entryRuleFloatConstant13837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatConstant13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloatConstant13889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleFloatConstant13906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_entryRuleStringConstant13942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstant13952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstant13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName14036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName14047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMethodName14086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodName14103 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMethodName14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName14176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQualifiedName14235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleVisibility14311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleVisibility14328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleVisibility14345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleVisibility14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_synpred17_InternalTransformationLanguage1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpr_in_synpred36_InternalTransformationLanguage4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOpExpr_in_synpred39_InternalTransformationLanguage5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpr_in_synpred41_InternalTransformationLanguage5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpr_in_synpred45_InternalTransformationLanguage5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_synpred46_InternalTransformationLanguage5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpExpr_in_synpred47_InternalTransformationLanguage5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpgExpr_in_synpred48_InternalTransformationLanguage5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmplExpr_in_synpred49_InternalTransformationLanguage5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpr_in_synpred50_InternalTransformationLanguage5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpr_in_synpred51_InternalTransformationLanguage5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulExpr_in_synpred52_InternalTransformationLanguage5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_synpred53_InternalTransformationLanguage5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemExpr_in_synpred54_InternalTransformationLanguage5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShlExpr_in_synpred55_InternalTransformationLanguage5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShrExpr_in_synpred56_InternalTransformationLanguage5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpr_in_synpred57_InternalTransformationLanguage5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUshrExpr_in_synpred58_InternalTransformationLanguage5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqExpr_in_synpred59_InternalTransformationLanguage6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeExpr_in_synpred60_InternalTransformationLanguage6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGtExpr_in_synpred61_InternalTransformationLanguage6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeExpr_in_synpred62_InternalTransformationLanguage6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLtExpr_in_synpred63_InternalTransformationLanguage6694 = new BitSet(new long[]{0x0000000000000002L});

}