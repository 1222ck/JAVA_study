package cooperration;

public class Subway {
	String lineNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 버스 수입
	
	public Subway(String lineNumber) { // 지하철 노선 번호를 매개변수로 받는 생성자 -> 노선 번호를 매개변수로 받아 지하철이 생성될 때 지하철 노선 번호를 초기화한다.
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { // 승객이 지하철에 탄 경우를 구현한 메서드
		this.money += money; // 지하철 수입 증가
		passengerCount++; // 승객 수 증가
	}
	
	public void showInfo() { // 지하철 정보를 출력하는 메서드
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}