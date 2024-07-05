package reference.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee("둘리", 26, 3000, 1);
		Employee employee2 = new Employee("또치", 32, 5000, 5);
		Employee employee3 = new Employee("도우너", 36, 8000, 9);
		
		Department department = new Department("도우너", "또치", "둘리");
		
	}
}


class Employee {
		String name;
		int age;
		int salary;
		int year;
		
		public Employee(String name, int age, int salary, int year) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.year = year;
		}
}

class Department {
		String departmentHead;
		String chiefResearcher;	
		String SeniorResearcher;
		
		public Department(String departmentHead, String chiefResearcher, String seniorResearcher) {
			super();
			this.departmentHead = departmentHead;
			this.chiefResearcher = chiefResearcher;
			SeniorResearcher = seniorResearcher;
		}
}
