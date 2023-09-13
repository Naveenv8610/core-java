class ZomatoExecutor{
	public static void main( String args[]){
		double price=0.0;
		double pricewithquantity=0.0;
		System.out.println("main started ");
		price = Zomato2.search("muttonPizza");
		System.out.println("the price for the mutton pizza is " +price); 
		pricewithquantity=Zomato2.search("muttonPizza",3);
		System.out.println("the price for the pizza with  3 quantityis " + pricewithquantity);
		System.out.println("main ended");
	}
}