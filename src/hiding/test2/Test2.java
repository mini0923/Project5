package hiding.test2;

public class Test2 {

	public static void main(String[] args) {

		Person person = new Person();
		person.name = "둘리";
		person.height = 170;
//		person.weight= 70;  // 몸무게는 클래스 외부에서 사용 불가
		person.showInfo();

	}

}


class Person {
		public String name;
		int height;
		private double weight;
		
		public void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("키 : " + height);
			System.out.println("몸무게 : " + weight);
		}
}
