package cooperration;

public class Bus {
	int busNumber; // ���� ��ȣ
	int passengerCount; // �°� ��
	int money; // ���� ����
	
	public Bus(int busNumber) { // ���� ��ȣ�� �Ű������� �޴� ������ -> ������ȣ�� �Ű������� �޾� ������ ������ �� ���� ��ȣ�� �ʱ�ȭ�Ѵ�.
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // �°��� ������ ź ��츦 ������ �޼���
		this.money += money; // ���� ���� ����
		passengerCount++; // �°� �� ����
	}
	
	public void showInfo() { // ���� ������ ����ϴ� �޼���
		System.out.println("����" + busNumber + "���� �°���" + passengerCount + "���̰�, ������" + money + "�Դϴ�");
	}
}
