package hiding;

public class Ex2 {

	public static void main(String[] args) {

		MyDate2 date = new MyDate2();
		
		date.setMonth(2);
		date.setDay(30);

		System.out.println("현재 날짜 : " + date.getMonth() + " 월 " + date.getDay() + " 일 ");

		date.setDay(10);
		System.out.println("현재 날짜 : " + date.getMonth() + " 월 " + date.getDay() + " 일 ");
		
	}

}

class MyDate2 {
		private int month;
		private int day;
		
		// 월을 가져오는 메소드
		public int getMonth() {
			return month;
		}
		
		// 월을 변경하는 메소드
		public void setMonth(int month) {
			this.month = month;
		}
		
		// 일을 가져오는 메소드
		public int getDay() {
			return day;
		}
		
		// 일을 변경하는 메소드
		public void setDay(int day) {

			// 2월인 경우, 1~28까지만 입력받게 하기
			
			if (month == 2) {
				if (day < 1 || day >28) {
					System.out.println("2월에는 " + day + " 일이 없습니다." );
					
					return;
				}
			}
			this.day = day;
		}
		
	
	
}