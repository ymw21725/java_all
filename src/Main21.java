class DataBox {
	int n;	// 초기화안하면 디폴트값. (0,0.0,null등 )
	double d;
	String str;	// 필드들 저장.
	
	void initData(int n, double d , String str) {
		this.n = n;	// this는 객체 자신을 가르킴 여기서 this.n은 2,3,4번째줄 n,d,str을 가르킴.
		this.d = d;	// 그 후 this.n에 n을 대입하여 출력하므로.
		this.str = str; // 생성자의 매개변수 이름과 인스턴스 변수의 이름이 같을 경우에는 인스턴스 변수 앞에 this 키워드를 붙여 구분해만 합니다.
	}
	
	void outputData() {	// 동등관계이므로 매개변수 없어도됨.
		System.out.printf("n = %d\n",n);
		System.out.printf("d = %f\n",d);
		System.out.printf("str = %s\n",str);
		System.out.println();
	}
}

public class Main21 {

	public static void main(String[] args) {
		DataBox dataBox1= new DataBox(); // new연산자는 공간 할당. 
		DataBox dataBox2= new DataBox();
		
//		dataBox1.n = 1;
//		dataBox1.d = 1.1;
//		dataBox1.str = "test1";
//				
//		dataBox2.n = 2;
//		dataBox2.d = 2.2;
//		dataBox2.str = "test2";
		
		dataBox1.initData(1, 1, "test1");
		dataBox2.initData(2, 2, "test2");
		
		dataBox1.outputData();
		dataBox2.outputData();
	}

}
