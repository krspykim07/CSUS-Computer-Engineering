-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- watch testbench
-- watch_tb.vhd

library IEEE; 
use IEEE.std_logic_1164.all; 
entity watch_tb is 
end watch_tb; 

architecture tb of watch_tb is 
component watch 
port(reset, en, clk: in std_logic;
     Y0, Y1, Y2: out std_logic_vector(3 downto 0)); 
end component; 

signal reset, en, clk: std_logic;
signal Y0, Y1, Y2: std_logic_vector(3 downto 0);

begin 
DUT: watch port map(reset, en, clk, Y0, Y1, Y2); 
process
begin
clk <= '1'; wait for 5ns;
clk <= '0'; wait for 5ns;
end process;

process
begin
    reset <= '1'; wait for 50 ns;
    en <= '1'; reset <= '0'; wait for 150 ns;
    en <= '0'; reset <= '0'; wait for 50 ns;
    en <= '1'; wait for 1000 ns;
end process;
end tb;
