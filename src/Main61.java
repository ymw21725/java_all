/*
 *  정적 이너 클래스와 이너 클래스는  private 지정을 통해  외부에 공개하지 않는 내부 타입으로만 사용하는 것이 일반적.
 *  따라서 당 챕터에서는 주 클래스와 종속 클래스간 참조 관계에 대해 중점적으로 설명하되 특수한 경우 외부 객체 생성 시의 
 *  특성과 참조 관계도 포함.
 */
class Car61{	// 정적 이너 클래스 교본 17페이지 참조.
   CarName name;               
   String color;   
   
   Car61(String aModel, int aYear, String aColor){
      name=new CarName(aModel,aYear);
      color=aColor;
   }
   
   static class CarName{      // CarName은  Car클래스에  소속된  독립적인  정적클래스로써  객체로 부터가  아닌  Car클래스로부터 생성이    
      String model;         // -가능한  클래스 타입 멤버일 뿐,  멤버변수가 아님에 유의. 따라서  CarName은  Car클래스 선언 시점부터
      int year;            // -사용 가능할 타입일 뿐  객체 생성과는 무관한  Car클래스에 소속된  독립적인 클래스 타입.  CarName이 -
                        // 공유하는  정보는 클래스(타입)이지 실제 기억 공간이 아니며  CarName 타입이 정적멤버이지  name은  정적
                        // -멤버가 아니므로 이를 혼돈해서는 안됨. 정적이너클래스는  private 지정여부에  따라 두 가지 목적으로 -
                        // 사용. 종속클래스에  대한  private 지정은 주클래스의 종속클래스를 숨김으로써 주클래스의 내부적인 사용
                        // -목적으로만 활용됨으로  외부의 접근을 일제 차단. 또는 주클래스를  통한  접근만을 허용함으로써 제한적인-
                        // 접근 통제. 단, 정적이너클래스의 경우 주클래스는 종속클래스의  접근이 용이한 반면 반대로 종속클래스는 -
                        // 주클래스의 정적멤버만 접근이 가능함에 유의.
      CarName(String aModel, int aYear){
         model=aModel;
         year=aYear;
      }
      
      void outColor() {
//         System.out.println(color);      // CarName은  Car클래스 내부적으로 정적멤버이므로 정적멤버만 참조 가능.(위의 12번쨰줄 color는 비정적이므로 참조불가)
      }
   }
   
   void outInfo() {
      System.out.printf("모델=%s, 년식=%d, 색상=%s\n", name.model, name.year, color);
   }
}

public class Main61{	
   public static void Main(String[] args)   {      
      Car61 pride=new Car61("프라이드",2005,"파랑");
      
      pride.outInfo();
      System.out.println(pride.name.model);      
//      System.out.println(Car.name.model);    // name은 Car객체에 소속된  CarName정적클래스 타입의 비정적 멤버변수일뿐-
                                    // 이므로 Car클래스를 통해서 접근해야 하는 정적 멤버와 혼돈해서는 안됨. 즉,-
                                    // name은 비정적 멤버임을 구분.
      
      Car61.CarName grandeur=new Car61.CarName("그랜다이져",2009);   // 정적이너클래스는 주 클래스에 종속 되어 있는 하나의 -
                                                // 타입이자 독립적인 클래스임에 유의.
      System.out.printf("모델=%s, 년식=%d\n", grandeur.model, grandeur.year);
      
      
      Car61 carnival=new Car61("카니발",2011,"노랑");
      
      carnival.outInfo();            // 정적 멤버인 것은 CarName 타입일뿐 name은 객체에 소속된 비정적
      pride.outInfo();            // -멤버임으로 객체 별 개별적인 정보이지 공유 정보가 아님에 유의.
   }   
}