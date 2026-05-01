public class selection_sort {
    public static void selection(int num[]){
        for(int i=0;i<num.length-1;i++){   //no of turns
            int min=i;
            for(int j=i+1;j<num.length;j++){  //unsorted mai se sorted nikalna
                if(num[min]>num[j]){
                    min=j;

                }


            }
            int temp=num[min];
            num[min]=num[i];
            num[i]=temp;
        }
       
    }
    public static void print(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={5,4,3,2,1};
        selection(num);
        print(num);
    }
    

    
}
