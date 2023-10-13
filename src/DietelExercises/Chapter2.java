package DietelExercises;
import java.util.Scanner;
public class Chapter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number:  ");
        int number1 = sc.nextInt();
       System.out.print("Enter second number:  ");
        int number2 = sc.nextInt();
      //  int sum = number1 + number2;
      //  System.out.printf("sum is %d%n", sum);

        //System.out.print(" Welcome \nto ");
       // System.out.println(" Java \nprogramming! ");
      //  System.out.printf("%s%n%s", "Welcome to" ,"Java Programming!");

        if(number1 == number2){
            System.out.printf("%d !== %d%n" , number1 , number2);
        }
        if(number1 < number2){
            System.out.printf("%d < %d%n", number1 , number2);
        }
        if(number1 > number2){
            System.out.printf("%d < %d%n", number1 ,number2);
        }
        if(number1 <= number2){
            System.out.printf("%d <= %d%n", number1 , number2);
        }
        if(number1 >= number2){
            System.out.printf("%d >= %d%n", number1 , number2);
        }



    }
}
