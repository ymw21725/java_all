// final 클래스 : 클래스 상속 금지
// final 필드 : 상수 필드 설정
// final 메서드 : 메서드 재정의 금지(오버라이딩금지)

final class SuperClass1{	// final 클래스 : 클래스에 final 지정함으로써 상속불가능.
	void out() {
		System.out.println("final 클래스");
	}
}

//class SubClass1 extends SuperClass1{	// 즉 상속불가능!!! 
//	void out() {
//		System.out.println("서브 클래스");
//	}
//}

class SuperClass2 {
	final void out() {						//final 메서드 : 메서드에 final 지정함으로써 서브클래스에 상속가능
		System.out.println("final 메서드");				// but 재정의(오버라이딩)금지
	}													// 슈퍼클래스의 메서드에 대한 private지정은 서브 클래스에 
}														// 상속이 되어 재정의가 가능하지만 접근제한이 되는반면
														// final 지정은 마찬가지로 서브 클래스에 상속이 되어
														// 접근은 가능하나 재정의는 불가능./
class SubClass2 extends SuperClass2{
//	void out() {
//		System.out.println("메서드 재정의");
//	}
}

public class Main55 {

	public static void main(String[] args) {
		SubClass2 subClass2 = new SubClass2();
		
		subClass2.out();
	}

}
