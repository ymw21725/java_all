class SuperClass65{
	public void output() {
		System.out.println("나는 슈퍼 클래스다");
	}
}

public class Main65 {
	public static void main(String[] args) {
//		SuperClass65 superclass = new SuperClass65();
//		
//		superclass.output();
//		
//		class LocalInnerClass65 extends SuperClass65 {	// 로컬 이너 클래스는 그사용만 메서드 내로 제한 될 뿐 일반 
//			public void output() {						// 클래스와 동일한 문법이므로 상속, 재정의(오버라이딩)모두 가능
//				System.out.println("나는 지역 내부 클래스다");
//			}
//		}
//		
//		LocalInnerClass65 localInnerClass = new LocalInnerClass65();
//		
//		localInnerClass.output();
		
		new SuperClass65() {
			public void output() {
				System.out.println("나는 지역 내부 클래스다");
			}
		}.output();
	}
}
// new SuperClass65() 인 맨 마지막 부분은 쉽게 익명 이너클래스 만드는 방식이다.
// 먼저 슈퍼클래스(부모)를 new 부모클래스() 만든다. 이때는 슈퍼클래스이지만 중괄호{} 넣으면 서브가 된다
// 그후 오버라이딩을 통해 재정의 해주면 된다. 
// 위의 주석도 만드는 방식이지만 더 편리한 방식이다. 밑에것이 
