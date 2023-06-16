`timescale 1ns / 1ps
// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// Datapath Testbench


module datapath_tb;
    reg [3:0] M0, M1, M2, CE;
    reg [2:0] W, S;
    reg [1:0] SEL;
    reg Cin, CLR, CLK;
    wire [3:0] R0, R1, R2;
    
    datapath uut (M0, M1, M2, Cin, CLR, W, CE, SEL, S, CLK, R0, R1, R2);
    
    initial CLK = 0;
    always #5 CLK = ~CLK;
    
    initial begin
            M0=4'b0000; M1=4'b0000; M2=0; Cin=0; CLR=1; W=0; CE=0; SEL=3; S=0; 
        #15 M0=4'b0110; M1=4'b1100; M2=0; Cin=0; CLR=0; W=0; CE=1; SEL=0; S=2; 
        
        #20 CLR=0; W=3'b000; CE=4'b1000; SEL=2'b00; S=3'b010; 
        #20 CLR=0; W=3'b010; CE=4'b0010; SEL=2'b10; S=3'b001;  
        #20 CLR=0; W=3'b000; CE=4'b1000; SEL=2'b10; S=3'b001; 
        #20 CLR=0; W=3'b100; CE=4'b0100; SEL=2'b10; S=3'b001;  
        
        #100 M0=4'b0000; M1=4'b0000; M2=0; Cin=0; CLR=1; W=0; CE=0; SEL=3; S=0; 
        #20 M0=4'b0110; M1=4'b1100; M2=0; Cin=1; CLR=0; W=0; CE=1; SEL=0; S=2; 
        
        #20 CLR=0; W=3'b000; CE=4'b1000; SEL=2'b00; S=3'b010; 
        #20 CLR=0; W=3'b010; CE=4'b0010; SEL=2'b10; S=3'b001;  
        #20 CLR=0; W=3'b000; CE=4'b1000; SEL=2'b10; S=3'b001; 
        #20 CLR=0; W=3'b100; CE=4'b0100; SEL=2'b10; S=3'b001;  
   
        #20 $stop;
    end
endmodule
