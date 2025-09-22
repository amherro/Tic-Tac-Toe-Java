import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];

        System.out.println("Hello player1 and player2, welcome to Tic-Tac-Toe in Java.");
        System.out.println("Type 'Start' to see the board.");
        String startCommand = scanner.next();
        if(startCommand.equalsIgnoreCase("start")) {
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board[0].length; j++) {
                    board[i][j] = 'X';
                }
                System.out.println(Arrays.toString(board[i]));
            }
        } else {
            System.out.println("Could not start the game...");
        }
    }
}