package com.ksv.framework;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	protected float accBal;
	protected float creditLimit;
	private boolean isSalaried;
	

	public BankAcc(int accNo, String accNm, float accBal, boolean isSalaried) {

		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		this.isSalaried = isSalaried;
	}





	public void withdraw(float accBal) {
	}
	public void deposite(float accBal ) {
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
