class Car62{	
   CarName name;               
   String color;   
   
   Car62(String aModel, int aYear, String aColor){
      name=new CarName(aModel,aYear);
      color=aColor;
   }
   
    class CarName{          	// 이너 클래스는 클래스가 아닌 객체에 소속되며, 따라서 주 클래스 외부에서
      String model;         	// 이너 클래스 객체를 생성하려면 31행과 같이 주 객체가 먼저 생성되어야만 
      int year;       			// 주 클래스에 소속된 이너 클래스 타입의 객체 생성 가능.
    
      CarName(String aModel, int aYear){
         model=aModel;
         year=aYear;
      }
      
      void outColor() {
         System.out.println("색상은" + color + "입니다.");    	// 이너 클래스 내 모든 멤버는 주 클래스 모든 멤버와  
      }															// 동등한 자격을 가지며 정적,비정적 여부상관없이 직접참조가능
   }															// 하지만 반대가 되는 주 클래스의 종속 클래스 접근은
    															// 정적 이너클래스와 마찬가지로 이너 클래스 또한 Car62객체에
   void outInfo() {												// 소속된 독립적인 클래스 타입이므로 반드시 내부적으로 이너 클래스
	   															// 객체를 생성해야만 그 내부멤버 참조 가능.
      System.out.printf("모델=%s, 년식=%d, 색상=%s\n", name.model, name.year, color);
   }
}

public class Main62{	
   public static void Main(String[] args)   {      
      Car62 pride=new Car62("프라이드",2005,"파랑");
      
      pride.outInfo();
      pride.name.outColor();	// 이너 클래스 내부 멤버는 주 클래스 객체 내부 생성된 이너 클래스 객체를 통해서만 접근 가능.
      
//      pride.CarName pride2 = pride.new CarName("프랑이",2009);
      
      // CarName클래스는 객체에 소속이되므로 이와 같은 변숫 선언시 pride객체의 CarName타입으로 변수를 선언하는 문법적 오해를
      // 할수 있으나 타입 지정자에는 개체 자체가 올 수 없음. 따라서 변수 선언부는 정적 클래스와 동일하게 클래스 타입안의 타입의
      // 형태로 선언하는 것이 적법하다.
      // 단 CarName객체의 생성은 Car타입의 객체 pride에 종속되어 주객체.new 이너클래스명(생성자) 와 같은 형태로 
      // new연산자 앞에서 주 객체 소속임을 밝혔으므로 변수 선언부와 같이 주 클래스 소속임을 다시 명시하지 않고 이너 클래스
      // 생성자를 직접호출.
      
      Car62.CarName pride2=pride.new CarName("프랑이",2009);   
      
      
      System.out.println();
                 
      pride.outInfo();     // pride2는 외부에 생성된 이너 클래스 타입의 독립적인 객체로써
      						// 주 객체인 pride를 통해 생성이 되었을뿐 두 객체는 전혀 다른 별도의 객체임.
      System.out.printf("\n모델 = %s, 년식 = %d\n",pride2.model,pride2.year);
   }   
}