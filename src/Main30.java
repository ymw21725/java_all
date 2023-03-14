class Time{	// 생성자간 초기화 위임은 넓은 인수범위에서 좁은 인수범위로 해야한다. 
	boolean am;	// 좁은 인수범위에서 넓은 인수범위로 하면 임의의 디폴트 값을 무조건 전달해야하므로.
	int hour;
	int minute;
	int second;
	
	Time(int hour, int minute) {	// 매개변수2개인 항목이 위로 올라와야한다.(논리적으로)
		this.hour = hour;			// 좁은 인수범위에서 넓은 인수범위로 할 시 임의의 값을 넣어야 하므로..!!
		this.minute = minute;
	}
	
	Time(boolean am, int hour, int minute) {
		this(hour,minute);
		this.am = am;
	}
	
	Time(boolean am, int hour, int minute, int second) {	
		this(am,hour,minute);
		this.second = second;
	}
	
	void whatTime() {
		System.out.print(am ? "오전" : "오후");
		System.out.println(hour + "시" + minute + "분" + second + "초");
	}
}
public class Main30 {

	public static void main(String[] args) {
		Time time1 = new Time(true,11,30,15);
		Time time2 = new Time(true,11,30);
		Time time3 = new Time(11,30);
		
		time1.whatTime();
		time2.whatTime();
		time3.whatTime();//am이 값이 존재하지 않으므로 default값인 false이므로 오후, 초 역시 존재하지않으므로 default값 0
	}

}
