package hiding.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		Book book = new Book();
		book.setName("자바프로그래밍");
		book.setPrice(20000);
		book.setPublisher("한빛 컴퍼니");
		book.setPages(300);
		
		System.out.println("제목 : " + book.getName());
		System.out.println("가격 : " + book.getPrice());
		System.out.println("출판사 : " + book.getPublisher());
		System.out.println("페이지 수 : " + book.getPages());
		
		System.out.println();
		
		Book book2 = new Book();
		book2.setName("스프링");
		book2.setPrice(15000);
		book2.setPublisher("한빛 컴퍼니");
		book2.setPages(500);

		System.out.println("제목 : " + book2.getName());
		System.out.println("가격 : " + book2.getPrice());
		System.out.println("출판사 : " + book2.getPublisher());
		System.out.println("페이지 수 : " + book2.getPages());
		
	}

}

class Book {
	private String name;
	private int price;
	private String publisher;
	private int pages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
}