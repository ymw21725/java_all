class Car8 {	// 정적필드.
	String Name;
	static int carNum;	// 객체에 독립적으로 구성됨 (모든 객체가 공유하는 기억공간, 하나의 메모리 공간만 할당받아서)
	
	Car8(String aName){
		Name = aName;
		carNum++;
	}
}
public class Main34 {

	public static void main(String[] args) {
		System.out.println(Car8.carNum);
		
		Car8 A = new Car8("a");	// 객체 생성 후 CarNum++이므로 CarNum = 1
		Car8 B = new Car8("b");	// 마찬가지로 1증가하므로 CarNum = 2 // 정적필드이므로 모든 객체가 공유하는 공간이므로 
		Car8 C = new Car8("c");	// 누적되어 더해진다. 
		
		System.out.println(Car8.carNum);	// 출력값 3
		System.out.println(A.carNum);	// 출력값 3 (객체를 통해서 접근 가능, but 클래스 통해서 접근이 원칙)
	}

}
