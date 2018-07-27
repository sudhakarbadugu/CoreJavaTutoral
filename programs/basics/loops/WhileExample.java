class WhileExample {
	static public void main(String[] args){
		
		int i = 1;
		
		while(i <= 1000){
			System.out.println(i);
			i = i + 1;
			
			if(i == 100){
				break;
			}
		}
		
		System.out.println("********************");
		
		// int b = 100;
		// while(b > 0){
			// System.out.println(b);
			// b = b-1;
		// }
	}
}