
public class VariableDemo {
	int eng = 100;    //instance variable
	static int math = 80;  //class variable
	
	public static void main(String[] args) {
		int kor = 100;  //local variable
		System.out.printf("수학 점수 = %d\n", Demo.math);
		System.out.printf("국어 점수 = %d\n", kor);
		VariableDemo vd = new VariableDemo();
		System.out.printf("영어 점수 = %d\n", vd.eng);
		Demo d = new Demo();
		System.out.printf("영어 점수 = %d\n", d.eng);
	}

}
class Demo{
	static int math = 70;  //class variable
	int eng = 50;
}