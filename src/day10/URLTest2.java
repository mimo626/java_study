package day10;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) {
		try {
			
			URL rep = new URI("https://i.redd.it/what-exactly-is-duke-the-java-mascot-supposed-to-be-at-a-v0-n8g6539fmroc1.jpg?width=770&format=pjpg&auto=webp&s=50597ab5e31b01f491e3af21913df63177cd85d9").toURL();
			// 이미지 URL이므로 바이트 스트림으로 구현 가능 
			InputStream is = rep.openStream(); 
			// 이미지를 파일로 읽어 옴 
			// 프로젝트 파일에 생성 -> javaedu에 
			FileOutputStream fos = new FileOutputStream("test.jpg");
			int data;
			while(true) {
				data = is.read();  
				if(data == -1) 
					break;
				fos.write(data);
			}
			System.out.println("파일에 저장 완료 ~~");
			fos.close();
		} catch(Exception e) {
			System.out.println("오류: " + e.getMessage());
		}
	}

}
