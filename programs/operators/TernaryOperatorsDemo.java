class TernaryOperatorsDemo {
	static public void main(String[] args){
		int x = 21;
		
		String text = x  % 2 == 0 ? "even number" : "odd number";
		System.out.println(text);
		
		int y = 1;
		
		int age = y < 0 ? 0 : y;
		System.out.println(age);
		
	}
}