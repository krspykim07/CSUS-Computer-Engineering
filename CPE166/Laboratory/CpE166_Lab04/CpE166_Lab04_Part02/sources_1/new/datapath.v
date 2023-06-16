// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// Datapath Verilog


module datapath(M0, M1, M2, Cin, CLR, W, CE, SEL, S, CLK, R0, R1, R2);
    input [3:0] M0, M1, M2, CE;
    input [2:0] W, S;
    input [1:0] SEL;
    input Cin, CLR, CLK;
    output [3:0] R0, R1, R2;
    
    wire [3:0] Y0, Y1, Y2, Y3, A, B;
    
    mux2 m1 (.D0(M0), .D1(A), .S(W[0]), .Y(Y0));
    mux2 m2 (.D0(M1), .D1(A), .S(W[1]), .Y(Y1));
    mux2 m3 (.D0(M2), .D1(A), .S(W[2]), .Y(Y2));
      
    dff d1 (.D(Y0), .CLR(CLR), .CE(CE[0]), .CLK(CLK), .Q(R0));
    dff d2 (.D(Y1), .CLR(CLR), .CE(CE[1]), .CLK(CLK), .Q(R1));
    dff d3 (.D(Y2), .CLR(CLR), .CE(CE[2]), .CLK(CLK), .Q(R2));
   
    mux4 m4 (.D0(R0), .D1(R1), .D2(R2), .D3(0), .SEL(SEL), .Y(B));
    
    ALU a1 (.A(A), .B(B), .S(S), .Cin(Cin), .Y(Y3)); 
    
    dff d4 (.D(Y3), .CLR(CLR), .CE(CE[3]), .CLK(CLK), .Q(A));
    
endmodule
