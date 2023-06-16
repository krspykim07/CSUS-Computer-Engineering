# The Register File [PART 2]

Reminder: In the previous assignment you were adding the length of your family name to a register (Reg4) after each iteration of printing. In this assignment you'll be doing the same, but with a small difference. This time you will be adding a value that starts out as the length of your family name, but itself increments on each iteration.

Think about it. This can't be done with just an immediate operation - like before. It requires a register-register ADD operation to be in our Instruction Set Architecture.

To keep things simple we will use an accumulator-based design

Links to an external site. for our register file. Think of the "accumulator" as a special register we use implicitly in instructions, and is kept outside of the general register file.  

To generate this sequence correctly we need 4 instructions:

i) one that puts the sum of a register and an immediate in the accumulator. 

ii) one that puts the sum of a register and the accumulator in the accumulator.

iii) one that stores the accumulator in a register.

iv) a programmable jump instruction [we already have this from before]

Outline Steps

1) Add a single 8-bit register to your main circuit near the register file. This will be our accumulator

Links to an external site.. I highly recommended putting hex displays at the accumulator output, to help with debug.

2) Instead of directly connecting the immediate portion of the instruction to the ALU adder (as before), now use a 2-way multiplexer to make that input to the adder selectable between the immediate portion and the accumulator's output. We now have the ability to do register-accumulator or register-immediate ADD ops. But what should control that multiplexer?

3) In the prior assignment, the output of our ALU adder went directly to the register file input. Remove that connect, and instead connect the ALU output to the accumulator register input. And connect the accumulator's output to the input of the register file. Think about it. What have we just done here?

4) Main design task: Complete the Control Logic. Use the instruction decoder pins to control the dangling select pins (Note: we've added a multiplexer and a register and changed the connections), such that it will implement the 4 instructions listed above. You can decode opcodes to instructions as you choose, as long as you use them correctly in your instruction ram code. 

5) Finally change your program code such that after each time printing your family name, it adds a value to Reg-4. The value added must start with your family name length, but itself increment by 1 on each later iteration.

Code Hint: Before the main loop of code, have an instruction that adds your family name length to some spare register. Then inside the main loop simply change your prior immediate add instruction to instead add that spare register to the tracking register (Reg4). Follow that with an instruction that increments the spare register by 1, so its ready for the next iteration. Then followed by the jump instruction as before (Note: the offset has now increased further). Look at the 4 instructions above available to you. What sequence of instructions will achieve this?

Circuit Hint: Pick which bits of your decoder output represent which of the 4 instructions, and label them.

    a. The select pin of the 2-way mux at ALU input.  This select pin only matters to the two add instruction. So you could connect the decoder pin representing one of them to control this mux (which one depend on how you've connected the other inputs)

    b. The accumulator load enable pin. Both Add instructions need this pin to go high (as they both store to the accumulator). So you could connect it to the OR of their decoder outputs.

    c.  The register file "Store" pin. (recall: in last assignment this was enabled on immediate ADD instructions). It now only needs to be activated on the accumulator-to-register store operation (see iii. from list above).

Criterion

I will open your circuit submission, load the instruction ram with your image file. When I enable clock I should see your name printed and then your family name repeatedly printed, and the value in Reg4 incrementing by a value that starts with your family name length, and increments by one each iteration.

(Reminder: bits 5-through-7 of our instruction must determine the register)

Congratulations! Your processor can now do more complex calculations.
