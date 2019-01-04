class ThrowTest2{
	public static void main(String[] args){
		long l=8121;
		String name="murali";
		ThrowTest2 j=new ThrowTest2();
		j.details(l);
		try{
			j.details(name);
		}
		catch(Exception d){
			System.out.println("person details");
		}
		void details(long a, String b) {
			
				System.out.println(a);
				System.out.println(b);
	    	}
		}
	}
}