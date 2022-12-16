/* Lab 1 - Ex 2 */

%%

%standalone
%class Lexer
%unicode

nl            = \n|\r|\r\n
ipaddresscomp = [0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]
port          = [1-9][0-9]{0,3}
ipaddress     = ({ipaddresscomp}.){3}{ipaddresscomp}
escape        = %[0-9A-F][0-9A-F]
name          = ([^\n\r%/<>:.\\#]|{escape})+ 
firstlevel    = it|com|gov|edu|net|uk|fr|de|ne|jp|ch
domain        = {name}.{name}(.{name})*.{firstlevel}
schema        = http|ftp|gopher|https|nntp|file


%%

{schema}"://"({domain}|{ipaddress})(":"{port})?("/"{name})*("/"|("/"{name}"."{name} ("#"{name})?))? {
  System.out.println("Correct URL: " + yytext()); 
}


.* {
  System.out.println("Uncorrect URL: " + yytext()); 
}

{nl} 			{;}

