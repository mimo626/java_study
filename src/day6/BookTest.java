package day6;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
//		title = "자바의 정석";
//		author = "남궁성";
//		price = 40000;
		this("자바의 정석", "남궁성", 36000);
		System.out.println("1");
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		System.out.println("2");

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
		
//		System.out.println(javaBook.getBookInfo());
//		System.out.println(pythonBook.getBookInfo());
//		System.out.println(cBook.getBookInfo());
//		System.out.println(dbBook.getBookInfo());
//		System.out.println(reactBook.getBookInfo());
		
		// 배열을 생성해 출력문을 반복문으로 구현 
		Book[] bookArr = new Book[5]; 
		
		bookArr[0] = javaBook;
		bookArr[1] = pythonBook;
		bookArr[2] = cBook;
		bookArr[3] = dbBook;
		bookArr[4] = reactBook;
		
		for(Book book: bookArr) {
			System.out.println(book.getBookInfo());
		}

	}

}
