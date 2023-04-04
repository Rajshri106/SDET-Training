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
    private double totalTax;
    private int IncomeCases;

    public void findIncomeTax(int taxableIncome) {
        IncomeCases = (taxableIncome <= 700000) ? 1 : (taxableIncome > 500000 && taxableIncome <= 1000000) ? 2 : (taxableIncome <= 1500000) ? 3 : 4;

        switch (IncomeCases) {
            case 1:
                totalTax = 0;
                break;
            case 2:
                totalTax = (0.15 * (taxableIncome - 700000)) + (0.1 * 200000);
                break;
            case 3:
                totalTax = (0.2 * (taxableIncome - 1000000)) + (0.15 * 300000) + (0.1 * 200000);
                break;
            case 4:
                totalTax = (0.3 * (taxableIncome - 1500000)) + (0.2 * 500000) + (0.15 * 300000) + (0.1 * 200000);
                break;
            default:
                System.out.println("Enter income");
        }
        System.out.println("Income tax amount is :" + totalTax);
    }

    public static void main(String[] args) {
        Assignment1 incomeTaxCalculation = new Assignment1();
        System.out.println("\nTotal Taxable Income : 700000");
        incomeTaxCalculation.findIncomeTax(700000);
        System.out.println("\nTotal Taxable Income : 800000");
        incomeTaxCalculation.findIncomeTax(800000);
        System.out.println("\nTotal Taxable Income : 1400000");
        incomeTaxCalculation.findIncomeTax(1400000);
        System.out.println("\nTotal Taxable Income : 1600000");
        incomeTaxCalculation.findIncomeTax(1600000);
    }
}
