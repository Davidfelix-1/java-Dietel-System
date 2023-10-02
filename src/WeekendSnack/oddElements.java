package WeekendSnack;

public class oddElements {
    public static void main(String[] args) {
        int [] myArray ={1,2,3,4,5,6,7,8,9,10};
        System.out.print("odd elements in the array ->>   ");

        for(int num : myArray){
            if(num%2 != 0){
                System.out.println(num+" ");
            }
        }
    }
}
