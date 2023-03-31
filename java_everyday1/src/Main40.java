enum Star1{
	TERRAN("테란"),ZERG("저그"),PROTOSS("프로토스");//열거상수들 무조건 최선두로 와야함.
												 // 열거형에 정의된 필드들과 생성자 또는 메서드들은
												 // 열거형(Star)소속이 아닌 정적객체화된 열거상수(TERRAN,ZERG,PROTOSS)소속
	
		
		
	private final String speciesName;	// 열거형의 내부 정적객체처럼 취급되는 열거상수 별 통합정보등을 담든 내부 필드 선언.
										// 독립적인 내부정보이므로 일반적으로 private final로 지정함. 
	
	Star1(String speciesName) {	// 개별 열거상수의 내부 필드를 초기화 시키기 위한 생성자
		this.speciesName = speciesName;	// 괄호안의 문자열을 speciesName에 저장.
	}									// this는 TERRAN,ZERG,PROTOSS등을 가르키고
										// speciesName은 오른쪽 내용을 집어넣는다.
										// 오른쪽 speciesName은 괄호안의 문자열을 말해서 
	
	public String getSpeciesName() {	// speciesName이 private 이므로 내부정보를 얻기 위한 메서드 선언. 
		return speciesName;
	}
}
public class Main40 {	 

	public static void main(String[] args) {
		System.out.println(Star1.TERRAN.getSpeciesName());	// 테란 출력
		System.out.println(Star1.ZERG.getSpeciesName());	// 저그 출력
		System.out.println(Star1.PROTOSS.getSpeciesName());	// 프로토스 출력
		System.out.println();
		
		Star1 species = Star1.ZERG;	// 저그 
		
		System.out.println(species.getSpeciesName());	// 저그 출력.
//		System.out.println(Star.getSpeciesName());	// 열거형 내 선언된 메서드는 열거형에 소속된 메서드가 아닌, 열거형의 
	}												// 정적객체화된 열거상수 소속이므로 열거상수를 통해서만 호출 가능함에 유의.

}
