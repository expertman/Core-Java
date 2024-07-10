
public class Input {
	void input(Student std) {  //std = younghee, Call by ref
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("학번 : ");  
		String hakbun = sc.next();
		std.setHakbun(hakbun);
		System.out.print("국어 : ");  std.setKor(sc.nextInt());
		System.out.print("영어 : ");  std.setEng(sc.nextInt());
		System.out.print("수학 : ");  std.setMath(sc.nextInt());
	}
}
