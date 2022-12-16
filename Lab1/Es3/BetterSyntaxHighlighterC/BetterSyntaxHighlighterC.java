/* The following code was generated by JFlex 1.7.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>BetterSyntaxHighlighterC.jflex</tt>
 */
class BetterSyntaxHighlighterC {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\1\1\44\1\44\1\2\24\0\1\46\1\45\6\0\1\40"+
    "\1\5\1\0\1\5\1\0\1\37\1\6\11\4\2\0\1\41\1\42"+
    "\1\41\2\0\32\3\1\0\1\43\2\0\1\3\1\0\1\7\1\13"+
    "\1\17\1\24\1\15\1\25\1\31\1\21\1\23\1\3\1\16\1\26"+
    "\1\27\1\22\1\12\1\35\1\3\1\14\1\20\1\11\1\10\1\36"+
    "\1\33\1\30\1\34\1\32\12\0\1\44\u1fa2\0\1\44\1\44\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\5\1\4\17\3"+
    "\3\5\2\1\1\6\1\1\20\3\2\7\6\3\1\10"+
    "\1\11\5\0\1\12\1\13\23\3\1\7\7\3\3\0"+
    "\1\14\1\0\1\3\1\7\21\3\3\0\1\14\1\0"+
    "\2\3\1\7\14\3\3\0\1\14\1\0\3\3\1\7"+
    "\4\3\2\0\2\3\1\7\3\3\1\7\30\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[181];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\116\0\165\0\234\0\303\0\352"+
    "\0\116\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb"+
    "\0\u0222\0\u0249\0\u0270\0\u0297\0\u02be\0\u02e5\0\u030c\0\u0333"+
    "\0\u035a\0\116\0\u0381\0\u03a8\0\u03cf\0\u03f6\0\u041d\0\u0444"+
    "\0\u046b\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c"+
    "\0\u05a3\0\u05ca\0\u05f1\0\u0618\0\u063f\0\u0666\0\u068d\0\u0444"+
    "\0\u06b4\0\u06db\0\u0702\0\u0729\0\u0750\0\u0777\0\u079e\0\u07c5"+
    "\0\116\0\u07ec\0\u0813\0\u083a\0\u0861\0\u03cf\0\116\0\116"+
    "\0\u0888\0\u08af\0\u08d6\0\u08fd\0\u0924\0\u094b\0\u0972\0\u0999"+
    "\0\u09c0\0\u09e7\0\u0a0e\0\u0a35\0\u0a5c\0\u0a83\0\u0aaa\0\u0ad1"+
    "\0\u0af8\0\u0b1f\0\u0b46\0\u0888\0\u0b6d\0\u0b94\0\u0bbb\0\u0be2"+
    "\0\u0c09\0\u0c30\0\u0c57\0\u0c7e\0\u0ca5\0\u0ccc\0\u0cf3\0\u0d1a"+
    "\0\u0d41\0\u0d41\0\u0d68\0\u0d8f\0\u0db6\0\u0ddd\0\u0e04\0\u0e2b"+
    "\0\u0e52\0\u0e79\0\u0ea0\0\u0ec7\0\u0eee\0\u0f15\0\u0f3c\0\u0f63"+
    "\0\u0f8a\0\u0fb1\0\u0fd8\0\u0fff\0\u1026\0\u104d\0\u1074\0\u109b"+
    "\0\u10c2\0\u10e9\0\u10c2\0\u1110\0\u1137\0\u115e\0\u1185\0\u11ac"+
    "\0\u11d3\0\u11fa\0\u1221\0\u1248\0\u126f\0\u1296\0\u12bd\0\u12e4"+
    "\0\u130b\0\u1332\0\u1359\0\u1380\0\u13a7\0\u13ce\0\u13f5\0\u13a7"+
    "\0\u141c\0\u1443\0\u146a\0\u1491\0\u14b8\0\u14df\0\u1506\0\u152d"+
    "\0\u1506\0\u1554\0\u157b\0\u15a2\0\u15a2\0\u15c9\0\u15f0\0\u1617"+
    "\0\u163e\0\u1665\0\u168c\0\u16b3\0\u16da\0\u1701\0\u1728\0\u174f"+
    "\0\u1776\0\u179d\0\u17c4\0\u17eb\0\u1812\0\u1839\0\u1860\0\u1887"+
    "\0\u18ae\0\u18d5\0\u18fc\0\u1923\0\116";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[181];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\6\1\15\1\16\1\17\1\6\1\20"+
    "\1\21\2\6\1\22\1\23\1\24\1\25\2\6\1\26"+
    "\1\6\1\27\2\6\1\30\1\31\1\32\2\33\1\3"+
    "\1\0\1\34\1\35\1\36\1\4\1\5\35\36\1\37"+
    "\2\36\1\3\3\36\50\0\1\4\50\0\2\40\1\0"+
    "\31\40\14\0\1\7\1\0\1\7\46\0\1\11\43\0"+
    "\2\40\1\0\2\40\1\41\26\40\13\0\2\40\1\0"+
    "\14\40\1\42\14\40\13\0\2\40\1\0\26\40\1\43"+
    "\2\40\13\0\2\40\1\0\6\40\1\44\22\40\13\0"+
    "\2\40\1\0\7\40\1\45\21\40\13\0\2\40\1\0"+
    "\14\40\1\46\3\40\1\47\1\40\1\50\6\40\13\0"+
    "\2\40\1\0\1\40\1\47\2\40\1\51\6\40\1\52"+
    "\15\40\13\0\2\40\1\0\3\40\1\53\7\40\1\54"+
    "\1\40\1\55\7\40\1\56\3\40\13\0\2\40\1\0"+
    "\14\40\1\57\2\40\1\60\11\40\13\0\2\40\1\0"+
    "\4\40\1\61\2\40\1\62\21\40\13\0\2\40\1\0"+
    "\4\40\1\63\13\40\1\64\10\40\13\0\2\40\1\0"+
    "\4\40\1\65\24\40\13\0\2\40\1\0\4\40\1\41"+
    "\24\40\13\0\2\40\1\0\13\40\1\66\15\40\13\0"+
    "\2\40\1\0\4\40\1\67\24\40\47\0\1\70\1\71"+
    "\50\0\1\32\14\0\1\72\4\0\1\73\5\0\1\74"+
    "\1\75\22\0\46\76\1\77\1\36\2\0\35\36\1\0"+
    "\2\36\1\0\3\36\37\0\1\100\12\0\2\101\1\0"+
    "\31\101\13\0\2\101\1\0\3\101\1\102\25\101\13\0"+
    "\2\101\1\0\12\101\1\103\2\101\1\104\13\101\13\0"+
    "\2\101\1\0\27\101\1\105\1\101\13\0\2\101\1\0"+
    "\7\101\1\106\21\101\13\0\2\101\1\0\3\101\1\107"+
    "\17\101\1\110\5\101\13\0\2\101\1\0\2\101\1\111"+
    "\26\101\13\0\2\101\1\0\12\101\1\112\16\101\13\0"+
    "\2\101\1\0\3\101\1\113\25\101\13\0\2\101\1\0"+
    "\14\101\1\114\14\101\13\0\2\101\1\0\1\101\1\115"+
    "\27\101\13\0\2\101\1\0\1\101\1\116\4\101\1\117"+
    "\22\101\13\0\2\101\1\0\4\101\1\120\24\101\13\0"+
    "\2\101\1\0\23\101\1\121\1\122\4\101\13\0\2\101"+
    "\1\0\15\101\1\123\13\101\13\0\2\101\1\0\3\101"+
    "\1\124\25\101\13\0\2\101\1\0\2\101\1\125\26\101"+
    "\13\0\2\101\1\0\17\101\1\126\11\101\13\0\2\101"+
    "\1\0\6\101\1\124\22\101\13\0\2\101\1\0\4\101"+
    "\1\127\24\101\13\0\2\101\1\0\14\101\1\130\14\101"+
    "\13\0\2\101\1\0\15\101\1\131\13\101\13\0\2\101"+
    "\1\0\15\101\1\132\2\101\1\133\10\101\10\0\1\70"+
    "\2\0\41\70\1\0\2\70\22\0\1\134\40\0\1\135"+
    "\54\0\1\136\2\0\1\137\36\0\1\140\34\0\2\141"+
    "\1\0\31\141\13\0\2\141\1\0\4\141\1\142\24\141"+
    "\13\0\2\141\1\0\15\141\1\143\13\141\13\0\2\141"+
    "\1\0\4\141\1\144\24\141\13\0\2\141\1\0\7\141"+
    "\1\145\21\141\13\0\2\141\1\0\1\141\1\146\27\141"+
    "\13\0\2\141\1\0\2\141\1\147\26\141\13\0\2\141"+
    "\1\0\15\141\1\150\13\141\13\0\2\141\1\0\21\141"+
    "\1\142\7\141\13\0\2\141\1\0\7\141\1\142\21\141"+
    "\13\0\2\141\1\0\7\141\1\147\21\141\13\0\2\141"+
    "\1\0\3\141\1\151\6\141\1\152\16\141\13\0\2\141"+
    "\1\0\6\141\1\142\22\141\13\0\2\141\1\0\3\141"+
    "\1\153\25\141\13\0\2\141\1\0\2\141\1\154\26\141"+
    "\13\0\2\141\1\0\6\141\1\152\22\141\13\0\2\141"+
    "\1\0\14\141\1\155\14\141\13\0\2\141\1\0\7\141"+
    "\1\156\21\141\13\0\2\141\1\0\3\141\1\157\25\141"+
    "\13\0\2\141\1\0\5\141\1\160\23\141\13\0\2\141"+
    "\1\0\1\141\1\161\27\141\13\0\2\141\1\0\1\141"+
    "\1\152\27\141\13\0\2\141\1\0\23\141\1\142\5\141"+
    "\13\0\2\141\1\0\20\141\1\162\10\141\13\0\2\141"+
    "\1\0\16\141\1\142\12\141\13\0\2\141\1\0\1\141"+
    "\1\163\27\141\34\0\1\164\36\0\1\165\51\0\1\166"+
    "\27\0\1\137\2\0\40\137\1\167\1\0\2\137\25\0"+
    "\1\170\24\0\2\171\1\0\31\171\13\0\2\171\1\0"+
    "\23\171\1\172\5\171\13\0\2\171\1\0\14\171\1\173"+
    "\14\171\13\0\2\171\1\0\16\171\1\174\12\171\13\0"+
    "\2\171\1\0\10\171\1\173\20\171\13\0\2\171\1\0"+
    "\6\171\1\175\22\171\13\0\2\171\1\0\12\171\1\176"+
    "\16\171\13\0\2\171\1\0\15\171\1\177\13\171\13\0"+
    "\2\171\1\0\3\171\1\173\25\171\13\0\2\171\1\0"+
    "\15\171\1\200\13\171\13\0\2\171\1\0\11\171\1\201"+
    "\17\171\13\0\2\171\1\0\7\171\1\202\21\171\13\0"+
    "\2\171\1\0\4\171\1\203\24\171\13\0\2\171\1\0"+
    "\11\171\1\204\17\171\13\0\2\171\1\0\20\171\1\205"+
    "\10\171\13\0\2\171\1\0\2\171\1\206\26\171\13\0"+
    "\2\171\1\0\7\171\1\173\21\171\13\0\2\171\1\0"+
    "\3\171\1\207\25\171\25\0\1\210\43\0\1\211\62\0"+
    "\1\212\20\0\2\137\1\213\40\137\1\167\1\0\2\137"+
    "\23\0\1\214\26\0\2\215\1\0\31\215\13\0\2\215"+
    "\1\0\14\215\1\216\14\215\13\0\2\215\1\0\7\215"+
    "\1\217\21\215\13\0\2\215\1\0\14\215\1\220\14\215"+
    "\13\0\2\215\1\0\3\215\1\221\25\215\13\0\2\215"+
    "\1\0\14\215\1\222\14\215\13\0\2\215\1\0\11\215"+
    "\1\220\17\215\13\0\2\215\1\0\3\215\1\220\25\215"+
    "\13\0\2\215\1\0\16\215\1\220\12\215\13\0\2\215"+
    "\1\0\17\215\1\220\11\215\13\0\2\215\1\0\13\215"+
    "\1\220\15\215\13\0\2\215\1\0\7\215\1\220\21\215"+
    "\13\0\2\215\1\0\20\215\1\223\10\215\13\0\2\215"+
    "\1\0\15\215\1\224\13\215\35\0\1\137\35\0\1\137"+
    "\42\0\1\225\36\0\2\137\1\0\40\137\1\167\1\0"+
    "\2\137\22\0\1\226\27\0\2\227\1\0\31\227\13\0"+
    "\2\227\1\0\7\227\1\230\21\227\13\0\2\227\1\0"+
    "\17\227\1\231\11\227\13\0\2\227\1\0\7\227\1\232"+
    "\21\227\13\0\2\227\1\0\2\227\1\233\26\227\13\0"+
    "\2\227\1\0\3\227\1\231\25\227\13\0\2\227\1\0"+
    "\20\227\1\233\10\227\34\0\1\226\37\0\1\137\34\0"+
    "\2\234\1\0\31\234\13\0\2\234\1\0\16\234\1\235"+
    "\12\234\13\0\2\234\1\0\6\234\1\235\22\234\13\0"+
    "\2\234\1\0\7\234\1\235\21\234\13\0\2\236\1\0"+
    "\31\236\13\0\2\237\1\0\31\237\13\0\2\240\1\0"+
    "\31\240\13\0\2\241\1\0\31\241\13\0\2\242\1\0"+
    "\31\242\13\0\2\243\1\0\31\243\13\0\2\244\1\0"+
    "\31\244\13\0\2\245\1\0\31\245\13\0\2\246\1\0"+
    "\31\246\13\0\2\247\1\0\31\247\13\0\2\250\1\0"+
    "\31\250\13\0\2\251\1\0\31\251\13\0\2\252\1\0"+
    "\31\252\13\0\2\253\1\0\31\253\13\0\2\254\1\0"+
    "\31\254\13\0\2\255\1\0\31\255\13\0\2\256\1\0"+
    "\31\256\13\0\2\257\1\0\31\257\13\0\2\260\1\0"+
    "\31\260\13\0\2\261\1\0\31\261\13\0\2\262\1\0"+
    "\31\262\13\0\2\263\1\0\31\263\13\0\2\264\1\0"+
    "\31\264\13\0\2\265\1\0\31\265\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6474];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\4\1\1\11\20\1\1\11\36\1\1\11"+
    "\5\0\2\11\33\1\3\0\1\1\1\0\23\1\3\0"+
    "\1\1\1\0\17\1\3\0\1\1\1\0\10\1\2\0"+
    "\36\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[181];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  BetterSyntaxHighlighterC(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { Htmllib.textPrint(yytext());
            } 
            // fall through
          case 13: break;
          case 2: 
            { Htmllib.printBR();
            } 
            // fall through
          case 14: break;
          case 3: 
            { Htmllib.colPrint(Htmllib.C_GREEN); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
            } 
            // fall through
          case 15: break;
          case 4: 
            { Htmllib.colPrint(Htmllib.C_LRED); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
            } 
            // fall through
          case 16: break;
          case 5: 
            { Htmllib.colPrint(Htmllib.C_RED); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
            } 
            // fall through
          case 17: break;
          case 6: 
            { Htmllib.colPrint(Htmllib.C_LBLUE); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
            } 
            // fall through
          case 18: break;
          case 7: 
            { Htmllib.colPrint(Htmllib.C_LBLUE); 
      Htmllib.textPrint(yytext());  
      Htmllib.endtagPrint();
            } 
            // fall through
          case 19: break;
          case 8: 
            { Htmllib.colPrint(Htmllib.C_PINK); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
            } 
            // fall through
          case 20: break;
          case 9: 
            { yybegin(COMMENT);
      Htmllib.colPrint(Htmllib.C_LGREY); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
            } 
            // fall through
          case 21: break;
          case 10: 
            { Htmllib.colPrint(Htmllib.C_LGREEN); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
            } 
            // fall through
          case 22: break;
          case 11: 
            { Htmllib.colPrint(Htmllib.C_LRED); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint(); 
      yybegin(YYINITIAL);
            } 
            // fall through
          case 23: break;
          case 12: 
            { Htmllib.colPrint(Htmllib.C_CYAN); 
      Htmllib.textPrint(yytext());
      Htmllib.endtagPrint();
            } 
            // fall through
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}