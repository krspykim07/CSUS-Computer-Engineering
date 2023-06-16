-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 01
-- (7,4) Hamming Code Testbench
-- HAMMING_tb.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity HAMMING_tb is
--  Port ( );
end HAMMING_tb;

architecture testbench of HAMMING_tb is
component HAMMING
Port (D7, D6, D5, D3: in std_logic;
      DOUT: out std_logic_vector(7 downto 1));
end component;

signal D7, D6, D5, D3 : std_logic;
signal DOUT : std_logic_vector(7 downto 1);

begin
uut: HAMMING port map(D7=>D7,D6=>D6,D5=>D5,D3=>D3,DOUT=>DOUT);
process begin
    D7<='0'; D6<='0'; D5<='0'; D3<='0';     -- 0000
    wait for 100 ns;
    D7<='0'; D6<='0'; D5<='0'; D3<='1';     -- 0001
    wait for 100 ns;
    D7<='0'; D6<='0'; D5<='1'; D3<='0';     -- 0010
    wait for 100 ns;
    D7<='0'; D6<='0'; D5<='1'; D3<='1';     -- 0011
    wait for 100 ns;
    D7<='0'; D6<='1'; D5<='0'; D3<='0';     -- 0100
    wait for 100 ns;
    D7<='1'; D6<='1'; D5<='0'; D3<='1';     -- 1101
    wait for 100 ns;
    D7<='1'; D6<='1'; D5<='1'; D3<='0';     -- 1110
    wait for 100 ns;
    D7<='1'; D6<='1'; D5<='1'; D3<='1';     -- 1111
    wait for 100 ns;
    wait;
end process;
end testbench;