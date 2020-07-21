package lms.service;

import java.sql.Date;
import java.sql.Timestamp;

public class test {

	public static void main(String[] args) {
		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		System.out.println(stamp);
		//System.out.println(Date.valueOf(stamp));
		Date date = new Date(stamp.getTime());
		//date.valueOf(stamp);
		System.out.println(date);

	}

}
