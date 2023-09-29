package ClassLoop;
import java.util.Scanner;
public class ClassLoop1 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.print("enter scores 1to 10 at a time:  ");

        for(int i=0 ; i<10; i++){
            System.out.println("enter digit "+(i+1)+":");
            int digit = sc.nextInt();
            sum+=digit;

        }
        double average = 10;
        average =  sum / average;

        System.out.println("the average for the score digits is :"+ average);
    }
}
