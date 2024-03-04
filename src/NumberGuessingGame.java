import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Rules ");
        System.out.println("1. You have 3 attempts.");
        System.out.println("2. If you mastered in 1st attempt, you have 100 points.Else, you have 50 points.");


        int totalScore=0;
        boolean playAgain;
        do {
            playAgain = false;
            for (int round = 1; round <= 3; round++) {
                Random random = new Random();
                int number = random.nextInt(100) + 1;
                int maxAttempt = 3;
                int attempt = 0;
                int score;

                System.out.println("Round " + round);
                while (true) {
                    System.out.println("Enter number between 1-100.");


                    int guessNumber = sc.nextInt();
                    attempt++;
                    if (attempt == 1) {
                        score = 100;

                    } else {
                        score = 50;
                    }

                    int leftAttempt = maxAttempt - attempt;
                    if (guessNumber == number) {
                        System.out.println("Excellent!" + " You mastered it in " + attempt + " attempt. ");
                        System.out.println("You  scored " + score + " points. ");
                        totalScore += score;
                        break;
                    } else if (guessNumber > number) {
                        System.out.println(guessNumber + " is greater than my number. " + " Try again! ");
                        System.out.println("You have " + leftAttempt + " attempts left.");
                    } else {
                        System.out.println(guessNumber + " is smaller than my number. " + " Try again! ");
                        System.out.println(" You have " + leftAttempt + " attempts left. ");
                    }
                    if (leftAttempt == 0) {
                        System.out.println("You missed it." + " My number is " + number);
                        System.out.println(" Your score is 0.");
                        break;
                    }

                }
                System.out.println(" Do you want to play again? (yes/no) ");
                String playAgainInput = sc.next();
                if (playAgainInput.equalsIgnoreCase("yes")) {
                    playAgain = true;
                }

            }
        }while(playAgain);
        System.out.println(" Game Over! ");
        System.out.println(" Your Total Score is " + totalScore);
        long totalTime = System.currentTimeMillis();
        System.out.println("You finished this game in " + totalTime + " ms ");

    }
}
