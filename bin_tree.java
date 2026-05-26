import java.util.*;

public class bin_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }
        //PREORDER
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        //INORDER
         public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            
            inorder(root.right);
        }
        //POSTORDER
         public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
            
            
        }
        //LEVELORDER
         public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();    //put out node from que into node
                if(currNode==null){
                    System.out.println();  //next line
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }}
                    else{
                        System.out.println(currNode.data);
                        if(currNode.left!=null){
                            q.add(currNode.left);
                        }
                         if(currNode.right!=null){
                            q.add(currNode.right);
                        }
                    }
                }
            }



        }   
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinaryTree tee=new BinaryTree();
        Node root=tee.buildTree(nodes);
        System.out.println(root.data);
        tee.preorder(root);
        tee.inorder(root);
        tee.levelorder(root);
    }

}
