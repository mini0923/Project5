package constructor.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		Car car1 = new Car ();
		car1.company="현대";
		car1.model="소나타";
		car1.color="흰색";
		car1.maxSpeed=200;
		
		Car car2 = new Car("기아", "레이", "검정색", 150);
		
		
	}

}


class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
		
	public Car() {
		super();
	}

	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
