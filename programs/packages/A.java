package com.ss.pack;

public class A {
	public static void main(String[] a){
		System.out.println("Hello package");
		a1();
		a2();
	}
	
	
	private static void a1(){
		System.out.println("a1 private method");
	}
	
	static void a2(){
		System.out.println("a2 default method");
	}

	protected static void a3(){
		System.out.println("a2 public method");
	}
	
	public static void a4(){
		System.out.println("a2 public method");
	}
}
