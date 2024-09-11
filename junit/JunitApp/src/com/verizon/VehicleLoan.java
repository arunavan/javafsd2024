package com.verizon;
public class VehicleLoan extends Loan{
	 void applyLoan(String name,double amount) {
		 System.out.println(name +"  vehicle loan of amount Rs"+amount +"applied");
	 }
	 void submitDocs() {
		 System.out.println(" vehicle docs are submitted");
	 }
	 int getEmi() {
		 return 899;
	 }

}
