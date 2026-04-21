public class linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;               //parameter
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;

        head=newNode;
    }
    public void addLast(int data){     //method
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    public int lastRemove(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev=i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;

        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void nth(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;     //HEAD HAS TO BE REMOVED
            return;
        }
        int i=0;
        int find=sz-n;
        Node prev=head;
        while(i<find){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;
    }
    //slow-fast tech
    public Node sf(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean palin(){
        if(head==null || head.next!=null){
            return true;
        }
        //step-1 mid
        Node mid=sf(head);

        //step-2 reverse
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev=
            prev=curr;
            curr=next;
        }
        Node right=prev;   //right half head
        Node left=head;    //left half head
        //step-3 r==l
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    public static boolean iscycle(){                //FLOYD'S CYCLE FINDING ALGO
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;  //cycle exist
            }

        }
        return false;       //no cycle
    }
    public static void removecyc(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meet pont
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle
        prev.next=null;


    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addLast(3);
//         ll.print();
//         ll.addLast(4);
//         ll.add(2,9);
//         ll.print();
//         ll. removeFirst();
//         ll.print();
//         System.out.println(ll.size);
//         // System.out.println(ll.itrSearch(3));
//         // System.out.println(ll.recSearch(3));
//         ll.reverse();
//         ll.print();
        //    ll.addLast(1);
        //    ll.addLast(2);
        //    ll.addLast(2);
        //    ll.addLast(1);
        //    ll.print();
        //    System.out.println(ll.palin());
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=head;
        // System.out.println(iscycle());
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(iscycle());
        removecyc();
        System.out.println(iscycle());


    }

 }
