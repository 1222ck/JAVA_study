package chapter4;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 10) { // num���� 10���� �۰ų� ���� ����
			sum += num; // �հ踦 ���ϴ� sum�� num�� ���ϰ� -> ���ǽ��� ���� ���� ��� ����
			num++; // num�� 1�� ���� ���� -> ���ǽ��� ���� ���� ��� ����
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�");
		// TODO Auto-generated method stub

	}

}