package WeekendSnack;

public class evenElements {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(" The even elements in the array :  ");

        for(int numb: myArray){
            if(numb %2 ==0){
                System.out.println(numb+" ");
            }
        }
    }
}
