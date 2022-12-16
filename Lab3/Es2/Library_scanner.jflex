import java_cup.runtime.*;
import java.lang.reflect.Field;

%%

%class Library_scanner
%cup
%unicode
%line
%column

// Basic types
//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl = \n|\r|\r\n
ws = " "|"\t"
alpha = [a-zA-Z]
digit = [0-9]
hexLetter = [a-fA-F]
hex = ({digit}|{hexLetter})
//positiveInt=[1-9]{digit}*
//int=0|{positiveInt}
int=[1-9]{digit}*
string = \" ~ \"
/* First section */
/* The first section is composed by a non-empty list of writers and the books written by them */

//Where <writer name> is a string of letters enclosed by the characters ” (Double quote)
//bookNotLocated = {ISBN}\:{title}\:{pages}
//<ISBN code> consists of two numeric characters, followed by a dash, followed by two numeric characters, followed by a dash, followed by 5 hexadecimal characters, followed by a dash and followed by a letter or a numeric character.
ISBN = ({digit}{2}\-){2}{hex}{5}\-({alpha}|{digit})
// This time we don't allow the Int to be=0 to simplify management
//pages = {positiveInt}

// <collocation> (is optional) and is composed by the word LI or LS (letteratura italiana or letteratura straniera ) followed by the genre AV, BO o SO (Avventuroso, biografico or sociale), followed by an integer number and eventually followed by a letter. The genre LI BO does not exist: handle this case.
//collocation = {origin}{genre}{int}{alpha}?
origin = LI|LS
genre = AV|BO|SO

/* Second section */
// The second section is composed of a non-empty list of users
//loan = {string}\:{validDate}{ISBN}

// For each loan the loan date and the book ISBN code are reported. The date is in the format “DD/MM/YYYY”, where DD is a number between 01 and 31, MM is a number between 01 and 12.
N28days= ([01]{digit})|(2[0-8])
N30days= ([012]{digit})|(30)
N31days= {N30days}|(31)
N30daysMonths=(04)|(06)|(09)|(11)
N31daysMonths=(01)|(03)|(05)|(07)|(08)|(10)|(12)

//2000-2999
validYear=2{digit}{3}

validDayMonth=({N31days}\/{N31daysMonths})|({N28days}\/02)|({N30days}\/{N30daysMonths})

validDate={validDayMonth}\/{validYear}


%{
	/* To disable debugging, i.e., printing of recogized token by means of the scanner set the constant _DEBUG to false */
	private static final boolean _DEBUG = true;
	
   private Symbol symbol(int type) {
      return new Symbol(type, yyline, yycolumn);
   }
   
   private Symbol symbol(int type, Object value) {
      return new Symbol(type, yyline, yycolumn, value);
   }
   
   private Integer extractSymbol(String in) {
      if(_DEBUG)
         System.out.print(in);
      Field field=null;
      Integer val=null;
      try {
      field = sym.class.getField(in);
      val=(Integer) field.get(null);
      } catch (Exception e) {      
      }
      /*if(val!=null)
         System.out.print(yytext()+" "+val);  */
      return val;
   }
   
   private Symbol symbolFromString(String in) {
      Integer type=extractSymbol(in);
      if(_DEBUG)
         System.out.println();
      return symbol(type);
   }
   
   private Symbol symbolFromString(String in, Object value) {
      Integer type=extractSymbol(in);
      if(_DEBUG)
         System.out.println(":"+value);
      return symbol(type, value);
   }
   
%}

%%
   {string} {return symbolFromString("STRING",yytext());}
   "->" {return symbol(sym.ARROW);}
   {ISBN} {return symbolFromString("ISBN",yytext());}
   {origin} {return symbolFromString(yytext());}
   {genre} {return symbolFromString(yytext());}
   {int} {return symbolFromString("INT",yytext());}
   {alpha} {return symbolFromString("ALPHA",yytext());}
   "," {return symbol(sym.C);}
   ";" {return symbol(sym.S);}
   "%%" {return symbol(sym.SECTION_SEPARATOR);}
   ":" {return symbol(sym.COL);}
   {validDate} {return symbolFromString("DATE",yytext());}
   {nl}|{ws} {;}
   .  {
      System.out.print("SCANNER ERROR: "+yytext());
      throw new Error("Illegal character <"+yytext()+">");
   }
