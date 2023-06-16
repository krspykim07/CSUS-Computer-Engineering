// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// 4-bit multiplexer (MUX2)

module mux2(D0, D1, S, Y);
    input [3:0] D0, D1;
    input S;
    output [3:0] Y;
    reg [3:0] Y;
    
    always @ (D0 or D1 or S)
    begin
        if (S == 1)
            Y = D1;
        else
            Y = D0;
    end
endmodule
