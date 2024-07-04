package method.quiz;

public class Quiz7 {

	public static void sum (int n1) {
		int result = 0;
		System.out.print(n1);
		
		result += (n1  / 100) ;			// 100 자리
				
		result += ( n1 % 100 / 10); // 10자리
		
		result += (n1 % 10); 			// 1자리
		  
		System.out.println(":" + result);
		
		
		
	}
	
	
	public static void main(String[] args) {
		sum(300);

	}

}
