-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 01
-- Even Parity Bit Testbench
-- PAR_tb.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity PAR_tb is
end PAR_tb;

architecture testbench of PAR_tb is
component PAR
port (db: in std_logic_vector(2 downto 0);
pb: out std_logic);
end component;

signal db: std_logic_vector(2 downto 0);
signal pb: std_logic;
begin
uut: PAR port map(db=>db, pb=>pb);
process begin
db <= "000"; 
wait for 100 ns;
db <= "001";
wait for 100 ns;
db <= "010";
wait for 100 ns;
db <= "011";
wait for 100 ns;
db <= "100";
wait for 100 ns;
db <= "101";
wait for 100 ns;
db <= "110";
wait for 100 ns;
db <= "111";
wait for 100 ns;
wait;
end process;
end testbench;
