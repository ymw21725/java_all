abstract class Dog66{					//추상 클래스 선언은 abstract 지정자를 붙여 선언, 서브클래스 객체 생성을 위한
	void swingTail() {					// 기본적이고 공통적인 틀만 제공되며, 일체 객체 생성이 금지됨!!!!!!!
		System.out.println("살랑살랑");	// 추상 메서드를 하나라도 포함하는 클래스는 반드시 추상 클래스로 선언해야함.
	}
	
	abstract void bark();				// 형식은 메서드에 abstract 지정자를 붙이고 마지막에 세미콜론 붙여야함.
}										// 추상메서드는 반드시 서브 클래스에서 재정의 해야한다!!!!!!!!!

class Jindo66 extends Dog66{
	void bark() {						// 6행의 추상 메서드에 대한 재정의 , abstract 지정자를 제외한 
		System.out.println("멍멍");		// 추상 메서드의 형식과 일치하면서 본체를 포함해야한다.
	}
}

class Chihuahua66 extends Dog66{
	void bark() {
		System.out.println("왈왈");
	}
}

public class Main66 {
	public static void main(String[] args) {
		Jindo66 jindol = new Jindo66();
		Chihuahua66 happy = new Chihuahua66();
		
		jindol.bark();
		happy.bark();
		System.out.println();
		
		dogCafe(jindol);
		dogCafe(happy);
	}
	
	static void dogCafe(Dog66 dog) {		// 슈퍼타입의 변수로 서브타입의 객체를 대입 받아 35행과 같이 슈퍼타입의 
		dog.bark();							// 변수의 메서드를 호출함에도 동적 바인딩에 의한 실 객체의 재정의 메서드가
	}										// 정상적으로 호출됨을 확인 가능. 
											// 이와 같이 추상클래스의 목적은 공통적인 요소를 묶어 확장된 파생타입의
}											// 객체 생성을 통한 다형성 확보에 목적이 있다.
