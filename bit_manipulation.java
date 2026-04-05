import java.util.*;
public class bit_manipulation {
    public static void odd_even(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even")  ;  
        }
        else{
            System.out.println("odd");
        }
        
    }
    public static int getbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearbit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static int update(int n,int i,int ew){
        // if(new==0){
        //     return clearbit(n,i);
        // }
        // else{
        //     return setbit(n,i);
        // }
        n=clearbit(n,i);
        int bitmask=ew<<i;
        return n|bitmask;
    }
    public static int clearibits(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int clearrange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=((i<<i)-1);
        int bitmask=a | b;
        return n & bitmask;
    }
    public static void power(int n){
        int m=n-1;
        int bitmask=n & m;
        if(bitmask==0){
            System.out.println("power of two");
        }
        else{
            System.out.println("not power of 2");
        }
    }
    public static void main(String[] args) {
        // odd_even(3);
        power(4);

    }
        
    }
    

