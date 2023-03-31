class Super1{	 	// 상속에서 생성자 상속시키는방법.
	int serialNum = 1;		
	String data = "슈퍼";
		
	public Super1(int serialNum, String data) {	// 생성자 초기화하려면 슈퍼클래스에서 this를 사용해서 함.
		this.serialNum = serialNum;
		this.data = data;
	}
	
	public void output() {
		System.out.printf("serial Number : %d\n", serialNum);
		System.out.printf("data : %s\n", data);	
	}
}
		
class Sub1 extends Super1{	
	String data2 = "서브";
	
	public Sub1(int serialNum, String data, String data2) {	// 상속받은 서브클래스에서 생성자를 사용하려면 
		super(serialNum, data);								// 슈퍼클래스와 서브클래스 각각 초기화해주고
		this.data2= data2;									// 상속받은 서브클래스에서 초기화 위임처럼 하되 this대신
	}														// super를 사용해야 한다. 
	
	public void output() {	
		super.output();
		System.out.printf("data : %s\n", data2);	
	}
}

public class Main49 {	

	public static void main(String[] args) {
		Sub1 sub1 = new Sub1(2,"슈퍼1","서브1");	
		
		sub1.output();	// 출력 결과 2, 슈퍼1, 서브1
	}

}
