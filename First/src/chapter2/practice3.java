package chapter2;

public class practice3 {

	public static void main(String[] args) {
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		System.out.println("-------------");
		
		int num1 = 10;
		System.out.println(num1);
		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(--num1);
		
		System.out.println("-------------");
		
		int num2 = 10;
		int num3 = 20;
		boolean result;
		
		result = ((num2 > 10) && (num3 > 10));
		System.out.println(result);
		result = ((num2 > 10) || (num3 > 10));
		System.out.println(result);
		System.out.println(!result);
		
		System.out.println("-------------");
		
		int num4 = 2;
		int num5 = 10;
		
		System.out.println(num4 & num5);
		System.out.println(num4 | num5);
		System.out.println(num4 ^ num5);
		System.out.println(~num4);
		
		System.out.println("-------------");
		
		int num6 = 8;
		
		System.out.println(num6 += 10);
		System.out.println(num6 -= 10);
		System.out.println(num6 >>= 2);
		
		System.out.println("-------------");
		
		int num7 = 10;
		int num8 = 20;
		
		int result1 = (num7 >= 10) ? num8 + 10 : num8 -10;
		System.out.println(result1);
		
		// TODO Auto-generated method stub

	}

}
