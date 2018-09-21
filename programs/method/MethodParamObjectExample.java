class MethodParamObjectExample {
	public static void main(String[] args){
		MethodParamObjectExample e = new MethodParamObjectExample();
		e.m1(true);
		
		e.m2(e);
		
		StringBuilder sb = new StringBuilder();
		MethodParamObjectExample.m3(sb);
	}

	public void m1(boolean a){
		System.out.println("m1");
	}
	
	public void m2(MethodParamObjectExample f){
		System.out.println("m2");
	}
	
	public static void m3(StringBuilder a){
		System.out.println("m3");
	}
}