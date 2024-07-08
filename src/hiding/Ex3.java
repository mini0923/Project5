package hiding;

public class Ex3 {

	public static void main(String[] args) {

		Person person = new Person();

		person.setName("둘리");
		person.setHeight(170);
		person.setWeight(70.2);
		
		System.out.println("이름은 : " + person.getName() ); 
		System.out.println( "키는 : " + person.getHeight() );
		System.out.println( "몸무게는 : " + person.getWeight());
	}

}

class Person {
	private String name;
	private int height;
	private double weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
		
}