package chapter4;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do { // 조건식이 참이 아니더라도 무조건 한번은 실행함.
			sum += num;
			num++;
		} while(num <= 10); // 조건식
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		// TODO Auto-generated method stub

	}

}
