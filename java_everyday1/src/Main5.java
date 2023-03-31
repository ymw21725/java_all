public class Main5 {	// 다차원배열로 출력.(노셔 4번예제에서 switch case제거한 예제)

	public static void main(String[] args) {
		int[] ar1= {1,2,3,4,5,6};
	    int[] ar2= {2};
	    int[] ar3= {3,2,3,4,5,6,7,8,};
	    int[] ar4= {4,2,};
	    int[] ar5= {5,2,3,4,5};
	    int[] ar6= {6,2,3,4,5,6,7,};
	    int[] ar7= {7,2,3,};
	    int[] ar8= {8,2,3,4,5,6,7,8,};
	    int[] ar9= {9,2,3,4,5,6,7,8,9};
	    int[] ar10= {10,9,8,7,6,5,4,3,2,1};
		
		
		int ar_total[][] = new int[][] {ar1,ar2,ar3,ar4,ar5,ar6,ar7,ar8,ar9,ar10};
		
		for(int i=0; i< ar_total.length;i++) {
			System.out.printf("ar%d배열 : ", i+1);
			for(int j=0; j<ar_total[i].length; j++) {
				System.out.print(ar_total[i][j] + " ");
			}
			System.out.println();
		}

	}

}
