package day7;

class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	
	public String getInfo() {
		return name;
	}
}

public class Friend extends Person {
	private String phoneNum;
	private String email;
	
	public Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		// 부모 클래스의 private 필드는 직접 접근할 수 없으므로 getter 사용
		// String.format으로 형식 지정
		return super.getInfo() + "	   " + phoneNum + "	   " + email;
	}
	
}