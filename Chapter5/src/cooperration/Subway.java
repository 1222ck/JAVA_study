package cooperration;

public class Subway {
	String lineNumber; // ���� ��ȣ
	int passengerCount; // �°� ��
	int money; // ���� ����
	
	public Subway(String lineNumber) { // ����ö �뼱 ��ȣ�� �Ű������� �޴� ������ -> �뼱 ��ȣ�� �Ű������� �޾� ����ö�� ������ �� ����ö �뼱 ��ȣ�� �ʱ�ȭ�Ѵ�.
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { // �°��� ����ö�� ź ��츦 ������ �޼���
		this.money += money; // ����ö ���� ����
		passengerCount++; // �°� �� ����
	}
	
	public void showInfo() { // ����ö ������ ����ϴ� �޼���
		System.out.println(lineNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
}