public class Object_Example {
    public static void main(String[] args) {
        System.out.println("Object_Example");
        Student s1 = new Student();
        // String name= s1.getName();
        System.out.println(s1.getName());
        s1.displayName();
        System.out.println(s1.defaultAge);

        Teacher t1 = new Teacher();
        String T_Name = "Peter";
        t1.displayName(T_Name);
    }
}

class Student {
    int defaultAge = 25;

    String getName() {
        return "Mohammad Darain";
    }

    void displayName() {
        System.out.println("Display_function");
    }
}

class Teacher {
    void displayName(String Teacher_Name) {
        System.out.println(Teacher_Name);
    }
}