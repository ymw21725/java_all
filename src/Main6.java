public class Main6 { 
	
	public static void main(String[] args) { 
	
		int[][][] grade = new int[3][][];
		int[] a = {5,8,10};
		
		for(int i=0; i<grade.length;i++) {
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
			System.out.printf("< %d학년 >\n", 3-i); {
				for(int j=0; j < grade[i].length;j++) {
					System.out.printf("%d반 : " , j+1);
					for(int j2=0;j2<grade[i][j].length;j2++) {
						System.out.printf("%d번",grade[i][j][j2]);
					}
					System.out.println();
				}
				
			}
		}
		
		
		
	}
}