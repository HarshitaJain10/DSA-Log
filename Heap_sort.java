public class Heap_sort {
   public Heap_sort() {
   }

   public static void heapify(int[] var0, int var1, int var2) {
      int var3 = var1;
      int var4 = 2 * var1 + 1;
      int var5 = 2 * var1 + 2;
      if (var4 < var2 && var0[var4] < var0[var1]) {
         var3 = var4;
      }

      if (var5 < var2 && var0[var5] < var0[var3]) {
         var3 = var5;
      }

      if (var3 != var1) {
         int var6 = var0[var1];
         var0[var1] = var0[var3];
         var0[var3] = var6;
         heapify(var0, var3, var2);
      }

   }

   public static void Heapsort(int[] var0) {
      int var1 = var0.length;

      int var2;
      for(var2 = var1 / 2; var2 >= 0; --var2) {
         heapify(var0, var2, var1);
      }

      for(var2 = var1 - 1; var2 > 0; --var2) {
         int var3 = var0[0];
         var0[0] = var0[var2];
         var0[var2] = var3;
         heapify(var0, 0, var2);
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2, 4, 5, 3};
      Heapsort(var1);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         System.out.println(var1[var2]);
      }

      System.err.println();
   }
}
