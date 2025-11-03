// // // // // import java.util.Scanner;

// // // // // public class Two_D_userInput {
// // // // //     public static void main(String args[]) {
// // // // //         Scanner sc = new Scanner(System.in);

// // // // //         System.out.print("Enter number of rows: ");
// // // // //         int rows = sc.nextInt();

// // // // //         System.out.print("Enter number of columns: ");
// // // // //         int cols = sc.nextInt();

// // // // //         int[][] arr = new int[rows][cols];
// // // // //         System.out.println("Enter the elements of the array:");

// // // // //         for (int i = 0; i < rows; i++) {
// // // // //             for (int j = 0; j < cols; j++) {
// // // // //                 System.out.print("Element at [" + i + "][" + j + "]: ");
// // // // //                  arr[i][j] = sc.nextInt();
// // // // //             }
// // // // //         }
// // // // //         // Step 4: Display the array
// // // // //         System.out.println("\nThe 2D array is:");

// // // // //         for (int i = 0; i < rows; i++) {
// // // // //             for (int j = 0; j < cols; j++) {
// // // // //                 System.out.print(arr[i][j] + " ");
// // // // //             }
// // // // //             System.out.println();
// // // // //         }
// // // // //     }
// // // // // }

// // // // import java.util.Scanner;

// // // // public class Two_D_userInput {

// // // //     public static void main(String[] args) {
// // // //         Scanner sc = new Scanner(System.in);

// // // //         System.out.print("Enter Number of Rows:");
// // // //         int rows = sc.nextInt();

// // // //         System.out.print("Enter Number of Cols:");
// // // //         int cols = sc.nextInt();

// // // //         int arr[][] = new int[rows][cols];

// // // //         System.out.println("Enter Array of element:");
// // // //         for (int i = 0; i < rows; i++) {
// // // //             for (int j = 0; j < cols; j++) {
// // // //                 System.out.print("Element at [" + i + "][" + j + "]: ");
// // // //                 arr[i][j] = sc.nextInt();
// // // //             }
// // // //         }

// // // //         for (int i = 0; i < rows; i++) {
// // // //             for (int j = 0; j < cols; j++) {
// // // //                 System.out.print(arr[i][j] + " ");
// // // //             }
// // // //             System.out.println();
// // // //         }
// // // //         sc.close();
// // // //     }
// // // // }

// // // import java.util.Scanner;

// // // public class Two_D_userInput {

// // //     public static void main(String[] args){
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.print("Enter Array length:");
// // //         int x = sc.nextInt();

// // //         int arr[] = new int[x];

// // //         for(int i=0;i<arr.length;i++){
// // //             System.out.print("Element at [" + i + "]:");
// // //             arr[i]=sc.nextInt();
// // //         }
// // //         System.out.println("Elements here");
// // //         for(int i=0;i<arr.length;i++){
// // //             System.out.print(arr[i]+" ");
// // //         }

// // //     }
// // // }

// // import java.util.Scanner;

// // public class Two_D_userInput {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter number of rows:");
// //         int rows = sc.nextInt();

// //         System.out.print("Enter number of cols:");
// //         int cols = sc.nextInt();

// //        sc.nextLine();
// //         String arr[][] = new String[rows][cols];

// //         System.out.println("Enter the elements of the array:");
// //         for (int i = 0; i < rows; i++) {
// //             for (int j = 0; j < cols; j++) {
// //                 System.out.print("Element at [" + i + "][" + j + "]: ");
// //                 arr[i][j] = sc.nextLine();
// //             }
// //         }

// //         System.out.println("\nThe 2D array is:");

// //         for (int i = 0; i < rows; i++) {
// //             for (int j = 0; j < cols; j++) {
// //                 System.out.print(arr[i][j] + " ");
// //             }
// //             System.out.println();
// //         }

// //     }
// // }

// import java.util.Scanner;

// public class Two_D_userInput {

//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);

//         System.out.print("Enter Number of Rows:");
//         int rows = sc.nextInt();

//         System.out.print("Enter Number of Cols:");
//         int cols = sc.nextInt();
//         sc.nextLine();
        
//         String array[][] = new String[rows][cols];

//         System.out.println("Enter element of array:");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                  System.out.print("Element at [" + i + "][" + j + "]: ");
//                 array[i][j]=sc.nextLine();
//             }
//         }
//         System.out.println("Arrays Element Print Here");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
                 
//                 System.out.print(array[i][j]+" ");
//             }
//             System.out.println();
//         }
        

//         sc.close();
//     }
// }
import java.util.Scanner;
public class Two_D_userInput {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of rows:");
        int rows = sc.nextInt();

        System.out.print("Enter Number of cols:");
        int cols = sc.nextInt();

        int array[][] = new int[rows][cols];
        
        System.out.println("Please enter Element of array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Element of ["+i +"]+["+j+"]:");
                array[i][j]=sc.nextInt();
            }
        }
        
         System.out.println("Element of array Print Here:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+" ");
                
            }
            System.out.println();
        }

        
    }
}