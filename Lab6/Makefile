default: scanner parser
	javac *.java

scanner:
	jflex MiniC_scanner.jflex

parser:
	java java_cup.MainDrawTree -expect 2 -parser parser parser.cup

clean:
	rm -f parser.java MiniC_scanner.java sym.java
	rm -f *.class
	rm -f *.*~

