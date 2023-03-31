class Tank40 {	// Tank 강사님 예제
   String tankName;
   int cannon;
   
   public Tank40(String tankname, int cannon) {
      this.tankName = tankname;
      this.cannon = cannon;
   }
   
   public void infoTank() {
      System.out.printf("탱크명 : %s\n", tankName);
      System.out.printf("대포 : %d단계\n", cannon);
   }
   
   public void printTankName() {
      System.out.printf("\n\n< %s 탱크 >\n", tankName);
   }
   
   public void fireCannon() {
      printTankName();
      System.out.println("대포발사 : 펑");
   }
}

class Tier1 extends Tank40 {
   public Tier1(String tankname, int cannon) {
      super(tankname, cannon);
   }

   @Override
   public void infoTank() {
      super.infoTank();
      System.out.println("미사일 미장착");
      System.out.println("핵미사일 미장착");
      System.out.println();
   }
}

class Tier2 extends Tank40 {
   public Tier2(String tankname, int cannon) {
      super(tankname, cannon);
   }
   
   @Override
   public void infoTank() {
      super.infoTank();
      System.out.println("미사일 장착");
      System.out.println("핵미사일 미장착");
      System.out.println();
   }

   @Override
   public void fireCannon() {
      printTankName();
      System.out.println("대포발사 : 펑펑");
   }
   
   public void fireMissile() {
      printTankName();
      System.out.println("미사일 발사");
   }
}

class Tier3 extends Tank40 {
   public Tier3(String tankname, int cannon) {
      super(tankname, cannon);
   }
   
   @Override
   public void infoTank() {
      super.infoTank();
      System.out.println("미사일 장착");
      System.out.println("핵미사일 장착");
      System.out.println();
   }
   
   @Override
   public void fireCannon() {
      printTankName();
      System.out.println("대포발사 : 펑펑펑");
   }
   
   public void fireMissile() {
      printTankName();
      System.out.println("미사일 발사 : 초전박살");
   }
   
   public void fireNuclear() {
      printTankName();
      System.out.println("핵미사일 발사 : 지구멸망");
   }
}

public class Main52{
   public static void main(String[] args)   {
      Tier1 tier1 = new Tier1("K1", 1);
      Tier2 tier2 = new Tier2("K2", 2);
      Tier3 tier3 = new Tier3("K3", 3);
      
      tier1.infoTank();
      tier1.fireCannon();
      
      tier2.infoTank();
      tier2.fireCannon();
      tier2.fireMissile();
      
      tier3.infoTank();
      tier3.fireCannon();
      tier3.fireMissile();
      tier3.fireNuclear();
      
      
      
   }
}