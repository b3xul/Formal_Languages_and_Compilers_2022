default: scanner parser
	javac *.java

scanner:
	jflex Facts_Rules_scanner.jflex

parser:
	java java_cup.MainDrawTree -parser parser parser.cup

clean:
	rm -f parser.java MiniC_scanner.java sym.java
	rm -f *.class
	rm -f *.*~

