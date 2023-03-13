import java.util.Scanner; // 이분검색 예제

public class Main20 {	// 모든 로직은 메인 메서드에서 , 이분검색만 별도의 메서드로 재귀검색.(인덱스만 반환하기.)

	 static int binary(int Lx, int Hx, int Key, int[] selectionSort) {
		if(Lx>Hx) return -1;
		int mid=(Lx + Hx) / 2;

		if(Key == selectionSort[mid]) return mid;
		else if(Key < selectionSort[mid]) Hx = mid-1;
		else Lx = mid+1;
		
		return binary(Lx,Hx,Key,selectionSort);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] selectionSort = { 33,11,77,66,55,100,22,88,44,99 };
		
		for(int j = 0,tmp; j < selectionSort.length-1;j++) {
			for(int p = j+1; p < selectionSort.length;p++) {
				if(selectionSort[j] > selectionSort[p]) {
					tmp = selectionSort[j];
					selectionSort[j] = selectionSort[p];
					selectionSort[p] = tmp;
				}
			}
		}
		
		int num;
		
		System.out.print("검색 값 입력 :");
		num = sc.nextInt();

		System.out.println();
		int a = binary(0,selectionSort.length-1,num,selectionSort);
		sc.close();
		if(a == -1) {
			System.out.println("찾으려는 값이 존재하지 않습니다.");
		} else {
			System.out.printf("검색 값 %d는(은) selectionSort배열 %d번째 위치에 존재합니다. ",selectionSort[a],a+1);
		}
	}

}
