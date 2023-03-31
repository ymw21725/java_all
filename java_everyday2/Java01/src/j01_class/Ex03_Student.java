package j01_class;

public class Ex03_Student extends Ex02_Person {
	private String info;
	private int java, html, sum;
	
	public Ex03_Student(String name, String phone, int age, String info, int java, int html) {
		super(name,phone,age);
		this.info = info;
		this.java = java;
		this.html = html;
		this.sum = this.java + this.html;
	}
	
	public String getInfo() {
		return info;
	}
	public int getJava() {
		return java;
	}
	public int getHtml() {
		return html;
	}
	public int getSum() {
		return sum;
	}


	@Override
	public String toString() {	// return super.tostring()방식으로. 
		return  super.toString() + "\nStudent [info="+ info + ", java=" + java + ", html=" + html + ", sum=" + sum + "]";
	}
	
	
	
	
}
