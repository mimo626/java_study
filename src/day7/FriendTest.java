package day7;

public class FriendTest {

	public static void main(String[] args) {
		Friend[] friends = new Friend[5];
		friends[0] = new Friend("강민주", "01012342345", "djd@naver.com");
		friends[1] = new Friend("홍길동", "01035354542", "wmemw@naver.com");
		friends[2] = new Friend("길동이", "01059969695", "eroqj@naver.com");
		friends[3] = new Friend("동동이", "01074728294", "dkhfa@naver.com");
		friends[4] = new Friend("홍홍이", "01045940022", "piphln@naver.com");

		System.out.println("이름               전화번호                  메일주소\n"
				+ "--------------------------------------------------");
		for(Friend f : friends) {
			System.out.println(f.getInfo());
		}
	}

}
