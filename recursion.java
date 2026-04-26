public class recursion {
    public static void dec(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        dec(n+1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static int fib(int f){
        if(f==0 || f==1){
            return f;
        }
        int fm1=fib(f-1);
        int fm2=fib(f-2);
        int fn=fm1+fm2;
        return fn;
    }
    public static boolean sortarr(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return(sortarr(arr,i+1));
    }
    public static int firstocc(int arr[],int i,int k){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        return firstocc(arr,i+1,k);
        
    }
    public static int lastocc(int arr[],int i,int k){
        if(i==arr.length){
            return-1;
        }
            int found=lastocc(arr,i+1,k);
            
            if(found ==-1 && arr[i]==k){
            return i;
        }
        return found;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static int optimise(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpow=optimise(a,n/2);
        int halfpowsq=halfpow*halfpow;
        //n is odd
        if(n%2!=0){
             halfpowsq=a*halfpowsq;
        }
        return halfpowsq;
        

    }
    public static void main(String[] args) {
        int n=5;
        //dec(n);
        // System.out.println(fact(5));
        // int f=5;
        // System.out.println(fib(f));
        // int arr[]={1,2,3,4,3};
        // System.out.println(lastocc(arr,0,3));
        System.out.println(optimise(2,10));
        
    }

}
