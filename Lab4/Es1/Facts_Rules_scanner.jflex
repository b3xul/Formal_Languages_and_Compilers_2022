import java_cup.runtime.*;
import java.lang.reflect.Field;

%%

%class Facts_Rules_scanner
%cup
%unicode
%line
%column

// Basic types
//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl = \n|\r|\r\n
ws = " "|"\t"
alpha = [a-zA-Z]
uppercase = [A-Z]
lowercase = [a-z]
digit = [0-9]

operator = "("|")"|"."|","|":-"|"?-"

// A variable is a string of letters, numbers and ‘_’ whose first character is an uppercase letter or the character ‘_’.
variable = (_|{uppercase})(_|{alpha}|{digit})*

//Variables of type int and double and one-dimensional vectors of those type can be declared.
integer = 0|([1-9]{digit}*)
signedInteger = [+-]? {integer}

double = (({integer}\.{digit}*)|(\.{digit}+))([eE][+-]?{digit}+)?
signedDouble = [+-]? {double}

// An atom is a string of letters, numbers and “_” whose first character is a lowercase letter
// alternatively, an atom can be a real or integer number, with or without exponent, with or without sign.
atom = ({lowercase}(_|{alpha}|{digit})*) | {signedInteger} | {signedDouble}

// Comment
comment = "/*" ~ "*/"

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
/* "(" 		{return symbol(sym.RO);}
")" 		{return symbol(sym.RC);}
"." 		{return symbol(sym.DOT);}
"," 		{return symbol(sym.COMMA);}
":-" 		{return symbol(sym.RULE_SYMBOL);}
"?-" 		{return symbol(sym.INTERROGATION_SYMBOL);}
{atom} 	        {return symbol(sym.ATOM);}
{variable}	{return symbol(sym.VARIABLE);} */
   {operator} {
      String output=null;
      // operator = "("|")"|"."|","|":-"|"?-"
      switch(yytext()) {   // Java supports switching on strings
         case "(": 
            output="RO";
            break;
         case ")": 
            output="RC";
            break;
         case ":-":
            output="RULE_SYMBOL";
            break;
         case "?-":
            output="INTERROGATION_SYMBOL";
            break;
         case ",": 
            output="COMMA";
            break;
         case ".":
            output="DOT";
            break;
         default:
            System.err.print("SCANNER ERROR: "+yytext());
            throw new Error("Illegal operator <"+yytext()+">");
      }
      return symbolFromString(output);
   }
   {variable} {  
      return symbolFromString("VARIABLE",yytext());
   }
   {atom} {
      return symbolFromString("ATOM",yytext());
   }
   {comment} {
      System.out.println("COMMENT: "+yytext()); 
      ;
   }
   {nl}|{ws} {
      ;
   }
   .  {
      System.err.print("SCANNER ERROR: "+yytext());
      throw new Error("Illegal character <"+yytext()+">");
   }
