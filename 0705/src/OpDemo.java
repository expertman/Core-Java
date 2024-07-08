
public class OpDemo {

	public static void main(String[] args) {
		//short su = 5;
		//short result = ~su;
//		short result = true ? 1970 : 3.14;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("값 입력(초단위) : ");
		int time = sc.nextInt();
		int hours = time / 3600;
		int minutes = time % 3600 / 60;
		int seconds = time % 3600 % 60;
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.\n", time, hours, minutes, seconds);
	}

}
