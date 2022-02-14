package Wk3;

import java.util.Date;
import java.util.Scanner;

public class Loan2 {

	public double annualInterestRate;
	public int numberOfYears;
	public double loanAmount;
	public Date loanDate;
 
	public Loan2(double annualInterestRate,int numberOfYears, double loanAmount) {
		this.annualInterestRate= annualInterestRate;
		this.numberOfYears=numberOfYears;
		this.loanAmount=loanAmount;
	}
	
	public static double getMonthlyPayment(double annualInterestRate,int numberOfYears,double loanAmount)
	{
		
		double mi=(annualInterestRate/=100.0)/12;
		double mir2=1/(Math.pow((1+mi),(numberOfYears*12)));
		double gmp= (loanAmount*mi)/(1-mir2);
		
		 
		 
		//double mir2=(loanAmount*mir)/(1-Math.pow(1+mir,-numberOfYears*12));
		return gmp;
		
	}
	public static double getTotalPayment(double annualInterestRate,int numberOfYears,double loanAmount)
	{
		double monthlyPayment= getMonthlyPayment(annualInterestRate,numberOfYears,loanAmount);
	
		double totalPayment= monthlyPayment*numberOfYears*12;
		return totalPayment;
	}

}
