import java.util.*;

public class FinalExamStudy {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
        
/* QUESTION 01
        Write a method to display the following on the screen, 
        the quotation marks are part of the output, 
        review the escape sequence characters before doing this question.
        here is the output:
        ““hello” \\ almost /done with the Fall 2021//” semester”” */
        /*
        System.out.print("Question 01: ");
        System.out.println("\"\"hello\" \\\\ almost /done with the Fall 2021//\" semester\"\"");
        */
/* QUESTION 02
        Write a method to display the following on the screen without using any System.out.println, 
        just use System.out.print, for a new line just use \n
        ////////\\\\\\\\

             ////////\/\\\\\\\\ */
        /*
        System.out.println("Question 02:");
        System.out.print("////////\\\\\\\\\\\\\\\\\n\n\t////////\\/\\\\\\\\\\\\\\\\\n");
        */
        
/* QUESTION 03
        Write a method called sum that accepts two parameters min and max, 
        this method finds the sum of all the even numbers between the min and max. 
        for example, the call sum (10, 20) should return the sum of 10 + 12 + 14 + 16 + 18 + 20 which is 90 
        and the call sum(15,20) should return the sum of 16 + 18 + 20 which is 54.*/
        
        int q3test1 = question03(10,20);
        int q3test2 = question03(15,20);
        System.out.print("\nQuestion 03: ");
        System.out.println(q3test1 + " " + q3test2);
        
/* QUESTION 04
        Colleges increase the semester tuition by certain percentages. 
        Alex wants to start his school but he wants to know that total cost of his education. 
        Write a program that asks the user for the current tuition per semester, 
        yearly increase rate, number of the years to get the degree. 
        Your program should display the yearly tuition and also the total money needed for the given number of years.  
        Must use a for loop, cumulative sum.  Here is a sample output:
        Enter the current tuition per semester: 3000
        Enter the percent of tuition raise:3.5
        Enter the number of the years you will be at school: 5
        year 1 tuition 6000.0
        year 2 tuition 6210.0
        year 3 tuition 6427.35
        year 4 tuition 6652.307250000001
        year 5 tuition 6885.138003750001
        Total tuition paid for all 5 years is 32174.795253750002 */
        /*
        System.out.println("Question 04:");
        double tuitionSemester;
        double tuitionRate;
        double total = 0;
        int years;
        System.out.print("Enter the current tuition per semester: ");
        tuitionSemester = scan.nextDouble();
        System.out.print("Enter the percent of tuition raise: ");
        tuitionRate = scan.nextDouble();
        System.out.print("Enter the number of the years you will be at school: ");
        years = scan.nextInt();
        System.out.println("year 1 tuition " + tuitionSemester*2);
        total += tuitionSemester*2;

        for(int i = 2; i <= years; i++){
            tuitionSemester  += tuitionSemester*(tuitionRate / 100);
            System.out.println("year " + i + " tuition " + tuitionSemester*2);
            total += tuitionSemester*2;
        }
        System.out.println("Total tuition paid for all " + years + " years is " + total);
        */
/* QUESTION 05
        Write a for loop that is equivalent to the following for loop
        int y = 10;
        while (y > 0)
        {
            y=y-1;
            System.out.println(y);
        } */
        /*
        System.out.println("Question 05:");
        for(int y = 10; y > 0; y-=1)
            System.out.println(y);
        */
/* QUESTION 06
        What would be the largest value printed by the following code  ?    
        int num = 1;
        while(num < 20)
        {
        System.out.println(num/2);
        num = num + 3;
        }  */
        // ANSWER = 9
        /*
        System.out.println("Question 06:");
        int num = 1;
        while(num < 20){
            System.out.print(num/2 + " ");
            num = num + 3;
        }
        */
/* QUESTION 07 
        Write a program to check the weather. Ask the user to enter the temperature. 
        If it is 40 and below display “too cold”. 
        If it is above 40 and below 60 display “cold”, 
        if it is 60 and above and below 75 display “warm”, otherwise display “hot”
        Sample output:
            Enter the temperature: 45
            cold
            Enter the temperature: 55
            cold
            Enter the temperature: 30
            too cold
            Enter the temperature: 66
            warm
            Enter the temperature: 85
            hot
            Enter the temperature: 40
            too cold */
        /*
            System.out.println("\nQuestion 07:");
        System.out.print("Enter the temperature: ");
        int temperature = scan.nextInt();
        if(temperature <= 40)
            System.out.println("too cold");
        else if(temperature > 40 && temperature < 60)
            System.out.println("cold");
        else if(temperature >= 60 && temperature < 75)
            System.out.println("warm");
        else
            System.out.println("hot");
        */
/* QUESTION 08
        Write a while loop to calculate the following sum: 1/2 + 2/3+ 3/4 +…….99/100 */
        /*
        System.out.println("\nQuestion 08:");
        int number = 1;
        int sum = 0;
        while (number < 100){
            System.out.print( number + "/" + (number+1) + " + ");
            sum += number/ (number+1);
            number++;
        }
        System.out.println(" = " + sum);
        */
/* QUESTION 09
        Write a while loop to display all the numbers divisible by 3 that are between 20 - 50.
        Must use a while loop and if statement. Solutions with for loop will get zero credit. */
        /*
        System.out.println("Question 09:");
        int numbering = 20;
        while (numbering < 50){
            if(numbering % 3 == 0){
                System.out.print(numbering + " ");
            }
            numbering++;
        }
        System.out.println();
        */
/* QUESTION 10
        Declare an array of int or double or String with size 10
        */
        /*
        int[] array = new int[10];
        */
/* QUESTION 11
        Declare an array of int or double or String with size 10 */        
        /*
        Random random = new Random();
        int[] array2 = new int[10];
        int min = 200;
        int max = 300;
        for (int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(max-min + 1) + min;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        */
    }

    public static int question03(int min, int max){
        int total = 0;
        
        if(min % 2 != 0){
            min++;
        }
    
        while (min <= max){
            total += min;
            min += 2;
        }
    
        return total;
    }
}


