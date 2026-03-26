package day9;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLab {
	public static void main(String[] args) {	
		HashMap<String, Integer> countryMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(countryMap.size() < 5) {
			System.out.print("나라이름을 입력하세요 : ");
			String country = sc.next();
			System.out.print("인구 수를 입력하세요 : ");
			int personCount = sc.nextInt();
			
//			if(!countryMap.containsKey(country)) {
//				countryMap.put(country, personCount);
//				System.out.println("*저장되었습니다.*");
//			}else {
//				System.out.println("*나라명 " + country +"는 이미 저장되었습니다.*");
//			}
			if(countryMap.containsKey(country)) {
				System.out.println("*나라명 " + country +"는 이미 저장되었습니다.*");
				continue; // 밑에 코드를 실행하면 안되니까 애매해서 부정연산으로 위에처럼 했는데 continue 쓰면 해결!
			}
			countryMap.put(country, personCount);
			System.out.println("*저장되었습니다.*");
		}
		
		sc.close(); //JVM이 해주긴 하지만 직접 해주면 더 좋음
		
		int count = 0;
		int size = countryMap.size();
		
		System.out.print("5개가 모두 입력되었습니다. \n입력된 데이터 : ");
		
		for (String key : countryMap.keySet()) {
		    Integer value = countryMap.get(key);
		    System.out.print((++count < size) ? key + "(" + value + "), " : key + "(" + value + ")");
		}
	}
}
