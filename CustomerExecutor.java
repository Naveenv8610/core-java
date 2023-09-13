class CustomerExecutor{
  public static void main(String cust[]){
	  
	  
	  Customer customer = new Customer();
	  customer.setCustomerID(1);
	  customer.setCustomerName("Naveen");
	  customer.setAddress("bangalore");
	  customer.setContactNumber(1234567890);
	  customer.setDob("01-09-2000");
	  customer.setEmail("naveen@gmail.com");
	  customer.setGender("male");
	  System.out.println("the customer id is " +customer.getCustomerID());
	  System.out.println("the customer name is " + customer.getCustomerName());
	  System.out.println("the address of the cuatomer is " + customer.getAddress());
	  System.out.println("the contact number is " + customer.getContactNumber());
      System.out.println("the dob of the customer is " + customer.getDob());
      System.out.println("the mail id of the customer is " + customer.getEmail());
      System.out.println("the gender of the person is " + customer.getGender());	  
	  
  }




}
//patient , bank , railwayststion , postoffice, 