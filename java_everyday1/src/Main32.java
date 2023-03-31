class Student{	// 초기화 순서 : 명시적 초기화(int kor, int math등등) -> 초기화 블럭 ( {안에 내용}) -> 생성자
	String instructor="박성연";
	String name;
	int kor;
	int math;
	int eng;
	int hist = -1;	// 선택과목
	int sum;
	int avg;
	
	{// 초기화 블럭 사용하는 이유는 위에 명시적 초기화에서는 한줄짜리구문으로만 초기화가능하나
	 //초기화 블럭에서는 예를 들어 x = 10+5; x = 7같은 방식 사용가능. 
		System.out.println("강사는 " + instructor + " 입니다.");	// 초기화 블럭에 대한 설계는 생성자를 통해 전달한 인수와
//		if(hist <= -1) {										// 관계없는 공통적인 필드에 대한 초기화나 연산만 처리해야 한다.
//			sum = kor + math + eng;
//			avg = sum /3;	// 초기화 블럭은 순서상은 맞으나 생성자를 통해 인수 전달이 불가능 하다.
//		} else {			// 그러므로 해당 부분을 메서드로 뺀 후 실행한다. 
//			sum = kor + math + eng + hist;
//			avg = sum /4;
//		}
	}
	
	Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		calculation();	// 기존의 생성자 블럭에 대한 연산처리를 내부 메서드를 통해 구현하여 문제 해결.
	}
	
	Student (String name, int kor, int math, int eng, int hist) {
		this(name,kor,math,eng);
		this.hist = hist;
		calculation();
	}
	
	void calculation( ) {	// 메서드를 따로 만들어서 해당부분 출력.
		if(hist <= -1) {
			sum = kor + math + eng;
			avg = sum /3;
		} else {
			sum = kor + math + eng + hist;
			avg = sum /4;
		}
	}
	
	void outputScore() {
		System.out.printf("학생%s는 총점 %d이고 평균 %d점입니다.\n\n",name,sum,avg);
	}
	
}
public class Main32 {
	public static void main(String[] args) {
		Student a = new Student("A",90,90,90);
		a.outputScore();
		Student b = new Student("B", 80,80,80,80);
		b.outputScore();
	}

}
