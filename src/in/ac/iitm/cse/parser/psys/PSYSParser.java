// $ANTLR 3.5.2 PSYS.g 2022-04-06 16:37:42

package in.ac.iitm.cse.parser.psys;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PSYSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ACTIONS", "ADD", "AND", 
		"ATTRIBUTE", "B", "C", "COMMENT", "CONDITIONS", "CONSTANT", "D", "DIV", 
		"E", "EQ", "ESC_SEQ", "EXPONENT", "F", "FALSE", "FLOAT", "G", "GE", "GT", 
		"H", "HEX_DIGIT", "I", "IF", "INSERT", "INTEGER", "J", "K", "L", "LE", 
		"LT", "M", "MOD", "MODIFY", "MUL", "N", "NAME", "NE", "NEG", "NOT", "O", 
		"OCTAL_ESC", "OR", "P", "PROGRAM", "Q", "R", "REMOVE", "S", "STRING", 
		"SUB", "T", "THEN", "TRUE", "TYPE", "U", "UNICODE_ESC", "V", "VARIABLE", 
		"W", "WME", "WS", "X", "Y", "Z", "'!='", "'%'", "'&&'", "'&'", "'('", 
		"')'", "'*'", "'+'", "'-'", "'/'", "':'", "'<'", "'<='", "'<>'", "'='", 
		"'>'", "'>='", "'['", "']'", "'{'", "'|'", "'||'", "'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int A=4;
	public static final int ACTIONS=5;
	public static final int ADD=6;
	public static final int AND=7;
	public static final int ATTRIBUTE=8;
	public static final int B=9;
	public static final int C=10;
	public static final int COMMENT=11;
	public static final int CONDITIONS=12;
	public static final int CONSTANT=13;
	public static final int D=14;
	public static final int DIV=15;
	public static final int E=16;
	public static final int EQ=17;
	public static final int ESC_SEQ=18;
	public static final int EXPONENT=19;
	public static final int F=20;
	public static final int FALSE=21;
	public static final int FLOAT=22;
	public static final int G=23;
	public static final int GE=24;
	public static final int GT=25;
	public static final int H=26;
	public static final int HEX_DIGIT=27;
	public static final int I=28;
	public static final int IF=29;
	public static final int INSERT=30;
	public static final int INTEGER=31;
	public static final int J=32;
	public static final int K=33;
	public static final int L=34;
	public static final int LE=35;
	public static final int LT=36;
	public static final int M=37;
	public static final int MOD=38;
	public static final int MODIFY=39;
	public static final int MUL=40;
	public static final int N=41;
	public static final int NAME=42;
	public static final int NE=43;
	public static final int NEG=44;
	public static final int NOT=45;
	public static final int O=46;
	public static final int OCTAL_ESC=47;
	public static final int OR=48;
	public static final int P=49;
	public static final int PROGRAM=50;
	public static final int Q=51;
	public static final int R=52;
	public static final int REMOVE=53;
	public static final int S=54;
	public static final int STRING=55;
	public static final int SUB=56;
	public static final int T=57;
	public static final int THEN=58;
	public static final int TRUE=59;
	public static final int TYPE=60;
	public static final int U=61;
	public static final int UNICODE_ESC=62;
	public static final int V=63;
	public static final int VARIABLE=64;
	public static final int W=65;
	public static final int WME=66;
	public static final int WS=67;
	public static final int X=68;
	public static final int Y=69;
	public static final int Z=70;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PSYSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PSYSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PSYSParser.tokenNames; }
	@Override public String getGrammarFileName() { return "PSYS.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }

	    private Token curAttribute=null;
	    private AST curAttrTree() {
	        return (AST) adaptor.create(curAttribute);
	    }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// PSYS.g:132:1
	public final PSYSParser.cunit_return cunit() throws RecognitionException {
		PSYSParser.cunit_return retval = new PSYSParser.cunit_return();
		retval.start = input.LT(1);
		int cunit_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope sentence1 =null;

		RewriteRuleSubtreeStream stream_sentence=new RewriteRuleSubtreeStream(adaptor,"rule sentence");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// PSYS.g:132:13
			// PSYS.g:132:17
			{
			// PSYS.g:132:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IF||LA1_0==75) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// PSYS.g:132:17
					{
					pushFollow(FOLLOW_sentence_in_cunit203);
					sentence1=sentence();
					state._fsp--;

					stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: sentence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 132:27: -> ^( PROGRAM ( sentence )* )
			{
				// PSYS.g:132:30
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// PSYS.g:132:40
				while ( stream_sentence.hasNext() ) {
					adaptor.addChild(root_1, stream_sentence.nextTree());
				}
				stream_sentence.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cunit"


	public static class sentence_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "sentence"
	// PSYS.g:133:1
	public final PSYSParser.sentence_return sentence() throws RecognitionException {
		PSYSParser.sentence_return retval = new PSYSParser.sentence_return();
		retval.start = input.LT(1);
		int sentence_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope rule2 =null;
		ParserRuleReturnScope wme3 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// PSYS.g:133:13
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==IF) ) {
				alt2=1;
			}
			else if ( (LA2_0==75) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// PSYS.g:133:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_rule_in_sentence226);
					rule2=rule();
					state._fsp--;

					adaptor.addChild(root_0, rule2.getTree());

					}
					break;
				case 2 :
					// PSYS.g:133:24
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_wme_in_sentence230);
					wme3=wme();
					state._fsp--;

					adaptor.addChild(root_0, wme3.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sentence"


	public static class rule_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "rule"
	// PSYS.g:135:1
	public final PSYSParser.rule_return rule() throws RecognitionException {
		PSYSParser.rule_return retval = new PSYSParser.rule_return();
		retval.start = input.LT(1);
		int rule_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token THEN5=null;
		ParserRuleReturnScope conditions4 =null;
		ParserRuleReturnScope actions6 =null;

		AST t_tree=null;
		AST THEN5_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// PSYS.g:135:13
			// PSYS.g:135:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,IF,FOLLOW_IF_in_rule250); 
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

			pushFollow(FOLLOW_conditions_in_rule253);
			conditions4=conditions();
			state._fsp--;

			adaptor.addChild(root_0, conditions4.getTree());

			THEN5=(Token)match(input,THEN,FOLLOW_THEN_in_rule255); 
			pushFollow(FOLLOW_actions_in_rule258);
			actions6=actions();
			state._fsp--;

			adaptor.addChild(root_0, actions6.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rule"


	public static class conditions_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "conditions"
	// PSYS.g:137:1
	public final PSYSParser.conditions_return conditions() throws RecognitionException {
		PSYSParser.conditions_return retval = new PSYSParser.conditions_return();
		retval.start = input.LT(1);
		int conditions_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope condition7 =null;

		RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// PSYS.g:137:13
			// PSYS.g:137:17
			{
			// PSYS.g:137:17
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==75||LA3_0==79) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// PSYS.g:137:17
					{
					pushFollow(FOLLOW_condition_in_conditions270);
					condition7=condition();
					state._fsp--;

					stream_condition.add(condition7.getTree());
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// AST REWRITE
			// elements: condition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 137:29: -> ^( CONDITIONS ( condition )+ )
			{
				// PSYS.g:137:32
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITIONS, "CONDITIONS"), root_1);
				if ( !(stream_condition.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_condition.hasNext() ) {
					adaptor.addChild(root_1, stream_condition.nextTree());
				}
				stream_condition.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditions"


	public static class actions_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "actions"
	// PSYS.g:138:1
	public final PSYSParser.actions_return actions() throws RecognitionException {
		PSYSParser.actions_return retval = new PSYSParser.actions_return();
		retval.start = input.LT(1);
		int actions_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope action8 =null;

		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// PSYS.g:138:13
			// PSYS.g:138:17
			{
			// PSYS.g:138:17
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADD||LA4_0==INSERT||LA4_0==MODIFY||LA4_0==REMOVE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// PSYS.g:138:17
					{
					pushFollow(FOLLOW_action_in_actions295);
					action8=action();
					state._fsp--;

					stream_action.add(action8.getTree());
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			// AST REWRITE
			// elements: action
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 138:29: -> ^( ACTIONS ( action )+ )
			{
				// PSYS.g:138:32
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(ACTIONS, "ACTIONS"), root_1);
				if ( !(stream_action.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_action.hasNext() ) {
					adaptor.addChild(root_1, stream_action.nextTree());
				}
				stream_action.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actions"


	public static class condition_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// PSYS.g:140:1
	public final PSYSParser.condition_return condition() throws RecognitionException {
		PSYSParser.condition_return retval = new PSYSParser.condition_return();
		retval.start = input.LT(1);
		int condition_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope wme9 =null;
		ParserRuleReturnScope wme10 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// PSYS.g:140:13
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==75) ) {
				alt5=1;
			}
			else if ( (LA5_0==79) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// PSYS.g:140:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_wme_in_condition322);
					wme9=wme();
					state._fsp--;

					adaptor.addChild(root_0, wme9.getTree());

					}
					break;
				case 2 :
					// PSYS.g:141:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,79,FOLLOW_79_in_condition342); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					pushFollow(FOLLOW_wme_in_condition345);
					wme10=wme();
					state._fsp--;

					adaptor.addChild(root_0, wme10.getTree());

					 setType(t,NOT); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class action_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "action"
	// PSYS.g:144:1
	public final PSYSParser.action_return action() throws RecognitionException {
		PSYSParser.action_return retval = new PSYSParser.action_return();
		retval.start = input.LT(1);
		int action_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token INSERT12=null;
		Token REMOVE14=null;
		Token INTEGER15=null;
		Token MODIFY16=null;
		Token INTEGER17=null;
		Token char_literal18=null;
		Token char_literal21=null;
		ParserRuleReturnScope wme11 =null;
		ParserRuleReturnScope wme13 =null;
		ParserRuleReturnScope attr19 =null;
		ParserRuleReturnScope spec20 =null;

		AST t_tree=null;
		AST INSERT12_tree=null;
		AST REMOVE14_tree=null;
		AST INTEGER15_tree=null;
		AST MODIFY16_tree=null;
		AST INTEGER17_tree=null;
		AST char_literal18_tree=null;
		AST char_literal21_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// PSYS.g:144:13
			int alt6=4;
			switch ( input.LA(1) ) {
			case ADD:
				{
				alt6=1;
				}
				break;
			case INSERT:
				{
				alt6=2;
				}
				break;
			case REMOVE:
				{
				alt6=3;
				}
				break;
			case MODIFY:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// PSYS.g:144:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,ADD,FOLLOW_ADD_in_action377); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,INSERT); 
					pushFollow(FOLLOW_wme_in_action383);
					wme11=wme();
					state._fsp--;

					adaptor.addChild(root_0, wme11.getTree());

					}
					break;
				case 2 :
					// PSYS.g:145:17
					{
					root_0 = (AST)adaptor.nil();


					INSERT12=(Token)match(input,INSERT,FOLLOW_INSERT_in_action401); 
					INSERT12_tree = (AST)adaptor.create(INSERT12);
					root_0 = (AST)adaptor.becomeRoot(INSERT12_tree, root_0);

					pushFollow(FOLLOW_wme_in_action404);
					wme13=wme();
					state._fsp--;

					adaptor.addChild(root_0, wme13.getTree());

					}
					break;
				case 3 :
					// PSYS.g:146:17
					{
					root_0 = (AST)adaptor.nil();


					REMOVE14=(Token)match(input,REMOVE,FOLLOW_REMOVE_in_action422); 
					REMOVE14_tree = (AST)adaptor.create(REMOVE14);
					root_0 = (AST)adaptor.becomeRoot(REMOVE14_tree, root_0);

					INTEGER15=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_action425); 
					INTEGER15_tree = (AST)adaptor.create(INTEGER15);
					adaptor.addChild(root_0, INTEGER15_tree);

					}
					break;
				case 4 :
					// PSYS.g:147:17
					{
					root_0 = (AST)adaptor.nil();


					MODIFY16=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_action443); 
					MODIFY16_tree = (AST)adaptor.create(MODIFY16);
					root_0 = (AST)adaptor.becomeRoot(MODIFY16_tree, root_0);

					INTEGER17=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_action446); 
					INTEGER17_tree = (AST)adaptor.create(INTEGER17);
					adaptor.addChild(root_0, INTEGER17_tree);

					char_literal18=(Token)match(input,75,FOLLOW_75_in_action448); 
					pushFollow(FOLLOW_attr_in_action451);
					attr19=attr();
					state._fsp--;

					adaptor.addChild(root_0, attr19.getTree());

					pushFollow(FOLLOW_spec_in_action453);
					spec20=spec();
					state._fsp--;

					adaptor.addChild(root_0, spec20.getTree());

					char_literal21=(Token)match(input,76,FOLLOW_76_in_action455); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class wme_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "wme"
	// PSYS.g:150:1
	public final PSYSParser.wme_return wme() throws RecognitionException {
		PSYSParser.wme_return retval = new PSYSParser.wme_return();
		retval.start = input.LT(1);
		int wme_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal24=null;
		ParserRuleReturnScope type22 =null;
		ParserRuleReturnScope attrSpec23 =null;

		AST t_tree=null;
		AST char_literal24_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// PSYS.g:150:13
			// PSYS.g:150:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,75,FOLLOW_75_in_wme489); 
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

			 setType(t,WME); 
			pushFollow(FOLLOW_type_in_wme494);
			type22=type();
			state._fsp--;

			adaptor.addChild(root_0, type22.getTree());

			// PSYS.g:150:50
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==NAME) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// PSYS.g:150:50
					{
					pushFollow(FOLLOW_attrSpec_in_wme496);
					attrSpec23=attrSpec();
					state._fsp--;

					adaptor.addChild(root_0, attrSpec23.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			char_literal24=(Token)match(input,76,FOLLOW_76_in_wme499); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "wme"


	public static class attrSpec_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "attrSpec"
	// PSYS.g:151:1
	public final PSYSParser.attrSpec_return attrSpec() throws RecognitionException {
		PSYSParser.attrSpec_return retval = new PSYSParser.attrSpec_return();
		retval.start = input.LT(1);
		int attrSpec_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal26=null;
		ParserRuleReturnScope attr25 =null;
		ParserRuleReturnScope spec27 =null;

		AST char_literal26_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// PSYS.g:151:13
			// PSYS.g:151:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_attr_in_attrSpec513);
			attr25=attr();
			state._fsp--;

			root_0 = (AST)adaptor.becomeRoot(attr25.getTree(), root_0);
			char_literal26=(Token)match(input,81,FOLLOW_81_in_attrSpec516); 
			pushFollow(FOLLOW_spec_in_attrSpec519);
			spec27=spec();
			state._fsp--;

			adaptor.addChild(root_0, spec27.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attrSpec"


	public static class spec_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "spec"
	// PSYS.g:152:1
	public final PSYSParser.spec_return spec() throws RecognitionException {
		PSYSParser.spec_return retval = new PSYSParser.spec_return();
		retval.start = input.LT(1);
		int spec_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal29=null;
		Token char_literal31=null;
		Token char_literal32=null;
		Token char_literal34=null;
		ParserRuleReturnScope atom28 =null;
		ParserRuleReturnScope testExpr30 =null;
		ParserRuleReturnScope evalExpr33 =null;

		AST char_literal29_tree=null;
		AST char_literal31_tree=null;
		AST char_literal32_tree=null;
		AST char_literal34_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// PSYS.g:152:13
			int alt8=3;
			switch ( input.LA(1) ) {
			case FALSE:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING:
			case TRUE:
			case VARIABLE:
				{
				alt8=1;
				}
				break;
			case 90:
				{
				alt8=2;
				}
				break;
			case 88:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// PSYS.g:152:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_spec536);
					atom28=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom28.getTree());

					}
					break;
				case 2 :
					// PSYS.g:153:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal29=(Token)match(input,90,FOLLOW_90_in_spec554); 
					pushFollow(FOLLOW_testExpr_in_spec557);
					testExpr30=testExpr();
					state._fsp--;

					adaptor.addChild(root_0, testExpr30.getTree());

					char_literal31=(Token)match(input,93,FOLLOW_93_in_spec559); 
					}
					break;
				case 3 :
					// PSYS.g:154:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal32=(Token)match(input,88,FOLLOW_88_in_spec578); 
					pushFollow(FOLLOW_evalExpr_in_spec581);
					evalExpr33=evalExpr();
					state._fsp--;

					adaptor.addChild(root_0, evalExpr33.getTree());

					char_literal34=(Token)match(input,89,FOLLOW_89_in_spec583); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "spec"


	public static class testExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "testExpr"
	// PSYS.g:157:1
	public final PSYSParser.testExpr_return testExpr() throws RecognitionException {
		PSYSParser.testExpr_return retval = new PSYSParser.testExpr_return();
		retval.start = input.LT(1);
		int testExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope andExpr35 =null;
		ParserRuleReturnScope bopr336 =null;
		ParserRuleReturnScope andExpr37 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// PSYS.g:157:13
			// PSYS.g:157:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_testExpr610);
			andExpr35=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr35.getTree());

			// PSYS.g:157:26
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==OR||(LA9_0 >= 91 && LA9_0 <= 92)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// PSYS.g:157:27
					{
					pushFollow(FOLLOW_bopr3_in_testExpr614);
					bopr336=bopr3();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(bopr336.getTree(), root_0);
					pushFollow(FOLLOW_andExpr_in_testExpr617);
					andExpr37=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr37.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "testExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// PSYS.g:158:1
	public final PSYSParser.andExpr_return andExpr() throws RecognitionException {
		PSYSParser.andExpr_return retval = new PSYSParser.andExpr_return();
		retval.start = input.LT(1);
		int andExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope testAtom38 =null;
		ParserRuleReturnScope bopr439 =null;
		ParserRuleReturnScope testAtom40 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// PSYS.g:158:13
			// PSYS.g:158:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_testAtom_in_andExpr633);
			testAtom38=testAtom();
			state._fsp--;

			adaptor.addChild(root_0, testAtom38.getTree());

			// PSYS.g:158:26
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==AND||(LA10_0 >= 73 && LA10_0 <= 74)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// PSYS.g:158:27
					{
					pushFollow(FOLLOW_bopr4_in_andExpr636);
					bopr439=bopr4();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(bopr439.getTree(), root_0);
					pushFollow(FOLLOW_testAtom_in_andExpr639);
					testAtom40=testAtom();
					state._fsp--;

					adaptor.addChild(root_0, testAtom40.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class testAtom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "testAtom"
	// PSYS.g:159:1
	public final PSYSParser.testAtom_return testAtom() throws RecognitionException {
		PSYSParser.testAtom_return retval = new PSYSParser.testAtom_return();
		retval.start = input.LT(1);
		int testAtom_StartIndex = input.index();

		AST root_0 = null;

		Token TRUE41=null;
		Token FALSE42=null;
		Token char_literal47=null;
		Token char_literal49=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token char_literal55=null;
		Token char_literal57=null;
		ParserRuleReturnScope atom43 =null;
		ParserRuleReturnScope copr44 =null;
		ParserRuleReturnScope copr45 =null;
		ParserRuleReturnScope atom46 =null;
		ParserRuleReturnScope evalExpr48 =null;
		ParserRuleReturnScope copr50 =null;
		ParserRuleReturnScope copr51 =null;
		ParserRuleReturnScope evalExpr53 =null;
		ParserRuleReturnScope testExpr56 =null;
		ParserRuleReturnScope bopr558 =null;
		ParserRuleReturnScope testAtom59 =null;

		AST TRUE41_tree=null;
		AST FALSE42_tree=null;
		AST char_literal47_tree=null;
		AST char_literal49_tree=null;
		AST char_literal52_tree=null;
		AST char_literal54_tree=null;
		AST char_literal55_tree=null;
		AST char_literal57_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleSubtreeStream stream_copr=new RewriteRuleSubtreeStream(adaptor,"rule copr");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
		RewriteRuleSubtreeStream stream_evalExpr=new RewriteRuleSubtreeStream(adaptor,"rule evalExpr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// PSYS.g:161:13
			int alt11=8;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// PSYS.g:161:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE41=(Token)match(input,TRUE,FOLLOW_TRUE_in_testAtom670); 
					TRUE41_tree = (AST)adaptor.create(TRUE41);
					adaptor.addChild(root_0, TRUE41_tree);

					}
					break;
				case 2 :
					// PSYS.g:162:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE42=(Token)match(input,FALSE,FOLLOW_FALSE_in_testAtom688); 
					FALSE42_tree = (AST)adaptor.create(FALSE42);
					adaptor.addChild(root_0, FALSE42_tree);

					}
					break;
				case 3 :
					// PSYS.g:163:17
					{
					pushFollow(FOLLOW_atom_in_testAtom706);
					atom43=atom();
					state._fsp--;

					stream_atom.add(atom43.getTree());
					pushFollow(FOLLOW_copr_in_testAtom708);
					copr44=copr();
					state._fsp--;

					stream_copr.add(copr44.getTree());
					// AST REWRITE
					// elements: copr, atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 163:41: -> ^( copr atom )
					{
						// PSYS.g:163:44
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_copr.nextNode(), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_1, curAttrTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// PSYS.g:164:17
					{
					pushFollow(FOLLOW_copr_in_testAtom755);
					copr45=copr();
					state._fsp--;

					stream_copr.add(copr45.getTree());
					pushFollow(FOLLOW_atom_in_testAtom757);
					atom46=atom();
					state._fsp--;

					stream_atom.add(atom46.getTree());
					// AST REWRITE
					// elements: copr, atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 164:41: -> ^( copr atom )
					{
						// PSYS.g:164:44
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_copr.nextNode(), root_1);
						adaptor.addChild(root_1, curAttrTree());
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// PSYS.g:165:17
					{
					char_literal47=(Token)match(input,88,FOLLOW_88_in_testAtom804);  
					stream_88.add(char_literal47);

					pushFollow(FOLLOW_evalExpr_in_testAtom806);
					evalExpr48=evalExpr();
					state._fsp--;

					stream_evalExpr.add(evalExpr48.getTree());
					char_literal49=(Token)match(input,89,FOLLOW_89_in_testAtom808);  
					stream_89.add(char_literal49);

					pushFollow(FOLLOW_copr_in_testAtom810);
					copr50=copr();
					state._fsp--;

					stream_copr.add(copr50.getTree());
					// AST REWRITE
					// elements: copr, evalExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 165:41: -> ^( copr evalExpr )
					{
						// PSYS.g:165:44
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_copr.nextNode(), root_1);
						adaptor.addChild(root_1, stream_evalExpr.nextTree());
						adaptor.addChild(root_1, curAttrTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// PSYS.g:166:17
					{
					pushFollow(FOLLOW_copr_in_testAtom841);
					copr51=copr();
					state._fsp--;

					stream_copr.add(copr51.getTree());
					char_literal52=(Token)match(input,88,FOLLOW_88_in_testAtom843);  
					stream_88.add(char_literal52);

					pushFollow(FOLLOW_evalExpr_in_testAtom845);
					evalExpr53=evalExpr();
					state._fsp--;

					stream_evalExpr.add(evalExpr53.getTree());
					char_literal54=(Token)match(input,89,FOLLOW_89_in_testAtom847);  
					stream_89.add(char_literal54);

					// AST REWRITE
					// elements: evalExpr, copr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 166:41: -> ^( copr evalExpr )
					{
						// PSYS.g:166:44
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_copr.nextNode(), root_1);
						adaptor.addChild(root_1, curAttrTree());
						adaptor.addChild(root_1, stream_evalExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// PSYS.g:167:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal55=(Token)match(input,75,FOLLOW_75_in_testAtom878); 
					pushFollow(FOLLOW_testExpr_in_testAtom881);
					testExpr56=testExpr();
					state._fsp--;

					adaptor.addChild(root_0, testExpr56.getTree());

					char_literal57=(Token)match(input,76,FOLLOW_76_in_testAtom883); 
					}
					break;
				case 8 :
					// PSYS.g:168:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_bopr5_in_testAtom902);
					bopr558=bopr5();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(bopr558.getTree(), root_0);
					pushFollow(FOLLOW_testAtom_in_testAtom905);
					testAtom59=testAtom();
					state._fsp--;

					adaptor.addChild(root_0, testAtom59.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "testAtom"


	public static class evalExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "evalExpr"
	// PSYS.g:171:1
	public final PSYSParser.evalExpr_return evalExpr() throws RecognitionException {
		PSYSParser.evalExpr_return retval = new PSYSParser.evalExpr_return();
		retval.start = input.LT(1);
		int evalExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulExpr60 =null;
		ParserRuleReturnScope opr161 =null;
		ParserRuleReturnScope mulExpr62 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// PSYS.g:171:13
			// PSYS.g:171:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_evalExpr940);
			mulExpr60=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr60.getTree());

			// PSYS.g:171:25
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= 78 && LA12_0 <= 79)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// PSYS.g:171:27
					{
					pushFollow(FOLLOW_opr1_in_evalExpr944);
					opr161=opr1();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr161.getTree(), root_0);
					pushFollow(FOLLOW_mulExpr_in_evalExpr947);
					mulExpr62=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr62.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "evalExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// PSYS.g:172:1
	public final PSYSParser.mulExpr_return mulExpr() throws RecognitionException {
		PSYSParser.mulExpr_return retval = new PSYSParser.mulExpr_return();
		retval.start = input.LT(1);
		int mulExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negExpr63 =null;
		ParserRuleReturnScope opr264 =null;
		ParserRuleReturnScope negExpr65 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// PSYS.g:172:13
			// PSYS.g:172:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negExpr_in_mulExpr964);
			negExpr63=negExpr();
			state._fsp--;

			adaptor.addChild(root_0, negExpr63.getTree());

			// PSYS.g:172:25
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==72||LA13_0==77||LA13_0==80) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// PSYS.g:172:27
					{
					pushFollow(FOLLOW_opr2_in_mulExpr968);
					opr264=opr2();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr264.getTree(), root_0);
					pushFollow(FOLLOW_negExpr_in_mulExpr971);
					negExpr65=negExpr();
					state._fsp--;

					adaptor.addChild(root_0, negExpr65.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class negExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "negExpr"
	// PSYS.g:173:1
	public final PSYSParser.negExpr_return negExpr() throws RecognitionException {
		PSYSParser.negExpr_return retval = new PSYSParser.negExpr_return();
		retval.start = input.LT(1);
		int negExpr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope evalAtom66 =null;
		ParserRuleReturnScope evalAtom67 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// PSYS.g:173:13
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= FALSE && LA14_0 <= FLOAT)||LA14_0==INTEGER||LA14_0==NAME||LA14_0==STRING||LA14_0==TRUE||LA14_0==VARIABLE||LA14_0==75) ) {
				alt14=1;
			}
			else if ( (LA14_0==79) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// PSYS.g:173:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_evalAtom_in_negExpr988);
					evalAtom66=evalAtom();
					state._fsp--;

					adaptor.addChild(root_0, evalAtom66.getTree());

					}
					break;
				case 2 :
					// PSYS.g:174:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,79,FOLLOW_79_in_negExpr1008); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,NEG); 
					pushFollow(FOLLOW_evalAtom_in_negExpr1013);
					evalAtom67=evalAtom();
					state._fsp--;

					adaptor.addChild(root_0, evalAtom67.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negExpr"


	public static class evalAtom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "evalAtom"
	// PSYS.g:176:1
	public final PSYSParser.evalAtom_return evalAtom() throws RecognitionException {
		PSYSParser.evalAtom_return retval = new PSYSParser.evalAtom_return();
		retval.start = input.LT(1);
		int evalAtom_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal69=null;
		Token char_literal71=null;
		ParserRuleReturnScope atom68 =null;
		ParserRuleReturnScope evalExpr70 =null;

		AST char_literal69_tree=null;
		AST char_literal71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// PSYS.g:176:13
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= FALSE && LA15_0 <= FLOAT)||LA15_0==INTEGER||LA15_0==NAME||LA15_0==STRING||LA15_0==TRUE||LA15_0==VARIABLE) ) {
				alt15=1;
			}
			else if ( (LA15_0==75) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// PSYS.g:176:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_evalAtom1038);
					atom68=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom68.getTree());

					}
					break;
				case 2 :
					// PSYS.g:177:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal69=(Token)match(input,75,FOLLOW_75_in_evalAtom1056); 
					pushFollow(FOLLOW_evalExpr_in_evalAtom1059);
					evalExpr70=evalExpr();
					state._fsp--;

					adaptor.addChild(root_0, evalExpr70.getTree());

					char_literal71=(Token)match(input,76,FOLLOW_76_in_evalAtom1061); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "evalAtom"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// PSYS.g:180:1
	public final PSYSParser.atom_return atom() throws RecognitionException {
		PSYSParser.atom_return retval = new PSYSParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token TRUE72=null;
		Token FALSE73=null;
		Token INTEGER74=null;
		Token FLOAT75=null;
		Token STRING76=null;
		Token VARIABLE77=null;

		AST t_tree=null;
		AST TRUE72_tree=null;
		AST FALSE73_tree=null;
		AST INTEGER74_tree=null;
		AST FLOAT75_tree=null;
		AST STRING76_tree=null;
		AST VARIABLE77_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// PSYS.g:180:13
			int alt16=7;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt16=1;
				}
				break;
			case FALSE:
				{
				alt16=2;
				}
				break;
			case INTEGER:
				{
				alt16=3;
				}
				break;
			case FLOAT:
				{
				alt16=4;
				}
				break;
			case STRING:
				{
				alt16=5;
				}
				break;
			case NAME:
				{
				alt16=6;
				}
				break;
			case VARIABLE:
				{
				alt16=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// PSYS.g:180:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE72=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1092); 
					TRUE72_tree = (AST)adaptor.create(TRUE72);
					adaptor.addChild(root_0, TRUE72_tree);

					}
					break;
				case 2 :
					// PSYS.g:181:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE73=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1110); 
					FALSE73_tree = (AST)adaptor.create(FALSE73);
					adaptor.addChild(root_0, FALSE73_tree);

					}
					break;
				case 3 :
					// PSYS.g:182:17
					{
					root_0 = (AST)adaptor.nil();


					INTEGER74=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom1128); 
					INTEGER74_tree = (AST)adaptor.create(INTEGER74);
					adaptor.addChild(root_0, INTEGER74_tree);

					}
					break;
				case 4 :
					// PSYS.g:183:17
					{
					root_0 = (AST)adaptor.nil();


					FLOAT75=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom1146); 
					FLOAT75_tree = (AST)adaptor.create(FLOAT75);
					adaptor.addChild(root_0, FLOAT75_tree);

					}
					break;
				case 5 :
					// PSYS.g:184:17
					{
					root_0 = (AST)adaptor.nil();


					STRING76=(Token)match(input,STRING,FOLLOW_STRING_in_atom1164); 
					STRING76_tree = (AST)adaptor.create(STRING76);
					adaptor.addChild(root_0, STRING76_tree);

					}
					break;
				case 6 :
					// PSYS.g:185:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atom1184); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,CONSTANT); 
					}
					break;
				case 7 :
					// PSYS.g:186:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE77=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atom1204); 
					VARIABLE77_tree = (AST)adaptor.create(VARIABLE77);
					adaptor.addChild(root_0, VARIABLE77_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class type_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "type"
	// PSYS.g:189:1
	public final PSYSParser.type_return type() throws RecognitionException {
		PSYSParser.type_return retval = new PSYSParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// PSYS.g:189:13
			// PSYS.g:189:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_type1236); 
			t_tree = (AST)adaptor.create(t);
			adaptor.addChild(root_0, t_tree);

			 setType(t,TYPE); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class attr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "attr"
	// PSYS.g:190:1
	public final PSYSParser.attr_return attr() throws RecognitionException {
		PSYSParser.attr_return retval = new PSYSParser.attr_return();
		retval.start = input.LT(1);
		int attr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// PSYS.g:190:13
			// PSYS.g:190:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_attr1257); 
			t_tree = (AST)adaptor.create(t);
			adaptor.addChild(root_0, t_tree);

			 setType(t,ATTRIBUTE); 
			 curAttribute=t; 
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attr"


	public static class bopr3_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bopr3"
	// PSYS.g:192:1
	public final PSYSParser.bopr3_return bopr3() throws RecognitionException {
		PSYSParser.bopr3_return retval = new PSYSParser.bopr3_return();
		retval.start = input.LT(1);
		int bopr3_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token OR78=null;

		AST t_tree=null;
		AST OR78_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// PSYS.g:192:13
			int alt17=3;
			switch ( input.LA(1) ) {
			case OR:
				{
				alt17=1;
				}
				break;
			case 92:
				{
				alt17=2;
				}
				break;
			case 91:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// PSYS.g:192:17
					{
					root_0 = (AST)adaptor.nil();


					OR78=(Token)match(input,OR,FOLLOW_OR_in_bopr31278); 
					OR78_tree = (AST)adaptor.create(OR78);
					adaptor.addChild(root_0, OR78_tree);

					}
					break;
				case 2 :
					// PSYS.g:193:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,92,FOLLOW_92_in_bopr31298); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,OR); 
					}
					break;
				case 3 :
					// PSYS.g:194:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,91,FOLLOW_91_in_bopr31325); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,OR); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bopr3"


	public static class bopr4_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bopr4"
	// PSYS.g:197:1
	public final PSYSParser.bopr4_return bopr4() throws RecognitionException {
		PSYSParser.bopr4_return retval = new PSYSParser.bopr4_return();
		retval.start = input.LT(1);
		int bopr4_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token AND79=null;

		AST t_tree=null;
		AST AND79_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// PSYS.g:197:13
			int alt18=3;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt18=1;
				}
				break;
			case 73:
				{
				alt18=2;
				}
				break;
			case 74:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// PSYS.g:197:17
					{
					root_0 = (AST)adaptor.nil();


					AND79=(Token)match(input,AND,FOLLOW_AND_in_bopr41362); 
					AND79_tree = (AST)adaptor.create(AND79);
					adaptor.addChild(root_0, AND79_tree);

					}
					break;
				case 2 :
					// PSYS.g:198:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,73,FOLLOW_73_in_bopr41382); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,AND); 
					}
					break;
				case 3 :
					// PSYS.g:199:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,74,FOLLOW_74_in_bopr41409); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,AND); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bopr4"


	public static class bopr5_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bopr5"
	// PSYS.g:202:1
	public final PSYSParser.bopr5_return bopr5() throws RecognitionException {
		PSYSParser.bopr5_return retval = new PSYSParser.bopr5_return();
		retval.start = input.LT(1);
		int bopr5_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token NOT80=null;

		AST t_tree=null;
		AST NOT80_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// PSYS.g:202:13
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==NOT) ) {
				alt19=1;
			}
			else if ( (LA19_0==94) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// PSYS.g:202:17
					{
					root_0 = (AST)adaptor.nil();


					NOT80=(Token)match(input,NOT,FOLLOW_NOT_in_bopr51446); 
					NOT80_tree = (AST)adaptor.create(NOT80);
					adaptor.addChild(root_0, NOT80_tree);

					}
					break;
				case 2 :
					// PSYS.g:203:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,94,FOLLOW_94_in_bopr51466); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,NOT); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bopr5"


	public static class copr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "copr"
	// PSYS.g:206:1
	public final PSYSParser.copr_return copr() throws RecognitionException {
		PSYSParser.copr_return retval = new PSYSParser.copr_return();
		retval.start = input.LT(1);
		int copr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token LT81=null;
		Token LE82=null;
		Token EQ83=null;
		Token GE84=null;
		Token GT85=null;
		Token NE86=null;

		AST t_tree=null;
		AST LT81_tree=null;
		AST LE82_tree=null;
		AST EQ83_tree=null;
		AST GE84_tree=null;
		AST GT85_tree=null;
		AST NE86_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// PSYS.g:206:13
			int alt20=13;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt20=1;
				}
				break;
			case 82:
				{
				alt20=2;
				}
				break;
			case LE:
				{
				alt20=3;
				}
				break;
			case 83:
				{
				alt20=4;
				}
				break;
			case EQ:
				{
				alt20=5;
				}
				break;
			case 85:
				{
				alt20=6;
				}
				break;
			case GE:
				{
				alt20=7;
				}
				break;
			case 87:
				{
				alt20=8;
				}
				break;
			case GT:
				{
				alt20=9;
				}
				break;
			case 86:
				{
				alt20=10;
				}
				break;
			case NE:
				{
				alt20=11;
				}
				break;
			case 71:
				{
				alt20=12;
				}
				break;
			case 84:
				{
				alt20=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// PSYS.g:206:17
					{
					root_0 = (AST)adaptor.nil();


					LT81=(Token)match(input,LT,FOLLOW_LT_in_copr1504); 
					LT81_tree = (AST)adaptor.create(LT81);
					adaptor.addChild(root_0, LT81_tree);

					}
					break;
				case 2 :
					// PSYS.g:206:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,82,FOLLOW_82_in_copr1510); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,LT); 
					}
					break;
				case 3 :
					// PSYS.g:207:17
					{
					root_0 = (AST)adaptor.nil();


					LE82=(Token)match(input,LE,FOLLOW_LE_in_copr1531); 
					LE82_tree = (AST)adaptor.create(LE82);
					adaptor.addChild(root_0, LE82_tree);

					}
					break;
				case 4 :
					// PSYS.g:207:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,83,FOLLOW_83_in_copr1537); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,LE); 
					}
					break;
				case 5 :
					// PSYS.g:208:17
					{
					root_0 = (AST)adaptor.nil();


					EQ83=(Token)match(input,EQ,FOLLOW_EQ_in_copr1557); 
					EQ83_tree = (AST)adaptor.create(EQ83);
					adaptor.addChild(root_0, EQ83_tree);

					}
					break;
				case 6 :
					// PSYS.g:208:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,85,FOLLOW_85_in_copr1563); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,EQ); 
					}
					break;
				case 7 :
					// PSYS.g:209:17
					{
					root_0 = (AST)adaptor.nil();


					GE84=(Token)match(input,GE,FOLLOW_GE_in_copr1584); 
					GE84_tree = (AST)adaptor.create(GE84);
					adaptor.addChild(root_0, GE84_tree);

					}
					break;
				case 8 :
					// PSYS.g:209:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,87,FOLLOW_87_in_copr1590); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,GE); 
					}
					break;
				case 9 :
					// PSYS.g:210:17
					{
					root_0 = (AST)adaptor.nil();


					GT85=(Token)match(input,GT,FOLLOW_GT_in_copr1610); 
					GT85_tree = (AST)adaptor.create(GT85);
					adaptor.addChild(root_0, GT85_tree);

					}
					break;
				case 10 :
					// PSYS.g:210:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,86,FOLLOW_86_in_copr1616); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,GT); 
					}
					break;
				case 11 :
					// PSYS.g:211:17
					{
					root_0 = (AST)adaptor.nil();


					NE86=(Token)match(input,NE,FOLLOW_NE_in_copr1637); 
					NE86_tree = (AST)adaptor.create(NE86);
					adaptor.addChild(root_0, NE86_tree);

					}
					break;
				case 12 :
					// PSYS.g:211:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,71,FOLLOW_71_in_copr1643); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,NE); 
					}
					break;
				case 13 :
					// PSYS.g:212:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,84,FOLLOW_84_in_copr1665); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,NE); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "copr"


	public static class opr1_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr1"
	// PSYS.g:215:1
	public final PSYSParser.opr1_return opr1() throws RecognitionException {
		PSYSParser.opr1_return retval = new PSYSParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// PSYS.g:215:13
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==78) ) {
				alt21=1;
			}
			else if ( (LA21_0==79) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// PSYS.g:215:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,78,FOLLOW_78_in_opr11699); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,ADD); 
					}
					break;
				case 2 :
					// PSYS.g:216:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,79,FOLLOW_79_in_opr11721); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,SUB); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "opr1"


	public static class opr2_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr2"
	// PSYS.g:219:1
	public final PSYSParser.opr2_return opr2() throws RecognitionException {
		PSYSParser.opr2_return retval = new PSYSParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// PSYS.g:219:13
			int alt22=3;
			switch ( input.LA(1) ) {
			case 77:
				{
				alt22=1;
				}
				break;
			case 80:
				{
				alt22=2;
				}
				break;
			case 72:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// PSYS.g:219:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,77,FOLLOW_77_in_opr21755); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,MUL); 
					}
					break;
				case 2 :
					// PSYS.g:220:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,80,FOLLOW_80_in_opr21777); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,DIV); 
					}
					break;
				case 3 :
					// PSYS.g:221:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,72,FOLLOW_72_in_opr21799); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,MOD); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "opr2"

	// Delegated rules


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\u00ab\uffff";
	static final String DFA11_eofS =
		"\u00ab\uffff";
	static final String DFA11_minS =
		"\1\21\2\7\5\uffff\15\25\u0096\uffff";
	static final String DFA11_maxS =
		"\1\136\2\135\5\uffff\15\130\u0096\uffff";
	static final String DFA11_acceptS =
		"\3\uffff\1\3\21\uffff\1\5\1\7\1\10\1\uffff\1\1\24\uffff\1\2\24\uffff\1"+
		"\4\6\uffff\1\6\140\uffff";
	static final String DFA11_specialS =
		"\u00ab\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\14\3\uffff\1\2\1\3\1\uffff\1\16\1\20\5\uffff\1\3\3\uffff\1\12\1\10"+
			"\5\uffff\1\3\1\22\1\uffff\1\27\11\uffff\1\3\3\uffff\1\1\4\uffff\1\3\6"+
			"\uffff\1\23\3\uffff\1\26\6\uffff\1\11\1\13\1\24\1\15\1\21\1\17\1\25\5"+
			"\uffff\1\27",
			"\1\31\11\uffff\1\3\6\uffff\2\3\11\uffff\2\3\6\uffff\1\3\4\uffff\1\31"+
			"\26\uffff\1\3\1\uffff\2\31\1\uffff\1\31\5\uffff\6\3\3\uffff\3\31",
			"\1\56\11\uffff\1\3\6\uffff\2\3\11\uffff\2\3\6\uffff\1\3\4\uffff\1\56"+
			"\26\uffff\1\3\1\uffff\2\56\1\uffff\1\56\5\uffff\6\3\3\uffff\3\56",
			"",
			"",
			"",
			"",
			"",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
			"\2\103\10\uffff\1\103\12\uffff\1\103\14\uffff\1\103\3\uffff\1\103\4"+
			"\uffff\1\103\27\uffff\1\112",
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

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "159:1: testAtom options {k=2; } : ( TRUE | FALSE | atom copr -> ^( copr atom ) | copr atom -> ^( copr atom ) | '[' evalExpr ']' copr -> ^( copr evalExpr ) | copr '[' evalExpr ']' -> ^( copr evalExpr ) | '(' ! testExpr ')' !| bopr5 ^ testAtom );";
		}
	}

	public static final BitSet FOLLOW_sentence_in_cunit203 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_rule_in_sentence226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wme_in_sentence230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_rule250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008800L});
	public static final BitSet FOLLOW_conditions_in_rule253 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_THEN_in_rule255 = new BitSet(new long[]{0x0020008040000040L});
	public static final BitSet FOLLOW_actions_in_rule258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_conditions270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008800L});
	public static final BitSet FOLLOW_action_in_actions295 = new BitSet(new long[]{0x0020008040000042L});
	public static final BitSet FOLLOW_wme_in_condition322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_condition342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_wme_in_condition345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_action377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_wme_in_action383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_action401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_wme_in_action404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REMOVE_in_action422 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_INTEGER_in_action425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODIFY_in_action443 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_INTEGER_in_action446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_action448 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_attr_in_action451 = new BitSet(new long[]{0x0880040080600000L,0x0000000005000001L});
	public static final BitSet FOLLOW_spec_in_action453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_action455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_wme489 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_type_in_wme494 = new BitSet(new long[]{0x0000040000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_attrSpec_in_wme496 = new BitSet(new long[]{0x0000040000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_wme499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrSpec513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_attrSpec516 = new BitSet(new long[]{0x0880040080600000L,0x0000000005000001L});
	public static final BitSet FOLLOW_spec_in_attrSpec519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_spec536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_spec554 = new BitSet(new long[]{0x08802C1883620000L,0x0000000041FC0881L});
	public static final BitSet FOLLOW_testExpr_in_spec557 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_spec559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_spec578 = new BitSet(new long[]{0x0880040080600000L,0x0000000000008801L});
	public static final BitSet FOLLOW_evalExpr_in_spec581 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_spec583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_testExpr610 = new BitSet(new long[]{0x0001000000000002L,0x0000000018000000L});
	public static final BitSet FOLLOW_bopr3_in_testExpr614 = new BitSet(new long[]{0x08802C1883620000L,0x0000000041FC0881L});
	public static final BitSet FOLLOW_andExpr_in_testExpr617 = new BitSet(new long[]{0x0001000000000002L,0x0000000018000000L});
	public static final BitSet FOLLOW_testAtom_in_andExpr633 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000600L});
	public static final BitSet FOLLOW_bopr4_in_andExpr636 = new BitSet(new long[]{0x08802C1883620000L,0x0000000041FC0881L});
	public static final BitSet FOLLOW_testAtom_in_andExpr639 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000600L});
	public static final BitSet FOLLOW_TRUE_in_testAtom670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_testAtom688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_testAtom706 = new BitSet(new long[]{0x0000081803020000L,0x0000000000FC0080L});
	public static final BitSet FOLLOW_copr_in_testAtom708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_copr_in_testAtom755 = new BitSet(new long[]{0x0880040080600000L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_testAtom757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_testAtom804 = new BitSet(new long[]{0x0880040080600000L,0x0000000000008801L});
	public static final BitSet FOLLOW_evalExpr_in_testAtom806 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_testAtom808 = new BitSet(new long[]{0x0000081803020000L,0x0000000000FC0080L});
	public static final BitSet FOLLOW_copr_in_testAtom810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_copr_in_testAtom841 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_testAtom843 = new BitSet(new long[]{0x0880040080600000L,0x0000000000008801L});
	public static final BitSet FOLLOW_evalExpr_in_testAtom845 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_testAtom847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_testAtom878 = new BitSet(new long[]{0x08802C1883620000L,0x0000000041FC0881L});
	public static final BitSet FOLLOW_testExpr_in_testAtom881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_testAtom883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bopr5_in_testAtom902 = new BitSet(new long[]{0x08802C1883620000L,0x0000000041FC0881L});
	public static final BitSet FOLLOW_testAtom_in_testAtom905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulExpr_in_evalExpr940 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
	public static final BitSet FOLLOW_opr1_in_evalExpr944 = new BitSet(new long[]{0x0880040080600000L,0x0000000000008801L});
	public static final BitSet FOLLOW_mulExpr_in_evalExpr947 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000012100L});
	public static final BitSet FOLLOW_opr2_in_mulExpr968 = new BitSet(new long[]{0x0880040080600000L,0x0000000000008801L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000012100L});
	public static final BitSet FOLLOW_evalAtom_in_negExpr988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_negExpr1008 = new BitSet(new long[]{0x0880040080600000L,0x0000000000000801L});
	public static final BitSet FOLLOW_evalAtom_in_negExpr1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_evalAtom1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_evalAtom1056 = new BitSet(new long[]{0x0880040080600000L,0x0000000000008801L});
	public static final BitSet FOLLOW_evalExpr_in_evalAtom1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_evalAtom1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_atom1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_atom1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atom1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atom1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_atom1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_type1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_attr1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_bopr31278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_bopr31298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_bopr31325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_bopr41362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_bopr41382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_bopr41409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_bopr51446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_bopr51466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_copr1504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_copr1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_copr1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_copr1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_copr1557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_copr1563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_copr1584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_copr1590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_copr1610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_copr1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NE_in_copr1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_copr1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_copr1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_opr11699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_opr11721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_opr21755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_opr21777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_opr21799 = new BitSet(new long[]{0x0000000000000002L});
}
