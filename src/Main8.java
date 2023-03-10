class Main8 {		// void return 설명.

	public static void main(String[] args) {	// 값을 넘겨줘서 함수에서 전부 출력하므로 return값이 필요없다. 그러므로 void임.
		printSum(1,10);
		printSum(15,100);
	}
	
	static void printSum(int from, int to) {	// main에서 넘겨받은 실인수 들이 매개변수로 들어옴, 
		int sum = 0;
		for(int i = from; i<=to; i++) {
			sum += i;
			
		}
		
		System.out.println(from + " ~ " + to + " = " + sum);
	} 

}
