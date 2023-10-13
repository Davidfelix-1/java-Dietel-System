package DietelExercises;
import  java.util.Scanner;
public class PersonalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[] = new int[5], j;
        System.out.println(" enter five digits :    ");
        for (j = 0; j < 5; j++)
        {
            b[j]=sc.nextInt();
        }
        System.out.println(" list of odd numbers ");
        for (j = 0;  j<5; j++)
        {
           if(b[j]%2==1){
               System.out.println(b[j]+" ");
           }

        }
    }
}
