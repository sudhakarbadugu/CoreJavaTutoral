class SwitchDemo {
	
	static public void main(String[] a){
		
		int age = 6;
		String s = "1";
		
		switch(age){
			case 1: {
				System.out.println("Baby");
				break;
			}
			
			case 2: {
				System.out.println("Pre class");
				break;
			}
			
			case 3: {
				System.out.println("LKG");
				break;
			}
			
			case 5: {
				System.out.println("UKG");
				break;
			}
			// System.out.println("middle");
			case 6: {
				int ab = 20;
				System.out.println("First");
				
			System.out.println("middle");
			
				break;
			}
						
			default: {
				System.out.println("Big man");
			}
		}
	}
}