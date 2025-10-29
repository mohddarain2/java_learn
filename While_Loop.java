import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int data = 0;
        
        while (data <Num) { // 0<=20
            data++; // 1 
            if(data%2==0){ // 1%2==0

                System.out.println(data); 
            }
        }
       //System.out.println(Num + " This value is large ");
    }
}
