/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.*;
import java.lang.reflect.Field;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>MiniC_scanner.jflex</tt>
 */
class MiniC_scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\52\1\52\1\2\22\0\1\3\1\36\1\0"+
    "\1\53\2\0\1\45\1\0\1\36\1\36\1\40\1\37\1\36\1\37"+
    "\1\43\1\41\1\47\11\5\1\0\1\36\1\44\1\42\1\44\2\0"+
    "\4\4\1\50\25\4\1\36\1\51\1\36\1\0\1\4\1\0\1\6"+
    "\1\12\1\16\1\23\1\14\1\24\1\30\1\20\1\22\1\4\1\15"+
    "\1\25\1\26\1\21\1\11\1\34\1\4\1\13\1\17\1\10\1\7"+
    "\1\35\1\32\1\27\1\33\1\31\1\36\1\46\1\36\1\36\6\0"+
    "\1\52\u1fa2\0\1\52\1\52\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\20\3\6\5\1\4"+
    "\1\1\1\3\1\6\17\3\2\7\7\3\1\0\1\10"+
    "\4\0\1\3\1\0\22\3\1\11\2\3\1\7\6\3"+
    "\4\0\1\2\1\0\1\3\1\6\1\0\1\7\22\3"+
    "\1\10\3\0\1\2\1\0\2\3\1\7\13\3\1\12"+
    "\1\3\3\0\1\2\1\0\3\3\1\7\2\3\1\11"+
    "\2\3\2\0\2\3\1\7\3\3\1\7\30\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[189];
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
    "\0\0\0\54\0\54\0\130\0\204\0\260\0\334\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\54\0\u039c"+
    "\0\u03c8\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc"+
    "\0\u0528\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764\0\u0790\0\u04d0"+
    "\0\u07bc\0\u07e8\0\u0814\0\u0840\0\u086c\0\u0898\0\u08c4\0\u08f0"+
    "\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\u0a50"+
    "\0\u0a7c\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0"+
    "\0\u0bdc\0\u0c08\0\u0c34\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4\0\u0d10"+
    "\0\u0d3c\0\u0d68\0\u0a24\0\u0d94\0\u0dc0\0\u0a24\0\u0dec\0\u0e18"+
    "\0\u0e44\0\u0e70\0\u0e9c\0\u0ec8\0\u0ef4\0\u0f20\0\u0f4c\0\u0f78"+
    "\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028\0\u1028\0\u0ffc\0\u1054\0\u1080"+
    "\0\u10ac\0\u10d8\0\u1104\0\u1130\0\u115c\0\u1188\0\u11b4\0\u11e0"+
    "\0\u120c\0\u1238\0\u1264\0\u1290\0\u12bc\0\u12e8\0\u1314\0\u1340"+
    "\0\54\0\u136c\0\u1398\0\u13c4\0\u13f0\0\u141c\0\u1448\0\u1474"+
    "\0\u1448\0\u14a0\0\u14cc\0\u14f8\0\u1524\0\u1550\0\u157c\0\u15a8"+
    "\0\u15d4\0\u1600\0\u162c\0\u1658\0\u1448\0\u1684\0\u16b0\0\u16dc"+
    "\0\u1708\0\u1734\0\u1760\0\u178c\0\u17b8\0\u17e4\0\u178c\0\u1810"+
    "\0\u183c\0\u178c\0\u1868\0\u1894\0\u18c0\0\u18ec\0\u1918\0\u1944"+
    "\0\u1918\0\u1970\0\u199c\0\u19c8\0\u19c8\0\u19f4\0\u1a20\0\u1a4c"+
    "\0\u1a78\0\u1aa4\0\u1ad0\0\u1afc\0\u1b28\0\u1b54\0\u1b80\0\u1bac"+
    "\0\u1bd8\0\u1c04\0\u1c30\0\u1c5c\0\u1c88\0\u1cb4\0\u1ce0\0\u1d0c"+
    "\0\u1d38\0\u1d64\0\u1d90\0\u1dbc\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[189];
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
    "\1\2\1\3\1\4\1\3\1\5\1\6\1\7\1\10"+
    "\1\11\1\5\1\12\1\13\1\14\1\5\1\15\1\16"+
    "\2\5\1\17\1\20\1\21\1\22\2\5\1\23\1\5"+
    "\1\24\1\5\1\25\1\26\3\27\1\30\1\31\1\32"+
    "\1\31\1\33\1\34\1\35\1\5\1\2\1\0\1\36"+
    "\55\0\1\3\56\0\32\37\11\0\2\37\10\0\1\6"+
    "\35\0\1\40\3\0\1\6\10\0\3\37\1\41\26\37"+
    "\11\0\2\37\7\0\15\37\1\42\14\37\11\0\2\37"+
    "\7\0\27\37\1\43\2\37\11\0\2\37\7\0\7\37"+
    "\1\44\22\37\11\0\2\37\7\0\10\37\1\45\21\37"+
    "\11\0\2\37\7\0\15\37\1\46\3\37\1\47\1\37"+
    "\1\50\6\37\11\0\2\37\7\0\2\37\1\47\2\37"+
    "\1\51\6\37\1\52\15\37\11\0\2\37\7\0\4\37"+
    "\1\53\7\37\1\54\1\37\1\55\7\37\1\56\3\37"+
    "\11\0\2\37\7\0\15\37\1\57\2\37\1\60\11\37"+
    "\11\0\2\37\7\0\5\37\1\61\2\37\1\62\21\37"+
    "\11\0\2\37\7\0\5\37\1\63\13\37\1\64\10\37"+
    "\11\0\2\37\7\0\5\37\1\65\24\37\11\0\2\37"+
    "\7\0\5\37\1\41\24\37\11\0\2\37\7\0\14\37"+
    "\1\66\15\37\11\0\2\37\7\0\7\37\1\67\22\37"+
    "\11\0\2\37\7\0\5\37\1\70\24\37\11\0\2\37"+
    "\43\0\1\71\1\72\54\0\1\27\16\0\1\40\41\0"+
    "\1\40\51\0\1\27\50\0\1\27\3\0\1\27\50\0"+
    "\1\40\17\0\1\73\4\0\1\74\5\0\1\75\1\76"+
    "\34\0\32\77\11\0\2\77\10\0\1\40\6\0\1\100"+
    "\32\0\1\40\1\100\7\0\4\77\1\101\25\77\11\0"+
    "\2\77\7\0\13\77\1\102\2\77\1\103\13\77\11\0"+
    "\2\77\7\0\30\77\1\104\1\77\11\0\2\77\7\0"+
    "\10\77\1\105\21\77\11\0\2\77\7\0\4\77\1\106"+
    "\17\77\1\107\5\77\11\0\2\77\7\0\3\77\1\110"+
    "\26\77\11\0\2\77\7\0\13\77\1\111\16\77\11\0"+
    "\2\77\7\0\4\77\1\112\25\77\11\0\2\77\7\0"+
    "\15\77\1\113\14\77\11\0\2\77\7\0\2\77\1\114"+
    "\27\77\11\0\2\77\7\0\2\77\1\115\4\77\1\116"+
    "\22\77\11\0\2\77\7\0\5\77\1\117\24\77\11\0"+
    "\2\77\7\0\24\77\1\120\1\121\4\77\11\0\2\77"+
    "\7\0\16\77\1\122\13\77\11\0\2\77\7\0\4\77"+
    "\1\123\25\77\11\0\2\77\7\0\3\77\1\124\26\77"+
    "\11\0\2\77\7\0\20\77\1\125\11\77\11\0\2\77"+
    "\7\0\7\77\1\126\22\77\11\0\2\77\7\0\5\77"+
    "\1\127\24\77\11\0\2\77\7\0\15\77\1\130\14\77"+
    "\11\0\2\77\7\0\16\77\1\131\13\77\11\0\2\77"+
    "\7\0\16\77\1\132\13\77\11\0\2\77\7\0\16\77"+
    "\1\133\2\77\1\134\10\77\11\0\2\77\3\0\40\71"+
    "\1\135\13\71\1\72\2\0\47\72\1\0\1\72\21\0"+
    "\1\136\45\0\1\137\61\0\1\140\2\0\1\141\43\0"+
    "\1\142\43\0\32\143\11\0\2\143\10\0\1\144\31\0"+
    "\1\145\7\0\1\144\10\0\5\143\1\146\24\143\11\0"+
    "\2\143\7\0\16\143\1\147\13\143\11\0\2\143\7\0"+
    "\5\143\1\150\24\143\11\0\2\143\7\0\10\143\1\151"+
    "\21\143\11\0\2\143\7\0\2\143\1\152\27\143\11\0"+
    "\2\143\7\0\3\143\1\153\26\143\11\0\2\143\7\0"+
    "\16\143\1\154\13\143\11\0\2\143\7\0\22\143\1\146"+
    "\7\143\11\0\2\143\7\0\10\143\1\146\21\143\11\0"+
    "\2\143\7\0\10\143\1\153\21\143\11\0\2\143\7\0"+
    "\4\143\1\155\6\143\1\156\16\143\11\0\2\143\7\0"+
    "\7\143\1\146\22\143\11\0\2\143\7\0\4\143\1\157"+
    "\25\143\11\0\2\143\7\0\3\143\1\160\26\143\11\0"+
    "\2\143\7\0\7\143\1\156\22\143\11\0\2\143\7\0"+
    "\15\143\1\161\14\143\11\0\2\143\7\0\10\143\1\162"+
    "\21\143\11\0\2\143\7\0\4\143\1\163\25\143\11\0"+
    "\2\143\7\0\6\143\1\164\23\143\11\0\2\143\7\0"+
    "\2\143\1\165\27\143\11\0\2\143\7\0\2\143\1\156"+
    "\27\143\11\0\2\143\7\0\24\143\1\146\5\143\11\0"+
    "\2\143\7\0\21\143\1\166\10\143\11\0\2\143\7\0"+
    "\15\143\1\167\14\143\11\0\2\143\7\0\17\143\1\146"+
    "\12\143\11\0\2\143\7\0\2\143\1\170\27\143\11\0"+
    "\2\143\3\0\40\71\1\135\1\171\12\71\23\0\1\172"+
    "\43\0\1\173\56\0\1\174\35\0\1\141\2\0\46\141"+
    "\1\175\1\0\1\141\24\0\1\176\33\0\32\177\11\0"+
    "\2\177\10\0\1\144\41\0\1\144\10\0\24\177\1\200"+
    "\5\177\11\0\2\177\7\0\15\177\1\201\14\177\11\0"+
    "\2\177\7\0\17\177\1\202\12\177\11\0\2\177\7\0"+
    "\11\177\1\201\20\177\11\0\2\177\7\0\7\177\1\203"+
    "\22\177\11\0\2\177\7\0\13\177\1\204\16\177\11\0"+
    "\2\177\7\0\16\177\1\205\13\177\11\0\2\177\7\0"+
    "\4\177\1\201\25\177\11\0\2\177\7\0\16\177\1\206"+
    "\13\177\11\0\2\177\7\0\12\177\1\207\17\177\11\0"+
    "\2\177\7\0\10\177\1\210\21\177\11\0\2\177\7\0"+
    "\5\177\1\211\24\177\11\0\2\177\7\0\12\177\1\212"+
    "\17\177\11\0\2\177\7\0\21\177\1\213\10\177\11\0"+
    "\2\177\7\0\3\177\1\214\26\177\11\0\2\177\7\0"+
    "\10\177\1\201\21\177\11\0\2\177\7\0\4\177\1\215"+
    "\25\177\11\0\2\177\7\0\4\177\1\216\25\177\11\0"+
    "\2\177\17\0\1\217\50\0\1\220\67\0\1\221\26\0"+
    "\2\141\1\222\46\141\1\175\1\0\1\141\22\0\1\223"+
    "\35\0\32\224\11\0\2\224\7\0\15\224\1\225\14\224"+
    "\11\0\2\224\7\0\10\224\1\226\21\224\11\0\2\224"+
    "\7\0\15\224\1\227\14\224\11\0\2\224\7\0\4\224"+
    "\1\230\25\224\11\0\2\224\7\0\15\224\1\231\14\224"+
    "\11\0\2\224\7\0\12\224\1\227\17\224\11\0\2\224"+
    "\7\0\4\224\1\227\25\224\11\0\2\224\7\0\17\224"+
    "\1\227\12\224\11\0\2\224\7\0\20\224\1\227\11\224"+
    "\11\0\2\224\7\0\14\224\1\227\15\224\11\0\2\224"+
    "\7\0\10\224\1\232\21\224\11\0\2\224\7\0\21\224"+
    "\1\233\10\224\11\0\2\224\7\0\16\224\1\234\13\224"+
    "\11\0\2\224\27\0\1\141\42\0\1\141\47\0\1\235"+
    "\44\0\2\141\1\0\46\141\1\175\1\0\1\141\21\0"+
    "\1\236\36\0\32\237\11\0\2\237\7\0\10\237\1\240"+
    "\21\237\11\0\2\237\7\0\20\237\1\241\11\237\11\0"+
    "\2\237\7\0\10\237\1\242\21\237\11\0\2\237\7\0"+
    "\3\237\1\243\26\237\11\0\2\237\7\0\4\237\1\241"+
    "\25\237\11\0\2\237\7\0\21\237\1\243\10\237\11\0"+
    "\2\237\26\0\1\236\44\0\1\141\43\0\32\244\11\0"+
    "\2\244\7\0\17\244\1\245\12\244\11\0\2\244\7\0"+
    "\7\244\1\245\22\244\11\0\2\244\7\0\10\244\1\245"+
    "\21\244\11\0\2\244\7\0\32\246\11\0\2\246\7\0"+
    "\32\247\11\0\2\247\7\0\32\250\11\0\2\250\7\0"+
    "\32\251\11\0\2\251\7\0\32\252\11\0\2\252\7\0"+
    "\32\253\11\0\2\253\7\0\32\254\11\0\2\254\7\0"+
    "\32\255\11\0\2\255\7\0\32\256\11\0\2\256\7\0"+
    "\32\257\11\0\2\257\7\0\32\260\11\0\2\260\7\0"+
    "\32\261\11\0\2\261\7\0\32\262\11\0\2\262\7\0"+
    "\32\263\11\0\2\263\7\0\32\264\11\0\2\264\7\0"+
    "\32\265\11\0\2\265\7\0\32\266\11\0\2\266\7\0"+
    "\32\267\11\0\2\267\7\0\32\270\11\0\2\270\7\0"+
    "\32\271\11\0\2\271\7\0\32\272\11\0\2\272\7\0"+
    "\32\273\11\0\2\273\7\0\32\274\11\0\2\274\7\0"+
    "\32\275\11\0\2\275\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7656];
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
    "\1\0\2\11\23\1\1\11\41\1\1\0\1\1\4\0"+
    "\1\1\1\0\34\1\4\0\1\1\1\0\2\1\1\0"+
    "\23\1\1\11\3\0\1\1\1\0\20\1\3\0\1\1"+
    "\1\0\11\1\2\0\36\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[189];
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

  /* user code: */
   private Symbol symbol(int type) {
      return new Symbol(type, yyline, yycolumn);
   }
   
   private Symbol symbol(int type, Object value) {
      return new Symbol(type, yyline, yycolumn, value);
   }
   
   private Integer extractSymbol(String in) {
      Field field=null;
      Integer val=null;
      try {
      field = sym.class.getField(in);
      val=(Integer) field.get(null);
      } catch (Exception e) {      
      }
      /*if(val!=null)
         System.out.println(yytext()+" "+val);  */
      return val;
   }
   
   private Symbol symbolFromString(String in) {
      Integer type=extractSymbol(in);
      return symbol(type);
   }
   
   private Symbol symbolFromString(String in, Object value) {
      Integer type=extractSymbol(in);
      return symbol(type, value);
   }
   


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MiniC_scanner(java.io.Reader in) {
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
    while (i < 182) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print("SCANNER ERROR: "+yytext());
      throw new Error("Illegal character <"+yytext()+">");
            } 
            // fall through
          case 11: break;
          case 2: 
            { ;
            } 
            // fall through
          case 12: break;
          case 3: 
            { System.out.print("ID:"+yytext()+" ");
      return symbolFromString("ID",yytext());
            } 
            // fall through
          case 13: break;
          case 4: 
            { System.out.print("INT:"+yytext()+" ");
      return symbolFromString("INT",yytext());
            } 
            // fall through
          case 14: break;
          case 5: 
            { String output=null;
      // {}()[]+-* /=;<> >= <= == &!|, .
      switch(yytext()) {   // Java supports switching on strings
         case "{": 
            output="BO";
            break;
         case "}": 
            output="BC";
            break;
         case "(": 
            output="RO";
            break;
         case ")": 
            output="RC";
            break;
         case "[": 
            output="SO";
            break;
         case "]": 
            output="SC";
            break;
         case "+": 
            output="PLUS";
            break; 
         case "-": 
            output="MINUS";
            break;
         case "*": 
            output="STAR";
            break;
         case "/": 
            output="DIV";
            break;
         case "<": 
            output="MIN";
            break; 
         case ">": 
            output="MAJ";
            break; 
         case "=": 
            output="EQ";
            break;
         case "==": 
            output="EQ_EQ";
            break;
         case "!=":
            output="NOT_EQ";
            break;
         case "<=": 
            output="MIN_EQ";
            break; 
         case ">=": 
            output="MAJ_EQ";
            break;
         case "&": 
            output="BITWISE_AND";
            break;
         case "|": 
            output="BITWISE_OR";
            break;
         case "&&": 
            output="LOGICAL_AND";
            break;
         case "||": 
            output="LOGICAL_OR";
            break;
         case "~":
            output="BITWISE_NOT";
            break;
         case "!": 
            output="LOGICAL_NOT";
            break;
         case ";": 
            output="S";
            break;
         case ",": 
            output="C";
            break;
         case ".":
            output="DOT";
            break;
         default:
            System.out.print("SCANNER ERROR: "+yytext());
            throw new Error("Illegal operator <"+yytext()+">");
      }
      System.out.print(output+" ");  
      return symbolFromString(output);
            } 
            // fall through
          case 15: break;
          case 6: 
            { System.out.print("DOUBLE:"+yytext()+" "); 
      return symbolFromString("DOUBLE",yytext());
            } 
            // fall through
          case 16: break;
          case 7: 
            { // And this kids, is how you hack the cup library to avoid hardcoding everything.
      String output=yytext().toUpperCase();
      System.out.println(output+" ");
      return symbolFromString(output);
            } 
            // fall through
          case 17: break;
          case 8: 
            { //System.out.print(yytext()); 
      ;
            } 
            // fall through
          case 18: break;
          case 9: 
            { String output=yytext().toUpperCase()+"_TYPE";
      System.out.print(output+" ");  
      return symbolFromString(output);
            } 
            // fall through
          case 19: break;
          case 10: 
            { String output=yytext().toUpperCase();
      System.out.println(output+" ");
      return symbolFromString(output);
            } 
            // fall through
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}