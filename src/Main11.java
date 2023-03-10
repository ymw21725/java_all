public class Main11 {

	static int add(int... a) {	// 가변인수는 타입명... 형식인수 방식으로 사용해야한다.
		int s = 0;				// 동일타입의 인수 여러개를 배열형태로 전달받음.
		
		for(int i:a) s += i;
		
		return s;
	}
	
	public static void main(String[] args) {
		int ar[] = {7,8,9,10};
		
		System.out.println(add(1,2));	// 3
		System.out.println(add(1,2,3)); // 6
		System.out.println(add(4,5,6,7)); // 22
		System.out.println(add(ar)); // 34	배열형태로 받으므로 7,8,9,10 더한결과값이 나옴.
		
		System.out.println(add(new int[] {7,7})); // 14	
	}
}
