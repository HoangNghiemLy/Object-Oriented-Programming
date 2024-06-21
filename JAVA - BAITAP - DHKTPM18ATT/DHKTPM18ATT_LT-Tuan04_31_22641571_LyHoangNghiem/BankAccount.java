

/**
 * @author ASUS
 * @version 1.0
 * @created 30-Aug-2023 12:19:57 AM
 */
public class BankAccount {

	private String accountNumber = "0000-0000-0000";
	private double balance = 0.0;
	private String ownerName = "No name";



	public void finalize() throws Throwable {

	}
	public BankAccount(){

	}

	/**
	 * 
	 * @param accountNumber
	 * @param ownerName
	 * @param balance
	 */
	public BankAccount(String accountNumber, String ownerName, double balance){

	}

	/**
	 * 
	 * @param amount
	 */
	public void deposit(double amount){

	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public double getBalance(){
		return 0;
	}

	public String getOwnerName(){
		return ownerName;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAccountNumber(String newVal){
		accountNumber = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOwnerName(String newVal){
		ownerName = newVal;
	}

	/**
	 * 
	 * @param s
	 */
	public String toString(String s){
		return "";
	}

	/**
	 * 
	 * @param BankAccount other
	 * @param amount
	 */
	public void transfer(BankAccount other, double amount){

	}

	/**
	 * 
	 * @param amount
	 */
	public void withdraw(double amount){

	}
}//end BankAccount