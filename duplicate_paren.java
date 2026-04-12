import java.util.*;
public class dupliparen {
    public static boolean dup(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //dupli
                }
                else{
                    s.pop();  //open paren take out from stack
                }

            }else{
                //opening
                s.push(ch);
            }
    }
    return false;
}
    public static void main(String[] args) {
        
        String str="((a+b))";
        System.out.println(dup(str));
        
    }

}

