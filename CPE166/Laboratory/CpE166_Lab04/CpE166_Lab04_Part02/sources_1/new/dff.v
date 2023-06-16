// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// D-Flip Flop (dff.v)

module dff(D, CLR, CE, CLK, Q);
    input [3:0] D;
    input CLR, CE, CLK;
    output reg [3:0] Q;
    
    always@(posedge CLK or posedge CLR)
    begin
        if (CLR)
            Q <= 0;
        else if (CE)
            Q <= D;
    end
endmodule
