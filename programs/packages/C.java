package com.ss.pack1;
import com.ss.pack.A;

public class C extends A{
	public static void main(String[] a){
		System.out.println("Hello package C");
		//A.a2(); can't call because it default.
		//A.a3();
		
		C c = new C();
		// d.a1();
		// d.a2();
		c.a3();//C is child of A
		c.a4();
		
	}
}

class D{
	public static void main(String[] a){
		System.out.println("Hello package C");
		//A.a2(); can't call because it default.
		//A.a3();
		
		D d = new D();
		// d.a1();
		// d.a2();
		d.a3();//CE: D is not a child of A
		d.a4();
		
	}
}
