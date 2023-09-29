package ClassLoop;
import java.util.Scanner;
public class ClassLoop7 {
    public static void main(String[] args) {
        Scanner collection = new Scanner (System.in);
        int sum =0;
        System.out.print(" withing the range of 100, enter 10 random numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" enter 10 random score numbers: " +(i+1)+"-");
            int scoreNumbers= collection.nextInt();
            sum+=scoreNumbers;
            if (scoreNumbers<=100){
                System.out.print(scoreNumbers);
            }
            else{
                System.out.print(" invalid action!, number range is between 100 and minimum of 10 digits ");
            }
        }
        System.out.println(" the sum total of scoreNumbers is "+sum);
    }
}
