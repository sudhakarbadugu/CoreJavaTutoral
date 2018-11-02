class StringTest {

	public static void main(String[] args){
		String s = "Sudha"; 
		System.out.println(s);
		
		s = s.concat("kar");
		System.out.println(s);
		
		int index = s.indexOf("b");
		if(index != -1){
			System.out.println("available "+ index);
		}else{
			System.out.println("not available" + index);
		}
		
		boolean b = s.contains("k");
		System.out.println(b);
		
		char c = s.charAt(5);
		System.out.println(c);
		
		int compare = s.compareTo("Sudhakar");
		System.out.println(compare);
		
		boolean eq = s.equals("sudhakar");
		System.out.println(eq);
		
		eq = s.equalsIgnoreCase("sudhakar");
		System.out.println(eq);
		
		boolean startWith = s.startsWith("Su");
		System.out.println(startWith);
		
		boolean endsWith = s.endsWith("Su");
		System.out.println(endsWith);
		
		s = s.replace("kar", "Badugu");
		System.out.println(s);
		
		String name = " Murali ";
		System.out.println(name.trim());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		char[] chArray = name.toCharArray();
		for(int i=0 ;i<chArray.length; i++){
			System.out.println(chArray[i]);
		}
	}
}