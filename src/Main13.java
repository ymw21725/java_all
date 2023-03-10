public class Main13 {	// 재귀호출.시점 기준으로 호출 이전과 이후 구분할줄 알아야 한다.

	public static void output(int n) {
		if(n<=0) {
			System.out.println();
			return;
		}
		
		System.out.println("재귀호출 직전까지 코드는 호출 순서대로 : " + n);	// 3,2,1
		output(n-1);
		System.out.println("재귀호출 직후부터 코드는 호출 역순으로 : " + n); // 1,2,3
	}
		
	public static void main(String[] args) {
		output(3);

	}
}
