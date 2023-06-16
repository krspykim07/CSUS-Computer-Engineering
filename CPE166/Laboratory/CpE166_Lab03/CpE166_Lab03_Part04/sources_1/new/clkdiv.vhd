-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- clock division
--clkdiv.vhd

Library ieee; 
Use ieee.std_logic_1164.all; 
use ieee.std_logic_unsigned.all; 
use ieee.std_logic_arith.all; 

entity clkdiv is 
port(clkin: in std_logic; 
     clkout:  out std_logic); 
end clkdiv;

architecture arch1 of clkdiv is 
signal  cnt:  std_logic_vector (3 downto 0) := "0000"; 
begin
process(clkin) 
begin 
if (rising_edge(clkin)) then 
    if ( cnt = 3 )  then 
        cnt <= (others=>'0'); 
        clkout <= '1'; 
    elsif (cnt < 1 ) then 
        cnt <= cnt + 1;
        clkout <= '1'; 
    else 
        cnt <= cnt + 1; 
        clkout <= '0';
    end if; 
end if; 
end process; 
end arch1;