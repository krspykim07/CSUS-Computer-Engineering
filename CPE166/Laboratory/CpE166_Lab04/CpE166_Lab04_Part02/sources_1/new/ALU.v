// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// ALU

module ALU(A, B, S, Cin, Y);
    input [3:0] A, B;
    input [2:0] S;
    input Cin;
    output [3:0] Y;
    reg [3:0] Y;
    
    always@(S) begin
    case(S)
        0: Y = A + B + Cin;
        1: Y = A + (~B) + Cin;
        2: Y = B;
        3: Y = A;
        4: Y = A&B;
        5: Y = A|B;
        6: Y = ~A;
        7: Y = A^B;
    endcase
    end
endmodule
