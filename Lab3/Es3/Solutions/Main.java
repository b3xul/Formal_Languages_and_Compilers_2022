/* Lab. 3 - Ex. 3 (Main) */
import java.io.*;
   
public class Main {
  static public void main(String argv[]) {    
    try {
      /* Scanner instantiation */
      scanner l = new scanner(new FileReader(argv[0]));
      /* Parser instantiation */
      parser p = new parser(l);
      /* Run the parser */
     Object result = p.parse();
      //Object result = p.debug_parse();     
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


