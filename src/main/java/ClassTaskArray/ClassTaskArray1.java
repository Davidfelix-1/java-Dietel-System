package ClassTaskArray;
import java.util.Scanner;
public class ClassTaskArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double [] scores = new double[10];
        int total =0;
        System.out.print(" enter ten number of scores :  ");

        for (int i = 0; i <scores.length ; i++) {
            System.out.print(" enter numbers for scores : "+(i+1)+":");
            scores[i]= sc.nextInt();


        }



    }
}
