// $ANTLR 3.5.2 MAN.g 2022-04-06 16:37:43

package in.ac.iitm.cse.parser.man;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class MANParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "Asymmetric", "CARD", "COMMENT", 
		"COMPOSE", "CONCEPT", "Characteristics", "Class", "DifferentFrom", "DifferentIndividuals", 
		"DisjointClasses", "DisjointProperties", "DisjointUnionOf", "DisjointWith", 
		"Domain", "ESC_SEQ", "EXACTLY", "EXISTS", "EquivalentClasses", "EquivalentProperties", 
		"EquivalentTo", "FACT", "FILLS", "FORALL", "Facts", "Functional", "HEX_DIGIT", 
		"INDIVIDUAL", "INDIVIDUALS", "INTEGER", "INVERSE", "Individual", "InverseFunctional", 
		"InverseOf", "Irreflexive", "KB", "MAX", "MIN", "NAME", "NOT", "OCTAL_ESC", 
		"ONLY", "OR", "ObjectProperty", "Ontology", "Prefix", "ROLE", "Range", 
		"Reflexive", "SELF", "SOME", "STRING", "SameAs", "SameIndividual", "SubClassOf", 
		"SubPropertyChain", "SubPropertyOf", "Symmetric", "Transitive", "Types", 
		"UNICODE_ESC", "VALUE", "WS", "WS_2", "'('", "')'", "','", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int AND=4;
	public static final int Asymmetric=5;
	public static final int CARD=6;
	public static final int COMMENT=7;
	public static final int COMPOSE=8;
	public static final int CONCEPT=9;
	public static final int Characteristics=10;
	public static final int Class=11;
	public static final int DifferentFrom=12;
	public static final int DifferentIndividuals=13;
	public static final int DisjointClasses=14;
	public static final int DisjointProperties=15;
	public static final int DisjointUnionOf=16;
	public static final int DisjointWith=17;
	public static final int Domain=18;
	public static final int ESC_SEQ=19;
	public static final int EXACTLY=20;
	public static final int EXISTS=21;
	public static final int EquivalentClasses=22;
	public static final int EquivalentProperties=23;
	public static final int EquivalentTo=24;
	public static final int FACT=25;
	public static final int FILLS=26;
	public static final int FORALL=27;
	public static final int Facts=28;
	public static final int Functional=29;
	public static final int HEX_DIGIT=30;
	public static final int INDIVIDUAL=31;
	public static final int INDIVIDUALS=32;
	public static final int INTEGER=33;
	public static final int INVERSE=34;
	public static final int Individual=35;
	public static final int InverseFunctional=36;
	public static final int InverseOf=37;
	public static final int Irreflexive=38;
	public static final int KB=39;
	public static final int MAX=40;
	public static final int MIN=41;
	public static final int NAME=42;
	public static final int NOT=43;
	public static final int OCTAL_ESC=44;
	public static final int ONLY=45;
	public static final int OR=46;
	public static final int ObjectProperty=47;
	public static final int Ontology=48;
	public static final int Prefix=49;
	public static final int ROLE=50;
	public static final int Range=51;
	public static final int Reflexive=52;
	public static final int SELF=53;
	public static final int SOME=54;
	public static final int STRING=55;
	public static final int SameAs=56;
	public static final int SameIndividual=57;
	public static final int SubClassOf=58;
	public static final int SubPropertyChain=59;
	public static final int SubPropertyOf=60;
	public static final int Symmetric=61;
	public static final int Transitive=62;
	public static final int Types=63;
	public static final int UNICODE_ESC=64;
	public static final int VALUE=65;
	public static final int WS=66;
	public static final int WS_2=67;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MANParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MANParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[29+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return MANParser.tokenNames; }
	@Override public String getGrammarFileName() { return "MAN.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// MAN.g:145:1
	public final MANParser.cunit_return cunit() throws RecognitionException {
		MANParser.cunit_return retval = new MANParser.cunit_return();
		retval.start = input.LT(1);
		int cunit_StartIndex = input.index();

		AST root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope frame1 =null;

		AST EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_frame=new RewriteRuleSubtreeStream(adaptor,"rule frame");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// MAN.g:145:13
			// MAN.g:145:17
			{
			// MAN.g:145:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Class||(LA1_0 >= DifferentIndividuals && LA1_0 <= DisjointProperties)||(LA1_0 >= EquivalentClasses && LA1_0 <= EquivalentProperties)||LA1_0==Individual||LA1_0==ObjectProperty||LA1_0==SameIndividual) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// MAN.g:145:17
					{
					pushFollow(FOLLOW_frame_in_cunit179);
					frame1=frame();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_frame.add(frame1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit182); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: frame
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 145:28: -> ^( KB ( frame )* )
			{
				// MAN.g:145:31
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(KB, "KB"), root_1);
				// MAN.g:145:36
				while ( stream_frame.hasNext() ) {
					adaptor.addChild(root_1, stream_frame.nextTree());
				}
				stream_frame.reset();

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


	public static class frame_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "frame"
	// MAN.g:147:1
	public final MANParser.frame_return frame() throws RecognitionException {
		MANParser.frame_return retval = new MANParser.frame_return();
		retval.start = input.LT(1);
		int frame_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope classFrame3 =null;
		ParserRuleReturnScope roleFrame4 =null;
		ParserRuleReturnScope individualFrame5 =null;
		ParserRuleReturnScope misc6 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// MAN.g:147:13
			int alt2=4;
			switch ( input.LA(1) ) {
			case Class:
				{
				alt2=1;
				}
				break;
			case ObjectProperty:
				{
				alt2=2;
				}
				break;
			case Individual:
				{
				alt2=3;
				}
				break;
			case DifferentIndividuals:
			case DisjointClasses:
			case DisjointProperties:
			case EquivalentClasses:
			case EquivalentProperties:
			case SameIndividual:
				{
				alt2=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// MAN.g:147:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_classFrame_in_frame208);
					classFrame3=classFrame();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classFrame3.getTree());

					}
					break;
				case 2 :
					// MAN.g:148:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_roleFrame_in_frame226);
					roleFrame4=roleFrame();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleFrame4.getTree());

					}
					break;
				case 3 :
					// MAN.g:149:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_individualFrame_in_frame244);
					individualFrame5=individualFrame();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, individualFrame5.getTree());

					}
					break;
				case 4 :
					// MAN.g:150:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_misc_in_frame262);
					misc6=misc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, misc6.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 2, frame_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "frame"


	public static class classFrame_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "classFrame"
	// MAN.g:153:1
	public final MANParser.classFrame_return classFrame() throws RecognitionException {
		MANParser.classFrame_return retval = new MANParser.classFrame_return();
		retval.start = input.LT(1);
		int classFrame_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token Class7=null;
		ParserRuleReturnScope classBody8 =null;

		AST n_tree=null;
		AST Class7_tree=null;
		RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// MAN.g:153:13
			// MAN.g:153:17
			{
			Class7=(Token)match(input,Class,FOLLOW_Class_in_classFrame286); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Class.add(Class7);

			n=(Token)match(input,NAME,FOLLOW_NAME_in_classFrame290); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(n);

			// MAN.g:153:30
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= DisjointUnionOf && LA3_0 <= DisjointWith)||LA3_0==EquivalentTo||LA3_0==SubClassOf) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// MAN.g:153:30
					{
					pushFollow(FOLLOW_classBody_in_classFrame292);
					classBody8=classBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classBody.add(classBody8.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: Class, classBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 154:17: -> ^( Class CONCEPT[$n] ( classBody )* )
			{
				// MAN.g:154:20
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot(stream_Class.nextNode(), root_1);
				adaptor.addChild(root_1, (AST)adaptor.create(CONCEPT, n));
				// MAN.g:154:40
				while ( stream_classBody.hasNext() ) {
					adaptor.addChild(root_1, stream_classBody.nextTree());
				}
				stream_classBody.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 3, classFrame_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classFrame"


	public static class classBody_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "classBody"
	// MAN.g:157:1
	public final MANParser.classBody_return classBody() throws RecognitionException {
		MANParser.classBody_return retval = new MANParser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();

		AST root_0 = null;

		Token SubClassOf9=null;
		Token EquivalentTo11=null;
		Token DisjointWith13=null;
		Token DisjointUnionOf15=null;
		ParserRuleReturnScope descriptionList10 =null;
		ParserRuleReturnScope descriptionList12 =null;
		ParserRuleReturnScope descriptionList14 =null;
		ParserRuleReturnScope description2List16 =null;

		AST SubClassOf9_tree=null;
		AST EquivalentTo11_tree=null;
		AST DisjointWith13_tree=null;
		AST DisjointUnionOf15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// MAN.g:157:13
			int alt4=4;
			switch ( input.LA(1) ) {
			case SubClassOf:
				{
				alt4=1;
				}
				break;
			case EquivalentTo:
				{
				alt4=2;
				}
				break;
			case DisjointWith:
				{
				alt4=3;
				}
				break;
			case DisjointUnionOf:
				{
				alt4=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// MAN.g:157:17
					{
					root_0 = (AST)adaptor.nil();


					SubClassOf9=(Token)match(input,SubClassOf,FOLLOW_SubClassOf_in_classBody346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SubClassOf9_tree = (AST)adaptor.create(SubClassOf9);
					root_0 = (AST)adaptor.becomeRoot(SubClassOf9_tree, root_0);
					}

					pushFollow(FOLLOW_descriptionList_in_classBody350);
					descriptionList10=descriptionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, descriptionList10.getTree());

					}
					break;
				case 2 :
					// MAN.g:158:17
					{
					root_0 = (AST)adaptor.nil();


					EquivalentTo11=(Token)match(input,EquivalentTo,FOLLOW_EquivalentTo_in_classBody368); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EquivalentTo11_tree = (AST)adaptor.create(EquivalentTo11);
					root_0 = (AST)adaptor.becomeRoot(EquivalentTo11_tree, root_0);
					}

					pushFollow(FOLLOW_descriptionList_in_classBody371);
					descriptionList12=descriptionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, descriptionList12.getTree());

					}
					break;
				case 3 :
					// MAN.g:159:17
					{
					root_0 = (AST)adaptor.nil();


					DisjointWith13=(Token)match(input,DisjointWith,FOLLOW_DisjointWith_in_classBody389); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DisjointWith13_tree = (AST)adaptor.create(DisjointWith13);
					root_0 = (AST)adaptor.becomeRoot(DisjointWith13_tree, root_0);
					}

					pushFollow(FOLLOW_descriptionList_in_classBody392);
					descriptionList14=descriptionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, descriptionList14.getTree());

					}
					break;
				case 4 :
					// MAN.g:160:17
					{
					root_0 = (AST)adaptor.nil();


					DisjointUnionOf15=(Token)match(input,DisjointUnionOf,FOLLOW_DisjointUnionOf_in_classBody410); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DisjointUnionOf15_tree = (AST)adaptor.create(DisjointUnionOf15);
					root_0 = (AST)adaptor.becomeRoot(DisjointUnionOf15_tree, root_0);
					}

					pushFollow(FOLLOW_description2List_in_classBody413);
					description2List16=description2List();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, description2List16.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 4, classBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class roleFrame_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "roleFrame"
	// MAN.g:163:1
	public final MANParser.roleFrame_return roleFrame() throws RecognitionException {
		MANParser.roleFrame_return retval = new MANParser.roleFrame_return();
		retval.start = input.LT(1);
		int roleFrame_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token ObjectProperty17=null;
		ParserRuleReturnScope roleBody18 =null;

		AST n_tree=null;
		AST ObjectProperty17_tree=null;
		RewriteRuleTokenStream stream_ObjectProperty=new RewriteRuleTokenStream(adaptor,"token ObjectProperty");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_roleBody=new RewriteRuleSubtreeStream(adaptor,"rule roleBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// MAN.g:163:13
			// MAN.g:163:17
			{
			ObjectProperty17=(Token)match(input,ObjectProperty,FOLLOW_ObjectProperty_in_roleFrame438); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ObjectProperty.add(ObjectProperty17);

			n=(Token)match(input,NAME,FOLLOW_NAME_in_roleFrame442); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(n);

			// MAN.g:163:39
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==Characteristics||(LA5_0 >= DisjointWith && LA5_0 <= Domain)||LA5_0==EquivalentTo||LA5_0==InverseOf||LA5_0==Range||(LA5_0 >= SubPropertyChain && LA5_0 <= SubPropertyOf)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// MAN.g:163:39
					{
					pushFollow(FOLLOW_roleBody_in_roleFrame444);
					roleBody18=roleBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_roleBody.add(roleBody18.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: roleBody, ObjectProperty
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 164:17: -> ^( ObjectProperty ROLE[$n] ( roleBody )* )
			{
				// MAN.g:164:20
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot(stream_ObjectProperty.nextNode(), root_1);
				adaptor.addChild(root_1, (AST)adaptor.create(ROLE, n));
				// MAN.g:164:46
				while ( stream_roleBody.hasNext() ) {
					adaptor.addChild(root_1, stream_roleBody.nextTree());
				}
				stream_roleBody.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 5, roleFrame_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "roleFrame"


	public static class roleBody_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "roleBody"
	// MAN.g:167:1
	public final MANParser.roleBody_return roleBody() throws RecognitionException {
		MANParser.roleBody_return retval = new MANParser.roleBody_return();
		retval.start = input.LT(1);
		int roleBody_StartIndex = input.index();

		AST root_0 = null;

		Token Characteristics19=null;
		Token Domain21=null;
		Token Range23=null;
		Token SubPropertyOf25=null;
		Token EquivalentTo27=null;
		Token DisjointWith29=null;
		Token InverseOf31=null;
		Token SubPropertyChain33=null;
		ParserRuleReturnScope characteristicList20 =null;
		ParserRuleReturnScope descriptionList22 =null;
		ParserRuleReturnScope descriptionList24 =null;
		ParserRuleReturnScope roleExprList26 =null;
		ParserRuleReturnScope roleExprList28 =null;
		ParserRuleReturnScope roleExprList30 =null;
		ParserRuleReturnScope roleExprList32 =null;
		ParserRuleReturnScope roleChain34 =null;

		AST Characteristics19_tree=null;
		AST Domain21_tree=null;
		AST Range23_tree=null;
		AST SubPropertyOf25_tree=null;
		AST EquivalentTo27_tree=null;
		AST DisjointWith29_tree=null;
		AST InverseOf31_tree=null;
		AST SubPropertyChain33_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// MAN.g:167:13
			int alt6=8;
			switch ( input.LA(1) ) {
			case Characteristics:
				{
				alt6=1;
				}
				break;
			case Domain:
				{
				alt6=2;
				}
				break;
			case Range:
				{
				alt6=3;
				}
				break;
			case SubPropertyOf:
				{
				alt6=4;
				}
				break;
			case EquivalentTo:
				{
				alt6=5;
				}
				break;
			case DisjointWith:
				{
				alt6=6;
				}
				break;
			case InverseOf:
				{
				alt6=7;
				}
				break;
			case SubPropertyChain:
				{
				alt6=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// MAN.g:167:17
					{
					root_0 = (AST)adaptor.nil();


					Characteristics19=(Token)match(input,Characteristics,FOLLOW_Characteristics_in_roleBody499); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Characteristics19_tree = (AST)adaptor.create(Characteristics19);
					root_0 = (AST)adaptor.becomeRoot(Characteristics19_tree, root_0);
					}

					pushFollow(FOLLOW_characteristicList_in_roleBody502);
					characteristicList20=characteristicList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, characteristicList20.getTree());

					}
					break;
				case 2 :
					// MAN.g:168:17
					{
					root_0 = (AST)adaptor.nil();


					Domain21=(Token)match(input,Domain,FOLLOW_Domain_in_roleBody520); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Domain21_tree = (AST)adaptor.create(Domain21);
					root_0 = (AST)adaptor.becomeRoot(Domain21_tree, root_0);
					}

					pushFollow(FOLLOW_descriptionList_in_roleBody523);
					descriptionList22=descriptionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, descriptionList22.getTree());

					}
					break;
				case 3 :
					// MAN.g:169:17
					{
					root_0 = (AST)adaptor.nil();


					Range23=(Token)match(input,Range,FOLLOW_Range_in_roleBody541); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Range23_tree = (AST)adaptor.create(Range23);
					root_0 = (AST)adaptor.becomeRoot(Range23_tree, root_0);
					}

					pushFollow(FOLLOW_descriptionList_in_roleBody544);
					descriptionList24=descriptionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, descriptionList24.getTree());

					}
					break;
				case 4 :
					// MAN.g:170:17
					{
					root_0 = (AST)adaptor.nil();


					SubPropertyOf25=(Token)match(input,SubPropertyOf,FOLLOW_SubPropertyOf_in_roleBody562); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SubPropertyOf25_tree = (AST)adaptor.create(SubPropertyOf25);
					root_0 = (AST)adaptor.becomeRoot(SubPropertyOf25_tree, root_0);
					}

					pushFollow(FOLLOW_roleExprList_in_roleBody565);
					roleExprList26=roleExprList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExprList26.getTree());

					}
					break;
				case 5 :
					// MAN.g:171:17
					{
					root_0 = (AST)adaptor.nil();


					EquivalentTo27=(Token)match(input,EquivalentTo,FOLLOW_EquivalentTo_in_roleBody583); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EquivalentTo27_tree = (AST)adaptor.create(EquivalentTo27);
					root_0 = (AST)adaptor.becomeRoot(EquivalentTo27_tree, root_0);
					}

					pushFollow(FOLLOW_roleExprList_in_roleBody586);
					roleExprList28=roleExprList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExprList28.getTree());

					}
					break;
				case 6 :
					// MAN.g:172:17
					{
					root_0 = (AST)adaptor.nil();


					DisjointWith29=(Token)match(input,DisjointWith,FOLLOW_DisjointWith_in_roleBody604); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DisjointWith29_tree = (AST)adaptor.create(DisjointWith29);
					root_0 = (AST)adaptor.becomeRoot(DisjointWith29_tree, root_0);
					}

					pushFollow(FOLLOW_roleExprList_in_roleBody607);
					roleExprList30=roleExprList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExprList30.getTree());

					}
					break;
				case 7 :
					// MAN.g:173:17
					{
					root_0 = (AST)adaptor.nil();


					InverseOf31=(Token)match(input,InverseOf,FOLLOW_InverseOf_in_roleBody625); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					InverseOf31_tree = (AST)adaptor.create(InverseOf31);
					root_0 = (AST)adaptor.becomeRoot(InverseOf31_tree, root_0);
					}

					pushFollow(FOLLOW_roleExprList_in_roleBody628);
					roleExprList32=roleExprList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExprList32.getTree());

					}
					break;
				case 8 :
					// MAN.g:174:17
					{
					root_0 = (AST)adaptor.nil();


					SubPropertyChain33=(Token)match(input,SubPropertyChain,FOLLOW_SubPropertyChain_in_roleBody646); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SubPropertyChain33_tree = (AST)adaptor.create(SubPropertyChain33);
					root_0 = (AST)adaptor.becomeRoot(SubPropertyChain33_tree, root_0);
					}

					pushFollow(FOLLOW_roleChain_in_roleBody649);
					roleChain34=roleChain();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleChain34.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 6, roleBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "roleBody"


	public static class individualFrame_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "individualFrame"
	// MAN.g:177:1
	public final MANParser.individualFrame_return individualFrame() throws RecognitionException {
		MANParser.individualFrame_return retval = new MANParser.individualFrame_return();
		retval.start = input.LT(1);
		int individualFrame_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token Individual35=null;
		ParserRuleReturnScope individualBody36 =null;

		AST n_tree=null;
		AST Individual35_tree=null;
		RewriteRuleTokenStream stream_Individual=new RewriteRuleTokenStream(adaptor,"token Individual");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_individualBody=new RewriteRuleSubtreeStream(adaptor,"rule individualBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// MAN.g:178:13
			// MAN.g:178:17
			{
			Individual35=(Token)match(input,Individual,FOLLOW_Individual_in_individualFrame684); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Individual.add(Individual35);

			n=(Token)match(input,NAME,FOLLOW_NAME_in_individualFrame688); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(n);

			// MAN.g:178:35
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==DifferentFrom||LA7_0==Facts||LA7_0==SameAs||LA7_0==Types) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// MAN.g:178:35
					{
					pushFollow(FOLLOW_individualBody_in_individualFrame690);
					individualBody36=individualBody();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_individualBody.add(individualBody36.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			// AST REWRITE
			// elements: individualBody, Individual
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 179:17: -> ^( Individual INDIVIDUAL[$n] ( individualBody )* )
			{
				// MAN.g:179:21
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot(stream_Individual.nextNode(), root_1);
				adaptor.addChild(root_1, (AST)adaptor.create(INDIVIDUAL, n));
				// MAN.g:179:49
				while ( stream_individualBody.hasNext() ) {
					adaptor.addChild(root_1, stream_individualBody.nextTree());
				}
				stream_individualBody.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 7, individualFrame_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "individualFrame"


	public static class individualBody_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "individualBody"
	// MAN.g:182:1
	public final MANParser.individualBody_return individualBody() throws RecognitionException {
		MANParser.individualBody_return retval = new MANParser.individualBody_return();
		retval.start = input.LT(1);
		int individualBody_StartIndex = input.index();

		AST root_0 = null;

		Token Types37=null;
		Token Facts39=null;
		Token SameAs41=null;
		Token DifferentFrom43=null;
		ParserRuleReturnScope descriptionList38 =null;
		ParserRuleReturnScope factList40 =null;
		ParserRuleReturnScope individualList42 =null;
		ParserRuleReturnScope individualList44 =null;

		AST Types37_tree=null;
		AST Facts39_tree=null;
		AST SameAs41_tree=null;
		AST DifferentFrom43_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// MAN.g:183:13
			int alt8=4;
			switch ( input.LA(1) ) {
			case Types:
				{
				alt8=1;
				}
				break;
			case Facts:
				{
				alt8=2;
				}
				break;
			case SameAs:
				{
				alt8=3;
				}
				break;
			case DifferentFrom:
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
					// MAN.g:183:17
					{
					root_0 = (AST)adaptor.nil();


					Types37=(Token)match(input,Types,FOLLOW_Types_in_individualBody755); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Types37_tree = (AST)adaptor.create(Types37);
					root_0 = (AST)adaptor.becomeRoot(Types37_tree, root_0);
					}

					pushFollow(FOLLOW_descriptionList_in_individualBody758);
					descriptionList38=descriptionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, descriptionList38.getTree());

					}
					break;
				case 2 :
					// MAN.g:184:17
					{
					root_0 = (AST)adaptor.nil();


					Facts39=(Token)match(input,Facts,FOLLOW_Facts_in_individualBody776); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Facts39_tree = (AST)adaptor.create(Facts39);
					root_0 = (AST)adaptor.becomeRoot(Facts39_tree, root_0);
					}

					pushFollow(FOLLOW_factList_in_individualBody779);
					factList40=factList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factList40.getTree());

					}
					break;
				case 3 :
					// MAN.g:185:17
					{
					root_0 = (AST)adaptor.nil();


					SameAs41=(Token)match(input,SameAs,FOLLOW_SameAs_in_individualBody797); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SameAs41_tree = (AST)adaptor.create(SameAs41);
					root_0 = (AST)adaptor.becomeRoot(SameAs41_tree, root_0);
					}

					pushFollow(FOLLOW_individualList_in_individualBody800);
					individualList42=individualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, individualList42.getTree());

					}
					break;
				case 4 :
					// MAN.g:186:17
					{
					root_0 = (AST)adaptor.nil();


					DifferentFrom43=(Token)match(input,DifferentFrom,FOLLOW_DifferentFrom_in_individualBody818); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DifferentFrom43_tree = (AST)adaptor.create(DifferentFrom43);
					root_0 = (AST)adaptor.becomeRoot(DifferentFrom43_tree, root_0);
					}

					pushFollow(FOLLOW_individualList_in_individualBody821);
					individualList44=individualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, individualList44.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 8, individualBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "individualBody"


	public static class misc_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "misc"
	// MAN.g:189:1
	public final MANParser.misc_return misc() throws RecognitionException {
		MANParser.misc_return retval = new MANParser.misc_return();
		retval.start = input.LT(1);
		int misc_StartIndex = input.index();

		AST root_0 = null;

		Token EquivalentClasses45=null;
		Token DisjointClasses47=null;
		Token EquivalentProperties49=null;
		Token DisjointProperties51=null;
		Token SameIndividual53=null;
		Token DifferentIndividuals55=null;
		ParserRuleReturnScope description2List46 =null;
		ParserRuleReturnScope description2List48 =null;
		ParserRuleReturnScope role2List50 =null;
		ParserRuleReturnScope role2List52 =null;
		ParserRuleReturnScope individual2List54 =null;
		ParserRuleReturnScope individual2List56 =null;

		AST EquivalentClasses45_tree=null;
		AST DisjointClasses47_tree=null;
		AST EquivalentProperties49_tree=null;
		AST DisjointProperties51_tree=null;
		AST SameIndividual53_tree=null;
		AST DifferentIndividuals55_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// MAN.g:189:13
			int alt9=6;
			switch ( input.LA(1) ) {
			case EquivalentClasses:
				{
				alt9=1;
				}
				break;
			case DisjointClasses:
				{
				alt9=2;
				}
				break;
			case EquivalentProperties:
				{
				alt9=3;
				}
				break;
			case DisjointProperties:
				{
				alt9=4;
				}
				break;
			case SameIndividual:
				{
				alt9=5;
				}
				break;
			case DifferentIndividuals:
				{
				alt9=6;
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
					// MAN.g:189:17
					{
					root_0 = (AST)adaptor.nil();


					EquivalentClasses45=(Token)match(input,EquivalentClasses,FOLLOW_EquivalentClasses_in_misc851); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EquivalentClasses45_tree = (AST)adaptor.create(EquivalentClasses45);
					root_0 = (AST)adaptor.becomeRoot(EquivalentClasses45_tree, root_0);
					}

					pushFollow(FOLLOW_description2List_in_misc854);
					description2List46=description2List();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, description2List46.getTree());

					}
					break;
				case 2 :
					// MAN.g:190:17
					{
					root_0 = (AST)adaptor.nil();


					DisjointClasses47=(Token)match(input,DisjointClasses,FOLLOW_DisjointClasses_in_misc872); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DisjointClasses47_tree = (AST)adaptor.create(DisjointClasses47);
					root_0 = (AST)adaptor.becomeRoot(DisjointClasses47_tree, root_0);
					}

					pushFollow(FOLLOW_description2List_in_misc875);
					description2List48=description2List();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, description2List48.getTree());

					}
					break;
				case 3 :
					// MAN.g:191:17
					{
					root_0 = (AST)adaptor.nil();


					EquivalentProperties49=(Token)match(input,EquivalentProperties,FOLLOW_EquivalentProperties_in_misc893); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EquivalentProperties49_tree = (AST)adaptor.create(EquivalentProperties49);
					root_0 = (AST)adaptor.becomeRoot(EquivalentProperties49_tree, root_0);
					}

					pushFollow(FOLLOW_role2List_in_misc896);
					role2List50=role2List();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, role2List50.getTree());

					}
					break;
				case 4 :
					// MAN.g:192:17
					{
					root_0 = (AST)adaptor.nil();


					DisjointProperties51=(Token)match(input,DisjointProperties,FOLLOW_DisjointProperties_in_misc914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DisjointProperties51_tree = (AST)adaptor.create(DisjointProperties51);
					root_0 = (AST)adaptor.becomeRoot(DisjointProperties51_tree, root_0);
					}

					pushFollow(FOLLOW_role2List_in_misc917);
					role2List52=role2List();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, role2List52.getTree());

					}
					break;
				case 5 :
					// MAN.g:193:17
					{
					root_0 = (AST)adaptor.nil();


					SameIndividual53=(Token)match(input,SameIndividual,FOLLOW_SameIndividual_in_misc935); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SameIndividual53_tree = (AST)adaptor.create(SameIndividual53);
					root_0 = (AST)adaptor.becomeRoot(SameIndividual53_tree, root_0);
					}

					pushFollow(FOLLOW_individual2List_in_misc938);
					individual2List54=individual2List();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, individual2List54.getTree());

					}
					break;
				case 6 :
					// MAN.g:194:17
					{
					root_0 = (AST)adaptor.nil();


					DifferentIndividuals55=(Token)match(input,DifferentIndividuals,FOLLOW_DifferentIndividuals_in_misc956); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DifferentIndividuals55_tree = (AST)adaptor.create(DifferentIndividuals55);
					root_0 = (AST)adaptor.becomeRoot(DifferentIndividuals55_tree, root_0);
					}

					pushFollow(FOLLOW_individual2List_in_misc959);
					individual2List56=individual2List();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, individual2List56.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 9, misc_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "misc"


	public static class characteristicList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "characteristicList"
	// MAN.g:197:1
	public final MANParser.characteristicList_return characteristicList() throws RecognitionException {
		MANParser.characteristicList_return retval = new MANParser.characteristicList_return();
		retval.start = input.LT(1);
		int characteristicList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal58=null;
		ParserRuleReturnScope characteristic57 =null;
		ParserRuleReturnScope characteristic59 =null;

		AST char_literal58_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// MAN.g:197:21
			// MAN.g:197:25
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_characteristic_in_characteristicList983);
			characteristic57=characteristic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, characteristic57.getTree());

			// MAN.g:197:40
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==70) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// MAN.g:197:41
					{
					char_literal58=(Token)match(input,70,FOLLOW_70_in_characteristicList986); if (state.failed) return retval;
					pushFollow(FOLLOW_characteristic_in_characteristicList989);
					characteristic59=characteristic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, characteristic59.getTree());

					}
					break;

				default :
					break loop10;
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
			if ( state.backtracking>0 ) { memoize(input, 10, characteristicList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "characteristicList"


	public static class descriptionList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "descriptionList"
	// MAN.g:198:1
	public final MANParser.descriptionList_return descriptionList() throws RecognitionException {
		MANParser.descriptionList_return retval = new MANParser.descriptionList_return();
		retval.start = input.LT(1);
		int descriptionList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal61=null;
		ParserRuleReturnScope description60 =null;
		ParserRuleReturnScope description62 =null;

		AST char_literal61_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// MAN.g:198:21
			// MAN.g:198:25
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_description_in_descriptionList1005);
			description60=description();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, description60.getTree());

			// MAN.g:198:37
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==70) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// MAN.g:198:38
					{
					char_literal61=(Token)match(input,70,FOLLOW_70_in_descriptionList1008); if (state.failed) return retval;
					pushFollow(FOLLOW_description_in_descriptionList1011);
					description62=description();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, description62.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 11, descriptionList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "descriptionList"


	public static class description2List_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "description2List"
	// MAN.g:199:1
	public final MANParser.description2List_return description2List() throws RecognitionException {
		MANParser.description2List_return retval = new MANParser.description2List_return();
		retval.start = input.LT(1);
		int description2List_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal64=null;
		ParserRuleReturnScope description63 =null;
		ParserRuleReturnScope description65 =null;

		AST char_literal64_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// MAN.g:199:21
			// MAN.g:199:25
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_description_in_description2List1026);
			description63=description();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, description63.getTree());

			// MAN.g:199:37
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==70) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// MAN.g:199:38
					{
					char_literal64=(Token)match(input,70,FOLLOW_70_in_description2List1029); if (state.failed) return retval;
					pushFollow(FOLLOW_description_in_description2List1032);
					description65=description();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, description65.getTree());

					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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
			if ( state.backtracking>0 ) { memoize(input, 12, description2List_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "description2List"


	public static class roleExprList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "roleExprList"
	// MAN.g:200:1
	public final MANParser.roleExprList_return roleExprList() throws RecognitionException {
		MANParser.roleExprList_return retval = new MANParser.roleExprList_return();
		retval.start = input.LT(1);
		int roleExprList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal67=null;
		ParserRuleReturnScope roleExpr66 =null;
		ParserRuleReturnScope roleExpr68 =null;

		AST char_literal67_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// MAN.g:200:21
			// MAN.g:200:25
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_roleExpr_in_roleExprList1051);
			roleExpr66=roleExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExpr66.getTree());

			// MAN.g:200:34
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==70) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// MAN.g:200:35
					{
					char_literal67=(Token)match(input,70,FOLLOW_70_in_roleExprList1054); if (state.failed) return retval;
					pushFollow(FOLLOW_roleExpr_in_roleExprList1057);
					roleExpr68=roleExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExpr68.getTree());

					}
					break;

				default :
					break loop13;
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
			if ( state.backtracking>0 ) { memoize(input, 13, roleExprList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "roleExprList"


	public static class roleChain_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "roleChain"
	// MAN.g:201:1
	public final MANParser.roleChain_return roleChain() throws RecognitionException {
		MANParser.roleChain_return retval = new MANParser.roleChain_return();
		retval.start = input.LT(1);
		int roleChain_StartIndex = input.index();

		AST root_0 = null;

		Token COMPOSE70=null;
		ParserRuleReturnScope roleExpr69 =null;
		ParserRuleReturnScope roleExpr71 =null;

		AST COMPOSE70_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// MAN.g:201:21
			// MAN.g:201:25
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_roleExpr_in_roleChain1079);
			roleExpr69=roleExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExpr69.getTree());

			// MAN.g:201:34
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMPOSE) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// MAN.g:201:35
					{
					COMPOSE70=(Token)match(input,COMPOSE,FOLLOW_COMPOSE_in_roleChain1082); if (state.failed) return retval;
					pushFollow(FOLLOW_roleExpr_in_roleChain1085);
					roleExpr71=roleExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, roleExpr71.getTree());

					}
					break;

				default :
					break loop14;
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
			if ( state.backtracking>0 ) { memoize(input, 14, roleChain_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "roleChain"


	public static class role2List_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "role2List"
	// MAN.g:202:1
	public final MANParser.role2List_return role2List() throws RecognitionException {
		MANParser.role2List_return retval = new MANParser.role2List_return();
		retval.start = input.LT(1);
		int role2List_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token char_literal72=null;

		AST n_tree=null;
		AST char_literal72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// MAN.g:202:21
			// MAN.g:202:25
			{
			root_0 = (AST)adaptor.nil();


			n=(Token)match(input,NAME,FOLLOW_NAME_in_role2List1109); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			n_tree = (AST)adaptor.create(n);
			adaptor.addChild(root_0, n_tree);
			}

			if ( state.backtracking==0 ) { setType(n,ROLE); }
			// MAN.g:202:54
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==70) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// MAN.g:202:55
					{
					char_literal72=(Token)match(input,70,FOLLOW_70_in_role2List1114); if (state.failed) return retval;
					n=(Token)match(input,NAME,FOLLOW_NAME_in_role2List1119); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					n_tree = (AST)adaptor.create(n);
					adaptor.addChild(root_0, n_tree);
					}

					if ( state.backtracking==0 ) { setType(n,ROLE); }
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
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
			if ( state.backtracking>0 ) { memoize(input, 15, role2List_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "role2List"


	public static class individual2List_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "individual2List"
	// MAN.g:203:1
	public final MANParser.individual2List_return individual2List() throws RecognitionException {
		MANParser.individual2List_return retval = new MANParser.individual2List_return();
		retval.start = input.LT(1);
		int individual2List_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token char_literal73=null;

		AST n_tree=null;
		AST char_literal73_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// MAN.g:203:21
			// MAN.g:203:25
			{
			root_0 = (AST)adaptor.nil();


			n=(Token)match(input,NAME,FOLLOW_NAME_in_individual2List1140); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			n_tree = (AST)adaptor.create(n);
			adaptor.addChild(root_0, n_tree);
			}

			if ( state.backtracking==0 ) { setType(n,INDIVIDUAL); }
			// MAN.g:203:60
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==70) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// MAN.g:203:61
					{
					char_literal73=(Token)match(input,70,FOLLOW_70_in_individual2List1145); if (state.failed) return retval;
					n=(Token)match(input,NAME,FOLLOW_NAME_in_individual2List1150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					n_tree = (AST)adaptor.create(n);
					adaptor.addChild(root_0, n_tree);
					}

					if ( state.backtracking==0 ) { setType(n,INDIVIDUAL); }
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
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
			if ( state.backtracking>0 ) { memoize(input, 16, individual2List_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "individual2List"


	public static class factList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "factList"
	// MAN.g:204:1
	public final MANParser.factList_return factList() throws RecognitionException {
		MANParser.factList_return retval = new MANParser.factList_return();
		retval.start = input.LT(1);
		int factList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal75=null;
		ParserRuleReturnScope fact74 =null;
		ParserRuleReturnScope fact76 =null;

		AST char_literal75_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// MAN.g:204:21
			// MAN.g:204:25
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_fact_in_factList1176);
			fact74=fact();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fact74.getTree());

			// MAN.g:204:30
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==70) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// MAN.g:204:31
					{
					char_literal75=(Token)match(input,70,FOLLOW_70_in_factList1179); if (state.failed) return retval;
					pushFollow(FOLLOW_fact_in_factList1182);
					fact76=fact();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fact76.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 17, factList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "factList"


	public static class description_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "description"
	// MAN.g:206:1
	public final MANParser.description_return description() throws RecognitionException {
		MANParser.description_return retval = new MANParser.description_return();
		retval.start = input.LT(1);
		int description_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token OR79=null;
		ParserRuleReturnScope conjunction77 =null;
		ParserRuleReturnScope conjunction78 =null;
		ParserRuleReturnScope conjunction80 =null;
		ParserRuleReturnScope conjunction81 =null;

		AST t_tree=null;
		AST OR79_tree=null;
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
		RewriteRuleSubtreeStream stream_conjunction=new RewriteRuleSubtreeStream(adaptor,"rule conjunction");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// MAN.g:206:13
			int alt19=2;
			switch ( input.LA(1) ) {
			case NOT:
				{
				int LA19_1 = input.LA(2);
				if ( (synpred1_MAN()) ) {
					alt19=1;
				}
				else if ( (true) ) {
					alt19=2;
				}

				}
				break;
			case NAME:
				{
				int LA19_2 = input.LA(2);
				if ( (synpred1_MAN()) ) {
					alt19=1;
				}
				else if ( (true) ) {
					alt19=2;
				}

				}
				break;
			case INVERSE:
				{
				int LA19_3 = input.LA(2);
				if ( (synpred1_MAN()) ) {
					alt19=1;
				}
				else if ( (true) ) {
					alt19=2;
				}

				}
				break;
			case 71:
				{
				int LA19_4 = input.LA(2);
				if ( (synpred1_MAN()) ) {
					alt19=1;
				}
				else if ( (true) ) {
					alt19=2;
				}

				}
				break;
			case 68:
				{
				int LA19_5 = input.LA(2);
				if ( (synpred1_MAN()) ) {
					alt19=1;
				}
				else if ( (true) ) {
					alt19=2;
				}

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
					// MAN.g:206:17
					{
					pushFollow(FOLLOW_conjunction_in_description1203);
					conjunction77=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conjunction.add(conjunction77.getTree());
					t=(Token)match(input,OR,FOLLOW_OR_in_description1207); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OR.add(t);

					pushFollow(FOLLOW_conjunction_in_description1209);
					conjunction78=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conjunction.add(conjunction78.getTree());
					// MAN.g:206:66
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==OR) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// MAN.g:206:67
							{
							OR79=(Token)match(input,OR,FOLLOW_OR_in_description1212); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_OR.add(OR79);

							pushFollow(FOLLOW_conjunction_in_description1214);
							conjunction80=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_conjunction.add(conjunction80.getTree());
							}
							break;

						default :
							break loop18;
						}
					}

					// AST REWRITE
					// elements: OR, conjunction
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 206:84: -> ^( OR[$t] ( conjunction )+ )
					{
						// MAN.g:206:87
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(OR, t), root_1);
						if ( !(stream_conjunction.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_conjunction.hasNext() ) {
							adaptor.addChild(root_1, stream_conjunction.nextTree());
						}
						stream_conjunction.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// MAN.g:207:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_conjunction_in_description1244);
					conjunction81=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction81.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 18, description_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "description"


	public static class conjunction_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "conjunction"
	// MAN.g:210:1
	public final MANParser.conjunction_return conjunction() throws RecognitionException {
		MANParser.conjunction_return retval = new MANParser.conjunction_return();
		retval.start = input.LT(1);
		int conjunction_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token AND84=null;
		ParserRuleReturnScope primary82 =null;
		ParserRuleReturnScope primary83 =null;
		ParserRuleReturnScope primary85 =null;
		ParserRuleReturnScope primary86 =null;

		AST t_tree=null;
		AST AND84_tree=null;
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// MAN.g:210:13
			int alt21=2;
			switch ( input.LA(1) ) {
			case NOT:
				{
				int LA21_1 = input.LA(2);
				if ( (synpred2_MAN()) ) {
					alt21=1;
				}
				else if ( (true) ) {
					alt21=2;
				}

				}
				break;
			case NAME:
				{
				int LA21_2 = input.LA(2);
				if ( (synpred2_MAN()) ) {
					alt21=1;
				}
				else if ( (true) ) {
					alt21=2;
				}

				}
				break;
			case INVERSE:
				{
				int LA21_3 = input.LA(2);
				if ( (synpred2_MAN()) ) {
					alt21=1;
				}
				else if ( (true) ) {
					alt21=2;
				}

				}
				break;
			case 71:
				{
				int LA21_4 = input.LA(2);
				if ( (synpred2_MAN()) ) {
					alt21=1;
				}
				else if ( (true) ) {
					alt21=2;
				}

				}
				break;
			case 68:
				{
				int LA21_5 = input.LA(2);
				if ( (synpred2_MAN()) ) {
					alt21=1;
				}
				else if ( (true) ) {
					alt21=2;
				}

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
					// MAN.g:210:17
					{
					pushFollow(FOLLOW_primary_in_conjunction1275);
					primary82=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary82.getTree());
					t=(Token)match(input,AND,FOLLOW_AND_in_conjunction1279); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AND.add(t);

					pushFollow(FOLLOW_primary_in_conjunction1281);
					primary83=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary83.getTree());
					// MAN.g:210:56
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==AND) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// MAN.g:210:57
							{
							AND84=(Token)match(input,AND,FOLLOW_AND_in_conjunction1284); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AND.add(AND84);

							pushFollow(FOLLOW_primary_in_conjunction1286);
							primary85=primary();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_primary.add(primary85.getTree());
							}
							break;

						default :
							break loop20;
						}
					}

					// AST REWRITE
					// elements: AND, primary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 210:71: -> ^( AND[$t] ( primary )+ )
					{
						// MAN.g:210:74
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(AND, t), root_1);
						if ( !(stream_primary.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_primary.hasNext() ) {
							adaptor.addChild(root_1, stream_primary.nextTree());
						}
						stream_primary.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// MAN.g:211:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_primary_in_conjunction1316);
					primary86=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary86.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 19, conjunction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conjunction"


	public static class restriction_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "restriction"
	// MAN.g:214:1
	public final MANParser.restriction_return restriction() throws RecognitionException {
		MANParser.restriction_return retval = new MANParser.restriction_return();
		retval.start = input.LT(1);
		int restriction_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token n=null;
		Token MIN90=null;
		Token MAX92=null;
		Token EXACTLY94=null;
		ParserRuleReturnScope roleExpr87 =null;
		ParserRuleReturnScope primary288 =null;
		ParserRuleReturnScope primary289 =null;
		ParserRuleReturnScope primary291 =null;
		ParserRuleReturnScope primary293 =null;
		ParserRuleReturnScope primary295 =null;

		AST t_tree=null;
		AST n_tree=null;
		AST MIN90_tree=null;
		AST MAX92_tree=null;
		AST EXACTLY94_tree=null;
		RewriteRuleTokenStream stream_EXACTLY=new RewriteRuleTokenStream(adaptor,"token EXACTLY");
		RewriteRuleTokenStream stream_SOME=new RewriteRuleTokenStream(adaptor,"token SOME");
		RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
		RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
		RewriteRuleTokenStream stream_ONLY=new RewriteRuleTokenStream(adaptor,"token ONLY");
		RewriteRuleTokenStream stream_SELF=new RewriteRuleTokenStream(adaptor,"token SELF");
		RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
		RewriteRuleSubtreeStream stream_primary2=new RewriteRuleSubtreeStream(adaptor,"rule primary2");
		RewriteRuleSubtreeStream stream_roleExpr=new RewriteRuleSubtreeStream(adaptor,"rule roleExpr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// MAN.g:214:13
			// MAN.g:214:17
			{
			pushFollow(FOLLOW_roleExpr_in_restriction1339);
			roleExpr87=roleExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_roleExpr.add(roleExpr87.getTree());
			// MAN.g:215:13
			int alt25=7;
			switch ( input.LA(1) ) {
			case SOME:
				{
				alt25=1;
				}
				break;
			case ONLY:
				{
				alt25=2;
				}
				break;
			case VALUE:
				{
				alt25=3;
				}
				break;
			case SELF:
				{
				alt25=4;
				}
				break;
			case MIN:
				{
				alt25=5;
				}
				break;
			case MAX:
				{
				alt25=6;
				}
				break;
			case EXACTLY:
				{
				alt25=7;
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
					// MAN.g:215:17
					{
					t=(Token)match(input,SOME,FOLLOW_SOME_in_restriction1359); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SOME.add(t);

					pushFollow(FOLLOW_primary2_in_restriction1361);
					primary288=primary2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary2.add(primary288.getTree());
					// AST REWRITE
					// elements: primary2, roleExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 215:34: -> ^( EXISTS roleExpr primary2 )
					{
						// MAN.g:215:37
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(EXISTS, "EXISTS"), root_1);
						adaptor.addChild(root_1, stream_roleExpr.nextTree());
						adaptor.addChild(root_1, stream_primary2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// MAN.g:216:17
					{
					t=(Token)match(input,ONLY,FOLLOW_ONLY_in_restriction1392); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ONLY.add(t);

					pushFollow(FOLLOW_primary2_in_restriction1394);
					primary289=primary2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary2.add(primary289.getTree());
					// AST REWRITE
					// elements: primary2, roleExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 216:34: -> ^( FORALL roleExpr primary2 )
					{
						// MAN.g:216:37
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FORALL, "FORALL"), root_1);
						adaptor.addChild(root_1, stream_roleExpr.nextTree());
						adaptor.addChild(root_1, stream_primary2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// MAN.g:217:17
					{
					t=(Token)match(input,VALUE,FOLLOW_VALUE_in_restriction1425); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VALUE.add(t);

					n=(Token)match(input,NAME,FOLLOW_NAME_in_restriction1429); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(n);

					// AST REWRITE
					// elements: roleExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 217:33: -> ^( FILLS roleExpr INDIVIDUAL[$n] )
					{
						// MAN.g:217:36
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FILLS, "FILLS"), root_1);
						adaptor.addChild(root_1, stream_roleExpr.nextTree());
						adaptor.addChild(root_1, (AST)adaptor.create(INDIVIDUAL, n));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// MAN.g:218:17
					{
					t=(Token)match(input,SELF,FOLLOW_SELF_in_restriction1461); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SELF.add(t);

					// AST REWRITE
					// elements: SELF, roleExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 218:33: -> ^( SELF roleExpr )
					{
						// MAN.g:218:36
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_SELF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_roleExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// MAN.g:219:17
					{
					MIN90=(Token)match(input,MIN,FOLLOW_MIN_in_restriction1496); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MIN.add(MIN90);

					n=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_restriction1500); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER.add(n);

					// MAN.g:219:31
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( ((LA22_0 >= NAME && LA22_0 <= NOT)||LA22_0==68||LA22_0==71) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// MAN.g:219:31
							{
							pushFollow(FOLLOW_primary2_in_restriction1502);
							primary291=primary2();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_primary2.add(primary291.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: roleExpr, primary2, MIN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 219:45: -> ^( MIN CARD[$n] roleExpr ( primary2 )? )
					{
						// MAN.g:219:48
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_MIN.nextNode(), root_1);
						adaptor.addChild(root_1, (AST)adaptor.create(CARD, n));
						adaptor.addChild(root_1, stream_roleExpr.nextTree());
						// MAN.g:219:72
						if ( stream_primary2.hasNext() ) {
							adaptor.addChild(root_1, stream_primary2.nextTree());
						}
						stream_primary2.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// MAN.g:220:17
					{
					MAX92=(Token)match(input,MAX,FOLLOW_MAX_in_restriction1539); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MAX.add(MAX92);

					n=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_restriction1543); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER.add(n);

					// MAN.g:220:31
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( ((LA23_0 >= NAME && LA23_0 <= NOT)||LA23_0==68||LA23_0==71) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// MAN.g:220:31
							{
							pushFollow(FOLLOW_primary2_in_restriction1545);
							primary293=primary2();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_primary2.add(primary293.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: primary2, MAX, roleExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 220:45: -> ^( MAX CARD[$n] roleExpr ( primary2 )? )
					{
						// MAN.g:220:48
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_MAX.nextNode(), root_1);
						adaptor.addChild(root_1, (AST)adaptor.create(CARD, n));
						adaptor.addChild(root_1, stream_roleExpr.nextTree());
						// MAN.g:220:72
						if ( stream_primary2.hasNext() ) {
							adaptor.addChild(root_1, stream_primary2.nextTree());
						}
						stream_primary2.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// MAN.g:221:17
					{
					EXACTLY94=(Token)match(input,EXACTLY,FOLLOW_EXACTLY_in_restriction1582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EXACTLY.add(EXACTLY94);

					n=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_restriction1586); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTEGER.add(n);

					// MAN.g:221:35
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( ((LA24_0 >= NAME && LA24_0 <= NOT)||LA24_0==68||LA24_0==71) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// MAN.g:221:35
							{
							pushFollow(FOLLOW_primary2_in_restriction1588);
							primary295=primary2();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_primary2.add(primary295.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: roleExpr, primary2, EXACTLY
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 221:45: -> ^( EXACTLY CARD[$n] roleExpr ( primary2 )? )
					{
						// MAN.g:221:48
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_EXACTLY.nextNode(), root_1);
						adaptor.addChild(root_1, (AST)adaptor.create(CARD, n));
						adaptor.addChild(root_1, stream_roleExpr.nextTree());
						// MAN.g:221:76
						if ( stream_primary2.hasNext() ) {
							adaptor.addChild(root_1, stream_primary2.nextTree());
						}
						stream_primary2.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 20, restriction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "restriction"


	public static class roleExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "roleExpr"
	// MAN.g:225:1
	public final MANParser.roleExpr_return roleExpr() throws RecognitionException {
		MANParser.roleExpr_return retval = new MANParser.roleExpr_return();
		retval.start = input.LT(1);
		int roleExpr_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token INVERSE96=null;

		AST n_tree=null;
		AST INVERSE96_tree=null;
		RewriteRuleTokenStream stream_INVERSE=new RewriteRuleTokenStream(adaptor,"token INVERSE");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// MAN.g:225:13
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==NAME) ) {
				alt26=1;
			}
			else if ( (LA26_0==INVERSE) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// MAN.g:225:17
					{
					n=(Token)match(input,NAME,FOLLOW_NAME_in_roleExpr1645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(n);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 225:32: -> ROLE[$n]
					{
						adaptor.addChild(root_0, (AST)adaptor.create(ROLE, n));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// MAN.g:226:17
					{
					INVERSE96=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_roleExpr1676); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INVERSE.add(INVERSE96);

					n=(Token)match(input,NAME,FOLLOW_NAME_in_roleExpr1680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(n);

					// AST REWRITE
					// elements: INVERSE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 226:32: -> ^( INVERSE ROLE[$n] )
					{
						// MAN.g:226:35
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_INVERSE.nextNode(), root_1);
						adaptor.addChild(root_1, (AST)adaptor.create(ROLE, n));
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
			if ( state.backtracking>0 ) { memoize(input, 21, roleExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "roleExpr"


	public static class primary2_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "primary2"
	// MAN.g:229:1
	public final MANParser.primary2_return primary2() throws RecognitionException {
		MANParser.primary2_return retval = new MANParser.primary2_return();
		retval.start = input.LT(1);
		int primary2_StartIndex = input.index();

		AST root_0 = null;

		Token NOT97=null;
		ParserRuleReturnScope atom98 =null;
		ParserRuleReturnScope atom99 =null;

		AST NOT97_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// MAN.g:230:13
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==NOT) ) {
				alt27=1;
			}
			else if ( (LA27_0==NAME||LA27_0==68||LA27_0==71) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// MAN.g:230:17
					{
					root_0 = (AST)adaptor.nil();


					NOT97=(Token)match(input,NOT,FOLLOW_NOT_in_primary21724); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT97_tree = (AST)adaptor.create(NOT97);
					root_0 = (AST)adaptor.becomeRoot(NOT97_tree, root_0);
					}

					pushFollow(FOLLOW_atom_in_primary21727);
					atom98=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom98.getTree());

					}
					break;
				case 2 :
					// MAN.g:231:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary21745);
					atom99=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom99.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 22, primary2_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary2"


	public static class primary_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// MAN.g:233:1
	public final MANParser.primary_return primary() throws RecognitionException {
		MANParser.primary_return retval = new MANParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		AST root_0 = null;

		Token NOT100=null;
		ParserRuleReturnScope atom101 =null;
		ParserRuleReturnScope restriction102 =null;
		ParserRuleReturnScope atom103 =null;

		AST NOT100_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// MAN.g:235:13
			int alt28=3;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt28=1;
				}
				break;
			case NAME:
				{
				int LA28_2 = input.LA(2);
				if ( (LA28_2==EXACTLY||(LA28_2 >= MAX && LA28_2 <= MIN)||LA28_2==ONLY||(LA28_2 >= SELF && LA28_2 <= SOME)||LA28_2==VALUE) ) {
					alt28=2;
				}
				else if ( (LA28_2==EOF||LA28_2==AND||(LA28_2 >= Characteristics && LA28_2 <= Domain)||(LA28_2 >= EquivalentClasses && LA28_2 <= EquivalentTo)||LA28_2==Facts||LA28_2==Individual||LA28_2==InverseOf||(LA28_2 >= OR && LA28_2 <= ObjectProperty)||LA28_2==Range||(LA28_2 >= SameAs && LA28_2 <= SubPropertyOf)||LA28_2==Types||(LA28_2 >= 69 && LA28_2 <= 70)) ) {
					alt28=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INVERSE:
				{
				alt28=2;
				}
				break;
			case 68:
			case 71:
				{
				alt28=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// MAN.g:235:17
					{
					root_0 = (AST)adaptor.nil();


					NOT100=(Token)match(input,NOT,FOLLOW_NOT_in_primary1786); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT100_tree = (AST)adaptor.create(NOT100);
					root_0 = (AST)adaptor.becomeRoot(NOT100_tree, root_0);
					}

					pushFollow(FOLLOW_atom_in_primary1789);
					atom101=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom101.getTree());

					}
					break;
				case 2 :
					// MAN.g:236:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_restriction_in_primary1807);
					restriction102=restriction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, restriction102.getTree());

					}
					break;
				case 3 :
					// MAN.g:237:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_primary1825);
					atom103=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom103.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 23, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// MAN.g:249:1
	public final MANParser.atom_return atom() throws RecognitionException {
		MANParser.atom_return retval = new MANParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token t=null;
		Token char_literal105=null;
		Token char_literal106=null;
		Token char_literal108=null;
		ParserRuleReturnScope individualList104 =null;
		ParserRuleReturnScope description107 =null;

		AST n_tree=null;
		AST t_tree=null;
		AST char_literal105_tree=null;
		AST char_literal106_tree=null;
		AST char_literal108_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_description=new RewriteRuleSubtreeStream(adaptor,"rule description");
		RewriteRuleSubtreeStream stream_individualList=new RewriteRuleSubtreeStream(adaptor,"rule individualList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// MAN.g:249:13
			int alt29=3;
			switch ( input.LA(1) ) {
			case NAME:
				{
				alt29=1;
				}
				break;
			case 71:
				{
				alt29=2;
				}
				break;
			case 68:
				{
				alt29=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// MAN.g:249:17
					{
					n=(Token)match(input,NAME,FOLLOW_NAME_in_atom1860); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(n);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 249:43: -> CONCEPT[$n]
					{
						adaptor.addChild(root_0, (AST)adaptor.create(CONCEPT, n));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// MAN.g:250:17
					{
					t=(Token)match(input,71,FOLLOW_71_in_atom1904); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(t);

					pushFollow(FOLLOW_individualList_in_atom1906);
					individualList104=individualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_individualList.add(individualList104.getTree());
					char_literal105=(Token)match(input,72,FOLLOW_72_in_atom1908); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal105);

					// AST REWRITE
					// elements: individualList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 250:43: -> ^( INDIVIDUALS[$t] individualList )
					{
						// MAN.g:250:46
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(INDIVIDUALS, t), root_1);
						adaptor.addChild(root_1, stream_individualList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// MAN.g:251:17
					{
					char_literal106=(Token)match(input,68,FOLLOW_68_in_atom1936); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal106);

					pushFollow(FOLLOW_description_in_atom1938);
					description107=description();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_description.add(description107.getTree());
					char_literal108=(Token)match(input,69,FOLLOW_69_in_atom1940); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(char_literal108);

					// AST REWRITE
					// elements: description
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 251:43: -> description
					{
						adaptor.addChild(root_0, stream_description.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 24, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class individualList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "individualList"
	// MAN.g:254:1
	public final MANParser.individualList_return individualList() throws RecognitionException {
		MANParser.individualList_return retval = new MANParser.individualList_return();
		retval.start = input.LT(1);
		int individualList_StartIndex = input.index();

		AST root_0 = null;

		Token n=null;
		Token char_literal109=null;

		AST n_tree=null;
		AST char_literal109_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// MAN.g:255:13
			// MAN.g:255:17
			{
			root_0 = (AST)adaptor.nil();


			n=(Token)match(input,NAME,FOLLOW_NAME_in_individualList1987); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			n_tree = (AST)adaptor.create(n);
			adaptor.addChild(root_0, n_tree);
			}

			if ( state.backtracking==0 ) { setType(n,INDIVIDUAL); }
			// MAN.g:256:17
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==70) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// MAN.g:256:19
					{
					char_literal109=(Token)match(input,70,FOLLOW_70_in_individualList2009); if (state.failed) return retval;
					n=(Token)match(input,NAME,FOLLOW_NAME_in_individualList2014); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					n_tree = (AST)adaptor.create(n);
					adaptor.addChild(root_0, n_tree);
					}

					if ( state.backtracking==0 ) { setType(n,INDIVIDUAL); }
					}
					break;

				default :
					break loop30;
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
			if ( state.backtracking>0 ) { memoize(input, 25, individualList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "individualList"


	public static class fact_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "fact"
	// MAN.g:259:1
	public final MANParser.fact_return fact() throws RecognitionException {
		MANParser.fact_return retval = new MANParser.fact_return();
		retval.start = input.LT(1);
		int fact_StartIndex = input.index();

		AST root_0 = null;

		Token p=null;
		Token n=null;
		Token NOT110=null;

		AST p_tree=null;
		AST n_tree=null;
		AST NOT110_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// MAN.g:259:13
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==NOT) ) {
				alt31=1;
			}
			else if ( (LA31_0==NAME) ) {
				alt31=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// MAN.g:259:17
					{
					NOT110=(Token)match(input,NOT,FOLLOW_NOT_in_fact2049); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT110);

					p=(Token)match(input,NAME,FOLLOW_NAME_in_fact2053); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(p);

					n=(Token)match(input,NAME,FOLLOW_NAME_in_fact2057); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(n);

					// AST REWRITE
					// elements: NOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 259:35: -> ^( FACT ^( NOT ROLE[$p] INDIVIDUAL[$n] ) )
					{
						// MAN.g:259:38
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FACT, "FACT"), root_1);
						// MAN.g:259:45
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot(stream_NOT.nextNode(), root_2);
						adaptor.addChild(root_2, (AST)adaptor.create(ROLE, p));
						adaptor.addChild(root_2, (AST)adaptor.create(INDIVIDUAL, n));
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// MAN.g:260:17
					{
					p=(Token)match(input,NAME,FOLLOW_NAME_in_fact2093); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(p);

					n=(Token)match(input,NAME,FOLLOW_NAME_in_fact2097); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(n);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 260:35: -> ^( FACT ROLE[$p] INDIVIDUAL[$n] )
					{
						// MAN.g:260:38
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FACT, "FACT"), root_1);
						adaptor.addChild(root_1, (AST)adaptor.create(ROLE, p));
						adaptor.addChild(root_1, (AST)adaptor.create(INDIVIDUAL, n));
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
			if ( state.backtracking>0 ) { memoize(input, 26, fact_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fact"


	public static class characteristic_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "characteristic"
	// MAN.g:263:1
	public final MANParser.characteristic_return characteristic() throws RecognitionException {
		MANParser.characteristic_return retval = new MANParser.characteristic_return();
		retval.start = input.LT(1);
		int characteristic_StartIndex = input.index();

		AST root_0 = null;

		Token set111=null;

		AST set111_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// MAN.g:264:13
			// MAN.g:
			{
			root_0 = (AST)adaptor.nil();


			set111=input.LT(1);
			if ( input.LA(1)==Asymmetric||input.LA(1)==Functional||input.LA(1)==InverseFunctional||input.LA(1)==Irreflexive||input.LA(1)==Reflexive||(input.LA(1) >= Symmetric && input.LA(1) <= Transitive) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set111));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
			if ( state.backtracking>0 ) { memoize(input, 27, characteristic_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "characteristic"

	// $ANTLR start synpred1_MAN
	public final void synpred1_MAN_fragment() throws RecognitionException {
		// MAN.g:206:17
		// MAN.g:206:18
		{
		pushFollow(FOLLOW_conjunction_in_synpred1_MAN1196);
		conjunction();
		state._fsp--;
		if (state.failed) return;

		match(input,OR,FOLLOW_OR_in_synpred1_MAN1198); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_MAN

	// $ANTLR start synpred2_MAN
	public final void synpred2_MAN_fragment() throws RecognitionException {
		// MAN.g:210:17
		// MAN.g:210:18
		{
		pushFollow(FOLLOW_primary_in_synpred2_MAN1268);
		primary();
		state._fsp--;
		if (state.failed) return;

		match(input,AND,FOLLOW_AND_in_synpred2_MAN1270); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_MAN

	// Delegated rules

	public final boolean synpred1_MAN() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_MAN_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_MAN() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_MAN_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_frame_in_cunit179 = new BitSet(new long[]{0x0200800800C0E800L});
	public static final BitSet FOLLOW_EOF_in_cunit182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classFrame_in_frame208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleFrame_in_frame226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_individualFrame_in_frame244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_misc_in_frame262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classFrame286 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_classFrame290 = new BitSet(new long[]{0x0400000001030002L});
	public static final BitSet FOLLOW_classBody_in_classFrame292 = new BitSet(new long[]{0x0400000001030002L});
	public static final BitSet FOLLOW_SubClassOf_in_classBody346 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_descriptionList_in_classBody350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EquivalentTo_in_classBody368 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_descriptionList_in_classBody371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DisjointWith_in_classBody389 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_descriptionList_in_classBody392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DisjointUnionOf_in_classBody410 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_description2List_in_classBody413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ObjectProperty_in_roleFrame438 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_roleFrame442 = new BitSet(new long[]{0x1808002001060402L});
	public static final BitSet FOLLOW_roleBody_in_roleFrame444 = new BitSet(new long[]{0x1808002001060402L});
	public static final BitSet FOLLOW_Characteristics_in_roleBody499 = new BitSet(new long[]{0x6010005020000020L});
	public static final BitSet FOLLOW_characteristicList_in_roleBody502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Domain_in_roleBody520 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_descriptionList_in_roleBody523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Range_in_roleBody541 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_descriptionList_in_roleBody544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SubPropertyOf_in_roleBody562 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_roleExprList_in_roleBody565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EquivalentTo_in_roleBody583 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_roleExprList_in_roleBody586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DisjointWith_in_roleBody604 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_roleExprList_in_roleBody607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_InverseOf_in_roleBody625 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_roleExprList_in_roleBody628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SubPropertyChain_in_roleBody646 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_roleChain_in_roleBody649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Individual_in_individualFrame684 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_individualFrame688 = new BitSet(new long[]{0x8100000010001002L});
	public static final BitSet FOLLOW_individualBody_in_individualFrame690 = new BitSet(new long[]{0x8100000010001002L});
	public static final BitSet FOLLOW_Types_in_individualBody755 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_descriptionList_in_individualBody758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Facts_in_individualBody776 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_factList_in_individualBody779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SameAs_in_individualBody797 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_individualList_in_individualBody800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DifferentFrom_in_individualBody818 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_individualList_in_individualBody821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EquivalentClasses_in_misc851 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_description2List_in_misc854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DisjointClasses_in_misc872 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_description2List_in_misc875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EquivalentProperties_in_misc893 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_role2List_in_misc896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DisjointProperties_in_misc914 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_role2List_in_misc917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SameIndividual_in_misc935 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_individual2List_in_misc938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DifferentIndividuals_in_misc956 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_individual2List_in_misc959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characteristic_in_characteristicList983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_characteristicList986 = new BitSet(new long[]{0x6010005020000020L});
	public static final BitSet FOLLOW_characteristic_in_characteristicList989 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_description_in_descriptionList1005 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_descriptionList1008 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_description_in_descriptionList1011 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_description_in_description2List1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_description2List1029 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_description_in_description2List1032 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_roleExpr_in_roleExprList1051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_roleExprList1054 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_roleExpr_in_roleExprList1057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_roleExpr_in_roleChain1079 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMPOSE_in_roleChain1082 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_roleExpr_in_roleChain1085 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_NAME_in_role2List1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_role2List1114 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_role2List1119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_NAME_in_individual2List1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_individual2List1145 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_individual2List1150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_fact_in_factList1176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_factList1179 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_fact_in_factList1182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_conjunction_in_description1203 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_OR_in_description1207 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_conjunction_in_description1209 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_OR_in_description1212 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_conjunction_in_description1214 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_conjunction_in_description1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_conjunction1275 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_conjunction1279 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_primary_in_conjunction1281 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_conjunction1284 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_primary_in_conjunction1286 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_primary_in_conjunction1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleExpr_in_restriction1339 = new BitSet(new long[]{0x0060230000100000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SOME_in_restriction1359 = new BitSet(new long[]{0x00000C0000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_primary2_in_restriction1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ONLY_in_restriction1392 = new BitSet(new long[]{0x00000C0000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_primary2_in_restriction1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUE_in_restriction1425 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_restriction1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELF_in_restriction1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_restriction1496 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INTEGER_in_restriction1500 = new BitSet(new long[]{0x00000C0000000002L,0x0000000000000090L});
	public static final BitSet FOLLOW_primary2_in_restriction1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_restriction1539 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INTEGER_in_restriction1543 = new BitSet(new long[]{0x00000C0000000002L,0x0000000000000090L});
	public static final BitSet FOLLOW_primary2_in_restriction1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXACTLY_in_restriction1582 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INTEGER_in_restriction1586 = new BitSet(new long[]{0x00000C0000000002L,0x0000000000000090L});
	public static final BitSet FOLLOW_primary2_in_restriction1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_roleExpr1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INVERSE_in_roleExpr1676 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_roleExpr1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_primary21724 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_atom_in_primary21727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary21745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_primary1786 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_atom_in_primary1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restriction_in_primary1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_primary1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atom1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_atom1904 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_individualList_in_atom1906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_atom1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_atom1936 = new BitSet(new long[]{0x00000C0400000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_description_in_atom1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_atom1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_individualList1987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_individualList2009 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_individualList2014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_NOT_in_fact2049 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_fact2053 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_fact2057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_fact2093 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_fact2097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conjunction_in_synpred1_MAN1196 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_OR_in_synpred1_MAN1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_synpred2_MAN1268 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_synpred2_MAN1270 = new BitSet(new long[]{0x0000000000000002L});
}
