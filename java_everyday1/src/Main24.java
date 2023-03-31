class Tank1 {	// 강사님 버전.
   String tankName;
   int cannon;
   boolean missile;
   boolean initChk;

   void initTank(String tankName, int cannon, boolean missile) {
      this.tankName = tankName;
      this.cannon = cannon;
      this.missile = missile;
      initChk = true;
   }

   void infoTank() {
      if (initChk) {
         System.out.printf("탱크명 : %s, ", tankName);
         System.out.printf("포종류 : %d단계, ", cannon);
         System.out.printf("미사일 %s장착\n", missile ? "" : "미");
      }
   }

   void attack() {
      if (initChk) {
         String boom = null;

         System.out.printf("\n\n< %s 공격 >\n", tankName);
         switch (cannon) {
         case 1:
            boom = "펑";
            break;
         case 2:
            boom = "펑펑";
            break;
         case 3:
            boom = "콰쾅";
            break;
         }

         System.out.printf("대포발사 : %s\n", boom);

         if (missile) {
            System.out.println("미사일 발사 : 초전박살");

         }
      }
   }

}

public class Main24 {
   public static void main(String[] args) {
      Tank1 k1 = new Tank1();
      Tank1 k2 = new Tank1();
      Tank1 k3 = new Tank1();
      
      k1.initTank("K1", 1, false);
      k2.initTank("K2", 2, false);
      k3.initTank("K3", 3, true);
      
      k1.infoTank();
      k2.infoTank();
      k3.infoTank();
      
      k1.attack();
      k2.attack();
      k3.attack();
   }
}