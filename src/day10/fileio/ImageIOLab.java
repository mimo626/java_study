package day10.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class ImageIOLab {

	public static void main(String[] args) {
		try {			
			Scanner sc = new Scanner(new File("/Users/kangminju/Documents/itcenedu/java/iotest/list.txt"));
			while(sc.hasNext()) {
				String[] arr = sc.nextLine().split(",");
				String imgName = arr[0];
				String imgUrl = arr[1];
				URL rep = new URI(imgUrl).toURL();
				InputStream is = rep.openStream(); 
				FileOutputStream fos = new FileOutputStream(
						"/Users/kangminju/Documents/itcenedu/java/iotest/myImage/" 
								+ imgName + ".jpg");
				
				int data;
				while(true) {
					data = is.read();  
					if(data == -1) 
						break;
					fos.write(data);
				}
				System.out.println("파일에 저장 완료 ~~");
				fos.close();
			}
			sc.close();
		} catch(Exception e) {
			System.out.println("오류: " + e.getMessage());
		}
	}

}
