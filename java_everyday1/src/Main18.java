import java.util.Scanner;	// 호출 역순으로 하기/. 재귀호출 후 불러오냐 그전에 재귀호출 전에 불러오냐에 따라 역순인지 아닌지 구분.

public class Main18{
   public static int validateSum(int min,int max,int firstMax) {	// 1,10이라고 가정.
	  int tot;
	  
//	  if(min>max) return t;
//
//	  t = validateSum(t, min, max-1);
//	  
//	  System.out.printf("%d%s",max,min<max ? " + " : " \n ");
//	  t+=max;
//
//	  return t;  
	   
//	   return 전누적합 + 현재대상값
	   if(max<min) return 0;
	   tot = validateSum(min,max - 1,firstMax) + max;
	   
	   System.out.printf("%d%s",max,max<firstMax ? " + " : "\n\n");
	   return tot;
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int tot=0;
      int n1, n2;
      int min, max;
      
      System.out.print("정수1 : ");
      n1=scanner.nextInt();
      System.out.print("정수2 : ");
      n2=scanner.nextInt();
      scanner.close();
      
      if(n1>n2) {
         max=n1;
         min=n2;
      } else {
         max=n2;
         min=n1;
      }
      
      for (int i = min; i <=max ; i++) {
         tot+=i;
      }
      System.out.printf("<루프 이용 검증>%d부터 %d까지의 합은 : %d\n\n", min, max, tot);
      
      
      System.out.printf("\n<재귀호출을 이용한 누적합> %d부터 %d까지의 합은 : %d", min, max, validateSum(min,max,max) );
   }
}