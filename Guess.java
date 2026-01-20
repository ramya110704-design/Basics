import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args){
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int num = ran.nextInt(10)+1;
        int guess,count=0;
        do{
            System.out.println("Guess the number (1-10): ");
            guess = sc.nextInt();
            count++;
            if(guess > num){
                System.out.println("Too high");
            }
            else if(guess < num){
                System.out.println("Too low");
            }
            else{
                System.out.println("Correct Attempts: "+count);
            }
        } while(guess != num);
    }
    
}
