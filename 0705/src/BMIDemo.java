
public class BMIDemo {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("이름 : ");     String name = sc.nextLine();
		System.out.print("신장(cm) : ");    double height = sc.nextDouble();
		System.out.print("몸무게(kg) : ");   double weight = sc.nextDouble();
		double bmi = weight / (height * height) * 10000;
		System.out.printf("%s님은 BMI지수 %.1f이고 ", name, bmi);
		if(bmi < 18.5) System.out.println("저체중입니다.");
		else if(bmi >= 18.5 && bmi < 23) System.out.println("정상입니다.");
		else if(bmi >= 23 && bmi < 25) System.out.println("비만전단계입니다."); 
		else if(bmi >= 25 && bmi < 30) System.out.println("1단계비만입니다.");
		else if(bmi >= 30 && bmi < 35) System.out.println("2단계비만입니다.");
		else System.out.println("3단계 비만입니다.");
	}

}
