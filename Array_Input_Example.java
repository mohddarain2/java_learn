// // // // import java.util.Scanner;

// // // // public class Array_Input_Example {
// // // //     public static void main(String[] args){
// // // //         System.out.println("Please enter total ELement of Array");
// // // //         Scanner sc = new Scanner(System.in);
// // // //         int x = sc.nextInt();

// // // //        int inputArr[] = new int[x];
// // // //        System.out.println(("Please enter Array Element Values"));
// // // //        for(int i=0;i<x;i++){
// // // //             inputArr[i] = sc.nextInt();    
// // // //        }
// // // //        System.out.println("Array Elements are print here");
// // // //        for(int i=0;i<x;i++){
// // // //         System.out.println(inputArr[i]);
// // // //        }
// // // //     }
// // // // }

// // // import java.util.Scanner;

// // // public class Array_Input_Example {

// // //     public static void main(String[] args){
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.println("Enter Input value");
// // //         int input = sc.nextInt();
// // //         int Array_input[]= new int[input];
// // //         System.out.println("Array value enter pls");
// // //         for(int i=0;i<input;i++){
// // //             Array_input[i]=sc.nextInt();
// // //         }
// // //         System.out.println("array value is here");
// // //         for(int i=0;i<input;i++){
// // //             System.out.println(Array_input[i]);
// // //         }
        
        
// // //     }
// // // }

// // import java.util.Scanner;

// // public class Array_Input_Example {

// //     public static void main(String[] args)
// //     {
// //         System.out.println("Enter Value");
// //         Scanner sc = new Scanner(System.in);
// //         int value = sc.nextInt();
// //         System.out.println("Arrays Values enter");
// //         int array_Value [] = new int[value];
// //         for(int i=0;i<value;i++){
// //             array_Value[i]=sc.nextInt();
// //         }
// //         System.out.println("Arrays values here");
// //         for(int i=0;i<value;i++){
// //             System.out.println(array_Value[i]);
// //         }

// //     }
// // }

// import java.util.Scanner;

// public class Array_Input_Example {

//     public static void main(String[] agrs){
//         System.out.println("Enter Values");
//         Scanner sc = new Scanner(System.in);
//         int input_number = sc.nextInt();

//         System.out.println("Arrays Values Pls enter");
//         int arrays[] =new int [input_number];
//         for(int i=0;i<input_number;i++){
//             arrays[i]=sc.nextInt();

//         }
//         System.out.println("Arrays valuues Enter");
//         for(int i=0;i<input_number;i++){
//             System.out.println(arrays[i]);
//         }
//     }
// }

import java.util.Scanner;

public class Array_Input_Example {

    public static void main(String[] args){
        System.out.println("Enter number");;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter arrays please");
        int arrays_value[] = new int[number];
        for(int i=0;i<number;i++){
            arrays_value[i]=sc.nextInt();
        }
        System.out.println("Arrays Here");
        for(int i=0; i<number;i++){
            System.out.println(arrays_value[i]);
        }
        sc.close();
    }
}