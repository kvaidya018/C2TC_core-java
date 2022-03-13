package com.ksv.application;

import com.ksv.framework.CurrentAcc;

public  class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, boolean isSalaried, float creditLimit) {
		super(accNo, accNm, accBal, isSalaried, creditLimit);
		// TODO Auto-generated constructor stub
	}


	public void withdraw(float creditLimit) {
		System.out.println("Dear user your account balance is: "+accBal+" with credit limit of: "+creditLimit);
	}



	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}






	@Override
	public Object getCreditLimit() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
