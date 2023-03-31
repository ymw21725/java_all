// 다수의 인터페이스로부터 다중상속을 받아 단일 구현 클래스에서 모든 구현을 함으로써
// 기능을 통합하고 객체 생성시 각각의 인터페이스 타입 변수로 개별 구현 객체를 가리킴으로써
// 통합된 기능의 선별 사용 가능

interface Func1 {
	void func1_1();
	void func1_2();
}

interface Func2{
	void func2_1();
	void func2_2();
}

class ImpleClass implements Func1, Func2 {	// 클랠스에 다중구현 인터페이스 적용.

	@Override
	public void func2_1() {
		System.out.println("func2_1");
	}

	@Override
	public void func2_2() {
		System.out.println("func2_2");
	}

	@Override
	public void func1_1() {
		System.out.println("func1_1");
	}

	@Override
	public void func1_2() {
		System.out.println("func1_2");
	}
	
}

public class Main69 {
	public static void main(String[] args) {	// 다중상속을 받은 구현 클래스 타입의 객체를 생성하여 각각의 인터페이스
		Func1 t1 = new ImpleClass();			// 타입의 변수로 받음으로써 인터페이스 타입에 따라 사용가능한 메서드가
		Func2 t2 = new ImpleClass();			// 선별. 즉, 다수의 동일타입의 객체를 생성하더라도 어떤 인터페이스 타입
												// 으로 객체를 받느냐에 따라 사용 가능한 메서드가 자동 선별됨으로써
		t1.func1_1();							// 상황의 변화에 따라 동일타입 객체에 대한 통합기능을 선별하여 활용가능
		t1.func1_2();
//		t1.func2_1();	// t1에는 2_1, 2_2가 없다.
//		t1.func2_2();
		
		t2.func2_1();
		t2.func2_2();
//		t2.func1_1();	// t2에는 1_1, 1_2가 없다.
//		t2.func1_2();
	}

	// 클래스로 하나로 묶어서 쓸뿐 41,42번째 행에서 func1이냐 func2이냐에 따라 쓸수 있는지 없는지 파악된다.
}
