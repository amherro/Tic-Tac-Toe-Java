import java.util.Arrays;

public class Board {
    private String[][] board = new String[3][3];
    private String winner;


    public String[][] makeSelection(int selection, String symbol) {
//        Check if space has already been taken. If not, put player symbol at that space.
        if(true) {
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

    public String checkWinner() {
        if((board[0][0].equalsIgnoreCase("X") && board[0][1].equalsIgnoreCase("X") && board[0][2].equalsIgnoreCase("X"))) {
            return "X";
        } else {
            return null;
        }
    }
}

