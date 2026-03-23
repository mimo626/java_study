package day6;

class AcademyFriend {
	static String academicName = "KOSA";
	private String name;
	private String color;
	private String hobby;
	private String food;
	
	AcademyFriend(String name, String color, String hobby, String food){
		this.name = name;
		this.color = color;
		this.hobby = hobby;
		this.food = food;
	}
	
	String getName() {
		return name;
	}
	
	String getColor() {
		return color;
	}
	
	String getHobby() {
		return hobby;
	}
	
	String getFood() {
		return food;
	}
}

public class AFTest {
	public static void main(String args[]){	
		AcademyFriend donggue = new AcademyFriend("이동규", "black", "보드게임", "치킨");
		AcademyFriend younggwan = new AcademyFriend("김영관", "navy", "독서", "김치전");
		AcademyFriend minju = new AcademyFriend("강민주", "white", "게임", "마라탕");
		
		AcademyFriend[] friends = {donggue, younggwan, minju};
		
		for(AcademyFriend f : friends) {
			System.out.printf("%s 동료는 좋아하는 칼라가 %s이며 취미는 %s입니다. 그리고 제일 좋아하는 음식은 %s"
					+ "입니다. 지금은 %s에서 Java 기반 풀스태과 Python 기반 AI를 학습하고 있어요.\n"
					, f.getName(), f.getColor(), f.getHobby(), f.getFood(), AcademyFriend.academicName );
		}
	}
}
