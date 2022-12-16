import java_cup.runtime.*;
import java.lang.reflect.Field;

%%

/*
%standalone
%integer
*/
%class MiniC_scanner
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

// C keywords and operators
keyword = break|case|const|continue|default|do|else|enum|for|goto|if|return|sizeof|struct|switch|typedef|union|volatile|while

operator = "{"|"}"|"("|")"|"["|"]"|"+"|"-"|"*"|"/"|"="|";"|"."|","|"<"|">"|"&"|"&&"|"|"|"||"|"~"|"!"|">="|"<="|"=="|"|="

char = \'{alpha}\'

//Variables of type int and double and one-dimensional vectors of those type can be declared.
integer = 0|([1-9]{digit}*)
/* signedInteger = [+-]? {integer} */

double = (({integer}\.{digit}*)|(\.{digit}+))([eE][+-]?{digit}+)?
/* signedDouble = [+-]? {double} */

type=char|short|signed|int|unsigned|long|float|double|void
storageSpecification = extern|register|auto|static

// The variables cannot be initialized in the declaration phase (e.g. an instruction like int a=0; is not supported)

id = (_|{alpha})(_|{alpha}|{digit}){0,31}

//subscription = "["({integer}|{id})"]"

string = \" ~ \"

//main and functions do not exist (only print function)

// Preprocessor directives
followingPreprocessorLine = (\\{nl})?(.)*
preprocessorDirective = (#include|#define|#undef|#if|#ifdef|#ifndef|#error)(.)*{followingPreprocessorLine}*

// Comments
lineComment = \/\/.*
multiLineComment= "/*" ~ "*/"
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
   print {
      String output=yytext().toUpperCase();
      return symbolFromString(output);
   }
   {keyword} {
      // And this kids, is how you hack the cup library to avoid hardcoding everything.
      String output=yytext().toUpperCase();
      return symbolFromString(output);
   }
   {storageSpecification} {
      String output=yytext().toUpperCase();
      return symbolFromString(output,yytext());
   }
   {type} {
      String output=yytext().toUpperCase()+"_TYPE";
      return symbolFromString(output);
   }
   {char} {
      return symbolFromString("CHAR",yytext());
   }
   {integer} {
      return symbolFromString("INT",yytext());
   }
   {double} {
      return symbolFromString("DOUBLE",yytext());
   }
   {string} {
      return symbolFromString("STRING",yytext());
   }
   {id} {
      return symbolFromString("ID",yytext());
   }
   {operator} {
      String output=null;
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
      
      return symbolFromString(output);
      
   }
   {lineComment}|{multiLineComment} {
      //System.out.print(yytext()); 
      ;
   }
   {preprocessorDirective}|{nl}|{ws} {
   /* Directives are discharged by scanner, because usually they are managed by a pre-compiler */
   ;
   }
   .  {
      System.out.print("SCANNER ERROR: "+yytext());
      throw new Error("Illegal character <"+yytext()+">");
   }
