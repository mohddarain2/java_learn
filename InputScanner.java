import java.util.Scanner;
public class InputScanner {
    public static void main(String[] args) {
        // System.out.println("Please enter any number");100
        // Scanner sc= new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println("You enter value is ");
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String str = sc.nextLine();
        System.out.println("Please enter your age ");
        int age = sc.nextInt();
        System.out.println("Please enter your Salary ");
        Float salary = sc.nextFloat();

        System.out.println("That  is Your name " + str);

        System.out.println("That  is Your age " + age);

        System.out.println("That  is Your Salary " + salary);
sc.close();
    }
}
