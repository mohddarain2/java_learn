public class Nestedifelse {
    public static void main(String[] args) {
        System.out.println("Nested_If_Else");
        int age = 18;
        String gender = "Female";
        if (age >= 18) {
            System.out.println("You are eligible");
            if (gender != "Female") {
                System.out.println("You are invited");
            } else {
                System.out.println("You are not invitted");
            }
        } else {
            System.out.println("You are not eligible");
        }
    }
}
