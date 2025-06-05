// $ANTLR 3.5.2 HC.g 2022-04-06 16:37:42

package in.ac.iitm.cse.parser.hc;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class HCParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ADD", "B", "C", "COMMENT", 
		"CONS", "CONSTANT", "CUT", "D", "DIV", "E", "EQ", "ESC_SEQ", "EXPONENT", 
		"F", "FACT", "FALSE", "FLOAT", "FUNCTION", "G", "GE", "GT", "H", "HEAD", 
		"HEX_DIGIT", "I", "INTEGER", "J", "K", "L", "LE", "LT", "M", "MOD", "MUL", 
		"N", "NAME", "NE", "NEG", "NIL", "NOT", "O", "OCTAL_ESC", "P", "PREDICATE", 
		"PROGRAM", "Q", "QUERY", "R", "RULE", "S", "STRING", "SUB", "T", "TRUE", 
		"U", "UNICODE_ESC", "V", "VARIABLE", "W", "WS", "X", "Y", "Z", "'!'", 
		"'!='", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", 
		"':-'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'?'", "'['", "'\\\\+'", 
		"']'", "'|'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
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
	public static final int A=4;
	public static final int ADD=5;
	public static final int B=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int CONS=9;
	public static final int CONSTANT=10;
	public static final int CUT=11;
	public static final int D=12;
	public static final int DIV=13;
	public static final int E=14;
	public static final int EQ=15;
	public static final int ESC_SEQ=16;
	public static final int EXPONENT=17;
	public static final int F=18;
	public static final int FACT=19;
	public static final int FALSE=20;
	public static final int FLOAT=21;
	public static final int FUNCTION=22;
	public static final int G=23;
	public static final int GE=24;
	public static final int GT=25;
	public static final int H=26;
	public static final int HEAD=27;
	public static final int HEX_DIGIT=28;
	public static final int I=29;
	public static final int INTEGER=30;
	public static final int J=31;
	public static final int K=32;
	public static final int L=33;
	public static final int LE=34;
	public static final int LT=35;
	public static final int M=36;
	public static final int MOD=37;
	public static final int MUL=38;
	public static final int N=39;
	public static final int NAME=40;
	public static final int NE=41;
	public static final int NEG=42;
	public static final int NIL=43;
	public static final int NOT=44;
	public static final int O=45;
	public static final int OCTAL_ESC=46;
	public static final int P=47;
	public static final int PREDICATE=48;
	public static final int PROGRAM=49;
	public static final int Q=50;
	public static final int QUERY=51;
	public static final int R=52;
	public static final int RULE=53;
	public static final int S=54;
	public static final int STRING=55;
	public static final int SUB=56;
	public static final int T=57;
	public static final int TRUE=58;
	public static final int U=59;
	public static final int UNICODE_ESC=60;
	public static final int V=61;
	public static final int VARIABLE=62;
	public static final int W=63;
	public static final int WS=64;
	public static final int X=65;
	public static final int Y=66;
	public static final int Z=67;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HCParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HCParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[19+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HCParser.tokenNames; }
	@Override public String getGrammarFileName() { return "HC.g"; }


	    void setType(AST t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// HC.g:126:1
	public final HCParser.cunit_return cunit() throws RecognitionException {
		HCParser.cunit_return retval = new HCParser.cunit_return();
		retval.start = input.LT(1);
		int cunit_StartIndex = input.index();

		AST root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope hornClause1 =null;

		AST EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_hornClause=new RewriteRuleSubtreeStream(adaptor,"rule hornClause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// HC.g:126:13
			// HC.g:126:17
			{
			// HC.g:126:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==NAME) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// HC.g:126:17
					{
					pushFollow(FOLLOW_hornClause_in_cunit220);
					hornClause1=hornClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_hornClause.add(hornClause1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit223); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: hornClause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 126:33: -> ^( PROGRAM ( hornClause )* )
			{
				// HC.g:126:36
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// HC.g:126:46
				while ( stream_hornClause.hasNext() ) {
					adaptor.addChild(root_1, stream_hornClause.nextTree());
				}
				stream_hornClause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, cunit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cunit"


	public static class hornClause_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "hornClause"
	// HC.g:131:1
	public final HCParser.hornClause_return hornClause() throws RecognitionException {
		HCParser.hornClause_return retval = new HCParser.hornClause_return();
		retval.start = input.LT(1);
		int hornClause_StartIndex = input.index();

		AST root_0 = null;

		Token string_literal4=null;
		Token char_literal6=null;
		Token char_literal7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope predicate3 =null;
		ParserRuleReturnScope body5 =null;
		ParserRuleReturnScope body9 =null;

		AST string_literal4_tree=null;
		AST char_literal6_tree=null;
		AST char_literal7_tree=null;
		AST char_literal8_tree=null;
		AST char_literal10_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// HC.g:131:13
			// HC.g:131:17
			{
			pushFollow(FOLLOW_predicate_in_hornClause247);
			predicate3=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(predicate3.getTree());
			// HC.g:132:13
			int alt3=3;
			switch ( input.LA(1) ) {
			case 79:
				{
				alt3=1;
				}
				break;
			case 77:
				{
				alt3=2;
				}
				break;
			case 75:
			case 86:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// HC.g:132:17
					{
					string_literal4=(Token)match(input,79,FOLLOW_79_in_hornClause265); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(string_literal4);

					pushFollow(FOLLOW_body_in_hornClause267);
					body5=body();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_body.add(body5.getTree());
					char_literal6=(Token)match(input,77,FOLLOW_77_in_hornClause269); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal6);

					// AST REWRITE
					// elements: predicate, body
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 132:33: -> ^( RULE predicate body )
					{
						// HC.g:132:36
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(RULE, "RULE"), root_1);
						adaptor.addChild(root_1, stream_predicate.nextTree());
						adaptor.addChild(root_1, stream_body.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// HC.g:133:17
					{
					char_literal7=(Token)match(input,77,FOLLOW_77_in_hornClause299); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal7);

					// AST REWRITE
					// elements: predicate
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 133:33: -> ^( FACT predicate )
					{
						// HC.g:133:36
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FACT, "FACT"), root_1);
						adaptor.addChild(root_1, stream_predicate.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// HC.g:134:17
					{
					// HC.g:134:17
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==75) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// HC.g:134:18
							{
							char_literal8=(Token)match(input,75,FOLLOW_75_in_hornClause338); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_75.add(char_literal8);

							pushFollow(FOLLOW_body_in_hornClause340);
							body9=body();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_body.add(body9.getTree());
							}
							break;

					}

					char_literal10=(Token)match(input,86,FOLLOW_86_in_hornClause344); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal10);

					// AST REWRITE
					// elements: body, predicate
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 134:33: -> ^( QUERY predicate ( body )? )
					{
						// HC.g:134:36
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(QUERY, "QUERY"), root_1);
						adaptor.addChild(root_1, stream_predicate.nextTree());
						// HC.g:134:54
						if ( stream_body.hasNext() ) {
							adaptor.addChild(root_1, stream_body.nextTree());
						}
						stream_body.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, hornClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "hornClause"


	public static class body_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "body"
	// HC.g:145:1
	public final HCParser.body_return body() throws RecognitionException {
		HCParser.body_return retval = new HCParser.body_return();
		retval.start = input.LT(1);
		int body_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal12=null;
		ParserRuleReturnScope subgoal11 =null;
		ParserRuleReturnScope subgoal13 =null;

		AST char_literal12_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// HC.g:145:13
			// HC.g:145:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_subgoal_in_body406);
			subgoal11=subgoal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subgoal11.getTree());

			// HC.g:145:25
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==75) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// HC.g:145:27
					{
					char_literal12=(Token)match(input,75,FOLLOW_75_in_body410); if (state.failed) return retval;
					pushFollow(FOLLOW_subgoal_in_body413);
					subgoal13=subgoal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subgoal13.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, body_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "body"


	public static class subgoal_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "subgoal"
	// HC.g:147:1
	public final HCParser.subgoal_return subgoal() throws RecognitionException {
		HCParser.subgoal_return retval = new HCParser.subgoal_return();
		retval.start = input.LT(1);
		int subgoal_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope atom14 =null;
		ParserRuleReturnScope uopr15 =null;
		ParserRuleReturnScope atom16 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// HC.g:147:13
			int alt5=3;
			switch ( input.LA(1) ) {
			case 68:
				{
				alt5=1;
				}
				break;
			case FALSE:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING:
			case TRUE:
			case VARIABLE:
			case 71:
			case 76:
			case 87:
				{
				alt5=2;
				}
				break;
			case NOT:
			case 88:
			case 91:
				{
				alt5=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// HC.g:147:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,68,FOLLOW_68_in_subgoal433); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,CUT); }
					}
					break;
				case 2 :
					// HC.g:148:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_subgoal453);
					atom14=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom14.getTree());

					}
					break;
				case 3 :
					// HC.g:149:15
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_uopr_in_subgoal469);
					uopr15=uopr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(uopr15.getTree(), root_0);
					pushFollow(FOLLOW_atom_in_subgoal472);
					atom16=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom16.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, subgoal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "subgoal"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// HC.g:152:1
	public final HCParser.atom_return atom() throws RecognitionException {
		HCParser.atom_return retval = new HCParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token TRUE17=null;
		Token FALSE18=null;
		Token char_literal21=null;
		Token char_literal23=null;
		ParserRuleReturnScope comparison19 =null;
		ParserRuleReturnScope predicate20 =null;
		ParserRuleReturnScope atom22 =null;

		AST TRUE17_tree=null;
		AST FALSE18_tree=null;
		AST char_literal21_tree=null;
		AST char_literal23_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// HC.g:152:13
			int alt6=5;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TRUE) ) {
				alt6=1;
			}
			else if ( (LA6_0==FALSE) ) {
				alt6=2;
			}
			else if ( (LA6_0==INTEGER) && (synpred1_HC())) {
				alt6=3;
			}
			else if ( (LA6_0==FLOAT) && (synpred1_HC())) {
				alt6=3;
			}
			else if ( (LA6_0==STRING) && (synpred1_HC())) {
				alt6=3;
			}
			else if ( (LA6_0==NAME) ) {
				int LA6_6 = input.LA(2);
				if ( (synpred1_HC()) ) {
					alt6=3;
				}
				else if ( (true) ) {
					alt6=4;
				}

			}
			else if ( (LA6_0==VARIABLE) && (synpred1_HC())) {
				alt6=3;
			}
			else if ( (LA6_0==71) ) {
				int LA6_8 = input.LA(2);
				if ( (synpred1_HC()) ) {
					alt6=3;
				}
				else if ( (true) ) {
					alt6=5;
				}

			}
			else if ( (LA6_0==76) && (synpred1_HC())) {
				alt6=3;
			}
			else if ( (LA6_0==87) && (synpred1_HC())) {
				alt6=3;
			}

			switch (alt6) {
				case 1 :
					// HC.g:152:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE17=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom502); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE17_tree = (AST)adaptor.create(TRUE17);
					adaptor.addChild(root_0, TRUE17_tree);
					}

					}
					break;
				case 2 :
					// HC.g:153:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE18=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom520); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE18_tree = (AST)adaptor.create(FALSE18);
					adaptor.addChild(root_0, FALSE18_tree);
					}

					}
					break;
				case 3 :
					// HC.g:154:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_comparison_in_atom543);
					comparison19=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison19.getTree());

					}
					break;
				case 4 :
					// HC.g:155:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_atom564);
					predicate20=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate20.getTree());

					}
					break;
				case 5 :
					// HC.g:156:15
					{
					root_0 = (AST)adaptor.nil();


					char_literal21=(Token)match(input,71,FOLLOW_71_in_atom599); if (state.failed) return retval;
					pushFollow(FOLLOW_atom_in_atom602);
					atom22=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom22.getTree());

					char_literal23=(Token)match(input,72,FOLLOW_72_in_atom604); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class comparison_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// HC.g:158:1
	public final HCParser.comparison_return comparison() throws RecognitionException {
		HCParser.comparison_return retval = new HCParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope term24 =null;
		ParserRuleReturnScope copr25 =null;
		ParserRuleReturnScope term26 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// HC.g:158:13
			// HC.g:158:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_comparison642);
			term24=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term24.getTree());

			pushFollow(FOLLOW_copr_in_comparison644);
			copr25=copr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(copr25.getTree(), root_0);
			pushFollow(FOLLOW_term_in_comparison647);
			term26=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term26.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class predicate_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// HC.g:159:1
	public final HCParser.predicate_return predicate() throws RecognitionException {
		HCParser.predicate_return retval = new HCParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal27=null;
		Token char_literal29=null;
		ParserRuleReturnScope termList28 =null;

		AST t_tree=null;
		AST char_literal27_tree=null;
		AST char_literal29_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// HC.g:159:13
			// HC.g:159:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_predicate661); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
			}

			if ( state.backtracking==0 ) { setType(t,PREDICATE); }
			char_literal27=(Token)match(input,71,FOLLOW_71_in_predicate666); if (state.failed) return retval;
			pushFollow(FOLLOW_termList_in_predicate669);
			termList28=termList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termList28.getTree());

			char_literal29=(Token)match(input,72,FOLLOW_72_in_predicate671); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class uopr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "uopr"
	// HC.g:161:1
	public final HCParser.uopr_return uopr() throws RecognitionException {
		HCParser.uopr_return retval = new HCParser.uopr_return();
		retval.start = input.LT(1);
		int uopr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token NOT30=null;

		AST t_tree=null;
		AST NOT30_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// HC.g:161:13
			int alt7=3;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt7=1;
				}
				break;
			case 88:
				{
				alt7=2;
				}
				break;
			case 91:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// HC.g:161:17
					{
					root_0 = (AST)adaptor.nil();


					NOT30=(Token)match(input,NOT,FOLLOW_NOT_in_uopr690); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT30_tree = (AST)adaptor.create(NOT30);
					adaptor.addChild(root_0, NOT30_tree);
					}

					}
					break;
				case 2 :
					// HC.g:162:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,88,FOLLOW_88_in_uopr710); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NOT); }
					}
					break;
				case 3 :
					// HC.g:163:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,91,FOLLOW_91_in_uopr736); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NOT); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, uopr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "uopr"


	public static class copr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "copr"
	// HC.g:166:1
	public final HCParser.copr_return copr() throws RecognitionException {
		HCParser.copr_return retval = new HCParser.copr_return();
		retval.start = input.LT(1);
		int copr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token LT31=null;
		Token LE32=null;
		Token EQ33=null;
		Token GE34=null;
		Token GT35=null;
		Token NE36=null;

		AST t_tree=null;
		AST LT31_tree=null;
		AST LE32_tree=null;
		AST EQ33_tree=null;
		AST GE34_tree=null;
		AST GT35_tree=null;
		AST NE36_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// HC.g:166:13
			int alt8=13;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt8=1;
				}
				break;
			case 80:
				{
				alt8=2;
				}
				break;
			case LE:
				{
				alt8=3;
				}
				break;
			case 81:
				{
				alt8=4;
				}
				break;
			case EQ:
				{
				alt8=5;
				}
				break;
			case 83:
				{
				alt8=6;
				}
				break;
			case GE:
				{
				alt8=7;
				}
				break;
			case 85:
				{
				alt8=8;
				}
				break;
			case GT:
				{
				alt8=9;
				}
				break;
			case 84:
				{
				alt8=10;
				}
				break;
			case NE:
				{
				alt8=11;
				}
				break;
			case 69:
				{
				alt8=12;
				}
				break;
			case 82:
				{
				alt8=13;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// HC.g:166:17
					{
					root_0 = (AST)adaptor.nil();


					LT31=(Token)match(input,LT,FOLLOW_LT_in_copr774); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LT31_tree = (AST)adaptor.create(LT31);
					adaptor.addChild(root_0, LT31_tree);
					}

					}
					break;
				case 2 :
					// HC.g:166:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,80,FOLLOW_80_in_copr780); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,LT); }
					}
					break;
				case 3 :
					// HC.g:167:17
					{
					root_0 = (AST)adaptor.nil();


					LE32=(Token)match(input,LE,FOLLOW_LE_in_copr801); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LE32_tree = (AST)adaptor.create(LE32);
					adaptor.addChild(root_0, LE32_tree);
					}

					}
					break;
				case 4 :
					// HC.g:167:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,81,FOLLOW_81_in_copr807); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,LE); }
					}
					break;
				case 5 :
					// HC.g:168:17
					{
					root_0 = (AST)adaptor.nil();


					EQ33=(Token)match(input,EQ,FOLLOW_EQ_in_copr827); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQ33_tree = (AST)adaptor.create(EQ33);
					adaptor.addChild(root_0, EQ33_tree);
					}

					}
					break;
				case 6 :
					// HC.g:168:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,83,FOLLOW_83_in_copr833); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,EQ); }
					}
					break;
				case 7 :
					// HC.g:169:17
					{
					root_0 = (AST)adaptor.nil();


					GE34=(Token)match(input,GE,FOLLOW_GE_in_copr854); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GE34_tree = (AST)adaptor.create(GE34);
					adaptor.addChild(root_0, GE34_tree);
					}

					}
					break;
				case 8 :
					// HC.g:169:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,85,FOLLOW_85_in_copr860); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,GE); }
					}
					break;
				case 9 :
					// HC.g:170:17
					{
					root_0 = (AST)adaptor.nil();


					GT35=(Token)match(input,GT,FOLLOW_GT_in_copr880); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GT35_tree = (AST)adaptor.create(GT35);
					adaptor.addChild(root_0, GT35_tree);
					}

					}
					break;
				case 10 :
					// HC.g:170:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,84,FOLLOW_84_in_copr886); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,GT); }
					}
					break;
				case 11 :
					// HC.g:171:17
					{
					root_0 = (AST)adaptor.nil();


					NE36=(Token)match(input,NE,FOLLOW_NE_in_copr907); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NE36_tree = (AST)adaptor.create(NE36);
					adaptor.addChild(root_0, NE36_tree);
					}

					}
					break;
				case 12 :
					// HC.g:171:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,69,FOLLOW_69_in_copr913); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NE); }
					}
					break;
				case 13 :
					// HC.g:172:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,82,FOLLOW_82_in_copr935); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NE); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, copr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "copr"


	public static class termList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "termList"
	// HC.g:178:1
	public final HCParser.termList_return termList() throws RecognitionException {
		HCParser.termList_return retval = new HCParser.termList_return();
		retval.start = input.LT(1);
		int termList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal38=null;
		ParserRuleReturnScope term37 =null;
		ParserRuleReturnScope term39 =null;

		AST char_literal38_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// HC.g:178:13
			// HC.g:178:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_termList966);
			term37=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term37.getTree());

			// HC.g:178:22
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==75) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// HC.g:178:23
					{
					char_literal38=(Token)match(input,75,FOLLOW_75_in_termList969); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_termList972);
					term39=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term39.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, termList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termList"


	public static class term_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "term"
	// HC.g:179:1
	public final HCParser.term_return term() throws RecognitionException {
		HCParser.term_return retval = new HCParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope addTerm40 =null;
		ParserRuleReturnScope list41 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// HC.g:179:13
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FLOAT||LA10_0==INTEGER||LA10_0==NAME||LA10_0==STRING||LA10_0==VARIABLE||LA10_0==71||LA10_0==76) ) {
				alt10=1;
			}
			else if ( (LA10_0==87) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// HC.g:179:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_addTerm_in_term991);
					addTerm40=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm40.getTree());

					}
					break;
				case 2 :
					// HC.g:179:27
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_list_in_term995);
					list41=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list41.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "term"


	public static class addTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "addTerm"
	// HC.g:181:1
	public final HCParser.addTerm_return addTerm() throws RecognitionException {
		HCParser.addTerm_return retval = new HCParser.addTerm_return();
		retval.start = input.LT(1);
		int addTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulTerm42 =null;
		ParserRuleReturnScope opr143 =null;
		ParserRuleReturnScope mulTerm44 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// HC.g:181:13
			// HC.g:181:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulTerm_in_addTerm1010);
			mulTerm42=mulTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm42.getTree());

			// HC.g:181:25
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==74||LA11_0==76) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// HC.g:181:27
					{
					pushFollow(FOLLOW_opr1_in_addTerm1014);
					opr143=opr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr143.getTree(), root_0);
					pushFollow(FOLLOW_mulTerm_in_addTerm1017);
					mulTerm44=mulTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm44.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, addTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "addTerm"


	public static class mulTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "mulTerm"
	// HC.g:182:1
	public final HCParser.mulTerm_return mulTerm() throws RecognitionException {
		HCParser.mulTerm_return retval = new HCParser.mulTerm_return();
		retval.start = input.LT(1);
		int mulTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negTerm45 =null;
		ParserRuleReturnScope opr246 =null;
		ParserRuleReturnScope negTerm47 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// HC.g:182:13
			// HC.g:182:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negTerm_in_mulTerm1034);
			negTerm45=negTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm45.getTree());

			// HC.g:182:25
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==70||LA12_0==73||LA12_0==78) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// HC.g:182:27
					{
					pushFollow(FOLLOW_opr2_in_mulTerm1038);
					opr246=opr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr246.getTree(), root_0);
					pushFollow(FOLLOW_negTerm_in_mulTerm1041);
					negTerm47=negTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm47.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, mulTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mulTerm"


	public static class negTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "negTerm"
	// HC.g:183:1
	public final HCParser.negTerm_return negTerm() throws RecognitionException {
		HCParser.negTerm_return retval = new HCParser.negTerm_return();
		retval.start = input.LT(1);
		int negTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope atomicTerm48 =null;
		ParserRuleReturnScope atomicTerm49 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// HC.g:183:13
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==FLOAT||LA13_0==INTEGER||LA13_0==NAME||LA13_0==STRING||LA13_0==VARIABLE||LA13_0==71) ) {
				alt13=1;
			}
			else if ( (LA13_0==76) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// HC.g:183:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomicTerm_in_negTerm1058);
					atomicTerm48=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm48.getTree());

					}
					break;
				case 2 :
					// HC.g:184:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,76,FOLLOW_76_in_negTerm1078); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,NEG); }
					pushFollow(FOLLOW_atomicTerm_in_negTerm1083);
					atomicTerm49=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm49.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, negTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "negTerm"


	public static class atomicTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atomicTerm"
	// HC.g:187:1
	public final HCParser.atomicTerm_return atomicTerm() throws RecognitionException {
		HCParser.atomicTerm_return retval = new HCParser.atomicTerm_return();
		retval.start = input.LT(1);
		int atomicTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token INTEGER50=null;
		Token FLOAT51=null;
		Token STRING52=null;
		Token char_literal53=null;
		Token char_literal55=null;
		Token VARIABLE56=null;
		Token char_literal57=null;
		Token char_literal59=null;
		ParserRuleReturnScope termList54 =null;
		ParserRuleReturnScope addTerm58 =null;

		AST t_tree=null;
		AST INTEGER50_tree=null;
		AST FLOAT51_tree=null;
		AST STRING52_tree=null;
		AST char_literal53_tree=null;
		AST char_literal55_tree=null;
		AST VARIABLE56_tree=null;
		AST char_literal57_tree=null;
		AST char_literal59_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// HC.g:189:13
			int alt15=7;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt15=1;
				}
				break;
			case FLOAT:
				{
				alt15=2;
				}
				break;
			case STRING:
				{
				alt15=3;
				}
				break;
			case NAME:
				{
				int LA15_4 = input.LA(2);
				if ( (LA15_4==EOF||LA15_4==EQ||(LA15_4 >= GE && LA15_4 <= GT)||(LA15_4 >= LE && LA15_4 <= LT)||LA15_4==NE||(LA15_4 >= 69 && LA15_4 <= 70)||(LA15_4 >= 72 && LA15_4 <= 78)||(LA15_4 >= 80 && LA15_4 <= 86)||LA15_4==90) ) {
					alt15=4;
				}
				else if ( (LA15_4==71) ) {
					alt15=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARIABLE:
				{
				alt15=6;
				}
				break;
			case 71:
				{
				alt15=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// HC.g:189:17
					{
					root_0 = (AST)adaptor.nil();


					INTEGER50=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atomicTerm1125); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER50_tree = (AST)adaptor.create(INTEGER50);
					adaptor.addChild(root_0, INTEGER50_tree);
					}

					}
					break;
				case 2 :
					// HC.g:190:17
					{
					root_0 = (AST)adaptor.nil();


					FLOAT51=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atomicTerm1143); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT51_tree = (AST)adaptor.create(FLOAT51);
					adaptor.addChild(root_0, FLOAT51_tree);
					}

					}
					break;
				case 3 :
					// HC.g:191:17
					{
					root_0 = (AST)adaptor.nil();


					STRING52=(Token)match(input,STRING,FOLLOW_STRING_in_atomicTerm1161); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING52_tree = (AST)adaptor.create(STRING52);
					adaptor.addChild(root_0, STRING52_tree);
					}

					}
					break;
				case 4 :
					// HC.g:192:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1181); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,CONSTANT); }
					}
					break;
				case 5 :
					// HC.g:193:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,FUNCTION); }
					char_literal53=(Token)match(input,71,FOLLOW_71_in_atomicTerm1209); if (state.failed) return retval;
					// HC.g:193:56
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==FLOAT||LA14_0==INTEGER||LA14_0==NAME||LA14_0==STRING||LA14_0==VARIABLE||LA14_0==71||LA14_0==76||LA14_0==87) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// HC.g:193:56
							{
							pushFollow(FOLLOW_termList_in_atomicTerm1212);
							termList54=termList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, termList54.getTree());

							}
							break;

					}

					char_literal55=(Token)match(input,72,FOLLOW_72_in_atomicTerm1215); if (state.failed) return retval;
					}
					break;
				case 6 :
					// HC.g:194:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE56=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atomicTerm1234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE56_tree = (AST)adaptor.create(VARIABLE56);
					adaptor.addChild(root_0, VARIABLE56_tree);
					}

					}
					break;
				case 7 :
					// HC.g:195:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal57=(Token)match(input,71,FOLLOW_71_in_atomicTerm1252); if (state.failed) return retval;
					pushFollow(FOLLOW_addTerm_in_atomicTerm1255);
					addTerm58=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm58.getTree());

					char_literal59=(Token)match(input,72,FOLLOW_72_in_atomicTerm1257); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, atomicTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atomicTerm"


	public static class list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "list"
	// HC.g:198:1
	public final HCParser.list_return list() throws RecognitionException {
		HCParser.list_return retval = new HCParser.list_return();
		retval.start = input.LT(1);
		int list_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token VARIABLE63=null;
		Token char_literal65=null;
		ParserRuleReturnScope term61 =null;
		ParserRuleReturnScope list64 =null;

		AST t_tree=null;
		AST char_literal60_tree=null;
		AST char_literal62_tree=null;
		AST VARIABLE63_tree=null;
		AST char_literal65_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// HC.g:200:13
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==87) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==89) ) {
					alt17=1;
				}
				else if ( (LA17_1==FLOAT||LA17_1==INTEGER||LA17_1==NAME||LA17_1==STRING||LA17_1==VARIABLE||LA17_1==71||LA17_1==76||LA17_1==87) ) {
					alt17=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// HC.g:200:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,87,FOLLOW_87_in_list1302); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NIL); }
					char_literal60=(Token)match(input,89,FOLLOW_89_in_list1307); if (state.failed) return retval;
					}
					break;
				case 2 :
					// HC.g:201:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,87,FOLLOW_87_in_list1328); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,CONS); }
					pushFollow(FOLLOW_term_in_list1353);
					term61=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term61.getTree());

					// HC.g:203:21
					// HC.g:203:23
					{
					char_literal62=(Token)match(input,90,FOLLOW_90_in_list1377); if (state.failed) return retval;
					// HC.g:203:28
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==VARIABLE) ) {
						alt16=1;
					}
					else if ( (LA16_0==87) ) {
						alt16=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// HC.g:203:29
							{
							VARIABLE63=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_list1381); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE63_tree = (AST)adaptor.create(VARIABLE63);
							adaptor.addChild(root_0, VARIABLE63_tree);
							}

							}
							break;
						case 2 :
							// HC.g:203:40
							{
							pushFollow(FOLLOW_list_in_list1385);
							list64=list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, list64.getTree());

							}
							break;

					}

					}

					char_literal65=(Token)match(input,89,FOLLOW_89_in_list1406); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "list"


	public static class opr1_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr1"
	// HC.g:218:1
	public final HCParser.opr1_return opr1() throws RecognitionException {
		HCParser.opr1_return retval = new HCParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// HC.g:218:13
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==74) ) {
				alt18=1;
			}
			else if ( (LA18_0==76) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// HC.g:218:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,74,FOLLOW_74_in_opr11442); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,ADD); }
					}
					break;
				case 2 :
					// HC.g:219:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,76,FOLLOW_76_in_opr11464); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,SUB); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, opr1_StartIndex); }

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
	// HC.g:222:1
	public final HCParser.opr2_return opr2() throws RecognitionException {
		HCParser.opr2_return retval = new HCParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// HC.g:222:13
			int alt19=3;
			switch ( input.LA(1) ) {
			case 73:
				{
				alt19=1;
				}
				break;
			case 78:
				{
				alt19=2;
				}
				break;
			case 70:
				{
				alt19=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// HC.g:222:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,73,FOLLOW_73_in_opr21498); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,MUL); }
					}
					break;
				case 2 :
					// HC.g:223:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,78,FOLLOW_78_in_opr21520); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,DIV); }
					}
					break;
				case 3 :
					// HC.g:224:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,70,FOLLOW_70_in_opr21542); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,MOD); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, opr2_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "opr2"

	// $ANTLR start synpred1_HC
	public final void synpred1_HC_fragment() throws RecognitionException {
		// HC.g:154:17
		// HC.g:154:18
		{
		pushFollow(FOLLOW_comparison_in_synpred1_HC539);
		comparison();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_HC

	// Delegated rules

	public final boolean synpred1_HC() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_HC_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_hornClause_in_cunit220 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_EOF_in_cunit223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_hornClause247 = new BitSet(new long[]{0x0000000000000000L,0x000000000040A800L});
	public static final BitSet FOLLOW_79_in_hornClause265 = new BitSet(new long[]{0x4480110040300000L,0x0000000009801090L});
	public static final BitSet FOLLOW_body_in_hornClause267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_hornClause269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_hornClause299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_hornClause338 = new BitSet(new long[]{0x4480110040300000L,0x0000000009801090L});
	public static final BitSet FOLLOW_body_in_hornClause340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_hornClause344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subgoal_in_body406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_body410 = new BitSet(new long[]{0x4480110040300000L,0x0000000009801090L});
	public static final BitSet FOLLOW_subgoal_in_body413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_68_in_subgoal433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_subgoal453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uopr_in_subgoal469 = new BitSet(new long[]{0x4480010040300000L,0x0000000000801080L});
	public static final BitSet FOLLOW_atom_in_subgoal472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_atom502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_atom520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_atom543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_atom564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_atom599 = new BitSet(new long[]{0x4480010040300000L,0x0000000000801080L});
	public static final BitSet FOLLOW_atom_in_atom602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_atom604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_comparison642 = new BitSet(new long[]{0x0000020C03008000L,0x00000000003F0020L});
	public static final BitSet FOLLOW_copr_in_comparison644 = new BitSet(new long[]{0x4080010040200000L,0x0000000000801080L});
	public static final BitSet FOLLOW_term_in_comparison647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_predicate661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_predicate666 = new BitSet(new long[]{0x4080010040200000L,0x0000000000801080L});
	public static final BitSet FOLLOW_termList_in_predicate669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_predicate671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_uopr690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_uopr710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_uopr736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_copr774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_copr780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_copr801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_copr807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_copr827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_copr833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_copr854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_copr860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_copr880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_copr886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NE_in_copr907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_copr913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_copr935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_termList966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_termList969 = new BitSet(new long[]{0x4080010040200000L,0x0000000000801080L});
	public static final BitSet FOLLOW_term_in_termList972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_addTerm_in_term991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_term995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm1010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001400L});
	public static final BitSet FOLLOW_opr1_in_addTerm1014 = new BitSet(new long[]{0x4080010040200000L,0x0000000000001080L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm1017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001400L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm1034 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004240L});
	public static final BitSet FOLLOW_opr2_in_mulTerm1038 = new BitSet(new long[]{0x4080010040200000L,0x0000000000001080L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm1041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004240L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_negTerm1078 = new BitSet(new long[]{0x4080010040200000L,0x0000000000000080L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atomicTerm1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atomicTerm1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atomicTerm1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_atomicTerm1209 = new BitSet(new long[]{0x4080010040200000L,0x0000000000801180L});
	public static final BitSet FOLLOW_termList_in_atomicTerm1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_atomicTerm1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_atomicTerm1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_atomicTerm1252 = new BitSet(new long[]{0x4080010040200000L,0x0000000000001080L});
	public static final BitSet FOLLOW_addTerm_in_atomicTerm1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_atomicTerm1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_list1302 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_list1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_list1328 = new BitSet(new long[]{0x4080010040200000L,0x0000000000801080L});
	public static final BitSet FOLLOW_term_in_list1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_list1377 = new BitSet(new long[]{0x4000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_list1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_list_in_list1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_list1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_opr11442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_opr11464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_opr21498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_opr21520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_opr21542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_synpred1_HC539 = new BitSet(new long[]{0x0000000000000002L});
}
