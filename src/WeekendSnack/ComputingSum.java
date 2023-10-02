package WeekendSnack;

public class ComputingSum {
    public static void main(String[] args) {
        int [] myArray={1,2,3,4,4,5,6};
        int sum =computeSum(myArray);
        System.out.println(" the the sum of elements is :  ");

    }
public static int computeSum(int [] arr){
        int sum =0;
    for (int number: arr) {
        sum+= number;
    }
    return sum;
}
}
