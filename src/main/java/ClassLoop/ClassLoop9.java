package ClassLoop;
import java.util.Scanner;
public class ClassLoop9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" enter 10 scores numbers:   ");
        for (int i = 0; i <10 ; i++) {
            System.out.print("score number is :  "+(i+1)+":");
            int score= input.nextInt();
        }
        int score= input.nextInt();
        System.out.println(" the score numbers are :   "+score);
    }
}
