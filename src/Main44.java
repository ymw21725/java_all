class Storage1 {
	int ar[]; // 저장공간.
	int count; // 빈공간 개수

	Storage1(int size) {
		ar = new int[size];
		count = size;
	}

	private void checkAr(int... ar) { // 배열 확인하기.
		for (int i : ar)
			System.out.print(i + " ");
		System.out.println();
	}

	void store(int... num) {
		System.out.print("\n저장대상 : ");
		checkAr(num);

		if (num.length > count) {
			System.out.println("저장불가 : 입력 인수가 저장공간보다 크거나 남은 공간이 부족합니다.");
		} else {
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; i < ar.length; j++) {
					if (ar[j] == 0) {
						ar[j] = num[i];
						count--;
						if (count <= 0) {
							System.out.print("저장공간 가득참 - 입력 금지\n");
						}
						break;
					}

				}
			}
		}
		System.out.printf("남은 공간은 %d개 입니다\n", count);
		checkAr(ar);

	}

	void drop(int... num) {
		int delCount = 0;
		boolean flag = false;
		int t;
		System.out.print("\n삭제대상 : ");
		checkAr(num);
		
//		for(int i = 0; i < num.length;i++) {
//			for(int j = 0 ; j < ar.length;j++) {
//				if(num[i] == ar[j]) {
//					for(int k = j; k < ar.length-1;k++) {
//						
//						ar[k] = ar[k+1];
//						ar[k+1] = 0;
////						if(ar[k] == 0) break;
//					}
////					ar[ar.length-1-j] = 0;
//				}
//			}
//		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (ar[i] == num[j]) {
					ar[i] = 0;
					count++;
					delCount++;
				}
			}
		}

		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0, tmp; j < ar.length - 1 - i; j++) {
				if (ar[j] == 0) {
					tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
				}
			}
		}

		if (delCount > 0) {
			System.out.printf("자료가 %d개 삭제되었습니다.", delCount);
		} else {
			System.out.println("삭제하려는 데이터가 존재하지 않습니다.");
		}

		System.out.printf("남은 공간은 %d개 입니다.\n", count);
		checkAr(ar);
	}
}

public class Main44 {

	public static void main(String[] args) {
		Storage1 first = new Storage1(10);

		first.drop(5, 1);
		first.store(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		first.store(9, 7);
		first.store(2, 2, 9);
		first.drop(2, 9);
		first.store(3, 5, 5, 9);
		first.store(8, 9, 4);
		first.store(1, 2, 3, 4);
		first.store(5, 1);
		first.drop(1);
		first.drop(3, 4);
		first.drop(3, 4, 6);
		first.drop(5, 8);

	}

}