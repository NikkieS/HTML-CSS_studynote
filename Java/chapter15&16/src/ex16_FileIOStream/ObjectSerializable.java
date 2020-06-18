package ex16_FileIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// 기본 스트림 : 객체 저장
		FileOutputStream fo = new FileOutputStream("Object.ser");
		// 필터 스트림 : 객체 저장
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		oo.writeObject(new Circle(1, 2, 1.2));
		oo.writeObject(new Circle(3, 6, 3.6));
		oo.writeObject(new String("String implements Serializable"));
		oo.close();
		
		System.out.println("인스턴스의 데이터가 저장되었습니다.");
		
		// 기본 스트림 : 객체 읽기
		FileInputStream fi = new FileInputStream("Object.ser");
		// 필터 스트림 : 객체 읽기
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		// 저장된 순서대로 반환
		Circle cl1 = (Circle)oi.readObject();
		Circle cl2 = (Circle)oi.readObject();
		String str = (String)oi.readObject();
		oi.close();
		
		cl1.showCircleInfo();
		cl2.showCircleInfo();
		System.out.println(str);
	}

}
