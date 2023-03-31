class Car{	// 클래스 선언 및 객체 생성하여 차 설명.
	String name;	
	String color;
	boolean gasoline;
	
	void initCar(String name, String color, boolean gasoline) {
		this.name = name;
		this.color = color;
		this.gasoline = gasoline;
	}
	
	void inforCar() {
		System.out.println("차량명 : " + name);
		System.out.println("색상 : " + color);
		
		if(gasoline) {
			System.out.println("내연기관 : 가솔린 차량");
		} else {			
			System.out.println("내연기관 : 디젤 차량");
		}
	}
	
	void run() {
		if(gasoline) {
			System.out.println("부릉부릉");
		} else {
			System.out.println("덜컹덜컹");			
		}
	}
	
	void stop() {
		System.out.println("끼이익");
	}
	
}


public class Main22 {

	public static void main(String[] args) {
		Car Pride = new Car();
		
//		Pride.name = "프라이드";
//		Pride.color = "파랑";
//		Pride.gasoline = true;
		
		Pride.initCar("프라이드", "파랑", true);
		
		Pride.inforCar();
		Pride.run();
		Pride.stop();
	}

}
