-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- Stopwatch testbench
-- stopwatch_tb.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity stopwatch_tb is
end stopwatch_tb;

architecture testbench of stopwatch_tb is
component stopwatch
port(start, stop, clk, reset: in std_logic;
     Y0, Y1, Y2: out std_logic_vector(3 downto 0));
end component;
signal start, stop, clk, reset: std_logic;
signal Y0, Y1, Y2: std_logic_vector(3 downto 0);

begin
DUT: stopwatch port map(start, stop, clk, reset, Y0, Y1, Y2);
process
begin
clk <= '1'; wait for 5ns;
clk <= '0'; wait for 5ns;
end process;

process
begin
    reset <= '1'; wait for 10 ns;
    start <= '1'; stop <= '0'; reset <= '0';
    wait for 500 ns;
    start <= '0'; stop <= '1'; reset <= '0'; 
    wait for 100 ns;
    start <= '1'; stop <= '0'; reset <= '0'; 
    wait for 100000 ns;
end process;
end testbench;
