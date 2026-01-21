import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            System.out.println("Enter the number "+i+":");
            sum += sc.nextInt();
        }
        double avg = (double)sum/n;
        System.out.println("Average:"+ avg);
        sc.close();
    }
}
