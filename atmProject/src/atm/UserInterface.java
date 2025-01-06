package atm;
import java.util.Scanner;

public class UserInterface {
	private static int status;
     public static void main(String args[]) {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 int atmNumber = 12345;
    	 int atmPin = 123;
    	 AtmOpertionImpl impl = new AtmOpertionImpl();
    	 // Get data from user
    	 System.out.println("ENTER ATM NUMBER :");
    	 int atmNumber2 = sc.nextInt();
    	 System.out.println("ENTER ATM PIN :");
    	 int atmPin2 = sc.nextInt();
    	 
    	 //Check the condition
    	 if(atmNumber == atmNumber2 && atmPin == atmPin2) {
    		 while(true) 
    		 {
	    		 System.out.println(" 1.ViewAvailable Balance\n 2.Depoist Amount \n 3.Withdraw Amount\n 4.View MiniStatement\n 5.Exit");
	    		 
	    		 System.out.println("Enter the choice:");
	    		 int ch = sc.nextInt();
	    		 if(ch==1) {
	    			 impl.viewBalance();
	    		 }
	    		 else if(ch==2) {
	    			 System.out.println("Enter the amount to deposit :");
	    			 double userDepositedAmount = sc.nextDouble();
	    			 impl.depositAmount(userDepositedAmount);	 
	    		 }
	    		 else if(ch==3) {
	    			 System.out.println("Enter the amount to withdraw :");
	    			 double userWithdrawAmount = sc.nextDouble();
	    			 impl.withdrawAmount(userWithdrawAmount);
	    		 }
	    		 else if(ch==4) {
	    			 impl.viewMiniStatement();
	    		 }
	    		 
	    		 else if(ch==5) {
	    			 System.out.println("Collect your card..Thank you & Visit Again");
	    			 System.exit(status);
	    		 }
    	     }
    	 }
    	 else {
    		 System.out.println("ENTER CORRECT ATM NUMBER AND PIN");
    	 }
     }
}
