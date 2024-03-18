import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            // Printing leading spaces
            System.out.format("%" + (numRows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
