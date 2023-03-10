public class Main13{
   public static void output(int n) {
      if( n<=0 ) {               // 재귀호출 탈출 코드.   
         System.out.println();
         return;
      }
      
      System.out.println("( 재귀호출 직전까지의 코드는 호출 순서대로 진행 ),  n = " + n );
      
      output(n-1);   // 당행의 재귀호출 시점까지의 모든 코드 실행은 최종 재귀호출 탈출 지점까지 호출 순서대로 진행됨을 확인 가능.
                  // 단, 호출 완료후 원 호출시점으로의 복귀 순서는 최종 재귀호출 탈출 코드를 통해 역순으로 진행됨에 따라 14행
                  // 처럼 당행의 재귀호출 완료후의 코드 실행은 호출 순서의 역순으로 진행됨을 확인 가능.
      
      System.out.println("( 재귀호출 직후부터의 코드는 호출 역순으로 진행 ),  n = " + n);
   }
   
   public static void main(String[] args) {
      output(3);
   }
}