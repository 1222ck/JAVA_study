package chapter5;

public class PersonTest {
	public static void main(String[ ] args) {
		// ����Ʈ �����ڷ� Ŭ������ ������ �� �ν��Ͻ� ���� ���� ���� �ʱ�ȭ
		Person personKim = new Person(); // Person() ������
		personKim.name = "������";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		// �ν��Ͻ� ���� �ʱ�ȭ�� ���ÿ� Ŭ���� ����
		Person personLee = new Person("�̼���", 175, 75);
	}

}
