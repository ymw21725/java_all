class Car51{
	String name;
	String color;
	boolean gasoline;
	
	Car51(String name, String color, boolean gasoline){
		this.name = name;
		this.color = color;
		this.gasoline = gasoline;
	}
	
	private void run() {
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

class Truck10 extends Car51{
	int Ton;
	
	Truck10(String name, String color, boolean gasoline, int ton){
		super(name,color,gasoline);
		this.Ton = ton;
	}
	
	public void run() {
		System.out.println("우당탕 쿵퇑");
	}
	
//	private void stop() {					// 슈퍼클래스에서는 default 서브클래스에서 private이므로 
//		System.out.println("끼이ㅣㅇ이이이익");// 접근 권한이 축소되는 경우는 접근 불가능 (반대로 확장은 가능)
//	}										// public > protected > default > private
}											// 예를 들어 슈퍼클래스가 public이고 서브클래스가 private면 불가능
											// 반대로 슈퍼클래스 default이고 서브클래스 public이면 가능
public class Main54 {

	public static void main(String[] args) {
		Car51 car = new Car51("자동차","검정",false);
		
//		car.run():	// private 이므로 접근 불가능.
		
		Truck10 poter = new Truck10("포터","흰색",false,1000);
		poter.run();	//private에서 상속 받았으므로 상속받은 클래스에서는 public이다. 접근가능.
	}

}
