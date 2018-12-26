class StringBufferTest1{
	public static void main(String...a){
		StringBuffer m=new StringBuffer("hello");
		m.append("microsoft");
		System.out.println(m);
		m.insert(3,"microsoft");
		System.out.println(m);
		m.delete(1,3);
		System.out.println(m);
		m.reverse();
		System.out.println(m);
		m.length();
		System.out.println(m);
		m.capacity();
		System.out.println(m.capacity());
		m.insert(7,"microsoft");
		System.out.println(m);
	
		System.out.println(m.hashCode());
		String name="hello murali";
		System.out.println(name.lastIndexOf('m'));
	    System.out.println(name.substring(1,5));
	
	}
	
}