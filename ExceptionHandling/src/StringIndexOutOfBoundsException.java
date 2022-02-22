public class StringIndexOutOfBoundsException {
   public static void main(String[] args) {
      String str = "Welcome to the my world..";
      System.out.println("Length of the String is: " + str.length());
      System.out.println("Length of the substring is: " + str.substring(28));
   }
}