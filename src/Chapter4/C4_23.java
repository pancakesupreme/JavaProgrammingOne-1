package Chapter4;

import java.util.Scanner;

/**
 * Program determines the federal withholding, state withholding, total
 * deduction, and net pay of an employee
 *
 * @author Emory Meursing
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double hoursWorked, hourlyRate, federalTax, stateTax, grossPay, federalWithhold, stateWithhold;
        double deductionTotal, netPay;

        // information
        System.out.print("Please enter employee's name: ");
        name = input.next();
        System.out.print("Please enter number of hours worked in a week: ");
        hoursWorked = (double) (input.nextInt());
        System.out.print("Please enter their hourly pay rate: ");
        hourlyRate = input.nextDouble();
        System.out.print("Please enter the federal withholding rate: ");
        federalTax = input.nextDouble();
        System.out.print("Please enter the state withholding rate: ");
        stateTax = input.nextDouble();

        //computations
        grossPay = hoursWorked * hourlyRate;
        federalWithhold = grossPay * federalTax;
        stateWithhold = grossPay * stateTax;
        deductionTotal = federalWithhold + stateWithhold;
        netPay = grossPay - deductionTotal;

        //output
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.printf("     Federal Withholding: (%s%%) : $%.2f \n", federalTax * 100, federalWithhold);
        System.out.printf("     State Withholding : (%s%%): $%.2f \n", stateTax * 100, stateWithhold);
        System.out.printf("     Total Deduction: $%.2f \n", deductionTotal);
        System.out.printf("Net Pay: $%.2f \n", netPay);

    }

}
