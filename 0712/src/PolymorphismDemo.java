/*
 * 다형성
 * 1. 객체 형변환
 * 1)자동 형변환,  implicit conversion, promotion
 * -자식 객체가 부모 객체로 형변환할 때
 * 2)강제 형변환, explicit conversion, demotion
 * -부모 객체가 자식 객체로 형변화하고자 할 때, 단. instanceof 연산자가 true를 리턴할 때에만 
 * 2. Override method
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
//		int su = 5;
//		long lo = su;   //자동 형변환,  implicit conversion, promotion
//		double avg = su;  //자동 형변환
//		short sh = (short)avg;   //강제 형변환, explicit conversion, demotion
		Test t = new Test();
		Demo d = new Demo();
		//t = (Test)d;
		if(t instanceof Demo) {
			d = (Demo)t;
		}else {
			System.out.println("안돼");
		}
	}
}
class Test{}
class Demo extends Test{}




