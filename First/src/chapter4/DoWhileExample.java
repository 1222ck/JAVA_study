package chapter4;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do { // ���ǽ��� ���� �ƴϴ��� ������ �ѹ��� ������.
			sum += num;
			num++;
		} while(num <= 10); // ���ǽ�
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		// TODO Auto-generated method stub

	}

}
