/*
 * A simple program to print Abstract Syntax Trees in XML format.
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
 * 2022-04-02  S.Baskaran            Changed static methods to instance methods.
 *                                   Using simpleTokens() to reduce XML clutter.
 *                                   Removed @text and storing its content inside element.
 */

package in.ac.iitm.cse.tree;

import org.antlr.runtime.Token;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;

/**
 *
 * @author baskaran
 */
public class ASTPrinter {

    static public void print(AST tree, String[] tokenNames, Map<Integer,String> textAttr, boolean debug) {
        print(tree, tokenNames, new HashSet<Integer>(), textAttr, debug);
    }

    static public void print(AST tree, String[] tokenNames, Set<Integer> simpleTokens, Map<Integer,String> textAttr, boolean debug) {
        ASTPrinter printer = new ASTPrinter(tokenNames, simpleTokens, textAttr, debug); // work with an instance
        printer.print(tree, 0);
        printer.flush();
    }

    private ASTPrinter() {}

    private ASTPrinter(String[] tokenNames, Set<Integer> simpleTokens, Map<Integer,String> textAttr, boolean debug) {
        //tNames = new String[tokenNames.length];
        //for (int i=0; i<tokenNames.length; ++i) {
        //    String token = tokenNames[i];
        //    if (token.matches("^[_]?[a-zA-Z_].*[ \\t\\r\\n:]+")) {
        //        token = token.replaceAll("[ \\t\\r\\n:]+","");
        //    }
        //    tNames[i] = token;
        //}

        this.debug = debug;
        tNames = tokenNames;
        sTokens = simpleTokens;
        aText = textAttr;
        out = new StringBuilder(1024*1024);
    }

    private boolean debug = false;
    private String[] tNames=null;
    private Set<Integer> sTokens=null;
    private Map<Integer,String> aText=null;
    private StringBuilder out=null;

    private void flush() {
        System.out.print(out);
        out.delete(0, out.length()); //-- DO NOT DELETE THIS LINE.
    }

    private void blank(int indent) {
        while((indent--) > 0) out.append("    ");
    }

    static final private String[] beg = {"<",  "</", "<" }; //OPEN, CLOSE, OPEN-n-CLOSE
    static final private String[] end = {">",  ">",  "/>"}; //OPEN, CLOSE, OPEN-n-CLOSE

    private void tag(AST tree, int flag) {
        if (tree == null) {
            out.append(beg[2]);
            out.append("ERROR:NULL-TREE");
            out.append(end[2]);
        }
        else if (tree.getToken() == null) {
            out.append(beg[2]);
            out.append("ERROR:NULL-TOKEN");
            out.append(end[2]);
        }
        else {
            Token token = tree.getToken();
            String text = token.getText();
            String name = tNames[token.getType()];

            out.append(beg[flag]);
            out.append(name);

            if (flag == 0 && text != null) {
                if (debug || !sTokens.contains(token.getType())) {
                    if (!name.equalsIgnoreCase(text)) {
                        char c = text.charAt(0);
                        if (c == '\'' || c == '"') {
                            text = text.substring(1, text.length() - 1);
                        }
                        String textAtr = "text";
                        if (aText.containsKey(token.getType())) {
                            textAtr = aText.get(token.getType());
                        }
                        out.append(" ");
                        out.append(textAtr);
                        out.append("='");
                        out.append(xmlAttrEsc(text));
                        out.append("'");
                    }
                }
            }

            if (debug) {
                if (flag != 1 && token.getCharPositionInLine() >= 0) {
                    out.append(" pos='");
                    out.append(token.getLine());
                    out.append(":");
                    out.append(token.getCharPositionInLine());
                    out.append("'");
                }
            }

            if (flag == 2 && !sTokens.contains(token.getType())) {
                out.append(end[0]);
                out.append(xmlEsc(text));
                out.append(beg[1]);
                out.append(name);
                out.append(end[1]);
            }
            else {
                out.append(end[flag]);
            }
        }

    }


    private void print(AST t, int indent) {
        if (t != null) {
            int n=t.getChildCount();
            if (n > 0) {
                blank(indent); tag(t, 0); out.append("\n");
                for (int i=0; i<n; ++i) {
                    AST c = (AST)t.getChild(i);
                    print(c, indent+1);
                    flush();
                }
                blank(indent); tag(t, 1); out.append("\n");
            }
            else {
                blank(indent); tag(t, 2); out.append("\n");
            }
        }
    }


    static final private String[][] xmlAttributeEsc = {
            {"&"  , "&amp;" },
            {"\n" , "&#10;" },
            {"\r" , "&#13;" },
            {"'"  , "&apos;"},
            {"\"" , "&quot;"},
            {"<"  , "&lt;"  },
            {">"  , "&gt;"  }
    };

    private String xmlAttrEsc(String s) {
        for (String[] esc : xmlAttributeEsc) {
            s = s.replaceAll(esc[0], esc[1]);
        }
        return s;
    }

    static final private String[][] xmlBodyEsc = {
            {"&"  , "&amp;" },
            {"<"  , "&lt;"  },
            {">"  , "&gt;"  }
    };

    private String xmlEsc(String s) {
        for (String[] esc : xmlBodyEsc) {
            s = s.replaceAll(esc[0], esc[1]);
        }
        return s;
    }

}
