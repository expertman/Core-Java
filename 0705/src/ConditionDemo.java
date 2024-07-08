
public class ConditionDemo {
	public static void main(String[] args) {
		System.out.print("Favorite Season(spring, summer, fall, winter) : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String season = sc.nextLine();
		switch(season) {
			case "spring": System.out.println("봄: 개나리, 진달래");  break;
			case "summer" : System.out.println("여름 : 장미, 아카시아");  break;
			case "fall" : System.out.println("가을 : 백합, 코스모스"); break;
			default : System.out.println("겨울 : 동백, 매화");
		}
		
		
		
		
//		if(season.equals("spring")) { //equals()는 String class의 멤버 메소드이기 때문에, 주소가 필요하다. 
//			System.out.println("봄: 개나리, 진달래");
//		}else if(season.equals("summer")) {
//			System.out.println("여름 : 장미, 아카시아");
//		}else if(season.compareTo("fall") == 0) {
//			System.out.println("가을 : 백합, 코스모스");
//		}else {
//			System.out.println("겨울 : 동백, 매화");
//		}
	}
}
