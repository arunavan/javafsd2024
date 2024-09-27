package com.var.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.var.autowiring.components.Account;
import com.var.autowiring.components.Calculator;
import com.var.autowiring.components.CalculatorService;
import com.var.autowiring.components.Loan;
import com.var.javaconfig.SpringConfig1;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	
		Account account=(Account)context.getBean(Account.class);
		account.setId(10);
		account.setName("raj");
		account.setBalance(9999.99);
		account.setLoan(new Loan("Housing",9898987.99));
		System.out.println(account);
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		System.out.println(account.getId());
		System.out.println(account.getLoan().getLoanType());
		System.out.println(account.getLoan().getAmount());
		
		Loan l=(Loan)context.getBean(Loan.class);
		l.setAmount(9999.99);
		l.setLoanType("PersonalLoan");
		System.out.println(l.getLoanType()+"  "+l.getAmount());
		
		CalculatorService cs=(CalculatorService)context.getBean(CalculatorService.class);
		System.out.println(cs.callOperation(4, 5));
		
		

	}

}
