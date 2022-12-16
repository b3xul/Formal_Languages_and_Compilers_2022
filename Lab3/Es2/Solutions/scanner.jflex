import java_cup.runtime.*;


%%

%{
	/* To disable debugging, i.e., printing of recogized token by means of the scanner set the constant _DEBUG to false */
	private static final boolean _DEBUG = true;
	
%}

%class scanner
%unicode
%cup



nl			=  	\n|\r|\r\n
NAME			=	\"[A-Za-z0-9 .,:]+\"
ISBN			=	[0-9]{2}-[0-9]{2}-[0-9A-Fa-f]{5}-[A-Za-z0-9]
INT			=	[1-9][0-9]*
LETTER			=	[A-Za-z]
DATE			=	{DAY}\/{MONTH}\/{YEAR}
DAY			=	0[1-9]|[1-2][0-9]|3[0-1]
MONTH 			=	0[1-9]|1[0-2]
YEAR			=	[0-9]{4}

%%


{NAME}			{ 
				if (_DEBUG) System.out.print("NAME ");
				return new Symbol(sym.NAME);
			}
->			{
				if (_DEBUG) System.out.print("ARROW ");
				return new Symbol(sym.ARROW);
			}
{ISBN}			{
				if (_DEBUG) System.out.print("ISBN ");
				return new Symbol(sym.ISBN);
			}
:			{
				if (_DEBUG) System.out.print("CL ");
				return new Symbol(sym.CL);
			}
{INT}			{
				if (_DEBUG) System.out.print("INT ");
				return new Symbol(sym.INT);
			}
LI			{
				if (_DEBUG) System.out.print("LI ");
				return new Symbol(sym.LI);
			}
LS			{
				if (_DEBUG) System.out.print("LS ");
				return new Symbol(sym.LS);
			}
AV			{
				if (_DEBUG) System.out.print("AV ");
				return new Symbol(sym.AV);
			}
BO			{
				if (_DEBUG) System.out.print("BO ");
				return new Symbol(sym.BO);
			}
SO			{
				if (_DEBUG) System.out.print("SO ");
				return new Symbol(sym.SO);
			}
{LETTER}		{
				if (_DEBUG) System.out.print("LETTER ");
				return new Symbol(sym.LETTER);
			}	
\%\%			{
				if (_DEBUG) System.out.print("SEP ");
				return new Symbol(sym.SEP);
			}
,			{
				if (_DEBUG) System.out.print("CM ");
				return new Symbol(sym.CM);
			}
;			{
				if (_DEBUG) System.out.print("S ");
				return new Symbol(sym.S);
			}
{DATE}			{
				if (_DEBUG) System.out.print("DATE ");
				return new Symbol(sym.DATE);
			}	
{nl}|" " 	{;}

.		{System.out.print("SCANNER ERROR:" + yytext());}
