package chapter4;

public class BreakExample {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 1; ; num++) { // 조건식을 생략하는 대신 break문을 사용한다. 
			sum += num;
			if(sum >= 500) // sum이 100보다 크거나 같을 때(종료 조건)
				break; // 반복문 중단
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		// TODO Auto-generated method stub

	}

}
