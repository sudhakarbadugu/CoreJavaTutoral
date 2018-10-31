class MathTest {

	public static void main(String[] args){
		double a = 25.26;
		
		System.out.println(Math.abs(a));	//minus to positive
		System.out.println(Math.round(a));  //0.5 to 1 or 
		System.out.println(Math.ceil(a)); //next
		System.out.println(Math.floor(a)); //previous
		System.out.println(Math.sqrt(a)); //previous
		
		double b = Math.random() * 100;
		System.out.println(b);
	}
}