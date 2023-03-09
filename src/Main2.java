public class Main2 {	// 버블정렬, 몇번 반복했는지 확인. 제대로 정렬되어있으면 돌지않고 빠져나오게하기

	public static void main(String[] args) {
		int[] ar = { 19, 2, 16, 25, 66,1 };
		int cnt =0;
		int flag = 1;
		
		for(int i = 0,tmp; i<ar.length-1;i++) {
			flag =0;
			for(int j =0;j<ar.length-1-i;j++) {
				
				if(ar[j] > ar[j+1]) {
					tmp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = tmp;
					cnt++;
					flag = 1;
				} 	
			}
			if(flag == 0) break;
		}
		
		for(int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + cnt);
	}

}
