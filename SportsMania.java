class SportsMania{
	static String top10CricketBatsman[]={"babar azam " , "rassie van der dussen" , "fakhar zaman" , "imam-ul-haq" , "harry tector" , "david warner " , "shubhman gill" , "quinten de cock" , "virat kohli" , "steve smith"};
	static String top10CricketTeams[]={"australia " , "pakistan" , "india" , "newzland" , "england" , "south africa" , "bangladesh" , "afganistan" , "srilanka" , "west indies"};
	static String top10HockeyTeams[]={"australiaa" , "belgium" , "netherlands" , "germany" , "india" , "england" , "argentina" , "spain" , "new zealand" , "malaysia"};
	static String top10TennisPlayers[]={"novak djokovic" , "rafael nadal " , "daniil" , "carlos Alcaraz" , "casper ruud" , "Felix auger Aliassime" , "stefonas tsitsipas" , "andrey rublev", "hubert hurkacz " , "jannik sinner"};
	static String top10CricketBowlers[]={"josh hazelwood ", "michel starc" , "rashid khan" , "mohammed siraj" , "matt henry " , "mujreeb ur rahaman", "tent boult" , "adam zampa" , "shahid afridi" ,"shakib al hasan"};
	public static void main(String sports[]){
		System.out.println("main started");
		System.out.println("Top 10 cricket batsman are");
		for (int batsman=top10CricketBatsman.length-1; batsman >=0 ; batsman--){
			System.out.println(top10CricketBatsman[batsman]);
		}
		System.out.println("TOp 10 cricket teams are");
System.out.println(top10CricketTeams.length);
for (int teams=top10CricketTeams.length-1 ; teams>=0; teams--){
	System.out.println(top10CricketTeams[teams]);
}
		System.out.println(" Top 10 hockey teams are");
		System.out.println(top10CricketTeams.length);
		for (int hockeyTeams=top10HockeyTeams.length-1 ; hockeyTeams >=0; hockeyTeams--){
			System.out.println(top10HockeyTeams[hockeyTeams]);
		}
		System.out.println(" Top 10 tennis players are");
	System.out.println(top10TennisPlayers.length);
	for (int players=top10TennisPlayers.length-1 ; players >=0  ; players--){
		System.out.println(top10TennisPlayers[players]);
	}
		System.out.println(" Top 10 cricket bowlers are");
		System.out.println(top10CricketBowlers.length);
		for (int bowlers=top10CricketBowlers.length-1 ; bowlers >=0; bowlers--){
		System.out.println(top10CricketBowlers[bowlers]);
		}
		System.out.println(" main ended ");
	}
}