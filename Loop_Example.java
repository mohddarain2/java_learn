public class Loop_Example {
    public static void main(String[] agrs){
        //System.out.println("Loops_Example");
        int table = 5;
        // for(int i=1;i<=10;i++){
        //     System.out.println(table+" * "+i+" = " +i*table);
        // }

        for(int i=1;i<=10;i++){
            int a = i*table;  // 5 // 10 // 15 // 20 //------
            if(a%10==0){  // 5%10 // 10%10 //  15%10 // 20%10 //----

                System.out.println(a);//  10 //20 // 30 // 40 // 50
            }
        }
    }
}
