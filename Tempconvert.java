import java.util.Scanner;
public class Tempconvert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f =(c* 9/5)+32;
        System.out.println("Fahrenheit: "+f);
        sc.close();
    }
    
}
