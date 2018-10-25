abstract class AbstractExample {
	int a = 20;
	
	public abstract void calculateIntrest();
	public void m1(){
		System.out.println("m1");
	}

}

class AbChild extends AbstractExample {
	public void calculateIntrest(){
		System.out.println("child cal");
	}
}


class AbstractDemo {
	public static void main(String[] args){
		AbstractExample a = new AbChild();
		a.calculateIntrest();
		System.out.println(a);
		
	}
}