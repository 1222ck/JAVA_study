package chapter5;

public class Student {
	// ��� ����-------------
	int studentID;
	private String studentName;
	int grade;
	String address;
	// -------------------
	
	// �޼���-----------------------
	public String getStudentName() { // private ������ studentName�� ������ ���� �������� public get() �޼���
		return studentName;
	}
	
	public static void main(String[ ] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	public void setStudentName(String name) { // private ������ studentName�� ������ ���� �����ϴ� public set() �޼���
		studentName = name;
	}
	// ---------------------------
// �й�, �̸�, �г�, �ּ� �� Ŭ���� ���ο� �����Ͽ� ��ü �Ӽ��� ��Ÿ���� ������ ��� ������� �Ѵ�
}