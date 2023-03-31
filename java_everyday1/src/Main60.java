class Car60{	
	String name;
	String color;
	boolean gasoline;
	
	Car60(String name, String color, boolean gasoline){
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

class Truck60 extends Car60{
	int Ton;
	
	Truck60(String name, String color, boolean gasoline, int ton){
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
											
public class Main60 {
	public static void TestCar(Car60 car) {	
		car.run();							
		car.stop();		
										// instanceof
		if(car instanceof Truck60) {	// 대상객체(car)가 해당클래스타입(Truck60)이 맞다면 true 아니면 false
			((Truck60) car).convey();	// 자동완성에서 캐스팅됨.
		}								// 캐스팅 되면서 truck60에 있는 convey가 실행.
										// convey는 오버라이딩 된 부분이라 캐스팅 해줘야함.
		System.out.println();				
	}										
	

	public static void main(String[] args) {
		Car60 myCar = new Car60("제네시스","빨강",true);
		Truck60 yourCar = new Truck60("봉고","파랑",true,1500);
		
		TestCar(myCar);	
		TestCar(yourCar);
	}

}
