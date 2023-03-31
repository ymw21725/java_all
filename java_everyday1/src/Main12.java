public class Main12 {	// 메소드 오버로딩(다중정의)
						// 동일한 메서드명으로 다중정의를 하되, 이를 인수의 타입이나 갯수에 따라 구분함으로써
						// 하나의 메서드명으로 다양한 형태의 메서드 호출이 가능.
	
						// return타입은 오버로딩 요건에 해당하지 않음.
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
	
//	static long add(int a, int b) {	// 메서드의 오버로딩은 인수의 갯수나 타입에 의해 결정되며 리턴 타입은 오버로딩 요건이 되지못함.
//		return (long)(a+b);
//	}
	

	public static void main(String[] args) {
		System.out.println(add(1,2));	// 위에서 정수타입이고 매개변수가 2개인 것 찾아서 
		System.out.println(add(1,2,3));	// 위에서 정수타입이고 매개변수가 3개인 것 찾음.
		System.out.println(add(4.5,5.)); // 위에서 실수타입이고 매개변수 2개인 것 찾음.
	}

}
