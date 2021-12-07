package chapter2;

public class integerLong {

	public static void main(String[] args) {
		int num1 = 123456789;
		long num2 = 12345678900L;
		// TODO Auto-generated method stub

	}

}

// int형으로 표현할 수 있는 수의 범위를 넘어 섰기 때문에 num1은 오류
// 자바는 모든 정수 값을 기본으로 int형으로 처리하기 때문에 num2도 오류
// 이런 경우는 숫자를 Long형으로 처리하라고 컴파일러에게 알려줘야 한다. 
// -> long num2 = 12345678900L (뒤에 L을 붙인다)