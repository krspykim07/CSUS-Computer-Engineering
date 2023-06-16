import java.util.*;

public class Test {
    public static void main (String[] args) {

        int[] num = {2,4,6,8,10};

        for(int i = 0; i < 4; i++){
            num[i] = num[i] + num[i+1] + 2;
            num[i+1] = num[i] - 1;
        }
        System.out.println(Arrays.toString(num));
    }

    public static double gas (double price, double gallons){
        double totalCost = price * gallons;
        return totalCost;
    }
}