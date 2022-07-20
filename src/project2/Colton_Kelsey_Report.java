package project2;
import java.util.Scanner;

import java.io.IOException;

public class Colton_Kelsey_Report {
    public static void main(String[] args)throws IOException{
        Colton_Kelsey_Amortization amortization = new Colton_Kelsey_Amortization(5000, 5.9, 1);


        Scanner amount = new Scanner(System.in); // sets up scanner

        System.out.println("Please enter your loan amount: ");
        Double loanAmountUser = amount.nextDouble();
        amortization.setLoanAmount(loanAmountUser);

        System.out.println("Please enter your annual interest rate: ");
        Double intRateUser = amount.nextDouble();
        amortization.setIntRate(intRateUser);

        System.out.println("Please enter your years of the loan: ");
        int loanYears = amount.nextInt();
        amortization.setLoanYears(loanYears);
        
        amortization.saveReport();


        


    }
}
