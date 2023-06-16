# The Memory Walker-Filler

Description: Continuing from last assignment, lets create a "memory walker", which stores random values to consecutive addresses in a Ram.

Steps: 
A) Add a Ram unit (available under the "Memory" group) to the simulation area. Configure it to have 16 address bits, and 8 data bits, and to have separate load/store ports. 
B) Change the counter we designed in last assignment to have 16 bits instead of 8 bits (what needs to change for this?). You can remove the hex displays at the counter output, or expand them to cover the 16 bits. 
C) Connect the output of the counter to the Address bus of the Ram. 
D) Add an 8-bit Random Generator (under "Memory") to the circuit and connect its output to the data Input of the ram. Don't forget to connect the clock generator to all units that need it. Set the write signal on the Ram to "high", so that data will be written to it. 

Note: the Ram module has an option to view, store and load its content to/from file. It also has some control pins, for load/clear/select. Familiarize yourself with the Ram module, as we will be using it to store program code and as a register file. To help with debug, clicking on any bus with the finger cursor will display the current value on the bus. You can optionally add hex displays to your circuit for better visibility. That is up to you.

Criterion: When I open your submission and enable clock (ctrl+k), I should see the position in the Ram proceeding and filling it in with random values.
