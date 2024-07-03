package method.quiz;

public class Quiz4 {

	public static int minus(int n1, int n2) {
		
		int result = 0;
		
		if(n1 < n2) {
		  return -999;
		} 
		
		result = n1 - n2;
		
		return result;
		
		
	}
	
	
	public static void main(String[] args) {

		int result = minus(20, 10);
		System.out.println(result);
		int result2 = minus(5, 1);
		System.out.println(result2);
		int result3 = minus(10, 20);
		System.out.println(result3);

		
	}

}
