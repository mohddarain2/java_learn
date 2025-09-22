public class PrintVsReturn {

    public static void main(String[] args){
        System.out.println("Hello");
        int data =getData();
        System.out.println(data);

        String Name = getName();
        System.out.println(Name);
    }

    public static String getName(){
        return "Mohammad Darain";
    }

    public static int getData(){
        return 20+1;
    }
}