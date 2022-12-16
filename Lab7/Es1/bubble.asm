	DOUBLE x[5]
	INT i
	INT j
	DOUBLE swap
	INT pos
WARNING: Operation between int and double, int number casted to double.
	EVAL 2 3.5 +
	ASS swap
WARNING: Operation between int and double, int number casted to double.
WARNING: Assignment of a double value to an int variable.
	EVAL 2 3.5 +
	ASS pos
WARNING: Assignment of a double value to an int variable.
	EVAL 3.5
	ASS pos
WARNING: Assignment of a double value to an int variable.
	EVAL swap
	ASS pos
WARNING: Assignment of an int value to a double variable.
	EVAL pos
	ASS swap
WARNING: Assignment of an int value to a double variable.
	EVAL 3
	ASS swap
	EVAL -2.0
	ASS x[0]
	EVAL -3.0
	ASS x[1]
	EVAL 3.0
	ASS x[2]
	EVAL 5.0
	ASS x[3]
	EVAL 2.5
	ASS x[4]
	EVAL 5
	ASS pos
L1:	EVAL pos 0 > 		/* while (line 40) */
	GOTOF L2
	EVAL 0
	ASS i
L3:	EVAL i pos 1 - < 		/* while (line 42) */
	GOTOF L4
	EVAL i 1 +
	ASS j
	EVAL x[i] x[j] > 		/* if (line 44) */
	GOTOF L5
	EVAL x[j]
	ASS swap
	EVAL x[i]
	ASS x[j]
	EVAL swap
	ASS x[i]
L5:	EVAL i 1 +
	ASS i
	GOTO L3
L4:	EVAL pos 1 -
	ASS pos
	GOTO L1
L2:	EVAL 0
	ASS i
L6:	EVAL i 5 < 		/* while (line 57) */
	GOTOF L7
	PRINT x[i]
	EVAL i 1 +
	ASS i
	GOTO L6
L7:	END
