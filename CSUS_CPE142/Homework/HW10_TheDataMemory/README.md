# The Data Memory

Description

Continuing from prior assignment, we now want to be able to store the Fibonacci sequence we calculated, so we don't have to keep recalculating it. So we need to introduce the data memory, i.e. a much larger place for storing data (than the register file).

We'll store the sequence to this data ram in consecutive addresses (starting from address zero), and then have a loop that keeps reading it back and display it comma-separated on the TTY display.

To our circuit, we need to add a new Ram unit, plus "load" and "store" instructions to our instruction set. 

Outline Steps

1) Add a new Ram with 256 entries of 8-bit data (with "separate" input/out ports). Connect its address bus to the output of the ALU. This is our Data Ram. Label it so we don't mix it up with other rams.

2) Use the two remaining instruction decoder outputs for our new data Load and Store instructions {you choose which is which). Where do these decoder outputs need to be connected?

Notes:

- Our new "Load" instruction must retrieve data from data Ram and store the value to the Accumulator. 

Hint: We have a new potential input to the accumulator - so we need the multiplexer(s) there to take the data Ram output too, but only select it when we're doing a Load operation.  And the OR at the Accumulator's "Enable" pin now needs the Load opcode's decoder bit added to it.

- Our new "Store" instruction must store the value in the accumulator to the data Ram.

Hint: Where does the input bus of the data Ram need to get connected to? And where does the data Ram's "str" pin need to get connected to?

Note: For both Load and Store operations, we will consider the address of the data ram to be the sum of a register and an immediate.  So the mux we have  at ALU input, which chooses between immediate and accumulator, also needs to select the immediate option when our new Load and Store operations are selected. Do we have to do anything to ensure that? Note that our decoder is a one-hot

Links to an external site. decoder.   

Congratulation! Your processor just got a lot more powerful, with much bigger memory and operations to access it.  

3.a) Modify your code to store the Fibonacci sequence to consecutive data Ram addresses (starting at zero). Can Store in hex, decimal, or ascii, up to you. This can be done by simply inserting a Store(s) after each value is calculated. You just need to use one of the register file entries (you choose) to keep track of where you last stored to. So this register needs to be incremented after every Store. How to do that in code?

3.b) Modify your code so that after exiting the main loop (on reaching 233 ), we this time enter another loop that Loads the Fibonaci elements back from the data Ram, and prints it again in decimal and comma-separated to the display.  

Criterion

As in prior assignment. But this time, the Fibo sequence repeats again at the end. And this time I expect characters to be printed without recalculating. I must see the sequence stored in data memory. 
