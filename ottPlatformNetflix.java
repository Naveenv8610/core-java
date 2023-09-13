class ottPlatformNetflix{
	static String kannadaMovies[]={"love mocktail" , "yuvaratna" , "kavaludari" , "pogaru" , "jaguar" , "pailwaan" , "shatru" , "kabza" , "raider" , "ratavara" , "kgf2" , "kgf1" , "viram" , "drishyam2" , "drishyam1" , "govinda govinda" , "ramarjuna" , "uturn" , "777charle" , "kantara" , "rangitaranga" , "hero" , "ananya" , "yodha" , "rajkumara"};
	static String englishSeries[]={"heartstopper" , "great anatomy" , "avatar" , "the hunt for veerappan" , "shameless", "sister sister" , "jane the vergin" , "orange is the new black", "the blacklist" , "narcos","stranger things","dark" , "our planet" , "ozark" , "peaky blinders " , "money heist","sherlok homes" , "breaking bad" , "chernobyl" ,"the office","friends"};
 	static String hindiSeries[]={"sacred games" , "delhi crime"," little things" , "selection day" , "bard of blood" , "narcoss" , "hostags" , "ghoul" , "scoop" , "masaba masaba" , "aranyak","decoupled", "ray" ,"taj mahal" , "jamtara"};
	static String teluguMovies[]={"magdheera" , "orange" , "chirutha" , "yavadu" , "racha", "dhruva" , "govindudu andarivadele" , "bruclee" , "nayak" , "vinaya videya rama " , "rangasthalam" , "zanjeer" , "acharya" , "RRR" , "Game changer" , "gabbar singh" , "attarintiki daaredi" , "agnathavasi" , "vakeelsaab", "bheemlanayak" , "BRO" , "katamarudu" , "khaidi" , "saira narasimhareddy" , "oG"};
	static String malayalamMovies[]={"Drishyam" , "bangalore days" , "premam" , "manchichitrathazhu" , "ustad hotel" , "maheshhinte prathikaram" , "thoovanthathumbikal" , "charlee" , "thaniyavarathanam" ,"kireedam" , "pranchiyettan and the saint" , "nadodikattu" , "northern story of valur","munnariyippu","kilukkam","thondi muthalum driksakshiyum" , "mumbai police ","kumbalangi nights ", "pulimurugan", "amaram" ,"chithram","pathemari" , "devasuram", "bharatham" ,"pathu thala"};
	public static void main(String movies[]){
		System.out.println("main started");
		System.out.println("the kannada movies in netflix are");
		System.out.println(kannadaMovies.length);
	for (int kannada=kannadaMovies.length-1 ;kannada>=0 ; kannada--){
	System.out.println(kannadaMovies[kannada]);
	}	
		System.out.println(" the engish series in netflix are ");
	System.out.println(englishSeries.length);
	for (int english=englishSeries.length-1 ; english>=0; english--){
		System.out.println(englishSeries[english]);
	}
		System.out.println("the hindi series in netflix are ");
		System.out.println(hindiSeries.length);
		for (int hindi=hindiSeries.length-1 ; hindi >=0 ; hindi--){
			System.out.println(hindiSeries[hindi]);
		}
		System.out.println("the telugu movies in netflix are");
       System.out.println(teluguMovies.length);
	   for (int telugu=teluguMovies.length-1 ; telugu >=0 ; telugu--){
		   System.out.println(teluguMovies[telugu]);
	   }
		System.out.println(" the malayalam Movies in netflix are");
		System.out.println(malayalamMovies.length);
	for (int malayalam=malayalamMovies.length-1 ; malayalam >=0 ; malayalam--){
		System.out.println(malayalamMovies[malayalam]);
	}
		
		
	System.out.println("main ended");
	}
}