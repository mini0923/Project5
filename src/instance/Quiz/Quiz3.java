package instance.Quiz;

public class Quiz3 {

	public static void main(String[] args) {

		Book book = new Book();
		
		book.name = "자바프로그래밍";
		book.price = 20000;
		book.publisher = "한빛컴퍼니";
		book.pages = 300;
		book.showBookInfo();
		System.out.println("메모리 주소는" + book);
		System.out.println();


		Book book2 = new Book();
		book2.name = "스프링";
		book2.price = 15000;
		book2.publisher = "한빛컴퍼니";
		book2.pages = 500;
		book2.showBookInfo();		
		System.out.println("메모리 주소는" + book2);
		
	}

}

class Book {
	String name;
	int price;
	String publisher;
	int pages;
	
	public void showBookInfo() {
		System.out.println("이름은 : " + name);		
		System.out.println("가격은 : " + price);		
		System.out.println("출판사는 : " + publisher);		
		System.out.println("페이지 수  :" + pages);		
	}
}



	
