// $ANTLR 3.5.2 MAN.g 2022-04-06 16:37:43

package in.ac.iitm.cse.parser.man;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MANLexer extends Lexer {
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

	    String stripQuotes(String t) { return t.substring(1,t.length()-1); }

	    public Map<Integer,String> textAttribute() {
	        Map<Integer,String> map = new HashMap<Integer,String>();
	        map.put(CONCEPT,"name");
	        map.put(ROLE,"name");
	        map.put(INDIVIDUAL,"name");
	        return map;
	    }

	    public Set<Integer> simpleTokens() {
	        Set<Integer> set = new HashSet<Integer>();

	        set.add(INDIVIDUALS);
	        set.add(EXISTS);
	        set.add(FORALL);
	        set.add(FILLS);
	        set.add(FACT);

	        set.add(OR);
	        set.add(AND);
	        set.add(NOT);
	        set.add(INVERSE);

	        set.add(VALUE);
	        set.add(ONLY);
	        set.add(SOME);
	        set.add(MIN);
	        set.add(MAX);
	        set.add(EXACTLY);
	        set.add(SELF);

	        set.add(COMPOSE);

	        set.add(Functional);
	        set.add(InverseFunctional);
	        set.add(Reflexive);
	        set.add(Irreflexive);
	        set.add(Symmetric);
	        set.add(Asymmetric);
	        set.add(Transitive);

	        set.add(Class);
	        set.add(SubClassOf);
	        set.add(EquivalentTo);
	        set.add(DisjointWith);
	        set.add(DisjointUnionOf);

	        set.add(ObjectProperty);
	        set.add(Characteristics);
	        set.add(Domain);
	        set.add(Range);
	        set.add(SubPropertyOf);
	        set.add(InverseOf);
	        set.add(SubPropertyChain);

	        set.add(Individual);
	        set.add(Types);
	        set.add(Facts);
	        set.add(SameAs);
	        set.add(DifferentFrom);

	        set.add(EquivalentClasses);
	        set.add(DisjointClasses);
	        set.add(EquivalentProperties);
	        set.add(DisjointProperties);
	        set.add(SameIndividual);
	        set.add(DifferentIndividuals);

	        return set;
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MANLexer() {} 
	public MANLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MANLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "MAN.g"; }

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:88:7
			// MAN.g:88:9
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:89:7
			// MAN.g:89:9
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:90:7
			// MAN.g:90:9
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:91:7
			// MAN.g:91:9
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:92:7
			// MAN.g:92:9
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:277:23
			// MAN.g:277:26
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:278:23
			// MAN.g:278:26
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:279:23
			// MAN.g:279:26
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "INVERSE"
	public final void mINVERSE() throws RecognitionException {
		try {
			int _type = INVERSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:280:23
			// MAN.g:280:26
			{
			match("inverse"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVERSE"

	// $ANTLR start "VALUE"
	public final void mVALUE() throws RecognitionException {
		try {
			int _type = VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:282:23
			// MAN.g:282:26
			{
			match("value"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUE"

	// $ANTLR start "ONLY"
	public final void mONLY() throws RecognitionException {
		try {
			int _type = ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:283:23
			// MAN.g:283:26
			{
			match("only"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONLY"

	// $ANTLR start "SOME"
	public final void mSOME() throws RecognitionException {
		try {
			int _type = SOME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:284:23
			// MAN.g:284:26
			{
			match("some"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOME"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:285:23
			// MAN.g:285:26
			{
			match("min"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "MAX"
	public final void mMAX() throws RecognitionException {
		try {
			int _type = MAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:286:23
			// MAN.g:286:26
			{
			match("max"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX"

	// $ANTLR start "EXACTLY"
	public final void mEXACTLY() throws RecognitionException {
		try {
			int _type = EXACTLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:287:23
			// MAN.g:287:26
			{
			match("exactly"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXACTLY"

	// $ANTLR start "SELF"
	public final void mSELF() throws RecognitionException {
		try {
			int _type = SELF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:288:23
			// MAN.g:288:26
			{
			match("Self"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELF"

	// $ANTLR start "COMPOSE"
	public final void mCOMPOSE() throws RecognitionException {
		try {
			int _type = COMPOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:290:23
			// MAN.g:290:26
			{
			match('o'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPOSE"

	// $ANTLR start "Functional"
	public final void mFunctional() throws RecognitionException {
		try {
			int _type = Functional;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:292:23
			// MAN.g:292:26
			{
			match("Functional"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Functional"

	// $ANTLR start "InverseFunctional"
	public final void mInverseFunctional() throws RecognitionException {
		try {
			int _type = InverseFunctional;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:293:23
			// MAN.g:293:26
			{
			match("InverseFunctional"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "InverseFunctional"

	// $ANTLR start "Reflexive"
	public final void mReflexive() throws RecognitionException {
		try {
			int _type = Reflexive;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:294:23
			// MAN.g:294:26
			{
			match("Reflexive"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Reflexive"

	// $ANTLR start "Irreflexive"
	public final void mIrreflexive() throws RecognitionException {
		try {
			int _type = Irreflexive;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:295:23
			// MAN.g:295:26
			{
			match("Irreflexive"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Irreflexive"

	// $ANTLR start "Symmetric"
	public final void mSymmetric() throws RecognitionException {
		try {
			int _type = Symmetric;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:296:23
			// MAN.g:296:26
			{
			match("Symmetric"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Symmetric"

	// $ANTLR start "Asymmetric"
	public final void mAsymmetric() throws RecognitionException {
		try {
			int _type = Asymmetric;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:297:23
			// MAN.g:297:26
			{
			match("Asymmetric"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Asymmetric"

	// $ANTLR start "Transitive"
	public final void mTransitive() throws RecognitionException {
		try {
			int _type = Transitive;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:298:23
			// MAN.g:298:26
			{
			match("Transitive"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Transitive"

	// $ANTLR start "Prefix"
	public final void mPrefix() throws RecognitionException {
		try {
			int _type = Prefix;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:300:23
			// MAN.g:300:26
			{
			match("Prefix"); 

			// MAN.g:300:35
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Prefix"

	// $ANTLR start "Ontology"
	public final void mOntology() throws RecognitionException {
		try {
			int _type = Ontology;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:301:23
			// MAN.g:301:26
			{
			match("Ontology"); 

			// MAN.g:301:37
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Ontology"

	// $ANTLR start "Class"
	public final void mClass() throws RecognitionException {
		try {
			int _type = Class;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:303:23
			// MAN.g:303:26
			{
			match("Class"); 

			// MAN.g:303:34
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Class"

	// $ANTLR start "SubClassOf"
	public final void mSubClassOf() throws RecognitionException {
		try {
			int _type = SubClassOf;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:304:23
			// MAN.g:304:26
			{
			match("SubClassOf"); 

			// MAN.g:304:39
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SubClassOf"

	// $ANTLR start "EquivalentTo"
	public final void mEquivalentTo() throws RecognitionException {
		try {
			int _type = EquivalentTo;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:305:23
			// MAN.g:305:26
			{
			match("EquivalentTo"); 

			// MAN.g:305:41
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EquivalentTo"

	// $ANTLR start "DisjointWith"
	public final void mDisjointWith() throws RecognitionException {
		try {
			int _type = DisjointWith;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:306:23
			// MAN.g:306:26
			{
			match("DisjointWith"); 

			// MAN.g:306:41
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DisjointWith"

	// $ANTLR start "DisjointUnionOf"
	public final void mDisjointUnionOf() throws RecognitionException {
		try {
			int _type = DisjointUnionOf;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:307:23
			// MAN.g:307:26
			{
			match("DisjointUnionOf"); 

			// MAN.g:307:44
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DisjointUnionOf"

	// $ANTLR start "ObjectProperty"
	public final void mObjectProperty() throws RecognitionException {
		try {
			int _type = ObjectProperty;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:309:23
			// MAN.g:309:26
			{
			match("ObjectProperty"); 

			// MAN.g:309:43
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ObjectProperty"

	// $ANTLR start "Characteristics"
	public final void mCharacteristics() throws RecognitionException {
		try {
			int _type = Characteristics;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:310:23
			// MAN.g:310:26
			{
			match("Characteristics"); 

			// MAN.g:310:44
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Characteristics"

	// $ANTLR start "Domain"
	public final void mDomain() throws RecognitionException {
		try {
			int _type = Domain;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:311:23
			// MAN.g:311:26
			{
			match("Domain"); 

			// MAN.g:311:35
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Domain"

	// $ANTLR start "Range"
	public final void mRange() throws RecognitionException {
		try {
			int _type = Range;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:312:23
			// MAN.g:312:26
			{
			match("Range"); 

			// MAN.g:312:34
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Range"

	// $ANTLR start "SubPropertyOf"
	public final void mSubPropertyOf() throws RecognitionException {
		try {
			int _type = SubPropertyOf;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:313:23
			// MAN.g:313:26
			{
			match("SubPropertyOf"); 

			// MAN.g:313:42
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SubPropertyOf"

	// $ANTLR start "InverseOf"
	public final void mInverseOf() throws RecognitionException {
		try {
			int _type = InverseOf;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:316:23
			// MAN.g:316:26
			{
			match("InverseOf"); 

			// MAN.g:316:38
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "InverseOf"

	// $ANTLR start "SubPropertyChain"
	public final void mSubPropertyChain() throws RecognitionException {
		try {
			int _type = SubPropertyChain;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:317:23
			// MAN.g:317:26
			{
			match("SubPropertyChain"); 

			// MAN.g:317:45
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SubPropertyChain"

	// $ANTLR start "Individual"
	public final void mIndividual() throws RecognitionException {
		try {
			int _type = Individual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:319:23
			// MAN.g:319:26
			{
			match("Individual"); 

			// MAN.g:319:39
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop15;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Individual"

	// $ANTLR start "Types"
	public final void mTypes() throws RecognitionException {
		try {
			int _type = Types;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:320:23
			// MAN.g:320:26
			{
			match("Types"); 

			// MAN.g:320:34
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Types"

	// $ANTLR start "Facts"
	public final void mFacts() throws RecognitionException {
		try {
			int _type = Facts;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:321:23
			// MAN.g:321:26
			{
			match("Facts"); 

			// MAN.g:321:34
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '\t' && LA17_0 <= '\n')||LA17_0=='\r'||LA17_0==' ') ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Facts"

	// $ANTLR start "SameAs"
	public final void mSameAs() throws RecognitionException {
		try {
			int _type = SameAs;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:322:23
			// MAN.g:322:26
			{
			match("SameAs"); 

			// MAN.g:322:35
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop18;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SameAs"

	// $ANTLR start "DifferentFrom"
	public final void mDifferentFrom() throws RecognitionException {
		try {
			int _type = DifferentFrom;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:323:23
			// MAN.g:323:26
			{
			match("DifferentFrom"); 

			// MAN.g:323:42
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop19;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DifferentFrom"

	// $ANTLR start "EquivalentClasses"
	public final void mEquivalentClasses() throws RecognitionException {
		try {
			int _type = EquivalentClasses;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:325:23
			// MAN.g:325:26
			{
			match("EquivalentClasses"); 

			// MAN.g:325:46
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||LA20_0=='\r'||LA20_0==' ') ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop20;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EquivalentClasses"

	// $ANTLR start "DisjointClasses"
	public final void mDisjointClasses() throws RecognitionException {
		try {
			int _type = DisjointClasses;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:326:23
			// MAN.g:326:26
			{
			match("DisjointClasses"); 

			// MAN.g:326:44
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||LA21_0=='\r'||LA21_0==' ') ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop21;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DisjointClasses"

	// $ANTLR start "EquivalentProperties"
	public final void mEquivalentProperties() throws RecognitionException {
		try {
			int _type = EquivalentProperties;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:327:23
			// MAN.g:327:26
			{
			match("EquivalentProperties"); 

			// MAN.g:327:49
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r'||LA22_0==' ') ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop22;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EquivalentProperties"

	// $ANTLR start "DisjointProperties"
	public final void mDisjointProperties() throws RecognitionException {
		try {
			int _type = DisjointProperties;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:328:23
			// MAN.g:328:26
			{
			match("DisjointProperties"); 

			// MAN.g:328:47
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '\t' && LA23_0 <= '\n')||LA23_0=='\r'||LA23_0==' ') ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop23;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DisjointProperties"

	// $ANTLR start "SameIndividual"
	public final void mSameIndividual() throws RecognitionException {
		try {
			int _type = SameIndividual;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:329:23
			// MAN.g:329:26
			{
			match("SameIndividual"); 

			// MAN.g:329:43
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '\t' && LA24_0 <= '\n')||LA24_0=='\r'||LA24_0==' ') ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop24;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SameIndividual"

	// $ANTLR start "DifferentIndividuals"
	public final void mDifferentIndividuals() throws RecognitionException {
		try {
			int _type = DifferentIndividuals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:330:23
			// MAN.g:330:26
			{
			match("DifferentIndividuals"); 

			// MAN.g:330:49
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= '\t' && LA25_0 <= '\n')||LA25_0=='\r'||LA25_0==' ') ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop25;
				}
			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DifferentIndividuals"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:332:13
			// MAN.g:332:17
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// MAN.g:332:37
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0=='-'||(LA26_0 >= '0' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'z')) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// MAN.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop26;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:334:13
			// MAN.g:334:17
			{
			// MAN.g:334:17
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:336:13
			// MAN.g:336:17
			{
			match('\''); 
			// MAN.g:336:22
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0=='\\') ) {
					alt28=1;
				}
				else if ( ((LA28_0 >= '\u0000' && LA28_0 <= '&')||(LA28_0 >= '(' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\uFFFF')) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// MAN.g:336:24
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// MAN.g:336:34
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop28;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "WS_2"
	public final void mWS_2() throws RecognitionException {
		try {
			int _type = WS_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:341:13
			// MAN.g:341:17
			{
			// MAN.g:341:17
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= '\t' && LA29_0 <= '\n')||LA29_0=='\r'||LA29_0==' ') ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS_2"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MAN.g:342:13
			// MAN.g:342:17
			{
			match('#'); 
			// MAN.g:342:21
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= '\u0000' && LA30_0 <= '\t')||(LA30_0 >= '\u000B' && LA30_0 <= '\f')||(LA30_0 >= '\u000E' && LA30_0 <= '\uFFFF')) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// MAN.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop30;
				}
			}

			// MAN.g:342:35
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='\n'||LA32_0=='\r') ) {
				alt32=1;
			}

			else {
				alt32=2;
			}

			switch (alt32) {
				case 1 :
					// MAN.g:342:36
					{
					// MAN.g:342:36
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0=='\r') ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// MAN.g:342:36
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// MAN.g:342:47
					{
					match(EOF); 

					}
					break;

			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			// MAN.g:350:13
			// MAN.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// MAN.g:353:13
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt33=1;
					}
					break;
				case 'u':
					{
					alt33=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt33=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// MAN.g:353:17
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// MAN.g:354:17
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// MAN.g:355:17
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// MAN.g:358:13
			int alt34=3;
			int LA34_0 = input.LA(1);
			if ( (LA34_0=='\\') ) {
				int LA34_1 = input.LA(2);
				if ( ((LA34_1 >= '0' && LA34_1 <= '3')) ) {
					int LA34_2 = input.LA(3);
					if ( ((LA34_2 >= '0' && LA34_2 <= '7')) ) {
						int LA34_4 = input.LA(4);
						if ( ((LA34_4 >= '0' && LA34_4 <= '7')) ) {
							alt34=1;
						}

						else {
							alt34=2;
						}

					}

					else {
						alt34=3;
					}

				}
				else if ( ((LA34_1 >= '4' && LA34_1 <= '7')) ) {
					int LA34_3 = input.LA(3);
					if ( ((LA34_3 >= '0' && LA34_3 <= '7')) ) {
						alt34=2;
					}

					else {
						alt34=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// MAN.g:358:17
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// MAN.g:359:17
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// MAN.g:360:17
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// MAN.g:363:13
			// MAN.g:363:17
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// MAN.g:366:13
			// MAN.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// MAN.g:1:8
		int alt35=54;
		alt35 = dfa35.predict(input);
		switch (alt35) {
			case 1 :
				// MAN.g:1:10
				{
				mT__68(); 

				}
				break;
			case 2 :
				// MAN.g:1:16
				{
				mT__69(); 

				}
				break;
			case 3 :
				// MAN.g:1:22
				{
				mT__70(); 

				}
				break;
			case 4 :
				// MAN.g:1:28
				{
				mT__71(); 

				}
				break;
			case 5 :
				// MAN.g:1:34
				{
				mT__72(); 

				}
				break;
			case 6 :
				// MAN.g:1:40
				{
				mOR(); 

				}
				break;
			case 7 :
				// MAN.g:1:43
				{
				mAND(); 

				}
				break;
			case 8 :
				// MAN.g:1:47
				{
				mNOT(); 

				}
				break;
			case 9 :
				// MAN.g:1:51
				{
				mINVERSE(); 

				}
				break;
			case 10 :
				// MAN.g:1:59
				{
				mVALUE(); 

				}
				break;
			case 11 :
				// MAN.g:1:65
				{
				mONLY(); 

				}
				break;
			case 12 :
				// MAN.g:1:70
				{
				mSOME(); 

				}
				break;
			case 13 :
				// MAN.g:1:75
				{
				mMIN(); 

				}
				break;
			case 14 :
				// MAN.g:1:79
				{
				mMAX(); 

				}
				break;
			case 15 :
				// MAN.g:1:83
				{
				mEXACTLY(); 

				}
				break;
			case 16 :
				// MAN.g:1:91
				{
				mSELF(); 

				}
				break;
			case 17 :
				// MAN.g:1:96
				{
				mCOMPOSE(); 

				}
				break;
			case 18 :
				// MAN.g:1:104
				{
				mFunctional(); 

				}
				break;
			case 19 :
				// MAN.g:1:115
				{
				mInverseFunctional(); 

				}
				break;
			case 20 :
				// MAN.g:1:133
				{
				mReflexive(); 

				}
				break;
			case 21 :
				// MAN.g:1:143
				{
				mIrreflexive(); 

				}
				break;
			case 22 :
				// MAN.g:1:155
				{
				mSymmetric(); 

				}
				break;
			case 23 :
				// MAN.g:1:165
				{
				mAsymmetric(); 

				}
				break;
			case 24 :
				// MAN.g:1:176
				{
				mTransitive(); 

				}
				break;
			case 25 :
				// MAN.g:1:187
				{
				mPrefix(); 

				}
				break;
			case 26 :
				// MAN.g:1:194
				{
				mOntology(); 

				}
				break;
			case 27 :
				// MAN.g:1:203
				{
				mClass(); 

				}
				break;
			case 28 :
				// MAN.g:1:209
				{
				mSubClassOf(); 

				}
				break;
			case 29 :
				// MAN.g:1:220
				{
				mEquivalentTo(); 

				}
				break;
			case 30 :
				// MAN.g:1:233
				{
				mDisjointWith(); 

				}
				break;
			case 31 :
				// MAN.g:1:246
				{
				mDisjointUnionOf(); 

				}
				break;
			case 32 :
				// MAN.g:1:262
				{
				mObjectProperty(); 

				}
				break;
			case 33 :
				// MAN.g:1:277
				{
				mCharacteristics(); 

				}
				break;
			case 34 :
				// MAN.g:1:293
				{
				mDomain(); 

				}
				break;
			case 35 :
				// MAN.g:1:300
				{
				mRange(); 

				}
				break;
			case 36 :
				// MAN.g:1:306
				{
				mSubPropertyOf(); 

				}
				break;
			case 37 :
				// MAN.g:1:320
				{
				mInverseOf(); 

				}
				break;
			case 38 :
				// MAN.g:1:330
				{
				mSubPropertyChain(); 

				}
				break;
			case 39 :
				// MAN.g:1:347
				{
				mIndividual(); 

				}
				break;
			case 40 :
				// MAN.g:1:358
				{
				mTypes(); 

				}
				break;
			case 41 :
				// MAN.g:1:364
				{
				mFacts(); 

				}
				break;
			case 42 :
				// MAN.g:1:370
				{
				mSameAs(); 

				}
				break;
			case 43 :
				// MAN.g:1:377
				{
				mDifferentFrom(); 

				}
				break;
			case 44 :
				// MAN.g:1:391
				{
				mEquivalentClasses(); 

				}
				break;
			case 45 :
				// MAN.g:1:409
				{
				mDisjointClasses(); 

				}
				break;
			case 46 :
				// MAN.g:1:425
				{
				mEquivalentProperties(); 

				}
				break;
			case 47 :
				// MAN.g:1:446
				{
				mDisjointProperties(); 

				}
				break;
			case 48 :
				// MAN.g:1:465
				{
				mSameIndividual(); 

				}
				break;
			case 49 :
				// MAN.g:1:480
				{
				mDifferentIndividuals(); 

				}
				break;
			case 50 :
				// MAN.g:1:501
				{
				mNAME(); 

				}
				break;
			case 51 :
				// MAN.g:1:506
				{
				mINTEGER(); 

				}
				break;
			case 52 :
				// MAN.g:1:514
				{
				mSTRING(); 

				}
				break;
			case 53 :
				// MAN.g:1:521
				{
				mWS_2(); 

				}
				break;
			case 54 :
				// MAN.g:1:526
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA35 dfa35 = new DFA35(this);
	static final String DFA35_eotS =
		"\6\uffff\1\40\22\31\5\uffff\1\76\1\31\1\uffff\35\31\1\uffff\1\31\1\140"+
		"\1\141\3\31\1\145\1\146\30\31\1\u0080\2\uffff\2\31\1\u0083\2\uffff\1\31"+
		"\1\u0085\27\31\1\uffff\1\31\1\u009f\1\uffff\1\31\1\uffff\31\31\1\uffff"+
		"\7\31\1\uffff\4\31\1\uffff\2\31\1\uffff\3\31\1\uffff\5\31\1\u00cf\1\u00d0"+
		"\3\31\1\uffff\10\31\1\uffff\6\31\3\uffff\22\31\1\u00f8\10\31\1\u0101\2"+
		"\31\1\uffff\10\31\1\uffff\3\31\1\u0110\1\31\1\uffff\2\31\1\uffff\1\u0114"+
		"\1\u0115\11\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\u0125\2\uffff\17\31"+
		"\1\uffff\21\31\1\uffff\2\31\1\uffff\5\31\1\uffff\12\31\1\uffff\2\31\1"+
		"\uffff\1\31\1\uffff\11\31\1\uffff\2\31\2\uffff\2\31\1\uffff\1\u0167\4"+
		"\31\2\uffff\4\31\1\uffff\3\31\2\uffff";
	static final String DFA35_eofS =
		"\u0173\uffff";
	static final String DFA35_minS =
		"\1\11\5\uffff\1\55\1\156\1\157\1\156\1\141\1\157\1\141\1\170\2\141\1\156"+
		"\1\141\1\163\2\162\1\142\1\150\1\161\1\151\5\uffff\1\55\1\154\1\uffff"+
		"\1\144\1\164\1\166\1\154\1\155\1\156\1\170\1\141\1\154\1\155\1\142\1\155"+
		"\1\156\1\143\1\144\1\162\1\146\1\156\1\171\1\141\1\160\1\145\1\164\1\152"+
		"\2\141\1\165\1\146\1\155\1\uffff\1\171\2\55\1\145\1\165\1\145\2\55\1\143"+
		"\1\146\1\155\1\103\1\145\1\143\1\164\1\145\1\151\1\145\1\154\1\147\1\155"+
		"\1\156\1\145\1\146\1\157\1\145\1\163\1\162\1\151\1\152\1\146\1\141\1\55"+
		"\2\uffff\1\162\1\145\1\55\2\uffff\1\164\1\55\1\145\1\154\1\162\1\101\1"+
		"\164\1\163\1\162\1\166\1\146\2\145\1\155\2\163\1\151\1\154\1\143\1\163"+
		"\1\141\1\166\1\157\1\145\1\151\1\uffff\1\163\1\55\1\uffff\1\154\1\uffff"+
		"\1\164\1\141\1\157\1\163\1\156\1\151\1\11\1\163\1\151\1\154\1\170\1\11"+
		"\1\145\1\151\1\11\1\170\1\157\1\164\1\11\1\143\1\141\1\151\1\162\1\156"+
		"\1\145\1\uffff\1\171\1\162\1\163\1\160\1\11\1\144\1\157\1\uffff\1\145"+
		"\1\144\1\145\1\151\1\uffff\2\164\1\uffff\1\11\1\147\1\120\1\uffff\1\164"+
		"\1\154\1\156\1\145\1\11\2\55\1\151\1\163\1\145\1\uffff\1\151\1\156\1\106"+
		"\1\165\1\170\1\166\1\162\1\151\1\uffff\1\171\1\162\2\145\1\164\1\156\3"+
		"\uffff\1\143\1\117\1\162\1\166\1\141\1\165\1\146\1\141\1\151\1\145\1\151"+
		"\1\166\1\11\1\157\1\162\1\156\1\103\1\164\1\55\1\146\1\164\1\151\1\154"+
		"\1\156\1\11\1\154\1\166\1\55\1\143\1\145\1\uffff\1\160\1\151\1\164\1\151"+
		"\1\156\1\154\1\162\1\106\1\uffff\1\11\1\171\1\144\1\55\1\143\1\uffff\1"+
		"\11\1\145\1\uffff\2\55\1\145\1\163\1\103\1\164\1\151\1\141\1\157\1\162"+
		"\1\156\1\uffff\1\103\1\165\1\uffff\1\164\1\uffff\1\55\2\uffff\1\162\1"+
		"\164\1\157\1\154\1\162\1\150\1\157\1\163\1\160\1\157\1\144\1\146\1\150"+
		"\1\141\1\151\1\uffff\1\164\1\151\1\11\1\141\1\157\1\11\1\156\1\163\1\145"+
		"\1\155\1\151\1\11\1\141\1\154\1\157\1\171\1\143\1\uffff\1\163\1\160\1"+
		"\uffff\1\117\1\145\1\162\1\11\1\166\1\uffff\1\151\1\11\1\156\1\11\2\163"+
		"\1\145\1\146\1\163\1\164\1\uffff\1\151\1\156\1\uffff\1\141\1\uffff\1\11"+
		"\1\145\1\162\2\11\1\151\1\144\1\11\1\154\1\uffff\1\163\1\164\2\uffff\1"+
		"\145\1\165\1\uffff\1\55\1\11\1\151\1\163\1\141\2\uffff\1\145\1\11\1\154"+
		"\1\163\1\uffff\1\163\2\11\2\uffff";
	static final String DFA35_maxS =
		"\1\175\5\uffff\1\172\1\156\1\157\1\156\1\141\1\157\1\151\1\170\1\171\1"+
		"\165\1\162\1\145\1\163\1\171\1\162\1\156\1\154\1\161\1\157\5\uffff\1\172"+
		"\1\154\1\uffff\1\144\1\164\1\166\1\154\1\155\1\156\1\170\1\141\1\154\1"+
		"\155\1\142\1\155\1\156\1\143\1\166\1\162\1\146\1\156\1\171\1\141\1\160"+
		"\1\145\1\164\1\152\2\141\1\165\1\163\1\155\1\uffff\1\171\2\172\1\145\1"+
		"\165\1\145\2\172\1\143\1\146\1\155\1\120\1\145\1\143\1\164\1\145\1\151"+
		"\1\145\1\154\1\147\1\155\1\156\1\145\1\146\1\157\1\145\1\163\1\162\1\151"+
		"\1\152\1\146\1\141\1\172\2\uffff\1\162\1\145\1\172\2\uffff\1\164\1\172"+
		"\1\145\1\154\1\162\1\111\1\164\1\163\1\162\1\166\1\146\2\145\1\155\2\163"+
		"\1\151\1\154\1\143\1\163\1\141\1\166\1\157\1\145\1\151\1\uffff\1\163\1"+
		"\172\1\uffff\1\154\1\uffff\1\164\1\141\1\157\1\163\1\156\1\151\1\72\1"+
		"\163\1\151\1\154\1\170\1\72\1\145\1\151\1\72\1\170\1\157\1\164\1\72\1"+
		"\143\1\141\1\151\1\162\1\156\1\145\1\uffff\1\171\1\162\1\163\1\160\1\72"+
		"\1\144\1\157\1\uffff\1\145\1\144\1\145\1\151\1\uffff\2\164\1\uffff\1\72"+
		"\1\147\1\120\1\uffff\1\164\1\154\1\156\1\145\1\72\2\172\1\151\1\163\1"+
		"\145\1\uffff\1\151\1\156\1\117\1\165\1\170\1\166\1\162\1\151\1\uffff\1"+
		"\171\1\162\2\145\1\164\1\156\3\uffff\1\143\1\117\1\162\1\166\1\141\1\165"+
		"\1\146\1\141\1\151\1\145\1\151\1\166\1\72\1\157\1\162\1\156\1\127\1\164"+
		"\1\172\1\146\1\164\1\151\1\154\1\156\1\72\1\154\1\166\1\172\1\143\1\145"+
		"\1\uffff\1\160\1\151\1\164\1\151\1\156\1\154\1\162\1\111\1\uffff\1\72"+
		"\1\171\1\144\1\172\1\143\1\uffff\1\72\1\145\1\uffff\2\172\1\145\1\163"+
		"\1\124\1\164\1\151\1\141\1\157\1\162\1\156\1\uffff\1\117\1\165\1\uffff"+
		"\1\164\1\uffff\1\172\2\uffff\1\162\1\164\1\157\1\154\1\162\1\150\1\157"+
		"\1\163\1\160\1\157\1\144\1\146\1\150\1\141\1\151\1\uffff\1\164\1\151\1"+
		"\72\1\141\1\157\1\72\1\156\1\163\1\145\1\155\1\151\1\72\1\141\1\154\1"+
		"\157\1\171\1\143\1\uffff\1\163\1\160\1\uffff\1\117\1\145\1\162\1\72\1"+
		"\166\1\uffff\1\151\1\72\1\156\1\72\2\163\1\145\1\146\1\163\1\164\1\uffff"+
		"\1\151\1\156\1\uffff\1\141\1\uffff\1\72\1\145\1\162\2\72\1\151\1\144\1"+
		"\72\1\154\1\uffff\1\163\1\164\2\uffff\1\145\1\165\1\uffff\1\172\1\72\1"+
		"\151\1\163\1\141\2\uffff\1\145\1\72\1\154\1\163\1\uffff\1\163\2\72\2\uffff";
	static final String DFA35_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\23\uffff\1\62\1\63\1\64\1\65\1\66\2\uffff"+
		"\1\21\35\uffff\1\6\41\uffff\1\7\1\10\3\uffff\1\15\1\16\31\uffff\1\13\2"+
		"\uffff\1\14\1\uffff\1\20\31\uffff\1\12\7\uffff\1\51\4\uffff\1\43\2\uffff"+
		"\1\50\3\uffff\1\33\12\uffff\1\52\10\uffff\1\31\6\uffff\1\42\1\11\1\17"+
		"\36\uffff\1\32\10\uffff\1\26\5\uffff\1\45\2\uffff\1\24\13\uffff\1\34\2"+
		"\uffff\1\22\1\uffff\1\47\1\uffff\1\27\1\30\17\uffff\1\25\21\uffff\1\35"+
		"\2\uffff\1\36\5\uffff\1\44\12\uffff\1\53\2\uffff\1\60\1\uffff\1\40\11"+
		"\uffff\1\41\2\uffff\1\37\1\55\2\uffff\1\46\5\uffff\1\23\1\54\4\uffff\1"+
		"\57\3\uffff\1\56\1\61";
	static final String DFA35_specialS =
		"\u0173\uffff}>";
	static final String[] DFA35_transitionS = {
			"\2\34\2\uffff\1\34\22\uffff\1\34\2\uffff\1\35\3\uffff\1\33\1\1\1\2\2"+
			"\uffff\1\3\3\uffff\12\32\7\uffff\1\22\1\31\1\26\1\30\1\27\1\17\2\31\1"+
			"\20\5\31\1\25\1\24\1\31\1\21\1\16\1\23\6\31\6\uffff\1\7\3\31\1\15\3\31"+
			"\1\11\3\31\1\14\1\10\1\6\3\31\1\13\2\31\1\12\4\31\1\4\1\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31\1\37\3"+
			"\31\1\36\10\31",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\47\7\uffff\1\46",
			"\1\50",
			"\1\54\3\uffff\1\51\17\uffff\1\53\3\uffff\1\52",
			"\1\56\23\uffff\1\55",
			"\1\57\3\uffff\1\60",
			"\1\62\3\uffff\1\61",
			"\1\63",
			"\1\64\6\uffff\1\65",
			"\1\66",
			"\1\70\13\uffff\1\67",
			"\1\72\3\uffff\1\71",
			"\1\73",
			"\1\74\5\uffff\1\75",
			"",
			"",
			"",
			"",
			"",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\77",
			"",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\117\21\uffff\1\116",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\135\14\uffff\1\134",
			"\1\136",
			"",
			"\1\137",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152\14\uffff\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"\1\u0081",
			"\1\u0082",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"\1\u0084",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089\7\uffff\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"",
			"\1\u009e",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\u00a0",
			"",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\2\u00a7\2\uffff\1\u00a7\22\uffff\1\u00a7\31\uffff\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\2\u00ac\2\uffff\1\u00ac\22\uffff\1\u00ac\31\uffff\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\2\u00af\2\uffff\1\u00af\22\uffff\1\u00af\31\uffff\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\2\u00b3\2\uffff\1\u00b3\22\uffff\1\u00b3\31\uffff\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\2\u00be\2\uffff\1\u00be\22\uffff\1\u00be\31\uffff\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"\2\u00c7\2\uffff\1\u00c7\22\uffff\1\u00c7\31\uffff\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\2\u00ce\2\uffff\1\u00ce\22\uffff\1\u00ce\31\uffff\1\u00ce",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6\10\uffff\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"",
			"",
			"",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\2\u00ef\2\uffff\1\u00ef\22\uffff\1\u00ef\31\uffff\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f5\14\uffff\1\u00f6\4\uffff\1\u00f4\1\uffff\1\u00f3",
			"\1\u00f7",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\2\u00fe\2\uffff\1\u00fe\22\uffff\1\u00fe\31\uffff\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\u0102",
			"\1\u0103",
			"",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b\2\uffff\1\u010c",
			"",
			"\2\u010d\2\uffff\1\u010d\22\uffff\1\u010d\31\uffff\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\u0111",
			"",
			"\2\u0112\2\uffff\1\u0112\22\uffff\1\u0112\31\uffff\1\u0112",
			"\1\u0113",
			"",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\u0116",
			"\1\u0117",
			"\1\u0119\14\uffff\1\u011a\3\uffff\1\u0118",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"",
			"\1\u0122\13\uffff\1\u0121",
			"\1\u0123",
			"",
			"\1\u0124",
			"",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"",
			"\1\u0135",
			"\1\u0136",
			"\2\u0137\2\uffff\1\u0137\22\uffff\1\u0137\31\uffff\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\2\u013a\2\uffff\1\u013a\22\uffff\1\u013a\31\uffff\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\2\u0140\2\uffff\1\u0140\22\uffff\1\u0140\31\uffff\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"",
			"\1\u0146",
			"\1\u0147",
			"",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\2\u014b\2\uffff\1\u014b\22\uffff\1\u014b\31\uffff\1\u014b",
			"\1\u014c",
			"",
			"\1\u014d",
			"\2\u014e\2\uffff\1\u014e\22\uffff\1\u014e\31\uffff\1\u014e",
			"\1\u014f",
			"\2\u0150\2\uffff\1\u0150\22\uffff\1\u0150\31\uffff\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"",
			"\1\u0157",
			"\1\u0158",
			"",
			"\1\u0159",
			"",
			"\2\u015a\2\uffff\1\u015a\22\uffff\1\u015a\31\uffff\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\2\u015d\2\uffff\1\u015d\22\uffff\1\u015d\31\uffff\1\u015d",
			"\2\u015e\2\uffff\1\u015e\22\uffff\1\u015e\31\uffff\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\2\u0161\2\uffff\1\u0161\22\uffff\1\u0161\31\uffff\1\u0161",
			"\1\u0162",
			"",
			"\1\u0163",
			"\1\u0164",
			"",
			"",
			"\1\u0165",
			"\1\u0166",
			"",
			"\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\2\u0168\2\uffff\1\u0168\22\uffff\1\u0168\31\uffff\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"",
			"",
			"\1\u016c",
			"\2\u016d\2\uffff\1\u016d\22\uffff\1\u016d\31\uffff\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"",
			"\1\u0170",
			"\2\u0171\2\uffff\1\u0171\22\uffff\1\u0171\31\uffff\1\u0171",
			"\2\u0172\2\uffff\1\u0172\22\uffff\1\u0172\31\uffff\1\u0172",
			"",
			""
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__68 | T__69 | T__70 | T__71 | T__72 | OR | AND | NOT | INVERSE | VALUE | ONLY | SOME | MIN | MAX | EXACTLY | SELF | COMPOSE | Functional | InverseFunctional | Reflexive | Irreflexive | Symmetric | Asymmetric | Transitive | Prefix | Ontology | Class | SubClassOf | EquivalentTo | DisjointWith | DisjointUnionOf | ObjectProperty | Characteristics | Domain | Range | SubPropertyOf | InverseOf | SubPropertyChain | Individual | Types | Facts | SameAs | DifferentFrom | EquivalentClasses | DisjointClasses | EquivalentProperties | DisjointProperties | SameIndividual | DifferentIndividuals | NAME | INTEGER | STRING | WS_2 | COMMENT );";
		}
	}

}
