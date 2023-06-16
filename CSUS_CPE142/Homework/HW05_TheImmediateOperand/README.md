# The Immediate Operand

Description

Continuing from the prior assignment, we now introduce the immediate portion of instructions. We will use this in both the branch/jump logic (to provide an offset) and for displaying ASCIIoutput.

In the prior assignment, we simply set the program counter to a fixed value (of one) to implement something like a branch/jump instruction. But that isn't how CPUs do jumps. We want to add/subtract an immediate value (provided from within the instruction) to the current program counter. So our instructions need an immediate portion (like the MIPS i-format). We also want to be able to output ASCII information, with immediates.

Outline Steps

a) Our instruction ram has been only 8-bit data wide until now. But that doesn't leave much room for an immediate portion. So lets increase the data width of the instruction Ram to 16-bits (do this in the settings of the existing ram). This will also require adjusting the output bus splitter from before. We will use the upper 8 bits of the ram output as the immediate portion of our instructions (how do we config the output splitter?).

b) Add an 16-bit "adder" module to your solution. We will use this adder to add the instruction offset (immediate portion) of jump instructions to the current program counter (the output of our counter register)...

c) Take the upper 8 bits of instruction ram output (that you just split off), and connect it to one input of the adder. Connect the output of the program counter to the other input of the adder module. [Note: use a bit extender to make the 8-bit immediate portion match the bit width of the program counter and adder. Do not reduce the size of program counter to 8 bits instead]. 

d) You now have calculated the destination of a potential branch instruction. Remove the "one" constant value at the input to your program counter (which we added in last assignment. Connect the output of your adder to the program counter input.

Congratulations! Your CPU can now jump forwards and backwards, by an offset that you program into the immediate portion of the instruction.

Now for the code and displaying the output...

e) Add a TTY module (under "Input/Output") to your solution. Connect its "data" bus to the immediate portion of your instruction (note: the TTY input has 7 bits but your immediate is 8 bits -- how do you correctly connect them?). Connect the TTY's "clock" and "clear" pins to your global clock and clear. Important: Connect the TTY's "write" pin to the 2nd bit of your instruction Ram output (the same pin you use to toggle the multiplexer). 

Note: you can remove that multiplexer and hex display from before -- or leave it in. We don't need it any more.

Modify your instruction ram content to print your first name, then last name to the TTY display, and then jump back and repeatedly print your last name. You must use a sequence of instructions that trigger the TTY write (2nd bit of our instructions) to write the immediate portion to the TTY (hint: pay attention to step e above).

Hint: You need to insert ASCII code of the letters into the immediate portion, and set bit 0 of the instruction to high (so that it writes to the TTY).

Criterion

I will open your circ file, and load the instruction ram with your data image. When I press ctrl+k, I must see your first name, followed by last name, printed to the TTY display. And then it must keep repeating your family name. You must correctly use the jump instruction (hint: calculate the 2's complement offset you need to give to the jump instructions immediate portion).
