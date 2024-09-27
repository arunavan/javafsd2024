package com.var.autowiring.components;

import org.springframework.stereotype.Component;

@Component("loan")
public class Loan {
	
	String LoanType;
	Double amount;
	
	public Loan(){
		
	}
	
	
	

	@Override
	public String toString() {
		return "Loan [LoanType=" + LoanType + ", amount=" + amount + "]";
	}
	public Loan(String loanType, Double amount) {
		super();
		LoanType = loanType;
		this.amount = amount;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	

}
