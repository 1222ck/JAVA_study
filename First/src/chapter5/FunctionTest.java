package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);  // add() 함수 호출 -> 반환 값이 int이기 때문에 결과 값이 저장되는 sum 변수 앞에 int라고 써 줌
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
		
		int sum1 = substract(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum1 + "입니다");
		
		int sum2 = multiply(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + sum2 + "입니다");
		
		int sum3 = division(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + sum3 + "입니다");
		// TODO Auto-generated method stub

	}
	 // add() 함수
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
