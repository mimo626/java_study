package day10;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class URLTest1 {
	public static void main(String[] args) {
		try {
			URL rep = new URI("https://www.etnews.com/").toURL();
			// InputStream을 반환 -> 바이트 스트림으로 읽어서 한글을 문자형으로 형변환해도 깨짐
			// 바이트 스트림이 아닌 문자 스트림으로 바꿔서 읽어야 함 
			// 영어, 이미지 URL은 바이트스트림도 잘 나옴 
//			InputStream is = rep.openStream(); 
//			int data;
//			while(true) {
//				data = is.read(); 한 문자씩 읽음 
//				if(data == -1) break;
//				System.out.print((char)data); //문자형 변환해도 한글 깨짐(한글은 3바이트라서)
//			}
			// InputStreamReader로 바이트 -> 문자 스트림으로 변환 
			InputStream is = rep.openStream(); 
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String data;
			while(true) {
				data = br.readLine(); // 한 줄씩 읽음 
				if(data == null) break;
				System.out.println(data);
			}
		} catch(Exception e) {
			System.out.println("오류: " + e.getMessage());
		}
	}
}
