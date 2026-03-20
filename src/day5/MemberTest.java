package day5;

class Member{
	String name;
	String account;
	String passwd;
	int birthyear;
}

public class MemberTest {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.name = "강민주";
		member1.account = "minju@naver.com";
		member1.passwd = "1234";
		member1.birthyear = 2002;
		
		
		Member member2 = new Member();
		member2.name = "김용석";
		member2.account = "kys@naver.com";
		member2.passwd = "2345";
		member2.birthyear = 2003;
		
		Member member3 = new Member();
		member3.name = "강민경";
		member3.account = "kmk@naver.com";
		member3.passwd = "3456";
		member3.birthyear = 2000;
		
		System.out.printf("회원1 : %s(%s, %s, %d)\n", member1.name, member1.account, member1.passwd, member1.birthyear);
		System.out.printf("회원2 : %s(%s, %s, %d)\n", member2.name, member2.account, member2.passwd, member2.birthyear);
		System.out.printf("회원3 : %s(%s, %s, %d)\n", member3.name, member3.account, member3.passwd, member3.birthyear);
	
	}

}
