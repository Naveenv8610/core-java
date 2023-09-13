class AjioExecutor{
	public static void main( String args[]){
		double price=0.0;
		double pricewithquantity=0.0;
		System.out.println("main started ");
		price = Ajio.search("menpant");
		System.out.println("the price for the men pantis " +price); 
		pricewithquantity=Ajio.search("menpant",3);
		System.out.println("the price for the men with  3 quantityis " + pricewithquantity);
		System.out.println("main ended");
	}
}