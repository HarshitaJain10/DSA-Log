import java.util.PriorityQueue;

public class near_car {
    static class point implements Comparable<point>{
        int idx;
        int dist;
        int x;
        int y;
        public point(int x,int y,int dist,int idx){
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.idx=idx;
        }
        @Override
        public int compareTo(point p2){
            return this.dist-p2.dist;    //asc order

        }

    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        //to add pts in pq

        PriorityQueue<point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int dist=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], dist,i));
        }
            //near k car

            for(int i=0;i<k;i++){
                System.out.println(pq.remove().idx);
            }
        
    }
    
}
