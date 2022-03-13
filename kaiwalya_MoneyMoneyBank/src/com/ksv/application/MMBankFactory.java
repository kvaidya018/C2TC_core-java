package com.ksv.application;

import com.ksv.framework.BankFactory;
import com.ksv.framework.CurrentAcc;
import com.ksv.framework.SavingAcc;

public   class MMBankFactory extends BankFactory {

	public  void getNewSavingAcc(int AccNo, String accNm,float accBal,boolean isSalaried) {
		
	}
	

public  void getNewCurrentAcc(int AccNo,String  accNm,float accBal,float creditLimit) {
		
	}


	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void withdraw(Object creditLimit) {
		// TODO Auto-generated method stub
		
	}	
	}
	
		
	
		
	
	


