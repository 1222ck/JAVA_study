package chapter4;

public class ifPractice {

	public static void main(String[] args) {
		int score = 99;
		char grade;
		
		if (90 <= score & score <= 100) {
			grade = 'A';
		}
		else if (90 > score & score >= 80) {
			grade = 'B';
		}
		else if (80 > score & score >= 70) {
			grade = 'C';
		}
		else if (70 > score & score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다");
		// TODO Auto-generated method stub

	}

}
