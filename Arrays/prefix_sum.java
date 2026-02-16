public class prefix_sum {
    public static void prefix(int arr[]){
        int curr=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        //cal pref arr
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max_sum<curr){
                    max_sum=curr;
                }
        }
    }System.out.println("maxsum"+max_sum);
}
    public static void kadan(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        
    //  public static int kadane(int[] arr) {   for all -ve
    //     int currSum = arr[0];
    //     int maxSum = arr[0];

    //     for (int i = 1; i < arr.length; i++) {
    //         currSum = Math.max(arr[i], currSum + arr[i]);
    //         maxSum = Math.max(maxSum, currSum);
    //     }

    //     return maxSum;
    // }
        for(int i=0;i<arr.length;i++){
                cs=cs+arr[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs, ms);
            }
            System.out.println("ms"+ms);
        }
        
        
    
    public static void main(String[] args) {
        int arr[]={-2,-3,-4} ;             //,-1,-2,1,5,-3};
        //prefix(arr);
        kadan(arr);
    }

}
