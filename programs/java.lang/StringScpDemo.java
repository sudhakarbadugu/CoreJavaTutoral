class StringScpDemo {
	
	public static void main(String args[]){
		String s = "Sudha";	//only in scp
		s.concat("kar");
		
		String s2 = s.concat("kar");	//heap
		
		String s1 = new String("Sudhakar");	//scp and heap. s1 object points to heap
		
		
		String s3 = "Sudhakar"; //scp
		String s4 = "Sudhakar";
		
		//s3 = s3.concat("b");
		
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		System.out.println(s3);
		
		
	}
}