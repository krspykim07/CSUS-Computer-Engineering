-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 02
-- lsfr_tb.vhd
-- Psuedorandom Number Generator Testbench

Library ieee;
Use ieee.std_logic_1164.all;

Entity lfsr_tb is
End lfsr_tb;

Architecture tb of lfsr_tb is
signal clk, reset: std_logic;
signal Q: std_logic_vector (4 downto 0);
component lfsr
Port(reset, clk: in std_logic;
     Q: out std_logic_vector (4 downto 0) );
end component;

begin
uut: lfsr port map(reset, clk, Q);
process begin
    clk <= '0'; wait for 5 ns;
    clk <= '1'; wait for 5 ns;
end process;

process begin
    reset <= '1'; wait for 2 ns;
    reset <= '0'; wait for 200 ns;
    wait;
end process;
end tb;
