package com.verizon;

public class LoanTest {

	public static void main(String[] args) {
	//	Loan l;
	//	HousingLoan hl=new HousingLoan();
		//h=l=hl;
		
		Loan l=new HousingLoan();
		l.applyLoan("ram",2000000.00);
		l.submitDocs();
		System.out.println(l.getEmi());
		
		 l=new VehicleLoan();
		l.applyLoan("raj",10000.00);
		l.submitDocs();
		System.out.println(l.getEmi());
	}

}
