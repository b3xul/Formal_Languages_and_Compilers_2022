// Reduced C language compiler
// Author: Stefano Scanzio
// Date: match 2011
// Mail: stefano.scanzio@polito.it

import java.io.*;

public class Main {
    static public void main(String argv[]) {    
        try {

            /* Scanner instantiation */
            MiniC_scanner l = new MiniC_scanner(new FileReader(argv[0]));
            /* Parser instantiation */
            parser p = new parser(l);
            /* Run the parser */
            Object result = p.parse();
      } /* catch (NullPointerException e){
              System.out.println("Compilation failed!");
      }  */catch (Exception e){
              e.printStackTrace();
      }
    }
}


