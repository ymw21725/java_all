public class Main4 {

	public static void main(String[] args) {
		int[][] ar1 = {
				{1,2,3},
				{4,5,6}
		};
		
		int[][][] ar2 = {
				{
					{1,2,3},
					{4,5,6}
				},
				{
					{7,8,9},
					{10,11,12},
					{13,14,15}
				}
		};
		
		int[][][] ar3 = new int[5][3][8];
		
		System.out.println(ar3.length);	// 5
		System.out.println(ar3[0].length);	// 3	
		System.out.println(ar3[0][0].length);	// 8 
		
		System.out.println(ar2.length); // 2
		System.out.println(ar2[0].length);// 2
		System.out.println(ar2[0][1].length); // 3
		System.out.println(ar2[0][0].length); // 3

	
	
	for(int i=0; i < ar1.length;i++) {
		for(int j = 0; j < ar1[0].length; j++) {
			System.out.println(ar1[i][j] + " ");
			
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=0; i < ar2.length;i++) {
		for(int j = 0; j < ar2[0].length; j++) {
			for(int j2 = 0; j2 < ar2[0][0].length; j2++) {
				System.out.print(ar2[i][j][j2] + " ");
			}
			
			
		}
		System.out.println();
	}
	System.out.println();
	
	
	}
}
