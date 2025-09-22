public class PrintVsReturn {

    public static void main(String[] args){
        System.out.println("Hello");
//      Purpose: Used to display (print) text/data on the console.

        int data =getData();
        System.out.println(data);

        String Name = getName();
        System.out.println(Name);
    }

    public static String getName(){
        return "Mohammad Darain";

        //It does not print anything on the screen.
        //Purpose: Used inside a method to send a value (or end execution) back to the caller.
    }

    public static int getData(){
        return 20+1;
    }
}