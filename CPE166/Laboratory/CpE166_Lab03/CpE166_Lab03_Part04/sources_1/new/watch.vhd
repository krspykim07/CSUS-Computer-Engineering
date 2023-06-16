-- Vigomar Kim Algador
-- CpE166 Section 03
-- Laboratory 03 Part 04
-- watch
-- watch.vhd

Library ieee; 
Use  ieee.std_logic_1164.all; 
use ieee.std_logic_unsigned.all; 
use ieee.std_logic_arith.all; 

entity watch is 
port(reset, en, clk: in std_logic; 
     Y0, Y1, Y2: out std_logic_vector(3 downto 0)); 
end watch;
 
architecture arch2 of watch is 
signal  cnt0:  std_logic_vector (3 downto 0) := "0000";
signal  cnt1:  std_logic_vector (3 downto 0) := "0000"; 
signal  cnt2:  std_logic_vector (3 downto 0) := "0000"; 
begin 

process(clk) 
begin
    if (reset = '1') then
        cnt0 <= "0000";
        cnt1 <= "0000";
        cnt2 <= "0000";
    end if;
    if (rising_edge(clk) and en='1') then 
        if ( cnt0 = "1001")  then 
            cnt1 <= cnt1 + 1;
            cnt0 <= "0000";
            if (cnt1 = "1001") then
                cnt2 <= cnt2 + 1;
                cnt1 <= "0000";
                if (cnt2 = "1001" and cnt1 = "1001" and cnt0 = "1001") then
                    cnt0 <= "0000";
                    cnt1 <= "0000";
                    cnt2 <= "0000";            
                end if;
            end if;
        else
            cnt0 <= cnt0 + 1;
        end if;
end if;
end process; 

y0 <= cnt0;
y1 <= cnt1;
y2 <= cnt2;
end arch2;
