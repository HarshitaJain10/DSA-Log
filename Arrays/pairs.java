public class pairs_araay {

    public static void pairs(int num[]){
        for(int i=0;i<num.length;i++){         //elements of array(2,3,4,5)
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){    //(3,4,5)(4,5)(5)
                System.out.print("("+curr+","+num[j]+")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int num[]={2,3,4,5};
        pairs(num);

    }

}
