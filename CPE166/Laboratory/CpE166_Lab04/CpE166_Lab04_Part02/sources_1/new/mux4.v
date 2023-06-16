// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// multiplexer (MUX4)

module mux4(D0, D1, D2, D3, SEL, Y);
    input [3:0] D0, D1, D2, D3;
    input [1:0] SEL;
    output [3:0] Y;
    reg [3:0] Y;
    
    always @ (D0 or D1 or D2 or D3 or SEL)
    begin
        case(SEL)
            0: Y = D0;
            1: Y = D1;
            2: Y = D2;
            3: Y = D3;
        endcase
    end
endmodule
