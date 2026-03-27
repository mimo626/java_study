package day10.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLab {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("/Users/kangminju/eclipse-workspace/javaedu/src/day10/sample.txt");
				FileWriter writer = new FileWriter("/Users/kangminju/eclipse-workspace/javaedu/src/day10/sample_new.txt", true);
				PrintWriter out = new PrintWriter(writer);
				BufferedReader br = new BufferedReader(reader) 
					) {
				while (true) {
					String data = br.readLine();
					if (data == null)
						break;
					out.printf(data);
				}
				System.out.println("저장이 완료되었습니다.");

			} catch (FileNotFoundException fnfe) {
				System.out.println("sample.txt 파일을 찾을 수 없습니다.");
			} catch (IOException ioe) {
				System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
			}

	}

}
