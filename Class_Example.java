public class Class_Example {
   

    public static void main(String[] agrs) {
        User u1 = new User();
        // User u2 = new User();
        u1.name="first";
        u1.getData();
        System.out.println("Class_example");
    }

   
}

class User {
    public int age = 10;
    public String name = "Darain";

       void getData() {
        System.out.println("get_Data");
        System.out.println(name);
    }
}
