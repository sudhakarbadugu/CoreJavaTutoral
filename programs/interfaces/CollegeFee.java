interface CollegeFee{
	public static final int payFee=10000;
	int scholarFee=5000;
	public String collegeName="sv college";
	
	public  abstract void collegeFee1();
	void fee();
	public abstract void  collegeName();

}
class collegeDetails implements CollegeFee{
	public void collegeFee1(){
		System.out.println("payFee");
	}
	public void fee(){
		System.out.println("scholarFee");
	}
	public void collegeName(){
		System.out.println("sv college");
	}
}
class FeeDetails{
	public static int a;
	public static void main(String[] args){
		FeeDetails.a=23;
		System.out.println(CollegeFee.payFee);
		System.out.println(CollegeFee.scholarFee);
		System.out.println(CollegeFee.collegeName);
		System.out.println(FeeDetails.a);
		CollegeFee p=new collegeDetails();
		p.collegeFee1();
		p.fee();
		p.collegeName();
	}
}