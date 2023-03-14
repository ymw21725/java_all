class Car3{
	public String name;
	protected String color;// protected는 현재 상속을 배우지 않았으므로 default랑 같은 기능.
	boolean gasoline;
	private int modelYear;
	
	public void internal() {
		name="에꿍스";
		color = "금색";
		gasoline = true;
		modelYear = 2009;
	}

	public int getModelYear() {	// modelyear는 private이므로 접근불가
		return modelYear;		// get , set 형식으로 불러와서 바꾸는것만 가능/
								// 예를들어 비밀번호같은거 아는사람은 접근가능하고 모르면 접근 막기 위해서
		
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;	// this는 위의 private modelyear가르킴.
	}
	
	
}

public class Main26 {

	public static void main(String[] args) {
		Car3 pride = new Car3();
		
		pride.name = "프라이드";
		pride.color = "파랑";
		pride.gasoline = true;
//		pride.modelYear = 2005;	// private이므로 접근이 불가능하다/.
		
		pride.setModelYear(2005);
		
		System.out.println(pride.getModelYear());	// 2005 출력.
		System.out.println();
		
		pride.internal();	// 다시 초기화.
		System.out.println(pride.name);
		System.out.println(pride.color);
		System.out.println(pride.gasoline);
		System.out.println(pride.getModelYear());	// 2009 출력.
	}

}
