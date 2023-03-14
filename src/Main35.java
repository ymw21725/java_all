class Stb{	// 정적 초기화 블럭
	static int ar[] = new int[5];
	
	static {	// 정적 초기화 블럭은 정적 필드만 초기화 가능, 클래스 정적 필드 선언시  
		for(int i=0; i<ar.length;i++) {// 초기화와 마찬가지로 최초 클래스 사용시에만 호출됨(즉, 1번만 실행됨)
			ar[i] = i + 1;
		}
	}
}
public class Main35 {	

	public static void main(String[] args) {
		for(int i=0;i<Stb.ar.length;i++) 
			System.out.printf("%d ", Stb.ar[i]);// 1,2,3,4,5출력.
			
		System.out.println();
		Stb.ar[0] = 10;	// ar[0]번 10으로 바꿈. 즉 // 10,2,3,4,5 상태
		
		Stb Obj = new Stb();	// 정적초기화 블럭은 최초 클래스 사용시에만 호출됨.
								// 객체를 생성함에도 재 호출 되지 않음
		
		for(int i = 0; i < Stb.ar.length; i++) 
			System.out.printf("%d ", Stb.ar[i]);	// 재 호출 되지 않으므로 출력값 10,2,3,4,5 출력됨.
		
	}

}
