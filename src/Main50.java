class Car13{
	String name;
	String color;
	boolean gasoline;
	
	Car13(String name, String color, boolean gasoline) {
		this.name = name;
		this.color = color;
		this.gasoline = gasoline;
	}
	
	void run() {
		if(gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}
	
	void stop() {
		System.out.println("끼이이익");
	}
}

class Truck extends Car13 {	
	int ton;	// 서브클래스에서 추가 정의한 필드.
	
	Truck(String name, String color, boolean gasoline, int ton) {	// 슈퍼 생성자 초기화시키기위한 인수도 포함.
		super(name,color,gasoline);	// 슈퍼 키워드를 이용하여 슈퍼의 생성자를 호출하여 초기화위임.(슈퍼클래스가 먼저 정의되어야함)
		this.ton = ton;				// 슈퍼에 생성자가 없다면 super호출안해도 디폴트 생성자가 자동호출된다.
	}
	
	void run() {	// 메서드 재정의 (오버라이딩)
		System.out.println("우당탕쿵퇑");
		super.run();
	}
	
	void convey() {	// 서브클래스에서 추가 정의한 메서드.
		System.out.println("짐을 실어 나르다");
	}
}
public class Main50 {

	public static void main(String[] args) {
		Truck poter = new Truck("포터", "흰색", false, 1000);	// 서브객체생성
		
		poter.run();	// 서브객체에 재정의한 메서드 호출
		poter.convey();	// 서브객체에 추가정의한 메서드 호출,
	}

}
