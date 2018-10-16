class InstanceOf2{
 public static void main(String[] args){
	 A a=null;
	 a.r1();
	 if(a instanceof A){
		 System.out.println("m");
	 }
 }
} 
class A{
	public void r1(){
	System.out.println("values");
}
}