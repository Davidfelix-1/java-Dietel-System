package WeekendSnack;
public class largeElement {
    public static void main(String[] args) {

        double schoolGrades[]={90,80,70,60,50,40,30,20,10,};
        double max;
        int i;
        max = schoolGrades[0];

        for (i=0; i<=8; i++) {
            if (schoolGrades[i]>max) max=schoolGrades[i];
        }
                System.out.println("\n\nthe highest school grade is ::   "+ max);


        }
    }

