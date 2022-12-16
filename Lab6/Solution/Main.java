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

            /* Istanzio lo scanner aprendo il file di ingresso argv[0] */
            scanner l = new scanner(new FileReader(argv[0]));
            /* Istanzio il parser */
            parser p = new parser(l);
            /* Avvio il parser */
            Object result = p.parse();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


