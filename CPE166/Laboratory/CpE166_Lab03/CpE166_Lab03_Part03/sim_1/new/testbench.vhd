-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 03
-- ASM Chart testbench
-- testbech.vhd

library IEEE;
use IEEE.std_logic_1164.all;

entity testbench is
end testbench;

architecture tb of testbench is
component chart
port ( reset, clk, x: in std_logic;
y, z: out std_logic_vector(1 downto 0);
ckcs, ckns: out std_logic_vector(1 downto 0));
end component;

signal reset, clk, x: std_logic;
signal y, z: std_logic_vector (1 downto 0);
signal ckcs, ckns: std_logic_vector (1 downto 0);

begin
DUT: chart port map(reset, clk, x, y(1 downto 0), z(1 downto 0), ckcs, ckns);

process
begin
clk <= '0';
Wait for 5 ns;
clk <= '1';
Wait for 5 ns;
end process;

x <= '1', '0' after 10 ns, '1' after 40 ns, '0' after 60 ns, '1' after 80ns, '0' after 120 ns, 
     '1' after 160 ns, '0' after 200 ns, '1' after 300 ns, '0' after 350 ns;

process
begin
reset <= '1';
Wait for 2 ns;
reset <= '0';
Wait for 400 ns;
Wait;
end process;
end tb;