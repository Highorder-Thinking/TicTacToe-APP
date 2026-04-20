import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Scanner sc = new Scanner(System.in);

        // UC1: Initialize the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // UC2: Take User Input
        System.out.println("Current Board:");
        displayBoard(board);

        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();
        System.out.print("Enter column (0-2): ");
        int col = sc.nextInt();

        // Update board with 'X'
        board[row][col] = 'X';

        System.out.println("\nBoard after your move:");
        displayBoard(board);
        
        sc.close();
    }

    // Helper method to print the board (cleaner code)
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}