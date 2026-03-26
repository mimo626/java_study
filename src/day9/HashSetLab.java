package day9;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLab {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		// while문 첩으로 안되면 될 때까지로 구현했으나 HashSet은 자체적으로 중복 미허용이기에 그런 조건 없어도 
//		while(set.size() < 10) {
//			int num = (int)(Math.random()*21) + 10;
//			while(!set.add(num)) {
//				 num = (int)(Math.random()*21) + 10;
//			}
//		}
		while(set.size() < 10) {
		    int num = (int)(Math.random() * 21) + 10;
		    set.add(num); 
		}
		
		Iterator<Integer> iterator = set.iterator();
		
		System.out.print("오늘의 로또 번호 : ");
		while(iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.print((iterator.hasNext()) ?( i + ", ") : i);
		}
	}

}
