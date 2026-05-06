import java.util.*;
public class spiral_matrix {
    public static void spiral(int mat[][]){
        int sr=0;
        int sc=0;
        int er=mat.length-1;
        int ec=mat[0].length-1;

        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                System.out.println(mat[sr][j]);
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.println(mat[i][ec]);
            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.println(mat[er][j]);
                
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.println(mat[i][sc]);
                
            }
            sc++;
            sr++;
            ec--;
            er--;
        }

    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(mat);
    }

}
