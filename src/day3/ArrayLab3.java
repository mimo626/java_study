package day3;

public class ArrayLab3 {

	public static void main(String[] args) {
		char[] chaArr = {'J', 'a', 'v', 'a'};
		
		for(int i = 0; i < chaArr.length; i++ ) {
			chaArr[i] = (chaArr[i] >= 'A' && chaArr[i] <= 'Z') ? (char)(chaArr[i] + 32) : (char)(chaArr[i]-32);
			System.out.println(chaArr[i]);
		}
		
		// 복사한 값만 변화해서 실제 배열 값은 바뀌지 않
//		for(char c : chaArr) {
//			c = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : (char)(c-32);
//			System.out.println(c);
//		}

		// 복합 대입 연산자를 써서 자동 형변환 
//		for(int i = 0; i < chaArr.length; i++) {
//			if(chaArr[i] <= 96) {
//				chaArr[i] += 32;
//			} else {
//				chaArr[i] -= 32;
//			}
//		}

	}

}
