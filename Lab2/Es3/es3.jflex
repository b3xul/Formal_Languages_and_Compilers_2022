//Write regex to recognize odd integers between -23 to 125. Write all combinations!
%%

%standalone
%class es3
%unicode

//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl		=  \n|\r|\r\n
digit = [0-9]
oddDigit = [13579]
//-23, -21, -19, -17, -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 101, 119, 125
//-23, -21
//-19 -> -9
// 20 -> 99
// 100 -> 119
validNumber=("-"2[13])|("-"1?{oddDigit})|({oddDigit})|{digit}{oddDigit}|(1[01]{digit})|(12[135])

%%

^{validNumber}$ {
    System.out.println(yytext());
}

. {
    ;
}

{nl}|" "|\t 	{;}