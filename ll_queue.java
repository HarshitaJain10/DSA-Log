import java.util.Queue;

public class que_ll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

    
        public static boolean isEmpty(){
            return head==null && tail==null;
    }
    //ADD
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
    //REMOVE
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty que");
                return -1;
        }
            int front=head.data;
       //single el
            if(tail==head){
                tail=head=null;
       }    else{
                head=head.next;
       }
            return head.data;
    }
    //PEEK
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty que");
                return -1;
        }
            return head.data;


}
}
    
    public static void main(String[] args) {
        Queue q=new Queue();   //obj
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }

}

        
    


