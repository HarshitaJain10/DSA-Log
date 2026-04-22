import java.util.*;
public class nextgreat {
   
       
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ng[]=new int[arr.length];
         Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            ng[i]=-1;
        }
        else{
            ng[i]=arr[s.peek()];

        }
        s.push(i);
        }
        for(int i=0;i<ng.length;i++){
            System.out.println(ng[i]);
        }
        
    }
        
    }


