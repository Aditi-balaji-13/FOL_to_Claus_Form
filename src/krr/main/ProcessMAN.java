/*
 * A program to convert (a fragment of) OWL Manchester file to XML format.
 * published by:
 *    Department of Computer Science and Engineering,
 *    Indian Institute of Technology Madras,
 *    Chennai-36, India.
 *
 * Copyright 2012 Indian Institute of Technology Madras.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is part of the course assignment;
 * you can redistribute it and/or modify it as long as this header is retained.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 */
/* Revision History:
 * Date        Author                Description/Change
 * 2012-03-06  S.Baskaran            First release
 * 2022-04-02  S.Baskaran            Using simpleTokens() to reduce XML clutter.
 */

package krr.main;

import in.ac.iitm.cse.parser.man.MANLexer;
import in.ac.iitm.cse.parser.man.MANParser;
import in.ac.iitm.cse.tree.AST;
import in.ac.iitm.cse.tree.ASTAdaptor;
import in.ac.iitm.cse.tree.ASTPrinter;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

/**
 *
 * @author baskaran
 */
public class ProcessMAN extends Process {

    private ProcessMAN() { super(); }

    static private ProcessMAN instance=null;
    static public ProcessMAN getInstance() {
        if (instance == null) {
            instance = new ProcessMAN();
        }
        return instance;
    }
    static boolean debug=false;
    public void debug() { debug=true; }

    public void run(String infile) {
        try {
            CharStream input = new ANTLRFileStream(infile);
            MANLexer lex = new MANLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lex);
            MANParser parser = new MANParser(tokens);

            ASTAdaptor adaptor = new ASTAdaptor();
            parser.setTreeAdaptor(adaptor);

            AST t = (AST) parser.cunit().getTree();

            //if (debug) {
            //    System.out.print("AST:\n");
            //    System.out.println(t.toStringTree());
            //}

            ASTPrinter.print(t,parser.getTokenNames(), lex.simpleTokens(), lex.textAttribute(), debug);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
