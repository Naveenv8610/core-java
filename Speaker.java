class Speaker{
	static String speakerName= "JBL";
	static boolean isConnected ;
	public static void main(String speaker[]){
	System.out.println("main started");
	System.out.println("speaker connection status");
	isConnected= true;
	System.out.println("is speaker connected " + isConnected);
	isConnected= false;
	System.out.println("is speaker connected " + isConnected);
	System.out.println("Main ended");
}
}  