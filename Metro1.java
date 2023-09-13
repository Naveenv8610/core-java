class Metro1{
	int metroId;
	int noOfCompartments;
	String source;
	String destination;
	public Metro1(){

		System.out.println("default cons of metro is invoked");
	}
	public Metro1(int metroId , int noOfCompartments , String source , String destination){
		this();
		// invokes default constructor of same class 
		System.out.println("parametrized cons is invoked");
		this.metroId = metroId;
		this.noOfCompartments = noOfCompartments;
		this.source = source;
		this.destination = destination;
		
      	}
    public void displayDetails(){
		System.out.println(" the metro id is " + this.metroId);
		System.out.println("the no Of Compartments are " + this.noOfCompartments);
		System.out.println("the source is " + this.source);
		System.out.println("the destination is " +this.destination);
		
		
		
	}
	
}