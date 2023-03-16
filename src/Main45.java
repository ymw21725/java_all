

class Storage {
	private final int dataAr[];
	private int nextIdx = 0;

	Storage(int i) {
		dataAr = new int[10];
	}
	
	private void printSize() {
		System.out.printf("남은 공간은 %d개 입니다.\n", dataAr.length - nextIdx);
		for (int v : dataAr) System.out.printf("%d ", v);
		System.out.println("\n");
	}
	
	private void printWho(int[] a, String del) {
		System.out.printf("%s대상:", del == "삭제" ? "삭제" : "저장");
		for (int v : a) System.out.printf(" %d", v);
		System.out.println();
	}

	public void store(int... a) {
		
		printWho(a,"저장");
			
		if (a.length <= dataAr.length - nextIdx) {
			
			for (int i = nextIdx, j = 0; i < nextIdx + a.length; i++) {
				dataAr[i] = a[j];
				j++;
			}		
			nextIdx = nextIdx + a.length;
			
		}
		
		if(nextIdx > dataAr.length-1) System.out.println("저장공간 가득참 - 입력 금지");
		else System.out.println("입력 인수가 저장공간보다 크거나 남은 공간이 부족합니다.");
		printSize();
	}
// =======================================================================================
	public void drop(int... a) {
		int del = 0;
		boolean flag = false; 								// 데이터 삭제여부
		
		printWho(a,"삭제");
		//
		for (int i = 0, searchedP = 0; i < a.length; i++) { // 가변인수	
			
			for (int j = 0; j < nextIdx; j++) { 			// 데이터배열
				if (dataAr[j] == 0) {
					break;									// 현재 데이터가 이미 0이면 순회종료.
				}
				if (dataAr[j] == a[i]) {					// 삭제 대상 값인 경우
					dataAr[j] = 0;
					del++;
					if (!flag) searchedP = j;				// 다음 정렬시 데이터 당겨올 위치
					flag = true;
				} else if (flag) {
						dataAr[searchedP] = dataAr[j];
						dataAr[j] = 0;
						searchedP++;
				}
			}
			flag = false;
			searchedP = 0;
		}	
		//
		nextIdx -= del;
		if (del > 0) {
			System.out.printf("자료가 %d개 삭제되었습니다.\n", del);
			printSize();
		} else {
			System.out.println("삭제하려는 데이터가 존재하지 않습니다.");
			printSize();
		}
	}
// =======================================================================================
}

public class Main45 {
	public static void main(String[] args) {
		Storage first = new Storage(10);

	      first.drop(5,1);
	      first.store(1,2,3,4,5,6,7,8,9,10,11);
	      first.store(9,7);
	      first.store(2,2,9);
	      first.drop(2,9);
	      first.store(3,5,5,9);
	      first.store(8,9,4);
	      first.store(1,2,3,4);
	      first.store(5,1);
	      first.drop(1);
	      first.drop(3,4);
	      first.drop(3,4,6);
	      first.drop(5,8);
	}
}

