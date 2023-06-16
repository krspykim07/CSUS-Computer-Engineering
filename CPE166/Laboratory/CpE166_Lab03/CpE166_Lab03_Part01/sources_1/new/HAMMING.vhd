-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 01
-- (7,4) Hamming Code
-- HAMMING.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use work.MY_PACK.all;

entity HAMMING is
port( D7, D6, D5, D3: in std_logic;
DOUT: out std_logic_vector (7 downto 1));
end HAMMING;

architecture Behavioral of HAMMING is
signal db1, db2, db4: std_logic_vector(2 downto 0);
signal pb1, pb2, pb4: std_logic;

begin
    db1 <= D7 & D5 & D3;
    db2 <= D7 & D6 & D3;
    db4 <= D5 & D6 & D7;
    
    pb1 <=  parity(db1);
    pb2 <= parity(db2);
    pb4 <= parity(db4);
    
    DOUT <= D7 & D6 & D5 & pb4 & D3 & pb2 & pb1;
end Behavioral;
