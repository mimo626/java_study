package day10.fileio;

import java.io.File;
import java.util.Scanner;

public class CountLab {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("/Users/kangminju/Documents/itcenedu/java/iotest/yesterday.txt"));
			int count = 0;
			
			while(sc.hasNext()) {
				boolean isExists = sc.next().contains("yesterday");
				if(isExists) count++;
			}
			System.out.println("yesterday 라는 단어는 " + count +"개 있습니다.");
			sc.close();
		} catch(Exception e) {
			System.out.println("오류: " + e.getMessage());
		}

	}

}
