module top_tb;
reg clk, reset;
wire[4:0] address; //2^5 = 32
wire[3:0] data;   //4 bits
wire cs, we, oe;
    
top uut(clk, reset, address, data, cs, we, oe);
    
always begin
    #5 clk = ~clk;
end
    
initial begin
    clk=0;
    #10 reset = 1;
    #10 reset = 0;
    #100 $stop;
end
endmodule

