package cooperration;

public class Taxi {
	String taxi;
	int passengerCount;
	int money;
	
	public Taxi(String taxi) {
		this.taxi = taxi;
	}
	
	public void takeTaxi(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxi + "����� " + money + " �� �Դϴ�.");
	}
}
