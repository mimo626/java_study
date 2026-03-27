package day10;

public class HashCodeExample {

	public static void main(String[] args) {
		Name obj1 = new Name("길동", "고");
        Name obj2 = new Name("길동", "고");
        int hash1 = obj1.hashCode(); // Object의 hashCode 그대로 씀 
        // Name에서 hashCode 오버라이딩하니 모두 true
        int hash2 = obj2.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);
        
        String obj3 = new String("길동고");
        String obj4 = new String("길동고");                                     
        int hash3 = obj3.hashCode(); // Str에ing 맞게 오버라이딩된 상태 
        int hash4 = obj4.hashCode();
        System.out.println(hash3);
        System.out.println(hash4);
        
        Integer obj5 = Integer.valueOf(100); // Integer객체 생
        Integer obj6 = Integer.valueOf(100);
        int hash5 = obj5.hashCode(); //Integer에 맞게 오버라이딩된 상태 
        int hash6 = obj6.hashCode();
        System.out.println(hash5);
        System.out.println(hash6);       
	}
}
