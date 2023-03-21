package j01_class;

public class Ex03_StudentUser   {

	public static void main(String[] args) {
		Ex03_Student[] ar = { new Ex03_Student("양민우","010-7310-7050",32,"잘부탁드립니다",80,90),
							  new Ex03_Student("양민우","010-7310-7050",32,"인포2",10,10),
							  new Ex03_Student("양민우","010-7310-7050",32,"인포3",30,10),
							  new Ex03_Student("양민우","010-7310-7050",32,"인포4",60,70),
							  new Ex03_Student("양민우","010-7310-7050",32,"인포5",50,20)};
		Ex03_Student[] ar1 = new Ex03_Student[5];
		
		
			for(int i = 0; i < ar.length;i++) {
				for(int j = i+1; j < ar.length; j++) {
					if(ar[i].getSum() < ar[j].getSum()) {
						ar1[0] = ar[i];
						ar[i] = ar[j];
						ar[j] = ar1[0];
					}
				}
			}
			
			for(Ex03_Student i:ar) {
				System.out.println(i);
				System.out.println();
			}

	}

}
