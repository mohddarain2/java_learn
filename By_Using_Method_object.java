 class Animal{

    // String color;
    // int age ;

    void initObj(String c, int a){
        // color =c;
        // age = a; 
         System.out.println(c+" "+a);
    }

    // void display(){
    //     System.out.println(color+" "+age);
    // }
    public static void main(String[] args){
        Animal buzo = new Animal();
        buzo.initObj("black",12);
        // buzo.display();
    }
    
}