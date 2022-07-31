package com.tnsif.BankAcc.Framework;

public class SavingAcc extends BankAcc{
	
	public boolean isSalary;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	
	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
	
	

}
