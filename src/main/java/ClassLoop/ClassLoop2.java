package ClassLoop;
import  java.util.Scanner;
public class ClassLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.print("enter scores number from 1 to 10 at time : ");

        for(int i = 0; i < 10; i++){
            System.out.print(" enter digits: " +(i+1)+" : ");
            int digit= input.nextInt();
            sum+=digit;
        }
        double average= 10;
            average = sum/ average;
        System.out.println("the sum of scores is " + sum + " and the average of the score is " + average);
    }
}
