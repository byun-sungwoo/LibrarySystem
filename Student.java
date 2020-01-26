public class Student extends Person {
	private double balanceOutstanding;

	public Student(String username, String password, double balanceOutstanding) {
		super(username, password);
		this.balanceOutstanding = balanceOutstanding;
	}

	public void payBalance() {
		this.balanceOutstanding = 0;
	}

	public double checkBalance() {
		return balanceOutstanding;
	}

	public double getBalanceOutstanding() {
		return balanceOutstanding;
	}

	public void setBalanceOutstanding(double balanceOutstanding) {
		this.balanceOutstanding = balanceOutstanding;
	}
}
