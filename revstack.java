import java.util.Stack;
public class revstack {
    public static void pushb(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushb(s,data);
        s.push(top);


    }
    public static void rev(Stack<Integer> s){
        if(s.isEmpty()){
            
            return;
        }
        int top=s.pop();
        rev(s);
        pushb(s,top);


    }
    public static void print(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //321
        rev(s);
        print(s);
        //123
        
    }
    
}
