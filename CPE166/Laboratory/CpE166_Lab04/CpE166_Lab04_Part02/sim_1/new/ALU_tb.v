// Vigomar Kim Algador
// CpE166 Section 03
// Laboratory 04: Part 02-03
// ALU

module ALU_tb;
    reg [3:0] A, B;
    reg [2:0] S;
    reg Cin;
    wire [3:0] Y;
    integer i,j;
    
    ALU uut(B, A, S, Cin, Y);
    
    initial begin
    A = 0; B = 0; Cin = 0; S = 0; #10;
    
    for (i = 0; i < 2; i = i+1) begin
        for (j = 0; j < 8; j = j+1) begin
            A = 6; B = 12; Cin = i; S = j; #10;
        end
    end
    #10 $stop;
    end
endmodule   


/*for (i = 0; i < 2; i=i+1) begin
        Cin <= i;
        for (j = 0; j < 8; j=j+1) begin
            S <= j;
            for (k = 0; k < 256; k = k + 1) begin
                {A, B} = k;
                #5;
            end
        end
    end
    #10 $stop; 
    end
endmodule */
