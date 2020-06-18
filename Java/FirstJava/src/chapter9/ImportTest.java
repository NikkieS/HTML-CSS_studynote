package chapter9;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ImportTest {
	public static void main(String[] args) {
		
		// java. util.Date
		// 날짜와 시간 정보를 하나로 표현
		// java.text.SimpleDateFormat
		
		Date today = new Date();
		
		System.out.println(today);	//today.toString()
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");	//M:월, m:분
		SimpleDateFormat time = new SimpleDateFormat("HH:mm");	//H:24시간 기준, h:12시간 기준
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
	}

}
