public class Break_and_continue {
    public static void main(String[] args){
    System.out.println("Break_And_Continue ");
    for(int i=0;i<=10;i++){
        if(i==6){
            //System.out.println(i);
            break;
        }
        System.out.println(i);
    }
    for(int i=1;i<=5;i++){
        if(i==3){
            continue;
        }
        System.out.println(i);
    }

    }
    
}
