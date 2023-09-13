class SuperMarket{
	static String chocklates[]={"dairymilk" , "fivestar" , "kitkat" , "silk" , "raffelo" , "lindt" , "toblerno" , "snikers" , "Milkyway", "mars" , "bornvilla" , "cadburry" , "lotus" , "amul" , "parle"};
	static String biscuts[]= {"sunfeast" , "hifi" , "britaniabiscut" , "oreo" , "milkybikis" , "marrygold" , "goodday" , "momsmagic" , "ragibiscut" , "jimjam" };
    static String perfumes[]={"calvin clin" , "acqua di parma", "hugo boss" , "chanel" , "christian dior" , "dolce and gabbana " ,"ralph lauren" , "tom ford" , "gucci" , "montblanc" };
    static String soaps []= {"life boy","dove","pears","dettol","mysore sandle","himalaya","santoor","nivea","liril","mamearth"};
    static String snacks[]= {"kurkure","chips","mixture","nachos","chakli","nipput","banana chips","garlic mixture","lotus se eds","moongdal"};
    static String vegetables[]={"carrot","bitroot","cabbage","coliflower","potatao","tomato","beans","cucumber","broccoli","brinjal"};
    static String fruits[]={"apple " , "orange" , "banana" , "litchi" , "dragen fruit" , "kiwi" , "musambi" , "watermellon" , "grapes" ,"pomogranet" };
    static String groceries[]={"butter","cheese","eggs ","milk","curd","meat","suger","millets","ice cream","bread"};
public static  void main(String market[]){
    System.out.println(" the chocklates available are ");
	System.out.println(chocklates.length);
	for (int chocklate=0 ; chocklate<chocklates.length ; chocklate++){
	System.out.println(chocklates[chocklate]);
	}
	for (int chocklate=chocklates.length-1 ; chocklate>=0 ; chocklate--){
		System.out.println(chocklates[chocklate]);
	}
	System.out.println(" the biscuts available are");
	for (int biscut=0 ; biscut< biscuts.length ; biscut++){
	System.out.println(biscuts[biscut]);
   }
   for (int biscut=biscuts.length-1 ; biscut>=0 ; biscut--){
   System.out.println(biscuts[biscut]);
}
System.out.println(" the perfumes available are");
	for (int perfume=0 ; perfume< perfumes.length ; perfume++){
	System.out.println(perfumes[perfume]);
   }
   for (int perfume=perfumes.length-1 ; perfume>=0; perfume--){
   System.out.println(perfumes[perfume]);
}
System.out.println(" the soaps available are");
	for (int soap=0 ; soap< soaps.length ; soap++);
	System.out.println(soaps[soap]);
   }
   for (int soap<soaps.length-1 ; soap>=0 ; soap--){
   System.out.println(soaps[soap]);
}
System.out.println(" the snacks available are");
	for (int snack=0 ; snack< snacks.length ; snack++){
	System.out.println(snacks[snack]);
   }
   for (int snack=biscuts.length-1 ;snack>=0 ; biscut--){
   System.out.println(snacks[snack]);
}
System.out.println("the vegetables available are ");
for (int vegetable=0 ; vegetable<vegetables.length ; vegetable++){
	System.out.println(vegetables[vegetable]);
	}
	for (int vegetable=vegetables.length-1 ; vegetable>=0 ; vegetable--){
		System.out.println(vegetables[vegetable]);
	}
	System.out.println("the fruits available are ");
for (int fruit=0 ; fruit<fruits.length ; fruit++){
	System.out.println(fruits[fruit]);
	}
	for (int fruit=fruits.length-1 ; fruit>=0 ; fruit--){
		System.out.println(fruits[fruit]);
	}
	System.out.println("the groceries available are ");
for (int grocerie=0 ; grocerie<groceries.length ; grocerie++){
	System.out.println(groceries[grocerie]);
	}
	for (int grocerie=groceries.length-1 ; grocerie>=0 ; grocerie--){
		System.out.println(groceries[grocerie]);
	}
	}
	}
	