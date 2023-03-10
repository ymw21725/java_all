class Main7 {			// 메서드 개념 및 활용 (return 안할려면 void써야한다)
						// 실인수 종류(타입), 개수와 매개변수 종류,개수가 일치해야 한다.
	
	static int calcSum(int from, int to) {	// 현재는 static이 무조건 들어가야 한다. 나중에 배움. 
		int sum = 0;
		
		for(int i = from; i <= to; i++) {
			sum +=i;
		}
		
		return sum;	
	}
	
	
	
		
	public static void main(String[] args) {	// main이 시작지점이다. 여기서부터 코드 읽기 시작하기.
		System.out.println("1 ~ 10 = " + calcSum(1,10));
		System.out.println("15 ~ 100 = " + calcSum(15,100));
	}

}
