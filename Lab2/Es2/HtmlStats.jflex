import java.util.*;
import java.io.*;

%%

%standalone
%class HtmlStats
%unicode
%caseless

%xstate COMMENT
%state TAG

//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]

//The keywords consist of alphanumeric characters and begin with an alphabetic character
alpha = [a-zA-Z]
digit = [0-9]
validId = (_|{alpha})(_|{alpha}|{digit})*

keyword=({alpha})({alpha}|{digit})*

emptyKeyword=area|base|br|col|embed|hr|img|input|keygen|link|math|meta|param|source|svg|track|wbr

selfClosingTag="<"{emptyKeyword}{space}*"/>"

attribute={validId}"="{text}
openingTag="<"{keyword}({space}+{attribute})*">" 

closingTag="</"{keyword}">"

text = [^ \t\n\r<>]+
space = [ \t]
nl = \n|\r|\r\n

//An HTML document can contain some comments. Comments start with characters “<!−−” and end with characters “−−>”. 
startMultiLineComment = "<!--"
//multiLineCommentContent = ([^\*\\\r\n])+
endMultiLineComment = "-->"


// Variables and methods added to the Lexer class
%{
    Map<String,Integer> tags=new HashMap<String,Integer>();
    Integer comments=0;
    
    FileWriter out;
	
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

// Java code added by jflex in the constructor of the TransformHTML_Lexer class %init{ %init}
%init{
	try{
		out = new FileWriter(new File("output.html"));
	}catch(IOException e){
		System.err.println(e);
	}
%init}

// Java code added by jflex in the destructor of the TransformHTML_Lexer class
%eof{
    String[] keywords={"head", "body", "html", "title", "table", "h1", "h2", "h3", "h4", "br"};
    System.out.println("\nTotal number of tags: "+tags.values().stream().mapToInt(i -> i.intValue()).sum());
    for(String k:keywords)
        System.out.println("Total number of "+k+" tags: "+tags.getOrDefault(k,0));
        
    System.out.println("Total number of comments: "+comments);

    try{
        out.close();
    }catch(IOException e){
        System.err.println(e);
	}
%eof}

%%
{startMultiLineComment} {
    System.err.print("COMMENT: "+yytext());
    yybegin(COMMENT);
}
{selfClosingTag} {
    String caseInsensitiveKeyword=yytext();
    System.out.println("-"+caseInsensitiveKeyword+"-");
    String[] tmp=yytext().split("\\s+");
    if(tmp.length>0)
        caseInsensitiveKeyword =tmp[0];
    caseInsensitiveKeyword=caseInsensitiveKeyword.replaceAll("<|/>","").toLowerCase();
    System.out.println("-"+caseInsensitiveKeyword+"-");
    tags.put(caseInsensitiveKeyword,tags.getOrDefault(caseInsensitiveKeyword,0)+1);
    writeOut();
}
{openingTag} {
    String caseInsensitiveKeyword=yytext();
    String[] tmp=yytext().split("\\s+");
    if(tmp.length>0)
        caseInsensitiveKeyword =tmp[0];
    caseInsensitiveKeyword=caseInsensitiveKeyword.replaceAll("<|>","").toLowerCase();
    System.out.println("-"+caseInsensitiveKeyword+"-");
    tags.put(caseInsensitiveKeyword,tags.getOrDefault(caseInsensitiveKeyword,0)+1);
    writeOut();
}

{closingTag} {
    String caseInsensitiveKeyword=yytext();
    String[] tmp=yytext().split("\\s+");
    if(tmp.length>0)
        caseInsensitiveKeyword =tmp[0];
    caseInsensitiveKeyword=caseInsensitiveKeyword.replaceAll("</|>","").toLowerCase();
    System.out.println("-"+caseInsensitiveKeyword+"-");
    tags.put(caseInsensitiveKeyword,tags.getOrDefault(caseInsensitiveKeyword,0)+1);
    writeOut();
}

/* {startSelfClosingTag} {
    String caseInsensitiveKeyword=yytext().replaceAll("<","").toLowerCase();
    tags.put(caseInsensitiveKeyword,tags.getOrDefault(caseInsensitiveKeyword,0)+1);
    writeOut();
}

{startOpeningTag} {
    String caseInsensitiveKeyword=yytext().replaceAll("<","").toLowerCase();
    tags.put(caseInsensitiveKeyword,tags.getOrDefault(caseInsensitiveKeyword,0)+1);
    writeOut();
}
{startTag} {
    //can be a closing or opening tag
    String caseInsensitiveKeyword=yytext().replaceAll("</|<","").toLowerCase();
    tags.put(caseInsensitiveKeyword,tags.getOrDefault(caseInsensitiveKeyword,0)+1);
    writeOut();
    yybegin(TAG);
} */

<COMMENT> {
    {endMultiLineComment} {
        comments++;
        System.err.println(yytext());
        yybegin(YYINITIAL);
    }
    . {
        System.err.print(yytext());
    }
}

/* <TAG> {
    ">" {
        writeOut();
        yybegin(YYINITIAL);
    }
    {text} {
        //Other parameters inside the tag
        writeOut();
    }
}
 */
 
{text} | {space} | {nl} {writeOut();}

. {
    System.out.println("ERROR (Character not recognized): "+yytext());
}
