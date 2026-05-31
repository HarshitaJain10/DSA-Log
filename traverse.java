import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import java.util.*;

public class traverse {
    static class Edge{
        int src;
        int wt;
        int dest;
        public Edge(int s,int w,int d ){
            this.src=s;
            this.wt=w;
            this.dest=d;
        }
    }
    static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        //1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        //2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        //3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));
        //4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(6,5,1));
    }
    //for visit-print curr,true,edge or neigbour

    public static void bfs(ArrayList<Edge>[]graph){      //0(v+e)
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];   //ARR
        q.add(0);   //s=0
        while (!q.isEmpty()){
            int curr=q.remove();  //to check vis or not
            if(!vis[curr]){
                System.out.println(curr);
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        } 
    }
    //DFS
     public static void dfs(ArrayList<Edge>[]graph,int curr,boolean vis[]){
        //visit
        System.out.println(curr);
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }

        }
     }   
     //path-0(v+e)
     public static boolean Path(ArrayList<Edge>[]graph,int src,int dest,boolean vis[]){
        if(src==dest){
            return true;

        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.dest] && Path(graph,e.dest,dest,vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>graph[]=new ArrayList[v];
        create(graph);
        bfs(graph);
        dfs(graph,0,new boolean[v]);
        System.out.println(Path(graph, 0, 5,new boolean[v]));
        
    }
    
}
