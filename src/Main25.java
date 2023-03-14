class Tank2 {	// 미사일 대포 구분해서 하기. 누가 쏘는지에 따라 구분?
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
   
   void printTankName() {
	   System.out.printf("\n\n< %s 공격 >\n", tankName); 
   }
   
   void attackCannon() {
	   String boom = null;
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
   }

   void missileAttack() {
	   if(missile) {
		   System.out.println("미사일 발사 : 초전박살");
	   } 
   }

   void attack() {
      if(initChk) {
    	  printTankName();
    	  attackCannon();
    	  missileAttack();
      }
   }
   
   void fireCannon() {
	   if(initChk) {
		   printTankName();
		   attackCannon();
	   }
   }
   
   void fireMissile() {
	   if(initChk) {
		   printTankName();
		   missileAttack();
	   }
   }
}

public class Main25 {
   public static void main(String[] args) {
      Tank2 k1 = new Tank2();
      Tank2 k2 = new Tank2();
      Tank2 k3 = new Tank2();
      
      k1.initTank("K1", 1, false);
      k2.initTank("K2", 2, false);
      k3.initTank("K3", 3, true);
      
//      k1.infoTank();
//      k2.infoTank();
//      k3.infoTank();
      
//      k1.attack();
//      k2.attack();
//      k3.attack();
      
//      k1.missileAttack();
//      k2.missileAttack();
//      k3.missileAttack();
      k3.attack();
      k3.fireCannon();
      k3.fireMissile();
   }
}