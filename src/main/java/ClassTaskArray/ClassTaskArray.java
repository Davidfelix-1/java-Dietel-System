package ClassTaskArray;
import java.util.Scanner;
public class ClassTaskArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];
        int sum =0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("enter number for score :   " + (i+1) + ":");
            scores[i] = sc.nextInt();
            sum+=scores[i];
        }
        System.out.println(" the sum of  numbers for  10 scores "+ sum);
    }
}
