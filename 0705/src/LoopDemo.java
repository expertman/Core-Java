public class LoopDemo {
	public static void main(String[] args) {
		//A ~ Z까지 출력하기
//		int i = 65;  //initialization  //1
//		int count = 0;
//		for(    ; i <= 90;    ) {
//			System.out.printf("%c\t", (char)i);  //한 개의 글자 출력
//			count++;
//			if(count % 5 == 0 ) {  //5의 배수라면, 5개마다
//				System.out.println();
//			}
//			i++;  
//		}
//		System.out.println();
//		int count = 0;
//		for(int i = 1 ; i <= 100 ; i++) {
//			if(i % 4 == 0) {
//				count++;
//			}
//		}
//		System.out.printf("갯수는 %d\n", count);
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Year : ");
		int year = sc.nextInt();
		if(year % 400 == 0 | (year % 4 == 0 & year % 100 != 0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
	}
}
