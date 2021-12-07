package chapter4;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0)
			continue; // 이후 수행을 생략하고 (if문에 맞는 경우 수행하지마라)
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은" + total + "입니다");
		// TODO Auto-generated method stub

	}

}
