class IfExample2 {
	public static void main(String args[]){
		int i = 11;
		
		if(i < 10){
			i = i + 10;
		}
		
		if(i % 2 == 0){
			System.out.println("Even number: " + i);
		}
		else {
			System.out.println("Odd number");
		}
		
		
		System.out.println("Value: "+ i);
	}
}