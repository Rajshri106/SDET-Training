package MediumDificultyAssignment;

public class Pattern {
    public void printPattern(int numRows) {
        for (int row = 1; row <= numRows; row++) {
            // Print spaces
            for (int column = 1; column <= numRows - row; column++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int decNum = row; decNum >= 1; decNum--) {
                System.out.print(decNum);
            }
            // Print increasing numbers
            for (int incNum = 2; incNum <= row; incNum++) {
                System.out.print(incNum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        int numRows = 4;
        pattern.printPattern(numRows);
    }
}