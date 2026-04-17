import java.util.*;
public class histo_area {
    public static void area(int arr[]){
        int marea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];

        //next small right

        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next small left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        
        //area
        //width=i-j-1
        for(int i=0;i<arr.length;i++){
            int ht=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int curr_area=ht*width;
            marea=Math.max(curr_area,marea);

        }
        System.out.println("max area of histogram is"+marea);

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        area(arr);
        
    }

}
