package week3.day1;

public class A3AxisBank extends A3BankInfo {

	public void deposit() {
		
		System.out.println("deposit by AxisBank");
	}

	public static void main(String[] args) {
		
		A3AxisBank axis = new A3AxisBank();
		axis.deposit();
	}

}
