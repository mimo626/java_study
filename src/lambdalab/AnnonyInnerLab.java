package lambdalab;

import java.util.ArrayList;

import day6.Book;


public class AnnonyInnerLab {
	public static void main(String[] args) {
		ArrayList<Book> al = new ArrayList<>();
		al.add(new Book());
		al.add(new Book("챗GPT", "반병현", 11700));
		al.add(new Book("스타트 스프링 부트", "남가람", 27000));
		al.add(new Book("Doit! 자바프로그래밍", "박은중", 22500));
		al.add(new Book("이것이 자바다", "신용권,임경균", 36000));

		for (Book el : al) {
			System.out.println(el.getBookInfo());
		}
		
//		al.sort(new Comparator<Book>()  {
//			public int compare(Book b1, Book b2) {
//				return b1.getPrice() - b2.getPrice();
//			}
//			
//		});

		al.sort((b1, b2) -> b1.getPrice()-b2.getPrice());
		
		System.out.println("[소팅 후 ]");
		for (Book el : al) {
			System.out.println(el.getBookInfo());
		}
	}
}
