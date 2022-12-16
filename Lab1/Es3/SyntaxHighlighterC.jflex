%%
%standalone
%class SyntaxHighlighterC
%unicode
//%integer Both cause the scanning method to be declared as returning Java type int. Actions in the specification can then return int values as tokens. The default end of file value under this setting is YYEOF, which is a public static final int member of the generated class.
/* With the %integer directive, the function yylex called in the Main returns
   an integer (Yylex.YYEOF) when the end of file is reached.
   It is useful when jflex is used alone without the directive %standalone*/
   
//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl		=  \n|\r|\r\n

// N.B. matching all Integers <32bit (-2147483647, +2147483647) with a regex would create a monster!
// Clion handles this just underlining the wrong number, but the color will be the same of a valid integer
alpha = [a-zA-Z]
digit = [0-9]
signedNumber = [+-]? 0|([1-9]{digit}*)

//The first letter of an identifier should be either a letter or an underscore
//There is no rule on how long an identifier can be. However, you may run into problems in some compilers if the identifier is longer than 31 characters.
validId = (_|{alpha})(_|{alpha}|{digit}){0,31}
keyword = auto|break|case|char|const|continue|default|do|double|else|enum|extern|float|for|goto|if|int|long|register|return|short|signed|sizeof|static|struct|switch|typedef|union|unsigned|void|volatile|while

/* other preprocessor directives: __FILE__|__LINE__|__DATE__|__TIME__|__TIMESTAMP__|pragma|# macro operator|## macro operator*/
// preprocessor directives (to continue to the next line you need \ before the newline)
followingPreprocessorLine = (\\{nl})?(.)*
preprocessorDirective = (#include|#define|#undef|#if|#ifdef|#ifndef|#error)(.)*{followingPreprocessorLine}*

validString = \"[^\"]*\"

multiLineComment = \/\*([^\*][^\\])*\*\/
lineComment = \/\/.*

%init{
String newLine = System.getProperty("line.separator");
System.out.println(String.join(newLine,
"<HTML>",
"<BODY bgcolor=\"#FFFFFF\">",
"<H2>main.c</H2>",
"<CODE>"));
%init}

%%
{multiLineComment} {System.out.print("<FONT COLOR=\"#C0C0C0\">"+ yytext() +"</FONT>");}
{lineComment} {System.out.print("<FONT COLOR=\"#ED00ED\">"+ yytext() +"</FONT>");}
{validString} {System.out.print("<FONT COLOR=\"#03E45B\">"+ yytext() +"</FONT>");}
// .replace("<","&lt").replace(">","&gt") bad solution, since they could be in any position! use function!
{preprocessorDirective} {System.out.print("<FONT COLOR=\"#00FF00\">"+ yytext().replace("<","&lt").replace(">","&gt") +"</FONT>");}
{keyword} {System.out.print("<FONT COLOR=\"#0000FF\">"+ yytext() +"</FONT>");}
{validId} {System.out.print(yytext());}
{signedNumber} {System.out.print("<FONT COLOR=\"#FF0000\">"+ yytext() +"</FONT>");}

// we substitute " " with &nbsp so that it is preserved, otherways it is collapsed automatically due to how html works
" " {System.out.print("&nbsp");}
{nl} 	{System.out.println("<BR>");}
.		{System.out.print(yytext());}


