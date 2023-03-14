/*
 * <정적멤버와 일반멤버의 참조 관계>
 * 객체 생성 이전 클래스의 사용 시점부터 사용 가능한 정적멤버와 달리 객체 생성 이후 시점부터 사용 가능한 비정적멤버는 참조의
 * 범위가 다름. 클래스 내에서 일반멤버는 정적멤버까지 참조가 가능하나,이와 반대로 정적멤버는 객체 생성후에나 참조가 가능한
 * 비정적 멤버의 참조가 불가.  즉, 비정적 멤버는 정적멤버를 포함한 모든 멤버를 참조 가능한 반면 정적멤버는 정적멤버끼리만 
 * 참조 가능. 단, 이는 클래스 내에서 정적멤버가 비정적멤버에 대한 객체 생성 여부를 알 수 없어 정적멤버가 비정적멤버를 직접
 * 참조하는 것이 불가할뿐, 객체 생성이 인지된다면 정적멤버라도 클래스 내에서 그 객체의 참조를 통해 비정적멤버에 접근 가능.
 * 여기서 객체의 생성 인지는 실제 객체의 생성이 확인되어야 하는 것은 아니며, 논리 로직을 통한 객체 생성이 확인되지 않더라도
 * 참조변수를 통한 비정적멤버에 대한 접근 자체만으로 객체를 통한 접근으로 인정.
 */
class Stm_Gen_ref{// 정적은 정적끼리만 참조가능. 비정적은 전부다 참조 가능.
   static int stm;	// 정적변수 생성
   int gen;	// 비정적변수 생성
   
   static {
      stm=5;
//      stm=gen;	// 정적은 비정적 참조 불가.
   }
   
   static void stmout() {	// 정적
      System.out.println(stm);
//      System.out.println(gen);	// 비정적이므로 참조 불가.
//      genout();	// 비정적이므로 참조 불가.
//      System.out.println(this.stm);   // this 또한 객체 자신을 의미하므로 정적멤버에는 적용 불가.
   }
   
   static void stmout2(Stm_Gen_ref stm_Gen_ref) {
      stm_Gen_ref.genout();   // stmout2는 정적메서드이므로 비정적멤버에 대한 직접적인 참조가
                              // 불가하지만, 객체의 참조를 통한 비정적멤버에 대한 접근은 허용.
                              // 안전한 접근을 위해 원칙상 객체의 생성여부를 체크하는 방어코드가
                              // 삽입되어야 하지만, 방어코드가 없어도 정적멤버가 참조변수만을 통한
                              // 비정적멤버에 대한 접근이 가능함을 직관하기 위해 생략. 
      
      
   }   
   
   void genout() {	// 비정적이므로 전부 참조가능.
      System.out.println(gen);
      System.out.println(stm);
      stmout();
      System.out.println(this.gen);
   }
}

public class Main37{
   public static void main(String[] args) {
      Stm_Gen_ref.stmout2(new Stm_Gen_ref());
   }
}