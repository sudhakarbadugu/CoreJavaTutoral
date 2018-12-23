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
		
		char c = s.charAt(3);
		System.out.println(c);
		
		int compare = s.compareTo("Sudhakar1");
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
		
		StringBuffer sb = new StringBuffer(name);
		boolean res = name.contentEquals(sb);
		System.out.println(res);
		System.out.println(name.hashCode());
		
		String village = "karuru yes ra";
		System.out.println(village.indexOf('r', 6));
		System.out.println(village.lastIndexOf('r'));
		System.out.println(village.substring(0, 5));
		System.out.println(village.substring(5));
		
		String names = "ram,sham,mam";
		System.out.println(names);
		
		String[] nameArr = names.split(",");
		for(String s1 : nameArr){
			System.out.println(s1);
		}
		
		// String[] s2Arr = s.split("");
		// int count = 0;
		// for(String s3: s2Arr){
			// if("a".equalsIgnoreCase(s3)){
				// count++;
			// }
		// }
		char[] s2Arr = s.toCharArray();
		int count = 0;
		for(char s3: s2Arr){
			if('a' == s3){
				count++;
			}
		}
		
		// for(int i=s2Arr.length - 1; i>=0 ; i--){
			// System.out.println(s2Arr[i]);
		// }
		
		
		for(int i=s.length() - 1; i>=0 ; i--){
			System.out.println(s.charAt(i));
		}
		
		System.out.println(count);
	}
}