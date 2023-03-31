public class Main3 {	// 다차원배열 및 1차 포인터 및 2차포인터 관계여부.
	
	public static void main(String[] args) {	
		int[][] a = new int[3][2];			// 다차원배열 a 생성(2차 포인터) 1차 포인터 3개있으므로 숫자 3 지정.
		int[] as = {2,5,10};		// 행마다 줄 크기 지정. 
		
		for(int i = 0; i < a.length; i++) {	// 첫째줄 2, 둘째줄 5, 3째줄 10개 씩 생성하는 가변적 배열
			a[i] = new int[as[i]];
		}
//		for(int i = 0; i < a.length; i++) {
//			a[i] = new int[2];			// for문을 이용하여 a의 값부에 1차포인터(첫주소 저장) 일반변수 2개씩 있으므로.
//			
//		}
		
		// 위의 주석부분을 없애고 처음 a쪽에 초기화 시 new int[3][]을 new int[3][2]로 해주어도 된다.
		
		for(int i = 0,v =1; i < a.length; i++) {	// 중첩 for문을 이용하여 v++해주고 
			for(int j = 0; j <a[i].length; j++) {	// 차례대로 값 배치.
				a[i][j] = v++;
			}
		}
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {		// 위에서 만들어 놓은 배열 출력.
			for(int j = 0; j <a[i].length; j++) {
				System.out.printf("%2d", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int [] i:a) {	// foreach문으로 출력함. a를 int [] 라는 타입 맞추어주고 사본변수 i로 생성. i의 타입은 1차포인터 배열형태.
			for(int j:i) {	// 사본변수 i에 저장되어있는 값들이 j로 출력. j의 타입은 일반변수형 타입임.
				System.out.printf("%2d",j);
			}
			System.out.println();
		}
		
	}

}
