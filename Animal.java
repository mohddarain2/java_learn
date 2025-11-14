public class Animal {
    public static void main(String[] args) {
        System.out.println("1");
        Animal buzo = new Animal();
        buzo.run();
        Animal caty = new Animal();
        caty.eat();

        Birds sp = new Birds();
        sp.fly();
    }

    public void eat() {
        System.out.println("eat");
    }

    public void run() {
        System.out.println("run");
    }

}

class Birds{
    void fly(){
        System.out.println("Flying");
    }
}