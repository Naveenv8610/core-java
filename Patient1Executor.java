class  Patient1Executor{
	public static void main(String appolo[]){
		System.out.println("main started");
		
		Patient1 patient = new Patient1();
		patient.setPatientId(1);
		patient.setPatientName("naveen");
		patient.setAge(23);
		patient.setgender("male");
		
		System.out.println(getPatientId(),+ " " +  getPatientName(), + " " + getAge(), + " " + getGender());
		
		System.out.println("main ended");
		
		
		
	}




}