%%

%class BetterSyntaxHighlighterC
%unicode
%integer //Both cause the scanning method to be declared as returning Java type int. Actions in the specification can then return int values as tokens. The default end of file value under this setting is YYEOF, which is a public static final int member of the generated class.
/* With the %integer directive, the function yylex called in the Main returns
   an integer (Yylex.YYEOF) when the end of file is reached.
   It is useful when jflex is used alone without the directive %standalone*/
%state COMMENT
// inclusive state

//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl		=  \n|\r|\r\n

// N.B. matching all Integers <32bit (-2147483647, +2147483647) with a regex would create a monster!
// Clion handles this just underlining the wrong number, but the color will be the same of a valid integer
alpha = [a-zA-Z]
digit = [0-9]
signedNumber = [+-]? 0|([1-9]{digit}*)

//The first letter of an identifier should be either a letter or an underscore
//There is no rule on how long an identifier can be. However, you may run into problems in some compilers if the identifier is longer than 31 characters. https://rules.sonarsource.com/c/RSPEC-799
validId = (_|{alpha})(_|{alpha}|{digit}){0,31}
keyword = auto|break|case|char|const|continue|default|do|double|else|enum|extern|float|for|goto|if|int|long|register|return|short|signed|sizeof|static|struct|switch|typedef|union|unsigned|void|volatile|while
operator = ("+"|"-"|"/"|"*"|"<"|">"|"=="|">="|"<="|"=") 

/* other preprocessor directives: __FILE__|__LINE__|__DATE__|__TIME__|__TIMESTAMP__|pragma|# macro operator|## macro operator*/
// preprocessor directives (to continue to the next line you need \ before the newline)
followingPreprocessorLine = (\\{nl})?(.)*
preprocessorDirective = (#include|#define|#undef|#if|#ifdef|#ifndef|#error)(.)*{followingPreprocessorLine}*

//validString = \"[^\"]*\"
validString = \" ~ \"

// This is wrong since it only matches even number of characters comments
// multiLineComment = \/\*([^\*][^\\])*\*\/

// This works, but without state it can't preserve whitespaces
//multiLineComment = \/\*([^\*\\])*\*\/
multiLineComment = "/*" ~ "*/"

lineComment = \/\/.*

startMultiLineComment = "/*"
//Lookahead expression must have match with length of at least 1.
//   {multiLineCommentContent}$ {
multiLineCommentContent = ([^\*\\\r\n])+
endMultiLineComment = "*/"
/* %init{
String newLine = System.getProperty("line.separator");
System.out.println(String.join(newLine,
"<HTML>",
"<BODY bgcolor=\"#FFFFFF\">",
"<H2>main.c</H2>",
"<CODE>"));
%init} */

%%

<YYINITIAL>{
   //Default state
   {startMultiLineComment} {
      yybegin(COMMENT);
      Htmllib.colPrint(Htmllib.C_LGREY); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
   }
   {lineComment} {
      Htmllib.colPrint(Htmllib.C_PINK); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
   }
   
   {validString} {
      Htmllib.colPrint(Htmllib.C_LGREEN); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
   }
   {operator} {
      Htmllib.colPrint(Htmllib.C_RED); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
   } 
   // .replace("<","&lt").replace(">","&gt") bad solution, since they could be in any position! use function! Actually in other positions they are represented correctly
   {preprocessorDirective} {
      Htmllib.colPrint(Htmllib.C_CYAN); 
      Htmllib.textPrint(yytext());
      Htmllib.endtagPrint();
   }
   {keyword} {
      Htmllib.colPrint(Htmllib.C_LBLUE); 
      Htmllib.textPrint(yytext());  
      Htmllib.endtagPrint();
   }
   {signedNumber} {
      Htmllib.colPrint(Htmllib.C_LRED); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
   }
   {validId} {
      Htmllib.colPrint(Htmllib.C_GREEN); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint();
   }
   // we substitute " " with &nbsp so that it is preserved, otherways it is collapsed automatically due to how html works
/*    " " {System.out.print("&nbsp");} */

}
   
<COMMENT> {
   {multiLineCommentContent} {
      Htmllib.colPrint(Htmllib.C_LGREY); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint(); 
   }
/*    {nl}  {
      Htmllib.printBR();
   }
   .  {
      Htmllib.textPrint(yytext());
   } */
/*   [^*]+      { Htmllib.textPrint(yytext()); }
  "*"+[^*\/]* { Htmllib.textPrint(yytext()); } */
   {endMultiLineComment}   {
      Htmllib.colPrint(Htmllib.C_LGREY); 
      Htmllib.textPrint(yytext()); 
      Htmllib.endtagPrint(); 
      yybegin(YYINITIAL);
   }
}

// Rules also accessible from <COMMENT> inclusive state!
   {nl}  {
      Htmllib.printBR();
   }
   .  {
      Htmllib.textPrint(yytext());
   }