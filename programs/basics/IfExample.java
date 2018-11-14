class IfExample {
	public static void main(String args[]){
		int marks = 25;
		
		if(marks >= 60 && marks < 70){
			System.out.println("first class");
		}
		
		if(marks >= 70 && marks < 80 ){
			System.out.println("Distinction");
		}
		
		if(marks >= 80 ){
			System.out.println("Topper");
		}
		
		if(marks < 35){
			System.out.println("Failed");
		}		
		else {
			System.out.println(" Just Pass");
		}
	
		System.out.println("End");
	}
}
