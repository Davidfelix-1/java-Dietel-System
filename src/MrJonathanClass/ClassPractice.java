package MrJonathanClass;
import java.util.Scanner;
public class ClassPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:  ");
        int how_many = scanner.nextInt();

        for (int i = 1; i <= how_many; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        scanner.close();

    }
}









