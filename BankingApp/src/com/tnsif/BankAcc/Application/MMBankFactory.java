package com.tnsif.BankAcc.Application;

import com.tnsif.BankAcc.Framework.BankFactory;
import com.tnsif.BankAcc.Framework.CurrentAcc;
import com.tnsif.BankAcc.Framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {

        MMSavingAcc mmsaving=new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return mmsaving;
	}

	@Override
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return mmcurrent;
	}
	
	
	
	
	

}
