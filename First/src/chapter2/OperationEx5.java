package chapter2;

public class OperationEx5 {

	public static void main(String[] args) {
		
		int num = 0B00000101; // 5�� 8��Ʈ 2������ ��Ÿ��
		
		System.out.println(num << 2); // �������� 2��Ʈ �̵� 00010100 
		System.out.println(num >> 2); // ���������� 2��Ʈ �̵� 00000001
		System.out.println(num >>> 2); // ���������� 2��� �̵� 00000001
		
		System.out.println(num); // num�� ���� �������� �ʾ����Ƿ� ��Ʈ �̵��� ������� ���� �� �״�� ���
		
		num = num << 2;
		System.out.println(num); // �������� 2��Ʈ �̵��� ���� �ٽ� num�� ����
		// TODO Auto-generated method stub
		


	}

}