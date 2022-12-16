import java_cup.runtime.*;
import java.lang.reflect.Field;

%%

%class Calculator 
%cup
%unicode
%line
%column

nl = \n|\r|\r\n
ws = " "|"\t"

/* between real scalars: sum (+), subtraction (−), multiplication (∗), division (−), exponentiation in the
form aˆb*/ 
/* between vectors: sum (+), subtraction (−), scalar product (.)*/
/* product and division of one scalar by a vector; i.e. 2 ∗[3, 2], 10/[5 + 3, a/10] */
/* assignment of an expression to a variable; i.e. a = 5, b = 5 ∗(4/2), c = −a ∗2 + (b ∗2), D = [3, a] +
[5.5, 2.2 + 3].[c, 1.2] */
/* Each line introduced is terminated by a semi colon */
/* The session ends with the symbol ? */
operator = "["|","|"]"|"+"|"-"|"*"|"/"|"^"|"."|";"|"?"|"="

/* real scalars (eventually with exponent); i.e. 34, -678, 4.677E5, -0.004e-10*/
digit = [0-9]
integer = 0|([1-9]{digit}*)
double = (({integer}\.{digit}*)|(\.{digit}+))([eE][+-]?{digit}+)?
const = {integer}|{double}

/*vectors with two elements in the form [a,b], where where a and b are real scalars or scalar variables or expressions*/

/*26 scalar variables corresponding to the 26 lowercase letters of the alphabet; each one can contains the
value of a real scalars*/
scalarVariable = [a-z]
/* vector variables corresponding to the 26 uppercase letters of the alphabet; each one can contain the value
of a vector*/
vectorVariable = [A-Z]


%{
	/* To disable debugging, i.e., printing of recogized token by means of the scanner set the constant _DEBUG to false */
	private static final boolean _DEBUG = false;
	
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
    
    {const} {
        return symbolFromString("CONST",new Double(yytext()));
    }
    
    {scalarVariable} {
        return symbolFromString("SCALAR_VARIABLE", new String(yytext()));
    }
    
    {vectorVariable} {
        return symbolFromString("VECTOR_VARIABLE", new String(yytext()));
    }
    {operator} {
      /* [ , ] + - * / ^ . ; ? */
      String output=null;
      switch(yytext()) {   // Java supports switching on strings
         case "[": 
            output="SO";
            break;
        case ",": 
            output="C";
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
         case "^": 
            output="CARET";
            break; 
         case ".":
            output="DOT";
            break;
         case ";": 
            output="S";
            break;
         case "?":
            output="QUESTION";
            break;
         case "=":
            output="EQ";
            break;
         default:
            System.out.print("SCANNER ERROR: "+yytext());
            throw new Error("Illegal operator <"+yytext()+">");
      }
      return symbolFromString(output);
   }
   
    {nl}|{ws} {;}
   
    .  {
      System.out.print("SCANNER ERROR: "+yytext());
      throw new Error("Illegal character <"+yytext()+">");
    }
