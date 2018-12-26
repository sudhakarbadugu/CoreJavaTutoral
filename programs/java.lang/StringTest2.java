class StringTest2{
		public static void main(String args[]){
		String s="murali";
		System.out.println(s);
		char d=s.charAt(4);
		System.out.println(d);
		int f=s.codePointBefore(4);
		System.out.println(f);
		int compare= s.compareTo("raju");
		System.out.println(compare);
		String g=s.concat("mirchi");
		System.out.println(g);
		boolean h=s.contains("a");
		System.out.println(h);
		// static String=s.copyValueOf("hari");
		// System.out.println(s);
		 boolean i=s.isEmpty(0);
		 System.out.println(i);
		String names="raju,balu,kamal";
		System.out.println(names);
		
		String[] Arr=names.split("");
		System.out.println(Arr);
		for(int i=s.length-1;i>=0;i--){
			System.out.println(s.charAt(i));
			
		}
			}
		}
		
