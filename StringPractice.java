public class StringPractice {
    public static void main(String[] ars){
        String str = "Hello How are you";

        System.out.println(str);
        System.out.println(str.length());

        System.out.println(str.substring(3));
        System.err.println(str.substring(6, 10));

        System.out.println(str.replace("Hello","Hi"));

        String str1= " ";
        System.out.println(str1.isEmpty());

        char[] charArray = {'D','A','R','A','I','N'};
        System.out.println(new String(charArray));
        System.out.println(String.valueOf(charArray));
    }
}
