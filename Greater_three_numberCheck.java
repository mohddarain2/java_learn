public class Greater_three_numberCheck {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 15;

        // if (a>b && a>c) {
        // System.out.println("a is greater");
        // }else if(b>a && b>c){
        // System.out.println("b is greater");
        // }else{
        // System.out.println("c is greater");
        // }
System.out.println("Darain");
        if (a > b) {
            if (a > c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is greater");
            }
        } else if (b > c) {
            System.out.println("b id greater");
        }else{
            System.out.println("c is greater");
        }
    }
}
