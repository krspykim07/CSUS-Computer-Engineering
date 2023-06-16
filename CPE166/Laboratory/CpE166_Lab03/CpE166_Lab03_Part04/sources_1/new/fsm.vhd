-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- Finite State Machine
-- fsm.vhd

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity fsm is
Port (reset, start, stop, clk: in std_logic;
      en: out std_logic;
      ckcs, ckns: out std_logic_vector (1 downto 0));
end fsm;

architecture Behavioral of fsm is
constant S0: std_logic_vector(1 downto 0) := "00";
constant S1: std_logic_vector(1 downto 0) := "01";
signal cs, ns: std_logic_vector(1 downto 0);

begin
    ckcs <= cs;
    ckns <= ns;
process(reset, clk)
begin
    if(reset = '1') then cs <= S0;
    elsif(rising_edge(clk)) then cs <= ns;
    end if;
end process;

process(cs, start, stop)
begin
    case (cs) is
        when S0 => if (start = '1') then ns <= S1;
                   elsif(stop = '1') then ns <= S0;
                   end if;
        when S1 => if(stop = '1') then ns <= S0;
                   else ns <= S1;
                   end if;
        when others => ns <= S0;
    end case;
end process;
en <= '1' when (cs = S1) else '0';
end Behavioral;
