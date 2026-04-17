package day6;

public class Book{
	String title;
	String author;
	int price;
	
	public Book(){
		this("자바의 정석", "남궁성", 36000);
	}
	
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;

	}
	
	public String getBookInfo() {
		return title + " " + author + " " + price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}