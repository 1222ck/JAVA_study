package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);  // add() �Լ� ȣ�� -> ��ȯ ���� int�̱� ������ ��� ���� ����Ǵ� sum ���� �տ� int��� �� ��
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�");
		
		int sum1 = substract(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum1 + "�Դϴ�");
		
		int sum2 = multiply(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + sum2 + "�Դϴ�");
		
		int sum3 = division(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + sum3 + "�Դϴ�");
		// TODO Auto-generated method stub

	}
	 // add() �Լ�
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}	
	public static int substract(int n3, int n4) {
		int result1 = n3 - n4;
		return result1;
	}
	public static int multiply(int n5, int n6) {
		int result2 = n5 * n6;
		return result2;
	}
	public static int division(int n7, int n8) {
		int result3 = n7 / n8;
		return result3;
	}

}