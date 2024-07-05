package reference.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		Book bookName1  = new Book("자바프로그래밍", 30000, "한빛미디어", 300);
		Book bookName2  = new Book("스프링", 25000, "한빛아카데미", 700);
		Book bookName3  = new Book("HTML", 28000, "길벗", 500);
		
		Member member = new Member(10, "둘리", bookName1, bookName2, bookName3);
		
	}

}

class Book {
	String bookName;
	int price;
	String publisher;
	int pages;
	
	
	public Book(String bookName, int price, String publisher, int pages) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.publisher = publisher;
		this.pages = pages;
	}
}


class Member {
		int no;
		String memberName;
		Book bookName1;
		Book bookName2;
		Book bookName3;
		
		public Member(int no, String memberName, Book bookName1, Book bookName2, Book bookName3) {
			super();
			this.no = no;
			this.memberName = memberName;
			this.bookName1 = bookName1;
			this.bookName2 = bookName2;
			this.bookName3 = bookName3;
		}
}