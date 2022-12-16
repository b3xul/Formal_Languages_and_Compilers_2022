default: scanner parser
	javac *.java

scanner:
	jflex Library_scanner.jflex

parser:
	java java_cup.MainDrawTree -parser parser parser.cup

clean:
	rm -f parser.java Library_scanner.java sym.java
	rm -f *.class
	rm -f *.*~

