class PatientExecutor{
	public static void main(String pat[]){
		Patient patient = new Patient();
		patient.setPatientId(1);
		patient.setName("naveen");
		patient.setAge(23);
		patient.setConatctNumber(1234567890);
		patient.setDoctorName("Dr sathish");
		patient.setAddress("bangalore");
		patient.setDisease("fever");
		System.out.println("the id of the patient is  " + patient.getPatientId());
		System.out.println("the name of the patient is " + patient.getName());
		System.out.println("the age of the patient is " + patient.getAge());
		System.out.println("the contact number of the patient is " + patient.getConatctNumber());
		System.out.println("the patient is looking to consult doctor called " + patient.getDoctorName());
		System.out.println("the address of the patient is " + patient.getAddress());
		System.out.println("the patient is suffering with " + patient.getDisease());
		
		
		
		
		
	}




}