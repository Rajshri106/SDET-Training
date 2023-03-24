package MediumDificultyAssignment;
/*Q2 Java program to print the following patterns�
���1�
� 212�
 32123�
4321234�*/
public class Assignment2 {

    public void printPattern(int n)
    {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Assignment2 a = new Assignment2();
        int n=4;
        a.printPattern(n);
    }
}

