import java.util.PriorityQueue;

public class slide {                //0(NLOGK)
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        public Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
        @Override
        public int compareTo(Pair p2){
            //asc
            //desc
            return p2.val-this.val;

        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];  //n-k+1
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        //add 1st wind
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }
        res[0]=pq.peek().val;
        //next wind
        for(int i=k;i<arr.length;i++){
            while (pq.size()>0 && pq.peek().idx<=(i-k)) {
                pq.remove();
                
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1]=pq.peek().val;       //WINDO NO=0-0+1=1

        }
        //print res
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
        System.out.println();

    }
    
}
