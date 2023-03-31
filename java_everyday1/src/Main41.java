import java.util.Scanner;

enum Fruit {
   APPLE, BANANA, TOMATO, MELON
}

public class Main41 {
   public static void main(String[] args) {
      Fruit[] fruit1 = Fruit.values();

      for (Fruit fruit2 : fruit1) {
         switch (fruit2) {
         /*
             switch 문의 평가 대상이 열거형인 경우, case 문의 선택값은 이미 해당 열거타입에 해당하는 값으로
             판단하여 열거타입명을 생략하고 열거상수만 표기. 열거타입을 지정하면 오히려 컴파일 에러 발생.
             단, 이는 case 문에만 해당.
         */
         case APPLE: 	// case Fruit.APPLE 오류. 
            System.out.println(Fruit.APPLE + "의 한글발음은 \"사과\"입니다.");
            break;
         case BANANA:
            System.out.println(Fruit.BANANA + "의 한글발음은 \"바나나\"입니다.");
            break;
         case TOMATO:
            System.out.println(Fruit.TOMATO + "의 한글발음은 \"토마토\"입니다.");
            break;
         case MELON:
            System.out.println(Fruit.MELON + "의 한글발음은 \"멜론\"입니다.");
            break;
         }
      }
      System.out.println("\n");
      
      Scanner scanner = new Scanner(System.in);
      String fruitName;
      Fruit fruit3 = null;   // 예외 발생을 대비하여 반드시 초기화.

      System.out.print("사과, 바나나, 토마토, 멜론 중 하나의 과일명을 영어 대문자로 입력하시오 : ");
      fruitName = scanner.next();
      
      try {	// try-catch문에서 try는 일단 무조건 1번 실행. 
         /*
            valueOf 메서드에 전달 가능한 인수값은 해당 열거형 상수와 동일한 형태의 문자열만 전달 가능.
            문자열 인수 값(fruitName)이 해당 열거 상수와 일치하는 형태가 아닐 때에는 잘못된 인수 형식
            전달로 인한 IllegalArgumentException 발생.
         */
         fruit3 = Fruit.valueOf(fruitName);

         System.out.println("입력한 과일명에 대한 스펠링은 " + fruit3 +
                       ( (fruit3 == fruit1[0] || fruit3 == fruit1[3]) ? "이 " : "가 " ) + "맞습니다.");
         				// 영어 발음 관련해서 이, 가 구분.
         switch (fruit3) {
         case APPLE:
            System.out.println("한글로는 \"사과\"입니다.");	// 따옴표 쓰려고 백슬래시 사용.
            break;
         case BANANA:
            System.out.println("한글로는 \"바나나\"입니다.");
            break;
         case TOMATO:
            System.out.println("한글로는 \"토마토\"입니다.");
            break;
         case MELON:
            System.out.println("한글로는 \"멜론\"입니다.");
            break;
         }
      } catch (Exception e) {	// Exception e는 컴파일 에러일 시 , 일치하지 않을 시 catch문 에서 컴파일 에러면 출력하고 나옴.
         System.out.println("스펠링이 맞지 않습니다.");
//         System.out.println(e.getMessage());
      }
      
      scanner.close();
   }
}