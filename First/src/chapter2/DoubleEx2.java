package chapter2;

public class DoubleEx2 {

	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
		// TODO Auto-generated method stub

	}

}
 // 1에 0.1을 10000번 더하는 반복문인데 결과 값이 1001이 아니라 1001.000000000159이 출력된다.  