//3. static 변수와 static 메소드는 상속되지 않는다.
public interface InheritanceDemo2 {
	public static void main(String[] args) {
		//Student jimin = new Student();
		//jimin.
		System.out.println(Student.age);
	}
}
class Person{
	String name = "한지민";
	static int age = 28;
}
class Student extends Person{
	//String name = "한지민";
	//static int age = 28;
}