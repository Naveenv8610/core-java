class Passport{
      String passportOffice;
	  String givenName;
	  String surName;
	  String email;
	  String dob;
	  String password;
	  String confirmPassword;
	  public boolean verifyPassword(String password ,String  confirmPassword){
		  
	  
	  System.out.println("inside verifyPassword");
	  boolean isPasswordVerified= false ;
	   
	   if (password==confirmPassword){
		   isPasswordVerified=true;
		   diplayUserDetails();
		  }
		  else {
			  System.out.println("please enter valid password");
			  }
			  return isPasswordVerified;
	  }
	  public void diplayUserDetails(){
		  System.out.println("passport Office is " + passportOffice);
		  System.out.println("the given name  is " + givenName);
		  System.out.println("the sur name is  " + surName);
		  System.out.println("the email is " + email);
		  System.out.println("the dob is  " + dob);
		  System.out.println("the password is   " + password);
		}
		
}