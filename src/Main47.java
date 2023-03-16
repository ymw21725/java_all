class Storage4 {	// 강사님버전 2 , 포함된 액셀표 참고하여 복습.
   private int[] storage;
   private int top = -1;
   private int bot;

   public Storage4(int size) {
      storage = new int[size];
      bot = size - 1;
   }

   private void printTarget(int[] target) {
      for (int t : target) { 
         System.out.printf("%d ", t);
      }
      System.out.println();
   }

   private void printRemainSpace() {
      System.out.printf("남은 공간은 %d개 입니다.\n", bot - top);
      printTarget(storage);
      System.out.println();
   }

   public void store(int... addData) {
      System.out.print("저장 대상 : ");
      printTarget(addData);

      if (addData.length > bot - top) {
         System.out.println("저장 불가 : 입력 인수가 저장공간 보다 크거나 공간이 부족합니다.");
      } else {
         for (int data : addData) {
            storage[++top] = data;
         }

         if (top == bot) {
            System.out.println("저장공간 가득참 - 입력금지");
         }
      }

      printRemainSpace();
   }

   public void drop(int... delData) {
      int firstTop = top;

      System.out.print("삭제 대상 : ");
      printTarget(delData);

      for (int data : delData) {
        for(int i = 0,ct=0 ; i <= top; i++) {
        	if(data == storage[i]) {
        		if(i == bot) {
        			storage[i] = 0;
        		} else {
        			storage[i] = storage[i+1];
        			storage[i-- +1] = 0;
        		}
        		ct++;
        		top--;
        	} else if(storage[i] == 0) {
        		storage[i] = storage[i+ct];
        		storage[i-- +ct] = 0;
        	}
        }
      }
      
      if( firstTop == top ) {
         System.out.println("삭제하려는 데이터가 존재하지 않습니다.");
      } else {
         System.out.printf("자료가 %d개 삭제되었습니다. ", firstTop - top);
      }
      
      printRemainSpace();
   }
}

public class Main47 {
   public static void main(String[] args) {
      Storage4 first = new Storage4(10);

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