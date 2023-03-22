// 1. 상속(is의 관계) 자손이 조상이 될 수 있다. Ex) Ex02_Person pp = new Ex03_Student();
// 2. 인스턴스(has의 관계)	Ex) Car car = new Car(), pp.car.set~ , 
// 3. 매개변수전달하는방법(use 관계)

package j01_class;

public class Ex01_MyClass {
	//멤버 
	// => 변수(속성,컬럼,필드), 메서드/동작(생성자, main, setter/getter, toString(), .....)
	// => 멤버(Global, 클래스 외부에서 접근 가능) / 지역(Local, 정의된 범위 내에서만 접근 가능.)
	
	// => 접근제어자 : public > protected > (default) > private
	// => private : 메서드를 통해 접근 (setter / getter)
	
	// => static(정적,클래스 변수) / non_static(동적, 인스턴스변수 )
	
	private static String name="양민우";	
	private String job="학생";	
	private String phone = "010-7310-7050";	
	private int age = 100;	
	
	// => 생성자메서드 
	// 	- 기본 생성자(default) : 매개변수없음, 생성자가 1도 없으면 컴파일러가 자동추가 
	//  - 생성자 오버로딩 : 매개변수 갯수, Type이 다르면 동명의 복수 메서드 허용.
	//  - 일반메서드와 차이점 : 클래스와 동명이름, 리턴값이 없음, new 연산자 뒤쪽에서 한번만 호출 가능 
	//  - 기본생성자, 멤버변수들을 초기화하는 생성자를 주로 사용
	
	public Ex01_MyClass() {	System.out.println("기본(default)생성자"); }
	public Ex01_MyClass(String name, String job, String phone, int age) {	
		Ex01_MyClass.name = name;
		this.job = job;
		this.phone = phone;
		this.age = age;
	}
	
	public void myPrint() {
		int age = 200;
		String name = "홍길동";
		System.out.println("** name1 : "+Ex01_MyClass.name);//양민우	,Tom
		System.out.println("** name2 : "+name);	// 홍길동, 홍길동
		System.out.println("** job : "+job);	// 학생 , 게임,
		System.out.println("** phone : "+phone);	// 010-7310-7050, 010-1234-1234
		System.out.println("** age : "+this.age);	// 자신의 인스턴스를 가르킨다 100, 10
		System.out.println("** age : "+age);	// 200 , 200
		
		
	}// myPrint
	
	public static void main(String[] args) {
		// => static 메서드 : static 또는 인스턴스를 통해 접근.
		Ex01_MyClass my = new Ex01_MyClass();
		
		int age = 20;// 지역변수
		System.out.println("** 안녕하세요!!! **");
		System.out.println("** name : "+Ex01_MyClass.name);	// static 또는 인스턴스를 통해 접근 //양민우
		System.out.println("** job : "+my.job);	// 학생
		System.out.println("** phone : "+my.phone);	// 010-7310-7050
		System.out.println("** age1 : "+my.age);	//100
		System.out.println("** age2 : "+age);	//20
		my.myPrint();
		// => 생성자를 이용한 초기화
		
		Ex01_MyClass tom = new Ex01_MyClass("Tom","게임","010-1234-1234",10);
		tom.myPrint();
		Ex01_MyClass jerry = new Ex01_MyClass("Jerry","요리","010-5678-5678",20);
		jerry.myPrint();

	} // main

} // class
