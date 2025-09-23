import java.util.Arrays;

public class Board {
    private String[][] board = new String[3][3];

    public String[][] makeSelection(int selection, String symbol) {
//        Check if space has already been taken. If not, put player symbol at that space.
        if() {
            switch(selection) {
                case 1:
                    board[0][0] = symbol;
                    break;
                case 2:
                    board[0][1] = symbol;
                    break;
                case 3:
                    board[0][2] = symbol;
                    break;
                case 4:
                    board[1][0] = symbol;
                    break;
                case 5:
                    board[1][1] = symbol;
                    break;
                case 6:
                    board[1][2] = symbol;
                    break;
                case 7:
                    board[2][0] = symbol;
                    break;
                case 8:
                    board[2][1] = symbol;
                    break;
                case 9:
                    board[2][2] = symbol;
                    break;
            }
        } else {
            System.out.println("That space is taken, please pick a different one.");
        }
        return board;
    }

    public void printBoard(Board board) {
        System.out.println((board));
    }
}

