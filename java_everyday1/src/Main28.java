class Car5{
	String name;
	String color;
	boolean gasoline;
	
	Car5(String Name, String Color, boolean gasoline) {	// 생성자. 리턴값이 없는 클래스명과 동일 명칭으로 함.
		this.name = Name;	// 생성자를 통해 클래스 필드에 대한 초기식 지정뿐 아니라, 메서드 형태의 인수도 취할 수 있음.
		this.color = Color;	// 리턴 값이 없을 뿐 일반 메서드와 동일형태 취함.
		this.gasoline = gasoline;	// 메서드는 객체 생성 후 메서드를 통해 멤버 초기화 가능.
	}								//but 생성자는 객체생성시점에서 바로 초기화 가능.(밑에 main에서 new car(이부분))
	
	void run() {
		if(gasoline) {
			System.out.println("부릉");
		} else {
			System.out.println("덜컹");
		}
	}
	
	void stop() {
		System.out.println("끼익");
	}
}
public class Main28 {

	public static void main(String[] args) {
//		Car5 pride = new Car5();	//메서드 형태. 예전에 했던 방식.
		Car5 pride = new Car5("프라이드","파랑",true);// 생성자 (객체 생성후 바로 초기화)
		System.out.println(pride.name);
		System.out.println(pride.color);
		System.out.println(pride.gasoline);
		pride.run();
		pride.stop();
	}

}
