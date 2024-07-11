import java.io.FileNotFoundException;

public class Input {
	private java.util.Scanner sc;   //member
	private Student [] array;       //field
	
	public Input(Student[] array) throws FileNotFoundException {
		this.sc = new java.util.Scanner(new java.io.File("sungjuk_utf8.txt"));
		this.array = array;
	}
	void input() {
		for(int i = 0; i < this.array.length ; i++) {
			String line = this.sc.nextLine();  //1101     한송이     78     87     83    78
			//문자열 파싱 ==> String [] = String 클래스의 split(정규식)
			java.util.Scanner s = new java.util.Scanner(line).useDelimiter("\\s+");
			String hakbun = s.next();  //1101
			String name = s.next();  //한송이
			int kor = s.nextInt();  //78
			int eng = s.nextInt();  //87
			int mat = s.nextInt();  //83
			int edp = s.nextInt();  //78
			this.array[i] = new Student(hakbun, name, kor, eng, mat, edp);
		}
	}
}
