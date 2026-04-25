public class rec2 {
    public static int tiling(int n){  //floor=2*n
        if(n==0||n==1){
            return 1;
        }
        //vertical
        int fn1=tiling(n-1);
        //horizontal
        int fn2=tiling(n-2);
        int total=fn1+fn2;
        return total;
    }
    public static void duplicate(String str,int index,StringBuilder newstr,boolean map[]){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(index);
        if(map[curr-'a']==true){
            duplicate(str,index+1,newstr,map);
        }
        else{
            map[curr-'a']=true;
            duplicate(str,index+1,newstr.append(curr),map);

        }
    }
    public static int pair(int n){
        if(n==1||n==2){
            return n;
        }
        //single
        int sin=pair(n-1);
        //pair
        int cos=sin*pair(n-2);
        int total=sin+cos;
        return total;

    }
    public static void binary(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binary(n-1,0,str+"0");
        if(last==0){
            binary(n-1,1,str+"1");
        }
        


    }
    public static void main(String[] args) {
        // System.out.println(tiling(4));
        // String str="apppnacollege";
        // duplicate(str,0,new StringBuilder(""),new boolean[26]);
        // System.out.println(pair(3));
        binary(3,0,"");
        
    }

}
