import java.util.*;


public class two_d_array {
    public static void main(String[] args) {
        int num[][]=new int[3][3];
        int n=num.length;
        int m=num[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){      //row
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
            
    }
}
