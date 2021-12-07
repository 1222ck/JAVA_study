package chapter2;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore; // gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1); // 151
		
		int lastScore2 = --gameScore; // gameScore에서 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2); // 150 -> gameScore가 앞에서 1만큼 증가하여 151이 되었으니 1을 빼면 150
		
		int gameScore2 = 150;
		
		int lastScore3 = gameScore2++; // gameScore2를 lastScore3에 대입 하고 1을 더한다. -> gameScore2의 값은 151 
		System.out.println(lastScore3); // 150
		
		int lastScore4 = gameScore2--; // gameScore2를 lastScore4에 대입 하고 1을 뺀다. -> gameScore2의 값은 150
		System.out.println(lastScore4); // 151 -> 151에서 1을 빼기 전에 lastScore4로 대입했다.
		// TODO Auto-generated method stub

	}

}
