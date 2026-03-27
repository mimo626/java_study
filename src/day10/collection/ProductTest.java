package day10.collection;

import java.util.HashSet;
import java.util.Iterator;

public class ProductTest {

	public static void main(String[] args) {
		Product tv = new Product("p100", "TV", 20000);
		Product computer = new Product("p200", "Computer", 10000);
		Product mp3 = new Product("p100", "MP3", 700);
		Product audio = new Product("p300", "Audio", 1000);
		
		Product[] products = {tv, computer, mp3, audio};
		HashSet<Product> set = new HashSet<>();
		
		for(Product p : products) {
			System.out.println((set.add(p) ? "성공적으로 저장되었습니다." : 
				"동일한 ID 의 제품이 이미 저장되어 있습니다."));
		}
		
		System.out.printf("\n%-10s %-20s %s\n", "제품 ID", "제품명", "가격");
		System.out.println("---------------------------------------------------------");

		Iterator<Product> iterator = set.iterator();

		while(iterator.hasNext()) {
		    Product p = iterator.next();
		    
		    System.out.printf("%s\t%-10s\t%,d원\n", 
		                      p.getProductID(), 
		                      p.getProductName(), 
		                      p.getProductPrice());
		}
		
	}

}
