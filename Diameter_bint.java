import java.util.*;
public class diameter_bt {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){   //OBJ RETURN
        if(root==null){
            return new Info(0,0);

        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);
    }
    //subroot identical
    public static boolean identical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node==null || subRoot==null || node.data!=subRoot.data){
            return false;
        }
        if(!identical(node.left,subRoot.left)){
            return false;
        }
        if(!identical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSub(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(identical(root,subRoot)){
                return true;
            }
        }
        return isSub(root.left, subRoot)||isSub(root.right, subRoot);
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map=new Hashmap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);
    }

    public static void main(String[] args) {
        /*1
          /\
          2 3
          /\ /\
          4 5 6 7
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        // System.out.println(diameter(root).diam);
//for 2q
/**2
  /\
  4 5
 */
Node subRoot=new Node(2);
subRoot.left=new Node(4);
subRoot.right=new Node(5);
System.out.println(isSub(root, subRoot));
        
    }

}
