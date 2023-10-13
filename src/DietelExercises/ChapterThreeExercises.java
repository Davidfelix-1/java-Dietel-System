package DietelExercises;
import java.util.Scanner;
public class ChapterThreeExercises {
    public static void main(String[] arg){
int  a []= new int[10], i;
Scanner sc = new Scanner(System.in);
System.out.println(" enter ten digits :   ");
        for(i=0; i<10; i++){
            a[i]=sc.nextInt();
        }
          System.out.println(" list of even numbers ");
        for(i=0; i<10; i++){
            if(a[i]%2==0){
                System.out.println(a[i]+"");
            }
        }
        }




    }

