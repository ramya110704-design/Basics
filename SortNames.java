import java.util.Scanner;
import java.util.Arrays;
public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names?: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter name:"+(i+1)+":");
            names[i] = sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Names in Alphabetical order: ");
        for(String name:names){
            System.out.println(name);
        }

    }
    
}
