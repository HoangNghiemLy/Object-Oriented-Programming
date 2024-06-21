

/**
 * @author ASUS
 * @version 1.0
 * @created 30-Aug-2023 12:19:57 AM
 */
public class Bank {

	private int List<accounts>;
	private String name = "No name";
	private int numberOfAccounts = 100;
	private BankAccount accounts;



	public void finalize() throws Throwable {

	}
	public Bank(){

	}

	/**
	 * 
	 * @param name
	 * @param numberOfAccount
	 */
	public Bank(String name, int numberOfAccount){

	}

	/**
	 * 
	 * @param accountNumber
	 * @param accountName
	 * @param balance
	 */
	public void addNew(String accountNumber, String accountName, double balance){

	}

	/**
	 * 
	 * @param accountNumber
	 */
	public BankAccount find(String accountNumber){
		return null;
	}

	public BankAccount getAccounts(){
		return null;
	}

	public String getName(){
		return name;
	}

	public int getNumberOfAccount(){
		return 0;
	}

	public double getTotalBalance(){
		return 0;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		name = newVal;
	}
}//end Bank