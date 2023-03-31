interface Operator72 {	// 인터페이스를 이용한 사칙연산(계산기) - instanceof 사용.
	int test(int n1, int n2);
}

class Sum72 implements Operator72 {
	@Override
	public int test(int n1, int n2) {
		return n1 + n2;
	}

}

class Sub72 implements Operator72 {
	@Override
	public int test(int n1, int n2) {
		return n1 - n2;
	}

}

class Mul72 implements Operator72 {
	@Override
	public int test(int n1, int n2) {
		return n1 * n2;
	}

}

class Div72 implements Operator72 {
	@Override
	public int test(int n1, int n2) {
		return n1 / n2;
	}

}

public class Main72 {
	public static void calculator(int n1, int n2, Operator72 op) {
		char opChar = ' ';
		
		if(op instanceof Sum72) {
			opChar = '+';
		} else if(op instanceof Sub72) {
			opChar = '-';
		} else if(op instanceof Mul72) {
			opChar = '*';
		} else {
			opChar = '/';
		}
		System.out.printf("%d %c %d = %d\n",n1,opChar,n2,op.test(n1, n2));
	}

	public static void main(String[] args) {
		calculator(10, 5, new Sum72());
		calculator(10, 5, new Sub72());
		calculator(10, 5, new Mul72());
		calculator(10, 5, new Div72());

	}

}
