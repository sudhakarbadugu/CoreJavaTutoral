class LogicalOperatorsDemo {
	static public void main(String[] args){
		int x = 30;
		
		if( x > 20 && x < 30){
			System.out.println("more than 20 and less then 30");
		}	
		
		if( x > 20 || x < 30){
			System.out.println("or operator more than 20 or less then 30");
		}
	}
}