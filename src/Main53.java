class Car50{
	private String purposeUse;	// private이므로 접근제한됨. get,set으로 접근해야함
	String name;
	String color;
	boolean gasoline;
	
	public String getPurposeUse() {
		return purposeUse;
	}
	public void setPurposeUse(String purposeUse) {
		this.purposeUse = purposeUse;
	}
}

class Jeep extends Car50{
	int ton;
	
	Jeep(String name, String color, boolean gasoline, int ton){
		// 슈퍼 클래스에 생성자가 존재하지 않으므로 초기화 불필요함. 따라서 상속된 필드에 직접 초기화.
		setPurposeUse("군용트럭");
//		this.purposeUse = "군용트럭";	// 안됨	// 상속을 받는 서브클래스이더라도 직접 접근은 불가능함.
											// 윗줄과 같이 set으로 받아서 해야함.
		this.name = name;
		this.color = color;
		this.gasoline = gasoline;
		this.ton = ton;
	}
}

public class Main53 { // private 접근은안되지만 상속은 가능.

	public static void main(String[] args) {
		Jeep humvee = new Jeep("험비", "위장색", false, 2);
		System.out.println("사용 용도 : " + humvee.getPurposeUse());	// 상속된 purposeUse에 직접접근 불가로 get을이용하여접근.
		System.out.println("사람명 : " + humvee.name);
		System.out.println("색상 : " + humvee.color);
		System.out.println("구동기관 : " + humvee.gasoline);
		System.out.println("차량중량 :  " + humvee.ton);
		
		
	}

}
