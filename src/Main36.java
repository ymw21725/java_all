class Hello 
{
	static void morning()	// 정적 메서드.
	{
		System.out.println("좋은 아침");
	}
	static void lunch()
	{
		System.out.println("점심 먹었나");
	}
	static void evening()
	{
		System.out.println("술먹자");
	}
}
public class Main36 {

	public static void main(String[] args) 
	{
		Hello.morning();	// 정적 필드와 마찬가지로 클래스에 소속되어 객체 생성없이 클래스
		Hello.lunch();		// 통해 직접 호출 가능.
		Hello.evening();
	}

}
