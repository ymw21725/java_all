import java.util.Scanner; // 이분검색 예제

public class Main20 {	// 모든 로직은 메인 메서드에서 , 이분검색만 별도의 메서드로 재귀검색.(인덱스만 반환하기.)

	public static int binary(int Lx, int Hx, int Key, int[] selectionSort) {
		int mid;
		
		if(Lx <= Hx ) {
			mid = (Lx + Hx) / 2;
			
			if(Key == selectionSort[mid]) {
				return mid;
			} else if(Key < selectionSort[mid]) {
				return binary(Lx,mid-1,Key,selectionSort);
			} else if(Key > selectionSort[mid]){
				return binary(mid+1,Hx,Key,selectionSort);
			}
		}
		return -1;
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
		
		int Lx = 0;
		int Hx = selectionSort.length-1;
		int num;
		
		System.out.print("검색 값 입력 :");
		num = sc.nextInt();

		System.out.println();
		int a = binary(Lx,Hx,num,selectionSort)+1;
		sc.close();
		if(a == 0) {
			System.out.println("찾으려는 값이 존재하지 않습니다.");
		} else {
			System.out.printf("검색 값 %d는(은) selectionSort배열 %d번째 위치에 존재합니다. ",num,a);
		}
	}

}
