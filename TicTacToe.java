public class TicTacToe {
    /**
     * Converts a 1-9 slot number to 0-based (row, col) indices.
     * @param slot User input (1-9)
     * @return int array {row, col}
     */
    public static int[] convertSlotToIndices(int slot) {
        // We subtract 1 to align with 0-based indexing (0-8)
        int index = slot - 1;
        
        int row = index / 3; // Integer division gives the row (0, 1, or 2)
        int col = index % 3; // Modulo gives the column (0, 1, or 2)
        
        return new int[]{row, col};
    }
}