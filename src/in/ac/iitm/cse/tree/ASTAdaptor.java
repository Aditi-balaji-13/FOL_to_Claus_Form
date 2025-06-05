/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.iitm.cse.tree;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.*;

/**
 *
 * @author baskaran
 */
public class ASTAdaptor extends CommonTreeAdaptor {
    @Override
	public Object create(Token payload) {
		return new AST(payload);
	}

    @Override
	public Object dupNode(Object t) {
		if ( t==null ) return null;
		return ((AST)t).dupNode();
	}

    @Override
	public Object errorNode(TokenStream input, Token start, Token stop,
							RecognitionException e)
	{
		ASTErrorNode t = new ASTErrorNode(input, start, stop, e);
		return t;
	}
}
