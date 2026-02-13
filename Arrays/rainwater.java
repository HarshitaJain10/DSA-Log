import java.util.*;
public class rainwater {
    public static int trap_rain(int height[]){
        //left max
        int leftmax[]=new int [height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){   //i=1,taken out for 0 already
            leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }

        //right max
        int rightmax[]=new int [height.length];
        rightmax[height.length-1]=height[height.length];
        for(int i=height.length-2;i<0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);   //backward array start,compare wit next ele

        }
        int trapwater=0;
        //loop
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapwater+=waterlevel-height[i];
        }
        return trapwater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trap_rain(height));
        
    }

}
