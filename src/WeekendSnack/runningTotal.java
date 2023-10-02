package WeekendSnack;

public class runningTotal {
    public static void main(String[] args) {
        int [] myArray = {45,64,87,56,34,22};
        int runningTotals=0;
        int length= myArray.length;

        System.out.print(" the running totals of elements:  ");
        for(int number: myArray){
            runningTotals+=number;
        }
        System.out.println(runningTotals);
    }
}
