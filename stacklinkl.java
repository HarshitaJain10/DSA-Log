import java.util.Stack;

public class stacklinkl {
    static class Node{
        int data;
        Node next;
        Node(int data){        //CONSTRUCTOR-TO pass data
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            else{
                
                newNode.next=head;
                head=newNode;
            }
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            else{
                int top=head.data;
                head=head.next;
                return top;
            }
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                return head.data;
            }

        }

    }
    public static void main(String[] args) {
        //Stack <Integer>s=new Stack<>();
        Stack s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }

}
