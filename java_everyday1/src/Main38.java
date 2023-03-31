class Const{	// 상수 필드 (대문자로 많이들 사용함.)
	final int NON_ST_CONST_1 = 10;	// 최초 선언시 무조건 초기화 진행해야함. 그렇지 않으면 NON_ST_CONST_3과 같이 컴파일에러.
	final int NON_ST_CONST_2;	// 단 초기화블럭이나 생성자를 통한 초기화 시 예외 가능.
//	final int NON_ST_CONST_3;
	static final int ST_CONST_1 = 30;	
	static final int ST_CONST_2;
	
	{					// 비정적 필드 경우 초기화 블럭이나 생성자를 통해 초기화 지연 가능.(예시 : NON_ST_CONST_2)
		NON_ST_CONST_2 = 20;
	}
	
	static {			// 정적 멤버인 경우 정적 초기화 블럭에서만 초기화 지연 가능. (예시 : ST_CONST_2)
		ST_CONST_2 = 40;
	}
}
public class Main38 {

	public static void main(String[] args) {
		Const const1 = new Const();
		
//		const1.NON_ST_CONST_1 = 100;	// 상수 선언인 final이 있으므로 값 변경이 불가능 하다.(초기화를 메서드내에서 시키는것 불가능) 
//		const1.NON_ST_CONST_2 = 200;	// 컴파일 에러임.
//		
//		Const.ST_CONST_1 = 300;
//		Const.ST_CONST_2 = 400;
		
		System.out.println(const1.NON_ST_CONST_1);	//10
		System.out.println(const1.NON_ST_CONST_2);	//20
		System.out.println(Const.ST_CONST_1);		//30
		System.out.println(Const.ST_CONST_2);		//40
		
	}

}
