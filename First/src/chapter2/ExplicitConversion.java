package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2); // 두 실수의 합이 먼저 계산되고 형 변환됨
		System.out.println(iNum3); // 1 + 0 = 1
		System.out.println(iNum4); // 2.1 -> 2
		
		int iNum5 = 10;
		double dNum6 = 2.0;
		
		int iNum6 = (int)(iNum5 + dNum6);
		System.out.println(iNum6);
		int iNum7 = (int)(iNum5 - dNum6);
		System.out.println(iNum7);
		
		char text1 = '글';
		System.out.println((int)text1);

		// TODO Auto-generated method stub

	}

}
