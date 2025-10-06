public class Array_practice {
    public static void main(String[] args){
        // System.out.println("Array_List");
        int marks[] = new int [5];
        int age[] ={1,2,3,4,5,6,10};
        marks[0]= 10;
        marks[1]= 20;
        marks[2]=30;
        // System.out.println(marks[2]);
        // System.out.println(marks[4]);
        // System.out.println(marks[5]);
        // System.out.println(age[3]);
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }

String skill[] ={"php","java","node","Html"};
        for(int i=0;i<skill.length;i++){  // 0<=3 1<=3 2<=3 3<=3 4<=3
            System.out.println(skill[i]);  // php  java  node html
        }

    }
    
}
