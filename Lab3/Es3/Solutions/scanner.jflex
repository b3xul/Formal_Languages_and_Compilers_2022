/* Import of the CUP library */
import java_cup.runtime.*;

%%

%class scanner
/* Compatibility with CUP */
%cup

/* Exclusive state for comments */
%xstate comment


/* Macros */
sign_modifier_token    = signed|unsigned
type_token             = int|long|short|float|double|char
leng_modifier_token    = long|short
storage_spec_token     = extern|register|auto|static
void_token             = void
ws                     = [ \t]+
const                  = [0-9]+
floating    	     = (([0-9]+'.'[0-9]*)|([0-9]*'.'[0-9]+))(e|E('+'|'-')?[0-9]+)?
directive              = "#"(include|define).*\n
string                = \"([^\n\r\"]+|\\\")*\"
id         			= [A-Za-z_][A-Za-z0-9_]*
relop                  = ("=="|">="|"<="|"<"|">"|"!=")
logop                  = ("||"|"&&")
assop                  = ("+="|"-="|"*="|"/=")

%%

{ws}                 {;}
\n                   {;}

/* Directives are discharged by scanner, because usually they are managed by a pre-compiler */

{directive}          {;}

/* Comments */
"/*"                 {yybegin(comment);}
<comment>[^*]*       {;}
<comment>"*"+[^*/]*  {;}
<comment>"*"+"/"     {yybegin(YYINITIAL);}
/* An alternative way to write comments is "/*" ~ "*/" */


if                    {return new Symbol(sym.IF); }
else                  {return new Symbol(sym.ELSE); }
while                 {return new Symbol(sym.WHILE); }
switch                {return new Symbol(sym.SWITCH); }
case                  {return new Symbol(sym.CASE); }
break                 {return new Symbol(sym.BREAK); }
for                   {return new Symbol(sym.FOR); }
return                {return new Symbol(sym.RETURN); }
default               {return new Symbol(sym.DEFAULT); }
"++"                  {return new Symbol(sym.INCR); }
"--"                  {return new Symbol(sym.DECR); }
{assop}               {return new Symbol(sym.ASSOP); }
{relop}               {return new Symbol(sym.RELOP); }
{logop}               {return new Symbol(sym.LOGOP); }

"+"                    {return new Symbol(sym.PLUS); }
"-"                    {return new Symbol(sym.MINUS); }
"*"                    {return new Symbol(sym.TIMES); }
"/"                    {return new Symbol(sym.DIVIDE); }
"%"                    {return new Symbol(sym.MOD); }
"="                    {return new Symbol(sym.EQUALS); }

"("                    {return new Symbol(sym.RBOPEN); }
")"                    {return new Symbol(sym.RBCLOSED); }
"["                    {return new Symbol(sym.SBOPEN); }
"]"                    {return new Symbol(sym.SBCLOSED); }
"{"                    {return new Symbol(sym.CBOPEN); }
"}"                    {return new Symbol(sym.CBCLOSED); }


";"                    {return new Symbol(sym.SEMICOLON); }
","                    {return new Symbol(sym.COMMA); }
":"                    {return new Symbol(sym.COLON); }


{sign_modifier_token} {return new Symbol(sym.SIGN_MODIFIER); }
{leng_modifier_token} {return new Symbol(sym.LENG_MODIFIER); }
{storage_spec_token}  {return new Symbol(sym.STORAGE_SPEC); }
{type_token}          {return new Symbol(sym.TYPE); }
{void_token}          {return new Symbol(sym.VOID); }
{string}              {return new Symbol(sym.STRINGCONST);}
{const}               {return new Symbol(sym.CONST);}
{floating}            {return new Symbol(sym.CONST);}

{id}      {return new Symbol(sym.ID);}
/* ID rules must be located at the end of the scanner, otherwise language keywords (like, e.g., print, if, etc.) are recognized as ID */
