%%

%class ExtremeSyntaxHighlighterC
%unicode
%integer
%state COMMENT

//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl = \n|\r|\r\n
ws = " "|"\t"
alpha = [a-zA-Z]
digit = [0-9]
integer = 0|([1-9]{digit}*)
signedInteger = [+-]? {integer}

type=int|double
double = (({integer}\.{digit}*)|(\.{digit}+))([eE][+-]?{digit}+)?
signedDouble = [+-]? {double}

validId = (_|{alpha})(_|{alpha}|{digit}){0,31}
keyword = auto|break|case|char|const|continue|default|do|else|enum|extern|float|for|goto|if|long|register|return|short|signed|sizeof|static|struct|switch|typedef|union|unsigned|void|volatile|while
function = print

operator = "{"|"}"|"("|")"|"["|"]"|"+"|"-"|"*"|"/"|"="|";"|"."|","|"<"|">"|"&"|"|"|"!"|">="|"<="
//multiCharOperators = "=="|">="|"<="

followingPreprocessorLine = (\\{nl})?(.)*
preprocessorDirective = (#include|#define|#undef|#if|#ifdef|#ifndef|#error)(.)*{followingPreprocessorLine}*

validString = \" ~ \"

lineComment = \/\/.*
startMultiLineComment = "/*"
multiLineCommentContent = ([^\*\\\r\n])+
endMultiLineComment = "*/"

%%

<YYINITIAL>{
   {keyword} { 
      System.out.print(yytext().toUpperCase()+" ");
   }
   {function} {
      System.out.print(yytext().toUpperCase()+" ");  
   }
   {validString} {
      System.out.print(yytext()+" "); 
   }
   {integer} {  
      System.out.print("INT:"+yytext()+" "); 
   }
   {type} {
      System.out.print(yytext().toUpperCase()+"_TYPE ");  
   }
   {double} {  
      System.out.print("DOUBLE:"+yytext()+" "); 
   }
   {validId} {  
      System.out.print("ID:"+yytext()+" "); 
   }
   {operator} {
      // {}()[]+-*/=;<> >= <= &!|, missing -> .==
      switch(yytext()) {   // Java supports switching on strings
         case "{": 
            System.out.print("BO ");
            break;
         case "}": 
            System.out.print("BC ");
            break;
         case "(": 
            System.out.print("RO ");
            break;
         case ")": 
            System.out.print("RC ");
            break;
         case "[": 
            System.out.print("SO ");
            break;
         case "]": 
            System.out.print("SC ");
            break;
         case "+": 
            System.out.print("PLUS ");
            break; 
         case "-": 
            System.out.print("MINUS ");
            break;
         case "*": 
            System.out.print("STAR ");
            break;
         case "/": 
            System.out.print("DIV ");
            break;
         case "<": 
            System.out.print("MIN ");
            break; 
         case ">": 
            System.out.print("MAJ ");
            break; 
         case "=": 
            System.out.print("EQ ");
            break; 
         case "<=": 
            System.out.print("MIN_EQ ");
            break; 
         case ">=": 
            System.out.print("MAJ_EQ ");
            break;
         case "&": 
            System.out.print("AND ");
            break;
         case "|": 
            System.out.print("OR ");
            break;
         case "!": 
            System.out.print("NOT ");
            break;
         case ";": 
            System.out.print("S ");
            break;
         case ",": 
            System.out.print("C ");
            break;   
         default:
            System.out.print(yytext()+" ");
      }
   }
   {startMultiLineComment} {
      yybegin(COMMENT);
      //System.out.print(yytext());       
   }
   {lineComment} {
      //System.out.print(yytext()); 
      ;
   }
   /*
   {preprocessorDirective} {
      System.out.print(yytext());
   }
   */

}
   
<COMMENT> {
   {multiLineCommentContent} {
      //System.out.print(yytext()); 
      ;
   }
   {endMultiLineComment}   {
      //System.out.print(yytext());      
      yybegin(YYINITIAL);
   }
}

   {preprocessorDirective}|{nl}|{ws} {
      ;
   }
   /* 
      {nl}  {
      Htmllib.printBR();
   } */
   .  {
      System.out.print("SCANNER ERROR: "+yytext());
   }