class SwiggyExecutor3 {
	public static void main(String fooddelivery []){
		double price=0.0;
		System.out.println("main started");
		double pricewithquantity=Swiggy3.search("pizza," , 3);
		System.out.println("the price for the pizza " +pricewithquantity);
		System.out.println("main ended");
	}
}
