class StringScp1{
		public static void main(String[] args){
			String s="murali";
			s.concat("yadav");
			String s1=s.concat("yadav");
			System.out.println(s1);
			String s2=new String("muraliYadav");
			String s3="muraliYadav";
			String s4="muraliYadav";
			System.out.println(s1==s3);
			System.out.println(s1.equals(s3));
			System.out.println(s);
			
		}
}