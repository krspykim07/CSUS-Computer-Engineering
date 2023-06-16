-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- Stopwatch
-- stopwatch.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity stopwatch is
Port (start, stop, clk, reset: in std_logic;
      Y0, Y1, Y2: out std_logic_vector(3 downto 0));
end stopwatch;

architecture Behavioral of stopwatch is
signal clk2: std_logic;
signal enable: std_logic;

component clkdiv
port(clkin: in std_logic;
     clkout: out std_logic);
end component;

component fsm
port(reset, start, stop, clk: in std_logic;
     en: out std_logic);
end component;

component watch
port(reset, en, clk: in std_logic;
     Y0, Y1, Y2: out std_logic_vector(3 downto 0));
end component;

begin
    g1: clkdiv port map (clk, clk2);
    g2: fsm port map (reset, start, stop, clk, enable);
    g3: watch port map (reset, enable, clk, Y0, Y1, Y2);
end Behavioral;
