package chapter2;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10); // �� ������ �� ���� ��� ���� �����̹Ƿ� ((i = i + 2) < 10)�� ������� ����
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // �� ������ �� ���� �����̸� �� ���� ������� �ʾ� i ���� �״��
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // �� �տ��� �� ���� ��� ���� ���̹Ƿ� ((i = i + 2) < 10)�� ������� ����
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // �� �տ��� �� ���� ���̸� �� ���� ������� �ʾ� i ���� �״��
		// TODO Auto-generated method stub

	}

}
