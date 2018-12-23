class Murali12{
	public static void main(String args[]){
	String s="murali";
	System.out.println(s);
	
	 s=s.concat("murali");
	System.out.println(s);
		
	int compare=s.compareTo("murali");
		System.out.println(compare);
		char c=s.charAt(3);
		System.out.println(c);
		byte[] getBytes =s.getBytes();
		System.out.println(s);
		int lastIndexOf=s.lastIndexOf("yadav");
		System.out.println(s);
		 String Intern=s.Intern("murali");
		System.out.println(s);
		s=s.replace("li","badugu");
		System.out.println(s);
		String name="murali";
		System.out.println(s.trim());
		
		String toLowerCase=s.toLowerCase();
		System.out.println(toLowerCase);
		int length=s.length();
		System.out.println(length);
	
		char[] t=s.toCharArray();
		System.out.println(s);
		int index=s.indexOf("a");
		if(index!=-3){
			System.out.println("avaiable"+index);
		}
		else{
			System.out.println("not avaiable"+index);
		}
		s=s.replace("murali","prasad");
		System.out.println(s);
		}
}

