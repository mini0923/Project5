package constructor.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.name = "자바 프로그래밍";
		book1.price = 10000;
		book1.publisher = "금빛출판사";
		book1.pages = 300;

		Book book2 = new Book("스프링부트", 30000, "한빛출판사", 200);

	}
}

class Book {
	String name;
	int price;
	String publisher;
	int pages;

	public Book() {
		super();
	}

	public Book(String name, int price, String publisher, int pages) {
		super();
		this.name = name;
		this.price = price;
		this.publisher = publisher;
		this.pages = pages;
	}

}
