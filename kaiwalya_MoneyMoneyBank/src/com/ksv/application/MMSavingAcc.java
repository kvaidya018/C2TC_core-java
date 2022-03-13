package com.ksv.application;

import com.ksv.framework.SavingAcc;

public  class MMSavingAcc extends SavingAcc {
	
	private static final float MINBAL=1000;
	
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, getAccBal(),isSalaried);
		this.isSalaried = isSalaried;
	}


	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried=" + isSalaried + ", accBal=" + accBal + ", creditLimit=" + creditLimit
				+ ", getAccBal()=" + getAccBal() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}




}