public class Fibonachi {
   public static long fib(long n) {
      if ((n == 0) || (n == 1))
         return n;
      else
         return fib(n - 1) + fib(n - 2);
   }
   public static void main(String[] args) {
      System.out.println("Fibonachi 0" + fib(0));
      System.out.println("Fibonachi 8" + fib(8));
      System.out.println("Fibonachi 30" + fib(30));
   }
}
