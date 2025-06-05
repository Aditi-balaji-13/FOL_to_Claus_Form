// $ANTLR 3.5.2 FOL.g 2022-04-06 16:37:41

package in.ac.iitm.cse.parser.fol;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class FOLLexer extends Lexer {
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

	    String stripQuotes(String t) { return t.substring(1,t.length()-1); }

	    public Map<Integer,String> textAttribute() {
	        Map<Integer,String> map = new HashMap<Integer,String>();
	        map.put(PREDICATE,"name");
	        map.put(FUNCTION,"name");
	        return map;
	    }

	    public Set<Integer> simpleTokens() {
	        Set<Integer> set = new HashSet<Integer>();

	        set.add(KB);
	        set.add(CONS);
	        set.add(NIL);
	        set.add(VARLIST);

	        set.add(NEG);
	        set.add(MUL);
	        set.add(DIV);
	        set.add(MOD);
	        set.add(ADD);
	        set.add(SUB);

	        set.add(TRUE);
	        set.add(FALSE);

	        set.add(FORALL);
	        set.add(EXISTS);

	        set.add(LT);
	        set.add(LE);
	        set.add(EQ);
	        set.add(GE);
	        set.add(GT);
	        set.add(NE);

	        set.add(IFF);
	        set.add(IMPLIES);
	        set.add(IMPLIEDBY);

	        set.add(AND);
	        set.add(OR);
	        set.add(NOT);

	        return set;
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public FOLLexer() {} 
	public FOLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public FOLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "FOL.g"; }

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:64:7
			// FOL.g:64:9
			{
			match("!="); if (state.failed) return;

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
			// FOL.g:65:7
			// FOL.g:65:9
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:66:7
			// FOL.g:66:9
			{
			match("&&"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:67:7
			// FOL.g:67:9
			{
			match('&'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:68:7
			// FOL.g:68:9
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:69:7
			// FOL.g:69:9
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:70:7
			// FOL.g:70:9
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:71:7
			// FOL.g:71:9
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:72:7
			// FOL.g:72:9
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:73:7
			// FOL.g:73:9
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:74:7
			// FOL.g:74:9
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:75:7
			// FOL.g:75:9
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:76:7
			// FOL.g:76:9
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:77:7
			// FOL.g:77:9
			{
			match("<="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:78:7
			// FOL.g:78:9
			{
			match("<=>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:79:7
			// FOL.g:79:9
			{
			match("<>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:80:7
			// FOL.g:80:9
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:81:7
			// FOL.g:81:9
			{
			match("=>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:82:7
			// FOL.g:82:9
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:83:7
			// FOL.g:83:9
			{
			match(">="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:84:7
			// FOL.g:84:9
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:85:7
			// FOL.g:85:9
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:86:7
			// FOL.g:86:9
			{
			match('{'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:87:7
			// FOL.g:87:9
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:88:7
			// FOL.g:88:9
			{
			match("||"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:89:7
			// FOL.g:89:9
			{
			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:90:7
			// FOL.g:90:9
			{
			match('~'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:275:13
			// FOL.g:275:17
			{
			mT(); if (state.failed) return;

			mR(); if (state.failed) return;

			mU(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:276:13
			// FOL.g:276:17
			{
			mF(); if (state.failed) return;

			mA(); if (state.failed) return;

			mL(); if (state.failed) return;

			mS(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FORALL"
	public final void mFORALL() throws RecognitionException {
		try {
			int _type = FORALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:278:13
			// FOL.g:278:17
			{
			mF(); if (state.failed) return;

			mO(); if (state.failed) return;

			mR(); if (state.failed) return;

			mA(); if (state.failed) return;

			mL(); if (state.failed) return;

			mL(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FORALL"

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:279:13
			// FOL.g:279:17
			{
			mE(); if (state.failed) return;

			mX(); if (state.failed) return;

			mI(); if (state.failed) return;

			mS(); if (state.failed) return;

			mT(); if (state.failed) return;

			mS(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXISTS"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:281:13
			// FOL.g:281:17
			{
			mL(); if (state.failed) return;

			mT(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:282:6
			// FOL.g:282:10
			{
			mL(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:283:13
			// FOL.g:283:17
			{
			mE(); if (state.failed) return;

			mQ(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:284:13
			// FOL.g:284:17
			{
			mG(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:285:13
			// FOL.g:285:17
			{
			mG(); if (state.failed) return;

			mT(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:286:13
			// FOL.g:286:17
			{
			mN(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "IFF"
	public final void mIFF() throws RecognitionException {
		try {
			int _type = IFF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:288:13
			// FOL.g:288:17
			{
			mI(); if (state.failed) return;

			mF(); if (state.failed) return;

			mF(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IFF"

	// $ANTLR start "IMPLIES"
	public final void mIMPLIES() throws RecognitionException {
		try {
			int _type = IMPLIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:289:13
			// FOL.g:289:17
			{
			mI(); if (state.failed) return;

			mM(); if (state.failed) return;

			mP(); if (state.failed) return;

			mL(); if (state.failed) return;

			mI(); if (state.failed) return;

			mE(); if (state.failed) return;

			mS(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLIES"

	// $ANTLR start "IMPLIEDBY"
	public final void mIMPLIEDBY() throws RecognitionException {
		try {
			int _type = IMPLIEDBY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:290:13
			// FOL.g:290:17
			{
			mI(); if (state.failed) return;

			mM(); if (state.failed) return;

			mP(); if (state.failed) return;

			mL(); if (state.failed) return;

			mI(); if (state.failed) return;

			mE(); if (state.failed) return;

			mD(); if (state.failed) return;

			mB(); if (state.failed) return;

			mY(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLIEDBY"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:292:13
			// FOL.g:292:17
			{
			mA(); if (state.failed) return;

			mN(); if (state.failed) return;

			mD(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:293:13
			// FOL.g:293:17
			{
			mO(); if (state.failed) return;

			mR(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:294:13
			// FOL.g:294:17
			{
			mN(); if (state.failed) return;

			mO(); if (state.failed) return;

			mT(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:296:13
			// FOL.g:296:17
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// FOL.g:296:28
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// FOL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:297:13
			// FOL.g:297:17
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// FOL.g:297:28
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// FOL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:299:13
			// FOL.g:299:17
			{
			// FOL.g:299:17
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// FOL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:300:13
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// FOL.g:300:17
					{
					match('.'); if (state.failed) return;
					// FOL.g:300:21
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// FOL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					// FOL.g:300:33
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// FOL.g:300:33
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 2 :
					// FOL.g:301:17
					{
					// FOL.g:301:50
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// FOL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match('.'); if (state.failed) return;
					// FOL.g:301:66
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// FOL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// FOL.g:301:78
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// FOL.g:301:78
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 3 :
					// FOL.g:302:17
					{
					// FOL.g:302:17
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// FOL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// FOL.g:302:29
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}

					else {
						alt10=2;
					}

					switch (alt10) {
						case 1 :
							// FOL.g:302:31
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;
						case 2 :
							// FOL.g:302:42
							{
							if ( state.backtracking==0 ) { _type=INTEGER; }
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:305:13
			// FOL.g:305:17
			{
			match('\''); if (state.failed) return;
			// FOL.g:305:22
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\\') ) {
					alt12=1;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// FOL.g:305:24
					{
					mESC_SEQ(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:305:34
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
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

			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:310:13
			// FOL.g:310:17
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:311:13
			// FOL.g:311:17
			{
			match('#'); if (state.failed) return;
			// FOL.g:311:21
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// FOL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
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

			// FOL.g:311:35
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\n'||LA15_0=='\r') ) {
				alt15=1;
			}

			else {
				alt15=2;
			}

			switch (alt15) {
				case 1 :
					// FOL.g:311:36
					{
					// FOL.g:311:36
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='\r') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// FOL.g:311:36
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					}
					break;
				case 2 :
					// FOL.g:311:47
					{
					match(EOF); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// FOL.g:319:13
			// FOL.g:319:17
			{
			mE(); if (state.failed) return;

			// FOL.g:319:19
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// FOL.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// FOL.g:319:30
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// FOL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// FOL.g:322:13
			// FOL.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// FOL.g:325:13
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
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
					alt18=1;
					}
					break;
				case 'u':
					{
					alt18=2;
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
					alt18=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// FOL.g:325:17
					{
					match('\\'); if (state.failed) return;
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// FOL.g:326:17
					{
					mUNICODE_ESC(); if (state.failed) return;

					}
					break;
				case 3 :
					// FOL.g:327:17
					{
					mOCTAL_ESC(); if (state.failed) return;

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
			// FOL.g:330:13
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
					int LA19_2 = input.LA(3);
					if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
						int LA19_4 = input.LA(4);
						if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						alt19=3;
					}

				}
				else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
					int LA19_3 = input.LA(3);
					if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
						alt19=2;
					}

					else {
						alt19=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// FOL.g:330:17
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// FOL.g:331:17
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// FOL.g:332:17
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
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
			// FOL.g:335:13
			// FOL.g:335:17
			{
			match('\\'); if (state.failed) return;
			match('u'); if (state.failed) return;
			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// FOL.g:336:13
			// FOL.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// FOL.g:337:13
			// FOL.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// FOL.g:338:13
			// FOL.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// FOL.g:339:13
			// FOL.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// FOL.g:340:13
			// FOL.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// FOL.g:341:13
			// FOL.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// FOL.g:342:13
			// FOL.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// FOL.g:343:13
			// FOL.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// FOL.g:344:13
			// FOL.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// FOL.g:345:13
			// FOL.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// FOL.g:346:13
			// FOL.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// FOL.g:347:13
			// FOL.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// FOL.g:348:13
			// FOL.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// FOL.g:349:13
			// FOL.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// FOL.g:350:13
			// FOL.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// FOL.g:351:13
			// FOL.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// FOL.g:352:13
			// FOL.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// FOL.g:353:13
			// FOL.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// FOL.g:354:13
			// FOL.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// FOL.g:355:13
			// FOL.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// FOL.g:356:13
			// FOL.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// FOL.g:357:13
			// FOL.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// FOL.g:358:13
			// FOL.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// FOL.g:359:13
			// FOL.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// FOL.g:360:13
			// FOL.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// FOL.g:361:13
			// FOL.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	// $ANTLR end "Z"

	@Override
	public void mTokens() throws RecognitionException {
		// FOL.g:1:8
		int alt20=50;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// FOL.g:1:10
				{
				mT__71(); if (state.failed) return;

				}
				break;
			case 2 :
				// FOL.g:1:16
				{
				mT__72(); if (state.failed) return;

				}
				break;
			case 3 :
				// FOL.g:1:22
				{
				mT__73(); if (state.failed) return;

				}
				break;
			case 4 :
				// FOL.g:1:28
				{
				mT__74(); if (state.failed) return;

				}
				break;
			case 5 :
				// FOL.g:1:34
				{
				mT__75(); if (state.failed) return;

				}
				break;
			case 6 :
				// FOL.g:1:40
				{
				mT__76(); if (state.failed) return;

				}
				break;
			case 7 :
				// FOL.g:1:46
				{
				mT__77(); if (state.failed) return;

				}
				break;
			case 8 :
				// FOL.g:1:52
				{
				mT__78(); if (state.failed) return;

				}
				break;
			case 9 :
				// FOL.g:1:58
				{
				mT__79(); if (state.failed) return;

				}
				break;
			case 10 :
				// FOL.g:1:64
				{
				mT__80(); if (state.failed) return;

				}
				break;
			case 11 :
				// FOL.g:1:70
				{
				mT__81(); if (state.failed) return;

				}
				break;
			case 12 :
				// FOL.g:1:76
				{
				mT__82(); if (state.failed) return;

				}
				break;
			case 13 :
				// FOL.g:1:82
				{
				mT__83(); if (state.failed) return;

				}
				break;
			case 14 :
				// FOL.g:1:88
				{
				mT__84(); if (state.failed) return;

				}
				break;
			case 15 :
				// FOL.g:1:94
				{
				mT__85(); if (state.failed) return;

				}
				break;
			case 16 :
				// FOL.g:1:100
				{
				mT__86(); if (state.failed) return;

				}
				break;
			case 17 :
				// FOL.g:1:106
				{
				mT__87(); if (state.failed) return;

				}
				break;
			case 18 :
				// FOL.g:1:112
				{
				mT__88(); if (state.failed) return;

				}
				break;
			case 19 :
				// FOL.g:1:118
				{
				mT__89(); if (state.failed) return;

				}
				break;
			case 20 :
				// FOL.g:1:124
				{
				mT__90(); if (state.failed) return;

				}
				break;
			case 21 :
				// FOL.g:1:130
				{
				mT__91(); if (state.failed) return;

				}
				break;
			case 22 :
				// FOL.g:1:136
				{
				mT__92(); if (state.failed) return;

				}
				break;
			case 23 :
				// FOL.g:1:142
				{
				mT__93(); if (state.failed) return;

				}
				break;
			case 24 :
				// FOL.g:1:148
				{
				mT__94(); if (state.failed) return;

				}
				break;
			case 25 :
				// FOL.g:1:154
				{
				mT__95(); if (state.failed) return;

				}
				break;
			case 26 :
				// FOL.g:1:160
				{
				mT__96(); if (state.failed) return;

				}
				break;
			case 27 :
				// FOL.g:1:166
				{
				mT__97(); if (state.failed) return;

				}
				break;
			case 28 :
				// FOL.g:1:172
				{
				mTRUE(); if (state.failed) return;

				}
				break;
			case 29 :
				// FOL.g:1:177
				{
				mFALSE(); if (state.failed) return;

				}
				break;
			case 30 :
				// FOL.g:1:183
				{
				mFORALL(); if (state.failed) return;

				}
				break;
			case 31 :
				// FOL.g:1:190
				{
				mEXISTS(); if (state.failed) return;

				}
				break;
			case 32 :
				// FOL.g:1:197
				{
				mLT(); if (state.failed) return;

				}
				break;
			case 33 :
				// FOL.g:1:200
				{
				mLE(); if (state.failed) return;

				}
				break;
			case 34 :
				// FOL.g:1:203
				{
				mEQ(); if (state.failed) return;

				}
				break;
			case 35 :
				// FOL.g:1:206
				{
				mGE(); if (state.failed) return;

				}
				break;
			case 36 :
				// FOL.g:1:209
				{
				mGT(); if (state.failed) return;

				}
				break;
			case 37 :
				// FOL.g:1:212
				{
				mNE(); if (state.failed) return;

				}
				break;
			case 38 :
				// FOL.g:1:215
				{
				mIFF(); if (state.failed) return;

				}
				break;
			case 39 :
				// FOL.g:1:219
				{
				mIMPLIES(); if (state.failed) return;

				}
				break;
			case 40 :
				// FOL.g:1:227
				{
				mIMPLIEDBY(); if (state.failed) return;

				}
				break;
			case 41 :
				// FOL.g:1:237
				{
				mAND(); if (state.failed) return;

				}
				break;
			case 42 :
				// FOL.g:1:241
				{
				mOR(); if (state.failed) return;

				}
				break;
			case 43 :
				// FOL.g:1:244
				{
				mNOT(); if (state.failed) return;

				}
				break;
			case 44 :
				// FOL.g:1:248
				{
				mNAME(); if (state.failed) return;

				}
				break;
			case 45 :
				// FOL.g:1:253
				{
				mVARIABLE(); if (state.failed) return;

				}
				break;
			case 46 :
				// FOL.g:1:262
				{
				mINTEGER(); if (state.failed) return;

				}
				break;
			case 47 :
				// FOL.g:1:270
				{
				mFLOAT(); if (state.failed) return;

				}
				break;
			case 48 :
				// FOL.g:1:276
				{
				mSTRING(); if (state.failed) return;

				}
				break;
			case 49 :
				// FOL.g:1:283
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 50 :
				// FOL.g:1:286
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_FOL
	public final void synpred1_FOL_fragment() throws RecognitionException {
		// FOL.g:301:17
		// FOL.g:301:18
		{
		// FOL.g:301:18
		int cnt21=0;
		loop21:
		while (true) {
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
				alt21=1;
			}

			switch (alt21) {
			case 1 :
				// FOL.g:
				{
				if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

			default :
				if ( cnt21 >= 1 ) break loop21;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(21, input);
				throw eee;
			}
			cnt21++;
		}

		match('.'); if (state.failed) return;
		// FOL.g:301:34
		int cnt22=0;
		loop22:
		while (true) {
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
				alt22=1;
			}

			switch (alt22) {
			case 1 :
				// FOL.g:
				{
				if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

			default :
				if ( cnt22 >= 1 ) break loop22;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(22, input);
				throw eee;
			}
			cnt22++;
		}

		}

	}
	// $ANTLR end synpred1_FOL

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


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA11_eotS =
		"\2\uffff\1\4\2\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\1\56\1\uffff\1\56\2\uffff";
	static final String DFA11_maxS =
		"\1\71\1\uffff\1\71\2\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\1\3";
	static final String DFA11_specialS =
		"\2\uffff\1\0\2\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\1\1\uffff\12\2",
			"",
			"\1\3\1\uffff\12\2",
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
			return "300:1: FLOAT : ( '.' ( '0' .. '9' )+ ( EXPONENT )? | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )=> ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ ( EXPONENT |) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_2 = input.LA(1);
						 
						int index11_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_2=='.') && (synpred1_FOL())) {s = 3;}
						else if ( ((LA11_2 >= '0' && LA11_2 <= '9')) ) {s = 2;}
						else s = 4;
						 
						input.seek(index11_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA20_eotS =
		"\3\uffff\1\56\6\uffff\1\57\1\uffff\1\63\1\65\1\67\3\uffff\1\71\2\uffff"+
		"\11\47\11\50\2\uffff\1\130\7\uffff\1\132\10\uffff\4\47\1\137\1\140\1\141"+
		"\1\142\1\143\1\144\4\47\1\151\4\50\1\137\1\140\1\141\1\142\1\143\1\144"+
		"\4\50\1\151\3\uffff\4\47\6\uffff\1\166\1\167\1\47\1\171\1\uffff\4\50\1"+
		"\166\1\167\1\50\1\171\1\177\3\47\2\uffff\1\47\1\uffff\1\177\4\50\1\uffff"+
		"\1\u0088\3\47\1\u0088\3\50\1\uffff\1\u008f\1\u0090\1\47\1\u008f\1\u0090"+
		"\1\50\2\uffff\1\u0095\1\47\1\u0095\1\50\1\uffff\1\47\1\50\2\u009a\1\uffff";
	static final String DFA20_eofS =
		"\u009b\uffff";
	static final String DFA20_minS =
		"\1\11\2\uffff\1\46\6\uffff\1\60\1\uffff\1\75\1\76\1\75\3\uffff\1\174\2"+
		"\uffff\1\122\1\101\1\121\3\105\1\106\1\116\2\122\1\101\1\121\3\105\1\106"+
		"\1\116\1\122\2\uffff\1\56\7\uffff\1\76\10\uffff\1\125\1\114\1\122\1\111"+
		"\6\60\1\124\1\106\1\120\1\104\1\60\1\125\1\114\1\122\1\111\6\60\1\124"+
		"\1\106\1\120\1\104\1\60\3\uffff\1\105\1\123\1\101\1\123\6\uffff\2\60\1"+
		"\114\1\60\1\uffff\1\105\1\123\1\101\1\123\2\60\1\114\2\60\1\105\1\114"+
		"\1\124\2\uffff\1\111\1\uffff\1\60\1\105\1\114\1\124\1\111\1\uffff\1\60"+
		"\1\114\1\123\1\105\1\60\1\114\1\123\1\105\1\uffff\2\60\1\104\2\60\1\104"+
		"\2\uffff\1\60\1\102\1\60\1\102\1\uffff\2\131\2\60\1\uffff";
	static final String DFA20_maxS =
		"\1\176\2\uffff\1\46\6\uffff\1\71\1\uffff\2\76\1\75\3\uffff\1\174\2\uffff"+
		"\1\162\1\157\1\170\2\164\1\157\1\155\1\156\2\162\1\157\1\170\2\164\1\157"+
		"\1\155\1\156\1\162\2\uffff\1\145\7\uffff\1\76\10\uffff\1\165\1\154\1\162"+
		"\1\151\6\172\1\164\1\146\1\160\1\144\1\172\1\165\1\154\1\162\1\151\6\172"+
		"\1\164\1\146\1\160\1\144\1\172\3\uffff\1\145\1\163\1\141\1\163\6\uffff"+
		"\2\172\1\154\1\172\1\uffff\1\145\1\163\1\141\1\163\2\172\1\154\2\172\1"+
		"\145\1\154\1\164\2\uffff\1\151\1\uffff\1\172\1\145\1\154\1\164\1\151\1"+
		"\uffff\1\172\1\154\1\163\1\145\1\172\1\154\1\163\1\145\1\uffff\2\172\1"+
		"\163\2\172\1\163\2\uffff\1\172\1\142\1\172\1\142\1\uffff\2\171\2\172\1"+
		"\uffff";
	static final String DFA20_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\3\uffff"+
		"\1\25\1\26\1\27\1\uffff\1\32\1\33\22\uffff\1\54\1\55\1\uffff\1\60\1\61"+
		"\1\62\1\3\1\4\1\13\1\57\1\uffff\1\20\1\15\1\22\1\21\1\24\1\23\1\31\1\30"+
		"\36\uffff\1\56\1\17\1\16\4\uffff\1\42\1\40\1\41\1\43\1\44\1\45\4\uffff"+
		"\1\52\14\uffff\1\53\1\46\1\uffff\1\51\5\uffff\1\34\10\uffff\1\35\6\uffff"+
		"\1\36\1\37\4\uffff\1\47\4\uffff\1\50";
	static final String DFA20_specialS =
		"\u009b\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\53\2\uffff\1\53\22\uffff\1\53\1\1\1\uffff\1\54\1\uffff\1\2\1\3\1\52"+
			"\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\51\2\uffff\1\14\1\15\1\16\2\uffff"+
			"\1\45\3\50\1\40\1\37\1\42\1\50\1\44\2\50\1\41\1\50\1\43\1\46\4\50\1\36"+
			"\6\50\1\17\1\uffff\1\20\3\uffff\1\34\3\47\1\27\1\26\1\31\1\47\1\33\2"+
			"\47\1\30\1\47\1\32\1\35\4\47\1\25\6\47\1\21\1\22\1\23\1\24",
			"",
			"",
			"\1\55",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\60",
			"",
			"\1\61\1\62",
			"\1\64",
			"\1\66",
			"",
			"",
			"",
			"\1\70",
			"",
			"",
			"\1\72\37\uffff\1\72",
			"\1\73\15\uffff\1\74\21\uffff\1\73\15\uffff\1\74",
			"\1\76\6\uffff\1\75\30\uffff\1\76\6\uffff\1\75",
			"\1\100\16\uffff\1\77\20\uffff\1\100\16\uffff\1\77",
			"\1\101\16\uffff\1\102\20\uffff\1\101\16\uffff\1\102",
			"\1\103\11\uffff\1\104\25\uffff\1\103\11\uffff\1\104",
			"\1\105\6\uffff\1\106\30\uffff\1\105\6\uffff\1\106",
			"\1\107\37\uffff\1\107",
			"\1\110\37\uffff\1\110",
			"\1\111\37\uffff\1\111",
			"\1\112\15\uffff\1\113\21\uffff\1\112\15\uffff\1\113",
			"\1\115\6\uffff\1\114\30\uffff\1\115\6\uffff\1\114",
			"\1\117\16\uffff\1\116\20\uffff\1\117\16\uffff\1\116",
			"\1\120\16\uffff\1\121\20\uffff\1\120\16\uffff\1\121",
			"\1\122\11\uffff\1\123\25\uffff\1\122\11\uffff\1\123",
			"\1\124\6\uffff\1\125\30\uffff\1\124\6\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127\37\uffff\1\127",
			"",
			"",
			"\1\60\1\uffff\12\51\13\uffff\1\60\37\uffff\1\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\131",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\133\37\uffff\1\133",
			"\1\134\37\uffff\1\134",
			"\1\135\37\uffff\1\135",
			"\1\136\37\uffff\1\136",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\145\37\uffff\1\145",
			"\1\146\37\uffff\1\146",
			"\1\147\37\uffff\1\147",
			"\1\150\37\uffff\1\150",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\152\37\uffff\1\152",
			"\1\153\37\uffff\1\153",
			"\1\154\37\uffff\1\154",
			"\1\155\37\uffff\1\155",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\156\37\uffff\1\156",
			"\1\157\37\uffff\1\157",
			"\1\160\37\uffff\1\160",
			"\1\161\37\uffff\1\161",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			"\1\162\37\uffff\1\162",
			"\1\163\37\uffff\1\163",
			"\1\164\37\uffff\1\164",
			"\1\165\37\uffff\1\165",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\170\37\uffff\1\170",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"",
			"\1\172\37\uffff\1\172",
			"\1\173\37\uffff\1\173",
			"\1\174\37\uffff\1\174",
			"\1\175\37\uffff\1\175",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\176\37\uffff\1\176",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0080\37\uffff\1\u0080",
			"\1\u0081\37\uffff\1\u0081",
			"\1\u0082\37\uffff\1\u0082",
			"",
			"",
			"\1\u0083\37\uffff\1\u0083",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0084\37\uffff\1\u0084",
			"\1\u0085\37\uffff\1\u0085",
			"\1\u0086\37\uffff\1\u0086",
			"\1\u0087\37\uffff\1\u0087",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0089\37\uffff\1\u0089",
			"\1\u008a\37\uffff\1\u008a",
			"\1\u008b\37\uffff\1\u008b",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u008c\37\uffff\1\u008c",
			"\1\u008d\37\uffff\1\u008d",
			"\1\u008e\37\uffff\1\u008e",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0092\16\uffff\1\u0091\20\uffff\1\u0092\16\uffff\1\u0091",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0094\16\uffff\1\u0093\20\uffff\1\u0094\16\uffff\1\u0093",
			"",
			"",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\1\u0096\37\uffff\1\u0096",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0097\37\uffff\1\u0097",
			"",
			"\1\u0098\37\uffff\1\u0098",
			"\1\u0099\37\uffff\1\u0099",
			"\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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

	protected class DFA20 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | TRUE | FALSE | FORALL | EXISTS | LT | LE | EQ | GE | GT | NE | IFF | IMPLIES | IMPLIEDBY | AND | OR | NOT | NAME | VARIABLE | INTEGER | FLOAT | STRING | WS | COMMENT );";
		}
	}

}
