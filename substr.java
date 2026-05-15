import java.util.*;
public class substr {
    public static String substr(String sub,int si,int ei){
        String small=" ";
        for(int i=0;i<ei;i++){
            small+=sub.charAt(i);


        }
        return small;

    }
    public static void main(String[] args) {
        String sub="helloworld";
        System.out.println(substr(sub,0,5));

        String fruit[]={"apple","banana","mango"};
        String large=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(large.compareTo(fruit[i])<0){
                large=fruit[i];

            }
        }
        System.out.println(large);


        
    }

}
