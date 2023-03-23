package MediumDificultyAssignment;

/*Q.1 Write a java program to find tax for employee. The program should
calculate the income tax to be paid by the employee as per the criteria given below: 
Slab rate IT rate
Upto Rs. 7,00,000 Nil 
Above Rs. 7,00,000 (0-5,00,000=nil,5,00,000 – 7,00,000=10%) 
Rs. 7,00,000-10,00,000 15% on additional amount 
Rs. 10,00,000-15,00,000 20% on additional amount Above 15,00,000 30% on additional amount
Result: - income tax is ……………………………. */
public class Assignment1 {
    public void findIncomeTax(double totalIncome, double deduction) {

        double taxableIncome = totalIncome - deduction;
        int taxRate =0;
        switch (String.valueOf(taxableIncome)) {
            case "(taxableIncome <= 500000)":
                taxRate = 0;
                break;
            case "(taxableIncome >= 500000 && taxableIncome <= 700000)":
                taxRate=15;
                break;
            case "(taxableIncome >= 700000 && taxableIncome <= 1000000)":
                taxRate=20;
                break;
            case "(taxableIncome >= 1000000 && taxableIncome <= 1500000)":
                taxRate=20;
                break;
            default:
                taxRate = 30;
        }

        double tax = (taxableIncome * taxRate) / 100;
        System.out.println("Income Tax of the employee is: " + tax);
    }

    public static void main(String[] args) {
        Assignment1 a = new Assignment1();
        double annualIncome = 400000;
        double annualDeduction = 50000;
        a.findIncomeTax(annualIncome, annualDeduction);
    }
}
