package chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for (dan = 3; dan <= 7; dan++) { // 2�ܿ��� 9�ܱ��� �ݺ��ϴ� �ܺ� �ݺ���
			for (times=1; times <= 9; times++) { // �� �ܿ��� 1~9�� ���ϴ� ���� �ݺ���
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println(); // �� �� �� ���
		}
		// TODO Auto-generated method stub

	}

}