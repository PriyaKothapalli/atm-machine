package atm;

public class Atm {

	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	
	// We need parameterized and default constructor
	// Default constructor
	public Atm() {
		super();
	}
	
	// No need Parameterized constructor bcz we have getters and setters method
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	// toString() - mthod returns the string repersentaion of the object.
	//IF you print any object , java compiler.So overriding the toString(), method returns the desired output, 
	// it can be the state of an object etc. depending on your implementation. 
	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}
	
}
