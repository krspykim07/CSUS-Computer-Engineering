// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// 4-bit multiplexer (MUX4)

module mux4_tb;
reg [3:0] D0, D1, D2, D3;
reg [1:0] SEL;
wire [3:0] Y;
integer k;

mux4 u2(D0, D1, D2, D3, SEL, Y);

initial begin
    for (k = 0; k < 262144; k = k+1)
        #10 {D0, D1, D2, D3, SEL} = k;
    #10 $stop;
end
endmodule
