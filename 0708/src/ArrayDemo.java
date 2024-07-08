
public class ArrayDemo {
	public static void main(String[] args) {
//		int [] array;  //declaration
//		array = new int[4];  //creation
//		array[0] = 5;  array[1] = 6;  array[2] = 7;   array[3] = 8;  //assignment
//		for(int i = 0 ; i < 4 ; i++) {
//			System.out.print("array[" + i + "] = " + array[i] + "\t");
//		}
//		System.out.println();
		String [] array = {"Hello", "World", "Good", "Java", "A"};  //initialization
		array[3] = "Python";
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
}
