
%%

%standalone
%class DOS_filename
%unicode

nl		=  \n|\r|\r\n
letter	= [^\/\\:\*\?\"\-\>\|\n\r\t0-9]
digit   = [0-9]
//id      = ({letter} | {digit})({letter} | {digit})*
id      = ({letter}|{digit})+
drive   = {letter}
pathName= {id}
fileName= {id}
fileType= {id}
pathFileName = ({drive}:)?(\\)?({pathName}\\)*{fileName}(\.{fileType})?
// Why I can't place ^ and $ here??

%%

//{pathName} {System.out.println("pathName:\t'"+ yytext() +"'");}
//{fileName} {System.out.println("fileName:\t'"+ yytext() +"'");}
//{fileType} {System.out.println("fileType:\t'"+ yytext() +"'");}
//{drive} {System.out.println("Drive:\t'"+ yytext() +"'");}
//{id} {System.out.println("ID:\t'"+ yytext() +"'");}
//{letter} {System.out.println("LETTER:\t'"+ yytext() +"'");}
//{digit} {System.out.println("DIGIT:\t'"+ yytext() +"'");}
//.		{System.out.println("Unmatched character:\t'" + yytext()+"'");}
^{pathFileName}$ {System.out.println("Correct Path:\t'"+ yytext() +"'");}
^.+$ {System.out.println("Wrong Path:\t'"+ yytext() +"'");}

{nl}|" "|\t 	{;}
