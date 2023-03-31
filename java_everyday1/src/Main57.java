class Car57{	
	String name;
	String color;
	boolean gasoline;
	
	Car57(String name, String color, boolean gasoline){
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

class Truck57 extends Car57{
	int Ton;
	
	Truck57(String name, String color, boolean gasoline, int ton){
		super(name,color,gasoline);
		this.Ton = ton;
	}
	
	public void run() {
		System.out.println("우당탕 쿵퇑");
	}
	
	void convey() {	
		System.out.println("짐을 실어 나른다.");
	}

}											
											
public class Main57 {
	public static void TestCar(Car57 car) {	// 실인수 타입이 가변적인 즉, 실행시 타입이 결정되는 경우
		car.run();							// 이와 같이 가장 상위 클래스의 형식 인수로 대입 함으로써
		car.stop();							// 동일한 형태의 메서드를 호출함에도 대상 객체에 따라 
		System.out.println();				// 슈퍼의메서드 혹은 서브의 재정의된 메서드가 호출되어
	}										// 다른 형태로 나타남으로써 다형성 실현.
	

	public static void main(String[] args) {
		Car57 myCar = new Car57("제네시스","빨강",true);
		Truck57 yourCar = new Truck57("봉고","파랑",true,1500);
		
		TestCar(myCar);	// 위의 메서드 호출, mycar를 매개변수로 받아서 해당 이름인 mycar 호출.
		TestCar(yourCar);
	}

}
