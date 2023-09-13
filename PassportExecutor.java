class PassportExecutor{
       public static void main( String pass[]){
         Passport passport = new Passport();
         passport.passportOffice= "bangalore";
         passport.givenName= "naveen";
         passport.surName="v";
         passport.email="naveen@gmail.com";
         passport.dob= "01-sep-2000";
         passport.password= "naveen@123";
         passport.confirmPassword= "naveen@123";
		 passport.verifyPassword(passport.password,passport.confirmPassword);
		 
		 
		   
		   
		   
		   
	   }
}