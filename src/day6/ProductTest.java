package day6;

class Product{
	String name;
	int balance;
	int price;
	
	Product() {
		name = "듀크인형";
		balance = 5;
		price = 10000;
	}
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getBalance() {
		return balance;
	}
	
	int getPrice() {
		return price;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product[] products = new Product[5];
		Product p1 = new Product("짱구인형", 4, 20000);
		Product p2 = new Product("미니언인형", 4, 20000);
		Product p3 = new Product("강아지인형", 4, 20000);
		Product p4 = new Product("고양이인형", 4, 20000);
		Product p5 = new Product("수달인형", 4, 20000);
		
		products[0] = p1;
		products[1] = p2;
		products[2] = p3;
		products[3] = p4;
		products[4] = p5;
		
		for(int i = 0; i<products.length; i++) {
			Product p = products[i];
			// 변수가 아닌 메서드로 값을 가져
//			System.out.printf("(%s %d  %,d원)\n", p.name, p.balance, p.price);
			System.out.printf("(%s %d  %,d원)\n", p.getName(), p.getBalance(), p.getPrice());
		}
		

	}

}
