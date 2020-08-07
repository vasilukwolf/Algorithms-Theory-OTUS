public class Evclid {
   public static void main(String []args) {
      int a = 1234567890;
      int b =12;
      while (a!=0 && b!=0){
        if (a > b){
          a = a%b;
        }
        else{
          b = b%a ;
        }
      }
      System.out.println("NOD : " + a);
   }
}
