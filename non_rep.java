import java.util.*;
public class non_rep_ch_que {                                          //FIRST NON REPEAT CH
    public static void non_rep(String str){
        int freq[]=new int[26];
        Queue<Character> q= new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;    //gives int value
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(q.peek());
            }

        }

    }
    public static void main(String[] args) {
        String str="aabccxb";
        non_rep(str);
        
    }

}
