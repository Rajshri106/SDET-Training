
/*Q2 Java program to print the following patterns�
���1�
� 212�
 32123�
4321234�*/


package MediumDificultyAssignment;

public class Assignment2 {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k <= 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {

                System.out.print(j);
            }
            for (int k = 0; k <= 2; k++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

