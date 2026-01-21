import java.util.Scanner;
public class numrange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num >= 1 && num <=50){
            System.out.println("The number is in the lower half");
        }
        else if(num >= 51 && num <= 100){
            System.out.println("The number is in the upper half");
        }
        else{
            System.out.println("Invalid numbers");
        }
        sc.close();
    }
    
}
