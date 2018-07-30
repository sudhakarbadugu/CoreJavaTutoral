class RelationalOperatorsDemo {
	static public void main(String[] args){
		int a = 10, b = 21;
		
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		
		if( a % 2 == 0 ){
			System.out.println("even");
		}
		
		
		if( b % 2 != 0 ){
			System.out.println("odd");
		}
	}
}