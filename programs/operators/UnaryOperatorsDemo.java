class UnaryOperatorsDemo {
	static public void main(String[] args){
		int x = 10;
		
		System.out.println(x);	//10
		System.out.println(x++); //10
		System.out.println(x); //11
		
		int y = 20;
		
		System.out.println(--y);
		
		boolean value = false;
		if(!value){	//ony boolean types we should use this
			System.out.println(value);
		}
		
		int c = -21;
		System.out.println(~c);	//only number types
		
		System.out.println(~value);
	}
}