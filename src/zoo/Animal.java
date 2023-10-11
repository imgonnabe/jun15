package zoo;

// 개, 고양이, 쥐, 말 등등
class Ancestor{// 개, 고양이, 쥐, 말의 선조
	public void sleep() {
		System.out.println("Zzz");
	}
}
class Mouse extends Ancestor{
	String name;
	int age;
	
}
class Horse extends Ancestor{
	String name;
	int age;
	
}
public class Animal {
	public static void main(String[] args) {
		Ancestor[] ani = new Ancestor[4];
		ani[0] = new Cat();
		ani[1] = new Dog();
		ani[2] = new Mouse();
		ani[3] = new Horse();
		
		for (int i = 0; i < ani.length; i++) {
			ani[i].sleep();
		}
	}

}
