import java.util.Scanner;
import java.util.Random;
class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1;
        int attempt=1;
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        while(attempt <= 5){
            System.out.println("Attempt " +attempt);
            System.out.println("Enter your Guess: ");
            int guessedNumber= sc.nextInt();
            if(guessedNumber!=randomNumber){
                if(guessedNumber > 0 && guessedNumber<=100){
                    if(guessedNumber < randomNumber){
                        System.out.println("Too Low");
                    }
                    else if(guessedNumber > randomNumber){
                        System.out.println("Too High");
                    }
                }
                else{
                    System.out.println("Please enter a number between 1 and 100.");
                }
                
                attempt++;
            }
            else {
                System.out.println("Correct");
                System.out.println("You guessed the number in " +attempt +" attempts");
                break;
            }

        }
        

        if(attempt>5){
            System.out.println("Sorry! You have used all attempts.");
            System.out.println("The correct number was : "+randomNumber);
        }
        sc.close();

    }
}