package ClassLoop;
import java.util.Scanner;
public class ClassLoop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum =0;
        int countEven=0;
        System.out.print("enter number 1 to 10 at a time :   ");
        for (int i = 0; i < 10; i++) {
            System.out.print("enter digit:   "+(i+1)+"->");
            int digit= sc.nextInt();
            if(digit%2==0){
                sum+=digit;
                countEven++;
            }
            System.out.println("some of the even numbers entered :   ");
            System.out.println("total leven numbers entered");
        }
    }
}
