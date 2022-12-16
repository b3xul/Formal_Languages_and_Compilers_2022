import java_cup.runtime.*;

%%

%class scanner
%unicode
%cup
%line
%column


%{
   private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
%}

nl 		= 	\r | \n | \r\n
number 	        = 	("+"|"-")?[0-9]+("."[0-9]+(e("+"|"-")[0-9]+)?)?
ws 		= 	[ \t]
atom 	        = 	[a-z][A-Za-z0-9_]*
variable 	= 	[A-Z_][A-Za-z0-9_]*


%%



"(" 		{return symbol(sym.RO);}
")" 		{return symbol(sym.RC);}
"." 		{return symbol(sym.PT);}
"," 		{return symbol(sym.CM);}
":-" 		{return symbol(sym.SEP1);}
"?-" 		{return symbol(sym.SEP2);}
{number} 	{return symbol(sym.ATOM);}
{atom} 	        {return symbol(sym.ATOM);}
{variable}	{return symbol(sym.VARIABLE);}

"/*" ~ "*/"     {;}
{nl}|{ws}	{;}

