package method.quiz;

public class Quiz5 {

	
	
	// return 없이 
	
	public static void divide(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}
		int result = n1 / n2;
		System.out.println(n1 + " /  " + n2  +" : " + result +"입니다.");
	}
	
	
	// return 으로 반환값 받기 
//	public static int divide(int n1, int n2) {
//		int result = 0;
//		
//		if(n2 == 0) {
//			System.out.println("나누는 수는 0이 될 수 없습니다.");
//		}
//			result = n1 / n2;		
//		  	return result;
//	}
	
	
	public static void main(String[] args) {

		divide(10, 5);
		divide(20, 0);
		
		
		
//		int result = divide(10, 2);
//		System.out.println(result);
//		int result2 = divide(15, 3);
//		System.out.println(result2);
//		int result3 = divide(10, 0);
//		System.out.println(result3);

	}

}
