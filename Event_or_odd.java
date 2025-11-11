public class Event_or_odd {
    public static void main(String [] args){
        int number = 30;
        if(number%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}

// -------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class Event_or_odd {

//     public static void main(String[] args) {
//         System.out.print("Pls Enter of row count: ");

//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();

//         System.out.print("Pls Enter of cols count: ");
//         int cols = sc.nextInt();

//         String array[][] = new String[rows][cols];
//         System.out.println("Enter array Element:");

//         sc.nextLine();
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {

//                 System.out.print("Element of [" + i + "]+[" + j + "]:");
//                 array[i][j] = sc.nextLine();
//             }
            
//         }
//         System.out.println("Element of array Print Here:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {

//                 System.out.print(array[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
// }

// import java.util.Scanner;

// public class Event_or_odd {

//     public static void main(String[] args){
//         System.out.print("Please enter number of rows:");
        
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         System.out.print("Please enter number of cols:");
//         int cols = sc.nextInt();

//         int array [][] = new int[rows][cols];
//         System.out.println("Arrays Element are here:");
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print("Element is [" + i+"]["+j+"]:");
//                 array[i][j]=sc.nextInt();
//             }
//             // System.out.println();
//         }

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
                
//                 System.out.print(array[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }