import java.util.Scanner;
import java.util.Random;
public class Task_1{
    public static int MIN_RANGE = 1;
    public static int MAX_RANGE = 100;
    public static int MAX_ATTEMPTS = 10;
    public static int ROUNDS = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int Total_Score = 0;
        System.out.println("********NUMBER GAME********");
        System.out.printf("You can Play %d Rounds in one time \n" , ROUNDS);
        System.out.printf("you have maximum %d attempts in one Round \n\n" , MAX_ATTEMPTS);
        for(int i=1 ; i<=ROUNDS ; i++){
            int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts = 0;
            System.out.printf("Round %d begins\n\n" , i);
            while(attempts<MAX_ATTEMPTS){
                attempts = attempts+1;
                System.out.print("Enter the Guess(1 to 100): ");
                int number_guessed_by_user = sc.nextInt();
                if(number_guessed_by_user==number){
                    int score = MAX_ATTEMPTS-attempts;
                    Total_Score += score;
                    System.out.printf("Number Guessed Successfully ! In the %d attempts. \nScore of the round %d = %d\n\n\n", attempts , i , score);
                    break;
                }
                else if(number_guessed_by_user < number){
                    System.out.printf("The number you have guessed is less than the random number.\nEnter greater number. \nTotal attempts left = %d\n\n" ,MAX_ATTEMPTS-attempts);
                } 
                else if(number_guessed_by_user > number){
                    System.out.printf("The number you have guessed is greater than the random number.\n Enter lesser number. \nTotal attempts left = %d\n\n" ,MAX_ATTEMPTS-attempts);
                }

                if(attempts == MAX_ATTEMPTS){
                System.out.printf("You could not guess the correct number in the maximum attempts. \nThe correct number = %d\n" , number);
            }
            }
            
        }

        System.out.printf("\nTotal Score of the Three Rounds = %d",Total_Score);
        sc.close();
    } 
}