// 학생이 교통수단을 이용한 후 각자가 가진 돈의 변화와 버스, 지하철 수입의 합
package cooperration;

public class TakeTrans {
	public static void main(String[ ] args) { 
		Student studentJames = new Student("James", 5000); // 학생 생성
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 10000);
		
		Bus bus100 = new Bus(100); // 버스 번호가 100인 버스 생성
		studentJames.takeBus(bus100); // James가 100번 버스를 탐
		studentJames.showInfo(); // James 정보 출력
		bus100.showInfo(); // 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선"); // 노선 번호가 2호선인 지하철 생성
		studentTomas.takeSubway(subwayGreen); // Tomas가 2호선을 탐
		studentTomas.showInfo(); // Tomas 정보 출력
		subwayGreen.showInfo(); // 지하철 정보 출력 
		
		Taxi kakaoTaxi = new Taxi("카카오 택시");
		studentEdward.takeTaxi(kakaoTaxi);
		studentEdward.showInfo();
		kakaoTaxi.showInfo();
	}
}
