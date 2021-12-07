package chapter4;

public class ForExample {

	public static void main(String[] args) {
		int i; // for문에서 가장 자주 사용하는 변수 이름은  i이다. 주로 획수를 표현한다.
		int sum;
		for ( i = 1, sum = 0; i <= 10; i++ ) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다");
		// TODO Auto-generated method stub

	}

}
