package com.ksv.framework;
import com.ksv.framework.CurrentAcc;

public abstract  class CurrentAcc extends BankAcc {


	protected final float creditLimit;
	






	public CurrentAcc(int accNo, String accNm, float accBal, boolean isSalaried, float creditLimit) {
		super(accNo, accNm, accBal, isSalaried);
		this.creditLimit = creditLimit;
	}






	@Override
	public void deposite(float accBal) {
		// TODO Auto-generated method stub
		super.deposite(accBal);
	}



	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public abstract Object getCreditLimit();}

