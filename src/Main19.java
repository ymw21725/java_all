import java.util.Scanner;	// 호출 역순으로 하기/.배열버전.

public class Main19{
   public static int validateSum(int min,int[] max) {	
	  int tot;
	  int tMax;

	   if(max[0] <min) return 0;
	   
	   tMax = max[0]--;
	   tot = validateSum(min,max) + tMax;
	   
	   System.out.printf("%d%s",tMax,tMax<max[1]? " + " : "\n\n");
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
      
      
      System.out.printf("\n<재귀호출을 이용한 누적합> %d부터 %d까지의 합은 : %d", min,max, validateSum(min,new int[] {max,max} ));
   }
}