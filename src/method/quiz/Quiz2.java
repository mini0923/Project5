package method.quiz;

public class Quiz2 {


	public static int hap(int n1, int n2) {
		int result = 0;
		
		for (int i = n1; i <=  n2; i++ ) {
			result += i;			
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {

		int sum = hap(3, 7);
		System.out.println(sum);
		int sum2 = hap(5, 10);
		System.out.println(sum2);
		
		
	}

}
