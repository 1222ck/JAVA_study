package thisex;

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) { // �¾ ������ �����ϴ� �޼���
		this.year = year; // bDay.year = year; �� ����
	}
	
	public void printThis() { // this ��� �޼���
		System.out.println(this); // System.out.println(bDay); �� ����
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); // �¾ ������ 2000���� ����
		System.out.println(bDay); // ���� ���� ���
		bDay.printThis(); // this ��� �޼��� ȣ��

	}

}