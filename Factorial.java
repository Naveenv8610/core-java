class Factorial {
	public static void main(String fact[]){
		int factNumber= 5;
		int dummy= 1;
		for (int factNum=1 ; factNum<= factNumber ; factNum++){
			dummy = dummy *factNum;
		}
		System.out.println(" The factorial of" + factNumber + "is" + dummy);
	}
}