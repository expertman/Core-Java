
public class Japanki {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int [] array = {50000,10000,5000,1000,500,100,50,10,5,1};
		String y_n = null;
		do {
			System.out.print("Money : ");
			int money = sc.nextInt();  //145678
			for(int i = 0 ; i < array.length ; i++) {
				int mok = money / array[i];
				System.out.println(array[i] + "원권 : " + mok);
				money = money % array[i];
			}
			System.out.print("Again(y/n) ? : ");  y_n = sc.next();
			y_n = y_n.toLowerCase();
		}while(y_n.equals("y"));
		System.out.println("Program is over...");
	}
}
