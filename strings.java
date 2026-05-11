import java.util.*;
public class strings {
    // public static void print(String name){
    //     // for(int i=0;i<name.length();i++){
    //     //     System.out.println(name.charAt(i));
    //     // }
    // }
    // public static boolean palin(String str){
        // for(int i=0;i<str.length()/2;i++){
        //     int n=str.length();
        //     if(str.charAt(i)==str.charAt(n-1-i)){
        //         return true;
        //     }
        // }
        // return false;
    // }
    public static float path(String pt){
        int x=0;
        int y=0;
        for(int i=0;i<pt.length();i++){
            char dir=pt.charAt(i);
            if(dir=='s'){
                y--;
            }
            else if(dir=='n'){
                y++;
            }
            else if(dir=='w'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return(float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        // char num[]={'a','b','c'};
        // String at="abs";
        // String str= new String("xyz");

        // //strings are immutable

        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.next();
        // System.out.println(name);
        String name="tony";
        // System.out.println(name.length());
        // System.out.println(name.charAt(0));
        String str="racecar";
        // System.out.println(palin(str));
        String pt="wneenesennn";
        System.out.println(path(pt));
    }

}
