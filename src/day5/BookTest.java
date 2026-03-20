package day5;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		title = "자바의 정석";
		author = "남궁성";
		price = 40000;
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return title + " " + author + " " + price;
	}
}
public class BookTest {

	public static void main(String[] args) {
		Book javaBook = new Book();
		Book pythonBook = new Book("파이썬의 정석", "강민주", 40000);
		Book cBook = new Book("C언어의 정석", "김미나", 20000);
		Book dbBook = new Book("DB의 정석", "강제니", 10000);
		Book reactBook = new Book("React의 정석", "김형식", 30000);
		
		System.out.println(javaBook.getBookInfo());
		System.out.println(pythonBook.getBookInfo());
		System.out.println(cBook.getBookInfo());
		System.out.println(dbBook.getBookInfo());
		System.out.println(reactBook.getBookInfo());
		

	}

}
