enum Tank10 {
	TIER1("1단계", 30, 1), TIER2("2단계", 50, 2), TIER3("3단계", 70, 3, true, false), TIER4("4단계", 100, 3, true, true);

	public String tankName;
	private final String TankTier; // 레벨(1단계)
	int ngd; // 내구도
	int cannonLevel;
	public boolean missile;
	public boolean hackMissile;

	Tank10(String tankName, String TankTier) {
		this.tankName = tankName;
		this.TankTier = TankTier;
	}

	Tank10(String TankTier, int ngd, int cannonLevel) {
		this.TankTier = TankTier;
		this.ngd = ngd;
		this.cannonLevel = cannonLevel;
	}

	Tank10(String TankTier, int ngd, int cannonLevel, boolean missile, boolean hackMissile) {
		this(TankTier, ngd, cannonLevel);
		this.missile = missile;
		this.hackMissile = hackMissile;
	}

	public String getTankTier() {
		return TankTier;
	}
}

class Tank11 {
	String tankName;
	Tank10 tankTier;
	static int tankCount;
	int a = ++tankCount;	// ++먼저 해줘야 바로반영

	Tank11(String tankName, Tank10 tankTier) {
		this.tankName = tankName;
		this.tankTier = tankTier;
	}

	void Specview() {
		System.out.printf("%d번째 전차 \n",a);
		System.out.println("탱크명 : " + tankName);
		System.out.println("티어 : " + tankTier);
		System.out.println("내구도 : " + tankTier.getTankTier());
		System.out.printf("%d단계 포 장착\n", tankTier.cannonLevel);
		System.out.printf("미사일 %s장착 \n", tankTier.missile ? "" : "미");
		System.out.printf("핵미사일 %s장착 \n\n", tankTier.hackMissile ? "" : "미");
	}

	private void printTankName() {
		System.out.printf("\n\n< %s 공격 >\n", tankName);
	}

	private void attackCannon() {
		String boom = null;
		switch (tankTier.cannonLevel) {
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

	private void hackmissileAttack() {
		System.out.println("핵미사일 발사 : 초초초전박살");
	}

	public void attack() {
		if (tankTier.missile) {
			if (tankTier.hackMissile) {
				printTankName();
				attackCannon();
				missileAttack();
				hackmissileAttack();
			}
		}
	}

	public void fireCannon() {
		printTankName();
		attackCannon();
	}

	public void fireMissile() {
		if (tankTier.missile) {
			printTankName();
			missileAttack();
		}
	}

	public void firehackMissile() {
		if (tankTier.hackMissile) {
			printTankName();
			hackmissileAttack();
		}
	}
}

public class Main42 {
	public static void main(String[] args) {
		System.out.println();
		Tank11 k1 = new Tank11("K1전차", Tank10.TIER1);
		Tank11 k1a1 = new Tank11("K1A1전차", Tank10.TIER2);
		Tank11 k1a2 = new Tank11("K1A2전차", Tank10.TIER3);
		Tank11 x2 = new Tank11("X2흑표전차", Tank10.TIER4);
		k1.Specview();
		k1a1.Specview();
		k1a2.Specview();
		x2.Specview();

		k1.fireCannon();
		k1a1.fireCannon();
		k1a2.fireCannon();
		x2.fireCannon();
		
		k1.fireMissile();
		k1a1.fireMissile();
		k1a2.fireMissile();
		x2.fireMissile();

		k1.firehackMissile();
		k1a1.firehackMissile();
		k1a2.firehackMissile();
		x2.firehackMissile();
	}
}
