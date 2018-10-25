interface A {
	void m1();
}

interface B extends A {
	void m1();
}

class C implements B, A {
	public void m1(){
	}

}