package day9;

import java.util.Iterator;
import java.util.LinkedList;

import day7.Friend;

public class LinkedListLab {

	public static void main(String[] args) {
		LinkedList<Friend> friends = new LinkedList<Friend>();
		friends.add(new Friend("강민주", "01012342345", "djd@naver.com"));
		friends.add(new Friend("홍길동", "01035354542", "wmemw@naver.com"));
		friends.add(new Friend("길동이", "01059969695", "eroqj@naver.com"));
		friends.add(new Friend("동동이", "01074728294", "dkhfa@naver.com"));
		friends.add(new Friend("홍홍이", "01045940022", "piphln@naver.com"));

		Iterator<Friend> iterator = friends.iterator();

		System.out.println("이름               전화번호                  메일주소\n"
				+ "--------------------------------------------------");
		while(iterator.hasNext()) {
			Friend f = iterator.next();
			System.out.println(f.getInfo());
		}
	}

}
