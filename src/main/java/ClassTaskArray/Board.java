package ClassTaskArray;

public class Board {
    public static void main(String[] args) {

        char[][] gameBoard ={{'X',' ',' ',' '},
                             {' ',' ',' ',' '},
                             {' ',' ',' ',' ',}};
    }
    private static void gameBoard(char[][] gameBoard) {
        System.out.println(gameBoard[0][0] + "|" + gameBoard[0][1] + "|" + gameBoard[0][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[1][0] + "|" + gameBoard[1][1] + "|" + gameBoard[1][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[2][0] + "|" + gameBoard[2][1] + "|" + gameBoard[2][2]);
    }
}
