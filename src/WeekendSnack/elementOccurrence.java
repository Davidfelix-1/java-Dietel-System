package WeekendSnack;

public class elementOccurrence {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 13;

        if (containsElement(myArray, target)) {
            System.out.println(target+"    is  found in elements.  ");
        } else {
            System.out.println(target+"    is not found in elements. ");
        }
    }
        public static boolean containsElement( int [] arr, int target){
        for(int number:arr){
            if (number == target){
                return true;
            }
        }
        return  false;


    }


}
