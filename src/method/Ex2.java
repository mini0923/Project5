package method;

public class Ex2 {

	public static int add(int n1, int n2) {
		int result = n1 + n2;	
		return result;
	}
	
	public static void main(String[] args) {
		// 3과 5의 합을 구하고, 4와 2의 합을 구한다음에
		// 어느쪽이 더 큰지 비교하기!
		
		int sum1 = add(3, 5);
		int sum2 = add(4, 2);
		
		if(sum1 > sum2) {
			System.out.println("sum1 이 더 큽니다 " );
		}
		else {
			System.out.println("sum2 가 더 큽니다.");
		}
		
	}

}
