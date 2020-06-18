package ex16_FileIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayCopy {
	public static void main (String[] args){
		
		InputStream in=null;
		OutputStream out=null;
		
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];
		
		try {
			// 원본 파일의 데이터를 프로그램안으로 가져와야한다.
			// -> InputStream 인스턴스 생성
			in = new FileInputStream("git.exe");
			
			// 새로운 파일을 생성 
			// -> OutputStream 인스턴스 생성
			out = new FileOutputStream("git-copy.exe");
	
			while(true) {
				// buf의 size를 반환하여 준다
				readLen = in.read(buf);
				if(readLen ==-1) {
					break;
				}
				// object, start, length
				out.write(buf, 0, readLen);
				copyByte += readLen;
			}
		} catch(FileNotFoundException e1) {
				e1.printStackTrace();
		} catch(IOException e2) {
			e2.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch(IOException e3) {
				e3.printStackTrace();
			}
		}
		System.out.println("복사된 바이트 크기: "+copyByte);
	}
}
