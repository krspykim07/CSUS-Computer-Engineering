-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 03
-- ASM Chart
-- chart.vhd

Library ieee;
Use ieee.std_logic_1164.all;

entity chart is
port ( reset, clk, x: in std_logic;
    y, z: out std_logic_vector(1 downto 0);
    ckcs, ckns: out std_logic_vector(1 downto 0));
end chart;

architecture beh of chart is
constant S0: std_logic_vector(1 downto 0) := "00";
constant S1: std_logic_vector(1 downto 0) := "01";
constant S2: std_logic_vector(1 downto 0) := "10";
constant S3: std_logic_vector(1 downto 0) := "11";
signal cs, ns: std_logic_vector (1 downto 0);
begin
ckcs <= cs;
ckns <= ns;

process(reset, clk)
begin
    If ( reset = '1') then
        cs <= S0;
    elsif (rising_edge(clk)) then
        cs <= ns;
    end if;
end process;

process(cs, x)
begin
case (cs) is
    when S0 => if (x='1') then
        ns <= S1;
        else
        ns <= S0;
        end if;
    when S1 => if (x='1') then
        ns <= S1;
        else
        ns <= S2;
        end if;
    when S2 => if (x= '1') then
        ns <= S1;
        else
        ns <= S3;
        end if;
    when S3 => ns <= S0;
    when others=> ns <= S0;
end case;
end process;

y(0) <= '1' when ((cs=S2) or (cs=S3)) else '0';
y(1) <= '1' when (cs=S1) else '0';
z(0) <= '1' when ((cs=S1) and (x= '1')) else '0';
z(1) <= '1' when ((cs=S2) and (x='1')) else '0';
end beh;