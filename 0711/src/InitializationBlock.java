
public class InitializationBlock {
	private double weight;   //member variable
	private char grade;
	{
		this.weight = 100.0;   this.grade = 'F';
		System.out.println("나는 초기화 블록");
	}
	public InitializationBlock() {  //default constructor's overriding
		System.out.println("나는 생성자");
		//this.weight = 62.4;
		//this.grade = 'C';
	}
	public static void main(String[] args) {
		InitializationBlock jimin = new InitializationBlock();
		System.out.println(jimin.weight + "kg");
		System.out.println(jimin.grade);
	}
}
