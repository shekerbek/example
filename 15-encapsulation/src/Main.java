
public class Main {

	public static void main(String[] args) {
		car porsche=new car();
		porsche.setModel("911");
        System.out.println(porsche.getModel());
        System.out.println("-------------------------------");
        
        BankAccount MikeAccount=new BankAccount();
        MikeAccount.setAccountNumber(98342);
        MikeAccount.setBalance(200);
        MikeAccount.setCustomerName("Mike");
        MikeAccount.setEmail("Mike@yahoo.com");
        MikeAccount.setPhoneNumber(712);
        
        MikeAccount.withdrawal(222);
        MikeAccount.depositFunds(1000);
        MikeAccount.withdrawal(992);
        
        System.out.println(MikeAccount.getCustomerName());
        
	}

}
