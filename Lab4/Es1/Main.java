// Reduced C language compiler
// Author: Stefano Scanzio
// Date: match 2011
// Mail: stefano.scanzio@polito.it

import java.io.*;

public class Main {
    static public void main(String argv[]) {    
        try {

            /* Scanner instantiation */
            Facts_Rules_scanner l = new Facts_Rules_scanner(new FileReader(argv[0]));
            /* Parser instantiation */
            parser p = new parser(l);
            /* Run the parser */
            Object result = p.parse().value;
            
      } catch (NullPointerException e){
              System.err.println("Syntax error");
      } catch (FileNotFoundException e){
              System.err.println("Errore opening file " + argv[0]);
      } catch (Exception e){
              e.printStackTrace();
      }
    }
}


