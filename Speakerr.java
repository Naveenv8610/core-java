class Speakerr{
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=7;
	static int currentVOlume;
	public static boolean OnorOff(){
     if (isConnected==false){
		 isConnected=true;
		 System.out.println("the speaker is turned on ready to ennjoy");
	 }
	 else if (isConnected==true){
		 isConnected=false;
		 System.out.println("the speaker is turned off");
	 }
	 return isConnected;
	}

         public static void increaseVolume(){
		 System.out.println("start of increase volume");
		 if (isConnected==true){
		 if (currentVOlume < maxVolume){
			 currentVOlume = currentVOlume+1;
			 System.out.println("the current volume is " + currentVOlume);
		 }
		 else {
			 System.out.println("max volume is reached");
		 }
		 }else {
			 System.out.println("gube.. first spaker on mado..");
		 }
		 System.out.println("end of increase volume");
		 }

       public static void decreaseVolume(){
		   System.out.println("start of decrease volume ");
		   if (isConnected=true){
		   if (currentVOlume>minVolume){
			   currentVOlume=currentVOlume-1;
			   System.out.println("the currentvolume is " + currentVOlume);
			   }
			   else {
				   System.out.println("min volume reached");
				   
			   }
       System.out.println("end of decreae volume");		
		}
		   
		   
	   }
		   
}


