class Tank {	// 탱크 프로젝트 실습. 예제
	String name;
	int dp;	// 대포
	boolean missile;
	boolean defense;
	
	void initTank(String name, int dp, boolean missile) {
		this.name = name;
		this.dp = dp;
		this.missile = missile;
		defense = true;
	}
	
	void infoTank() {
		if(defense) {	
			System.out.printf("탱크명 : %s, 포종류 : %d단계, 미사일 %s\n",name,dp,missile?"장착":"미장착" );
		} else {
			System.out.println("방어코드");
		}
	}
	
	void run() {
		if(defense) {	
			String tmp;
			System.out.printf("\n< K%d 공격 >\n", dp);
			
			switch(dp) {
				case 1 : tmp = "펑";
						break;
				case 2 : tmp = "펑펑";
						break;
				case 3 : tmp = "콰쾅";
						break;
				default : tmp = "다시입력.";
				}
			
			System.out.printf("대포 발사 : %s\n",tmp);
			
			if(missile) {
				System.out.println("미사일 발사 : 초전박살");
			}
			
		} else {
			System.out.println("초기화");
		}
	}
}

public class Main23 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		Tank t3 = new Tank();
		
		t1.initTank("K1", 1, false);
		t2.initTank("K2", 2, false);
		t3.initTank("K3", 3, true);
		
		t1.infoTank();
		t2.infoTank();
		t3.infoTank();
		
		t1.run();
		t2.run();
		t3.run();

		
	}

}
