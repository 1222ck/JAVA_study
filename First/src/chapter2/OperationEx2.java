package chapter2;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore; // gameScore�� 1��ŭ ���� ���� lastScore1�� ����
		System.out.println(lastScore1); // 151
		
		int lastScore2 = --gameScore; // gameScore���� 1��ŭ �� ���� lastScore2�� ����
		System.out.println(lastScore2); // 150 -> gameScore�� �տ��� 1��ŭ �����Ͽ� 151�� �Ǿ����� 1�� ���� 150
		
		int gameScore2 = 150;
		
		int lastScore3 = gameScore2++; // gameScore2�� lastScore3�� ���� �ϰ� 1�� ���Ѵ�. -> gameScore2�� ���� 151 
		System.out.println(lastScore3); // 150
		
		int lastScore4 = gameScore2--; // gameScore2�� lastScore4�� ���� �ϰ� 1�� ����. -> gameScore2�� ���� 150
		System.out.println(lastScore4); // 151 -> 151���� 1�� ���� ���� lastScore4�� �����ߴ�.
		// TODO Auto-generated method stub

	}

}