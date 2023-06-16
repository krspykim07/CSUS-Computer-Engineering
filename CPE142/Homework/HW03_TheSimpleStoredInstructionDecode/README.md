# The Simple Stored Instruction Decode

Description: Continuing from assignment 2, we now want to be able to read the stored values from the ram (instruction memory) and use the values to control what goes to an output display.

Steps:

After having filled some of the memory with random values (as in the prior assignment), we want to be able to reset the counter, returning it to address zero and now read out the values. We want to use the lowest bit of this read out data to switch a multiplexer between selecting two constant 4-bit values.

a) add a "button" control and connect it to the reset pin of our counter's register (this is an async reset). Hint: to test this is working switch to the finger curser and press this button, You should see the counter reset to zero immediately. 

b) add a "pin" control (under "wiring) and set its "three state" and "output" properties to "no'". Connect its output to the "load" pin of the ram, and the not of its output to the store pin of the ram. Hint: to test this is working switch to the finger curser and press the pin to toggle it between high and low. This pin will default to low enabling writes, and we will switch it to high to read from the ram. We will call this the "read/write pin".  

c) add a bus splitter to extract the lowest bit of ram's data (output) bus. (think about this - we are defining what the bits of our "instructions" do) 

d) add two 4-bit 'constant' controls, one set to 1 and the other to A.

e) add a 4-bit multiplexer, with your two constants connected to its inputs (1 to input0 and A to input1). Connect its select pin to the extracted lower bit of the ram (output) data bus. Hint: the multiplexer seems to have a bug and doesn't display the name of the select and output control pins when you hover on them. The select pin is the one closest to the two inputs. The other is the output control (set it to high).

f) add another hex display and connect it to the output of the multiplexer.

After connecting everything, switch to the finger curser, press the reset "button" to reset the counter, and set the ram load "pin" to low. Toggle the clock and make sure it is filling memory with random values like in the prior assignment. After filling some of memory, once again press the reset "button", and this time switch the "read/write pin" to high. Now when you toggle the clock you should see it walking through memory, but this time reading out the values unchanged. The multiplexer should toggle the hex display between 1 when the ram output is even and A when it is odd.

Congratulations! You have just created a simple fetch-decode logic. Its fetching instructions (a form of data) from memory and controls logic gates based on its value.

Criterion:

I will open your submission and start the clock. I must see memory being filled in with random values (as in last assignment), while the output hex display is blank (i.e. "--"). I will then stop the clock and press the reset button, and must see the memory location return to address zero. I will then toggle the "read/write pin" to high. Now when I reenable the clock I must see the output hex display switching between 1 and A depending on the lower bit of value read out of the ram. Please test and keep things tidy and labeled, as it helps me with grading, not having to figure out where things are.
