package chapter4;

public class BreakExample {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 1; ; num++) { // ���ǽ��� �����ϴ� ��� break���� ����Ѵ�. 
			sum += num;
			if(sum >= 500) // sum�� 100���� ũ�ų� ���� ��(���� ����)
				break; // �ݺ��� �ߴ�
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		// TODO Auto-generated method stub

	}

}