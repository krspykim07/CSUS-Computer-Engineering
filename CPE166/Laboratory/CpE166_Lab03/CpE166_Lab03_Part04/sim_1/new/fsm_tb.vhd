-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- Finite State Machine
-- fsm.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity fsm_tb is
end fsm_tb;

architecture testbench of fsm_tb is
component fsm
port(reset, start, stop, clk: in std_logic;
     en: out std_logic;
     ckcs, ckns: out std_logic_vector(1 downto 0));
end component;

signal reset, clk, start, stop, en: std_logic;
signal ckcs, ckns: std_logic_vector(1 downto 0);
begin
DUT: fsm port map(reset, start, stop, clk, en, ckcs, ckns);
process
begin
    clk <= '0'; wait for 5 ns;
    clk <= '1'; wait for 5 ns;
end process;

start <= '0', '1' after 50 ns, '0' after 100 ns, '1' after 160 ns;
stop <= '0', '1' after 20 ns, '0' after 40 ns, '1' after 120 ns, 
        '0' after 150 ns;

process
begin
    reset <= '1'; wait for 2 ns;
    reset <= '0'; wait for 400 ns;
    wait;
end process;
end testbench;
