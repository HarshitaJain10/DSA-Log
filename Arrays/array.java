import java.util.*;
public class array {
    public static void update(int val[],int nonChangable){
        nonChangable=10;
        for(int i=0;i<val.length;i++){
            val[i]=val[i]+1;
    }
}
    public static void main(String[] args) {
        int val[]={22,23,24};
        int nonChangable=5;
        update(val,nonChangable);
        for(int i=0;i<val.length;i++){
            System.out.println(val[i]+" "+nonChangable);
        }

        // Scanner sc=new Scanner(System.in);

        // int marks[]=new int[20];
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // //percentage
        // int percentage=(marks[0]+marks[1]+marks[2])/3;
        // System.out.println(percentage+"%");
    }
    
}
