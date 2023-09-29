package ClassWorkArray;
import java.util.Scanner;

public  class ClassWorkArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 10 numbers:  ");
       int sum =0;

        double myScores[] = new double[10];

        for(int i = 0; i < myScores.length; i++) {
            myScores[i] = sc.nextInt();

            System.out.print("the value are " + myScores[i]);
            for(i = 0; i <myScores.length; i++) {
                sum += (int) myScores[i];


                System.out.println("the total sum of the number of score is : " +sum);
            }

        }
    }
}
