public class DAC {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void merge(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        merge(arr,si,mid);           //sort into 2 parts till base is found
        merge(arr,mid+1,ei);

        mergesort(arr,si,mid,ei);
    }

        //merge into 1 arr so make new arr
        public static void mergesort(int arr[],int si,int mid,int ei){
            int temp[]=new int[ei-si+1];
            int i=si;
            int j=mid+1;
            int k=0;

            //compare small or large
            while(i<=mid && j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }
                else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            }
            //for left elements in 1st part
            while(i<=mid){
                temp[k++]=arr[i++];
            }
            //for left elements in 2nd part
            while(j<=ei){
                temp[k++]=arr[j++];
            }
            //copy temp into original arr
            for(k=0,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }

        }
    
    public static void main(String[] args) {
        int arr[]={2,3,5,4};
        merge(arr,0,arr.length);
        printarr(arr);
        
    }
    
    
}
