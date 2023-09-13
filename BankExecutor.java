class BankExecutor{
    public static void main (String ban[]){
		Bank bank = new Bank();
		bank.setName("naveen");
		bank.setAge(23);
		bank.setEmail("naveen@gmail.com");
		bank.setContactNumber(1234567890);
		bank.setAccountType("savings");
		bank.setAddress("bangalore");
		System.out.println("the name of the person is " + bank.getName());
		System.out.println("the age of the person is " + bank.getAge());
		System.out.println("email id is " + bank.getEmail());
		System.out.println("contact no is " + bank.getContactNumber());
		System.out.println("the type of the account is " + bank.getAccountType());
		System.out.println("address is " + bank.getAddress());
		
		
		
		
	}   
}