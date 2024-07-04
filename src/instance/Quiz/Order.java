package instance.Quiz;


public class Order {

	int orderNum;
	String orderDate;
	String name;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문번호 : " + orderNum);
		System.out.println("주문날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + name);
		System.out.println("배송지 : " + address);
	}
	
}
