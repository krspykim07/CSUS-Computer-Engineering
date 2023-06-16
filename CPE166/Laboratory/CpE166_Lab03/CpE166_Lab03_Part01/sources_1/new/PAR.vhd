-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 01
-- Even Parity Bit
-- PAR.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use work.MY_PACK.all;

entity PAR is
port( db: in std_logic_vector(2 downto 0);
pb: out std_logic);
end PAR;
 
architecture ARCH of PAR is 
begin 
pb <= PARITY(db);
end ARCH; 
