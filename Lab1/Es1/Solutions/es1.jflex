/* Lab 1 - Ex 1 */

%%


%standalone

%class Lexer
%unicode

nl     = \n|\r|\r\n

letter = [^\n\r\\/:*?\"<> |0-9]
digit  = [0-9]
id     = ({letter}|{digit})+ 

%%


^({letter}:)?(\\)?({id}\\)*{id}("."{id})?$ {
  System.out.println("Path Correct: " + yytext());  
}

^.+$ {
  System.out.println("Path with Error: " + yytext());
}


{nl}  		{;}
