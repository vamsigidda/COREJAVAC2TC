package com.tnsif.BankAcc.Application;

import com.tnsif.BankAcc.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	private static final float accBal=0;
	
	
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float accBal) {
		System.out.println("Dear saving user, your withdraw charges are: "+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ "]";
	}
	
	
	
	

}
