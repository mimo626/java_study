package day3;

public class ArrayLab3 {

	public static void main(String[] args) {
		char[] chaArr = {'J', 'a', 'v', 'a'};
		for(char c : chaArr) {
			c = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : (char)(c-32);
			System.out.println(c);
		}

	}

}
