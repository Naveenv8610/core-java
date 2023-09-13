class ApartmentExecutor{
	public static void main(String args[]){
		Apartment apartment = new  Apartment();
		apartment.apartmentId= 1;
		apartment.apartmentName= "devine";
		apartment.apartmentLocation= "kalyanNagar";
		apartment.noOfFloors= 50;
		apartment.noOfTwoBhkFlats= 10;
		apartment.noOfTHreeBhkFlats=10;
		System.out.println("apartment id is " + apartment.apartmentId);
		System.out.println("the apartment location is " + apartment.apartmentLocation);
		System.out.println("the no of floors in the apartment are " + apartment.noOfFloors);
		System.out.println("the no of two bhk flats available in the apartment are " +apartment.noOfTwoBhkFlats);
		System.out.println("the no of three bhk flats available in the apartment are" + apartment.noOfTHreeBhkFlats);
		
		
		apartment.provideAccomadation();
		
	}
	
	
	
	
}