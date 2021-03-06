// 클래스에 생성자가 여러 개 있을 때 어떤 생성자에서 다른 생성자를 호출하는 경우가 있다.
// this를 사용해 클래스의 생성자에서 다른 생성자를 호출할 수 있다. 
package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1); // this를 사용해 Person(String, int) 생성자 호출
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() { // 반환형은 클래스형
		return this; // this 반환
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf(); // this 값을 클래스 변수에 대입
		System.out.println(p); // noName.returnSelf()의 반환 값 출력
		System.out.println(noName); // 참조 변수 출력
	}
}

// this로 다른 생성자를 호출할 때 주의할 점이 있다. this를 사용하여 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없다. 만약 다른 코드를 넣으면 Constructor call must be the first statement in a constructor 이라는 오류 메시지가 나타난다.