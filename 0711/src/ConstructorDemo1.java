
public class ConstructorDemo1 {
	public static void main(String[] args) {
		MyDate today = new MyDate();
		System.out.println(today.year);
	}
}
class MyDate{
	int year, month, day;
	public MyDate() {  //default constructor's overriding
		this.year = 2024;   this.month = 7;  this.day = 11;
	}
}