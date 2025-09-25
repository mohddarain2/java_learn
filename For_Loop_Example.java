import java.util.Scanner;

public class For_Loop_Example{
    public static void main(String[] agrs){
        // System.out.println("loop");
        // for(int i=1;i<=10;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.println(j);
        //     }
        // }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n = sc.nextInt();

        for(int i=1;i<=n;i++ ){
            // for(int j=1;j<=m;j++){
                // }
            System.out.println(i);
        }
    }
}