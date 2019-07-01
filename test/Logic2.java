class Logic2{
		public static void main(String[] args){
		String s="murali";
		StringBuilder e =new StringBuilder();
		
		e.append(s.charAt(0));
		for(int i=1;i<s.length()-1;i++){
			char a=s.charAt(i);
			char a1=s.charAt(i-1);
			if(a != a1){
				s=s+a;
			}
		}
					System.out.println(s);

		
		}

}