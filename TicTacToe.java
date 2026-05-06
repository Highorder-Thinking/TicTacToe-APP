public class TicTacToe {

    /**
     * UC4: Converts a slot number (1-9) to board indices (row, col)
     * @param slot The number entered by the player (1-9)
     * @return An integer array: {row, col}
     */
    public static int[] convertSlotToIndex(int slot) {
        // Step 1: Normalize to zero-based indexing (0-8)
        int index = slot - 1;

        // Step 2: Calculate Row (Integer Division)
        int row = index / 3;

        // Step 3: Calculate Column (Modulo)
        int col = index % 3;

        // Step 4: Return coordinates as an array
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        // Testing the command with Slot 5
        int userSlot = 5;
        int[] coords = convertSlotToIndex(userSlot);

        System.out.println("User entered slot: " + userSlot);
        System.out.println("System maps to: Row " + coords[0] + ", Column " + coords[1]);
        
        // Example of accessing a 2D array board:
        // char[][] board = new char[3][3];
        // board[coords[0]][coords[1]] = 'X';
    }
}