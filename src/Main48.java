class Super{	// 상속, 오버라이딩, 슈퍼 
	int serialNum = 1;		// 슈퍼클래스. 
	String data = "슈퍼";
		
	// overloadding(오버로딩)은 하나의 메서드를 인수 타입 및 인수 개수를 통해 다중 정의
	// overriding(오버라이딩)은 슈퍼클래스에서 정의한 메서드를 서브클래스에서 재정의함을 의미. 
	
	// 상속 - 이미 정의된 슈퍼클래스를 통해 더 확장된 형태의 서브클래스를 파생시킴으로써 코드의 통합을 통한 관리의 용이성
	// 및 다형성을 통한 생산성 증대.
	// 상속을 받은 서브클래스는 슈퍼클래스의 모든 멤버를 물려받으나 슈퍼의 생성자만은 예외로 서브클래스에서 별도로 직접 정의해줘야함.
	// 슈퍼에 초기화 시킬 멤버가 없어 슈퍼의 생성자를 호출하지 않더라도 객체 생성 시 자동으로 슈퍼의 생성자가 먼저 호출되고
	// 이후에 서브 생성자 호출됨.
	public void output() {
		System.out.printf("serial Number : %d\n", serialNum);
		System.out.printf("data : %s\n", data);	
	}
}
		// 보통 class 서브 extends 슈퍼 방식으로 사용한다.
class Sub extends Super{	// 슈퍼에있는거 물려주는것 생성자는 상속이 안된다.
							// 즉 서브클래스에 아무것도 입력이 안되어있어도 상속되면 슈퍼클래스에 있는 내용들은 있는 것이다.
	String data2 = "서브";
	
	public void output() {	
		super.output();// 오버라이딩(재정의)	// 슈퍼클래스에 있는 sysout다시불러와도 되나 부모클래스를 가르키는 super사용하여
											// 메서드 호출하는 것이 더 효과적이고 일반적인 방법이다. 
		System.out.printf("data : %s\n", data2);	// data2인 서브만 출력된다.
	}
}

public class Main48 {	//상속 (생성자는 상속안됨.)

	public static void main(String[] args) {
		Sub sub1 = new Sub();
		
		sub1.output();	// 위에 sub클래스에서 super.output이 없을 경우에는 서브만 출력.
						
	}

}
