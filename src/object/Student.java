package object;

// 학생을 정의하는 클래스
public class Student {
	
		int studentID;					// 학번(18)
		String studentName;	// 이름(성민)
		int grade;							// 학년 (3)
		String address;				// 주소 (인천 연수구~)
		
		// 학생의 기능
		public void goSchool() {
			System.out.println("학교에 간다.");
		}
		
		public void  study(){
			System.out.println("공부를 한다");
		}
		
	
}
