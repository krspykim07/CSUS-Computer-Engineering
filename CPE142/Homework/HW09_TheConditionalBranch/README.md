# The Conditional Branch

Description

Continuing from prior assignment. we now want to be able to correctly print the Fibonacci sequence for values larger than a single digit and stop printing when we exceed the max fibo value that can be stored in our 8-bit registers. 

This requires three new instructions:

1) A conditional branch instruction, 2) A accumulator/immediate division instruction, and 3) A accumulator/immediate modulo (remainder) instruction.

To save on decode bits we will a) repurpose the unconditional branch opcode to do a conditional branch instead, b) use one opcode for divide and modulo, but make it return the modulo only when the immediate divisor has 1 in its msb (most significant bit).  

Outline Steps

1) Add an 8-bit comparator to your circuit, and connect its inputs to the accumulator and the register file output. The "equal" output of this comparator should control whether or not to take the branch (when to load the program counter with the calculated destination). How can we make that happen? Remember our branch opcode now triggers a conditional branch-not-equal operation.

2) Add an 8-bit divider to your circuit, and connect its "Dividend Lower" input to the accumulator. Connect its Divisor input to the lower 7 bits of the immediate portion of the instruction (bit extend it to 8 bits). 

3) The data input to our accumulator until now only came from one place: the one ALU adder. But our ALU has more possible outputs now: i) the adder, ii) the division output and iii) the remainder output. So we need to introduce a mux that selects which one goes to the accumulator's data input. How do you connect this mux?  Hint: you'll need to use a spare decoded opcode bit and the msb of the immediate portion (same bit you used for the TTY mux). But be careful, add instructions are agnostic of the immediate msb.

Congratulations! Your cpu just got a lot more powerful. It can now break out of loops, and do divide operations.

Now using these capabilities, modify your code to correctly print the full decimal representation of the fibo sequence you were generating and stop printing once the sequence reaches the max that can be saved in 8 bits.

Algorithm Hint:

There are multiple ways of doing this. One is to divide by 10 three times, storing the remainder of each divide in a different register. And finally printing out the three registers. 

Criterion

As in prior assignment, print your name and family name, with the fibo sequence in between each instance of family name. But this time the fibo numbers must be printed correctly in decimal format, and stop at 233. A comma after each iteration would be helpful too.
