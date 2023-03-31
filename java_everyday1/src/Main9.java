class Main9 {
	
	static void gridLine(String str, char line) {	// 길이구하기 위해 str, 어떤 문자를 출력할건지 line 
		for(int i = 0; i < str.length();i++) {	// 자바에서는 length()라는 메서드호출하여 쓴다. 
			System.out.print(line);	// ----- 쪽 출력.
		}
		System.out.println();
	}
	
	// 클래스에 데이터를 저장하는 기능 - 필드, 기능을 사용하는 메서드.(?) , 나중에 자세히 배움.
	// 필드 - 객체의 정보(상태), 메서드 - 객체의 동작(기능)
	// 필드 , 메서드 구분하기. 
	// 필드는 데이터라고 생각(객체내에서 데이터 저장하는 역할)
	// 메서드는 함수처럼 기능 하는것.
	
	
	static void messageBox(String str, char line) {
		gridLine(str,line);	// 위에 줄 긋기
		System.out.println(str);
		gridLine(str,line);	// 아래 줄 긋기 
	}

	public static void main(String[] args) {
		String str1 = "| Hello |";
		String str2 = "| Congratulation |";
		
		messageBox(str1,'-');
		messageBox(str2,'=');
	}

}
