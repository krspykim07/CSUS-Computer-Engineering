module ram ( address, data, cs, we, oe);  
input cs, we, oe; 
input [4:0] address; 
inout [3:0] data; 
 
reg [3:0] data_out ; 
reg [3:0] mem [0:31];      //32-bit address bus, 8-bit data bus. 

assign data = (cs && oe && !we) ? data_out : 4'bzzzz;  
 
always @ (cs or we or data or address)
begin
    if (cs && we)
        mem[address] = data;        // write
end

always @ (cs or we or oe or address or data) 
begin
    if (cs && !we && oe)
        data_out = mem[address];    // read
end 
endmodule