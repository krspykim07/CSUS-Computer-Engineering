-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- clock division testbench
--clkdiv_tb.vhd

library IEEE; 
use IEEE.std_logic_1164.all; 
entity clkdiv_tb is 
end clkdiv_tb;

architecture tb of clkdiv_tb is 
component clkdiv 
port(clkin: in std_logic; 
     clkout: out std_logic); 
end component;
 
signal clkin, clkout: std_logic; 

begin 
DUT: clkdiv port map(clkin, clkout); 
clocking: process 
begin 
    clkin <= '0'; wait for 5 ns; 
    clkin <= '1'; wait for 5 ns; 
end process; 
end tb;
