import java.util.PriorityQueue;

public class weak_sol {
    static class row implements Comparable<row>{
        int idx;
        int sol;
        public row(int sol,int idx){
            this.idx=idx;
            this.sol=sol;
        }
        @Override
        public int compareTo(row r2){
            if(this.sol==r2.sol){
                return this.idx-r2.idx;
            }else{
                return this.sol-r2.sol;

            }
        }
    }
    public static void main(String[] args) {
        int arm[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0},};
        int k=2;
        PriorityQueue<row>pq=new PriorityQueue<>();
        for(int i=0;i<arm.length;i++){
            int count=0;
            for(int j=0;j<arm[0].length;j++){
                //sol add
                count+=arm[i][j]==1?1:0;
        }
            pq.add(new row(count,i));
    }for(int i=0;i<k;i++){
        System.out.println(pq.remove().idx);
    }
    
}
}
