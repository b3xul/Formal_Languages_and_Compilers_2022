// Reduced C language compiler
// Author: Stefano Scanzio
// Date: match 2011
// Mail: stefano.scanzio@polito.it

import java.io.*;

public class Main {
    static public void main(String argv[]) {    
        if (argv.length==1)
            parser.dumpOutput = "stdout";
        else if (argv.length==2)
            parser.dumpOutput=argv[1];
        else{
            System.out.println("USAGE: java Main <in_file> (<out_file>)?");
            System.exit(0);
        }
        try {

            /* Scanner instantiation */
            Lexer l = new Lexer(new FileReader(argv[0]));
            /* Parser instantiation */
            parser p = new parser(l);
            /* Run the parser */
            Object result = p.parse();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


