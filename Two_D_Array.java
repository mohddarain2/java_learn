public class Two_D_Array {
    public static void main(String[] args){
        int a[][] = {{10,20,30,40},{50,60,70},{80,90}};
        // System.out.println(a);
        // System.out.println(a[0]);
        // System.out.println(a[0][0]);
        // System.out.println(a.length);
        // System.out.println(a[0].length);


        // System.out.println(a[0][0].length); //  error: int cannot be dereferenced
 
        // for(int i=0;i<a.length;i++){                  // 0 0<3                              
        //     for(int j=0;j<a[i].length;j++){             // 0 0<4   1 1<4  2  2<4  3 3<4
        //         System.out.print(a[i][j]+" ");        // 10       20     30       40
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<3;i++){
            for(int k=0;k<a[i].length;k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
    }
}
