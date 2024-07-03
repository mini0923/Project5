package method.quiz;

public class Quiz7 {

	public static void sum (int n1) {
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 =0;
		System.out.print(n1);
		
		result1 = n1  / 100 ;			// 100 자리
		result2 = n1 % 100 / 10; // 10자리
		result3 = n1 % 10; 			// 1자리
		
		result4 = (result1+ result2 + result3);  
		System.out.println(":" + result4);
		
		
		
	}
	
	
	public static void main(String[] args) {
		sum(123);

	}

}
