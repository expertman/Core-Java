/*
 * Method를 호출하는 방법 3가지 
 * 1)Call(Pass) by Name
 * 2)Call(Pass) by Value
 * 3)Call(Pass) by Reference
 */
public class MethodDemo4 {
	public static void main(String[] args) {
		MethodDemo4 md = new MethodDemo4();  
		int result = md.calcHap(10, 50); 
		System.out.println(result);
		result = md.calcHap(1, 100);
		System.out.println(result);
		result = md.calcHap(50, 70);
		System.out.println(result);
	}
	int calcHap(int start, int end){  //member method
		int hap = 0;
		for(int i = start ; i <= end ; i++) {
			hap += i;
		}
		return hap;
	}
}
//Naming Convention
/*
 * 1. PascalCasing : Class, Interface, Enum
 * 2. camelCasing : variable, method
 * 3. Snake_Casing
 * 4. Kebbab-Casing
 */