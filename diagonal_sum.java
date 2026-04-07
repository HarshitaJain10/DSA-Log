import java.util.*;
public class diagonal_sum {
    public static int diag(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            //pd
            sum+=mat[i][i];
            //sd
            if(i!=mat.length-i-1){
                sum+=mat[i][mat.length-i-1];
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.err.println(diag(mat));
    }

}
