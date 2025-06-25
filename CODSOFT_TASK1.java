//Number Game
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        try(Scanner scanner = new Scanner(System.in)){
        Random ran = new Random();
        boolean playagain = true;
        int totalrounds = 0;
        int totalscore = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playagain)
        {
            int numbertoguess = ran.nextInt(100) + 1; 
            int maxattempts = 7;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("\n New Round Started! Guess a number between 1 and 100.");
            System.out.println("You have " + maxattempts + " attempts.");
            while (attempts < maxattempts) 
            {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess < numbertoguess) 
                {
                    System.out.println("Too Low :(");
                } 
                else if (guess > numbertoguess) 
                {
                    System.out.println("Too High :(");
                } 
                else
                {
                    System.out.println("Correct guess :)!! You got it in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    totalscore += (maxattempts - attempts + 1);
                    break;
                }
            }
            if (!guessedCorrectly)
            {
                System.out.println("you have used all attempts! The correct number was " + numbertoguess + ".");
            }
            totalrounds++;
            System.out.print("\n🔁 Do you want to play another round? (yes/no): ");
            scanner.nextLine(); 
            String response = scanner.nextLine().toLowerCase();
            playagain = response.equals("yes");
        }
        System.out.println("\n Game Over!");
        System.out.println("Total Rounds Played: " + totalrounds);
        System.out.println("Total Score: " + totalscore);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
}
