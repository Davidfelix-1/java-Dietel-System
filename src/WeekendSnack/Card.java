package WeekendSnack;
import java.util.Scanner;
public class Card {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the card number: ");
       long cardNumber = input.nextLong();
      //long cardNum = 4440967484181607L;
      System.out.println(cardNumber + " is " + (validityCheck(cardNumber) ? "valid" : "invalid"));
   }
   public static boolean validityCheck(long cardNumber) {
      return (theSize(cardNumber) >= 13 && theSize(cardNumber) <= 16) && (prefixMatch(cardNumber, 4)
         || prefixMatch(cardNumber, 5) || prefixMatch(cardNumber, 37) || prefixMatch(cardNumber, 6))
         && ((sumDoubleEven(cardNumber) + sumOdd(cardNumber)) % 10 == 0);
   }

   public static int sumDoubleEven(long cardNumber) {
      int sum = 0;
      String num = cardNumber + "";
      for (int i = theSize(cardNumber) - 2; i >= 0; i -= 2)
         sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
      return sum;
   }

   public static int getDigit(int cardNumber) {
      if (cardNumber < 9)
         return cardNumber;
      return cardNumber/ 10 + cardNumber% 10;
   }

   public static int sumOdd(long cardNumber) {
      int sum = 0;
      String num = cardNumber + "";
      for (int i = theSize(cardNumber) - 1; i >= 0; i -= 2)
         sum += Integer.parseInt(num.charAt(i) + "");
      return sum;
   }
   // Return true if the digit d is a prefix for cardNumber
   public static boolean prefixMatch(long cardNumber, int d) {
      return getPrefix(cardNumber, theSize(d)) == d;
   }

   public static int theSize(long d) {
      String num = d + "";
      return num.length();
   }

   public static long getPrefix(long cardNumber, int k) {
      if (theSize(cardNumber) > k) {
         String num = cardNumber + "";
         return Long.parseLong(num.substring(0, k));
      }
      return cardNumber;
   }
}




