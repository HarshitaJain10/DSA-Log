public class backarr {
    public static void backtrack(int arr[],int i,int val){    //0(n)
        //base case
        if(i==arr.length){
            printarr(arr[i]);
            return;
        }
        //recur
        arr[i]=val;
        backtrack(arr,i+1,val+1);
        arr[i]=arr[i]-2;

        //print arr
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            }
        System.out.printlnln();
        }
        

    }
    public static void main(String[] args){
        int arr[]=new int[5];
        backtrack(arr,0,1);
   }
   }

