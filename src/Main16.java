import java.util.Scanner;

public class Main16{
   public static int validateSum(int min, int max,int tot) {
	   if(min>max) return tot;
	   System.out.printf("%d %s ",min,min == max ? "\n" : "+" );
	   tot+=min;
	   return validateSum(min+1, max, tot);
//	   if(min>max) {
//		   
//		   System.out.println();
//		   return tot;
//	   }
//	   
//	   System.out.printf(" %d "  , min);
//	   if(min<max) {
//		   System.out.print("+");
//	   }
//	   tot += min;
//	   
//	   return validateSum(min+1,max,tot);
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
      
      tot = 0;
      System.out.printf("\n<재귀호출을 이용한 누적합> %d부터 %d까지의 합은 : %d", min, max, validateSum(min,max,tot) );
   }
}