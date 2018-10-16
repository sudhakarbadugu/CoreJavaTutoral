interface Loan {
	public static final int carLoanRate = 15;
	int peronalLoanRate = 20;
	static int houseLoanRate = 25;
	
	void calculateIntrest();
	public abstract void calculatePersonalIntrest();
}

class PersonalLoan implements Loan{

	public void calculateIntrest(){
		System.out.println("Calcaulate intrest");
	}
	
	public void calculatePersonalIntrest(){
		System.out.println("Calcaulate personal intrest");
	}
}

class LoanTest {
	static int a;
	public static void main(String[] args){
		LoanTest.a = 25;
		// Loan.peronalLoanRate = 30;
		System.out.println(Loan.carLoanRate);
		System.out.println(Loan.peronalLoanRate);
		System.out.println(LoanTest.a);
		
		Loan p = new PersonalLoan();
		p.calculateIntrest();
		p.calculatePersonalIntrest();
		
	}
}
