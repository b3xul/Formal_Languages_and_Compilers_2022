/* Lab 2 - Ex 2
The generated file was memorized in the file output.html instead of stdout */

import java.io.*;

%%

%class Lexer
%standalone
%unicode 
%caseless  // Case sensitive scanner

%xstate comment

// Variables and methods added to the Lexer class
%{
	FileWriter out;
	int numTags, numTables, numH1s, numH2s, numH3s, numH4s, numComm;
	
	private void writeOut(String s){
		try{
			out.write(s); 
			out.flush();
		}catch(Exception e){}
	}
	
	private void writeOut(){
		writeOut(yytext());
	}
%}

// Java code added by jflex in the constructor of the TransformHTML_Lexer class
%init{
	try{
		out = new FileWriter(new File("output.html"));
		numTags=numTables=numH1s=numH2s=numH3s=numH4s=numComm=0;
	}catch(IOException e){
		System.err.println(e);
	}
%init}

// Java code added by jflex in the destructor of the TransformHTML_Lexer class
%eof{
	// Total number of tags: comments are not considered as tags
	numTags = numTags + numTables + numH1s + numH2s + numH3s + numH4s;
	
	System.out.println("Total number of tags: "+numTags);
	System.out.println("Total number of table tags: "+numTables);
	System.out.println("Total number of h1 tags: "+numH1s);
	System.out.println("Total number of h2 tags: "+numH2s);
	System.out.println("Total number of h3 tags: "+numH3s);
	System.out.println("Total number of h4 tags: "+numH4s);
	System.out.println("Total number of comments: "+numComm);
        try{
            out.close();
        }catch(IOException e){
            System.err.println(e);
	}
%eof}


//Regular expressions declarations
comm = "<!--"
eofcomm = "-->"

table = ("<table")(" "+{att})*(">")
head  = ("<head")(" "+{att})*(">")
body  = ("<body")(" "+{att})*(">")
html  = ("<html")(" "+{att})*(">")
title = ("<title")(" "+{att})*(">")
h1 = ("<h1")(" "+{att})*(">")
h2 = ("<h2")(" "+{att})*(">")
h3 = ("<h3")(" "+{att})*(">")
h4 = ("<h4")(" "+{att})*(">")

tablec = ("</table>")
headc  = ("</head>")
bodyc  = ("</body>")
htmlc  = ("</html>")
titlec = ("</title>")
h1c = ("</h1>")
h2c = ("</h2>")
h3c = ("</h3>")
h4c = ("</h4>")


tag = <{id}((" "|\t)+{att})*(\>)
tagc = \<\/{id}\>
id = [a-zA-Z_][a-zA-Z0-9_]*
att = {id}\=[^ \t\n\r<>]*
text = [^ \t\n\r<>]*
space = [ \t]+
nl = \n|\r|\r\n

%%

{comm}  {numComm++; yybegin(comment);}
<comment> ((\-)+[^>]+)|([^-]+>?)|(->) {System.err.println("COMMENT: "+yytext());}
<comment>{eofcomm} {yybegin(YYINITIAL);}

{table} { numTables++; writeOut(); }
{head}  { numTags++; writeOut(); }
{body}  { numTags++; writeOut(); }
{html}  { numTags++; writeOut(); }
{title} { numTags++; writeOut(); }
{h1}    { numH1s++; writeOut(); }
{h2}    { numH2s++; writeOut(); }
{h3}    { numH3s++; writeOut(); }
{h4}    { numH4s++; writeOut(); }
{tag}   { numTags++; writeOut(); }


{tablec} { numTables++; writeOut(); }
{headc}  { numTags++; writeOut(); }
{bodyc}  { numTags++; writeOut(); }
{htmlc}  { numTags++; writeOut(); }
{titlec} { numTags++; writeOut(); }
{h1c}    { numH1s++; writeOut(); }
{h2c}    { numH2s++; writeOut(); }
{h3c}    { numH3s++; writeOut(); }
{h4c}    { numH4s++; writeOut(); }
{tagc}   { numTags++; writeOut(); } 

{text} | {space} | {nl} {writeOut();}

.       {System.out.println("ERRORE (Character not recognized): "+yytext());}
