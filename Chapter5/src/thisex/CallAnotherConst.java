// Ŭ������ �����ڰ� ���� �� ���� �� � �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ��찡 �ִ�.
// this�� ����� Ŭ������ �����ڿ��� �ٸ� �����ڸ� ȣ���� �� �ִ�. 
package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("�̸� ����", 1); // this�� ����� Person(String, int) ������ ȣ��
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() { // ��ȯ���� Ŭ������
		return this; // this ��ȯ
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf(); // this ���� Ŭ���� ������ ����
		System.out.println(p); // noName.returnSelf()�� ��ȯ �� ���
		System.out.println(noName); // ���� ���� ���
	}
}

// this�� �ٸ� �����ڸ� ȣ���� �� ������ ���� �ִ�. this�� ����Ͽ� �����ڸ� ȣ���ϴ� �ڵ� ������ �ٸ� �ڵ带 ���� �� ����. ���� �ٸ� �ڵ带 ������ Constructor call must be the first statement in a constructor �̶�� ���� �޽����� ��Ÿ����.