// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// FSM Verilog

/*module FSM(RESET, CLK, CLR, W, CE, SEL, S);
    input RESET, CLK;
    output reg [3:0] CE;
    output reg [2:0] W, S;
    output reg [1:0] SEL;
    output reg CLR;
    
    reg [2:0] state;
    parameter S0 = 3'b000;
    
    always@(posedge CLK or posedge RESET) begin
    if (RESET) begin
        state <= S0;
        CLR <= 1;
    end
    else
        case (state)
            S0: begin state <= 1; CLR <= 0; end
            1 : state <= 2;
            2: state <= 3;
        endcase
    end
endmodule*/
