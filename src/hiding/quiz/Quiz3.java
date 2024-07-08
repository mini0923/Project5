package hiding.quiz;

public class Quiz3 {

	public static void main(String[] args) {

		MyDate date = new MyDate() ;
		
		date.setMonth(5);
		date.setDay(30);
		
		System.out.println("현재 날짜 : " + date.getMonth() + " 월 " + date.getDay() + " 일 ");
		
		System.out.println();
		
		date.setMonth(15);
		date.setDay(30);
		
		System.out.println("현재 날짜 : " + date.getMonth() + " 월 " + date.getDay() + " 일 ");
		

	}

}

class MyDate{
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month <1 || month >12) {
			System.out.println("해당 값은 " + month + " 잘못된 값입니다." );
			
			return ;
		}
		
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day >28) {
				System.out.println("2월에는 " + day + " 일이 없습니다." );
				
				return;
			}
			
		}	
		this.day = day;
	}
	
}

	