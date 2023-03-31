interface Operator71 {	// 인터페이스를 이용한 사칙연산(계산기) - 익명객체 사용해서 1회성 인경우
	int test(int n1, int n2);
}

//class Sum71 implements Operator71 {
//	@Override
//	public int test(int n1, int n2) {
//		return n1 + n2;
//	}
//
//}
//
//class Sub71 implements Operator71 {
//	@Override
//	public int test(int n1, int n2) {
//		return n1 - n2;
//	}
//
//}
//
//class Mul71 implements Operator71 {
//	@Override
//	public int test(int n1, int n2) {
//		return n1 * n2;
//	}
//
//}
//
//class Div71 implements Operator71 {
//	@Override
//	public int test(int n1, int n2) {
//		return n1 / n2;
//	}
//
//}

public class Main71 {
	public static void calculator(int n1, int n2, Operator71 op) {
		System.out.printf("%d\n",op.test(n1, n2));
	}

	public static void main(String[] args) {
		calculator(10, 5, new Operator71() {	// 익명객체 만든것.재활용하지 않으려면 이렇게 만듬. 
			public int test(int n1, int n2) {
				return n1 + n2;
			}
		});
		calculator(10, 5, new Operator71() {
			public int test(int n1, int n2) {
				return n1 - n2;
			}
		});
		calculator(10, 5, new Operator71() {
			public int test(int n1, int n2) {
				return n1 * n2;
			}
		});
		calculator(10, 5, new Operator71() {
			public int test(int n1, int n2) {
				return n1 / n2;
			}
		});
		

	}

}
