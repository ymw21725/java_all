class Tank3 {	// 탱크 예제 private, 생성자 사용하여 하기..?
   private String tankName;
   private int cannon;
   private boolean missile;
   
   Tank3(String tankName, int cannon) {
	   this.tankName = tankName;
	   this.cannon = cannon;   
   }
   
   Tank3(String tankName, int cannon, boolean missile) {
	   this(tankName, cannon);
	   this.missile = missile;   
   }
   
   void infoTank() {
         System.out.printf("탱크명 : %s, ", tankName);
         System.out.printf("포종류 : %d단계, ", cannon);
         System.out.printf("미사일 %s장착\n", missile ? "" : "미");
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
	  
		   System.out.println("미사일 발사 : 초전박살");
   }

   void attack() {
	   if(missile) {
		   
	   printTankName();
	   attackCannon();
	   missileAttack();
	   }
   }
   
   void fireCannon() {
	   printTankName();
	   attackCannon();
   }
   
   void fireMissile() {
	   if(missile) {
		   printTankName();
		   missileAttack(); 
	   }
   }
}

public class Main33 {
   public static void main(String[] args) {
      Tank3 k1 = new Tank3("k1", 1);
      Tank3 k2 = new Tank3("k2", 2);
      Tank3 k3 = new Tank3("k3", 3, true);
      
      k1.infoTank();
      k2.infoTank();
      k3.infoTank();
          
      k1.fireCannon();
      k2.fireCannon();
      k3.fireCannon();
      
      k1.fireMissile();
      k2.fireMissile();
      k3.fireMissile();
      
      k1.attack();
      k2.attack();
      k3.attack();
   }
}