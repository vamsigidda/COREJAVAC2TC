package com.tnsif.BankAcc.client;

import com.tnsif.BankAcc.Application.MMBankFactory;
import com.tnsif.BankAcc.Application.MMCurrentAcc;
import com.tnsif.BankAcc.Application.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		
		//step a
		MMBankFactory mmbfactory=new MMBankFactory();
		//mmbfactory.getNewSavingAccount(0, null, 0, false);
		
		//step b
		MMSavingAcc mmsaving=new MMSavingAcc(001,"pavan",10000,true);
		
		//step c
		MMCurrentAcc mmcurrent=new MMCurrentAcc(002,"kalyan",10000,100000);
		
		//step d
		mmsaving.withdraw(100000);
		mmcurrent.withdraw(100000);
		
		//step e
		mmsaving.toString();
		mmcurrent.toString();

	}

}
