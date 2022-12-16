//Write regex to recognize all dates ranged from 2021/11/05 to 2022/07/23
%%

%standalone
%class es4
%unicode

//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl		=  \n|\r|\r\n
separator = [/]
digit = [0-9]

N28days= ([01]{digit})|(2[0-8])
N30days= ([012]{digit})|(30)
N31days= {N30days}|(31)
N30daysMonths=(04)|(06)
N31daysMonths=(01)|(03)|(05)|(12)

// 05-30
startDaysMonth=(0[5-9])|([12]{digit})|30

// 01-23
endDaysMonth=([01]{digit})|(2[0-3])

validYear=2021|2022
//validMonth=(0[1-7])|11|12

validMonthDay=({N31daysMonths}{separator}{N31days})|(02{separator}{N28days})|({N30daysMonths}{separator}{N30days})|(11{separator}{startDaysMonth})|(07{separator}{endDaysMonth})
validDate={validYear}{separator}{validMonthDay}

%%

^{validDate} {
    System.out.println(yytext());
}

. {
    ;
}

{nl}|" "|\t 	{;}