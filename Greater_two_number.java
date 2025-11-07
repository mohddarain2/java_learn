import java.util.Scanner;

public class Greater_two_number {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of first value:");

        int a = sc.nextInt();
         System.out.print("Enter number of Second value:");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is Greater ");
        }else{
            System.out.println("b is smaller");
        }
    }
}
