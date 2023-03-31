public class Main6 { // 학생,학번 출력예제 교본 48페이지.
	
	public static void main(String[] args) { 
	
		int[][][] grade = new int[3][][];
		int[] a = {5,8,10};
		int classTot = 0;
		
		for(int i=0; i<grade.length;i++) {
			classTot += a[i];
			grade[i] = new int[a[i]][20];
		}
		
		int cnt = 1;
		
		for(int i = 0; i < grade.length;i++) {
			for(int j = 0; j<grade[i].length;j++) {
				for(int j2 = 0; j2<grade[i][j].length ;j2++) {
					grade[i][j][j2] = cnt;
					cnt++;
					
				}
			}
		}
		
		for(int i=0; i<grade.length;i++) {
			System.out.printf("< %d학년 >\n", grade.length-i); 
				for(int j=0; j < grade[i].length;j++) {
					System.out.printf("%2d반 : " , j+1);
					for(int j2=0;j2<grade[i][j].length;j2++) {
						System.out.printf("%3d번 ",grade[i][j][j2]);
					}
					System.out.println();
				}
				
		}
		
		System.out.printf("\n < 학급 : 총 %d학년, 반 : 총 %d반 , 학생수 : 총 %d명 >\n", grade.length,classTot, --cnt );
		
		
	}
}