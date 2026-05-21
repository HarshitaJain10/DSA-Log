import java.util.*;

public class heap {
    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
        public void add(int data){
            //add at last
            arr.add(data);
            //find idx
            int x=arr.size()-1;
            int par=(x-1)/2;

            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp );

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
         public int remove(){
            int data=arr.get(0);
            //swap 1 nd last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            //delete lst
            arr.remove(arr.size()-1);
            //call heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
         private void heapify(int i){
            int min=i;
            int left=2*i+1;
            int right=2*i+2;
            if(left<arr.size() && arr.get(left)<arr.get(min)){
                min=left;
            }
             if(right<arr.size() && arr.get(right)<arr.get(min)){
                min=right;
            }
            if(min!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(arr.get(min),temp);

                heapify(min);
            }
    }
        

        }
       
        
        
       
    public static void main(String[] args) {
        Heap h=new Heap();    //CLASS
        h.add(3);
        h.add(4);
        h.add(1);
       
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
        
    }
    
}
