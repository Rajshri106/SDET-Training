
/*Q.1 Write a java program to find tax for employee. The program should
calculate the income tax to be paid by the employee as per the criteria given below: 
Slab rate IT rate
Upto Rs. 7,00,000 Nil 
Above Rs. 7,00,000 (0-5,00,000=nil,5,00,000 – 7,00,000=10%) 
Rs. 7,00,000-10,00,000 15% on additional amount 
Rs. 10,00,000-15,00,000 20% on additional amount Above 15,00,000 30% on additional amount
Result: - income tax is ……………………………. */



package MediumDificultyAssignment;

import java.util.Scanner;

public class Assignment1 {
    public void findIncomeTax() {
        //get input value from user using scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee Code: ");
        int empCode = in.nextInt();
        System.out.print("Enter Total Annual Income: ");
        double totalIncome = in.nextDouble();
        System.out.print("Enter Deduction Annual Savings: ");
        double deduction = in.nextDouble();

        double taxableIncome = totalIncome - deduction;
        int taxRate = 0;
        if (taxableIncome <= 500000) {
            taxRate = 0;
        } else if (taxableIncome >= 500000 && taxableIncome <= 700000) {
            taxRate = 10;
        } else if (taxableIncome >= 700000 && taxableIncome <= 1000000) {
            taxRate = 15;
        } else if (taxableIncome >= 1000000 && taxableIncome <= 1500000) {
            taxRate = 20;
        } else {
            taxRate = 30;
        }

        double tax = taxableIncome * taxRate / 100;

        System.out.println("Income Tax of the employee is: " + tax);


    }

    public static void main(String[] args) {
        Assignment1 a = new Assignment1();
        a.findIncomeTax();
    }
}
