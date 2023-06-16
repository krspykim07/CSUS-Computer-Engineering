# Getting started with Logisim - A Basic Counter

Description: Using Logisim (link below), create a simple 8-bit counter and the output connected to two hex displays, splitting the upper and lower nibbles (each 4-bits). 

Logisim download | SourceForge.net

Links to an external site.

Steps:

A) Drag a Register (available under Memory category), an Adder (available under Arithmetic category), a Splitter (available under Wiring category), a Clock and a Constant (both under Wiring), and 2 "Hex Digital Display" (available under the Input/Output category) to the simulation area.

- Hover the mouse over the pins of the different units you just added, to see their names.

B) Set the Register to have 8 Data Bits (this is done in the left side panel). Connect the Output of the register to one Input of the Adder (this should also be set to 8 bits wide). Connect the other input of the Adder to the Constant element (after setting it to have a Data Bits of 8 as well). Set that Value of the Constant to 1. Now connect the Output of the Adder to the Data input of the Register.

- What did we just do? We're adding +1 to the Register output and feeding it back to its input. We've made a Counter.

C) Connect the Output of the Register (same bus that went to the Adder) to the two Hex Displays, using the Splitter. Hint: the Register has 8 bits, but each Hex display has only 4-bit inputs. So you need to split the Register Output into two halves, each 4 bits wide. Look at the settings of the splitter (in left panel). How would you do that?

Note: If you connect mismatching bus widths the connection will turn red, and the circuit will not function.

D) Connect your Clock generator to the Clock pin of your Register.

There's one last thing left. We haven't connected the Enable and Clear pins of the Register to anything. Connect them to ground or power such that when we toggle the clock (by clicking it or pressing ctrl+t) the value of the counter increments and we can see it on the HEX displays. 

Criterion: For a submission to be valid, when I open your file (a *.circ file) and enable the clock generator, the I must see the two hex displays start counting up: 00, 01, 02, 03...

Save your circuit as a .circ file and submit it.
