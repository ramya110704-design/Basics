import java.util.Scanner;
import java.util.Random;
public class GuessNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int num = ran.nextInt(100) + 1;
        int guess,count = 0;
        do{
            System.out.println("Guess the number: ");
            guess = sc.nextInt();
            count++;
            if(guess > num){
                System.out.println("Too high");
            }
            else if(guess < num){
                System.out.println("Too low");
            }
            else{
                System.out.println("Correct Attempts: "+ count);
            }
        } while(guess != num);
    }
    
}
