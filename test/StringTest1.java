class StringTest1{
		public static void main(String[] args){
			String s="muuuuraaaaalllli";
				System.out.println(s);
				char c= s.charAt(4);
				System.out.println(c);
		
				System.out.println(s.trim()); 
				 char[] ChArray=s.toCharArray();
				 for( int j=0;j<ChArray.length;j++){
					 System.out.println(ChArray[j]);
				 }
			}
		
}