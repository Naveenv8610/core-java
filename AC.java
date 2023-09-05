class AC{
    static boolean isConnected;
	static int minCooling;
	static int maxCooling = 10;
	static int currentCoolinng;
	public static boolean OnorOff(){
		if(isConnected==false){
		isConnected=true;
		System.out.println("the cooler is turned on now");
		}
		else if (isConnected==true){
		isConnected=false;
		}
		System.out.println("the cooler is turned off now ");
			
			return isConnected;
			}
      public static void increaseCooling(){
		  System.out.println("start of increaseCooling");
		  if (isConnected==true){
	      if (currentCoolinng<maxCooling){
			  currentCoolinng=currentCoolinng+1;
			  System.out.println("the currentCoolinng is " + currentCoolinng);
		  }
		  else {
				  System.out.println("max cooling reached ");
				  }
							 System.out.println("end of incrase cooling");
				 
		  }
	  }
		  	  
			public static void decreaseCooling(){
				System.out.println("start of decrease cooling");
				if (isConnected==true){
				if (currentCoolinng>minCooling){
					currentCoolinng=currentCoolinng-1;
					System.out.println("the currentCoolinng is " + currentCoolinng);
				}	
					else {
						System.out.println(" min cooling reached");
					}
			 System.out.println("end of decrese cooling");
			 
			 }
				
			}
         }		


