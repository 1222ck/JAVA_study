package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; // byte�� ���� int�� ������ ���Ե�
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // int�� ���� float�� ������ ���Ե�
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		int iNum3 = 1000;
		byte bNum3 = (byte)iNum3;
		
		System.out.println(iNum3);
		System.out.println(bNum3);
		// TODO Auto-generated method stub

	}

}
