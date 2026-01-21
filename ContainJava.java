import java.util.Scanner;
public class ContainJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        if(str.contains("Java")){
            System.out.println("The String contains Java");
        }
        else{
            System.out.println("The String does not contain Java");
        }
        sc.close();
    }
    
}
