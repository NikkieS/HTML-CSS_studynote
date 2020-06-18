package ex16_FileIOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("news.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("오늘의 검색어 키워드");
		bw.newLine();
		bw.write("어버이날");
		bw.newLine();
		bw.write("이태원 확진자");
		bw.newLine();
		bw.write("갑수목장");
		bw.newLine();
		bw.close();
	}

}
