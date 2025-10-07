import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        int[][] exampleBoard = new int[3][3];
        Player player1 = new Player();
        Player player2 = new Player();
        String player1Name;
        String player2Name;
        int rounds = 0;


        System.out.println("Welcome to Tic-Tac-Toe in Java.");
        System.out.println("Player 1: What is your name?");

        player1Name = scanner.next();
        player1.setName(player1Name);

        System.out.println("Would you like to be X's or O's?");

        // Runs until player1 types X or O (case-insensitive)
        player1.setSymbol(scanner.next());
        while(!player1.getSymbol().equalsIgnoreCase("X") && !player1.getSymbol().equalsIgnoreCase("O")) {
            System.out.println("Please pick either X's or O's");
            player1.setSymbol(scanner.next().toUpperCase());
        }

        System.out.println("Player 2, what is your name?");

        player2Name = scanner.next();
        player2.setName(player2Name);

        if(player1.getSymbol().equalsIgnoreCase("X")) {
            player2.setSymbol("O");
        } else if(player1.getSymbol().equalsIgnoreCase("O")) {
            player2.setSymbol("X");
        }

        System.out.printf("Player 1's name is %s and your symbol is %s.\n", player1Name, player1.getSymbol());
        System.out.printf("Player 2's name is %s and your symbol is %s.\n", player2Name, player2.getSymbol());

//        Explain how the tiles are numbered and print example board to console.
        System.out.println("Here is an example board to show how the tiles are numbered. When it's your turn, please enter a number into the console.");

        int tile = 0;
        for(int i = 0; i < exampleBoard.length; i++) {
            for(int j = 0; j < exampleBoard[0].length; j++) {
                exampleBoard[i][j] = tile + 1;
                tile += 1;
            }
            System.out.println(Arrays.toString(exampleBoard[i]));
        }


        while(board.getWinner() == null) {
//            Player 1's turn
            System.out.printf("%s, please select a tile: \n", player1Name);
            int player1Selection = scanner.nextInt();
            while(player1Selection <= 0 || player1Selection > 9) {
                System.out.println("Error: Please select a valid tile 1-9");
                player1Selection = scanner.nextInt();
            }
            board.makeSelection(player1Selection, player1.getSymbol());
            if(board.checkWinner()) {
                board.setWinner(player1Name);
            }

            board.printBoard();

//            Player 2's turn
            System.out.printf("%s, please select a tile: \n", player2Name);
            int player2Selection = scanner.nextInt();
            while(player2Selection <= 0 || player2Selection > 9) {
                System.out.println("Error: Please select a valid tile 1-9");
                player2Selection = scanner.nextInt();
            }
            board.makeSelection(player2Selection, player2.getSymbol());
            if(board.checkWinner()) {
                board.setWinner(player2Name);
            }
            board.printBoard();
        }
        System.out.printf("%s has won. Congratulations! To play again, restart the console.", board.getWinner());
    }
}