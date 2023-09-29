package ClassTaskArray;

public class ClassTaskArray2 {
    public static void main(String[] args) {
        char [] [] xPatterns=new char[4][4];


        for (int i = 0; i < xPatterns.length ; i++) {
            for (int j = 0; j < xPatterns[i].length; j++) {
                xPatterns[i][j] =' ';
            }
        }
        for (int i = 0; i < xPatterns.length; i++) {
            xPatterns[i][i]  ='x';
            xPatterns[i][xPatterns.length-1 -i]  ='x';
        }
        for (int i = 0; i < xPatterns.length ; i++) {
            for (int j = 0; j < xPatterns[i].length ; j++) {
                System.out.println(xPatterns[i][j] + "");
            }
            System.out.println();
        }

    }
}
