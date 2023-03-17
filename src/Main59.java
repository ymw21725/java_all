class Car59{	
	String name;
	String color;
	boolean gasoline;
	
	Car59(String name, String color, boolean gasoline){
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
		System.out.println("끼이익");
	}
}

class Truck59 extends Car59{
	int Ton;
	
	Truck59(String name, String color, boolean gasoline, int ton){
		super(name,color,gasoline);
		this.Ton = ton;
	}
	
	public void run() {
		System.out.println("우당탕 쿵퇑");
	}
	
	void convey() {		// 추가 정의된 메서드
		System.out.println("짐을 실어 나른다.");
	}

}											
											
public class Main59 {
									
	public static void main(String[] args) {
		Car59 myTruck = new Truck59("봉고","파랑",true,1500);
		
		Truck59 anyTruck;
//		anyTruck = myTruck;				// 객체 지정 규칙에 의해 서브타입의 변수로 슈퍼타입의 변수를 가리킬수 없음.
										// 또한 서브타입의 변수에 슈퍼타입의 변수 대입 또한 불가능함이 당연.
		anyTruck = (Truck59)myTruck;	// but. 캐스팅을 통한 대입은 가능!!!!!!!
										// 여기서 캐스팅은 강제 형변환이 아닌 변수가 가리키고있는 실제 객체 타입 명시하는 기능
										// 이를 통해 서브타입의 잘려나간모듈(추가 정의 멤버)사용가능.
		
		anyTruck.run();
		anyTruck.stop();
		
		anyTruck.convey();
	}

}
