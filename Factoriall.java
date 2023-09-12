class Factoriall {
	public static void main (String fact[]){
    System.out.println("main started");
getFact(6);
getFact(7);
getFact(8);
    System.out.println("main ended ");
	}
 public static void getFact(int factNumber){
   System.out.println("getFact started");
   int fact=1;
  for (int n=1 ; n< factNumber; n++){
     fact = fact * n;	  
  }
    System.out.println("The facoriall of " + factNumber + "is" + fact);
	System.out.println("getFact ended");
 }
}