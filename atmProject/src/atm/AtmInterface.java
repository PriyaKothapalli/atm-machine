// Create interface to create abstract methods and provide functions

package atm;

public interface AtmInterface {
	
	// Abstract methods so no body
	public void viewBalance();
	public void depositAmount(double depositAmount);
	public void withdrawAmount(double withrawAmount);
	public void viewMiniStatement();

}

// This is abstract methods so, we need another class to implement these methods
