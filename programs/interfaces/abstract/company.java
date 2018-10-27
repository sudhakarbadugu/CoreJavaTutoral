abstract class company{
    public abstract void salaryInfo();
	void personInfo(){
		System.out.println("nm");
	}
}
class emp extends company{
	public void salaryInfo(){
		System.out.println("lakhs");
	}
	 void personInfo(){
		System.out.println("murali");
	}
}
class status{
	
	public static void main(String...a){
		company b=new emp();
		b.salaryInfo();
		b.personInfo();
		System.out.println(b);
		// System.out.println(b);
	}
}