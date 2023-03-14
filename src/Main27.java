class Car4{	// 참조형, 기본형 구분예제 무조건 구분할줄 알아야함!
	String name;
}

public class Main27 {
	public static void main(String[] args) {
		Car4 pride = new Car4();
		
		pride.name = "프라이드";
		System.out.println(pride.name);	// 프라이드
		
		method(pride);
		System.out.println(pride.name); // 실수
	}
	
	static void method(Car4 c) {
		c.name = "실수";
	}
}
