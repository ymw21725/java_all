package j01_class;

public class Ex02_User {
 
	public static void main(String[] args) {
		Ex02_Person p1 = new Ex02_Person();
		p1.setName("홍길동");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		System.out.println("** 기본생성자 Test **");
		System.out.println("** Person => " + p1.toString());
		System.out.println("** Person => " + p1); // => 출력문에서 인스턴스 이름만 사용하면 기본적으로 toString() 호출함
												   // => Object 에서 toString() 는 객체의 주소를 return
		
		System.out.println("** 초기화 생성자 Test **");
		Ex02_Person p2 = new Ex02_Person("김길동","010-2222-2222",22);
		System.out.println("** Person2 => " + p2);
		
	} // main 
} // class
