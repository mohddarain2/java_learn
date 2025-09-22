public class FunctionParams {

    public static void main(String[]args){
        System.out.println("Functions_Parameters || functions_Arguments");
        int user1Age = 20;
        int user2Age = 50;
        getAgeInDays(user1Age);
        // FunctionParams Fun = new FunctionParams();
        // Fun.getAgeInDays(user1Age);

         getAgeInDays(user2Age);
         
         int amount = 1000;
         int time = 1;
         int rate = 10;
         calculateInterestRate(amount, time, rate);

    }
    public static void getAgeInDays(int age){
        // System.out.println("Here you will find user age");
        System.out.println(age*365);
    }
    public static void calculateInterestRate(int amount, int time, int rate){
        System.out.println((amount*time*rate)/100);
    }
}