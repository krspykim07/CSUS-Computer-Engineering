# The Simple Jump

Description

Continuing from the previous assignment, we now want to modify the circuit to be able to jump back to address 1 when a specific condition in the decoding of the ram output is met.

Note: from this assignment a step-by-step guide is not given, only an outline is given. It is up to you to figure out how to complete the objective. 

Outline Steps

a) Remove the random generator from the input of the Ram, and make reading its default state (rather than writing). We will be modifying the Ram content manually from now on.

b) When bit 1 of our Ram goes high we want the counter we built before to load a different value (than its current value plus one). How do we do this? Lets make this alternate input value to the counter register to be a constant of 1. 

Notes:

- Leave bit 0 of the ram output to toggle the output mux (from the previous assignment). 

- The register we use in our counter currently always loads the input value of current counter value plus one. We can use a multiplexer to change this.

- We want to make it so that whenever data fetched from Ram has bit 1 high, the counter jumps to address 1.

C) Finally, modify the content of the Ram (right click on it and select "edit contents...") to generate the sequence "1,A,A,1,1,A,1,A,A,1" on the output hex display when the clock is ticked, and to then jump back to address 1 (perpetually repeating the sequence). What series of values need to be in the Ram to achieve this?

Congratulations, your instruction walker-decoder just got a whole lot more powerful! It can now repeat sequences of instructions. :)

Criterion

The final submission this time must be a zip file containing your circuit design (.circ) and the stored data (.txt) of the ram. 

Note: To store the ram content to file, right click on the ram and select "save image...". Please test that your image file is valid by loading it (right click on the ram and select "load image...").

I will open the .circ file from your submission, and load the ram with the content of the image .txt file from your submission. 

I must see the sequence described above displayed on the output hex display. Then I must see the program counter return to 1, and the sequence repeated on the output display.
