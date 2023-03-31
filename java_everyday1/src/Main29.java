class Car6{
	String name;
	String color;
	boolean gasoline;
	
	Car6(String name) {	// 생성자 오버로딩.
		this.name = name;
	}
	
	Car6(String name, String color, boolean gasoline) {
		this(name);	// 생성자간 호출 형식에서 괄호안의 실인수 지정하여 해당 줄은 실행시 위에 6번째 행 참조하여 실행.
					// this(name)이 Car6(name)이랑 같은것이므로 Car6안에 매개변수가 1개있는 생성자오버로딩이 있으므로 
					// 초기화 위임형식으로 실행. !!
		this.color = color;
		this.gasoline = gasoline;
//		this(name);	// this생성자 호출구문 this(name)은 다른 필드 초기식보다 항상 맨 먼저 나와야한다. 그렇지 않으면 컴파일 에러.
	}
	
}
public class Main29 {

	public static void main(String[] args) {
		Car6 anycar = new Car6("애니카");	// 생성자 오버로딩. (형식인수 개수와 타입 일치하는 것 찾아서 하는것, 이름은 같음.)
//		Car6 avante = new Car6("프라이드", "파랑");	// 생성자 2개만 있는 형식은 위에서 2개만 있는 형식이 없으므로 컴파일 에러임.
		Car6 pride = new Car6("프라이드", "파랑", true);
//		Car6 pride = new Car6("프라이드", "파랑");	// 2개있는 형식 없음. 컴파일 에러
//		Car6 pride = new Car6("프라이드", "파랑");
		
		System.out.println(anycar.name);
		System.out.println(pride.name);
		System.out.println(pride.color);
		System.out.println(pride.gasoline);
	}

}
