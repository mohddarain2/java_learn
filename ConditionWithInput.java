import java.util.Scanner;

public class ConditionWithInput{
    public static void main(String[] args){
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Welcome to the club");
        }else {
            System.out.println("you are not allowed");
        }
        sc.close();
    }
    
}