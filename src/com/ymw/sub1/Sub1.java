package com.ymw.sub1;

public class Sub1 {
	public void test() { // public 지우면 default가되는데
						 // default는 패키지 외부에 접근 불가능.
						 // 그러므로 Main에서 실행 불가능.
		System.out.println("Sub1");
	}
}
