interface Operator {	// 인터페이스를 이용한 사칙연산(계산기)
	int test(int n1, int n2);
}

class Sum70 implements Operator {
	@Override
	public int test(int n1, int n2) {
		return n1 + n2;
	}

}

class Sub70 implements Operator {
	@Override
	public int test(int n1, int n2) {
		return n1 - n2;
	}

}

class Mul70 implements Operator {
	@Override
	public int test(int n1, int n2) {
		return n1 * n2;
	}

}

class Div70 implements Operator {
	@Override
	public int test(int n1, int n2) {
		return n1 / n2;
	}

}

public class Main70 {
	public static void calculator(int n1, int n2, Operator op) {
		System.out.printf("%d\n",op.test(n1, n2));
	}

	public static void main(String[] args) {
		calculator(10, 5, new Sum70());
		calculator(10, 5, new Sub70());
		calculator(10, 5, new Mul70());
		calculator(10, 5, new Div70());

	}

}
