package com.ksv.Client;

import com.ksv.application.MMBankFactory;
import com.ksv.application.MMCurrentAcc;
import com.ksv.application.MMSavingAcc;
import com.ksv.framework.BankFactory;
import com.ksv.framework.CurrentAcc;
import com.ksv.framework.SavingAcc;




public  class Client {
	

	public static void main(String args[]) {
		BankFactory ks=new MMBankFactory();
		SavingAcc sd=new MMSavingAcc(123, "kha", 1000, true);
		sd.withdraw(sd.getAccBal());
		System.out.println( sd.toString());
		CurrentAcc ca = new MMCurrentAcc(456,"abc",50,false, 100);
		ks.withdraw(ca.getCreditLimit());
		System.out.println(ks.toString());
		
	}
}

