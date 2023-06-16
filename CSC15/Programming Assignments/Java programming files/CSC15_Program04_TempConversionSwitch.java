import java.util.Scanner;

public class TempConversionSwitch
{
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        run(kb);
    }

    public static void run (Scanner kb)
    {
        System.out.print("Please input the tempurature unit: ");
        String symbol = kb.next();
        System.out.print("Please input the nmuber: ");
        double number = kb.nextDouble();
        convert(symbol,number);
    }

    public static void convert(String unit, double number)
    {
        switch(unit)
        {
            case "C": case "c":
            {
                double temp =number/5*9+32;
                System.out.println("The Fahrenheit value of the given temperature is " + temp + unit);
                break;
            }
            case "F": case "f":
            {
                double temp =(number-32)/9*5;
                System.out.println("The Celsius value of the given temperature is " + temp + unit);
                break;
            }
            default:
            {
                System.out.println("Error: unit must be in F,f,C,c!\n");
                break;
            }
        }
    }
}