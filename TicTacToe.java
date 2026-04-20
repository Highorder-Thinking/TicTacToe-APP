import java.utiimport java.util.Scanner;

public class TicTacToe {
    // Create a static Scanner so it can be used across different methods
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // ... (Keep your Board initialization from UC1)
        
        // UC3: Calling the method to get a slot
        int slot = getSlotNumber();
        System.out.println("User selected slot: " + slot);
    }

    /**
     * UC3: Method to read integer input from the user.
     * Requirement: Read integer input and return the value.
     */
    public static int getSlotNumber() {
        System.out.print("Enter a slot number (1-9): ");
        int input = sc.nextInt();
        return input;
    }
}