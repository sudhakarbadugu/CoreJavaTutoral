class SwapValue{
public static void main(String args[]){
	int a=10;
	int b=20;
	int c=a+b;
	
	a=c-a;  
	b=c-b;
	// System.out.println("before:a="+a+"\tb="+b);
	// System.out.println("after:a="+a+"\tb="+b);
	System.out.println(a);
	System.out.println(b);
}
}