package com.tnsif.BankAcc.Application;

import com.tnsif.BankAcc.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal) {
		System.out.println("Dear current user, your withdraw charges are:" +accBal+ "with credit limit"+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal="
				+ accBal + "]";
	}
	

}
