enum TankTier{
	TIER1("1단계",30,1),
	TIER2("2단계",50,2),
	TIER3("3단계",70,3,true,false),
	TIER4("4단계",100,3,true,true);
	
	private final String level;
	public final int durability;
	public final int cannon;
	public boolean missile;
	public boolean nuclear;
	
	private TankTier(String level, int durability, int cannon){
		this.level = level;
		this.durability = durability;
		this.cannon = cannon;
	}
	
	private TankTier(String level, int durability, int cannon, boolean missile, boolean nuclear) {
		this(level,durability,cannon);
		this.missile = missile;
		this.nuclear = nuclear;
	}
	
	public String getLevel() {
		return level;
	}
}

class Tank20{
	private String tankName;
	private TankTier tankTier;
	private static int tankCnt;
	private final int tankNum = ++tankCnt;
	
	public Tank20(String tankName, TankTier tankTier) {
		this.tankName = tankName;
		this.tankTier = tankTier;
//		tankCnt++;
	}
	
	public void infoTank() {
		System.out.printf("< %d호 전차 >\n",tankNum);
        System.out.printf("탱크명 : %s, ", tankName);
        System.out.printf("티어 : %s\n",tankTier.getLevel());
        System.out.printf("포종류 : %d단계, ", tankTier.cannon);
        System.out.printf("미사일 %s장착\n", tankTier.missile ? "" : "미");
        System.out.printf("핵미사일 %s장착\n", tankTier.nuclear ? "" : "미");
  }
	
	private void printTankName() {
		   System.out.printf("\n\n< %s 공격 >\n", tankName); 
	   }
	   
	   private void attackCannon() {
		   String boom = null;
		   		switch (tankTier.cannon) {
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

	   private void missileAttack() {
			  
		   System.out.println("미사일 발사 : 초전박살");
   }

	   private void attackNuclear() {
		   System.out.println("핵미사일 발사 : 지구멸망");
		   
	   }
   
   
   public void fireCannon() {
	   printTankName();
	   attackCannon();
   }
   
   public void fireMissile() {
	   if(tankTier.missile) {
		   printTankName();
		   missileAttack(); 
	   }
   }
   
   public void fireNuclear() {
	   if(tankTier.nuclear) {
		   printTankName();
		   attackNuclear();
	   }
   }
}


public class Main43 {

	public static void main(String[] args) {
		Tank20 k1 = new Tank20("K1전차",TankTier.TIER1);
		Tank20 k1a1 = new Tank20("K1A1전차",TankTier.TIER2);
		Tank20 k1a2 = new Tank20("K1A2전차",TankTier.TIER3);
		Tank20 x2 = new Tank20("X2흑표전차",TankTier.TIER4);
		
		k1.infoTank();
		k1a1.infoTank();
		k1a2.infoTank();
		x2.infoTank();
		
		k1.fireCannon();
		k1a1.fireCannon();
		k1a2.fireCannon();
		x2.fireCannon();
		
		k1.fireMissile();
		k1a1.fireMissile();
		k1a2.fireMissile();
		x2.fireMissile();
		
		k1.fireNuclear();
		k1a1.fireNuclear();
		k1a2.fireNuclear();
		x2.fireNuclear();
		
		
	}

}
