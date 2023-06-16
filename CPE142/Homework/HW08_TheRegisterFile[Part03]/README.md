# The Register File [PART 3]

In this assignment, lets use the new register-register operations we introduced in our circuit to generate the Fibonacci sequence on each loop iteration, after printing your family name.

Code Hints to Generate Fibonacci Sequence:

a) It really needs no more than 6 instructions to generate.

b) We really only need to use 3 of the register file entries to generate the sequence. One to store the current number, one for the prior sequence number, and possibly one reserved for zero. c) we will be assuming the register file starts with all entries cleared to zero.

Circuit Change for Printing:

Until now we have only had an immediate TTY print operation. But we now want to also be able to print a calculated value. So a small addition to our circuit is needed. :P

Put a 2-way multiplexer at the TTY data input, that chooses between the immediate and the accumulator. Now our print operation can print either of them. But how do we control this mux? We could use decoder bits - but lets save them and put an unused bit of our TTY instruction to use. Recall that the TTY display only takes 7 bits, but our immediate portion is 8 bits. So we have a free bit somewhere (depending on how you split that bus). Use that bit to control the mux going to the TTY input. Now how you set that bit in your code determines if you print the immediate or accumulator value.

Criterion

I will open your circuit submission, load the instruction ram with your image file. When I enable clock I should see your name printed and then your family name repeatedly printed, with the next number in Fibonacci sequence printed after each iteration of your family name. I must see the last and current numbers stored in the register file, and the loop properly executing. Note that values above 9 will not display correctly in our ascii TTY, which is fine. Any ideas what new instruction would help us fix this display problem?
