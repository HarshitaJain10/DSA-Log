import java.util.*;
public class string_builder {
    public static String upper(String ch){
        StringBuilder sb=new StringBuilder("");
        char up=Character.toUpperCase(ch.charAt(0));
        sb.append(up);
        for(int i=1;i<ch.length();i++){
            if(ch.charAt(i) ==' ' && i<ch.length()-1){
                sb.append(ch.charAt(i));
                i++;
                sb.append(Character.toUpperCase(ch.charAt(i)));

            }
            else{
                sb.append(ch.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // StringBuilder sh= new StringBuilder("");
        // for(char ch='a';ch<'z';ch++){
        //     sh.append(ch);
        // }
        // System.out.println(sh.length());
        String ch="hi, hello what is up";
        System.out.println(upper(ch));

    }

}
