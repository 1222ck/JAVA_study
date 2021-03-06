package chapter5;

public class Student {
	// 멤버 변수-------------
	int studentID;
	private String studentName;
	int grade;
	String address;
	// -------------------
	
	// 메서드-----------------------
	public String getStudentName() { // private 변수인 studentName에 접근해 값을 가져오는 public get() 메서드
		return studentName;
	}
	
	public static void main(String[ ] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	public void setStudentName(String name) { // private 변수인 studentName에 접근해 값을 지정하는 public set() 메서드
		studentName = name;
	}
	// ---------------------------
// 학번, 이름, 학년, 주소 등 클래스 내부에 선언하여 객체 속성을 나타내는 변수를 멤버 변수라고 한다
}
