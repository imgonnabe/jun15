package jun15;

import zoo.Cat;
import zoo.Dog;

// 프로그램 로직에 필요한 것과 필요없는거 생각하기
public class Human {
	// 필드
	// 필요한 정보만 남기고 필요없는거 빼버림
	int age;
	String name;

	public void myInfo() {
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 나이는 " + age + "살 입니다.");
	}

	public static void main(String[] args) {
		Human human = new Human();
		System.out.println("human: " + human);// jun15.Human@3d012ddd
		Human[] man = new Human[3];
		System.out.println("array: " + man);// [Ljun15.Human;@626b2d4a
		man[0] = human;
		man[1] = new Human();
		man[2] = new Human();
		man[1] = man[0];// 메모리에서 [1]이 소거된다. GC(garbage collector) = 메모리 자동 관리
		System.out.println("array: " + man[0]);// jun15.Human@3d012ddd
		System.out.println("array: " + man[1]);// jun15.Human@3d012ddd
		System.out.println("array: " + man[2]);// jun15.Human@5e91993f

		human.name = "홍길동";

		System.out.println(human.name);// 홍길동
		System.out.println(man[0].name);// 홍길동
		System.out.println(man[1].name);// 홍길동
		System.out.println(man[2].name);// null

		System.out.println(human == man[1]);// true R타입에서는 객체 비교
		System.out.println(human == man[2]);// false

		man[1] = new Human();
		System.out.println("array: " + man[1]);// jun15.Human@1c4af82c
		
		Human h2 = man[0];
		System.out.println("h2: " + h2);// jun15.Human@3d012ddd
		
		Object[] arr01 = new Object[3];
		arr01[0] = human;
		arr01[1] = 1000;
		arr01[2] = "이것도 됩니다.";
		
		int number = (int) arr01[1];
		System.out.println(number);
		
		String str = (String) arr01[2];
		System.out.println(str);
		
		Human h3 = (Human) arr01[0];
		System.out.println(h3);// jun15.Human@3d012ddd
		
		// 다른 패키지에 있는 클래스 호출
		Cat tom = new Cat();
		tom.sleep();
		tom.name = "톰";
		
		Dog dog = new Dog();
		dog.sleep();
		dog.age = 10;
	}

}
