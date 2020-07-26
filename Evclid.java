public class Evclid {
   public static void main(String []args) {
      int a = 1234567890;
      int b =12;
      while (a!=b){
        if (a > b){
          a = a - b;
        }
        else{
          b = b - a;
        }
      }
      System.out.println("NOK : " + b); 
   }
}
