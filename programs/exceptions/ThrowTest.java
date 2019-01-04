class ThrowTest{

	public static void main(String...a){
	int s=1000;
	int v=2000;
	ThrowTest q=new ThrowTest();
	q.salaryFund(v);

try{
		q.salaryFund(s);
}
catch(Exception k){
	
	System.out.println("non employes");
}
	}
	void salaryFund(int t){
		if(t>=1000){
			System.out.println(t);
		}
		else{
			throw new ArithmeticException("job holder");
		}
	}
}
