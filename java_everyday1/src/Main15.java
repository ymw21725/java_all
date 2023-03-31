
public class Main15 {	// 재귀호출 호출 역순으로
	public static int sum(int n) {
		if(n<=0) return 0;	// return 0하면 밑에 6번에서 n이 1이되야하므로 sum(n-1)이 0이 됨.
		
		return sum(n-1) + n;
	}
	

	public static void main(String[] args) {
		System.out.println(sum(10));
	}

}
