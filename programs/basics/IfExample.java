class IfExample {
	public static void main(String args[]){
		int age = 23;
		int val = 2;
		int remainder = age % val;
		
		if(remainder == 0){
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		
		// if(age % 2 == 0) {
			// System.out.println("Even number");
		// }else{
			// System.out.println("Even number");
		// }
	}
}
