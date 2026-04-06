public class binary_search {

    public static int binarysearch(int line[],int search){
        int start=0,end=line.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(line[mid]==search){
                return mid;
            }
        
            if(line[mid]<search){
                start=mid+1;
            }
        
            else{
                end=mid-1;
            }
        
    }
    return -1;
}
    public static void main(String[] args) {
        int line[]={4,5,6,7,8};
        int search=5;
        System.out.println("index is"+binarysearch(line,search));
    }
    
}
