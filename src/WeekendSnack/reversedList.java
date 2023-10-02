package WeekendSnack;
public class reversedList {
    public static void main(String[] args) {
        int [] elements ={1,2,3,4,5};
        int length = elements.length;
        for (int i = 0; i < length/2; i++) {
            int swap= elements[i];
            elements[i]= elements[length -i-1];
            elements[length-i-1]=swap;
        }
        for (int numb :elements){
            System.out.print(numb +" ");
        }



            



    }
}
