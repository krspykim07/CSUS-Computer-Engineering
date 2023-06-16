/* This program lets the user to input a value in feet and outputs the equivalent value in inches */

import java.util.Scanner;

public class FtToInch {
    public static final int CONSTANT = 12;
    public static void main (String[] args) {
        Scanner kb = new Scanner(System.in);
        description();
        run(kb);
    }

    /* This method runs the input and output of the conversion for this program */
    public static void run (Scanner kb) {
        double feet, inch;
        for (int i = 1; i <= 5; i++){
            System.out.print("INPUT #" + i + ": Please input feet --> ");
            feet = kb.nextDouble();
            inch = convert(feet);
            System.out.println ("\n\t"+ feet + " ft is equivalent to " + inch + " inches\n");
        }
    }

    /* This method outputs the description of this program */
    public static void description (){
        System.out.println (" ===== CONVERSION PROGRAM ====");
        System.out.println (" You're required to input a value in feet and the program will output in inches.");
    }

    /* This method do the conversion for this program */
    public static double convert (double feet){
        return (CONSTANT * feet);
    }
}