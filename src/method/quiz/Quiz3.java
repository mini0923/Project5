package method.quiz;

public class Quiz3 {
	
	public static int num (int n1, int n2) {
		
		if (n1> n2) {
			return n1;
		}
		else 
			return n2;
	}
	
	
	

	public static void main(String[] args) {

		int result = num(4, 25);
		System.out.println(result);
		
		
	}

}
