// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// 4-bit multiplexer (MUX2)

module mux2_tb;
reg [3:0] D0, D1;
reg S;
wire [3:0] Y;
integer k;

mux2 u1(D0, D1, S, Y);

initial begin
    for (k = 0; k < 512; k = k+1)
        #10 {D0, D1, S} = k;
    #10 $stop;
end
endmodule
