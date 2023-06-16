# The Stalling Data Memory

Description

In our prior assignment we added the data memory (a place we can store large amounts of data, which can later be retrieved). It has one problem though. It's unrealistic in that we can access this large memory in a single clock. 

In this assignment we introduce the concept of stalling the CPU on memory accesses, for multiple clocks, to wait for memory access latency.

Note: This assignment requires importing a Logisim library file. If your prior submission did not work correctly, it needs to be fixed first. This is an opportunity to fix prior circuit problems and catch up on grade. 

Outline Steps

Starting from your solution for prior assignment...

1) Download this Logisim library file.

2) From the top panel of Logisim, choose Project->LoadLibrary->LogisimLibrary, and chose the .circ file you just downloaded. A new circuit group with "StallableMem" should appear in your project. Double click on the StallableMem to see its internal state. Do not modify the internals of this circuit. 

3) Replace the Ram: Remove the "Data Ram" we added in prior assignment, and replace it with an instance of this StallableMem (drag an instance from side panel). Reconnect all the old ram connections to equivalent on this new one. Note that this ram has a "ready" output pin, which indicates completion of a memory operation. We will next use this output to stall our CPU when not ready. But first verify that your solution still works properly, and meets the last criterion, without connecting that ready pin anywhere.

3.a) Conditionally Stall the CPU (main task of assignment):  We want to now stall the CPU on LOAD and STORE instructions when the StallableMem is not Ready. How can we do this safely?

Directly meddling with the clock is not safe, as it can cause asynchronous clock glitches that are difficult to debug. But we can safely stall the CPU with the Program Counter's "enable" pin. Until now we have left that pin fixed at high. But if we made that pin low in certain conditions, it would stall the program counter and thus stall the CPU. How do we control that pin so it goes low when on a LOAD or STORE instructions and the StallableMem's "Ready" pin is low? Design a simple circuit that takes the required Decoder outputs and the StallableMem's Ready pin, such that it goes low under that condition. Connect the output of this circuit to the ProgramCounter's Enable pin. (Hint: the circuit needs no more than 2 gates to achieve the correct stalling).

Note: In prior assignments you could have left the "load" pin of your data ram always high, and things would worked fine (because the output would just be ignored if not executing a "load" instruction). But with this StallableRam, you need to correctly the "Load" pin high only when executing data "load" instructions, (determined by your instruction decoder), because that is what tells the ram it needs to fetch an address, and return a ready signal when complete..

4) Connect an LED to the not of your program counter's enable pin, so we can easily see when it is stalling.

Criterion

The criterion is as in the prior assignment, except data should be store and retrieved from the new StallableMem, and the program counter should stall for a number of clocks following each Load or Store. As before the Fibo sequence should be first stored to Memory in an initial loop, then exit that loop and start loading the sequence from memory and displaying it on the TTY. No code change are be needed if your last assignment worked correctly.

Your submission zip file must contain your circ, an unmodified copy of the StallableMem .circ (test that when opened from scratch it finds the library file), and your instruction code.

Important: The CPU must only stall on LOAD and STORE instructions, nothing else. 
