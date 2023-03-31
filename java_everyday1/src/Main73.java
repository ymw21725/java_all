interface Operator73 {	// 인터페이스를 이용한 사칙연산(계산기) - instanceof 사용.버전2
	int test(int n1, int n2);
	char getOpChar();
}

class Sum73 implements Operator73 {
	char opChar = '+';
	
	@Override
	public int test(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public char getOpChar() {
		return opChar;
	}

}

class Sub73 implements Operator73 {
	char opChar = '-';
	@Override
	public int test(int n1, int n2) {
		return n1 - n2;
	}
	@Override
	public char getOpChar() {
		return opChar;
	}

}

class Mul73 implements Operator73 {
	char opChar = '*';
	@Override
	public int test(int n1, int n2) {
		return n1 * n2;
	}
	@Override
	public char getOpChar() {
		return opChar;
	}
}

class Div73 implements Operator73 {
	char opChar = '/';
	@Override
	public int test(int n1, int n2) {
		return n1 / n2;
	}
	@Override
	public char getOpChar() {
		return opChar;
	}
}

public class Main73 {
	public static void calculator(int n1, int n2, Operator73 op) {
//		char opChar = ' ';
//		
//		if(op instanceof Sum73) {
//			opChar = '+';
//		} else if(op instanceof Sub73) {
//			opChar = '-';
//		} else if(op instanceof Mul73) {
//			opChar = '*';
//		} else {
//			opChar = '/';
//		}
		System.out.printf("%d %c %d = %d\n",n1,op.getOpChar(),n2,op.test(n1, n2));
	}

	public static void main(String[] args) {
		calculator(10, 5, new Sum73());
		calculator(10, 5, new Sub73());
		calculator(10, 5, new Mul73());
		calculator(10, 5, new Div73());

	}

}
