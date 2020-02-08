
public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	public int getAccountNumber() {
		return accountNumber;
	
	}
	
	public void depositFunds(double depositAmount){
		this.balance+=depositAmount;
	}
	public void withdrawal(double withdrawalAmount){
		if(this.balance-withdrawalAmount<=0){
			System.out.println("you only have "+this.balance+" available withdrawal can not be processed");
		}else{
			this.balance-=withdrawalAmount;
			System.out.println("withdrawal amount "+withdrawalAmount+" completed remaining balance is "+this.balance);
		}
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
