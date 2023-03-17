class Car56{	// 다형성 1. 객체지정(교본 9페이지)
	String name;
	String color;
	boolean gasoline;
	
	Car56(String name, String color, boolean gasoline){
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

class Truck56 extends Car56{
	int Ton;
	
	Truck56(String name, String color, boolean gasoline, int ton){
		super(name,color,gasoline);
		this.Ton = ton;
	}
	
	public void run() {
		System.out.println("우당탕 쿵퇑");
	}
	
	void convey() {	// 서브에서 추가 정의한 메서드
		System.out.println("짐을 실어 나른다.");
	}

}											
											
public class Main56 {

	public static void main(String[] args) {
		Car56 myCar = new Car56("제네시스","빨강",true);	// 슈퍼타입변수
		Car56 yourCar = new Truck56("봉고","파랑",true,1500); // 슈퍼타입 변수로 서브 객체지정가능.
															// 다형성과 연관지어 슈퍼 틀로부터 생성된 서브 객체
															// 즉 기본틀은 유지하되 다양한 모듈을 추가한 형태의
															// 서브 객체를 담을 수 있는 형태로 이해 가능.
															// 단 그 과정에서 서브의 추가모듈은 잘려나가지만
															// 객체 캐스팅을 통해 추가 모듈 사용 가능(밑에 메인에서 convey)
															// 반대로 서브타입변수로 슈퍼객체를 가리키는 건 불가능.!!!!!
															// 논리적으로 서브틀에 슈퍼객체를 담을수는 있으나 
															// 그로 인해 슈퍼에 존재하지 않는 서브 모듈 실행할수있는 오작동	
															// 방지하기 위해 문법적으로 제한. 
		
		myCar.run();
		yourCar.run();
		((Truck56)yourCar).convey();	// 연산자 우선순위에 의해 truck56괄호쳐진 캐스팅보다 
										// yourcar.convey가 우선순위가 더 높다 그러므로 괄호 한번 더 쳐주어서
										// 우선순위 변경해야한다.
	}

}
