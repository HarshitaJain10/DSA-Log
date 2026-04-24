import java.util.Stack;

public class pushbottom {
    public static void pushb(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushb(s,data);
        s.push(top);
    }
    //REVERSE STR
    public static String reversestr(String str){
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;

        }
        StringBuilder result= new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();    //cause str and strbuild are diff so to store
    }
    public static void main(String[] args) {
    //     Stack<Integer>s=new Stack();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     pushb(s,4);
    //     while(!s.isEmpty()){
    //         System.out.println(s.pop());
    // }
    String str="abc";
    String result=reversestr(str);
    System.out.println(result);

}
}
