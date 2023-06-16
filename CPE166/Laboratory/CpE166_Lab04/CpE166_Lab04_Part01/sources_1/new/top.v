module top(clk, reset, address, data, cs, we, oe);
input clk, reset;
output [4:0] address;
output [3:0] data;
output cs, we, oe;

wire [4:0] address_wire;
wire[3:0] data_wire;
wire cs_wire, we_wire, oe_wire;

assign address = address_wire;
assign data = data_wire;
assign cs = cs_wire;
assign we = we_wire;
assign oe = oe_wire;

mem_fsm FSM(.clk(clk), .reset(reset), .address(address_wire), .data(data_wire), .cs(cs_wire), .we(we_wire), .oe(oe_wire));
ram RAM(.address(address_wire), .data(data_wire), .cs(cs_wire), .we(we_wire), .oe(oe_wire));
endmodule

