public class Anonymous_Array {
    //  "An anonymous array means an array without a name.
    //You create it and use it immediately, usually when you need it only once — like passing it to a method.
    //“When you need an array only one time, you don’t give it a name.”"

    public static void main(String[] args) {
        // 👇 Anonymous array — no name
        printArray(new int[] {10, 20, 30, 40});
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
