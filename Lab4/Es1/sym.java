
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int RO = 6;
  public static final int INTERROGATION_SYMBOL = 2;
  public static final int VARIABLE = 9;
  public static final int ATOM = 8;
  public static final int EOF = 0;
  public static final int RC = 7;
  public static final int DOT = 5;
  public static final int error = 1;
  public static final int COMMA = 4;
  public static final int RULE_SYMBOL = 3;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "INTERROGATION_SYMBOL",
  "RULE_SYMBOL",
  "COMMA",
  "DOT",
  "RO",
  "RC",
  "ATOM",
  "VARIABLE"
  };
public String[] TT;
	public sym(){
		TT = new String[100];
		TT[6]=new String("RO");
		TT[2]=new String("INTERROGATION_SYMBOL");
		TT[9]=new String("VARIABLE");
		TT[8]=new String("ATOM");
		TT[0]=new String("EOF");
		TT[7]=new String("RC");
		TT[5]=new String("DOT");
		TT[1]=new String("error");
		TT[4]=new String("COMMA");
		TT[3]=new String("RULE_SYMBOL");
	}
public String getTT(int i){return TT[i];}
}

