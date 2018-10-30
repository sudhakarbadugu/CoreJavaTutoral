package com.ss.pack;

import com.ss.pack1.MathUtil;
// import com.ss.pack1.*;

class B {
	public static void main(String[] a){
		System.out.println("Hello package B");
		
		int val = MathUtil.squre(10);
		System.out.println(val);
		
		int val1 = com.ss.pack1.StringUtil.squre(10);
		System.out.println(val1);
		
		//A.a1();
		A.a2();
		A.a3();
	}
}

