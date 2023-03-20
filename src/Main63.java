class Car63{
	CarName63 name;
	String color;
	
	Car63(String aModel, int aYear, String aColor){
		name = new CarName63(aModel,aYear);
		color = aColor;
	}
	
	class CarName63{
		String model;
		int year;
		
		CarName63(String aModel, int aYear) {
			model = aModel;
			year = aYear;
		}
		
		// 이너 클래스 내부에서 이너 클래스 필드 참조는 내부 직접참조와 주 클래스를 통한 간접참조가 외부 객체 생성 시
		// 참조주체가 주클래스 객체인지 이너클래스 객체인지에 따라 달라진다. 
		// 참조주체가 주 클래스 객체인 경우 이너 클래스 객체 자체가 주 클래스의 생성자에 종속되어 생성되어지므로 
		// 이너 클래스 내부 필드에 대한 직접참조와 주 클래스 간 간접참조는 동일한 대상을 가르킴(pride.name.outsubinfo)
		
		// 반면 참조 주체가 외부에 생성된 이너 클래스 객체인 경우 주 클래스 객체에 종속되어 생성되고 주 클래스의 모든 멤버를
		// 직접 참조가 가능한 특성으로 인해 이너 클래스 생성자에 의해 생성된 내부 필드의 직접참조와 주 클래스를 통한
		// 간접참조는 대상이 다를 수 밖에 없음.
		
		void outSubInfo() {
			System.out.printf("서브 클래스에서 직접 참조 : 모델 = %s, 년식 =%d\n",model,year);
			System.out.printf("주 클래스에서 직접 참조 : 모델 = %s, 년식 =%d\n",name.model,name.year);
		}
	}
}
public class Main63 {
	public static void main(String[] args) {
		Car63 pride = new Car63("프라이드",2005,"파랑");
		Car63.CarName63 pride2 = pride.new CarName63("프랑이",2009);
		
		pride.name.outSubInfo();	// 둘다 프라이드 2005	// 주 클래스 객체 내부에 생성된 이너 클래스 타입의 멤버 메서드 호출
		System.out.println();
		
		pride2.outSubInfo();	// 서브클래스 직접참조는 서브- 프랑이 2009
	}							// 주 클래스 프라이드 2005

}
// 주 클래스 객체에 의해 외부에 생성된 이너 클래스 타입 객체 멤버 메서드 호출.
// 외부에 생성된 이너 클래스 객체는 별도의 독립적인 객체임에도 불구하고 태생 자체가 생성된 주 객체에 의존적이고
// 내부적으로 주 객체의 모든 멤버와 동등한 자격이 주어짐에 따라 아무런 제약없이 주 클래스 객체의 멤버에 접근 가능하므로 외부에 
// 생성된 정적 이너 클래스 객체와 달리 이너 클래스 객체를 통해 30행과 같이 간접적으로 주 객체의 멤버까지도 참조 가능
// 결론적으로 외부에 생성된 정적 이너 클래스 객체는 주 객체와 관련성이 없어 제한적인 접근만 가능하며 보안에 강점이 있는반면
// 외부에 생성된 이너 클래스 객체는 주 클래스 객체와 다른 별도의 독립적인 객체임에도 주 객체와 밀접한 관계를 맺어 
// 주 객체의 모든 멤버를 간접적으로 참조가 가능하지만 보안에 취약함. 
