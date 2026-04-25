
public class que_ll {
   public que_ll() {
   }

   public static void main(String[] var0) {
      Queue var1 = new Queue();
      que_ll.Queue.add(1);
      que_ll.Queue.add(2);
      que_ll.Queue.add(3);

      while(!que_ll.Queue.isEmpty()) {
         System.out.println(que_ll.Queue.peek());
         que_ll.Queue.remove();
      }

   }

   static class Queue {
      static Node head = null;
      static Node tail = null;

      Queue() {
      }

      public static boolean isEmpty() {
         return head == null && tail == null;
      }

      public static void add(int var0) {
         Node var1 = new Node(var0);
         if (head == null) {
            tail = var1;
            head = var1;
         } else {
            tail.next = var1;
            tail = var1;
         }
      }

      public static int remove() {
         if (isEmpty()) {
            System.out.println("empty que");
            return -1;
         } else {
            int var0 = head.data;
            if (tail == head) {
               head = null;
               tail = null;
            } else {
               head = head.next;
            }

            return head.data;
         }
      }

      public static int peek() {
         if (isEmpty()) {
            System.out.println("empty que");
            return -1;
         } else {
            return head.data;
         }
      }
   }

   static class Node {
      int data;
      Node next;

      Node(int var1) {
         this.data = var1;
         this.next = null;
      }
   }
}
