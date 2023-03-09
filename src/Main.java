public class Main {
	public static void main(String[] args) { 
		int[] ar = {50,70,40,60,80};
		
		for(int j=0,t; j < ar.length-1;j++) {
			for(int p = j+1; p<ar.length;p++) {
				if(ar[j] > ar[p]) {
					t = ar[j];
					ar[j] = ar[p];
					ar[p] = t;
				}
			}
		}
		
		for(int i: ar) {
			System.out.print(i + " ");
		}
	}
}	
