// $ANTLR 3.5.2 DL.g 2022-04-06 16:37:41

package in.ac.iitm.cse.parser.dl;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ADD", "ALL", "AND", "B", 
		"C", "COMMENT", "CONCEPT", "CONSTANT", "D", "DIV", "E", "EQUIVALENTTO", 
		"ESC_SEQ", "EXISTS", "EXPONENT", "F", "FILLS", "FLOAT", "G", "H", "HEX_DIGIT", 
		"I", "INSTANCEOF", "INTEGER", "ISA", "J", "K", "KB", "L", "M", "MOD", 
		"MUL", "N", "NAME", "NEG", "O", "OCTAL_ESC", "P", "Q", "R", "ROLE", "S", 
		"STRING", "SUB", "SUBSUMES", "T", "U", "UNICODE_ESC", "V", "W", "WS", 
		"X", "Y", "Z", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'->'", 
		"'/'", "':'", "'<<'", "'=='", "'>>'", "'['", "']'"
	};
	public static final int EOF=-1;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int A=4;
	public static final int ADD=5;
	public static final int ALL=6;
	public static final int AND=7;
	public static final int B=8;
	public static final int C=9;
	public static final int COMMENT=10;
	public static final int CONCEPT=11;
	public static final int CONSTANT=12;
	public static final int D=13;
	public static final int DIV=14;
	public static final int E=15;
	public static final int EQUIVALENTTO=16;
	public static final int ESC_SEQ=17;
	public static final int EXISTS=18;
	public static final int EXPONENT=19;
	public static final int F=20;
	public static final int FILLS=21;
	public static final int FLOAT=22;
	public static final int G=23;
	public static final int H=24;
	public static final int HEX_DIGIT=25;
	public static final int I=26;
	public static final int INSTANCEOF=27;
	public static final int INTEGER=28;
	public static final int ISA=29;
	public static final int J=30;
	public static final int K=31;
	public static final int KB=32;
	public static final int L=33;
	public static final int M=34;
	public static final int MOD=35;
	public static final int MUL=36;
	public static final int N=37;
	public static final int NAME=38;
	public static final int NEG=39;
	public static final int O=40;
	public static final int OCTAL_ESC=41;
	public static final int P=42;
	public static final int Q=43;
	public static final int R=44;
	public static final int ROLE=45;
	public static final int S=46;
	public static final int STRING=47;
	public static final int SUB=48;
	public static final int SUBSUMES=49;
	public static final int T=50;
	public static final int U=51;
	public static final int UNICODE_ESC=52;
	public static final int V=53;
	public static final int W=54;
	public static final int WS=55;
	public static final int X=56;
	public static final int Y=57;
	public static final int Z=58;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "DL.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// DL.g:111:1
	public final DLParser.cunit_return cunit() throws RecognitionException {
		DLParser.cunit_return retval = new DLParser.cunit_return();
		retval.start = input.LT(1);
		int cunit_StartIndex = input.index();

		AST root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope sentence1 =null;

		AST EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_sentence=new RewriteRuleSubtreeStream(adaptor,"rule sentence");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// DL.g:111:13
			// DL.g:111:17
			{
			// DL.g:111:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==60) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// DL.g:111:17
					{
					pushFollow(FOLLOW_sentence_in_cunit190);
					sentence1=sentence();
					state._fsp--;

					stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit193);  
			stream_EOF.add(EOF2);

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
			// 111:31: -> ^( KB ( sentence )* )
			{
				// DL.g:111:34
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(KB, "KB"), root_1);
				// DL.g:111:39
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
	// DL.g:113:1
	public final DLParser.sentence_return sentence() throws RecognitionException {
		DLParser.sentence_return retval = new DLParser.sentence_return();
		retval.start = input.LT(1);
		int sentence_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal3=null;
		Token char_literal6=null;
		ParserRuleReturnScope conceptExpr4 =null;
		ParserRuleReturnScope instanceOf5 =null;

		AST char_literal3_tree=null;
		AST char_literal6_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// DL.g:113:13
			// DL.g:113:17
			{
			root_0 = (AST)adaptor.nil();


			char_literal3=(Token)match(input,60,FOLLOW_60_in_sentence216); 
			// DL.g:113:22
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==NAME||LA2_0==72) ) {
				alt2=1;
			}
			else if ( (LA2_0==CONSTANT||LA2_0==FLOAT||LA2_0==INTEGER||LA2_0==STRING||LA2_0==60||LA2_0==65) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// DL.g:113:23
					{
					pushFollow(FOLLOW_conceptExpr_in_sentence220);
					conceptExpr4=conceptExpr();
					state._fsp--;

					adaptor.addChild(root_0, conceptExpr4.getTree());

					}
					break;
				case 2 :
					// DL.g:113:37
					{
					pushFollow(FOLLOW_instanceOf_in_sentence224);
					instanceOf5=instanceOf();
					state._fsp--;

					adaptor.addChild(root_0, instanceOf5.getTree());

					}
					break;

			}

			char_literal6=(Token)match(input,61,FOLLOW_61_in_sentence228); 
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


	public static class conceptExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "conceptExpr"
	// DL.g:115:1
	public final DLParser.conceptExpr_return conceptExpr() throws RecognitionException {
		DLParser.conceptExpr_return retval = new DLParser.conceptExpr_return();
		retval.start = input.LT(1);
		int conceptExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope concept7 =null;
		ParserRuleReturnScope ropr8 =null;
		ParserRuleReturnScope concept9 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// DL.g:115:13
			// DL.g:115:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_concept_in_conceptExpr240);
			concept7=concept();
			state._fsp--;

			adaptor.addChild(root_0, concept7.getTree());

			pushFollow(FOLLOW_ropr_in_conceptExpr242);
			ropr8=ropr();
			state._fsp--;

			root_0 = (AST)adaptor.becomeRoot(ropr8.getTree(), root_0);
			pushFollow(FOLLOW_concept_in_conceptExpr245);
			concept9=concept();
			state._fsp--;

			adaptor.addChild(root_0, concept9.getTree());

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
	// $ANTLR end "conceptExpr"


	public static class instanceOf_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// DL.g:117:1
	public final DLParser.instanceOf_return instanceOf() throws RecognitionException {
		DLParser.instanceOf_return retval = new DLParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal11=null;
		ParserRuleReturnScope constant10 =null;
		ParserRuleReturnScope constant12 =null;
		ParserRuleReturnScope concept13 =null;

		AST t_tree=null;
		AST char_literal11_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_concept=new RewriteRuleSubtreeStream(adaptor,"rule concept");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// DL.g:117:13
			// DL.g:117:17
			{
			pushFollow(FOLLOW_constant_in_instanceOf257);
			constant10=constant();
			state._fsp--;

			stream_constant.add(constant10.getTree());
			// DL.g:117:26
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==64) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// DL.g:117:27
					{
					char_literal11=(Token)match(input,64,FOLLOW_64_in_instanceOf260);  
					stream_64.add(char_literal11);

					pushFollow(FOLLOW_constant_in_instanceOf262);
					constant12=constant();
					state._fsp--;

					stream_constant.add(constant12.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			t=(Token)match(input,66,FOLLOW_66_in_instanceOf268);  
			stream_66.add(t);

			pushFollow(FOLLOW_concept_in_instanceOf270);
			concept13=concept();
			state._fsp--;

			stream_concept.add(concept13.getTree());
			// AST REWRITE
			// elements: concept, constant
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 118:17: -> ( ^( INSTANCEOF[$t] constant concept ) )+
			{
				if ( !(stream_concept.hasNext()||stream_constant.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_concept.hasNext()||stream_constant.hasNext() ) {
					// DL.g:118:20
					{
					AST root_1 = (AST)adaptor.nil();
					root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(INSTANCEOF, t), root_1);
					adaptor.addChild(root_1, stream_constant.nextTree());
					adaptor.addChild(root_1, stream_concept.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_concept.reset();
				stream_constant.reset();

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
	// $ANTLR end "instanceOf"


	public static class concept_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "concept"
	// DL.g:121:1
	public final DLParser.concept_return concept() throws RecognitionException {
		DLParser.concept_return retval = new DLParser.concept_return();
		retval.start = input.LT(1);
		int concept_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal14=null;
		Token FILLS15=null;
		Token char_literal18=null;
		Token char_literal19=null;
		Token ALL20=null;
		Token char_literal23=null;
		Token char_literal24=null;
		Token EXISTS25=null;
		Token INTEGER26=null;
		Token char_literal28=null;
		Token char_literal29=null;
		Token AND30=null;
		Token char_literal33=null;
		ParserRuleReturnScope role16 =null;
		ParserRuleReturnScope constant17 =null;
		ParserRuleReturnScope role21 =null;
		ParserRuleReturnScope concept22 =null;
		ParserRuleReturnScope role27 =null;
		ParserRuleReturnScope concept31 =null;
		ParserRuleReturnScope concept32 =null;

		AST t_tree=null;
		AST char_literal14_tree=null;
		AST FILLS15_tree=null;
		AST char_literal18_tree=null;
		AST char_literal19_tree=null;
		AST ALL20_tree=null;
		AST char_literal23_tree=null;
		AST char_literal24_tree=null;
		AST EXISTS25_tree=null;
		AST INTEGER26_tree=null;
		AST char_literal28_tree=null;
		AST char_literal29_tree=null;
		AST AND30_tree=null;
		AST char_literal33_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// DL.g:123:13
			int alt5=5;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==NAME) ) {
				alt5=1;
			}
			else if ( (LA5_0==72) ) {
				switch ( input.LA(2) ) {
				case FILLS:
					{
					alt5=2;
					}
					break;
				case ALL:
					{
					alt5=3;
					}
					break;
				case EXISTS:
					{
					alt5=4;
					}
					break;
				case AND:
					{
					alt5=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// DL.g:123:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_concept342); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,CONCEPT); 
					}
					break;
				case 2 :
					// DL.g:124:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal14=(Token)match(input,72,FOLLOW_72_in_concept362); 
					FILLS15=(Token)match(input,FILLS,FOLLOW_FILLS_in_concept365); 
					FILLS15_tree = (AST)adaptor.create(FILLS15);
					root_0 = (AST)adaptor.becomeRoot(FILLS15_tree, root_0);

					pushFollow(FOLLOW_role_in_concept369);
					role16=role();
					state._fsp--;

					adaptor.addChild(root_0, role16.getTree());

					pushFollow(FOLLOW_constant_in_concept371);
					constant17=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant17.getTree());

					char_literal18=(Token)match(input,73,FOLLOW_73_in_concept376); 
					}
					break;
				case 3 :
					// DL.g:125:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal19=(Token)match(input,72,FOLLOW_72_in_concept395); 
					ALL20=(Token)match(input,ALL,FOLLOW_ALL_in_concept398); 
					ALL20_tree = (AST)adaptor.create(ALL20);
					root_0 = (AST)adaptor.becomeRoot(ALL20_tree, root_0);

					pushFollow(FOLLOW_role_in_concept404);
					role21=role();
					state._fsp--;

					adaptor.addChild(root_0, role21.getTree());

					pushFollow(FOLLOW_concept_in_concept406);
					concept22=concept();
					state._fsp--;

					adaptor.addChild(root_0, concept22.getTree());

					char_literal23=(Token)match(input,73,FOLLOW_73_in_concept412); 
					}
					break;
				case 4 :
					// DL.g:126:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal24=(Token)match(input,72,FOLLOW_72_in_concept431); 
					EXISTS25=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_concept434); 
					EXISTS25_tree = (AST)adaptor.create(EXISTS25);
					root_0 = (AST)adaptor.becomeRoot(EXISTS25_tree, root_0);

					INTEGER26=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_concept437); 
					INTEGER26_tree = (AST)adaptor.create(INTEGER26);
					adaptor.addChild(root_0, INTEGER26_tree);

					pushFollow(FOLLOW_role_in_concept439);
					role27=role();
					state._fsp--;

					adaptor.addChild(root_0, role27.getTree());

					char_literal28=(Token)match(input,73,FOLLOW_73_in_concept445); 
					}
					break;
				case 5 :
					// DL.g:127:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal29=(Token)match(input,72,FOLLOW_72_in_concept464); 
					AND30=(Token)match(input,AND,FOLLOW_AND_in_concept467); 
					AND30_tree = (AST)adaptor.create(AND30);
					root_0 = (AST)adaptor.becomeRoot(AND30_tree, root_0);

					pushFollow(FOLLOW_concept_in_concept473);
					concept31=concept();
					state._fsp--;

					adaptor.addChild(root_0, concept31.getTree());

					// DL.g:127:38
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==NAME||LA4_0==72) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// DL.g:127:38
							{
							pushFollow(FOLLOW_concept_in_concept475);
							concept32=concept();
							state._fsp--;

							adaptor.addChild(root_0, concept32.getTree());

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					char_literal33=(Token)match(input,73,FOLLOW_73_in_concept478); 
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
	// $ANTLR end "concept"


	public static class role_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "role"
	// DL.g:130:1
	public final DLParser.role_return role() throws RecognitionException {
		DLParser.role_return retval = new DLParser.role_return();
		retval.start = input.LT(1);
		int role_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal34=null;

		AST t_tree=null;
		AST char_literal34_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// DL.g:130:13
			// DL.g:130:17
			{
			root_0 = (AST)adaptor.nil();


			char_literal34=(Token)match(input,68,FOLLOW_68_in_role509); 
			t=(Token)match(input,NAME,FOLLOW_NAME_in_role514); 
			t_tree = (AST)adaptor.create(t);
			adaptor.addChild(root_0, t_tree);

			 setType(t,ROLE); 
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
	// $ANTLR end "role"


	public static class constant_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// DL.g:132:1
	public final DLParser.constant_return constant() throws RecognitionException {
		DLParser.constant_return retval = new DLParser.constant_return();
		retval.start = input.LT(1);
		int constant_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulExpr35 =null;
		ParserRuleReturnScope opr136 =null;
		ParserRuleReturnScope mulExpr37 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// DL.g:132:13
			// DL.g:132:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_constant529);
			mulExpr35=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr35.getTree());

			// DL.g:132:25
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==63||LA6_0==65) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// DL.g:132:26
					{
					pushFollow(FOLLOW_opr1_in_constant532);
					opr136=opr1();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr136.getTree(), root_0);
					pushFollow(FOLLOW_mulExpr_in_constant535);
					mulExpr37=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr37.getTree());

					}
					break;

				default :
					break loop6;
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
	// $ANTLR end "constant"


	public static class mulExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// DL.g:133:1
	public final DLParser.mulExpr_return mulExpr() throws RecognitionException {
		DLParser.mulExpr_return retval = new DLParser.mulExpr_return();
		retval.start = input.LT(1);
		int mulExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negExpr38 =null;
		ParserRuleReturnScope opr239 =null;
		ParserRuleReturnScope negExpr40 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// DL.g:133:13
			// DL.g:133:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negExpr_in_mulExpr551);
			negExpr38=negExpr();
			state._fsp--;

			adaptor.addChild(root_0, negExpr38.getTree());

			// DL.g:133:25
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==59||LA7_0==62||LA7_0==67) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// DL.g:133:26
					{
					pushFollow(FOLLOW_opr2_in_mulExpr554);
					opr239=opr2();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr239.getTree(), root_0);
					pushFollow(FOLLOW_negExpr_in_mulExpr557);
					negExpr40=negExpr();
					state._fsp--;

					adaptor.addChild(root_0, negExpr40.getTree());

					}
					break;

				default :
					break loop7;
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
	// DL.g:134:1
	public final DLParser.negExpr_return negExpr() throws RecognitionException {
		DLParser.negExpr_return retval = new DLParser.negExpr_return();
		retval.start = input.LT(1);
		int negExpr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope atom41 =null;
		ParserRuleReturnScope atom42 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// DL.g:134:13
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==CONSTANT||LA8_0==FLOAT||LA8_0==INTEGER||LA8_0==STRING||LA8_0==60) ) {
				alt8=1;
			}
			else if ( (LA8_0==65) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// DL.g:134:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_negExpr573);
					atom41=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom41.getTree());

					}
					break;
				case 2 :
					// DL.g:135:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,65,FOLLOW_65_in_negExpr593); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,NEG); 
					pushFollow(FOLLOW_atom_in_negExpr598);
					atom42=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom42.getTree());

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


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// DL.g:137:1
	public final DLParser.atom_return atom() throws RecognitionException {
		DLParser.atom_return retval = new DLParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal43=null;
		Token char_literal45=null;
		ParserRuleReturnScope constant44 =null;

		AST t_tree=null;
		AST char_literal43_tree=null;
		AST char_literal45_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// DL.g:137:13
			int alt9=5;
			switch ( input.LA(1) ) {
			case CONSTANT:
				{
				alt9=1;
				}
				break;
			case STRING:
				{
				alt9=2;
				}
				break;
			case INTEGER:
				{
				alt9=3;
				}
				break;
			case FLOAT:
				{
				alt9=4;
				}
				break;
			case 60:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// DL.g:137:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_atom629); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					}
					break;
				case 2 :
					// DL.g:138:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,STRING,FOLLOW_STRING_in_atom649); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					}
					break;
				case 3 :
					// DL.g:139:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom669); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					}
					break;
				case 4 :
					// DL.g:140:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom689); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					}
					break;
				case 5 :
					// DL.g:141:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal43=(Token)match(input,60,FOLLOW_60_in_atom707); 
					pushFollow(FOLLOW_constant_in_atom710);
					constant44=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant44.getTree());

					char_literal45=(Token)match(input,61,FOLLOW_61_in_atom712); 
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


	public static class ropr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "ropr"
	// DL.g:144:1
	public final DLParser.ropr_return ropr() throws RecognitionException {
		DLParser.ropr_return retval = new DLParser.ropr_return();
		retval.start = input.LT(1);
		int ropr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token ISA46=null;

		AST t_tree=null;
		AST ISA46_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// DL.g:144:13
			int alt10=4;
			switch ( input.LA(1) ) {
			case ISA:
				{
				alt10=1;
				}
				break;
			case 69:
				{
				alt10=2;
				}
				break;
			case 71:
				{
				alt10=3;
				}
				break;
			case 70:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// DL.g:144:17
					{
					root_0 = (AST)adaptor.nil();


					ISA46=(Token)match(input,ISA,FOLLOW_ISA_in_ropr743); 
					ISA46_tree = (AST)adaptor.create(ISA46);
					adaptor.addChild(root_0, ISA46_tree);

					}
					break;
				case 2 :
					// DL.g:145:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,69,FOLLOW_69_in_ropr763); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,ISA); 
					}
					break;
				case 3 :
					// DL.g:146:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,71,FOLLOW_71_in_ropr786); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,SUBSUMES); 
					}
					break;
				case 4 :
					// DL.g:147:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,70,FOLLOW_70_in_ropr809); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,EQUIVALENTTO); 
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
	// $ANTLR end "ropr"


	public static class opr1_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr1"
	// DL.g:150:1
	public final DLParser.opr1_return opr1() throws RecognitionException {
		DLParser.opr1_return retval = new DLParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// DL.g:150:13
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==63) ) {
				alt11=1;
			}
			else if ( (LA11_0==65) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// DL.g:150:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,63,FOLLOW_63_in_opr1844); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,ADD); 
					}
					break;
				case 2 :
					// DL.g:151:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,65,FOLLOW_65_in_opr1866); 
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
	// DL.g:154:1
	public final DLParser.opr2_return opr2() throws RecognitionException {
		DLParser.opr2_return retval = new DLParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// DL.g:154:13
			int alt12=3;
			switch ( input.LA(1) ) {
			case 62:
				{
				alt12=1;
				}
				break;
			case 67:
				{
				alt12=2;
				}
				break;
			case 59:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// DL.g:154:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,62,FOLLOW_62_in_opr2900); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,MUL); 
					}
					break;
				case 2 :
					// DL.g:155:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,67,FOLLOW_67_in_opr2922); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,DIV); 
					}
					break;
				case 3 :
					// DL.g:156:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,59,FOLLOW_59_in_opr2944); 
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



	public static final BitSet FOLLOW_sentence_in_cunit190 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_EOF_in_cunit193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_sentence216 = new BitSet(new long[]{0x1000804010401000L,0x0000000000000102L});
	public static final BitSet FOLLOW_conceptExpr_in_sentence220 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_instanceOf_in_sentence224 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_sentence228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concept_in_conceptExpr240 = new BitSet(new long[]{0x0000000020000000L,0x00000000000000E0L});
	public static final BitSet FOLLOW_ropr_in_conceptExpr242 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_concept_in_conceptExpr245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_instanceOf257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
	public static final BitSet FOLLOW_64_in_instanceOf260 = new BitSet(new long[]{0x1000800010401000L,0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_instanceOf262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
	public static final BitSet FOLLOW_66_in_instanceOf268 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_concept_in_instanceOf270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_concept342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_concept362 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_FILLS_in_concept365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_role_in_concept369 = new BitSet(new long[]{0x1000800010401000L,0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_concept371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_concept376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_concept395 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALL_in_concept398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_role_in_concept404 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_concept_in_concept406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_concept412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_concept431 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EXISTS_in_concept434 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_INTEGER_in_concept437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_role_in_concept439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_concept445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_concept464 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_concept467 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_concept_in_concept473 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_concept_in_concept475 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_73_in_concept478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_role509 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_NAME_in_role514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulExpr_in_constant529 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_opr1_in_constant532 = new BitSet(new long[]{0x1000800010401000L,0x0000000000000002L});
	public static final BitSet FOLLOW_mulExpr_in_constant535 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr551 = new BitSet(new long[]{0x4800000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_opr2_in_mulExpr554 = new BitSet(new long[]{0x1000800010401000L,0x0000000000000002L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr557 = new BitSet(new long[]{0x4800000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_negExpr573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_negExpr593 = new BitSet(new long[]{0x1000800010401000L});
	public static final BitSet FOLLOW_atom_in_negExpr598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_atom629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atom669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_atom707 = new BitSet(new long[]{0x1000800010401000L,0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_atom710 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_atom712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ISA_in_ropr743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ropr763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_ropr786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ropr809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_opr1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_opr1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_opr2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_opr2922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_opr2944 = new BitSet(new long[]{0x0000000000000002L});
}
