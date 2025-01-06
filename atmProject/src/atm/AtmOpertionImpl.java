package atm;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class AtmOpertionImpl implements AtmInterface{
	
    Atm atm = new Atm();
    // To store entities use Map
    Map <Double, String> ministmt = new HashMap<>();
    
	public void viewBalance() {
		System.out.println("Available Balance is :"+atm.getBalance());
	}

	
    public void depositAmount(double depositAmount) {
    	// user deposit some amount (500) in his account
		System.out.println("DepositedAmount is :"+depositAmount);  //show deposited amount
		// user add again 1000 rs to his account (already account has 500rs)
		atm.setBalance(atm.getBalance() + depositAmount);   // update Balance
		ministmt.put(depositAmount, "deposited Amount successfully..");   // Stored in map
		viewBalance();
	}

    
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount % 500 == 0) {
			if(withdrawAmount <= atm.getBalance()) {
				System.out.println("Withdraw Amount is " + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);
				ministmt.put(withdrawAmount, "Withdraw amount successfully");
				viewBalance();
					
			}
			else {
				System.out.println("Insufficient Balance");
			}
		}
		else {
			System.out.println("Please enter the amount in terms of 500");
		}
	}
	
	
	public void viewMiniStatement() {
		Set<Double> set= ministmt.keySet();  // ministmt loni keySet ni fetch chesthunnam.So,keySet lo nundi Set type of data vasthundhi.
		for(Double d : set) {
			System.out.println(d + " "+ministmt.get(d));
		}
	}
}
