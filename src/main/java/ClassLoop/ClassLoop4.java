package ClassLoop;
import java.util.Scanner;
public class ClassLoop4 {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc =new Scanner(System.in);
        System.out.print(" enter a number from 1 to 10 at a time:  ");
        for (int i = 0; i < 10; i++) {
            System.out.print("enter a digit: "+(i+1)+":");
            int digit =sc.nextInt();
            sum+=digit;
        }
        System.out.println("th sum of your digit is"+ sum);
    }

}
