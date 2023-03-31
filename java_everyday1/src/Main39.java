enum Star{	// 열거형
	TERRAN, ZERG, PROTOSS		// 열거형은 내부적으로 클래스, 기본적으로 별도값 가지지 않고 
}								// 그 자체를 값으로 사용하는 열거상수들로 구성 
								// 열거상수는 해당 타입의 정적 상수필드(static final)와 같이 인식.
								// 열거형도 하나의 타입으로 인정되어 변수선언 가능.
								// 열거타입 변수에는 해당 열거타입에 해당하는 열거상수들만 대입가능.
								// 나열한 열거상수 끝에는 세미콜론 생략가능.

public class Main39 {

	public static void main(String[] args) {
//		System.out.println(TERRAN);		// 열거형은 클래스에 기반하므로 상수를 직접 호출 불가능/
		
		System.out.println(Star.TERRAN);	// 열거형은 내부적으로 클래스 이고 static final 형태이므로 객체생성필요없이
		System.out.println();				// 클래스를 통해 접근 가능.
											// 출력값 TERRAN
		
		Star species = Star.ZERG;	// 열거 변수 선언. 단순히 Star안의 ZERG값을 대입 받는 변수.
		System.out.println(species);	// 출력값 ZERG
		System.out.println();
		
//		int i = Star.PROTOSS;	//열거형은 참조형이므로 호환 불가능하다. 따라서 캐스팅 불가.
//		species = 3;			// 캐스팅 (모든 연산을 진행할 때 같은 타입의 피연산자끼리만 수행 가능한 것.), 형변환이라고도 함.
		
		System.out.println(Star.values()[0]);	// values()는 내장되어있는 기본 메서드로 열거형에 정의된 열거상수들을 
		System.out.println();					// 차례대로 배열 형태로 리턴. 
												// 예를 들어 위에서 값이 3개이므로 인덱스는 0,1,2인데 3을 입력 시 	
												// 바운드를 벗어나므로 컴파일 에러 뜸.
												// 해당 출력값은 Star라는 열거형에서 첫번째 값인 TERRAN값 출력.
		
		for(int i=0; i < Star.values().length;i++ ) {
			System.out.println(Star.values()[i]);	// for문 가능. 
		}											// 출력값 TERRAN,ZERG,PROTOSS 출력됨.
		System.out.println();
		
		for(Star i : Star.values()) {	// foreach문도 가능. 보통 int i썻으나 참조형이므로 해당 참조형인 Star로 해줘야한다.
			System.out.println(i);
		}
		System.out.println();
		
		species = Star.valueOf("PROTOSS");	// valueof는 내장되어있는 메서드로 괄호 안에 문자열이 열거형안에 대응되는 값이  
		System.out.println(species);		// 포함되어있으면 대응된 값을 리턴. 
	}										// 만약에 없으면 컴파일 에러 뜬다. 
											// 즉, Star.valueOf("PROTOS") 같이 없는 내용이면 컴파일 에러.
}