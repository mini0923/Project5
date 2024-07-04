package instance.Quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNum = 1111;
		order.orderDate = "2018년 3월 12일";
		order.name="둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		order.showOrderInfo();
					
	}

}
