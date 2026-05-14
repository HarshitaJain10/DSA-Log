import java.util.*;
public class subarray {                      //subarray +maxsum(BRUTE FORCE)
    public static void subarray(int num[]){
        int ts=0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){  //start(4)
            int curr=num[i];
            
            for(int j=i;j<num.length;j++){  //end (4,5,6,7)(j=i for single elements)
                sum=0;
                for(int k=i;k<=j;k++){     //print
                    System.out.print(num[k]);
                    sum=sum+num[k];
                      
                }
                System.out.println();
                System.out.println(sum);
                if(maxsum<sum){
                    maxsum=sum;
                }
                
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println(ts);
        System.out.println(maxsum);
        
       
    }
    public static void main(String[] args) {
        int num[]={4,5,6,7};
        subarray(num);
        
    }

}
