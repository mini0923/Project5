package method.quiz;

public class Quiz1 {

	
	public static void sum (int n1, int n2) {
		int result1 = n1 + n2;
		int result2 = n1 - n2;
		int result3 = n1 * n2;
		int result4 = n1 / n2;
		int result5 = n1 % n2; 
		
		System.out.println( n1 + " + " +  n2  +" : "+ result1);
		System.out.println( n1 + " - " +  n2  +" : "+ result2);
		System.out.println( n1 + " * " +  n2  +" : "+ result3);
		System.out.println( n1 + " / "  +  n2  +" : "+ result4);
		System.out.println( n1 + " % " +  n2  +" : "+ result5);
	}
	

	
	public static void main(String[] args) {
		System.out.println("10, 5 대입!");
		sum(10, 5);
		
		System.out.println();
		
		System.out.println("20, 3 대입!");
		sum(20, 3);
	}

}
