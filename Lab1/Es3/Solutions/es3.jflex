/* Lab 1 - Es 3 */

%%

/* To recognize comments we use the regex: `"/*" ~ "*\/" {;}` or we can leverage on the power of states (not present at the exam)! https://www.youtube.com/watch?v=ho07RTTFENk */
%state COMMENT
/* With the %integer directive, the function yylex called in the Main returns
   an integer (Yylex.YYEOF) when the end of file is reached.
   It is useful when jflex is used alone without the directive %standalone*/
%integer
%unicode
// Instead of using %standalone, the scanner is called from the Es3 Class, containing the main function

nl                   = \r|\n|\r\n

keyword              = (if|then|else|while|switch|case|do|break|for|return|void|int|float|double|char|long|unsigned|signed)
const                = [0-9]+ 
direttive            = "#"(include|define).*{nl} 

string               = \" ~ \"

id                   = [A-Za-z_][A-Za-z0-9_]* 
op                   = ("+"|"-"|"/"|"*"|"<"|">"|"=="|">="|"<="|"=") 

%%

<YYINITIAL> {
  {keyword} {
    Htmllib.colPrint(Htmllib.C_LBLUE); 
    Htmllib.textPrint(yytext());  
    Htmllib.endtagPrint();
  } 
  {const} {
    Htmllib.colPrint(Htmllib.C_LRED); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
  } 
  {direttive} {
    Htmllib.colPrint(Htmllib.C_LGREEN); 
    Htmllib.textPrint(yytext());
    Htmllib.endtagPrint();
  } 
  {op} {
    Htmllib.colPrint(Htmllib.C_BLUE); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
  } 
  {string} {
    Htmllib.colPrint(Htmllib.C_RED); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
  } 
  {id} {
    Htmllib.colPrint(Htmllib.C_GREEN); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
  } 
  "/*" {
    yybegin(COMMENT); 
    Htmllib.colPrint(Htmllib.C_CYAN); 
    Htmllib.textPrint(yytext()); 
  }  
  \n|\r|\r|n {
    Htmllib.printBR();
  }

/* The . (dot) is useful to print characters not recognised by previous declared regular expressions
   This character are not modified by the scanner.
   Es: void function(int c)
   The round brackets are not recognised by any of the declared regular expression, so the must rewritten
   with the default black color
*/
. {
    Htmllib.textPrint(yytext());
}
  
}  
 
<COMMENT> {
  [^*]+      { Htmllib.textPrint(yytext()); }
  "*"+[^*/]* { Htmllib.textPrint(yytext()); }
  "*"+"/"    {
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint(); 
    yybegin(YYINITIAL);
  } 
}
