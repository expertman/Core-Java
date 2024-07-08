
public class SungjukMgmt {
	public static void main(String[] args) {
		Student chulsu = new Student();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n = null; 
		do {
			System.out.print("학번 : ");   chulsu.hakbun = sc.next();
			System.out.print("국어 : ");   chulsu.kor = sc.nextInt();
			System.out.print("영어 : ");   chulsu.eng = sc.nextInt();
			System.out.print("수학 : ");   chulsu.math = sc.nextInt();
			chulsu.tot = chulsu.kor + chulsu.eng + chulsu.math;
			chulsu.avg = chulsu.tot / 3.;  //89.5
			chulsu.grade = '\0';  //널값
			switch((int)(chulsu.avg / 10)) {
				case 10:  case 9: chulsu.grade = 'A';  break;
				case 8:  chulsu.grade = 'B';  break;
				case 7:  chulsu.grade = 'C';  break;
				case 6:  chulsu.grade = 'D';  break;
				default:  chulsu.grade = 'F';
			}
			System.out.print(chulsu.hakbun + "\t" + chulsu.kor + "\t");
			System.out.print(chulsu.eng + "\t" + chulsu.math + "\t");
			System.out.print(chulsu.tot + "\t" + chulsu.avg + "\t");
			System.out.println(chulsu.grade);
			System.out.print("Again(y/n) : ");
			y_n = sc.next();
		}while(y_n.equals("Y") || y_n.equals("y"));
		System.out.println("Program is over...");
	}
}
