// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// D-Flip Flop (dff.v)


module dff_tb;
    reg [3:0] D;
    reg CLR, CE, CLK;
    wire [3:0] Q;
    
    dff u1(D, CLR, CE, CLK, Q);
    
    initial CLK = 0;
    always #10 CLK = ~CLK;
    
    initial begin
    CLR = 1; D = 1; CE = 1;
    #10 CLR = 0;
    #10 CE = 0;
    #50 $stop;
    end
endmodule
