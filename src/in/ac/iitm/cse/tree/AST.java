/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.iitm.cse.tree;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonErrorNode;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author baskaran
 */
public class AST extends CommonTree {

    // <editor-fold defaultstate="collapsed" desc="AST node types">
    static public enum Type {
        ERROR,
    //  term
        INTEGER,
        FLOAT,
        STRING,
        CONSTANT,
        VARIABLE,
        LIST,
        FUNCTION,
        MINUS,
        MULTIPLY, DIVIDE,
        ADD, SUBTRACT,

    //  proposition
        PROPOSITION,

    //  formula
        LT, LE, EQ, GE, GT, NE,
        PREDICATE,

        FORALL,
        EXISTS,
        NOT,
        AND,
        OR,
        IMPLIES, IMPLIEDBY,
        IFF,

    //  horn clause
        HORNCLAUSE,
        HEAD, //PREDICATE,
        FACT,
        QUERY,
        CUT,

        PROGRAM;

        public boolean isTerm() {
            switch (this) {
                case INTEGER:
                case FLOAT:
                case STRING:
                case CONSTANT:
                case VARIABLE:
                case LIST:
                case FUNCTION:
                case MINUS:
                case MULTIPLY: case DIVIDE:
                case ADD: case SUBTRACT:
                    return true;
            }
            return false;
        }

        public boolean isFOLFormula() {
            switch (this) {
                case LT: case LE: case EQ: case GE: case GT: case NE:
                case PREDICATE:

                case NOT:
                case AND:
                case OR:
                case IMPLIES: case IMPLIEDBY:
                case IFF:
                case FORALL:
                case EXISTS:

                case PROPOSITION:
                    return true;
            }
            return false;
        }

        public boolean isHCFormula() {
            switch (this) {
                case HORNCLAUSE:
                case HEAD:
                case PREDICATE:
                case FACT:
                case QUERY:

                case CUT:
                case NOT:
                    return true;
            }
            return false;
        }
    }
    // </editor-fold>

    public AST() {
        super();
    }
    public AST(Token t) {
        super(t);
    }
	public AST(AST node) {
		super(node);
	}
    @Override
	public Tree dupNode() {
		return new AST(this);
	}

}
