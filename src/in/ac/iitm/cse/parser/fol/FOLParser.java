// $ANTLR 3.5.2 FOL.g 2022-04-06 16:37:41

package in.ac.iitm.cse.parser.fol;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class FOLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ADD", "AND", "B", "C", "COMMENT", 
		"CONS", "CONSTANT", "D", "DIV", "E", "EQ", "ESC_SEQ", "EXISTS", "EXPONENT", 
		"F", "FALSE", "FLOAT", "FORALL", "FUNCTION", "G", "GE", "GT", "H", "HEX_DIGIT", 
		"I", "IFF", "IMPLIEDBY", "IMPLIES", "INTEGER", "J", "K", "KB", "L", "LE", 
		"LT", "M", "MOD", "MUL", "N", "NAME", "NE", "NEG", "NIL", "NOT", "O", 
		"OCTAL_ESC", "OR", "P", "PREDICATE", "Q", "R", "S", "STRING", "SUB", "T", 
		"TRUE", "U", "UNICODE_ESC", "V", "VARIABLE", "VARLIST", "W", "WS", "X", 
		"Y", "Z", "'!='", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'.'", "'/'", "'<'", "'<='", "'<=>'", "'<>'", "'='", "'=>'", "'>'", 
		"'>='", "'['", "']'", "'{'", "'|'", "'||'", "'}'", "'~'"
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
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int A=4;
	public static final int ADD=5;
	public static final int AND=6;
	public static final int B=7;
	public static final int C=8;
	public static final int COMMENT=9;
	public static final int CONS=10;
	public static final int CONSTANT=11;
	public static final int D=12;
	public static final int DIV=13;
	public static final int E=14;
	public static final int EQ=15;
	public static final int ESC_SEQ=16;
	public static final int EXISTS=17;
	public static final int EXPONENT=18;
	public static final int F=19;
	public static final int FALSE=20;
	public static final int FLOAT=21;
	public static final int FORALL=22;
	public static final int FUNCTION=23;
	public static final int G=24;
	public static final int GE=25;
	public static final int GT=26;
	public static final int H=27;
	public static final int HEX_DIGIT=28;
	public static final int I=29;
	public static final int IFF=30;
	public static final int IMPLIEDBY=31;
	public static final int IMPLIES=32;
	public static final int INTEGER=33;
	public static final int J=34;
	public static final int K=35;
	public static final int KB=36;
	public static final int L=37;
	public static final int LE=38;
	public static final int LT=39;
	public static final int M=40;
	public static final int MOD=41;
	public static final int MUL=42;
	public static final int N=43;
	public static final int NAME=44;
	public static final int NE=45;
	public static final int NEG=46;
	public static final int NIL=47;
	public static final int NOT=48;
	public static final int O=49;
	public static final int OCTAL_ESC=50;
	public static final int OR=51;
	public static final int P=52;
	public static final int PREDICATE=53;
	public static final int Q=54;
	public static final int R=55;
	public static final int S=56;
	public static final int STRING=57;
	public static final int SUB=58;
	public static final int T=59;
	public static final int TRUE=60;
	public static final int U=61;
	public static final int UNICODE_ESC=62;
	public static final int V=63;
	public static final int VARIABLE=64;
	public static final int VARLIST=65;
	public static final int W=66;
	public static final int WS=67;
	public static final int X=68;
	public static final int Y=69;
	public static final int Z=70;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public FOLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public FOLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[27+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return FOLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "FOL.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// FOL.g:154:1
	public final FOLParser.cunit_return cunit() throws RecognitionException {
		FOLParser.cunit_return retval = new FOLParser.cunit_return();
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

			// FOL.g:154:13
			// FOL.g:154:17
			{
			// FOL.g:154:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==EXISTS||(LA1_0 >= FALSE && LA1_0 <= FORALL)||LA1_0==INTEGER||LA1_0==NAME||LA1_0==NOT||LA1_0==STRING||LA1_0==TRUE||LA1_0==VARIABLE||LA1_0==75||LA1_0==80||LA1_0==91||LA1_0==93||LA1_0==97) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// FOL.g:154:17
					{
					pushFollow(FOLLOW_sentence_in_cunit210);
					sentence1=sentence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit213); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: sentence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 154:31: -> ^( KB ( sentence )* )
			{
				// FOL.g:154:34
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(KB, "KB"), root_1);
				// FOL.g:154:39
				while ( stream_sentence.hasNext() ) {
					adaptor.addChild(root_1, stream_sentence.nextTree());
				}
				stream_sentence.reset();

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


	public static class sentence_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "sentence"
	// FOL.g:159:1
	public final FOLParser.sentence_return sentence() throws RecognitionException {
		FOLParser.sentence_return retval = new FOLParser.sentence_return();
		retval.start = input.LT(1);
		int sentence_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal4=null;
		ParserRuleReturnScope formula3 =null;

		AST char_literal4_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// FOL.g:159:13
			// FOL.g:159:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_formula_in_sentence239);
			formula3=formula();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formula3.getTree());

			char_literal4=(Token)match(input,81,FOLLOW_81_in_sentence241); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 2, sentence_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sentence"


	public static class formula_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "formula"
	// FOL.g:160:1
	public final FOLParser.formula_return formula() throws RecognitionException {
		FOLParser.formula_return retval = new FOLParser.formula_return();
		retval.start = input.LT(1);
		int formula_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope iffExpr5 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// FOL.g:160:13
			// FOL.g:160:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_iffExpr_in_formula256);
			iffExpr5=iffExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, iffExpr5.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 3, formula_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formula"


	public static class iffExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "iffExpr"
	// FOL.g:161:1
	public final FOLParser.iffExpr_return iffExpr() throws RecognitionException {
		FOLParser.iffExpr_return retval = new FOLParser.iffExpr_return();
		retval.start = input.LT(1);
		int iffExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope impliesExpr6 =null;
		ParserRuleReturnScope bopr17 =null;
		ParserRuleReturnScope iffExpr8 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// FOL.g:161:13
			// FOL.g:161:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_impliesExpr_in_iffExpr270);
			impliesExpr6=impliesExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, impliesExpr6.getTree());

			// FOL.g:161:29
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==IFF||LA2_0==85) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// FOL.g:161:31
					{
					pushFollow(FOLLOW_bopr1_in_iffExpr274);
					bopr17=bopr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(bopr17.getTree(), root_0);
					pushFollow(FOLLOW_iffExpr_in_iffExpr278);
					iffExpr8=iffExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, iffExpr8.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 4, iffExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "iffExpr"


	public static class impliesExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "impliesExpr"
	// FOL.g:162:1
	public final FOLParser.impliesExpr_return impliesExpr() throws RecognitionException {
		FOLParser.impliesExpr_return retval = new FOLParser.impliesExpr_return();
		retval.start = input.LT(1);
		int impliesExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope orExpr9 =null;
		ParserRuleReturnScope bopr210 =null;
		ParserRuleReturnScope impliesExpr11 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// FOL.g:162:13
			// FOL.g:162:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_orExpr_in_impliesExpr294);
			orExpr9=orExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpr9.getTree());

			// FOL.g:162:29
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= IMPLIEDBY && LA3_0 <= IMPLIES)||LA3_0==84||LA3_0==88) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// FOL.g:162:31
					{
					pushFollow(FOLLOW_bopr2_in_impliesExpr303);
					bopr210=bopr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(bopr210.getTree(), root_0);
					pushFollow(FOLLOW_impliesExpr_in_impliesExpr307);
					impliesExpr11=impliesExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, impliesExpr11.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 5, impliesExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "impliesExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// FOL.g:163:1
	public final FOLParser.orExpr_return orExpr() throws RecognitionException {
		FOLParser.orExpr_return retval = new FOLParser.orExpr_return();
		retval.start = input.LT(1);
		int orExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope andExpr12 =null;
		ParserRuleReturnScope bopr313 =null;
		ParserRuleReturnScope andExpr14 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// FOL.g:163:13
			// FOL.g:163:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr324);
			andExpr12=andExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr12.getTree());

			// FOL.g:163:29
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==OR||(LA4_0 >= 94 && LA4_0 <= 95)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// FOL.g:163:31
					{
					pushFollow(FOLLOW_bopr3_in_orExpr332);
					bopr313=bopr3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(bopr313.getTree(), root_0);
					pushFollow(FOLLOW_andExpr_in_orExpr336);
					andExpr14=andExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr14.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 6, orExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// FOL.g:164:1
	public final FOLParser.andExpr_return andExpr() throws RecognitionException {
		FOLParser.andExpr_return retval = new FOLParser.andExpr_return();
		retval.start = input.LT(1);
		int andExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope atom15 =null;
		ParserRuleReturnScope bopr416 =null;
		ParserRuleReturnScope atom17 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// FOL.g:164:13
			// FOL.g:164:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_atom_in_andExpr356);
			atom15=atom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atom15.getTree());

			// FOL.g:164:29
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==AND||(LA5_0 >= 73 && LA5_0 <= 74)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// FOL.g:164:31
					{
					pushFollow(FOLLOW_bopr4_in_andExpr367);
					bopr416=bopr4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(bopr416.getTree(), root_0);
					pushFollow(FOLLOW_atom_in_andExpr371);
					atom17=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom17.getTree());

					}
					break;

				default :
					break loop5;
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
			if ( state.backtracking>0 ) { memoize(input, 7, andExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// FOL.g:166:1
	public final FOLParser.atom_return atom() throws RecognitionException {
		FOLParser.atom_return retval = new FOLParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token TRUE18=null;
		Token FALSE19=null;
		Token FORALL20=null;
		Token EXISTS23=null;
		Token char_literal28=null;
		Token char_literal30=null;
		Token char_literal33=null;
		Token char_literal35=null;
		ParserRuleReturnScope varList21 =null;
		ParserRuleReturnScope atom22 =null;
		ParserRuleReturnScope varList24 =null;
		ParserRuleReturnScope atom25 =null;
		ParserRuleReturnScope bopr526 =null;
		ParserRuleReturnScope atom27 =null;
		ParserRuleReturnScope formula29 =null;
		ParserRuleReturnScope comparison31 =null;
		ParserRuleReturnScope predicate32 =null;
		ParserRuleReturnScope formula34 =null;

		AST TRUE18_tree=null;
		AST FALSE19_tree=null;
		AST FORALL20_tree=null;
		AST EXISTS23_tree=null;
		AST char_literal28_tree=null;
		AST char_literal30_tree=null;
		AST char_literal33_tree=null;
		AST char_literal35_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// FOL.g:167:13
			int alt6=9;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TRUE) ) {
				alt6=1;
			}
			else if ( (LA6_0==FALSE) ) {
				alt6=2;
			}
			else if ( (LA6_0==FORALL) ) {
				alt6=3;
			}
			else if ( (LA6_0==EXISTS) ) {
				alt6=4;
			}
			else if ( (LA6_0==NOT||LA6_0==97) ) {
				alt6=5;
			}
			else if ( (LA6_0==93) ) {
				alt6=6;
			}
			else if ( (LA6_0==INTEGER) && (synpred1_FOL())) {
				alt6=7;
			}
			else if ( (LA6_0==FLOAT) && (synpred1_FOL())) {
				alt6=7;
			}
			else if ( (LA6_0==STRING) && (synpred1_FOL())) {
				alt6=7;
			}
			else if ( (LA6_0==NAME) ) {
				int LA6_11 = input.LA(2);
				if ( (synpred1_FOL()) ) {
					alt6=7;
				}
				else if ( (true) ) {
					alt6=8;
				}

			}
			else if ( (LA6_0==VARIABLE) && (synpred1_FOL())) {
				alt6=7;
			}
			else if ( (LA6_0==75) ) {
				int LA6_13 = input.LA(2);
				if ( (synpred1_FOL()) ) {
					alt6=7;
				}
				else if ( (true) ) {
					alt6=9;
				}

			}
			else if ( (LA6_0==80) && (synpred1_FOL())) {
				alt6=7;
			}
			else if ( (LA6_0==91) && (synpred1_FOL())) {
				alt6=7;
			}

			switch (alt6) {
				case 1 :
					// FOL.g:167:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE18=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom403); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE18_tree = (AST)adaptor.create(TRUE18);
					adaptor.addChild(root_0, TRUE18_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:168:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE19=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom421); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE19_tree = (AST)adaptor.create(FALSE19);
					adaptor.addChild(root_0, FALSE19_tree);
					}

					}
					break;
				case 3 :
					// FOL.g:169:17
					{
					root_0 = (AST)adaptor.nil();


					FORALL20=(Token)match(input,FORALL,FOLLOW_FORALL_in_atom439); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FORALL20_tree = (AST)adaptor.create(FORALL20);
					root_0 = (AST)adaptor.becomeRoot(FORALL20_tree, root_0);
					}

					pushFollow(FOLLOW_varList_in_atom442);
					varList21=varList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varList21.getTree());

					pushFollow(FOLLOW_atom_in_atom444);
					atom22=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom22.getTree());

					}
					break;
				case 4 :
					// FOL.g:170:17
					{
					root_0 = (AST)adaptor.nil();


					EXISTS23=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom468); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXISTS23_tree = (AST)adaptor.create(EXISTS23);
					root_0 = (AST)adaptor.becomeRoot(EXISTS23_tree, root_0);
					}

					pushFollow(FOLLOW_varList_in_atom471);
					varList24=varList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varList24.getTree());

					pushFollow(FOLLOW_atom_in_atom473);
					atom25=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom25.getTree());

					}
					break;
				case 5 :
					// FOL.g:171:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_bopr5_in_atom497);
					bopr526=bopr5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(bopr526.getTree(), root_0);
					pushFollow(FOLLOW_atom_in_atom500);
					atom27=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom27.getTree());

					}
					break;
				case 6 :
					// FOL.g:172:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal28=(Token)match(input,93,FOLLOW_93_in_atom533); if (state.failed) return retval;
					pushFollow(FOLLOW_formula_in_atom536);
					formula29=formula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formula29.getTree());

					char_literal30=(Token)match(input,96,FOLLOW_96_in_atom538); if (state.failed) return retval;
					}
					break;
				case 7 :
					// FOL.g:175:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_comparison_in_atom585);
					comparison31=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison31.getTree());

					}
					break;
				case 8 :
					// FOL.g:176:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_atom604);
					predicate32=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate32.getTree());

					}
					break;
				case 9 :
					// FOL.g:177:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal33=(Token)match(input,75,FOLLOW_75_in_atom639); if (state.failed) return retval;
					pushFollow(FOLLOW_formula_in_atom642);
					formula34=formula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formula34.getTree());

					char_literal35=(Token)match(input,76,FOLLOW_76_in_atom644); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 8, atom_StartIndex); }

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
	// FOL.g:180:1
	public final FOLParser.comparison_return comparison() throws RecognitionException {
		FOLParser.comparison_return retval = new FOLParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope term36 =null;
		ParserRuleReturnScope copr37 =null;
		ParserRuleReturnScope term38 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// FOL.g:180:13
			// FOL.g:180:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_comparison678);
			term36=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term36.getTree());

			pushFollow(FOLLOW_copr_in_comparison680);
			copr37=copr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(copr37.getTree(), root_0);
			pushFollow(FOLLOW_term_in_comparison683);
			term38=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term38.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 9, comparison_StartIndex); }

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
	// FOL.g:181:1
	public final FOLParser.predicate_return predicate() throws RecognitionException {
		FOLParser.predicate_return retval = new FOLParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope termList40 =null;

		AST t_tree=null;
		AST char_literal39_tree=null;
		AST char_literal41_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// FOL.g:181:13
			// FOL.g:181:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_predicate697); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
			}

			char_literal39=(Token)match(input,75,FOLLOW_75_in_predicate700); if (state.failed) return retval;
			pushFollow(FOLLOW_termList_in_predicate703);
			termList40=termList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termList40.getTree());

			char_literal41=(Token)match(input,76,FOLLOW_76_in_predicate705); if (state.failed) return retval;
			if ( state.backtracking==0 ) { setType(t,PREDICATE); }
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
			if ( state.backtracking>0 ) { memoize(input, 10, predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class bopr1_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bopr1"
	// FOL.g:183:1
	public final FOLParser.bopr1_return bopr1() throws RecognitionException {
		FOLParser.bopr1_return retval = new FOLParser.bopr1_return();
		retval.start = input.LT(1);
		int bopr1_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token IFF42=null;

		AST t_tree=null;
		AST IFF42_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// FOL.g:183:13
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IFF) ) {
				alt7=1;
			}
			else if ( (LA7_0==85) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// FOL.g:183:17
					{
					root_0 = (AST)adaptor.nil();


					IFF42=(Token)match(input,IFF,FOLLOW_IFF_in_bopr1725); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IFF42_tree = (AST)adaptor.create(IFF42);
					adaptor.addChild(root_0, IFF42_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:184:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,85,FOLLOW_85_in_bopr1745); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,IFF); }
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
			if ( state.backtracking>0 ) { memoize(input, 11, bopr1_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bopr1"


	public static class bopr2_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bopr2"
	// FOL.g:187:1
	public final FOLParser.bopr2_return bopr2() throws RecognitionException {
		FOLParser.bopr2_return retval = new FOLParser.bopr2_return();
		retval.start = input.LT(1);
		int bopr2_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token IMPLIES43=null;
		Token IMPLIEDBY44=null;

		AST t_tree=null;
		AST IMPLIES43_tree=null;
		AST IMPLIEDBY44_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// FOL.g:187:13
			int alt8=4;
			switch ( input.LA(1) ) {
			case IMPLIES:
				{
				alt8=1;
				}
				break;
			case IMPLIEDBY:
				{
				alt8=2;
				}
				break;
			case 88:
				{
				alt8=3;
				}
				break;
			case 84:
				{
				alt8=4;
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
					// FOL.g:187:17
					{
					root_0 = (AST)adaptor.nil();


					IMPLIES43=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_bopr2780); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IMPLIES43_tree = (AST)adaptor.create(IMPLIES43);
					adaptor.addChild(root_0, IMPLIES43_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:188:17
					{
					root_0 = (AST)adaptor.nil();


					IMPLIEDBY44=(Token)match(input,IMPLIEDBY,FOLLOW_IMPLIEDBY_in_bopr2798); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IMPLIEDBY44_tree = (AST)adaptor.create(IMPLIEDBY44);
					adaptor.addChild(root_0, IMPLIEDBY44_tree);
					}

					}
					break;
				case 3 :
					// FOL.g:189:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,88,FOLLOW_88_in_bopr2818); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,IMPLIES); }
					}
					break;
				case 4 :
					// FOL.g:190:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,84,FOLLOW_84_in_bopr2845); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,IMPLIEDBY); }
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
			if ( state.backtracking>0 ) { memoize(input, 12, bopr2_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bopr2"


	public static class bopr3_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bopr3"
	// FOL.g:192:1
	public final FOLParser.bopr3_return bopr3() throws RecognitionException {
		FOLParser.bopr3_return retval = new FOLParser.bopr3_return();
		retval.start = input.LT(1);
		int bopr3_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token OR45=null;

		AST t_tree=null;
		AST OR45_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// FOL.g:192:13
			int alt9=3;
			switch ( input.LA(1) ) {
			case OR:
				{
				alt9=1;
				}
				break;
			case 95:
				{
				alt9=2;
				}
				break;
			case 94:
				{
				alt9=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// FOL.g:192:17
					{
					root_0 = (AST)adaptor.nil();


					OR45=(Token)match(input,OR,FOLLOW_OR_in_bopr3880); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR45_tree = (AST)adaptor.create(OR45);
					adaptor.addChild(root_0, OR45_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:193:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,95,FOLLOW_95_in_bopr3900); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,OR); }
					}
					break;
				case 3 :
					// FOL.g:194:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,94,FOLLOW_94_in_bopr3927); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,OR); }
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
			if ( state.backtracking>0 ) { memoize(input, 13, bopr3_StartIndex); }

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
	// FOL.g:197:1
	public final FOLParser.bopr4_return bopr4() throws RecognitionException {
		FOLParser.bopr4_return retval = new FOLParser.bopr4_return();
		retval.start = input.LT(1);
		int bopr4_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token AND46=null;

		AST t_tree=null;
		AST AND46_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// FOL.g:197:13
			int alt10=3;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt10=1;
				}
				break;
			case 73:
				{
				alt10=2;
				}
				break;
			case 74:
				{
				alt10=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// FOL.g:197:17
					{
					root_0 = (AST)adaptor.nil();


					AND46=(Token)match(input,AND,FOLLOW_AND_in_bopr4964); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND46_tree = (AST)adaptor.create(AND46);
					adaptor.addChild(root_0, AND46_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:198:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,73,FOLLOW_73_in_bopr4984); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,AND); }
					}
					break;
				case 3 :
					// FOL.g:199:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,74,FOLLOW_74_in_bopr41011); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,AND); }
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
			if ( state.backtracking>0 ) { memoize(input, 14, bopr4_StartIndex); }

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
	// FOL.g:202:1
	public final FOLParser.bopr5_return bopr5() throws RecognitionException {
		FOLParser.bopr5_return retval = new FOLParser.bopr5_return();
		retval.start = input.LT(1);
		int bopr5_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token NOT47=null;

		AST t_tree=null;
		AST NOT47_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// FOL.g:202:13
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==NOT) ) {
				alt11=1;
			}
			else if ( (LA11_0==97) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// FOL.g:202:17
					{
					root_0 = (AST)adaptor.nil();


					NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_bopr51048); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT47_tree = (AST)adaptor.create(NOT47);
					adaptor.addChild(root_0, NOT47_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:203:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,97,FOLLOW_97_in_bopr51068); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 15, bopr5_StartIndex); }

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
	// FOL.g:206:1
	public final FOLParser.copr_return copr() throws RecognitionException {
		FOLParser.copr_return retval = new FOLParser.copr_return();
		retval.start = input.LT(1);
		int copr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token LT48=null;
		Token LE49=null;
		Token EQ50=null;
		Token GE51=null;
		Token GT52=null;
		Token NE53=null;

		AST t_tree=null;
		AST LT48_tree=null;
		AST LE49_tree=null;
		AST EQ50_tree=null;
		AST GE51_tree=null;
		AST GT52_tree=null;
		AST NE53_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// FOL.g:206:13
			int alt12=12;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt12=1;
				}
				break;
			case 83:
				{
				alt12=2;
				}
				break;
			case LE:
				{
				alt12=3;
				}
				break;
			case EQ:
				{
				alt12=4;
				}
				break;
			case 87:
				{
				alt12=5;
				}
				break;
			case GE:
				{
				alt12=6;
				}
				break;
			case 90:
				{
				alt12=7;
				}
				break;
			case GT:
				{
				alt12=8;
				}
				break;
			case 89:
				{
				alt12=9;
				}
				break;
			case NE:
				{
				alt12=10;
				}
				break;
			case 71:
				{
				alt12=11;
				}
				break;
			case 86:
				{
				alt12=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// FOL.g:206:17
					{
					root_0 = (AST)adaptor.nil();


					LT48=(Token)match(input,LT,FOLLOW_LT_in_copr1106); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LT48_tree = (AST)adaptor.create(LT48);
					adaptor.addChild(root_0, LT48_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:206:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,83,FOLLOW_83_in_copr1112); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,LT); }
					}
					break;
				case 3 :
					// FOL.g:207:17
					{
					root_0 = (AST)adaptor.nil();


					LE49=(Token)match(input,LE,FOLLOW_LE_in_copr1133); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LE49_tree = (AST)adaptor.create(LE49);
					adaptor.addChild(root_0, LE49_tree);
					}

					}
					break;
				case 4 :
					// FOL.g:208:17
					{
					root_0 = (AST)adaptor.nil();


					EQ50=(Token)match(input,EQ,FOLLOW_EQ_in_copr1151); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQ50_tree = (AST)adaptor.create(EQ50);
					adaptor.addChild(root_0, EQ50_tree);
					}

					}
					break;
				case 5 :
					// FOL.g:208:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,87,FOLLOW_87_in_copr1157); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,EQ); }
					}
					break;
				case 6 :
					// FOL.g:209:17
					{
					root_0 = (AST)adaptor.nil();


					GE51=(Token)match(input,GE,FOLLOW_GE_in_copr1178); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GE51_tree = (AST)adaptor.create(GE51);
					adaptor.addChild(root_0, GE51_tree);
					}

					}
					break;
				case 7 :
					// FOL.g:209:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,90,FOLLOW_90_in_copr1184); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,GE); }
					}
					break;
				case 8 :
					// FOL.g:210:17
					{
					root_0 = (AST)adaptor.nil();


					GT52=(Token)match(input,GT,FOLLOW_GT_in_copr1204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GT52_tree = (AST)adaptor.create(GT52);
					adaptor.addChild(root_0, GT52_tree);
					}

					}
					break;
				case 9 :
					// FOL.g:210:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,89,FOLLOW_89_in_copr1210); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,GT); }
					}
					break;
				case 10 :
					// FOL.g:211:17
					{
					root_0 = (AST)adaptor.nil();


					NE53=(Token)match(input,NE,FOLLOW_NE_in_copr1231); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NE53_tree = (AST)adaptor.create(NE53);
					adaptor.addChild(root_0, NE53_tree);
					}

					}
					break;
				case 11 :
					// FOL.g:211:22
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,71,FOLLOW_71_in_copr1237); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NE); }
					}
					break;
				case 12 :
					// FOL.g:212:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,86,FOLLOW_86_in_copr1259); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 16, copr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "copr"


	public static class varList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "varList"
	// FOL.g:218:1
	public final FOLParser.varList_return varList() throws RecognitionException {
		FOLParser.varList_return retval = new FOLParser.varList_return();
		retval.start = input.LT(1);
		int varList_StartIndex = input.index();

		AST root_0 = null;

		Token VARIABLE54=null;
		Token VARIABLE55=null;
		Token char_literal56=null;
		Token VARIABLE57=null;

		AST VARIABLE54_tree=null;
		AST VARIABLE55_tree=null;
		AST char_literal56_tree=null;
		AST VARIABLE57_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// FOL.g:220:13
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VARIABLE) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==EXISTS||(LA14_1 >= FALSE && LA14_1 <= FORALL)||LA14_1==INTEGER||LA14_1==NAME||LA14_1==NOT||LA14_1==STRING||LA14_1==TRUE||LA14_1==VARIABLE||LA14_1==75||LA14_1==80||LA14_1==91||LA14_1==93||LA14_1==97) ) {
					alt14=1;
				}
				else if ( (LA14_1==79) ) {
					alt14=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// FOL.g:220:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE54=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_varList1306); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE54_tree = (AST)adaptor.create(VARIABLE54);
					adaptor.addChild(root_0, VARIABLE54_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:221:17
					{
					VARIABLE55=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_varList1324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE55);

					// FOL.g:221:26
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==79) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// FOL.g:221:28
							{
							char_literal56=(Token)match(input,79,FOLLOW_79_in_varList1328); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_79.add(char_literal56);

							VARIABLE57=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_varList1330); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE57);

							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					// AST REWRITE
					// elements: VARIABLE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 221:44: -> ^( VARLIST ( VARIABLE )+ )
					{
						// FOL.g:221:47
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VARLIST, "VARLIST"), root_1);
						if ( !(stream_VARIABLE.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_VARIABLE.hasNext() ) {
							adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						}
						stream_VARIABLE.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

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
			if ( state.backtracking>0 ) { memoize(input, 17, varList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varList"


	public static class termList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "termList"
	// FOL.g:224:1
	public final FOLParser.termList_return termList() throws RecognitionException {
		FOLParser.termList_return retval = new FOLParser.termList_return();
		retval.start = input.LT(1);
		int termList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal59=null;
		ParserRuleReturnScope term58 =null;
		ParserRuleReturnScope term60 =null;

		AST char_literal59_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// FOL.g:224:13
			// FOL.g:224:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_termList1368);
			term58=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term58.getTree());

			// FOL.g:224:22
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==79) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// FOL.g:224:24
					{
					char_literal59=(Token)match(input,79,FOLLOW_79_in_termList1372); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_termList1375);
					term60=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term60.getTree());

					}
					break;

				default :
					break loop15;
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
			if ( state.backtracking>0 ) { memoize(input, 18, termList_StartIndex); }

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
	// FOL.g:225:1
	public final FOLParser.term_return term() throws RecognitionException {
		FOLParser.term_return retval = new FOLParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope addTerm61 =null;
		ParserRuleReturnScope list62 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// FOL.g:225:13
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FLOAT||LA16_0==INTEGER||LA16_0==NAME||LA16_0==STRING||LA16_0==VARIABLE||LA16_0==75||LA16_0==80) ) {
				alt16=1;
			}
			else if ( (LA16_0==91) ) {
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
					// FOL.g:225:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_addTerm_in_term1395);
					addTerm61=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm61.getTree());

					}
					break;
				case 2 :
					// FOL.g:225:27
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_list_in_term1399);
					list62=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list62.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 19, term_StartIndex); }

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
	// FOL.g:227:1
	public final FOLParser.addTerm_return addTerm() throws RecognitionException {
		FOLParser.addTerm_return retval = new FOLParser.addTerm_return();
		retval.start = input.LT(1);
		int addTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulTerm63 =null;
		ParserRuleReturnScope opr164 =null;
		ParserRuleReturnScope mulTerm65 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// FOL.g:227:13
			// FOL.g:227:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulTerm_in_addTerm1414);
			mulTerm63=mulTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm63.getTree());

			// FOL.g:227:25
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==78||LA17_0==80) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// FOL.g:227:27
					{
					pushFollow(FOLLOW_opr1_in_addTerm1418);
					opr164=opr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr164.getTree(), root_0);
					pushFollow(FOLLOW_mulTerm_in_addTerm1421);
					mulTerm65=mulTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm65.getTree());

					}
					break;

				default :
					break loop17;
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
			if ( state.backtracking>0 ) { memoize(input, 20, addTerm_StartIndex); }

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
	// FOL.g:228:1
	public final FOLParser.mulTerm_return mulTerm() throws RecognitionException {
		FOLParser.mulTerm_return retval = new FOLParser.mulTerm_return();
		retval.start = input.LT(1);
		int mulTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negTerm66 =null;
		ParserRuleReturnScope opr267 =null;
		ParserRuleReturnScope negTerm68 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// FOL.g:228:13
			// FOL.g:228:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negTerm_in_mulTerm1438);
			negTerm66=negTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm66.getTree());

			// FOL.g:228:25
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==72||LA18_0==77||LA18_0==82) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// FOL.g:228:27
					{
					pushFollow(FOLLOW_opr2_in_mulTerm1442);
					opr267=opr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr267.getTree(), root_0);
					pushFollow(FOLLOW_negTerm_in_mulTerm1445);
					negTerm68=negTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm68.getTree());

					}
					break;

				default :
					break loop18;
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
			if ( state.backtracking>0 ) { memoize(input, 21, mulTerm_StartIndex); }

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
	// FOL.g:229:1
	public final FOLParser.negTerm_return negTerm() throws RecognitionException {
		FOLParser.negTerm_return retval = new FOLParser.negTerm_return();
		retval.start = input.LT(1);
		int negTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope atomicTerm69 =null;
		ParserRuleReturnScope atomicTerm70 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// FOL.g:229:13
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==FLOAT||LA19_0==INTEGER||LA19_0==NAME||LA19_0==STRING||LA19_0==VARIABLE||LA19_0==75) ) {
				alt19=1;
			}
			else if ( (LA19_0==80) ) {
				alt19=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// FOL.g:229:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomicTerm_in_negTerm1462);
					atomicTerm69=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm69.getTree());

					}
					break;
				case 2 :
					// FOL.g:230:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,80,FOLLOW_80_in_negTerm1482); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,NEG); }
					pushFollow(FOLLOW_atomicTerm_in_negTerm1487);
					atomicTerm70=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm70.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 22, negTerm_StartIndex); }

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
	// FOL.g:233:1
	public final FOLParser.atomicTerm_return atomicTerm() throws RecognitionException {
		FOLParser.atomicTerm_return retval = new FOLParser.atomicTerm_return();
		retval.start = input.LT(1);
		int atomicTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token INTEGER71=null;
		Token FLOAT72=null;
		Token STRING73=null;
		Token char_literal74=null;
		Token char_literal76=null;
		Token VARIABLE77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		ParserRuleReturnScope termList75 =null;
		ParserRuleReturnScope addTerm79 =null;

		AST t_tree=null;
		AST INTEGER71_tree=null;
		AST FLOAT72_tree=null;
		AST STRING73_tree=null;
		AST char_literal74_tree=null;
		AST char_literal76_tree=null;
		AST VARIABLE77_tree=null;
		AST char_literal78_tree=null;
		AST char_literal80_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// FOL.g:235:13
			int alt21=7;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt21=1;
				}
				break;
			case FLOAT:
				{
				alt21=2;
				}
				break;
			case STRING:
				{
				alt21=3;
				}
				break;
			case NAME:
				{
				int LA21_4 = input.LA(2);
				if ( (LA21_4==EOF||LA21_4==AND||LA21_4==EQ||(LA21_4 >= GE && LA21_4 <= GT)||(LA21_4 >= IFF && LA21_4 <= IMPLIES)||(LA21_4 >= LE && LA21_4 <= LT)||LA21_4==NE||LA21_4==OR||(LA21_4 >= 71 && LA21_4 <= 74)||(LA21_4 >= 76 && LA21_4 <= 90)||(LA21_4 >= 94 && LA21_4 <= 96)) ) {
					alt21=4;
				}
				else if ( (LA21_4==75) ) {
					alt21=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARIABLE:
				{
				alt21=6;
				}
				break;
			case 75:
				{
				alt21=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// FOL.g:235:17
					{
					root_0 = (AST)adaptor.nil();


					INTEGER71=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atomicTerm1529); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER71_tree = (AST)adaptor.create(INTEGER71);
					adaptor.addChild(root_0, INTEGER71_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:236:17
					{
					root_0 = (AST)adaptor.nil();


					FLOAT72=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atomicTerm1547); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT72_tree = (AST)adaptor.create(FLOAT72);
					adaptor.addChild(root_0, FLOAT72_tree);
					}

					}
					break;
				case 3 :
					// FOL.g:237:17
					{
					root_0 = (AST)adaptor.nil();


					STRING73=(Token)match(input,STRING,FOLLOW_STRING_in_atomicTerm1565); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING73_tree = (AST)adaptor.create(STRING73);
					adaptor.addChild(root_0, STRING73_tree);
					}

					}
					break;
				case 4 :
					// FOL.g:238:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1585); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,CONSTANT); }
					}
					break;
				case 5 :
					// FOL.g:239:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,FUNCTION); }
					char_literal74=(Token)match(input,75,FOLLOW_75_in_atomicTerm1613); if (state.failed) return retval;
					// FOL.g:239:56
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==FLOAT||LA20_0==INTEGER||LA20_0==NAME||LA20_0==STRING||LA20_0==VARIABLE||LA20_0==75||LA20_0==80||LA20_0==91) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// FOL.g:239:56
							{
							pushFollow(FOLLOW_termList_in_atomicTerm1616);
							termList75=termList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, termList75.getTree());

							}
							break;

					}

					char_literal76=(Token)match(input,76,FOLLOW_76_in_atomicTerm1619); if (state.failed) return retval;
					}
					break;
				case 6 :
					// FOL.g:240:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE77=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atomicTerm1638); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE77_tree = (AST)adaptor.create(VARIABLE77);
					adaptor.addChild(root_0, VARIABLE77_tree);
					}

					}
					break;
				case 7 :
					// FOL.g:241:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal78=(Token)match(input,75,FOLLOW_75_in_atomicTerm1656); if (state.failed) return retval;
					pushFollow(FOLLOW_addTerm_in_atomicTerm1659);
					addTerm79=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm79.getTree());

					char_literal80=(Token)match(input,76,FOLLOW_76_in_atomicTerm1661); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 23, atomicTerm_StartIndex); }

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
	// FOL.g:244:1
	public final FOLParser.list_return list() throws RecognitionException {
		FOLParser.list_return retval = new FOLParser.list_return();
		retval.start = input.LT(1);
		int list_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token VARIABLE84=null;
		Token char_literal86=null;
		ParserRuleReturnScope term82 =null;
		ParserRuleReturnScope list85 =null;

		AST t_tree=null;
		AST char_literal81_tree=null;
		AST char_literal83_tree=null;
		AST VARIABLE84_tree=null;
		AST char_literal86_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// FOL.g:246:13
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==91) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==92) ) {
					alt23=1;
				}
				else if ( (LA23_1==FLOAT||LA23_1==INTEGER||LA23_1==NAME||LA23_1==STRING||LA23_1==VARIABLE||LA23_1==75||LA23_1==80||LA23_1==91) ) {
					alt23=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// FOL.g:246:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,91,FOLLOW_91_in_list1706); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NIL); }
					char_literal81=(Token)match(input,92,FOLLOW_92_in_list1711); if (state.failed) return retval;
					}
					break;
				case 2 :
					// FOL.g:247:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,91,FOLLOW_91_in_list1732); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,CONS); }
					pushFollow(FOLLOW_term_in_list1757);
					term82=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term82.getTree());

					// FOL.g:249:21
					// FOL.g:249:23
					{
					char_literal83=(Token)match(input,94,FOLLOW_94_in_list1781); if (state.failed) return retval;
					// FOL.g:249:28
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==VARIABLE) ) {
						alt22=1;
					}
					else if ( (LA22_0==91) ) {
						alt22=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// FOL.g:249:29
							{
							VARIABLE84=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_list1785); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE84_tree = (AST)adaptor.create(VARIABLE84);
							adaptor.addChild(root_0, VARIABLE84_tree);
							}

							}
							break;
						case 2 :
							// FOL.g:249:40
							{
							pushFollow(FOLLOW_list_in_list1789);
							list85=list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, list85.getTree());

							}
							break;

					}

					}

					char_literal86=(Token)match(input,92,FOLLOW_92_in_list1810); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 24, list_StartIndex); }

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
	// FOL.g:263:1
	public final FOLParser.opr1_return opr1() throws RecognitionException {
		FOLParser.opr1_return retval = new FOLParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// FOL.g:263:13
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==78) ) {
				alt24=1;
			}
			else if ( (LA24_0==80) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// FOL.g:263:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,78,FOLLOW_78_in_opr11845); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,ADD); }
					}
					break;
				case 2 :
					// FOL.g:264:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,80,FOLLOW_80_in_opr11867); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 25, opr1_StartIndex); }

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
	// FOL.g:267:1
	public final FOLParser.opr2_return opr2() throws RecognitionException {
		FOLParser.opr2_return retval = new FOLParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// FOL.g:267:13
			int alt25=3;
			switch ( input.LA(1) ) {
			case 77:
				{
				alt25=1;
				}
				break;
			case 82:
				{
				alt25=2;
				}
				break;
			case 72:
				{
				alt25=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// FOL.g:267:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,77,FOLLOW_77_in_opr21901); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,MUL); }
					}
					break;
				case 2 :
					// FOL.g:268:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,82,FOLLOW_82_in_opr21923); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,DIV); }
					}
					break;
				case 3 :
					// FOL.g:269:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,72,FOLLOW_72_in_opr21945); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 26, opr2_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "opr2"

	// $ANTLR start synpred1_FOL
	public final void synpred1_FOL_fragment() throws RecognitionException {
		// FOL.g:175:17
		// FOL.g:175:18
		{
		pushFollow(FOLLOW_comparison_in_synpred1_FOL581);
		comparison();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_FOL

	// Delegated rules

	public final boolean synpred1_FOL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_FOL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_sentence_in_cunit210 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_EOF_in_cunit213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formula_in_sentence239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_sentence241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iffExpr_in_formula256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_impliesExpr_in_iffExpr270 = new BitSet(new long[]{0x0000000040000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_bopr1_in_iffExpr274 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_iffExpr_in_iffExpr278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_impliesExpr294 = new BitSet(new long[]{0x0000000180000002L,0x0000000001100000L});
	public static final BitSet FOLLOW_bopr2_in_impliesExpr303 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_impliesExpr_in_impliesExpr307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr324 = new BitSet(new long[]{0x0008000000000002L,0x00000000C0000000L});
	public static final BitSet FOLLOW_bopr3_in_orExpr332 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_andExpr_in_orExpr336 = new BitSet(new long[]{0x0008000000000002L,0x00000000C0000000L});
	public static final BitSet FOLLOW_atom_in_andExpr356 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000600L});
	public static final BitSet FOLLOW_bopr4_in_andExpr367 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_atom_in_andExpr371 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000600L});
	public static final BitSet FOLLOW_TRUE_in_atom403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_atom421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORALL_in_atom439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_varList_in_atom442 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_atom_in_atom444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXISTS_in_atom468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_varList_in_atom471 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_atom_in_atom473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bopr5_in_atom497 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_atom_in_atom500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_atom533 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_formula_in_atom536 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_atom538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_atom585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_atom604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_atom639 = new BitSet(new long[]{0x1201100200720000L,0x0000000228010801L});
	public static final BitSet FOLLOW_formula_in_atom642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_atom644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_comparison678 = new BitSet(new long[]{0x000020C006008000L,0x0000000006C80080L});
	public static final BitSet FOLLOW_copr_in_comparison680 = new BitSet(new long[]{0x0200100200200000L,0x0000000008010801L});
	public static final BitSet FOLLOW_term_in_comparison683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_predicate697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_predicate700 = new BitSet(new long[]{0x0200100200200000L,0x0000000008010801L});
	public static final BitSet FOLLOW_termList_in_predicate703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_predicate705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IFF_in_bopr1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_bopr1745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLIES_in_bopr2780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLIEDBY_in_bopr2798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_bopr2818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_bopr2845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_bopr3880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_bopr3900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_bopr3927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_bopr4964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_bopr4984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_bopr41011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_bopr51048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_bopr51068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_copr1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_copr1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LE_in_copr1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_copr1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_copr1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GE_in_copr1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_copr1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_copr1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_copr1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NE_in_copr1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_copr1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_copr1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_varList1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_varList1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_varList1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_VARIABLE_in_varList1330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_term_in_termList1368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_termList1372 = new BitSet(new long[]{0x0200100200200000L,0x0000000008010801L});
	public static final BitSet FOLLOW_term_in_termList1375 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_addTerm_in_term1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_term1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm1414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000014000L});
	public static final BitSet FOLLOW_opr1_in_addTerm1418 = new BitSet(new long[]{0x0200100200200000L,0x0000000000010801L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm1421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000014000L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm1438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000042100L});
	public static final BitSet FOLLOW_opr2_in_mulTerm1442 = new BitSet(new long[]{0x0200100200200000L,0x0000000000010801L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm1445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000042100L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_negTerm1482 = new BitSet(new long[]{0x0200100200200000L,0x0000000000000801L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atomicTerm1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atomicTerm1547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atomicTerm1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_atomicTerm1613 = new BitSet(new long[]{0x0200100200200000L,0x0000000008011801L});
	public static final BitSet FOLLOW_termList_in_atomicTerm1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_atomicTerm1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_atomicTerm1638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_atomicTerm1656 = new BitSet(new long[]{0x0200100200200000L,0x0000000000010801L});
	public static final BitSet FOLLOW_addTerm_in_atomicTerm1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_atomicTerm1661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_list1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_list1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_list1732 = new BitSet(new long[]{0x0200100200200000L,0x0000000008010801L});
	public static final BitSet FOLLOW_term_in_list1757 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_list1781 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000001L});
	public static final BitSet FOLLOW_VARIABLE_in_list1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_list_in_list1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_list1810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_opr11845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_opr11867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_opr21901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_opr21923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_opr21945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_synpred1_FOL581 = new BitSet(new long[]{0x0000000000000002L});
}
