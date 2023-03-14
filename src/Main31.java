class Car7 {
	String name;
	String color;
	boolean gasoline;
	boolean sunroof;
	
	Car7() {}	// 디폴트 생성자 // 밑에 main에서 carnival같은 경우 인수가 없으므로 하나도 정의되지 않았을 시 자동생성
							   // 해당 경우에는 호출 가능하고 인수가 있는 것과 같이 호출하려면 디폴트 생성자 별도로 정의해야함.
	
	Car7(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	Car7(boolean gasoline, boolean sunroof) {
		this.gasoline = gasoline;
		this.sunroof = sunroof;
	}
	
	Car7(String name, String color, boolean gasoline, boolean sunroof) {
		this(name,color);	// this생성자 호출문은 1개만 사용할수 있다. 밑줄과 같이 또 호출 불가능하므로
//		this(gasoline,sunroof);	// 하나하나씩 일일이 해줘야한다.
		this.gasoline = gasoline;
		this.sunroof = sunroof;
	}
}

public class Main31 {

	public static void main(String[] args) {
		Car7 pride = new Car7("프라이드","파랑",true,false);
		Car7 poter = new Car7("포터","노랑");
		Car7 cannon = new Car7(true,false);
		Car7 carnival = new Car7();	// 인수 없는 생성문 // 클래스 생성자가 하나도 정의되지 않은 경우 디폴트 생성자 자동으로 생성된다.
		
		System.out.println(pride.name);
		System.out.println(pride.color);
		System.out.println(pride.gasoline);
		System.out.println(pride.sunroof);
	}

}
