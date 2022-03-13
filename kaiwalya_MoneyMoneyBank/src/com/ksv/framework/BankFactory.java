package com.ksv.framework;
import com.ksv.framework.BankFactory;
public abstract  class BankFactory {

	public  void getNewSavingAcc(int AccNo,String  accNm,float accBal,boolean isSalaried) {
		
	}
	



	public abstract CurrentAcc getNewCurrentAccount(int AccNo,String accNm, float accBal,float creditLimit);




	public abstract void withdraw(Object creditLimit);

	
}

