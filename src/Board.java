import java.util.Arrays;
import java.util.Objects;

public class Board {
    public int length;
    private String[][] board = new String[3][3];
    private String winner;
    private int currentSpaceRow;
    private int currentSpaceColumn;

    Board() {
        board[0][0] = " ";
        board[0][1] = " ";
        board[0][2] = " ";
        board[1][0] = " ";
        board[1][1] = " ";
        board[1][2] = " ";
        board[2][0] = " ";
        board[2][1] = " ";
        board[2][2] = " ";
    }

    public String[][] makeSelection(int selection, String symbol) {
//        Check if space has already been taken. If not, put player symbol at that space.
        if(true) {
            switch(selection) {
                case 1:
                    board[0][0] = symbol;
                    currentSpaceRow = 0;
                    currentSpaceColumn = 0;
                    break;
                case 2:
                    board[0][1] = symbol;
                    currentSpaceRow = 0;
                    currentSpaceColumn = 1;
                    break;
                case 3:
                    board[0][2] = symbol;
                    currentSpaceRow = 0;
                    currentSpaceColumn = 2;
                    break;
                case 4:
                    board[1][0] = symbol;
                    currentSpaceRow = 1;
                    currentSpaceColumn = 0;
                    break;
                case 5:
                    board[1][1] = symbol;
                    currentSpaceRow = 1;
                    currentSpaceColumn = 1;
                    break;
                case 6:
                    board[1][2] = symbol;
                    currentSpaceRow = 1;
                    currentSpaceColumn = 2;
                    break;
                case 7:
                    board[2][0] = symbol;
                    currentSpaceRow = 2;
                    currentSpaceColumn = 0;
                    break;
                case 8:
                    board[2][1] = symbol;
                    currentSpaceRow = 2;
                    currentSpaceColumn = 1;
                    break;
                case 9:
                    board[2][2] = symbol;
                    currentSpaceRow = 2;
                    currentSpaceColumn = 2;
                    break;
            }
        } else {
            System.out.println("That space is taken, please pick a different one.");
        }
        return board;
    }

    public void getLength() {
        this.length = board.length;
    }

    public void printBoard() {
        for(int i = 0; i < board.length; i++) {
           for(int j = 0; j < board[0].length; j++) {
               if (board[i][j] == null) {
                   board[i][j] = " ";
               }
           }
        }
        for (String[] strings : board) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    private boolean checkRow() {
        if(board[currentSpaceRow][0].equalsIgnoreCase("X") && board[currentSpaceRow][1].equalsIgnoreCase("X") && board[currentSpaceRow][2].equalsIgnoreCase("X")) {
            return true;
        } else if((board[currentSpaceRow][currentSpaceColumn].equalsIgnoreCase("O") && board[currentSpaceRow][1].equalsIgnoreCase("O") && board[currentSpaceRow][2].equalsIgnoreCase("O"))){
            return true;
        }
        return false;
    }

    private boolean checkCol() {
        if(board[0][currentSpaceColumn].equalsIgnoreCase("X") && board[1][currentSpaceColumn].equalsIgnoreCase("X") && board[2][currentSpaceColumn].equalsIgnoreCase("X")) {
            return true;
        } else return board[0][currentSpaceColumn].equalsIgnoreCase("O") && board[1][currentSpaceColumn].equalsIgnoreCase("O") && board[2][currentSpaceColumn].equalsIgnoreCase("O");
    }

    private boolean checkDiagonal() {
        if((board[0][0].equalsIgnoreCase("X") && board[1][1].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X")) || (board[0][2].equalsIgnoreCase("X") && board[1][1].equalsIgnoreCase("X") && board[2][0].equalsIgnoreCase("X"))) {
            return true;
        } else if((board[0][0].equalsIgnoreCase("O") && board[1][1].equalsIgnoreCase("O") && board[2][2].equalsIgnoreCase("O")) || (board[0][2].equalsIgnoreCase("O") && board[1][1].equalsIgnoreCase("O") && board[2][0].equalsIgnoreCase("O"))){
            return true;
        }
        return false;
    }

//    private boolean checkAntiDiagonal() {
//        if(board[currentSpaceRow][currentSpaceColumn].equalsIgnoreCase("X") && board[currentSpaceRow - 1][currentSpaceColumn - 1].equalsIgnoreCase("X") && board[currentSpaceRow  - 2][currentSpaceColumn - 2].equalsIgnoreCase("X")) {
//            return true;
//        } else if((board[currentSpaceRow][currentSpaceColumn].equalsIgnoreCase("O") && board[currentSpaceRow - 1][currentSpaceColumn - 1].equalsIgnoreCase("O") && board[currentSpaceRow - 2][currentSpaceColumn - 2].equalsIgnoreCase("O"))){
//            return true;
//        }
//        return false;
//    }

    public boolean checkWinner() {
//        if (checkRow() || checkCol() || checkDiagonal() || checkAntiDiagonal()) {
        if (checkRow() || checkCol() || checkDiagonal()) {
            return true;
        } else {
            return false;
        }
    }
}

