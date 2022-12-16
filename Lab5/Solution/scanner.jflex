import java_cup.runtime.*;

%%

%class Lexer
%unicode
%cup
%line
%column


%{
  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
	
  }
%}

costante = ("-")?[0-9]+("."[0-9]+((e|E)("+"|"-")?[0-9]+)?)?
nl = \r|\n|\r\n
ws = [ \t]
scalare = [a-z]
vettore = [A-Z]
operatori = (","|")"|"("|"["|"]"|"+"|"."|"/"|"*"|"-"|"="|";"|"^"|"?")

%%
"+" {return symbol(sym.PLUS);}
"-" {return symbol(sym.MINUS);}
"/" {return symbol(sym.DIV);}
"*" {return symbol(sym.PROD);}
"(" {return symbol(sym.LBR);}
")" {return symbol(sym.RBR);}
"[" {return symbol(sym.LBS);}
"]" {return symbol(sym.RBS);}
"=" {return symbol(sym.EQUALS);}
";" {return symbol(sym.PV);}
"." {return symbol(sym.PT);}
"," {return symbol(sym.CM);}
"^" {return symbol(sym.EXP);}
"?" {return symbol(sym.QP);}
{costante} {
	return symbol(sym.CONST, new Double(yytext()));
	}
{vettore} {return symbol(sym.VECTOR_VAR, new Character(yycharat(0)));}
{scalare} {return symbol(sym.SCALAR_VAR, new Character(yycharat(0)));}

{ws}|{nl} {;}

