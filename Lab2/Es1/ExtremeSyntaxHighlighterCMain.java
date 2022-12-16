import java.io.*;
import java.lang.*;

class ExtremeSyntaxHighlighterCMain {
    public static void main(String argv[]) {
        
        if (argv.length == 0) {
            System.out.println("Usage : java ExtremeSyntaxHighlighterCMain <inputfiles>");
        }
        else {
            // The loop scans all the .c files given as cmd line arguments
            for (int i = 0; i < argv.length; i++) {
                /* 1 - Scanner declaration */
                // for each file a new Yylex (default class for scanners) scanner is created. It is defined by the es3.jflex file
                // If we want to create a custom scanner class, we need to use the %class MyScannerClass directive in the jflex program, and
                // here we will use the MyScannerClass Class instead of the Yylex class.
                //Yylex scanner = null;
                ExtremeSyntaxHighlighterC scanner = null;
                try {
                    //System.out.println(argv[i]);
                    /* 2 - scanner = new Yylex() -> Scanner instantiation using the constructor Yylex()
                       3 - new java.io.FileReader(argv[i]) -> Pass to the scanner the file to be scanned */
                    scanner = new ExtremeSyntaxHighlighterC( new java.io.FileReader(argv[i]) );
                    /* 4 - Scan file until the end of file is reached: in this case yylex() methods returns Yylex.YYEOF
                    IMP: The yylex() method returns an integer constant (YYEOF) because in the .jflex file the directive
                    %integer was used, otherwise yylex returns a class of type YyToken.
                    
                    Each time the yylex method is called, the next token is returned
                    */
                    while ( scanner.yylex() != ExtremeSyntaxHighlighterC.YYEOF );
                    /* Chiude il tag <code> */
                }
                catch (java.io.FileNotFoundException e) {
                    System.out.println("File not found : \"" + argv[i] + "\"");
                }
                catch (java.io.IOException e) {
                    System.out.println("IO error scanning file \"" + argv[i] + "\"");
                    System.out.println(e);
                }
                catch (Exception e) {
                    System.out.println("Unexpected exception:");
                    e.printStackTrace();
                }
            }
        }
    }
}
