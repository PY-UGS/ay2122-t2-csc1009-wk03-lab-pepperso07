package Wk3;

import java.util.Scanner;
import java.util.Date;

public class LoanTest {
public static void main(String[] args) {
	Loan2 user; 
	Scanner sc=new Scanner(System.in);
	
	
	System.out.print("Enter annual interest rate (%):");
	double annualInterestRate =sc.nextDouble();
	
	System.out.print("Enter number of years:");
	int numberOfYears=sc.nextInt();
	
	System.out.print("Enter loan amount:");
	double loanAmount=sc.nextDouble();
	
	java.util.Date date = new java.util.Date();
    System.out.print("The loan was created on:"+date+"\n"); 
	
	user=new Loan2(annualInterestRate, numberOfYears, loanAmount) ;
	System.out.print("The monthly payment is:"+user.getMonthlyPayment(annualInterestRate, numberOfYears, loanAmount)+"\n");
	System.out.print("The total payment is:"+user.getTotalPayment(annualInterestRate, numberOfYears,loanAmount)+"\n");
}

 
}
