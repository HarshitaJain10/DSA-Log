import java.util.PriorityQueue;

public class n_rope {
   public n_rope() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{2, 3, 3, 4, 6};
      PriorityQueue var2 = new PriorityQueue();

      int var3;
      for(var3 = 0; var3 < var1.length; ++var3) {
         var2.add(var1[var3]);
      }

      var3 = 0;

      while(var2.size() > 1) {
         int var4 = (Integer)var2.remove();
         int var5 = (Integer)var2.remove();
         var3 += var4 + var5;
         var2.add(var4 + var5);
      }

      System.out.println(var3);
   }
}
