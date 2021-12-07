package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
		// TODO Auto-generated method stub

	}

}

// 자료형이 다른 정수끼리 더했을 경우 
// 프로그램이 실행되어 정수 값을 연산할 때 4바이트를 기본 단위로 사용하기 때문에, 두 정수를 더하기 전에 두 정수는 모두 int형으로 변환된다. 또한 더한 결과값도 int형으로 저장된다.
// 정수의 기본형은 int형이고 byte형이나 short형은 컴퓨터가 연산을 편리하게 하려고 내부적으로 int형으로 변환한다. 