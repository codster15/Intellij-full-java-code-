package feb4.in.deepakjan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer or press Enter to exit:");

        String line = sc.nextLine(); // Read the input as a string
        if (line.isEmpty()) {
            // User pressed Enter without entering anything
            System.out.println(line);
            System.out.println("No input detected. Program will terminate.");
        } else {
            try {
                // Try to parse the input as an integer
                int read = Integer.parseInt(line);
                System.out.println("You entered: " + read);
            } catch (NumberFormatException e) {
                // The input was not an integer
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
}
