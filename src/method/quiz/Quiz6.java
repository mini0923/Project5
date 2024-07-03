package method.quiz;

public class Quiz6 {

	public static void cal(int n1, int n2, char c) {
		
		int result = 0;
		
		if(c == '+') {
			result = n1 + n2;
			System.out.println(result);
		}
		else if (c == '-'){
			result = n1 - n2;
			System.out.println(result);
		}
		else if(c == '*') {
			result = n1 * n2;
			System.out.println(result);
		}
		else if(c == '/') {
			result = n1 / n2;
			System.out.println(result);
		}
		else
			System.out.println("사칙연산 제대로 입력하세요.");
			
		
//		
//		switch (c) {
//			case '+' :
//				System.out.print(n1  + " + " + n2  + " : ");
//				System.out.println(n1 + n2 + "입니다.");
//				break;
//				
//			case '-':
//				System.out.print(n1  + " - " + n2  + " : ");
//				System.out.println(n1 - n2  + "입니다.");
//				break;
//				
//			case '*' :
//				System.out.print(n1  + " * " + n2  + " : ");
//				System.out.println(n1 * n2  + "입니다.");
//				break;
//				
//			case '/' :
//				System.out.print(n1  + " / " + n2  + " : ");
//				System.out.println(n1 / n2 + "입니다." );
//				break;
//				
//			default : 
//					System.out.println("사칙연산을 입력하세요.");
//		}
				
	
			
		
		
		
	}
	
	public static void main(String[] args) {
		cal(1, 5, '+');
		cal(6, 2, '-');
		cal(2, 5, '*');
		cal(10, 2, '/');
		cal(10, 10, 'c');
		
		
	}

}
