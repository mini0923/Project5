package instance.Quiz;

public class Person {

	String name;
	int age;
	boolean  isMarried;
	int child;
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("결혼여부 : " + isMarried);
		System.out.println("자식 : " + child);
	}
}
