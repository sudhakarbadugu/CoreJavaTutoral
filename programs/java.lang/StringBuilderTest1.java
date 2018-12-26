class StringBuilderTest1{
	public static void main(String[] args){
	StringBuilder k=new StringBuilder("murali");
	k.append("badgu");
	System.out.println(k.toString());
	 System.out.println(k.toString());
	 k.insert(2,"u");
	 System.out.println(k);
	 int m=k.lastIndexOf("badgu");
	 System.out.println(m);
	 int e=k.capacity();
	 System.out.println(e);
	 int j=k.codePointAt(0);
	 System.out.println(j);
	 StringBuilder r=new StringBuilder("sudhakar");
	 r.delete(1,5);
	 System.out.println(r);
	}
}