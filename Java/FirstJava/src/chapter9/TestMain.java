package chapter9;

public class TestMain {

	public static void main(String[] args) {
		Singleton s= Singleton.getInstance();
		s.print();
		
		String[][] arr = new String[100][3];
		System.out.println(arr[0][0]);

	}

}
