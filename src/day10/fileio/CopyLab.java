package day10.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyLab {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("/Users/kangminju/eclipse-workspace/javaedu/src/day10/sample.txt");
				// 여기서 true를 줘야 이전 내용 그대로 두고 뒤에 추가하는 append 모드로 전환 
				FileWriter writer = new FileWriter("/Users/kangminju/eclipse-workspace/javaedu/src/day10/sample_new.txt", true);
				// PrintWriter out = new PrintWriter(writer);
				BufferedReader br = new BufferedReader(reader) 
					) {
				while (true) {
					String data = br.readLine();
					if (data == null)
						break;
					// out.printf(data);
					writer.write(data + "\n");
				}
			} catch (FileNotFoundException e) {
				System.out.println("sample.txt 파일을 찾을 수 없습니다.");
				e.printStackTrace();
				return;
				
			} catch (IOException ioe) {
				System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
				return;
			}
			System.out.println("저장이 완료되었습니다.");
	}

}
