# The Register File [PART 1]

Description

In this assignment we will be introducing the register file; a place for temporary storage of computed values. We will be displaying our name (just like in prior assignment), but this time also using a register to keep track of how many characters we've printed. 

This also needs us to start properly decoding the opcodes, and add a new operation that uses the register file.

Outline Steps

1) In prior assignments we simply used bits 0 and 1 of the instruction to identify output (mux or TTY) and jump operations. But that won't be efficient as we add more operations, because it wastes opcode bits. We need to properly "decode" the opcode. So add a "decoder" (available under "Plexers" group), set its "select bits" to 3 (giving us 8 output bits), and its "Include Enable" to NO. Connect its input bus to the lower 3 bits of the instruction ram output (how do you change the bus splitter to achieve this?). The 8 outputs of this decoder now determine which instruction is to be executed. Instead of the old bus splitter connections, now connect bit-1 of the decoder output to the TTY "write enable" pin, and bit-2 to your program counter's input mux. That defines what 2 of our 8 opcodes do. After this change, the prior assignment criterion should still be met - check that it still works as before.  

2) Add a Ram module with its "address bus width" set to 3, its "data bus width" set to 8, and "data interface" set to "separate". This will be our 8 entry register file. Each entry being 8-bits wide. Connect the 3-wide address bus of the register file to the bits 5-through-7 of our instruction (important: how do you change the bus splitter to do this?) You can now access registers with those 3 bits of your instructions.

3) Add an "Adder" module (just like the one we have already for the jump instruction). This will serve as our simple ALU (Arithmetic Logic Unit) for now. Connect the immediate portion of the instruction to one input of this adder, and the output of the register file to the other input. Connect the output of this adder to the input of the register file.  

4) MAIN TASK OF THIS ASSIGNMENT: Connect bit-3 of the decoder output in a way so that when it is high the immediate portion of the instruction is added to the specified register (again: bits 5-through-7 of our instruction determine the register). This will implement something like a MIPS "addi" operation.

5) Modify your code from prior assignment, adding a single instruction that increments Register 4 of the register file by the number of characters in your family name just before your jump instruction (remember: this will increase your jump offset).

Congratulations! Your CPU can now programmatically use values it calculated before to do other calculations.

Criterion 

Same as last assignment. But this time I must also see Register 4 incrementing by the length of your family name on each loop iteration. (we will assume the register file starts clean)
