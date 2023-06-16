-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 02
-- lsfr.vhd
-- Psuedorandom Number Generator

Library ieee;
Use ieee.std_logic_1164.all;

Entity lfsr is
Port(reset, clk: in std_logic;
     Q: out std_logic_vector (4 downto 0));
End lfsr;

Architecture beh of lfsr is
Signal m: std_logic_vector (4 downto 0);
Begin
Process(reset, clk)
Begin
    if( reset = '1') then
        m <= ( 0=> '1', others =>'0');
    elsif (rising_edge(clk)) then
        m(4 downto 1) <= m(3 downto 0);
        m(0) <= m(1) xor m(4);
    end if;
end process;
Q <= m;
end beh;