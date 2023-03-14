package com.ymw.main;
import com.ymw.sub1.Sub1;

class Sub2 {
	private void test() {
		System.out.println("sub2");
	}
}

// 다른 패키지 불러오려면 import해서 경로 지정해줘야한다.
public class Main {
	public static void main(String[] args) {
		Sub1 sub1= new Sub1();
		Sub2 sub2= new Sub2();
		
//		sub2.test();
	}
}
