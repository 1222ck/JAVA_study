package cooperration;

public class Student { // 학생 클래스는 이름, 학년, 돈을 멤버변수(속성)으로 가진다
	public String studentName; // 학생 이름
	public int grade; // 학년
	public int money; // 학생이 가지고 있는 돈
	
	public Student(String studentName, int money) { // 학생 이름과 가진 돈을 매개 변수로 받는 생성자 -> 클래스를 하나 생성하면 학생 이름과 가진 돈을 초기화 한다.
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // 학생이 버스를 타면 1,000원을 지불하는 기능을 구현한 메서드
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) { // 학생이 지하철을 타면 1,500원을 지불하는 기능을 구현한 메서드
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.takeTaxi(10000);
		this.money -= 10000;
	}
	
	public void showInfo() { // 학생의 현재 정보를 출력하는 메서드
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다");
	}

}
