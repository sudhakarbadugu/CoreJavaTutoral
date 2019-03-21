class Logic1{
		public static void main(String... u){
			String name="suuudhhhhaaakaar";
			// StringBuilder m=new StringBuilder();
			// m.append(name.charAt());
			// for(int i=0;i<name.length;i++){
				// char a=name.charAt(i);
				// char b=name.charAt(i-1);
				// if(a!=b){
					// name=name+a;
				// }
			
			// }
			// System.out.println(name);
		// }
// }
StringBuilder s =  new StringBuilder();
s.append(name.charAt(0));

for(int i=1; i<name.length()-1; i++){
	char c = name.charAt(i);
	char c1 = name.charAt(i-1);
	if(c != c1){
		
		name=name+c;
	}

}
System.out.println(name);
}
}