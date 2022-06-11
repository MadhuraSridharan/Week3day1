package org.student;

public class AxisBank extends BankInfo{
  public void deposit() {
	  System.out.println("Axisdeposit");
  }
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.fixed();
		a.saving();
		a.deposit();
		
	}

}
