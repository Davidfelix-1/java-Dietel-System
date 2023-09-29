package ClassLoop;
import java.util.Scanner;
public class ClassLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print(" enter digit 1 to 10 at at time :  ");

        for(int i = 0 ; i < 10; i ++){
            System.out.println(" enter digit " + (i+1)+":");
            int digit = sc.nextInt();
             sum+=digit;

        }
        System.out.println(" the sum of the 10 scores entered is : ");


        }
    }

