package cooperration;

public class Student { // �л� Ŭ������ �̸�, �г�, ���� �������(�Ӽ�)���� ������
	public String studentName; // �л� �̸�
	public int grade; // �г�
	public int money; // �л��� ������ �ִ� ��
	
	public Student(String studentName, int money) { // �л� �̸��� ���� ���� �Ű� ������ �޴� ������ -> Ŭ������ �ϳ� �����ϸ� �л� �̸��� ���� ���� �ʱ�ȭ �Ѵ�.
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // �л��� ������ Ÿ�� 1,000���� �����ϴ� ����� ������ �޼���
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) { // �л��� ����ö�� Ÿ�� 1,500���� �����ϴ� ����� ������ �޼���
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.takeTaxi(10000);
		this.money -= 10000;
	}
	
	public void showInfo() { // �л��� ���� ������ ����ϴ� �޼���
		System.out.println(studentName + "���� ���� ����" + money + "�Դϴ�");
	}

}