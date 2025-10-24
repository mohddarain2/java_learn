// import java.util.Scanner;

// public class Array_input_string_example {
//     public static void main(String[] args) {
//         System.out.println("Enter Number");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
        
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter Names");
       
//         String array[] = new String[number];
//         for(int i=0;i<number;i++){ // 0
//             array[i]=scan.nextLine();
//         }
//         System.out.println("Arrays here");

//         for(int i=0;i<number;i++){
//             System.out.println(array[i]);
//         }
//     }

// }

import java.util.Scanner;

public class Array_input_string_example {

    public static void main(String args[]){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Arrays ");
        String name[] = new String[x];
        
        for(int i=0;i<x;i++){
            name[i]=scan.nextLine();
        }
        System.out.println("Arrays Here");
        for(int i=0;i<x;i++){
            System.out.println(name[i]);
        }
    }
}