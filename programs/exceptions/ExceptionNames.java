class ExceptionNames{
	public static void main(String...a){
	String names[]={"murali","ashok","rajesh","prasad"};
	int s={1,2,3,4,5};
	try{
		for(int e=1;e<=4;e++){
	System.out.println(names[e]);
	}
	for(int x=0;x<=5;x++){
		System.out.println(s[x]);
	}
	}
	catch(Exception k){
	System.out.println(k);
	}
	}
}