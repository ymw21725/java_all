class Tank30 { // 탱크 예제 상속 및 오버라이딩으로 해서
	String tankTier;
	String tankName;
	int cannon;
	boolean missile;
	boolean nuclear;

	public void infoTank() {
		System.out.printf("티어 : %s \n", tankTier);
		System.out.printf("탱크명 : %s \n", tankName);
		System.out.printf("대포 : %d 단계\n", cannon);
		System.out.printf("미사일 %s장착\n", missile ? "" : "미");
		System.out.printf("핵미사일 %s장착\n\n", nuclear ? "" : "미");
	}

	public void printTankName() {
		System.out.printf("\n\n< %s 공격 >\n", tankName);
	}

	public void attackCannon() {
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

	public void missileAttack() {
		System.out.println("미사일 발사 : 초전박살");
	}

	public void attackNuclear() {
		System.out.println("핵미사일 발사 : 지구멸망");
	}

	public void fireCannon() {
		printTankName();
		attackCannon();
	}
}

class Tank30Sub1 extends Tank30 {
	{
		tankTier = "Tier1";
		tankName = "k1";
		cannon = 1;
	}

	public void infoTank() {
		super.infoTank();
	}
}

class Tank30Sub2 extends Tank30 {
	{
		tankTier = "Tier2";
		tankName = "k2";
		cannon = 2;
		missile = true;
	}

	public void infoTank() {
		super.infoTank();
	}

	public void fireMissile() {
		if (missile) {
			super.printTankName();
			super.missileAttack();
		}
	}
}

class Tank30Sub3 extends Tank30 {
	{
		tankTier = "Tier3";
		tankName = "k3";
		cannon = 3;
		missile = true;
		nuclear = true;
	}

	public void infoTank() {
		super.infoTank();
	}

	public void fireMissile() {
		if (missile) {
			printTankName();
			missileAttack();
		}
	}

	public void fireNuclear() {
		if (nuclear) {
			printTankName();
			attackNuclear();
		}
	}
}

public class Main51 {

	public static void main(String[] args) {
		Tank30Sub1 k1 = new Tank30Sub1();
		Tank30Sub2 k2 = new Tank30Sub2();
		Tank30Sub3 k3 = new Tank30Sub3();
		k1.infoTank();
		k2.infoTank();
		k3.infoTank();

		k1.fireCannon();
		k2.fireCannon();
		k3.fireCannon();

		k2.fireMissile();
		k3.fireMissile();

		k3.fireNuclear();
	}

}
