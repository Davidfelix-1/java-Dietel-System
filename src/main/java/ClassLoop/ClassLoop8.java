package ClassLoop;
import java.util.Scanner;
public class ClassLoop8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("within the range of 100, enter 10 random numbers:  ");
        for(int i = 0; i <10; i++){
            System.out.print("enter 10 random score numbers:  ");
            int scores= input.nextInt();
            sum+=scores;
            if (scores <= 100) {
                System.out.print(scores);
            }
            else{
                System.out.print("invalid format!, input figures within the range of 100:  ");
            }
        }
        int average =10;
        average=sum /average;

        System.out.println("the total average of the score number is: "+average);
    }
}
