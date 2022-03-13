package com.ksv.framework;

public abstract class SavingAcc extends BankAcc {

	
	

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, getAccBal(),isSalaried);
		this.isSalaried = isSalaried;
	}

	public static boolean isSalaried;
	private static final float MINBAL=0;
	 public void withdraw(float accBal) {
		 
		 
		
	}

	@Override
	public void deposite(float accBal) {
		// TODO Auto-generated method stub
		super.deposite(accBal);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

	public static float getAccBal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
