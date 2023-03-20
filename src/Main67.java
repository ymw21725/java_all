interface Animal67{	// 인터페이스 - 모든 메서드가 추상인 클래스로 다른 일반 필드나 메서드를 멤버로 가질수 있는 추상클래스와달리
	void eat();		// 추상메서드만 멤버로 포함 가능!!!!!!!
	void sleep();	// void 앞에는 public abstract가 생략되어있다.
}					// 예외적으로 상수 필드는 포함가능하되 public static final 필드이어야하며 생략이 가능하다.
					// 일반적으로 인터페이스의 상수 필드는 객체 생성을 위한 구현 클래스에서 규약 된 공통적인 값으로 활용
					// 메서드의 집합만을 모아 추상적 기능만 통합하여 정의하고자 할 때 인터페이스가 활용되며
					// 이를 통한 객체의 부품화 실현..
					// 추상클래스와 마찬가지로 객체 생성이 금지되며 서브 클래스에서 모든 메서드가 재정의(오버라이딩)되어야함.

class Cow67 implements Animal67{	// 인터페이스로 부터 구현될때는 implements로 해야한다. 

	@Override
	public void eat() {				// 오버라이딩 
		System.out.println("우걱우걱");
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨");
	}
	
}

public class Main67 {	// public abstract가 있음(생략가능)

	public static void main(String[] args) {
		Cow67 so = new Cow67();
		
		so.eat();
		so.sleep();
	}

}
