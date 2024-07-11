
public class ConstructorDemo {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner();
//		Car sonata = new Car();
//		System.out.println(sonata.name);
//		System.out.println(sonata.price);
		Product p = new Product();
		Product pencil = 	new Product("모나미연필", 1000, "모나미社");
		Product computer = new Product("노트북", 25_000_000, "LG Gram");
		Product tv = new Product("텔레비전", 30_000_000, "삼성전자");
	}
}
