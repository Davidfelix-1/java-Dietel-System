package ClassLoop;
import java.util.Scanner;
public class ClassLoop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(" enter score number from 1 to 10 : "+(i+1)+":");
            int numbers= sc.nextInt();
            sum+= numbers;
            if (numbers <=10){
                System.out.print(numbers);
            }
            else{
                System.out.println("invalid input !, enter number from 1 to 10:  ");
            }
        }
        System.out.println("the total sum of score number is =" + sum);
    }
}
