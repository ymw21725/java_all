/* 
 * 인터페이스 활용과 목적
 * 인터페이스 또한 추상클래스와 마찬가지로 타입 확장을 통해 슈퍼타입 인터페이스 변수에 대한 서브 구현 객체의 메서드 호출 가능
 * 즉 슈퍼타입 인터페이스 변수로 서브 타입 객체를 가리킨 경우, 생성된 객체의 구현된 메서드를 호출하는 동적 바인딩이 진행됨에
 * 따라 임의의 객체 생성 시 인터페이스를 다중 상속 받은 경우 각각의 인터페이스 (슈퍼)타입으로 구현된 메서드를 호출함으로써
 * 인터페이스 타입에 따른 객체의 멤버 사용을 통합 및 선별 가능. 또한 개별 객체에 대한 공통적인 기능에 대하여 그 세부적 내용만
 * 차이가 있는 경우 인터페이스를 통해 다수의 서브 클래스에 상이한 내용만 구현함으로써 각각의 객체를 공통 인터페이스 (슈퍼)타입
 * 변수로 받아 개별 객체의 상이한 메서드 내용을 자동 선별이 가능케 함으로써 다형성 확보. 결국 인터페이스의 목적은 세부적인 면에서
 * 객체의 기능 통합을 통한 선별 사용과 다형성 확보로 구분되며, 큰 틀에서 타입의 확장을 통한 객체의 부품화 및 제한적 다중상속 실현 
 */


interface Animal68{
	void eat();
	void sleep();
}

abstract class Dog68{
	void swingTail() {
		System.out.println("살랑살랑");
	}
	
	abstract void bark();
}

class Chihuahua68 extends Dog68 implements Animal68 {	// 인터페이스, 클래스 동시 상속 받는경우 형식
	void bark() {										// 서브클래스 extends 슈퍼클래스 implements 인터페이스1,2~
		System.out.println("왈왈");						// 자바에서는 다중 상속 지원되지않음(슈퍼클래스는 1개만 존재가능)
	}													// 하지만 인터페이스는 다중 상속이 가능하며 인터페이스끼리도
														// 상속이 가능하다.
	@Override											// 단 인터페이스끼리 상속은 구현이 아니므로 extends로 사용해야함
	public void eat() {
		System.out.println("우걱우걱");
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨");
	}
	
	
}

public class Main68 {
	public static void main(String[] args) {
		Chihuahua68 happy = new Chihuahua68();
		
		happy.swingTail();
		happy.bark();
		happy.eat();
		happy.sleep();
		System.out.println();
		
		Animal68 animal = new Chihuahua68();	// 인터페이스는 구현을 가지지 않음으로 객체를 생성할 수 없지만
												// (슈퍼)타입의 변수 선언이 가능하며 이를 통해 서브 타입의 구현 객체를
												// 대입 받아 58,59행과 같이 동적 바인딩에 의한 구현 객체 메서드 호출 가능
		
		animal.eat();
		animal.sleep();
		((Chihuahua68)animal).bark();			// 하향 캐스팅을 통해서 메서드 호출 가능!
												// 이는 슈퍼타입 변수로 서브 타입 객체를 가리켰을 때 서브에 재정의된
												// 메서드는 직접 호출이 가능하지만 추가 메서드는 하향 캐스팅을 통해
												// 호출 가능함과 동일 원칙 적용.
	}

}
