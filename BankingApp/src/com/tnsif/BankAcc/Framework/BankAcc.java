package com.tnsif.BankAcc.Framework;

public class BankAcc {
	
	public int accNo;
	public String accNm;
	public float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withdraw(float accBal) {
		
	}
	public void deposite(float accBal) {
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	

}
