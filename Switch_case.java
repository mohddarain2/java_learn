import java.util.Scanner;

public class Switch_case {
   
    public static void main(String[] agrs){
       
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        switch(age){
            case 10: 
            System.out.println("User age is 10");
            break;
            case 20 :
            System.out.println("User Age is 20");
            break;
            case 30 : 
            System.out.println("User Age is 30");
            break;
            default:System.out.println("Age Not matched");
        }
        scan.close();
    }
}
