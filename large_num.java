import java.util.*;
public class large_num {

    public static int getlarge(int unit[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<unit.length;i++){
            if(largest<unit[i]){
                largest=unit[i];
                
            }
            


        }
        return largest;
        

    }
    public static void main(String[] args) {
        int unit[]={1,2,3,4};
        
        System.out.println(getlarge(unit));

    }
    
}
