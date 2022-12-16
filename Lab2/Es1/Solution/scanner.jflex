/* Lab 2 - Ex 1
Scanner of the C programming language */

import java_cup.runtime.*;

%%

%class Lexer
%unicode
%standalone


nl = \r|\n|\r\n
ws = [\ \t]
id = [A-Za-z_][A-Za-z0-9_]*
integer =  ([1-9][0-9]*|0)
double = (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?

%%

"("     {System.out.print("RO ");}
")"     {System.out.print("RC ");}
"{"     {System.out.print("BO ");}
"}"     {System.out.print("BC ");}
"="     {System.out.print("EQ ");}
"+"     {System.out.print("PLUS ");}
"-"     {System.out.print("MINUS ");}
"*"     {System.out.print("STAR ");}
"/"     {System.out.print("DIV ");}
"<"     {System.out.print("MIN ");}
">"     {System.out.print("MAJ ");}
"<="    {System.out.print("MIN_EQ ");}
"=<"    {System.out.print("EQ_MIN ");}
">="    {System.out.print("MAJ_EQ ");}
"=>"    {System.out.print("EQ_MAJ ");}
"&"     {System.out.print("AND ");}
"|"     {System.out.print("OR ");}
"!"     {System.out.print("NOT ");}

"["     {System.out.print("SO ");}
"]"     {System.out.print("SC ");}

"int"    {System.out.print("INT_TYPE ");}
"double" {System.out.print("DOUBLE_TYPE ");}

print   {System.out.print("PRINT ");}
if      {System.out.print("IF ");}
while   {System.out.print("WHILE ");}
else    {System.out.print("ELSE ");}
;       {System.out.print("S ");}
,       {System.out.print("C ");}

{id}      {System.out.print("ID:"+yytext()+" ");}
{integer} {System.out.print("INT:"+yytext()+" ");}
{double}  {System.out.print("DOUBLE:"+yytext()+" ");}

// This regular expression represents a token that begin
// with the symbol "/*", contains any character 
// with the exception of "*/" and it is ended with the symbol "*/".
// It is a compact form to express a comment */

"/*" ~ "*/"     {;}

{ws}|{nl}       {;}

. {System.err.println("SCANNER ERROR: "+yytext());}
