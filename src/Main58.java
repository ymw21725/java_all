class Tank58 {
   String tankName;
   int cannon;

   public Tank58(String tankname, int cannon) {
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

class Tier11 extends Tank58 {
   public Tier11(String tankname, int cannon) {
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

class Tier21 extends Tank58 {
   public Tier21(String tankname, int cannon) {
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

class Tier31 extends Tank58 {
   public Tier31(String tankname, int cannon) {
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

public class Main58 {
   public static void testTank(Tank58 tank) {
      tank.fireCannon();	// testTank에서 한번에 출력.
   }

   public static void main(String[] args) {
      Tank58[] tank = {
            new Tier11("K1", 1),	// 배열로 받아옴.
            new Tier21("K2", 2),	
            new Tier31("K3", 3),
      };
      
      
      for(Tank58 t:tank) {
         testTank(t);	// foreach문을 이용해 전체 배열 출력.
      }
   }
}