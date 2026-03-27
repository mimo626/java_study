package day10;

import java.util.HashSet;
import java.util.Objects;
class Member2 {
	private int id;
	private String name;
	private String password;

	Member2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member2 other = (Member2) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, password);
	}

}
public class ObjectTest2 {
	public static void main(String args[]) {
		Member2 obj1 = new Member2(10, "자바", "duke");
		Member2 obj2 = new Member2(10, "자바", "duke");
		Member2 obj3 = new Member2(20, "자바", "duke");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(null));
		System.out.println(obj1.equals(new java.util.Date()));
		System.out.println(obj1.equals(obj3));
		HashSet<Member2> set = new HashSet<>();
		System.out.println(set.add(obj1));
		// false여야 하지만 true -> 이유: equals만 오버라이딩하고 hashCode는 하지 않아
		System.out.println(set.add(obj2)); 
		System.out.println(set.add(obj3));
	}
}





