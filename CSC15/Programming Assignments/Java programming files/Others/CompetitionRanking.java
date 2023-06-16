import java.util.Scanner;

public class CompetitionRanking
{
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        description();
        competition(kb);
    }

    //outputs the description of the program
    public static void description()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Competitive Ranking");
        System.out.println("This program determines the user's ranking input");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    //inputs the rank and outputs what place the user is
    public static void competition(Scanner kb)
    {
        System.out.print("How many tries you want to input: ");
        int tries = kb.nextInt();

        for (int i = 1; i <= tries; i++)
        {
            System.out.print("\nPlease input what place you got in the competition: ");
            int rank = kb.nextInt();

            System.out.println("\n\t\t++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("\t\t\t" + ranking(rank));
            System.out.println("\t\t++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

    //converts the rank input to corresponding place
    public static String ranking(int rank)
    {
        switch(rank){
            case 1: return "Congrats! You won Gold medal!";
            case 2: return "Congrats! You won Silver medal!";
            case 3: return "Congrats! You won Bronze medal!";
            default:
            {
                if (rank > 3)       //condition where the user inputs the rank > 3
                    return "\tYou got " + rank + "th place!";
                else if( rank == 0)     //condition where the user inputs the rank 0
                    return "Sorry, you didn't got to the rankings.";
                else        //condition where the user inputs a wrong value
                    return "Invalid ranking input!";
            }
        }
    }

}