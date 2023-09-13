class Patient{
	private int patientId;
	private String attenderName;
	private int wardNo;
	private String admittedDate;
	private String hospitalName;
	private String gender;
    private String name;
	private int age ;
	private long contactNumber;
	private String doctorName;
	private String address;
	private String disease;
	
	
	public void setPatientId( int patientId){
		this.patientId = patientId;
	}
	public int getPatientId(){
		return patientId;
	}
	public void setAttenderName(String attenderName){
		this.attenderName = attenderName;
	}
	public String getAttenderName(String attenderName){
		this.attenderName = attenderName;
	}
	public void setWardNo( int wardNo){
		this.wardNo = wardNo;
	}
	public int getWardNo(){
		return wardNo;
	}
	public void setAdmittedDate( String admittedDate){
		this.admittedDate;
	}
	public String getAdmittedDate(){
		return admittedDate;
	}
	public void setHospitalName(String hospitalName){
		this.hospitalName = hospitalName;
	}
	public String getHospitalName(){
		return hospitalName;
	}
	  public void setGender(String gender){
		  this.gender = gender;
	  }
	  public String getGender(){
		  return gender ;
	  }
	  public void setName(String name){
		  this.name = name;
	  }
    public String getName(){
		return name;
	}
    public void setAge(int age){
		this.age = age;
	}
    public int getAge(){
		return age;
	}
    public void setConatctNumber( long contactNumber){
		this.contactNumber = contactNumber;
	}
    public long getConatctNumber(){
		return contactNumber;
	}
	public void setDoctorName( String doctorName){
		this.doctorName = doctorName;
	}
	public String getDoctorName(){
		return doctorName;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setDisease(String disease){
		this.disease = disease ;
	}
	public String getDisease(){
		return disease;
	}
}