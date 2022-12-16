default: scanner parser
	javac *.java

scanner:
	jflex scanner.jflex

parser:
	java java_cup.MainDrawTree -parser parser parser.cup

clean:
	rm -f parser.java Calculator.java sym.java
	rm -f *.class
	rm -f *.*~

